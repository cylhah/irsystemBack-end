package com.cylwyc.demo.dao;

import java.util.Date;

public interface UserAndCollectionDao {
    int insertUserAndCollection(int userId, int articleId, Date collectTime);
    int deleteUserAndCollection(int userId,int articleId);
}
