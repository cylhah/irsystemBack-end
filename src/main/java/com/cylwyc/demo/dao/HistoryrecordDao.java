package com.cylwyc.demo.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HistoryrecordDao {
    int insertHistoryRecord(@Param("userId") int userId,@Param("articleId") int articleId);
    int deleteHistoryRecord(@Param("userId") int userId,@Param("articleId") int articleId);
}
