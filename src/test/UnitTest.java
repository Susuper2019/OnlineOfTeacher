package test;

import aynu.bean.Unit;
import aynu.bean.Unitpapertest;
import aynu.service.UnitService;
import aynu.service.UnitpapertestService;
import aynu.service.UnitpapertestServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Author susuper
 * @Date 2019/12/29 10:34
 * @description:
 */
public class UnitTest {
    ApplicationContext ac = null;
    UnitService unitService= null;
    UnitpapertestService unitpapertestService;
    @Before
    public void run(){
        ac =new ClassPathXmlApplicationContext("application.xml");
        unitService = (UnitService) ac.getBean("UnitServiceImpl");
        unitpapertestService = (UnitpapertestService)ac.getBean("UnitpapertestServiceImpl");
    }
    @Test
    public void testUnitFindAll(){
        List<Unit> units = unitService.findAll(1);
        for(Unit unit:units){
            System.out.println(unit);
        }
    }

    @Test
    public void insertUnit(){
        Unit unit = new Unit();
        unit.setCid(1);
        unit.setTid(1);
        unit.setUarticle("good");
        unitService.insertUnit(unit);
    }

    @Test
    public void findOneUnit(){
        System.out.println(unitService.selectUnitByUid(1));
    }


    @Test
    //根据 cid查询所有试卷
    public void findAll(){
        System.out.println(unitpapertestService.findAll(1));
    }
    //插入试题

    @Test
    public void insertPaper(){

    }
}
