package com.ygjy.purchasingmanagement2.service.Impl;


import com.ygjy.purchasingmanagement2.dao.HospitalTransactionStatementDao;
import com.ygjy.purchasingmanagement2.pojo.*;
import com.ygjy.purchasingmanagement2.service.HospitalTransactionStatementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @outher: Huangdebao
 * @Date: 2020/6/9 0009 下午 2:10
 * Desc: 添加退货单
 */
@Service
public class HospitalTransactionStatementServiceImpl implements HospitalTransactionStatementService {

    @Autowired
    HospitalTransactionStatementDao hospitalTransactionStatementDao;

    /*添加退货单*/
    @Override
    public int insert(HospitalTransactionStatement hosp) {

        return hospitalTransactionStatementDao.insert(hosp);
    }

    /*查询全部到页面*/
    /*@Override
    public List<HospitalTransactionStatement> list(HospitalTransactionStatement htrList) {

        return hospitalTransactionStatementDao.list(htrList);
    }*/

    /*修改回显*/
    @Override
    public HospitalTransactionStatement htrSee(Integer id) {

        return hospitalTransactionStatementDao.htrSee(id);

    }

    /*更新*/
    @Override
    public int update1(HospitalTransactionStatement htr) {

        return hospitalTransactionStatementDao.update1(htr);
    }

    @Override
    public boolean removeByKeys(String[] ids) {


        int result=hospitalTransactionStatementDao.deleteByKeys(ids);
        if (result>0) {
            return true;
        } else {
            return false;
        }

    }

    /*查询所有*/
    @Override
    public List<HospitalTransactionStatement> selList(String statementNumber,
                                                      String statementName,
                                                      Integer statementStateId,
                                                      String contacts,
                                                      String phone,
                                                      String creatReceiptsPerson,
                                                      String createReceiptsTime,
                                                      String submissionTime,
                                                      String remark,
                                                      Integer hospitalId) {
        return hospitalTransactionStatementDao.selList(statementNumber,statementName, contacts, phone, creatReceiptsPerson, createReceiptsTime, submissionTime,remark,hospitalId, statementStateId);
    }


    @Override
    public List<HospitalTransactionStatement> exportAlls(HospitalTransactionStatement hospital) {

        return hospitalTransactionStatementDao.exportAlls(hospital);
    }


    /*结算单维护*/
    /*退货药品查询*/
    @Override
    public List<HospitalTransactionDetails> seletedrugs2(String purchaseOrderNumber, String nameOfPurchaseOrder, String supplierName, String drugCategoryName, String serialNumber, String commonName, String drugFrom, String specification, String unit, String conversionFraction, String tradeName, String level, Date createReceiptsTime, Date submissionTime, String drugBatchNumber, String returnOfState, String enterpriseName, String InvoiceNumber) {
        return hospitalTransactionStatementDao.seletedrugs2(purchaseOrderNumber,
                nameOfPurchaseOrder, supplierName,drugCategoryName,
                serialNumber, commonName,drugFrom, specification,
                unit, conversionFraction,tradeName, level,
                createReceiptsTime, submissionTime,drugBatchNumber,
                returnOfState, enterpriseName, InvoiceNumber);
    }

    /**
     * 剂型表
     * @return
     */
    @Override
    public List<DurgsFrom> seleDatafrom2() {
        return hospitalTransactionStatementDao.seleDatafrom2();
    }

    /**
     * 药品类别表
     */
    @Override
    public List<DrugCategory> seleDrugCategory2() {
        return hospitalTransactionStatementDao.seleDrugCategory2();
    }

    /**
     * 质量层次表
     */
    @Override
    public List<QualityLevel> selequalityLevel2() {
        return hospitalTransactionStatementDao.selequalityLevel2();
    }

    /*
     * 供货商表
     **/
    @Override
    public List<Suppliers> selesuppliers2() {
        return hospitalTransactionStatementDao.selesuppliers2();
    }

    /*退货单维护页面批量删除*/
    @Override
    public Boolean deleteByKeyss2(String[] ids) {

        int result=hospitalTransactionStatementDao.deleteByKeyss2(ids);
        if (result>0) {
            return true;
        } else {
            return false;
        }

    }
    /*查看*/
    @Override
    public HospitalTransactionDetails htd(Integer id) {
        return hospitalTransactionStatementDao.htd(id);
    }

}
