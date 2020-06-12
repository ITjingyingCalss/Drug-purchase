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
            @Param("enterpriseNameId")Integer enterpriseNameId,
            @Param("tradeName")String tradeName,
            @Param("biddingPrice")Double biddingPrice,
            @Param("qualityLevelId")Integer qualityLevelId,
            @Param("drugCategoryId")Integer drugCategoryId,
            @Param("drugTransactionStatusId")Integer drugTransactionStatusId);
    //添加药品信息
    int addDrug(DrugInformation drugInformation);
    //药品流水号查询实现查看全部药品信息功能
    DrugInformation selectById(Integer id);
    //修改药品信息
    int updataDrug(DrugInformation drugInformation);
    //删除
    int deleteDrug(Integer id);
}
