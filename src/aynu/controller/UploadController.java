package aynu.controller;

import aynu.bean.Fileup;
import aynu.service.FileupService;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @Author susuper
 * @Date 2019/12/29 17:17
 * @description:
 */
@Controller
@RequestMapping("UploadController")
public class UploadController {
    //servletContext上下文对象，可以直接注入
//    @Autowired
//    private ServletContext servletContext;
    @Autowired
    FileupService fileupService;

    @RequestMapping(value = "/save")
    public String save(HttpServletRequest request, HttpServletResponse response,MultipartFile multipartFile) throws IOException {
        String uid = request.getParameter("uid");
        System.out.println(uid+"//uid");
        //随机文件名
        String fileName = UUID.randomUUID().toString().replace( "-", "" );
//        String path = request.getServletContext().getRealPath( "/img/" ); //C://xx/img
        String path = request.getServletContext().getRealPath( "img/");
        //后缀名 jpg
        String extension = FilenameUtils.getExtension( multipartFile.getOriginalFilename() );
        System.out.println("文件后缀是："+extension);
        // C://xx/img/aa.jpg  linux:/url/tomcat/webapp/AAA/13cd.png
        File file = new File( path + fileName + "." + extension );
        String filePath = path+fileName+ "." + extension;
        System.out.println(filePath);
        //保存文件
        multipartFile.transferTo( file );
        //将文件URL 地址返回

        Fileup fileup = new Fileup();
        fileup.setUfile(filePath);
        fileup.setUid(Integer.parseInt(uid));
        System.out.println(fileup);
        fileupService.insertFileUp(fileup);


        return "redirect:/UnitpapertestController/ShowUnitPaper?uid="+uid;

    }




    @RequestMapping("/downloadFile")
    public ResponseEntity<byte[]> downloadFile(HttpServletRequest request, HttpServletResponse response) throws IOException{
        System.out.println("开始调用");
        String uid = request.getParameter("uid");

        List<Fileup> fileups = fileupService.fileup(Integer.parseInt(uid));


        Fileup fileup = fileups.get(0);
        HttpHeaders httpHeaders = new HttpHeaders() ;
        String fileStr = fileup.getUfile();
        int index = fileStr.lastIndexOf("\\");
        int pointindex =fileStr.indexOf(".");
        File file = new File(fileStr);  //获取文件名称

        System.out.println("filePaht:"+fileStr.substring(0,index));

        String fileName = fileStr.substring(index+1);
        System.out.println("fileName:"+fileStr.substring(index+1));
        httpHeaders.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        httpHeaders.setContentDispositionFormData("attachment", fileName);


        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file), httpHeaders, HttpStatus.CREATED);
    }
}
