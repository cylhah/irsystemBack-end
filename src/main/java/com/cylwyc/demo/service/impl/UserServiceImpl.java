package com.cylwyc.demo.service.impl;

import com.cylwyc.demo.dao.ArticleDao;
import com.cylwyc.demo.dao.CommentDao;
import com.cylwyc.demo.dao.UserDao;
import com.cylwyc.demo.domain.Article;
import com.cylwyc.demo.domain.Comment;
import com.cylwyc.demo.domain.Type;
import com.cylwyc.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Autowired
    private ArticleDao articleDao;

    @Autowired
    private CommentDao commentDao;

    @Override
    public List<Article> getRecListById(int userId) {
        List<Type> types = userDao.queryUserTypeById(userId);
        List<Article> recList = null;
        for (Type type: types){
            Article temp = articleDao.queryHottestArticleByTypeId(type.getTypeId());
            temp = articleDao.queryArticleById(temp.getArticleId());
            recList.add(temp);
        }
        return recList;
    }

    @Override
    public List<Article> getHistoryRecordById(int userId) {
        return articleDao.queryHistoryRecordByUserId(userId);
    }

    @Override
    public List<Article> getCollectionById(int userId) {
        return articleDao.queryCollectionByUserId(userId);
    }

    @Override
    public List<Comment> getCommentById(int userId) {
        return commentDao.queryCommentByUserId(userId);
    }

    @Override
    public int insertType(int userId, int typeId) {
        return userDao.insertType(userId,typeId);
    }

    @Override
    public int deleteType(int userId, int typeId) {
        return userDao.deleteType(userId,typeId);
    }
}
