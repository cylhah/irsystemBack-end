package com.cylwyc.demo.service;

import com.cylwyc.demo.domain.Article;
import com.cylwyc.demo.domain.Comment;
import com.cylwyc.demo.domain.User;

import java.util.List;

public interface UserService {
    User getUserById(int userId);
    int login(String userAccount,String userPassword);
    int insertUser(User user);
    int updatePassword(int userId,String userPassword);
    int updateHeadUrl(int userId,String userHeadUrl);
}
