package com.ygjy.dao;

import com.ygjy.pojo.SupplyArea;
import com.ygjy.pojo.SupplyAreaExample;
import org.springframework.stereotype.Repository;

/**
 * SupplyAreaDAO继承基类
 */
@Repository
public interface SupplyAreaDAO extends MyBatisBaseDao<SupplyArea, Integer, SupplyAreaExample> {
}