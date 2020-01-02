package aynu.service;

import aynu.bean.Unit;

import java.util.List;

/**
 * @Author susuper
 * @Date 2019/12/29 10:33
 * @description:
 */
public interface UnitService {
    List<Unit> findAll(Integer cid);

    Unit selectUnitByUid(Integer uid);

    void insertUnit(Unit unit);
}
