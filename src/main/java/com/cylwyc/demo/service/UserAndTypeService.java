package com.cylwyc.demo.service;

import com.cylwyc.demo.domain.Type;

import java.util.List;

public interface UserAndTypeService {
    List<Type> queryAllType();
    List<Type> getTypeByUserId(int userId);
    int getUserAndType(int userId,int typeId);
    int insertUserAndType(int userId,int typeId);
    int deleteUserAndType(int userId,int typeId);
}
