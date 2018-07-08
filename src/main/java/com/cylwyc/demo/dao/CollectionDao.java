package com.cylwyc.demo.dao;

import org.apache.ibatis.annotations.Param;

import java.util.Date;

public interface CollectionDao {
    int queryCollection(@Param("userId") int userId, @Param("articleId") int articleId);
    Date queryCollectionTime(@Param("userId") int userId,@Param("articleId") int articleId);
    int insertCollection(@Param("userId") int userId, @Param("articleId") int articleId);
    int deleteCollection(@Param("userId") int userId,@Param("articleId") int articleId);
}
