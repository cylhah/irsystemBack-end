package com.cylwyc.demo.service;

import com.cylwyc.demo.domain.Article;

import java.util.List;

public interface HistoryRecordService {
    int insertHistoryRecord(int userId,int articleId);
    int deleteHistoryRecord(int userId,int articleId);
    int deleteAllHistoryRecordByUserId(int userId);
}
