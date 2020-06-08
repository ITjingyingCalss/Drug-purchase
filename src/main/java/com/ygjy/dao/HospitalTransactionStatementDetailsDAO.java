package com.ygjy.dao;

import com.ygjy.pojo.HospitalTransactionStatementDetails;
import com.ygjy.pojo.HospitalTransactionStatementDetailsExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * HospitalTransactionStatementDetailsDAO继承基类
 */
@Mapper
@Repository
public interface HospitalTransactionStatementDetailsDAO extends MyBatisBaseDao<HospitalTransactionStatementDetails, Integer, HospitalTransactionStatementDetailsExample> {
}