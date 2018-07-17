package com.cylwyc.demo.dao;

import com.cylwyc.demo.domain.UserGroup;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserGroupDao {

    List<UserGroup> queryUserGroup(@Param("userId1")int userId1);
}
