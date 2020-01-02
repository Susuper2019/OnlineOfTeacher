package aynu.dao;

import aynu.bean.Sonunit;
import aynu.bean.Unit;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author susuper
 * @Date 2019/12/29 11:49
 * @description:
 */
@Repository
public interface SonUnitDao {
    @Select("select * from sonunit where uid = #{uid}")
    List<Sonunit> findAll(Integer uid);

//    Unit selectU
    @Insert("insert into sonunit(uid,suarticle,tid,cid) values(#{uid},#{suarticle},#{tid},#{cid})")
    void insertSonUnit(Sonunit sonunit);
}
