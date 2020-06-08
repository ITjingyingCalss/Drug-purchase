package com.ygjy.dao;

import com.ygjy.pojo.Tright;
import com.ygjy.pojo.TrightExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * TrightDAO继承基类
 */
@Mapper
@Repository
public interface TrightDAO extends MyBatisBaseDao<Tright, Integer, TrightExample> {
}