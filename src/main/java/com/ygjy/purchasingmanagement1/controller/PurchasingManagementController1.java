package com.ygjy.purchasingmanagement1.controller;

import com.ygjy.purchasingmanagement1.pojo.DrugInformation;
import com.ygjy.purchasingmanagement1.service.impl.DrugInformationImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PurchasingManagementController1 {

    @Autowired
    DrugInformationImpl drugInformationImpl;

    @ResponseBody
    @RequestMapping("/selectAll")//查询所有
    public List<DrugInformation> selectAll() {
        List<DrugInformation> drugInformations = drugInformationImpl.selectAll();
        return drugInformations;
    }

    @ResponseBody
    @RequestMapping("/selectLike")//模糊查询
    public List<DrugInformation> selectLike(Integer serialNumber, String commonName, Integer dosageFormId, String specification, String unit, String conversionFraction, String enterpriseName, String tradeName, Double biddingPrice, Integer qualityLevelId, String drugCategory, Integer drugTransactionStatusId) {
        List<DrugInformation> drugInformations = drugInformationImpl.selectLike(serialNumber, commonName, dosageFormId, specification, unit, conversionFraction, enterpriseName, tradeName, biddingPrice, qualityLevelId, drugCategory, drugTransactionStatusId);
        return drugInformations;
    }

    @ResponseBody
    @RequestMapping("/add")//添加药品
    public int addDrug(DrugInformation drugInformation) {
        int i = drugInformationImpl.addDrug(drugInformation);
        return i;
    }

    @ResponseBody
    @RequestMapping("/selectBySerialNumber")//流水号查询
    public DrugInformation selectBySerialNumber(Integer serialNumber){
        DrugInformation drugInformation = drugInformationImpl.selectBySerialNumber(serialNumber);
        return drugInformation;
    }

    @ResponseBody
    @RequestMapping("/updateDrug")//药品修改
    public int  updateDrug(DrugInformation drugInformation){
        int i = drugInformationImpl.updateDrug(drugInformation);
        return i;
    }
    @ResponseBody
    @RequestMapping("/deleteDrug")//药品删除
    public int deleteDrug(Integer id){
        int i = drugInformationImpl.deleteDrug(id);
        return i;
    }



































    /**
     *
     * @return  采购管理主页面
     */
    @RequestMapping("/purchasing_management_index1")
    public String purchasingManagementIndex1() {
        return "purchasingmanagement1/purchasing_management_index1";
    }

    /**
     *
     * @return 药品品目管理页面
     */
    @RequestMapping("/drug_item_maintenance1")
    public String drugItemMaintenance1(){
        return "purchasingmanagement1/drug_item_maintenance1";
    }

    /**
     *
     * @return 药品信息管理页面
     */
    @RequestMapping("/drug_information_maintenance1")
    public String drugInformationMaintenance1(){
        return "purchasingmanagement1/drug_information_maintenance1";
    }

    /**
     *
     * @return  采购单审核页面
     */
    @RequestMapping("/purchase_order_approval1")
    public String purchaseOrderApproval1(){
        return "purchasingmanagement1/purchase_order_approval1";
    }

    /**
     *
     * @return  选择采购药品页面
     */
    @RequestMapping("/purchase_drug_selection1")
    public String purchaseDrugSelection1(){
        return "purchasingmanagement1/purchase_drug_selection1";
    }

    /**
     *
     * @return  采购目录维护页面
     */
    @RequestMapping("/purchase_directory_maintenance1")
    public String purchaseDirectoryMaintenance1(){
        return "purchasingmanagement1/purchase_directory_maintenance1";
    }

    /**
     *
     * @return  采购单维护页面
     */
    @RequestMapping("/po_maintenance1")
    public String poMaintenance1(){
        return "purchasingmanagement1/po_maintenance1";
    }

    /**
     *
     * @return  采购药品查询页面
     */
    @RequestMapping("/purchase_drug_inquiry1")
    public String purchaseDrugInquiry1(){
        return "purchasingmanagement1/purchase_drug_inquiry1";
    }

    /**
     *
     * @return  采购入库页面
     */
    @RequestMapping("/purchase_receipt1")
    public String purchaseReceipt1(){
        return "purchasingmanagement1/purchase_receipt1";
    }
}
