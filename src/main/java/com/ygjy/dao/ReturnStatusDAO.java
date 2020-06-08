package com.ygjy.dao;

import com.ygjy.pojo.ReturnStatus;
import com.ygjy.pojo.ReturnStatusExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * ReturnStatusDAO继承基类
 */
@Mapper
@Repository
public interface ReturnStatusDAO extends MyBatisBaseDao<ReturnStatus, Integer, ReturnStatusExample> {
}