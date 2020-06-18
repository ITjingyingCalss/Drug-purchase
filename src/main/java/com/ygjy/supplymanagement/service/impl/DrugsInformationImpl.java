package com.ygjy.supplymanagement.service.impl;

import com.ygjy.supplymanagement.dao.DrugsInformationDao;
import com.ygjy.supplymanagement.pojo.*;
import com.ygjy.supplymanagement.service.DrugsInformationService;
import com.ygjy.supplymanagement.utils.Dto;
import com.ygjy.supplymanagement.utils.DtoUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
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
    public List<EnterpriseDrugCatalog> backSelect(String commonName, String serialNumber, Integer dosageFormId, String specification, String unit, String conversionFraction, Integer drugCategoryId, Integer drugTransactionStatusId, Integer enterpriseNameId, String tradeName, Float latestRetailPrice, Integer qualityLevelId,Integer suppliersid,Integer auditStatus) {
        List<EnterpriseDrugCatalog> enterpriseDrugCatalogs = drugsInformationDao.backSelect(commonName, serialNumber, dosageFormId, specification, unit, conversionFraction, drugCategoryId, drugTransactionStatusId, enterpriseNameId, tradeName, latestRetailPrice, qualityLevelId,suppliersid,auditStatus);
        return enterpriseDrugCatalogs;
    }

    @Override
    public int falseDelete(String[] items) {
        return drugsInformationDao.falseDelete(items);
    }

    @Override
    public Dto supplierSelect() {
        List<Suppliers> suppliers = drugsInformationDao.supplierSelect();
        return DtoUtil.returnDataSuccess(suppliers);
    }

    @Override
    public int updateByPrimaryKeySelectives(DrugInformation drugInformation) {
        int i = drugsInformationDao.updateByPrimaryKeySelectives(drugInformation);
        return i;
    }

    @Override
    public List<DrugInformation> returnSelect(String returnOrderNumber, String returnOrderName, Integer returnStateId, Date createReceiptsTime, Date submissionTime, String hospitalName, Date startTime, Date endTime, String purchaseOrderNumber, String nameOfPurchaseOrder, String commonName, String serialNumber, Integer dosageFormId, String specification, String unit, String conversionFraction, Integer drugCategoryId, Integer enterpriseNameId, String tradeName, Integer qualityLevelId) {
        List<DrugInformation> drugInformations = drugsInformationDao.returnSelect(returnOrderNumber, returnOrderName, returnStateId, createReceiptsTime, submissionTime, hospitalName, startTime, endTime, purchaseOrderNumber, nameOfPurchaseOrder, commonName, serialNumber, dosageFormId, specification, unit, conversionFraction, drugCategoryId, enterpriseNameId, tradeName, qualityLevelId);
        return drugInformations;
    }
    @Override
    public Dto selectReturnStatus() {
        List<ReturnStatus> returnStatuses = drugsInformationDao.selectReturnStatus();
        return DtoUtil.returnDataSuccess(returnStatuses);
    }
    @Override
    public List<DrugInformation> selectPurchaseOrder(String statementNumber, String statementName, String hospitalName, Date startTime, Date endTime, Integer statementStateId, String purchaseOrderNumber, String nameOfPurchaseOrder, String commonName, String serialNumber, Integer dosageFormId, String specification, String unit, String conversionFraction, Integer drugCategoryId, Integer enterpriseNameId, String tradeName, Integer qualityLevelId) {
        List<DrugInformation> drugInformations = drugsInformationDao.selectPurchaseOrder(statementNumber, statementName, hospitalName, startTime, endTime, statementStateId, purchaseOrderNumber, nameOfPurchaseOrder, commonName, serialNumber, dosageFormId, specification, unit, conversionFraction, drugCategoryId, enterpriseNameId, tradeName, qualityLevelId);
        return drugInformations;
    }

    @Override
    public Dto selectSettlementStatus() {
        List<SettlementStatus> settlementStatuses = drugsInformationDao.selectSettlementStatus();
        return DtoUtil.returnDataSuccess(settlementStatuses);
    }

    @Override
    public List<DrugInformation> selectReturnExport(String[] items) {
        return drugsInformationDao.selectReturnExport(items);
    }

    @Override
    public List<DrugInformation> selectSettlementExport(String[] items) {
        return drugsInformationDao.selectSettlementExport(items);
    }

    @Override
    public int updateByPrimaryKeyReturn(List<Integer> items) {
        return drugsInformationDao.updateByPrimaryKeyReturn(items);
    }

    @Override
    public int updateByPrimaryKeySettment(List<Integer> array) {
        return drugsInformationDao.updateByPrimaryKeySettment(array);
    }
    @Override
    public List<DrugInformation> selectPurchaseOrderProcessing(String purchaseOrderNumber, String nameOfPurchaseOrder, Integer purchaseOrdersStatesId, String hospitalName, Date startTime, Date endTime, String commonName, String serialNumber, Integer dosageFormId, String specification, String unit, String conversionFraction, Integer drugCategoryId, Integer enterpriseNameId, String tradeName) {
        return drugsInformationDao.selectPurchaseOrderProcessing(purchaseOrderNumber,nameOfPurchaseOrder,purchaseOrdersStatesId,hospitalName,startTime,endTime,commonName,serialNumber,dosageFormId,specification,unit,conversionFraction,drugCategoryId,enterpriseNameId,tradeName);
    }

    @Override
    public List<DrugInformation> selectPurchaseOrderProcessingExport(String[] items) {
        return drugsInformationDao.selectPurchaseOrderProcessingExport(items);
    }

    @Override
    public int updateReturnGoods(List<Integer> array) {
        return drugsInformationDao.updateReturnGoods(array);
    }

    @Override
    public int updateUnableToSupply(List<Integer> array) {
        return drugsInformationDao.updateUnableToSupply(array);
    }

    @Override
    public int insertPurchaseorder(PurchaseOrder purchaseOrder) {
        int i = drugsInformationDao.insertPurchaseorder(purchaseOrder);
        return i;
    }

    @Override
    public int insertDruginformation(DrugInformation drugInformation) {
        int i = drugsInformationDao.insertDruginformation(drugInformation);
        return i;
    }

    @Override
    public PurchaseOrderDrugDetails selectPurchaseOrders(Integer id) {
        return drugsInformationDao.selectPurchaseOrders(id);
    }

    @Override
    public int insert(PurchaseOrderDrugDetails purchaseOrderDrugDetails) {
        return drugsInformationDao.insert(purchaseOrderDrugDetails);
    }

    @Override
    public int insertHospitalTransactionDetail(HospitalTransactionDetails hospitalTransactionDetails) {
        return drugsInformationDao.insertHospitalTransactionDetail(hospitalTransactionDetails);
    }

    @Override
    public int insertHospitalName(Hospital hospital) {
        return drugsInformationDao.insertHospitalName(hospital);
    }

    @Override
    public List<DrugInformation> selectPurchaseToOrder(String purchaseOrderNumber, String nameOfPurchaseOrder, Integer purchaseOrdersStatesId, String hospitalName, Date createTime, Date subTime, String commonName, String serialNumber, Integer dosageFormId, String specification, String unit, String conversionFraction, Integer drugCategoryId, Integer enterpriseNameId, String tradeName, Integer suppliersid) {
        return drugsInformationDao.selectPurchaseToOrder(purchaseOrderNumber,nameOfPurchaseOrder, purchaseOrdersStatesId,hospitalName,createTime,subTime,commonName,serialNumber,
                dosageFormId,specification,unit,conversionFraction,drugCategoryId,enterpriseNameId,tradeName,suppliersid);
    }
}
