package com.ygjy.dao;

import com.ygjy.pojo.Country;
import com.ygjy.pojo.CountryExample;
import org.springframework.stereotype.Repository;

/**
 * CountryDAO继承基类
 */
@Repository
public interface CountryDAO extends MyBatisBaseDao<Country, Integer, CountryExample> {
}