package aynu.service;

import aynu.bean.Unit;
import aynu.dao.UnitDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author susuper
 * @Date 2019/12/29 10:33
 * @description:
 */
@Service("UnitServiceImpl")
public class UnitServiceImpl implements UnitService {
    @Autowired
    UnitDao unitDao;
    @Override
    public List<Unit> findAll(Integer cid) {
        return unitDao.findAll(cid);
    }

    @Override
    public Unit selectUnitByUid(Integer uid) {
        return unitDao.selectUnitByUid(uid);
    }

    @Override
    public void insertUnit(Unit unit) {
        unitDao.insertUnit(unit);
    }
}
