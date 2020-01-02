package aynu.controller;

import aynu.bean.Applycourse;
import aynu.bean.Course;
import aynu.service.ApplycourseService;
import aynu.service.CourseService;
import aynu.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @Author susuper
 * @Date 2019/12/28 16:58
 * @description:
 */
@Controller
@RequestMapping(value = "applyController")
public class ApplyController {
    @Autowired
    private ApplycourseService applycourseService;
    @Autowired
    private TeacherService teacherService;

    @Autowired
    CourseService courseService;

    @RequestMapping(value = "/showApplyAll")
    String ShowApplyAll(Model model){
        List<Applycourse> applycourses;
        applycourses = applycourseService.findAll();


        model.addAttribute("applycourses",applycourses);
        return "applycourse";

    }

    @RequestMapping(value = "/insertApplyCourse")
    String insertApplyCourse(Applycourse applycourse,Model model){
        System.out.println(applycourse);
        if (applycourse==null || applycourse.getExtreaTecUser()==null ||teacherService.selectLogin(applycourse.getExtreaTecUser())==null ){
            model.addAttribute("message","教师账号错误");
        }else{
            model.addAttribute("message","添加成功");
            applycourseService.insertApplycourse(applycourse);
        }
        return "forward:showApplyAll";
    }

    //同意添加课程 并且更新其上课时间的页面
    @RequestMapping(value = "/agreeApply")
    String agreeApply(Course course, Model model,@RequestParam("id") Integer id,@RequestParam("st") String st,@RequestParam("et") String et){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date stDate = null;
        Date etDate = null;
        try {
            stDate = simpleDateFormat.parse(st);
            etDate = simpleDateFormat.parse(et);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        course.setStarttime(stDate);
        course.setEndtime(etDate);
        System.out.println(course);
        System.out.println(id);

        Applycourse applycourse = applycourseService.selectApplycourseByAid(id);
        course.setTid(applycourse.getTid());
        course.setCname(applycourse.getAcname());
        course.setCtype(applycourse.getActype());
        course.setStunum(applycourse.getTeachernum());
        course.setAid(id);
        course.setStatue(1);
        System.out.println(course);

        courseService.updateCourse(course);

        //需要更新  传过来的是aid
        //查出来 申请的课程   绑定下tid
//        applycourseService.insertApplycourse()
        return "forward:showApplyAll";
    }

}
