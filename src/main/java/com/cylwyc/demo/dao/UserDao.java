package com.cylwyc.demo.dao;

import com.cylwyc.demo.domain.Type;
import com.cylwyc.demo.domain.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserDao {
    User queryUserById(@Param("userId") int userId);
    List<Type> queryUserTypeById(@Param("userId") int userId);
    int insertType(@Param("userId") int userId,@Param("typeId") int typeId);
    int deleteType(@Param("userId") int userId,@Param("typeId") int typeId);
    int insertUser(User user);
    int updateUser(User user);
}
