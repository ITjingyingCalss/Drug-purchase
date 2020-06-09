package com.ygjy.systemmanagement.dao;

import com.ygjy.systemmanagement.pojo.RoleJurisdiction;

public interface RoleJurisdictionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RoleJurisdiction record);

    int insertSelective(RoleJurisdiction record);

    RoleJurisdiction selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RoleJurisdiction record);

    int updateByPrimaryKey(RoleJurisdiction record);
}