package aynu.service;

import aynu.bean.Sonunit;
import aynu.dao.SonUnitDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * @Author susuper
 * @Date 2019/12/29 11:52
 * @description:
 */
@Controller("SonUnitServiceImpl")
public class SonUnitServiceImpl implements SonUnitService{
    @Autowired
    SonUnitDao sonUnitDao;
    @Override
    public List<Sonunit> findAll(Integer uid) {
        return sonUnitDao.findAll(uid);
    }

    @Override
    public void insertSonUnit(Sonunit sonunit) {
        sonUnitDao.insertSonUnit(sonunit);
    }
}
