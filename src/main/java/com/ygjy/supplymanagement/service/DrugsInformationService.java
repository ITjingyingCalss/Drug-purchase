package com.ygjy.supplymanagement.service;

import com.ygjy.supplymanagement.pojo.DrugInformation;
import com.ygjy.supplymanagement.pojo.DrugTransactionStatus;
import com.ygjy.supplymanagement.utils.Dto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: 赵林
 * @Date: 2020/6/9 11:24
 * @Description:
 */
public interface DrugsInformationService {
    /**
     * 药品品目、信息模糊查询及全部查询
     * @return
     */
    Dto getQuery(String commonName, String serialNumber, Integer dosageFormId, String specification, String unit, String conversionFraction, Integer drugCategoryId, Integer drugTransactionStatusId, String enterpriseName, String tradeName, Float latestRetailPrice, Integer qualityLevelId);
    /**
     * 剂型表查询
     */
    Dto selectDurgsFrom();
    /**
     * 药品类别表
     */
    Dto selectDrugCategory();
    /**
     * 药品状态表
     * @return
     */
    Dto selectDrugTransactionStatus();
    /**
     * 质量层次表
     */
    Dto qualityLevel();
}
