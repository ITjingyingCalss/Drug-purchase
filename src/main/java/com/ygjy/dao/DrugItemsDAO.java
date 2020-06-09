package com.ygjy.dao;

import com.ygjy.pojo.DrugItems;
import com.ygjy.pojo.DrugItemsExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * DrugItemsDAO继承基类
 */
@Mapper
@Repository
public interface DrugItemsDAO extends MyBatisBaseDao<DrugItems, Integer, DrugItemsExample> {
}