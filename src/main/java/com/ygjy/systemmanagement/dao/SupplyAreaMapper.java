package com.ygjy.systemmanagement.dao;

import com.ygjy.systemmanagement.pojo.SupplyArea;

public interface SupplyAreaMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SupplyArea record);

    int insertSelective(SupplyArea record);

    SupplyArea selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SupplyArea record);

    int updateByPrimaryKey(SupplyArea record);
}