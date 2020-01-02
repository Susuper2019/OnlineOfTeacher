package aynu.service;

import aynu.bean.Fileup;
import aynu.dao.FileupDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author susuper
 * @Date 2019/12/29 18:18
 * @description:
 */
@Service("FileupServiceImpl")
public class FileupServiceImpl implements FileupService {
    @Autowired
    public FileupDao fileupDao;
    @Override
    public List<Fileup> fileup(Integer uid) {
        return fileupDao.fileup(uid);
    }

    @Override
    public void insertFileUp(Fileup fileup) {
        fileupDao.insertFileUp(fileup);
    }
}
