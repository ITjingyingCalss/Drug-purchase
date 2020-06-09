package com.ygjy.dao;

import com.ygjy.pojo.DrugCategory;
import com.ygjy.pojo.DrugCategoryExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * DrugCategoryDAO继承基类
 */
@Mapper
@Repository
public interface DrugCategoryDAO extends MyBatisBaseDao<DrugCategory, Integer, DrugCategoryExample> {
}