package com.ygjy.dao;

import com.ygjy.pojo.PurchaseOrderDrugDetails;
import com.ygjy.pojo.PurchaseOrderDrugDetailsExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * PurchaseOrderDrugDetailsDAO继承基类
 */
@Mapper
@Repository
public interface PurchaseOrderDrugDetailsDAO extends MyBatisBaseDao<PurchaseOrderDrugDetails, Integer, PurchaseOrderDrugDetailsExample> {
}