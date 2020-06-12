package com.ygjy.dao;

import com.ygjy.pojo.Suppliers;
import com.ygjy.pojo.SuppliersExample;
import org.springframework.stereotype.Repository;

/**
 * SuppliersDAO继承基类
 */
@Repository
public interface SuppliersDAO extends MyBatisBaseDao<Suppliers, Integer, SuppliersExample> {
}