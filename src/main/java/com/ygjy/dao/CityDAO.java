package com.ygjy.dao;

import com.ygjy.pojo.City;
import com.ygjy.pojo.CityExample;
import org.springframework.stereotype.Repository;

/**
 * CityDAO继承基类
 */
@Repository
public interface CityDAO extends MyBatisBaseDao<City, Integer, CityExample> {
}