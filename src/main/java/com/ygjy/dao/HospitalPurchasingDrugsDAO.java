package com.ygjy.dao;

import com.ygjy.pojo.HospitalPurchasingDrugs;
import com.ygjy.pojo.HospitalPurchasingDrugsExample;
import org.springframework.stereotype.Repository;

/**
 * HospitalPurchasingDrugsDAO继承基类
 */
@Repository
public interface HospitalPurchasingDrugsDAO extends MyBatisBaseDao<HospitalPurchasingDrugs, Integer, HospitalPurchasingDrugsExample> {
}