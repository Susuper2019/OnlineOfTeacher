package aynu.service;

import aynu.bean.Applycourse;
import aynu.bean.Course;
import aynu.dao.ApplycourseDao;
import aynu.dao.CourseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author susuper
 * @Date 2019/12/28 16:46
 * @description:
 */
@Service("CourseServiceImpl")
public class CourseServiceImpl implements CourseService {
    @Autowired
    CourseDao courseDao;
    @Autowired
    ApplycourseDao applycourseDao;

    @Override
    public List<Course> findAll() {
        return courseDao.findAll();
    }

    @Override
    public Integer insertCourse(Applycourse applycourse) {
        Course course = new Course();
        course.setCname(applycourse.getAcname());
        course.setCtype(applycourse.getActype());
       // course.setSemester("上学期");  //设置学期
        course.setStunum(applycourse.getTeachernum());
        course.setSubtype(applycourse.getAccategory());
       // course.setCourdesc("只要好好学习");
       // course.setEarlystudy("高等数学");
        course.setStatue(0);
        course.setTid(applycourse.getTid());
        course.setAid(applycourse.getAid());
        System.out.println(course);
        System.out.println("插入了吗++++++++"+courseDao.insertCourse(course));
        return 1;
    }

    @Override
    public boolean updateCourse(Course course) {
        courseDao.updateCourse(course);
        return false;
    }

    @Override
    public Course findCourseByCid(Integer cid) {
        return courseDao.findCourseByCid(cid);
    }
}
