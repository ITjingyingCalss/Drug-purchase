package com.ygjy.purchasingmanagement2.dao;

import com.ygjy.dao.MyBatisBaseDao;
import com.ygjy.pojo.HospitalTransactionReturn;
import com.ygjy.pojo.HospitalTransactionReturnExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * HospitalTransactionReturnDAO继承基类
 */
@Mapper
@Repository
public interface HospitalTransactionReturnsDao {

    int insert(HospitalTransactionReturn hosp);
}