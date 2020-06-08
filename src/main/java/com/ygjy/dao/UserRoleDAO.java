package com.ygjy.dao;

import com.ygjy.pojo.UserRole;
import com.ygjy.pojo.UserRoleExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * UserRoleDAO继承基类
 */
@Mapper
@Repository
public interface UserRoleDAO extends MyBatisBaseDao<UserRole, Integer, UserRoleExample> {
}