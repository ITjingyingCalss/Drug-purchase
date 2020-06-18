package com.ygjy.supplymanagement.service;

import com.ygjy.supplymanagement.pojo.*;
import com.ygjy.supplymanagement.utils.Dto;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
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
    /**
     * 退货单查询
     */
    List<DrugInformation> returnSelect(String returnOrderNumber,String returnOrderName,Integer returnStateId, Date createReceiptsTime, Date submissionTime, String hospitalName, Date createReceiptsTimes, Date submissionTimes, String purchaseOrderNumber, String nameOfPurchaseOrder, String commonName, String serialNumber, Integer dosageFormId, String specification, String unit, String conversionFraction, Integer drugCategoryId, Integer enterpriseNameId,String tradeName,Integer qualityLevelId);
    /**
     * 退货单状态查询
     * @return
     */
    Dto selectReturnStatus();
    /**
     * 结算单查询
     */
    List<DrugInformation> selectPurchaseOrder(String statementNumber,String statementName,String hospitalName,Date createReceiptsTime,Date submissionTime,Integer statementStateId,String purchaseOrderNumber,String nameOfPurchaseOrder,String commonName,String serialNumber,Integer dosageFormId,String specification,String unit,String conversionFraction,Integer drugCategoryId,Integer enterpriseNameId,String tradeName,Integer qualityLevelId);
    /**
     * 结算状态查询
     * @return
     */
   Dto selectSettlementStatus();
    /**
     * 导出退货单
     * @param items
     * @return
     */
    List<DrugInformation> selectReturnExport(String[] items);
    /**
     * 导出结算单
     * @param items
     * @return
     */
    List<DrugInformation> selectSettlementExport(String[] items);
    /**
     * 确认退货
     */
    int updateByPrimaryKeyReturn(List<Integer> items);
    /**
     * 确认结算
     */
    int updateByPrimaryKeySettment(@Param("array") List<Integer> array);
    /**
     * 采购单处理
     * @return
     */
    List<DrugInformation> selectPurchaseOrderProcessing(String purchaseOrderNumber,String nameOfPurchaseOrder, Integer purchaseOrdersStatesId,String hospitalName,Date createReceiptsTimes,Date submissionTimes,String commonName,String serialNumber,Integer dosageFormId,String specification,String unit,String conversionFraction,Integer drugCategoryId,Integer enterpriseNameId,String tradeName);

    /**
     * 采购单导出
     * @param items
     * @return
     */
    List<DrugInformation> selectPurchaseOrderProcessingExport(String[] items);
    /**
     * 选择发货
     */
    int updateReturnGoods(@Param("array") List<Integer> array);
    /**
     * 无法供货
     */
    int updateUnableToSupply(@Param("array") List<Integer> array);
    /**
     * 采购单导入
     */
    int insertPurchaseorder(PurchaseOrder purchaseOrder);

    /**
     * 药品信息导入
     * @param drugInformation
     * @return
     */
    int insertDruginformation(DrugInformation drugInformation);
    /**
     * 条件查询采购状态
     * @param id
     * @return
     */
    PurchaseOrderDrugDetails selectPurchaseOrders(Integer id);
    /**
     * 采购单明细表导入
     * @param purchaseOrderDrugDetails
     * @return
     */
    int insert(PurchaseOrderDrugDetails purchaseOrderDrugDetails);
    /**
     * 医院明细表添加
     * @param hospitalTransactionDetails
     * @return
     */
    int insertHospitalTransactionDetail(HospitalTransactionDetails hospitalTransactionDetails);
    /**
     * 医院添加
     * @param hospital
     * @return
     */
    int insertHospitalName(Hospital hospital);
}
