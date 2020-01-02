package aynu.service;

import aynu.bean.Teacher;
import aynu.dao.TeacherDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author susuper
 * @Date 2019/12/28 15:55
 * @description:
 */
@Service("TeacherServiceImpl")
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherDao teacherDao;
    @Override
    public Teacher selectLogin(String tuesr) {
        return teacherDao.selectLogin(tuesr);
    }

    @Override
    public List<Teacher> findAll() {
        return teacherDao.findAll();
    }

    @Override
    public Teacher selectTeaByTid(Integer tid) {
        return teacherDao.selectTeaByTid(tid);
    }
}
