package com.ygjy.dao;

import com.ygjy.pojo.HospitalTransactionWarehousing;
import com.ygjy.pojo.HospitalTransactionWarehousingExample;
import org.springframework.stereotype.Repository;

/**
 * HospitalTransactionWarehousingDAO继承基类
 */
@Repository
public interface HospitalTransactionWarehousingDAO extends MyBatisBaseDao<HospitalTransactionWarehousing, Integer, HospitalTransactionWarehousingExample> {
}