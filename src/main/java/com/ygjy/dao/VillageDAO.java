package com.ygjy.dao;

import com.ygjy.pojo.Village;
import com.ygjy.pojo.VillageExample;
import org.springframework.stereotype.Repository;

/**
 * VillageDAO继承基类
 */
@Repository
public interface VillageDAO extends MyBatisBaseDao<Village, Integer, VillageExample> {
}