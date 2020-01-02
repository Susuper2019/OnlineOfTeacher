package test;

import aynu.bean.Applycourse;
import aynu.bean.Course;
import aynu.bean.Teacher;
import aynu.dao.ApplycourseDao;
import aynu.service.ApplycourseService;
import aynu.service.CourseService;
import aynu.service.TeacherService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Author susuper
 * @Date 2019/12/28 16:05
 * @description:
 */
public class TeacherTest {
    ApplicationContext ac = null;
    TeacherService teacherService= null;
    ApplycourseService applycourseService = null;
    CourseService courseService = null;
    @Before
    public void run(){
        ac =new ClassPathXmlApplicationContext("application.xml");
        teacherService = (TeacherService) ac.getBean("TeacherServiceImpl");
        applycourseService = (ApplycourseService) ac.getBean("ApplycourseServiceImpl");
        courseService = (CourseService)ac.getBean("CourseServiceImpl");
    }
    @Test
    public void findAll(){
        List<Teacher> teachers = teacherService.findAll();
        for(Teacher teacher:teachers){
            System.out.println(teacher);
        }
    }

    @Test
    public void seleLogin(){
        System.out.println(teacherService.selectLogin("124"));
    }

    //applycours Test
    @Test
    public void findAllApply(){
        List<Applycourse> applycourses = applycourseService.findAll();
        for(Applycourse applycourse:applycourses){
            System.out.println(applycourse);
        }
    }
    @Test
    public void selectApplycourseByAid(){
        System.out.println(applycourseService.selectApplycourseByAid(1));
    }
    @Test
    public void insertApplycourse(){
        Applycourse applycourse = new Applycourse();
        applycourse.setExtreaTecUser("123");
        applycourse.setTeachernum(10);


        applycourseService.insertApplycourse(applycourse);
    }

    @Test
    public void findMax(){
        System.out.println(applycourseService.findMax());
    }

    //CourseServiceImpl test
    @Test
    public void findAllCourseServiceImpl(){
        List<Course> courses = courseService.findAll();
        for(Course course:courses){
            System.out.println(course);
        }
    }

//    @Test
//    public void insertcourse(){
//        Applycourse applycourse = new Applycourse();
//        applycourse.setExtreaTecUser("123");
//        applycourse.setTeachernum(10);
//        applycourse.setExtreaTecUser("123");
//
//        Course course = new Course();
//
//        courseService.insertCourse(applycourse);
//    }

    @Test
    public void updateCourse(){
        Course course = new Course();
        course.setAid(35);
        course.setCourdesc("jintiandetest");
        courseService.updateCourse(course);
    }

    @Test
    public void findCourseByCid(){
        System.out.println(courseService.findCourseByCid(1));
    }
}
