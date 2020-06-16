package com.ygjy.supervision.dao;

import com.ygjy.pojo.DrugInformation;
import com.ygjy.pojo.DrugItems;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DrugInformationMapper {
    /*
    * 查询药品信息
    * return list*/
    List<DrugInformation> findAllDrugInformation(@Param("drugInformation") DrugInformation drugInformation,@Param("startPrice") Float startPrice,@Param("endPrice") Float endPrice);
    /*
    * 查询药品信息总数
    * return Integer*/
    Integer findDrugInformationCount();
    /*
    * 添加药品信息
    * return Integer*/
    Integer insertDrugInformation(DrugInformation drugInformation);
    /*
    * 查询数据库有没有该流水号
    * return DrugInformation
    */
    DrugInformation findDrugInformationBySerialNumber(String serialNumber);
}
