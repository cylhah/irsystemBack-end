package com.cylwyc.demo.dao;

import org.apache.ibatis.annotations.Param;

import java.util.Date;

public interface UserAndCollectionDao {
    int insertUserAndCollection(@Param("userId") int userId, @Param("articleId") int articleId, Date collectTime);
    int deleteUserAndCollection(@Param("userId") int userId,@Param("articleId") int articleId);
}
