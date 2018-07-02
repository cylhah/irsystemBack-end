package com.cylwyc.demo.service;

import com.cylwyc.demo.domain.Article;
import com.cylwyc.demo.domain.Comment;

import java.util.List;

public interface UserService {
    List<Article> getRecListById(int userId);
    List<Article> getHistoryRecordById(int userId);
    List<Article> getCollectionById(int userId);
    List<Comment> getCommentById(int userId);
    int insertType(int userId,int typeId);
    int deleteType(int userId,int typeId);
}
