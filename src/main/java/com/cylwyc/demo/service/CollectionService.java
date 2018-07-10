package com.cylwyc.demo.service;

import com.cylwyc.demo.domain.Article;

import java.util.List;

public interface CollectionService {

    int getCollection(int userId,int articleId);
    int insertCollection(int userId,int articleId);
    int deleteCollection(int userId,int articleId);
}
