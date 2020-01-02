package aynu.service;

import aynu.bean.Papertest;
import aynu.dao.PapertestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author susuper
 * @Date 2019/12/29 15:30
 * @description:
 */
@Service("PapertestServiceImpl")
public class PapertestServiceImpl implements PapertestService {
    @Autowired
    public PapertestDao papertestDao;
    @Override
    public List<Papertest> findAll(Integer cid) {
        return papertestDao.findAll(cid);
    }

    @Override
    public boolean insertPaper(Papertest papertest) {
        return papertestDao.insertPaper(papertest);
    }
}
