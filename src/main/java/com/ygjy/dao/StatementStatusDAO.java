package com.ygjy.dao;

import com.ygjy.pojo.StatementStatus;
import com.ygjy.pojo.StatementStatusExample;
import org.springframework.stereotype.Repository;

/**
 * StatementStatusDAO继承基类
 */
@Repository
public interface StatementStatusDAO extends MyBatisBaseDao<StatementStatus, Integer, StatementStatusExample> {
}