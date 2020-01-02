package aynu.service;

import aynu.bean.Fileup;

import java.util.List;

/**
 * @Author susuper
 * @Date 2019/12/29 18:17
 * @description:
 */
public interface FileupService {
    List<Fileup> fileup(Integer uid);

    void insertFileUp(Fileup fileup);
}
