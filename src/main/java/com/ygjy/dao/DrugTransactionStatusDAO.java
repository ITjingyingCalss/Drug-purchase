package com.ygjy.dao;

import com.ygjy.pojo.DrugTransactionStatus;
import com.ygjy.pojo.DrugTransactionStatusExample;
import org.springframework.stereotype.Repository;

/**
 * DrugTransactionStatusDAO继承基类
 */
@Repository
public interface DrugTransactionStatusDAO extends MyBatisBaseDao<DrugTransactionStatus, Integer, DrugTransactionStatusExample> {
}