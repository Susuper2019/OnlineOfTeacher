package aynu.service;

import aynu.bean.Teacher;

import java.util.List;

/**
 * @Author susuper
 * @Date 2019/12/28 15:55
 * @description:
 */
public interface TeacherService {
    Teacher selectLogin(String tuesr);
    List<Teacher> findAll();
    Teacher selectTeaByTid(Integer tid);
}
