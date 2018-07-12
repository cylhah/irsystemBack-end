package com.cylwyc.demo.service.impl;

import com.cylwyc.demo.dao.ArticleDao;
import com.cylwyc.demo.dao.CommentDao;
import com.cylwyc.demo.dao.UserAndTypeDao;
import com.cylwyc.demo.dao.UserDao;
import com.cylwyc.demo.domain.Article;
import com.cylwyc.demo.domain.Comment;
import com.cylwyc.demo.domain.Type;
import com.cylwyc.demo.domain.User;
import com.cylwyc.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(int userId) {
        return userDao.queryUserById(userId);
    }

    @Override
    public List<User> queryUserByDate(String sDate, String eDate) {
        return userDao.queryUserByDate(sDate, eDate);
    }

    @Override
    public int login(String userAccount, String userPassword) {
        return userDao.queryAccountAndPassword(userAccount, userPassword);
    }

    @Override
    public int insertUser(User user) {
        return userDao.insertUser(user);
    }

    @Override
    public int updatePassword(int userId, String userPassword) {
        return userDao.updatePassword(userId, userPassword);
    }

    @Override
    public int updateHeadUrl(int userId, String userHeadUrl) {
        return userDao.updateHeadUrl(userId, userHeadUrl);
    }
}
