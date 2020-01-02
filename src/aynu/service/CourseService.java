package aynu.service;

import aynu.bean.Applycourse;
import aynu.bean.Course;

import java.util.List;

/**
 * @Author susuper
 * @Date 2019/12/28 16:45
 * @description:
 */
public interface CourseService {
    public List<Course> findAll();
    public Integer insertCourse(Applycourse applycourse);
    public boolean updateCourse(Course course);
    public Course findCourseByCid(Integer cid);
}
