package aynu.controller;

import aynu.bean.Course;
import aynu.bean.Teacher;
import aynu.bean.Unit;
import aynu.service.CourseService;
import aynu.service.TeacherService;
import aynu.service.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @Author susuper
 * @Date 2019/12/29 10:51
 * @description:
 */
@Controller
@RequestMapping(value = "UnitController")
public class UnitController {
    @Autowired
    public UnitService unitService;
    @Autowired
    TeacherService teacherService;
    @Autowired
    CourseService courseService;

    @RequestMapping(value = "/showUnitAll")
//    @RequestParam("userid") String user
    String ShowUnitAll(Model model, @RequestParam("id") String cid){
        List<Unit> unitList;
        unitList = unitService.findAll(Integer.parseInt(cid));
        Course course = courseService.findCourseByCid(Integer.parseInt(cid));
        Teacher teacher = teacherService.selectTeaByTid(course.getTid());

        model.addAttribute("unitList",unitList);
        model.addAttribute("teacher",teacher);
        model.addAttribute("course",course);
        System.out.println(teacher+"\n"+course+"\n"+unitList);
        return "unitInsert";

    }

    @RequestMapping(value = "/insertUnit")
    String insertUnit(Unit unit,Model model){
        System.out.println(unit);
//        unit.setTid();
            unitService.insertUnit(unit);
        return "forward:showUnitAll?id="+unit.getCid();
    }
}
