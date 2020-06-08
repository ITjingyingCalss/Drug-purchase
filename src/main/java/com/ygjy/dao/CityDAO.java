package com.ygjy.dao;

import com.ygjy.pojo.City;
import com.ygjy.pojo.CityExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * CityDAO继承基类
 */
@Mapper
@Repository
public interface CityDAO extends MyBatisBaseDao<City, Integer, CityExample> {
}