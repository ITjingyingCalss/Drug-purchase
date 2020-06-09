package com.ygjy.systemmanagement.dao;

import com.ygjy.systemmanagement.pojo.Jurisdiction;

import java.util.List;

public interface JurisdictionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Jurisdiction record);

    int insertSelective(Jurisdiction record);

    Jurisdiction selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Jurisdiction record);

    int updateByPrimaryKey(Jurisdiction record);

    List<Jurisdiction> selectJurisdictionAll();
}