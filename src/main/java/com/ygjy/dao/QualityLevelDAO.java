package com.ygjy.dao;

import com.ygjy.pojo.QualityLevel;
import com.ygjy.pojo.QualityLevelExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * QualityLevelDAO继承基类
 */
@Mapper
@Repository
public interface QualityLevelDAO extends MyBatisBaseDao<QualityLevel, Integer, QualityLevelExample> {
}