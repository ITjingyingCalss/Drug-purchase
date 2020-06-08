package com.ygjy.dao;

import com.ygjy.pojo.HospitalTransactionReturn;
import com.ygjy.pojo.HospitalTransactionReturnExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * HospitalTransactionReturnDAO继承基类
 */
@Mapper
@Repository
public interface HospitalTransactionReturnDAO extends MyBatisBaseDao<HospitalTransactionReturn, Integer, HospitalTransactionReturnExample> {
}