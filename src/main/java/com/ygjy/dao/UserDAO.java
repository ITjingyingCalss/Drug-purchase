package com.ygjy.dao;

import com.ygjy.pojo.User;
import com.ygjy.pojo.UserExample;
import org.springframework.stereotype.Repository;

/**
 * UserDAO继承基类
 */
@Repository
public interface UserDAO extends MyBatisBaseDao<User, Integer, UserExample> {
}