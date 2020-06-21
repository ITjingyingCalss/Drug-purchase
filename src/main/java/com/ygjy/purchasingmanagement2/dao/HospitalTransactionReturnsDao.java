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
public interface HospitalTransactionReturnsDao {

    /*添加退货单*/
    int insert(HospitalTransactionReturn hosp);


    /*查询所有到页面*/
    List<HospitalTransactionReturn> list(@Param("returnOrderNumber") String returnOrderNumber,
                                         @Param("returnOrderName") String returnOrderName,
                                         @Param("returnStateId") Integer returnStateId,
                                         @Param("contacts") String contacts,
                                         @Param("phone") String phone,
                                         @Param("creatReceiptsPerson") String creatReceiptsPerson,
                                         @Param("createReceiptsTime") String createReceiptsTime,
                                         @Param("submissionTime") String submissionTime,
                                         @Param("remark") String remark,
                                         @Param("hospitalId") Integer hospitalId);

    /*修改回显*/
    HospitalTransactionReturn htrSee(Integer id);

    /*更新*/
    int update(HospitalTransactionReturn htr);

    /*批量删除*/
    int deleteByKeys(String[] ids);

    /*条件查询*/
/*    List<HospitalTransactionReturn> selList(@Param("returnOrderNumber") String returnOrderNumber, @Param("returnOrderName") String returnOrderName,
                                            @Param("hospitalId") Integer hospitalId, @Param("returnStateId") Integer returnStateId);*/

    /*导出*/
    List<HospitalTransactionReturn> exportAll(HospitalTransactionReturn hospital);


/*退货单维护*/

    /*退货药品查询*/
    List<HospitalTransactionDetails> seletedrugs(@Param("purchaseOrderNumber")String purchaseOrderNumber,
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
    List<DurgsFrom> seleDatafrom();

    /**
     * 药品类别表
     */
    List<DrugCategory> seleDrugCategory();

    /**
     * 质量层次表
     */
    List<QualityLevel> selequalityLevel();

    /*
    * 供货商表
    **/
    List<Suppliers> selesuppliers();

    /*批量删除*/
    int deleteByKeyss(String[] ids);

    /*查看*/
    HospitalTransactionDetails htd2(Integer id);

}