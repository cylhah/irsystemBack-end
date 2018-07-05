package com.cylwyc.demo.dao;

import org.apache.ibatis.annotations.Param;

public interface UpAndDownDao {
    int insertUpArticle(@Param("userId") int userId, @Param("articleId") int articleId);
    int insertDownArticle(@Param("userId") int userId,@Param("articleId") int articleId);
    int deleteUpAndDownDao(@Param("userId") int userId,@Param("articleId") int articleId);
}
