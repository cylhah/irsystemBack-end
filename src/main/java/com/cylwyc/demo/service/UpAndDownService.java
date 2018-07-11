package com.cylwyc.demo.service;

public interface UpAndDownService {
    int getUpAndDown(int userId,int articleId);
    int insertUpAndDown(int userId,int articleId,int upOrDown);
    int deleteUpAndDown(int userId,int articleId);
}
