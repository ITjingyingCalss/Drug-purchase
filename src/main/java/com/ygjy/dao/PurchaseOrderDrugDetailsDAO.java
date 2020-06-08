package com.ygjy.dao;

import com.ygjy.pojo.PurchaseOrderDrugDetails;
import com.ygjy.pojo.PurchaseOrderDrugDetailsExample;
import org.springframework.stereotype.Repository;

/**
 * PurchaseOrderDrugDetailsDAO继承基类
 */
@Repository
public interface PurchaseOrderDrugDetailsDAO extends MyBatisBaseDao<PurchaseOrderDrugDetails, Integer, PurchaseOrderDrugDetailsExample> {
}