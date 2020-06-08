package com.ygjy.dao;

import com.ygjy.pojo.SupervisionOrganization;
import com.ygjy.pojo.SupervisionOrganizationExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * SupervisionOrganizationDAO继承基类
 */
@Mapper
@Repository
public interface SupervisionOrganizationDAO extends MyBatisBaseDao<SupervisionOrganization, Integer, SupervisionOrganizationExample> {
}