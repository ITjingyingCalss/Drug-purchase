package com.ygjy.purchasingmanagement2.service;


import com.ygjy.purchasingmanagement2.pojo.*;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @outher: Huangdebao
 * @Date: 2020/6/9 0009 下午 2:01
 * Desc: 添加结算单
 */
public interface HospitalTransactionStatementService {

   /*添加退货单*/
   int insert(HospitalTransactionStatement hosp);

   /*查询所有到页面*/
   List<HospitalTransactionStatement> list(HospitalTransactionStatement htrList);

   /*修改回显*/
   HospitalTransactionStatement htrSee(Integer id);

   /*更新*/
   int update1(HospitalTransactionStatement htr);

   /*批量删除*/
   boolean removeByKeys(String[] ids);

   /*条件查询*/
   List<HospitalTransactionStatement> selList(@Param("statementNumber") String statementNumber, @Param("statementName") String statementName,
                                              @Param("hospitalId") Integer hospitalId, @Param("statementStateId") Integer statementStateId);


   /*结算单维护*/

   /*退货药品查询*/
   List<HospitalTransactionDetails> seletedrugs2(String purchaseOrderNumber,
                                                String nameOfPurchaseOrder,
                                                String supplierName,
                                                String drugCategoryName,
                                                String serialNumber,
                                                String commonName,
                                                String drugFrom,
                                                String specification,
                                                String unit,
                                                String conversionFraction,
                                                String tradeName,
                                                String level,
                                                Date createReceiptsTime,
                                                Date submissionTime,
                                                String drugBatchNumber,
                                                String returnOfState,
                                                String enterpriseName,
                                                String InvoiceNumber);

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

   /*退货单维护页面批量删除*/
   Boolean deleteByKeyss2(String[] ids);

}
