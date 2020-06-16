package com.ygjy.dao;

import com.ygjy.pojo.PurchaseOrder;
import com.ygjy.pojo.PurchaseOrderExample;
import org.springframework.stereotype.Repository;

/**
 * PurchaseOrderDAO继承基类
 */
@Repository
public interface PurchaseOrderDAO extends MyBatisBaseDao<PurchaseOrder, Integer, PurchaseOrderExample> {
}