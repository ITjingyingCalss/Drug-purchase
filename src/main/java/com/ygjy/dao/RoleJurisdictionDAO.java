package com.ygjy.dao;

import com.ygjy.pojo.RoleJurisdiction;
import com.ygjy.pojo.RoleJurisdictionExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * RoleJurisdictionDAO继承基类
 */
@Mapper
@Repository
public interface RoleJurisdictionDAO extends MyBatisBaseDao<RoleJurisdiction, RoleJurisdiction, RoleJurisdictionExample> {
}