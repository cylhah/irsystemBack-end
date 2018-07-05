package com.cylwyc.demo.dao;

import com.cylwyc.demo.domain.Type;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserAndTypeDao {
    List<Type> queryTypeByUserId(@Param("userId") int userId);
    int queryUserAndType(@Param("userId") int userId,@Param("typeId") int typeId);
    int insertUserAndType(@Param("userId") int userId,@Param("typeId") int typeId);
    int deleteUserAndType(@Param("userId") int userId,@Param("typeId") int typeId);
}
