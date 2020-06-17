package com.ygjy.purchasingmanagement2.service;


import com.ygjy.purchasingmanagement2.pojo.HospitalTransactionDetails;
import com.ygjy.purchasingmanagement2.pojo.HospitalTransactionReturn;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * HospitalTransactionReturnNoteMaintenanceDao继承基类
 * 退货单维护页面
 */
@Mapper
@Repository
public interface HospitalTransactionReturnNoteMaintenanceService {

    /*导出*/
    List<HospitalTransactionReturn> exportAll1(HospitalTransactionReturn hospital);

    /*退货药品查询*/
    List<HospitalTransactionDetails> seletedrugs(String purchaseOrderNumber,
                                            String nameOfPurchaseOrder,
                                            String supplierMame,
                                            String drugCategoryId,
                                            String serialNumber,
                                            String commonName,
                                            String drugFrom,
                                            String specification,
                                            String unit,
                                            String conversionFraction,
                                            String tradeName,
                                            String level,
                                            Date createReceiptsTimes,
                                            Integer submissionTimes,
                                            String drugBatchNumber,
                                            String returnOfState,
                                            String enterpriseName,
                                            String InvoiceNumber);


}