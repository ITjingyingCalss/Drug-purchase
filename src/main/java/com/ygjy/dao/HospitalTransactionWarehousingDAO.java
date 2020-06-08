package com.ygjy.dao;

import com.ygjy.pojo.HospitalTransactionWarehousing;
import com.ygjy.pojo.HospitalTransactionWarehousingExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * HospitalTransactionWarehousingDAO继承基类
 */
@Mapper
@Repository
public interface HospitalTransactionWarehousingDAO extends MyBatisBaseDao<HospitalTransactionWarehousing, Integer, HospitalTransactionWarehousingExample> {
}