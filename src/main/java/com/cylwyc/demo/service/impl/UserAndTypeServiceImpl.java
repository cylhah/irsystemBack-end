package com.cylwyc.demo.service.impl;

import com.cylwyc.demo.dao.UserAndTypeDao;
import com.cylwyc.demo.domain.Type;
import com.cylwyc.demo.service.UserAndTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserAndTypeServiceImpl implements UserAndTypeService {

    @Autowired
    private UserAndTypeDao userAndTypeDao;

    @Override
    public List<Type> queryAllType() {
        return userAndTypeDao.queryAllType();
    }

    @Override
    public List<Type> getTypeByUserId(int userId) {
        return userAndTypeDao.queryTypeByUserId(userId);
    }

    @Override
    public int getUserAndType(int userId, int typeId) {
        return userAndTypeDao.queryUserAndType(userId, typeId);
    }

    @Override
    public int insertUserAndType(int userId, int typeId) {
        if (userAndTypeDao.queryUserAndType(userId, typeId)==1){
            return 1;
        }
        else {
            return userAndTypeDao.insertUserAndType(userId,typeId);
        }
    }

    @Override
    public int deleteUserAndType(int userId, int typeId) {
        return userAndTypeDao.deleteUserAndType(userId, typeId);
    }
}
