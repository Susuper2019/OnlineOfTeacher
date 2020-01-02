package aynu.service;

import aynu.bean.Papertest;

import java.util.List;

/**
 * @Author susuper
 * @Date 2019/12/29 15:30
 * @description:
 */
public interface PapertestService {
    //根据 cid查询所有试卷
    public List<Papertest> findAll(Integer cid);
    //插入试题
    public boolean insertPaper(Papertest papertest);
}
