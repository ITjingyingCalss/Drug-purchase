package com.ygjy.dao;

import com.ygjy.pojo.HospitalTransactionStatement;
import com.ygjy.pojo.HospitalTransactionStatementExample;
import org.springframework.stereotype.Repository;

/**
 * HospitalTransactionStatementDAO继承基类
 */
@Repository
public interface HospitalTransactionStatementDAO extends MyBatisBaseDao<HospitalTransactionStatement, Integer, HospitalTransactionStatementExample> {
}