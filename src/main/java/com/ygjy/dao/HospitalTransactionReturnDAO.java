package com.ygjy.dao;

import com.ygjy.pojo.HospitalTransactionReturn;
import com.ygjy.pojo.HospitalTransactionReturnExample;
import org.springframework.stereotype.Repository;

/**
 * HospitalTransactionReturnDAO继承基类
 */
@Repository
public interface HospitalTransactionReturnDAO extends MyBatisBaseDao<HospitalTransactionReturn, Integer, HospitalTransactionReturnExample> {
}