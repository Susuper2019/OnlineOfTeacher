package aynu.dao;

import aynu.bean.Applycourse;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author susuper
 * @Date 2019/12/28 16:27
 * @description:
 */
public interface ApplycourseDao {
    @Select("select * from applycourse")
    public List<Applycourse> findAll();

    @Select("select * from applycourse where aid=#{Aid}")
    public Applycourse selectApplycourseByAid(Integer Aid);

    @Insert("insert into applycourse(tid,acname,actype,accategory,teachernum,extreaTecName,extreaTecUser,applytime) values (#{tid},#{acname},#{actype},#{accategory},#{teachernum},#{extreaTecName},#{extreaTecUser},#{applytime})")
    public boolean insertApplycourse(Applycourse applycourse);

    @Select("select max(aid) from applycourse")
    public Integer findMax();
}
