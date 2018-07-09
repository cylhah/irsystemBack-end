package com.cylwyc.demo.service.impl;

import com.cylwyc.demo.dao.HistoryRecordDao;
import com.cylwyc.demo.service.HistoryRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class HistoryRecordServiceImpl implements HistoryRecordService {

    @Autowired
    private HistoryRecordDao historyRecordDao;

    @Override
    public int insertHistoryRecord(int userId, int articleId) {
        if (historyRecordDao.queryHistoryRecord(userId,articleId)==0) {
            return historyRecordDao.insertHistoryRecord(userId,articleId);
        }
        else {
            Date date = new Date();
            return historyRecordDao.updateHistoryRecord(userId,articleId,date);
        }
    }

    @Override
    public int deleteHistoryRecord(int userId, int articleId) {
        return historyRecordDao.deleteHistoryRecord(userId,articleId);
    }

    @Override
    public int deleteAllHistoryRecordByUserId(int userId) {
        return historyRecordDao.deleteAllHistoryRecordByUserId(userId);
    }
}
