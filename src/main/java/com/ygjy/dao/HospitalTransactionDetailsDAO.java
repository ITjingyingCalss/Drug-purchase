package com.ygjy.dao;

import com.ygjy.pojo.HospitalTransactionDetails;
import com.ygjy.pojo.HospitalTransactionDetailsExample;
import org.springframework.stereotype.Repository;

/**
 * HospitalTransactionDetailsDAO继承基类
 */
@Repository
public interface HospitalTransactionDetailsDAO extends MyBatisBaseDao<HospitalTransactionDetails, Integer, HospitalTransactionDetailsExample> {
}