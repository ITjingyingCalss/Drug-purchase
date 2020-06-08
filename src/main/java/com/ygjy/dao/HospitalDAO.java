package com.ygjy.dao;

import com.ygjy.pojo.Hospital;
import com.ygjy.pojo.HospitalExample;
import org.springframework.stereotype.Repository;

/**
 * HospitalDAO继承基类
 */
@Repository
public interface HospitalDAO extends MyBatisBaseDao<Hospital, Integer, HospitalExample> {
}