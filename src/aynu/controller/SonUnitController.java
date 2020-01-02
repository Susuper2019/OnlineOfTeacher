package aynu.controller;

import aynu.bean.Course;
import aynu.bean.Sonunit;
import aynu.bean.Teacher;
import aynu.bean.Unit;
import aynu.service.CourseService;
import aynu.service.SonUnitService;
import aynu.service.TeacherService;
import aynu.service.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @Author susuper
 * @Date 2019/12/29 11:54
 * @description:
 */
@Controller
@RequestMapping(value = "SonUnitController")
public class SonUnitController {
    @Autowired
    public SonUnitService sonUnitService;
    @Autowired
    public UnitService unitService;
    @Autowired
    TeacherService teacherService;
    @Autowired
    CourseService courseService;

    @RequestMapping(value = "/showSonUnitAll")
    String ShowSonUnitAll(Model model, @RequestParam("id") String uid,@RequestParam("cid") String cid,@RequestParam("tid") String tid){
        System.out.println("开始查询UID+"+uid);
        System.out.println("cid+"+cid);
        System.out.println("tid+"+tid);
        Teacher teacher = new Teacher();
        Course course = new Course();
        Unit unit = new Unit();
        //可以提供他的uid
        List<Sonunit> sonunits = sonUnitService.findAll(Integer.parseInt(uid));
        //根据提供的uid查询到所有
        //如果uid没有数据处理
        //根据uid 查到老师的名字  课程的名字
        if (sonunits.size()!=0){
            Sonunit sonunit = sonunits.get(0);
            unit = unitService.selectUnitByUid(Integer.parseInt(uid));

            course = courseService.findCourseByCid(Integer.parseInt(cid));
            teacher =teacherService.selectTeaByTid(Integer.parseInt(tid));

//            unit = unitService.selectUnitByUid(sonunit.getUid());
//
//            course = courseService.findCourseByCid(sonunit.getCid());
//            teacher =teacherService.selectTeaByTid(sonunit.getTid());
        }

        model.addAttribute("sonunits",sonunits);
        model.addAttribute("teacher",teacher);
        model.addAttribute("course",course);
        model.addAttribute("unit",unit);
//        System.out.println(teacher+"\n"+course+"\n"+sonunits+"\n"+unit);
        return "sonUnitInsert";

    }

    @RequestMapping(value = "/insertSonUnit")
    String insertSonUnit(Sonunit sonunit,Model model){
        System.out.println("在这里吗？");
        System.out.println(sonunit);

        sonUnitService.insertSonUnit(sonunit);
       //防止插入后查找错误
//        return "forward:showUnitAll?id="+unit.getCid();
        System.out.println(sonunit.getUid());
        Integer uid = sonunit.getUid();
        Integer cid = sonunit.getCid();
        Integer tid = sonunit.getTid();
        System.out.println("开始查询UID+"+uid);
        System.out.println("cid+"+cid);
        System.out.println("tid+"+tid);
        System.out.println("进入下一次查询");
        return "redirect:showSonUnitAll?id="+uid+"&cid="+cid+"&tid="+tid;
    }
}
