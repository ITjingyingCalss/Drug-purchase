package com.ygjy.purchasingmanagement1.service.impl;

import com.ygjy.purchasingmanagement1.dao.DrugInformationDao;
import com.ygjy.purchasingmanagement1.dao.HospitalPurchasingDrugsDao;
import com.ygjy.purchasingmanagement1.pojo.DrugInformation2;
import com.ygjy.purchasingmanagement1.pojo.HospitalPurchasingDrugs;
import com.ygjy.purchasingmanagement1.service.HospitalPurchasingDrugsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HospitalPurchasingDrugsImpl implements HospitalPurchasingDrugsService {

    @Autowired
    HospitalPurchasingDrugsDao hospitalPurchasingDrugsDao;
    @Autowired
    DrugInformationDao drugInformationDao;

    @Override
    public List<HospitalPurchasingDrugs> selectAllHospitalPurchasingDrugs() {
        List<HospitalPurchasingDrugs> hospitalPurchasingDrugs = hospitalPurchasingDrugsDao.selectAllHospitalPurchasingDrugs();
        return hospitalPurchasingDrugs;
    }

    @Override
    public List<HospitalPurchasingDrugs> selectLikeHospitalPurchasingDrug(Integer serialNumber, String commonName, Integer dosageFormId, String specification, String unit, String conversionFraction, Integer enterpriseNameId, String tradeName, Double biddingPrice, Integer drugCategoryId, Integer availabilityStatus, Integer drugTransactionStatusId) {
        List<HospitalPurchasingDrugs> hospitalPurchasingDrugs = hospitalPurchasingDrugsDao.selectLikeHospitalPurchasingDrug(serialNumber, commonName, dosageFormId, specification, unit, conversionFraction, enterpriseNameId, tradeName, biddingPrice, drugCategoryId, availabilityStatus, drugTransactionStatusId);
        return hospitalPurchasingDrugs;
    }

    @Override
    public DrugInformation2 selectBySerialNumber(Integer serialNumber) {
        return hospitalPurchasingDrugsDao.selectBySerialNumber(serialNumber);
    }
}
