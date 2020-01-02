package aynu.dao;

import aynu.bean.Unitpapertest;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author susuper
 * @Date 2019/12/29 16:40
 * @description:
 */
@Repository
public interface UnitpapertestDao {
    //根据 cid查询所有试卷
    @Select("select * from unitpapertest where uid=#{uid}")
    public List<Unitpapertest> findAll(Integer uid);
    //插入试题
    @Insert("insert into unitpapertest(cid,cname,title,opta,optb,optc,optd,reallyopt,uid) " +
            "values(#{cid},#{cname},#{title},#{opta},#{optb},#{optc},#{optd},#{reallyopt},#{uid})")
    public boolean insertPaper(Unitpapertest unitpapertest);
}
