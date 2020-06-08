package com.ygjy.dao;

import com.ygjy.pojo.User;
import com.ygjy.pojo.UserExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * UserDAO继承基类
 */
@Mapper
@Repository
public interface UserDAO extends MyBatisBaseDao<User, Integer, UserExample> {
}