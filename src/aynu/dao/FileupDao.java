package aynu.dao;

import aynu.bean.Fileup;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author susuper
 * @Date 2019/12/29 18:14
 * @description:
 */
@Repository
public interface FileupDao {

    @Select("select * from fileup where uid =#{uid}")
    List<Fileup> fileup(Integer uid);

    @Insert("insert into fileup(ufile,uid) values(#{ufile},#{uid}) ")
    void insertFileUp(Fileup fileup);

}
