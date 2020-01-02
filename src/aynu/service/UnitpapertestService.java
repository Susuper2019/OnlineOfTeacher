package aynu.service;

import aynu.bean.Unitpapertest;

import java.util.List;

/**
 * @Author susuper
 * @Date 2019/12/29 16:42
 * @description:
 */
public interface UnitpapertestService {
    //根据 cid查询所有试卷
    public List<Unitpapertest> findAll(Integer uid);
    //插入试题

    public boolean insertPaper(Unitpapertest unitpapertest);
}
