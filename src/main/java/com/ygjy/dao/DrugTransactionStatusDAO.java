package com.ygjy.dao;

import com.ygjy.pojo.DrugTransactionStatus;
import com.ygjy.pojo.DrugTransactionStatusExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * DrugTransactionStatusDAO继承基类
 */
@Mapper
@Repository
public interface DrugTransactionStatusDAO extends MyBatisBaseDao<DrugTransactionStatus, Integer, DrugTransactionStatusExample> {
}