package com.ygjy.dao;

import com.ygjy.pojo.PurchaseOrdersStates;
import com.ygjy.pojo.PurchaseOrdersStatesExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * PurchaseOrdersStatesDAO继承基类
 */
@Mapper
@Repository
public interface PurchaseOrdersStatesDAO extends MyBatisBaseDao<PurchaseOrdersStates, Integer, PurchaseOrdersStatesExample> {
}