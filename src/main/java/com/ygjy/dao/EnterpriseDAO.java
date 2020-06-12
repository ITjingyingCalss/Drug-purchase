package com.ygjy.dao;

import com.ygjy.pojo.Enterprise;
import com.ygjy.pojo.EnterpriseExample;
import org.springframework.stereotype.Repository;

/**
 * EnterpriseDAO继承基类
 */
@Repository
public interface EnterpriseDAO extends MyBatisBaseDao<Enterprise, Integer, EnterpriseExample> {
}