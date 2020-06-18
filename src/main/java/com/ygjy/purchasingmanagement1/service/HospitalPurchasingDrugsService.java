package com.ygjy.purchasingmanagement1.service;

import com.ygjy.purchasingmanagement1.pojo.DrugInformation2;
import com.ygjy.purchasingmanagement1.pojo.HospitalPurchasingDrugs;

import java.util.List;

public interface HospitalPurchasingDrugsService {

    public List<HospitalPurchasingDrugs> selectAllHospitalPurchasingDrugs();


    public List<HospitalPurchasingDrugs> selectLikeHospitalPurchasingDrug(Integer serialNumber,
                            String commonName,Integer dosageFormId,String specification,
                            String unit,String conversionFraction,Integer enterpriseNameId,
                            String tradeName,Double biddingPrice,Integer drugCategoryId,
                            Integer availabilityStatus,Integer drugTransactionStatusId);

    public DrugInformation2 selectBySerialNumber(Integer serialNumber);

}
