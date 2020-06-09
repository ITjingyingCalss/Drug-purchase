package com.ygjy.supplymanagement.service.impl;

import com.ygjy.supplymanagement.dao.DrugsInformationDao;
import com.ygjy.supplymanagement.pojo.*;
import com.ygjy.supplymanagement.service.DrugsInformationService;
import com.ygjy.supplymanagement.utils.Dto;
import com.ygjy.supplymanagement.utils.DtoUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: 赵林
 * @Date: 2020/6/9 11:24
 * @Description:
 */
@Service
public class DrugsInformationImpl implements DrugsInformationService {
    @Resource
    private DrugsInformationDao drugsInformationDao;
    @Override
    public Dto getQuery(String commonName, String serialNumber, Integer dosageFormId, String specification, String unit, String conversionFraction, Integer drugCategoryId, Integer drugTransactionStatusId,String enterpriseName,String tradeName,Float latestRetailPrice,Integer qualityLevelId) {
        List<DrugInformation> query = drugsInformationDao.getQuery(commonName, serialNumber, dosageFormId, specification, unit, conversionFraction, drugCategoryId, drugTransactionStatusId,enterpriseName,tradeName,latestRetailPrice,qualityLevelId);
        return DtoUtil.returnDataSuccess(query);
    }

    @Override
    public Dto selectDurgsFrom() {
        List<DurgsFrom> durgsFroms =drugsInformationDao.selectDurgsFrom();
        return DtoUtil.returnDataSuccess(durgsFroms);
    }

    @Override
    public Dto selectDrugCategory() {
        List<DrugCategory> selectdrugcategory = drugsInformationDao.selectDrugCategory();
        return DtoUtil.returnDataSuccess(selectdrugcategory);
    }

    @Override
    public Dto selectDrugTransactionStatus() {
        List<DrugTransactionStatus> drugTransactionStatuses =  drugsInformationDao.selectDrugTransactionStatus();
        return DtoUtil.returnDataSuccess(drugTransactionStatuses);
    }

    @Override
    public Dto qualityLevel() {
        List<QualityLevel> qualityLevels = drugsInformationDao.qualityLevel();
        return DtoUtil.returnDataSuccess(qualityLevels);
    }
}
