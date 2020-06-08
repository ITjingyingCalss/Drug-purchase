package com.ygjy.dao;

import com.ygjy.pojo.HospitalTransactionStatement;
import com.ygjy.pojo.HospitalTransactionStatementExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * HospitalTransactionStatementDAO继承基类
 */
@Mapper
@Repository
public interface HospitalTransactionStatementDAO extends MyBatisBaseDao<HospitalTransactionStatement, Integer, HospitalTransactionStatementExample> {
}