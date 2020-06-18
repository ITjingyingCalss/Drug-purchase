package com.ygjy.supplymanagement.dao;

import com.ygjy.supplymanagement.pojo.*;
import com.ygjy.supplymanagement.utils.Dto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
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
     * 供货商
     * @return
     */
    List<Suppliers> supplierSelect();
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
     * 选择供货查询
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
                                           @Param("qualityLevelId") Integer qualityLevelId,
                                           @Param("suppliersid") Integer suppliersid,
                                            @Param("auditStatus") Integer auditStatus);

    /**
     * 取消选择供货
     * @param items
     * @return
     */
    int falseDelete(String[] items);
    /**
     * 修改商品信息维护
     */
    int updateByPrimaryKeySelectives(DrugInformation drugInformation);
    /**
     * 退货单查询
     */
    List<DrugInformation> returnSelect(@Param("returnOrderNumber")String returnOrderNumber,
                                       @Param("returnOrderName")String returnOrderName,
                                       @Param("returnStateId")Integer returnStateId,
                                       @Param("createReceiptsTime")Date createReceiptsTime,
                                       @Param("submissionTime")Date submissionTime,
                                       @Param("hospitalName")String hospitalName,
                                       @Param("createReceiptsTimes")Date createReceiptsTimes,
                                       @Param("submissionTimes")Date submissionTimes,
                                       @Param("purchaseOrderNumber")String purchaseOrderNumber,
                                       @Param("nameOfPurchaseOrder")String nameOfPurchaseOrder,
                                       @Param("commonName")String commonName,
                                       @Param("serialNumber")String serialNumber,
                                       @Param("dosageFormId")Integer dosageFormId,
                                       @Param("specification")String specification,
                                       @Param("unit")String unit,
                                       @Param("conversionFraction")String conversionFraction,
                                       @Param("drugCategoryId")Integer drugCategoryId,
                                       @Param("enterpriseNameId")Integer enterpriseNameId,
                                       @Param("tradeName") String tradeName,
                                       @Param("qualityLevelId") Integer qualityLevelId);

    /**
     * 退货单状态查询
     * @return
     */
    List<ReturnStatus> selectReturnStatus();
    /**
     * 结算单查询
     */
    List<DrugInformation> selectPurchaseOrder(@Param("statementNumber")String statementNumber,
                                              @Param("statementName")String statementName,
                                              @Param("hospitalName")String hospitalName,
                                              @Param("createReceiptsTime")Date createReceiptsTime,
                                              @Param("submissionTime")Date submissionTime,
                                              @Param("statementStateId")Integer statementStateId,
                                              @Param("purchaseOrderNumber")String purchaseOrderNumber,
                                              @Param("nameOfPurchaseOrder")String nameOfPurchaseOrder,
                                              @Param("commonName")String commonName,
                                              @Param("serialNumber")String serialNumber,
                                              @Param("dosageFormId")Integer dosageFormId,
                                              @Param("specification")String specification,
                                              @Param("unit")String unit,
                                              @Param("conversionFraction")String conversionFraction,
                                              @Param("drugCategoryId")Integer drugCategoryId,
                                              @Param("enterpriseNameId")Integer enterpriseNameId,
                                              @Param("tradeName") String tradeName,
                                              @Param("qualityLevelId") Integer qualityLevelId);

    /**
     * 结算状态查询
     * @return
     */
    List<SettlementStatus> selectSettlementStatus();

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
    int updateByPrimaryKeyReturn(@Param("array") List<Integer> array);
    /**
     * 确认结算
     */
    int updateByPrimaryKeySettment(@Param("array") List<Integer> array);

    /**
     * 采购单处理
     * @return
     */
    List<DrugInformation> selectPurchaseOrderProcessing(@Param("purchaseOrderNumber")String purchaseOrderNumber,
                                                        @Param("nameOfPurchaseOrder")String nameOfPurchaseOrder,
                                                        @Param("purchaseOrdersStatesId")Integer purchaseOrdersStatesId,
                                                        @Param("hospitalName")String hospitalName,
                                                        @Param("createReceiptsTimes")Date createReceiptsTimes,
                                                        @Param("submissionTimes")Date submissionTimes,
                                                        @Param("commonName")String commonName,
                                                        @Param("serialNumber")String serialNumber,
                                                        @Param("dosageFormId")Integer dosageFormId,
                                                        @Param("specification")String specification,
                                                        @Param("unit")String unit,
                                                        @Param("conversionFraction")String conversionFraction,
                                                        @Param("drugCategoryId")Integer drugCategoryId,
                                                        @Param("enterpriseNameId")Integer enterpriseNameId,
                                                        @Param("tradeName") String tradeName);
/**
 * 采购单导出
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
