package com.cylwyc.demo.dao;

import org.apache.ibatis.annotations.Param;

public interface UpAndDownDao {
    int queryUpAndDown(@Param("userId") int userId,@Param("articleId") int articleId);
    int insertUpAndDown(@Param("userId") int userId,@Param("articleId") int articleId,@Param("upOrDown") int upOrDown);
    int deleteUpAndDownDao(@Param("userId") int userId,@Param("articleId") int articleId);
}
