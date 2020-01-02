package aynu.dao;

import aynu.bean.Teacher;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author susuper
 * @Date 2019/12/28 15:50
 * @description:
 */
public interface TeacherDao {
    @Select("select * from teacher where tuesr=#{tuesr}")
    Teacher selectLogin(String tuesr);

    @Select("select * from teacher")
    List<Teacher> findAll();

    @Select("select * from teacher where tid=#{tid}")
    Teacher selectTeaByTid(Integer tid);


}
