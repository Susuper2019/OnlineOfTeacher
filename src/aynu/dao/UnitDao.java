package aynu.dao;

import aynu.bean.Unit;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author susuper
 * @Date 2019/12/29 10:31
 * @description:
 */
@Repository
public interface UnitDao {
    @Select("select * from unit where cid=#{cid}")
    List<Unit> findAll(Integer cid);

    @Select("select * from unit where uid=#{uid}")
    Unit selectUnitByUid(Integer uid);

    @Insert("insert into unit(uarticle,cid,tid) values(#{uarticle},#{cid},#{tid})")
    void insertUnit(Unit unit);
}
