package com.ygjy.purchasingmanagement1.service.impl;

import com.ygjy.purchasingmanagement1.pojo.DrugInformation;
import com.ygjy.purchasingmanagement1.dao.DrugInformationDao;
import com.ygjy.purchasingmanagement1.service.DrugInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrugInformationImpl implements DrugInformationService {
    @Autowired
    DrugInformationDao drugInformationDao;

    @Override
    public List<DrugInformation> selectAll() {
        return drugInformationDao.selectAll();
    }

    @Override
    public List<DrugInformation> selectLike(Integer serialNumber, String commonName, Integer dosageFormId, String specification, String unit, String conversionFraction, String enterpriseName, String tradeName, Double biddingPrice, Integer qualityLevelId, String drugCategory, Integer drugTransactionStatusId) {
        return drugInformationDao.selectLike(serialNumber,commonName,dosageFormId, specification, unit,conversionFraction, enterpriseName, tradeName, biddingPrice, qualityLevelId,  drugCategory, drugTransactionStatusId);
    }

    @Override
    public int addDrug(DrugInformation drugInformation) {
        int i = drugInformationDao.addDrug(drugInformation);
        return i;
    }

    @Override
    public DrugInformation selectBySerialNumber(Integer serialNumber) {
        return drugInformationDao.selectBySerialNumber(serialNumber);
    }

    @Override
    public int updateDrug(DrugInformation drugInformation) {
        return drugInformationDao.updataDrug(drugInformation);
    }

    @Override
    public int deleteDrug(Integer id) {
        return drugInformationDao.deleteDrug(id);
    }


}
