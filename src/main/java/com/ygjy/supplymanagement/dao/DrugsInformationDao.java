package com.ygjy.supplymanagement.dao;

import com.ygjy.supplymanagement.pojo.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: 赵林
 * @Date: 2020/6/9 9:20
 * @Description:
 */
@Mapper
public interface DrugsInformationDao {
    /**
     * 药品品目模糊查询及全部查询
     * @return
     */
    List<DrugInformation> getQuery(@Param("commonName")String commonName,
                                   @Param("serialNumber")String serialNumber,
                                   @Param("dosageFormId")Integer dosageFormId,
                                   @Param("specification")String specification,
                                   @Param("unit")String unit,
                                   @Param("conversionFraction")String conversionFraction,
                                   @Param("drugCategoryId")Integer drugCategoryId,
                                   @Param("drugTransactionStatusId")Integer drugTransactionStatusId,
                                    @Param("enterpriseName")String enterpriseName,
                                   @Param("tradeName") String tradeName,
                                   @Param("latestRetailPrice") Float latestRetailPrice,
                                   @Param("qualityLevelId") Integer qualityLevelId);

    /**
     * 剂型表
     * @return
     */
    List<DurgsFrom> selectDurgsFrom();
    /**
     * 药品类别表
     */
    List<DrugCategory> selectDrugCategory();

    /**
     * 药品状态表
     * @return
     */
    List<DrugTransactionStatus> selectDrugTransactionStatus();
    /**
     * 质量层次表
     */
    List<QualityLevel> qualityLevel();
}
