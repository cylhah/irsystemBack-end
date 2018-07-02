package com.cylwyc.demo.dao;

import com.cylwyc.demo.domain.Type;
import com.cylwyc.demo.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserDao {
    User queryUserById(int userId);
    List<Type> queryUserTypeById(int userId);
    int insertType(int userId,int typeId);
    int deleteType(int userId,int typeId);
    int insertUser(User user);
    int updateUser(User user);
}
