package com.ygjy.dao;

import com.ygjy.pojo.DrugInformation;
import com.ygjy.pojo.DrugInformationExample;
import org.springframework.stereotype.Repository;

/**
 * DrugInformationDAO继承基类
 */
@Repository
public interface DrugInformationDAO extends MyBatisBaseDao<DrugInformation, Integer, DrugInformationExample> {
}