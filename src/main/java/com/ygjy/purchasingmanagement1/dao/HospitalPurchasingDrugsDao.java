package com.ygjy.purchasingmanagement1.dao;

import com.ygjy.purchasingmanagement1.pojo.DrugInformation2;
import com.ygjy.purchasingmanagement1.pojo.HospitalPurchasingDrugs;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface HospitalPurchasingDrugsDao {

    List<HospitalPurchasingDrugs> selectAllHospitalPurchasingDrugs();

    List<HospitalPurchasingDrugs> selectLikeHospitalPurchasingDrug(
            @Param("serialNumber") Integer serialNumber,
            @Param("commonName") String commonName,
            @Param("dosageFormId")Integer dosageFormId,
            @Param("specification") String specification,
            @Param("unit")String unit,
            @Param("conversionFraction")String conversionFraction,
            @Param("enterpriseNameId")Integer enterpriseNameId,
            @Param("tradeName")String tradeName,
            @Param("biddingPrice")Double biddingPrice,
            @Param("drugCategoryId")Integer drugCategoryId,
            @Param("availabilityStatus") Integer availabilityStatus,
            @Param("drugTransactionStatusId")Integer drugTransactionStatusId);
    DrugInformation2 selectBySerialNumber(Integer serialNumber);

}
