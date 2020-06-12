package com.ygjy.dao;

import com.ygjy.pojo.DrugInformation;
import com.ygjy.pojo.DrugInformationExample;
import com.ygjy.pojo.DrugInformationKey;
import org.springframework.stereotype.Repository;

/**
 * DrugInformationDAO继承基类
 */
@Repository
public interface DrugInformationDAO extends MyBatisBaseDao<DrugInformation, DrugInformationKey, DrugInformationExample> {
}