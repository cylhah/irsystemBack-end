package com.cylwyc.demo.service.impl;

import com.cylwyc.demo.dao.UpAndDownDao;
import com.cylwyc.demo.service.UpAndDownService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpAndDownServiceImpl implements UpAndDownService {

    @Autowired
    private UpAndDownDao upAndDownDao;

    @Override
    public int getUpAndDown(int userId, int articleId) {
        return upAndDownDao.queryUpAndDown(userId, articleId);
    }

    @Override
    public int insertUpAndDown(int userId, int articleId,int upOrDown) {
        if (upAndDownDao.queryUpAndDown(userId, articleId)!=0){
            return upAndDownDao.updateUpAndDown(userId, articleId, upOrDown);
        }
        else {
            return upAndDownDao.insertUpAndDown(userId, articleId, upOrDown);
        }
    }

    @Override
    public int deleteUpAndDown(int userId, int articleId) {
        return upAndDownDao.deleteUpAndDown(userId, articleId);
    }
}
