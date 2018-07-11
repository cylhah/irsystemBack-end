package com.cylwyc.demo.dao;

import org.apache.ibatis.annotations.Param;

public interface UpAndDownDao {
    /**
     * 返回值 0：没有点赞或点踩，1：点赞，2：点踩
     * @param userId
     * @param articleId
     * @return
     */
    int queryUpAndDown(@Param("userId") int userId,@Param("articleId") int articleId);

    int insertUpAndDown(@Param("userId") int userId,@Param("articleId") int articleId,@Param("upOrDown") int upOrDown);
    int updateUpAndDown(@Param("userId") int userId,@Param("articleId") int articleId,@Param("upOrDown") int upOrDown);
    int deleteUpAndDown(@Param("userId") int userId,@Param("articleId") int articleId);
}
