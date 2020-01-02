package aynu.service;

import aynu.bean.Applycourse;

import java.util.List;

/**
 * @Author susuper
 * @Date 2019/12/28 16:32
 * @description:
 */
public interface ApplycourseService {
    public List<Applycourse> findAll();
    public Applycourse selectApplycourseByAid(Integer Aid);
    public boolean insertApplycourse(Applycourse applycourse);
    public Integer findMax();
}
