package com.ygjy.dao;

import com.ygjy.pojo.DurgsFrom;
import com.ygjy.pojo.DurgsFromExample;
import org.springframework.stereotype.Repository;

/**
 * DurgsFromDAO继承基类
 */
@Repository
public interface DurgsFromDAO extends MyBatisBaseDao<DurgsFrom, Integer, DurgsFromExample> {
}