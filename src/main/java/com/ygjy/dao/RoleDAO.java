package com.ygjy.dao;

import com.ygjy.pojo.Role;
import com.ygjy.pojo.RoleExample;
import org.springframework.stereotype.Repository;

/**
 * RoleDAO继承基类
 */
@Repository
public interface RoleDAO extends MyBatisBaseDao<Role, Integer, RoleExample> {
}