package com.ygjy.purchasingmanagement1.dao;

import com.ygjy.pojo.DrugInformation;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DrugInformationDao {
    //查询所有
    List<DrugInformation> selectAll();
}
