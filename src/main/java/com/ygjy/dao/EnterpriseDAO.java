package com.ygjy.dao;

import com.ygjy.pojo.Enterprise;
import com.ygjy.pojo.EnterpriseExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * EnterpriseDAO继承基类
 */
@Mapper
@Repository
public interface EnterpriseDAO extends MyBatisBaseDao<Enterprise, Integer, EnterpriseExample> {
}