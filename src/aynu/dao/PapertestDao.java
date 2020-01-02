package aynu.dao;

import aynu.bean.Papertest;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author susuper
 * @Date 2019/12/29 15:15
 * @description:
 */
@Repository
public interface PapertestDao {
    //根据 cid查询所有试卷
    @Select("select * from papertest where cid=#{cid}")
    public List<Papertest> findAll(Integer cid);
    //插入试题
    @Insert("insert into papertest(cid,cname,title,opta,optb,optc,optd,reallyopt) " +
            "values(#{cid},#{cname},#{title},#{opta},#{optb},#{optc},#{optd},#{reallyopt})")
    public boolean insertPaper(Papertest papertest);
}
