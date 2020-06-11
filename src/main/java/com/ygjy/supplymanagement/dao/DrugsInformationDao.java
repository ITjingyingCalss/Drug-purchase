package com.ygjy.supplymanagement.dao;

import com.ygjy.supplymanagement.pojo.*;
import com.ygjy.supplymanagement.utils.Dto;
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
                 @Param("enterpriseNameId")Integer enterpriseNameId,
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

    /**
     * 企业表
     * @return
     */
    List<Enterprise> enterPrise();
    /**
     * 条件查询
     * @return
     */
    DrugInformation getSelect(Integer id);
    /**
     * 导出
     * @param items
     * @return
     */
    List<DrugInformation> importselect(String[] items);
    /**
     * 添加从表供应商药品目录表
     */
    int insertSelective(EnterpriseDrugCatalog enterpriseDrugCatalog);
    /**
     * 供应商药品目录表查询
     */
    List<EnterpriseDrugCatalog> selectEnterpriseDrugCatalog();
    /**
     * 取消供货查询
     */
    List<EnterpriseDrugCatalog> backSelect(@Param("commonName")String commonName,
                                           @Param("serialNumber")String serialNumber,
                                           @Param("dosageFormId")Integer dosageFormId,
                                           @Param("specification")String specification,
                                           @Param("unit")String unit,
                                           @Param("conversionFraction")String conversionFraction,
                                           @Param("drugCategoryId")Integer drugCategoryId,
                                           @Param("drugTransactionStatusId")Integer drugTransactionStatusId,
                                           @Param("enterpriseNameId")Integer enterpriseNameId,
                                           @Param("tradeName") String tradeName,
                                           @Param("latestRetailPrice") Float latestRetailPrice,
                                           @Param("qualityLevelId") Integer qualityLevelId);
}
