package com.ygjy.dao;

import com.ygjy.pojo.DurgsFrom;
import com.ygjy.pojo.DurgsFromExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * DurgsFromDAO继承基类
 */
@Mapper
@Repository
public interface DurgsFromDAO extends MyBatisBaseDao<DurgsFrom, Integer, DurgsFromExample> {
}