package com.ygjy.dao;

import com.ygjy.pojo.HospitalTransactionStatementDetails;
import com.ygjy.pojo.HospitalTransactionStatementDetailsExample;
import org.springframework.stereotype.Repository;

/**
 * HospitalTransactionStatementDetailsDAO继承基类
 */
@Repository
public interface HospitalTransactionStatementDetailsDAO extends MyBatisBaseDao<HospitalTransactionStatementDetails, Integer, HospitalTransactionStatementDetailsExample> {
}