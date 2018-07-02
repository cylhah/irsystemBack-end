package com.cylwyc.demo.dao;

public interface UpAndDownDao {
    int insertUpArticle(int userId,int articleId);
    int insertDownArticle(int userId,int articleId);
    int deleteUpAndDownDao(int userId,int articleId);
}
