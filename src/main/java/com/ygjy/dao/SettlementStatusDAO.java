package com.ygjy.dao;

import com.ygjy.pojo.SettlementStatus;
import com.ygjy.pojo.SettlementStatusExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * SettlementStatusDAO继承基类
 */
@Mapper
@Repository
public interface SettlementStatusDAO extends MyBatisBaseDao<SettlementStatus, Integer, SettlementStatusExample> {
}