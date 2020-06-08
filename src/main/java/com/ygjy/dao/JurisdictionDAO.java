package com.ygjy.dao;

import com.ygjy.pojo.Jurisdiction;
import com.ygjy.pojo.JurisdictionExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * JurisdictionDAO继承基类
 */
@Mapper
@Repository
public interface JurisdictionDAO extends MyBatisBaseDao<Jurisdiction, Integer, JurisdictionExample> {
}