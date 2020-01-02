package aynu.controller;

import aynu.bean.Applycourse;
import aynu.bean.Course;
import aynu.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author susuper
 * @Date 2019/12/28 16:58
 * @description:
 */
@Controller
@RequestMapping(value = "CourseController")
public class CourseController {
    @Autowired
    CourseService courseService;
    @RequestMapping(value = "/showCourseAll")
    String ShowCourseAll(Model model){
        List<Course> courses;
        courses = courseService.findAll();
        model.addAttribute("courses",courses);
        return "course";

    }


}
