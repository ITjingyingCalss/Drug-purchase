package com.ygjy.dao;

import com.ygjy.pojo.StatementStatus;
import com.ygjy.pojo.StatementStatusExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * StatementStatusDAO继承基类
 */
@Mapper
@Repository
public interface StatementStatusDAO extends MyBatisBaseDao<StatementStatus, Integer, StatementStatusExample> {
}