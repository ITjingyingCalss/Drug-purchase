package com.ygjy.systemmanagement.dao;

import com.ygjy.systemmanagement.pojo.Enterprise;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EnterpriseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Enterprise record);

    int insertSelective(Enterprise record);

    Enterprise selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Enterprise record);

    int updateByPrimaryKey(Enterprise record);
}