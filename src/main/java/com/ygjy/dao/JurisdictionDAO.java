package com.ygjy.dao;

import com.ygjy.pojo.Jurisdiction;
import com.ygjy.pojo.JurisdictionExample;
import org.springframework.stereotype.Repository;

/**
 * JurisdictionDAO继承基类
 */
@Repository
public interface JurisdictionDAO extends MyBatisBaseDao<Jurisdiction, Integer, JurisdictionExample> {
}