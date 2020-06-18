package com.ygjy.purchasingmanagement1.controller;

import com.ygjy.purchasingmanagement1.pojo.DrugInformation2;
import com.ygjy.purchasingmanagement1.pojo.HospitalPurchasingDrugs;
import com.ygjy.purchasingmanagement1.service.impl.HospitalPurchasingDrugsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HospitalPurchasingDrugsController {

    @Autowired
    HospitalPurchasingDrugsImpl hospitalPurchasingDrugsImpl;


    @ResponseBody
    @RequestMapping("selectAllHospitalPurchasingDrugs")
    public List<HospitalPurchasingDrugs> selectAllHospitalPurchasingDrugs(){
        List<HospitalPurchasingDrugs> hospitalPurchasingDrugs = hospitalPurchasingDrugsImpl.selectAllHospitalPurchasingDrugs();
        return hospitalPurchasingDrugs;
    }

    @ResponseBody
    @RequestMapping("selectLikeHospitalPurchasingDrug")
    public List<HospitalPurchasingDrugs> selectLikeHospitalPurchasingDrug(Integer serialNumber, String commonName, Integer dosageFormId, String specification, String unit, String conversionFraction, Integer enterpriseNameId, String tradeName, Double biddingPrice, Integer drugCategoryId, Integer availabilityStatus, Integer drugTransactionStatusId) {
        List<HospitalPurchasingDrugs> hospitalPurchasingDrugs = hospitalPurchasingDrugsImpl.selectLikeHospitalPurchasingDrug(serialNumber, commonName, dosageFormId, specification, unit, conversionFraction, enterpriseNameId, tradeName, biddingPrice, drugCategoryId, availabilityStatus, drugTransactionStatusId);
        return hospitalPurchasingDrugs;
    }


    @ResponseBody
    @RequestMapping("selectBySerialNumber")
    public DrugInformation2 selectBySerialNumber(Integer serialNumber){
        DrugInformation2 drugInformation2 = hospitalPurchasingDrugsImpl.selectBySerialNumber(serialNumber);
        return drugInformation2;
    }


}
