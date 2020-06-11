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
    public List<DrugInformation> getQuery(String commonName, String serialNumber, Integer dosageFormId, String specification, String unit, String conversionFraction, Integer drugCategoryId, Integer drugTransactionStatusId,Integer enterpriseNameId,String tradeName,Float latestRetailPrice,Integer qualityLevelId) {
        List<DrugInformation> query = drugsInformationDao.getQuery(commonName, serialNumber, dosageFormId, specification, unit, conversionFraction, drugCategoryId, drugTransactionStatusId, enterpriseNameId, tradeName, latestRetailPrice, qualityLevelId);
        return query;
    }

    @Override
    public Dto enterPrise() {
        List<Enterprise> enterprises = drugsInformationDao.enterPrise();
        return DtoUtil.returnDataSuccess(enterprises);
    }

    @Override
    public Dto getSelect(Integer id) {
        DrugInformation select = drugsInformationDao.getSelect(id);
        return DtoUtil.returnDataSuccess(select);
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
    @Override
    public List<DrugInformation> importselect(String[] items) {
        return drugsInformationDao.importselect(items);
    }

    @Override
    public int insertSelective(EnterpriseDrugCatalog enterpriseDrugCatalog) {
        return drugsInformationDao.insertSelective(enterpriseDrugCatalog);
    }

    @Override
    public  List<EnterpriseDrugCatalog> selectEnterpriseDrugCatalog() {
        return drugsInformationDao.selectEnterpriseDrugCatalog();
    }

    @Override
    public List<EnterpriseDrugCatalog> backSelect(String commonName, String serialNumber, Integer dosageFormId, String specification, String unit, String conversionFraction, Integer drugCategoryId, Integer drugTransactionStatusId, Integer enterpriseNameId, String tradeName, Float latestRetailPrice, Integer qualityLevelId) {
        List<EnterpriseDrugCatalog> enterpriseDrugCatalogs = drugsInformationDao.backSelect(commonName, serialNumber, dosageFormId, specification, unit, conversionFraction, drugCategoryId, drugTransactionStatusId, enterpriseNameId, tradeName, latestRetailPrice, qualityLevelId);
        return enterpriseDrugCatalogs;
    }
}
