package com.ygjy.dao;

import com.ygjy.pojo.UserRole;
import com.ygjy.pojo.UserRoleExample;
import org.springframework.stereotype.Repository;

/**
 * UserRoleDAO继承基类
 */
@Repository
public interface UserRoleDAO extends MyBatisBaseDao<UserRole, Integer, UserRoleExample> {
}