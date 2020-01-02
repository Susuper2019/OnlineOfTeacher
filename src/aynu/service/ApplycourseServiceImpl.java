package aynu.service;

import aynu.bean.Applycourse;
import aynu.bean.Teacher;
import aynu.dao.ApplycourseDao;
import aynu.dao.CourseDao;
import aynu.dao.TeacherDao;
import org.apache.ibatis.annotations.Insert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Author susuper
 * @Date 2019/12/28 16:33
 * @description:
 */
@Service("ApplycourseServiceImpl")
public class ApplycourseServiceImpl implements ApplycourseService {
    @Autowired
    ApplycourseDao applycourseDao;
    @Autowired
    TeacherDao teacherDao;
    @Autowired
    CourseService courseService;

    @Override
    public List<Applycourse> findAll() {

        List<Applycourse> applycourses = applycourseDao.findAll();
//        for(Applycourse applycourse:applycourses){
//            Integer tid = applycourse.getTid();
//            Teacher teacher = teacherDao.selectTeaByTid(tid);
//            applycourse.setExtreaTecName(teacher.getTname());
//            applycourse.setExtreaTecUser(teacher.getTuesr());
//        }


        return applycourses;
    }

    @Override
    public Applycourse selectApplycourseByAid(Integer Aid) {
        return applycourseDao.selectApplycourseByAid(Aid);
    }

    @Override
    public boolean insertApplycourse(Applycourse applycourse) {
        Teacher teacher = teacherDao.selectLogin(applycourse.getExtreaTecUser());
        applycourse.setExtreaTecName(teacher.getTname());
        applycourse.setTid(teacher.getTid());

        applycourse.setApplytime(new Date(System.currentTimeMillis()));

//        courseService.insertCourse(applycourse);
//        return applycourseDao.insertApplycourse(applycourse);
        applycourseDao.insertApplycourse(applycourse);
        applycourse.setAid(applycourseDao.findMax());
        courseService.insertCourse(applycourse);
        return true;
    }

    @Override
    public Integer findMax() {
        return applycourseDao.findMax();
    }
}
