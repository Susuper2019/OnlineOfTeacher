package aynu.dao;

import aynu.bean.Course;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author susuper
 * @Date 2019/12/28 16:42
 * @description:
 */
public interface CourseDao {
    @Select("select * from course")
    public List<Course> findAll();

    @Insert("insert into course(tid,cname,ctype,semester,starttime,endtime,stunum,subtype,courdesc,earlystudy,statue,aid) " +
            "values (#{tid},#{cname},#{ctype},#{semester},#{starttime},#{endtime},#{stunum},#{subtype},#{courdesc},#{earlystudy},#{statue},#{aid})")
    public Integer insertCourse(Course course);


    @Update("update course set tid=#{tid},cname=#{cname},ctype=#{ctype},semester=#{semester},starttime=#{starttime},endtime=#{endtime},stunum=#{stunum}," +
            "courdesc=#{courdesc},earlystudy=#{earlystudy},statue=#{statue} where aid=#{aid}")
    public boolean updateCourse(Course course);

    @Select("select * from course where cid=#{cid}")
    public Course findCourseByCid(Integer cid);
}
