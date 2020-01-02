package aynu.service;

import aynu.bean.Sonunit;

import java.util.List;

/**
 * @Author susuper
 * @Date 2019/12/29 11:52
 * @description:
 */
public interface SonUnitService {
    List<Sonunit> findAll(Integer uid);

    //    Unit selectU
    void insertSonUnit(Sonunit sonunit);
}
