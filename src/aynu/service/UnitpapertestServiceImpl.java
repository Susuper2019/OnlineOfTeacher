package aynu.service;

import aynu.bean.Unitpapertest;
import aynu.dao.UnitpapertestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author susuper
 * @Date 2019/12/29 16:42
 * @description:
 */
@Service("UnitpapertestServiceImpl")
public class UnitpapertestServiceImpl implements UnitpapertestService  {
    @Autowired
    public UnitpapertestDao unitpapertestDao;
    @Override
    public List<Unitpapertest> findAll(Integer uid) {
        return unitpapertestDao.findAll(uid);
    }

    @Override
    public boolean insertPaper(Unitpapertest unitpapertest) {
        return unitpapertestDao.insertPaper(unitpapertest);
    }
}
