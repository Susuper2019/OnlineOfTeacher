package aynu.controller;

import aynu.bean.Papertest;
import aynu.service.CourseService;
import aynu.service.PapertestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @Author susuper
 * @Date 2019/12/29 15:32
 * @description:
 */
@Controller
@RequestMapping("PapertestController")
public class PapertestController {
    @Autowired
    PapertestService papertestService;
    @Autowired
    CourseService courseService;
    @RequestMapping(value = "/showPaper")
    String ShowPaper(Model model, @RequestParam("cid") String cid){
        List<Papertest> papertests = papertestService.findAll(Integer.parseInt(cid));
        System.out.println(papertests);

        model.addAttribute("papertests",papertests);
        return "testPaper";
    }

    @RequestMapping(value = "/printPaper")
    String printPaper(Model model, @RequestParam("cid") String cid){
        List<Papertest> papertests = papertestService.findAll(Integer.parseInt(cid));
        System.out.println(papertests);

        model.addAttribute("papertests",papertests);
        return "PrintPaper";
    }


    @RequestMapping(value = "/insertPaper")
    String insertPaper(Papertest papertest,Model model){
        System.out.println(papertest);
//        unit.setTid();
        papertest.setCname(courseService.findCourseByCid(papertest.getCid()).getCname() );
        papertestService.insertPaper(papertest);

        return "redirect:showPaper?cid="+papertest.getCid();
    }
}
