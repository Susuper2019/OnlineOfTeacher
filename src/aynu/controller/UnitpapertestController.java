package aynu.controller;

import aynu.bean.Unitpapertest;
import aynu.service.UnitpapertestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @Author susuper
 * @Date 2019/12/29 16:47
 * @description:
 */
@Controller
@RequestMapping("UnitpapertestController")
public class UnitpapertestController {
    @Autowired
    public UnitpapertestService unitpapertestService;

    @RequestMapping(value = "/ShowUnitPaper")
    String ShowUnitPaper(Model model, @RequestParam("uid") String uid){
        System.out.println("uid");
        List<Unitpapertest> unitpapertests = unitpapertestService.findAll(Integer.parseInt(uid));
        System.out.println(unitpapertests);

        model.addAttribute("unitpapertests",unitpapertests);
        return "UnittestPaper";
    }

    @RequestMapping(value = "/insertUnitPaper")
    String insertUnitPaper(Unitpapertest unitpapertest,Model model){
        unitpapertest.setCname("test");
        System.out.println(unitpapertest);
//        unit.setTid();
//        unitpapertest.setCname(unitpapertest.(papertest.getCid()).getCname() );
        unitpapertestService.insertPaper(unitpapertest);

        return "redirect:ShowUnitPaper?uid="+unitpapertest.getUid();
    }
}
