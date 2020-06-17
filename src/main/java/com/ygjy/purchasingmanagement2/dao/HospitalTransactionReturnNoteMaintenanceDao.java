package com.ygjy.purchasingmanagement2.dao;


import com.ygjy.purchasingmanagement2.pojo.HospitalTransactionDetails;
import com.ygjy.purchasingmanagement2.pojo.HospitalTransactionReturn;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * HHospitalTransactionReturnNoteMaintenanceDao继承基类
 * 退货单维护页面
 */
@Mapper
@Repository
public interface HospitalTransactionReturnNoteMaintenanceDao {

    /*导出*/
    List<HospitalTransactionReturn> exportAll1(HospitalTransactionReturn hospital);

    /*退货药品查询*/
    List<HospitalTransactionDetails> seletedrugs(@Param("purchaseOrderNumber")String purchaseOrderNumber,
                                            @Param("nameOfPurchaseOrder")String nameOfPurchaseOrder,
                                            @Param("supplierMame")String supplierMame,
                                            @Param("drugCategoryId")String drugCategoryId,
                                            @Param("serialNumber")String serialNumber,
                                            @Param("commonName")String commonName,
                                            @Param("drugFrom")String drugFrom,
                                            @Param("specification")String specification,
                                            @Param("unit")String unit,
                                            @Param("conversionFraction")String conversionFraction,
                                            @Param("tradeName")String tradeName,
                                            @Param("level")String level,
                                            @Param("createReceiptsTimes") Date createReceiptsTimes,
                                            @Param("submissionTimes")Integer submissionTimes,
                                            @Param("drugBatchNumber")String drugBatchNumber,
                                            @Param("returnOfState")String returnOfState,
                                            @Param("enterpriseName")String enterpriseName,
                                            @Param("InvoiceNumber")String InvoiceNumber);

}