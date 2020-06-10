package com.ygjy.purchasingmanagement1.dao;

import com.ygjy.pojo.DrugInformation;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DrugInformationDao {
    //查询所有
    List<DrugInformation> selectAll();
    //模糊查询
    List<DrugInformation> selectLike(
            @Param("serialNumber") Integer serialNumber,
            @Param("commonName") String commonName,
            @Param("dosageFormId")Integer dosageFormId,
            @Param("specification") String specification,
            @Param("unit")String unit,
            @Param("conversionFraction")String conversionFraction,
            @Param("enterpriseName")String enterpriseName,
            @Param("tradeName")String tradeName,
            @Param("biddingPrice")Double biddingPrice,
            @Param("qualityLevelId")Integer qualityLevelId,
            @Param("drugCategory")String drugCategory,
            @Param("drugTransactionStatusId")Integer drugTransactionStatusId);
    //添加药品信息
    int addDrug(DrugInformation drugInformation);
}
