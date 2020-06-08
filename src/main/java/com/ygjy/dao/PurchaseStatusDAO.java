package com.ygjy.dao;

import com.ygjy.pojo.PurchaseStatus;
import com.ygjy.pojo.PurchaseStatusExample;
import org.springframework.stereotype.Repository;

/**
 * PurchaseStatusDAO继承基类
 */
@Repository
public interface PurchaseStatusDAO extends MyBatisBaseDao<PurchaseStatus, Integer, PurchaseStatusExample> {
}