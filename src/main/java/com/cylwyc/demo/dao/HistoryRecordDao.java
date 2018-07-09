package com.cylwyc.demo.dao;

import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface HistoryRecordDao {
    int queryHistoryRecord(@Param("userId") int userId,@Param("articleId") int articleId);
    int insertHistoryRecord(@Param("userId") int userId,@Param("articleId") int articleId);
    int deleteHistoryRecord(@Param("userId") int userId,@Param("articleId") int articleId);
    int updateHistoryRecord(@Param("userId") int userId, @Param("articleId") int articleId, @Param("historyRecordTime")Date historyRecordTime);
    int deleteAllHistoryRecordByUserId(@Param("userId") int userId);
}
