package com.cylwyc.demo.service.impl;

import com.cylwyc.demo.dao.CollectionDao;
import com.cylwyc.demo.service.CollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CollectionServiceImpl implements CollectionService {

    @Autowired
    private CollectionDao collectionDao;

    @Override
    public int getCollection(int userId, int articleId) {
        return collectionDao.queryCollection(userId, articleId);
    }

    @Override
    public int insertCollection(int userId, int articleId) {
        return collectionDao.insertCollection(userId, articleId);
    }

    @Override
    public int deleteCollection(int userId, int articleId) {
        return collectionDao.deleteCollection(userId,articleId);
    }
}
