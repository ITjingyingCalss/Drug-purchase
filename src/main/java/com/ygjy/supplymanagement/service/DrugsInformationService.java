package com.ygjy.supplymanagement.service;

import com.ygjy.supplymanagement.pojo.*;
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
    List<DrugInformation> getQuery(String commonName,String serialNumber,Integer dosageFormId,String specification,String unit,String conversionFraction,Integer drugCategoryId,Integer drugTransactionStatusId,Integer enterpriseNameId,String tradeName,Float latestRetailPrice,Integer qualityLevelId);
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

    /**
     * 企业表
     * @return
     */
    Dto enterPrise();
    /**
     * 供货商
     * @return
     */
   Dto supplierSelect();
    /**
     * 条件查询
     * @return
     */
    Dto getSelect(Integer id);
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
    List<EnterpriseDrugCatalog> backSelect(String commonName,String serialNumber,Integer dosageFormId,String specification,String unit,String conversionFraction,Integer drugCategoryId,Integer drugTransactionStatusId,Integer enterpriseNameId,String tradeName,Float latestRetailPrice,Integer qualityLevelId,Integer suppliersid,Integer auditStatus);
    /**
     * 取消选择供货
     * @param items
     * @return
     */
    int falseDelete(String[] items);

    /**
     * 修改商品信息维护
     * @param
     * @return
     */
    int updateByPrimaryKeySelectives(DrugInformation drugInformation);
}
