package com.ygjy.dao;

import com.ygjy.pojo.Country;
import com.ygjy.pojo.CountryExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * CountryDAO继承基类
 */
@Mapper
@Repository
public interface CountryDAO extends MyBatisBaseDao<Country, Integer, CountryExample> {
}