package com.ygjy.purchasingmanagement2.dao;



import com.ygjy.purchasingmanagement2.pojo.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * HospitalTransactionReturnDAO继承基类
 */
@Mapper
@Repository
public interface HospitalTransactionStatementDao {

    /*添加结算单*/
    int insert(HospitalTransactionStatement hosp);

/*    *//*查询所有到页面*//*
    List<HospitalTransactionStatement> list(HospitalTransactionStatement htrList);*/

    /*修改回显*/
    HospitalTransactionStatement htrSee(Integer id);

    /*更新*/
    int update1(HospitalTransactionStatement htr);

    /*批量删除*/
    int deleteByKeys(String[] ids);

    /*条件查询*/
    List<HospitalTransactionStatement> selList(@Param("statementNumber") String statementNumber,
                                               @Param("statementName") String statementName,
                                               @Param("contacts") String contacts,
                                               @Param("phone") String phone,
                                               @Param("creatReceiptsPerson") String creatReceiptsPerson,
                                               @Param("createReceiptsTime") String createReceiptsTime,
                                               @Param("submissionTime") String submissionTime,
                                               @Param("remark") String remark,
                                               @Param("hospitalId") Integer hospitalId,
                                               @Param("statementStateId") Integer statementStateId);

    /*退货单维护*/

    /*退货药品查询*/
    List<HospitalTransactionDetails> seletedrugs2(@Param("purchaseOrderNumber")String purchaseOrderNumber,
                                                 @Param("nameOfPurchaseOrder")String nameOfPurchaseOrder,
                                                 @Param("supplierName")String supplierName,
                                                 @Param("drugCategoryName")String drugCategoryName,
                                                 @Param("serialNumber")String serialNumber,
                                                 @Param("commonName")String commonName,
                                                 @Param("drugFrom")String drugFrom,
                                                 @Param("specification")String specification,
                                                 @Param("unit")String unit,
                                                 @Param("conversionFraction")String conversionFraction,
                                                 @Param("tradeName")String tradeName,
                                                 @Param("level")String level,
                                                 @Param("createReceiptsTime") Date createReceiptsTime,
                                                 @Param("submissionTime")Date submissionTime,
                                                 @Param("drugBatchNumber")String drugBatchNumber,
                                                 @Param("returnOfState")String returnOfState,
                                                 @Param("enterpriseName")String enterpriseName,
                                                 @Param("InvoiceNumber")String InvoiceNumber);

    /**
     * 剂型表
     * @return
     */
    List<DurgsFrom> seleDatafrom2();

    /**
     * 药品类别表
     */
    List<DrugCategory> seleDrugCategory2();

    /**
     * 质量层次表
     */
    List<QualityLevel> selequalityLevel2();

    /*
     * 供货商表
     **/
    List<Suppliers> selesuppliers2();

    /*批量删除*/
    int deleteByKeyss2(String[] ids);

/*查看*/
    HospitalTransactionDetails htd(Integer id);

    /*导出*/
    List<HospitalTransactionStatement> exportAlls(HospitalTransactionStatement hospital);
}