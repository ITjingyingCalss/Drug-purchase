package com.ygjy.supervision.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ygjy.pojo.*;
import com.ygjy.purchasingmanagement1.pojo.DrugInformation2;
import com.ygjy.purchasingmanagement1.service.DrugInformationService;
import com.ygjy.supervision.service.DrugInformationMaintenanceService;
import com.ygjy.supervision.service.DrugItemMaintenanceService;
import com.ygjy.supervision.service.DrugTransactionDetailsEqueryService;
import com.ygjy.supervision.service.PurchaseOrderApprovalService;
import com.ygjy.supervision.vo.HospitalTransactionDetailsVO;
import com.ygjy.util.ExportExcel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/DrugTransactionDetailsEqueryController")
public class DrugTransactionDetailsEqueryController {
    @Autowired private DrugTransactionDetailsEqueryService drugTransactionDetailsEqueryServiceImpl;
    @Autowired private PurchaseOrderApprovalService purchaseOrderApprovalService;
    @Autowired private DrugItemMaintenanceService drugItemMaintenanceService;
    @Autowired private DrugInformationMaintenanceService drugInformationMaintenanceService;
    /*
    * 查询所有药品交易明细
    * return PageInfo*/
    @RequestMapping("findAllDetailsEquery")
    public PageInfo findAllDetailsEquery(DrugInformation drugInformation, Integer pageNum,PurchaseOrder purchaseOrder,String procurementStartTime,String procurementEndTime){
        /*System.err.println(pageNum);
        System.err.println(drugInformation);
        System.err.println(purchaseOrder);*/
        PageHelper.startPage(pageNum,5);
        List<HospitalTransactionDetails> list = drugTransactionDetailsEqueryServiceImpl.findAllDetailsEquery(drugInformation, purchaseOrder, procurementStartTime, procurementEndTime);
        return new PageInfo(list);
    }
    /*
    * 查询所有采购单
    * return Map*/
    @RequestMapping("findAllPurchaseOrder")
    public Map findAllPurchaseOrder(){
        return drugTransactionDetailsEqueryServiceImpl.findAllPurchaseOrder();
    }
    /*
    * 导出按交易查询信息
    */
    @RequestMapping("exportHospitalTransactionDetailsExcle")
    public void exportHospitalTransactionDetailsExcle(HttpServletResponse response, DrugInformation drugInformation, PurchaseOrder purchaseOrder, String procurementStartTime, String procurementEndTime) throws IOException {
        List<HospitalTransactionDetailsVO> hospitalTransactionDetailsVOList = new ArrayList<>();
        //查询出相关关联表，剂型表，企业表，医院表，采购状态表，质量层次表，
        List<HospitalTransactionDetails> list = drugTransactionDetailsEqueryServiceImpl.findAllDetailsEquery(drugInformation, purchaseOrder, procurementStartTime, procurementEndTime);
        List<DrugInformation> drugInformationList = drugInformationMaintenanceService.findAllDrugInformation(drugInformation, null, null);
        List<PurchaseOrder> purchaseOrderList = purchaseOrderApprovalService.findAllPurchaseOrder(purchaseOrder, procurementStartTime, procurementEndTime);
        Map map = purchaseOrderApprovalService.findHospitalAndPurchaseOrderStatus();
        Map map1 = drugItemMaintenanceService.findDrugFromAndDrugCategory();
        Map map2 = drugInformationMaintenanceService.findQualityLevelAndDrugTradingStatus();
        Map map3 = drugTransactionDetailsEqueryServiceImpl.findAllPurchaseOrder();
        List<Enterprise> enterpriseList = drugInformationMaintenanceService.findAllEnterprise();

        List<Hospital> hospitalList = (List<Hospital>) map.get("hospitalList");
        List<DurgsFrom> listDurgsFrom = (List<DurgsFrom>) map1.get("list_durgsFrom");
        List<QualityLevel> qualityLevelList = (List<QualityLevel>) map2.get("list_qualityLevel");
        List<PurchaseStatus> purchaseStatusList = (List<PurchaseStatus>) map3.get("purchaseStatusList");
        //将数据库数据存到VO类
        for (HospitalTransactionDetails hospitalTransactionDetails: list) {
            HospitalTransactionDetailsVO hospitalTransactionDetailsVO = new HospitalTransactionDetailsVO();
            hospitalTransactionDetailsVO.setId(hospitalTransactionDetails.getInvoiceNumber());
            for (PurchaseOrder purchaseOrder1: purchaseOrderList) {
                if (hospitalTransactionDetails.getPurchaseOrdersId()==purchaseOrder1.getId()){
                    for (Hospital hospital: hospitalList) {
                        if (purchaseOrder1.getHospitalId()==hospital.getId()){
                            hospitalTransactionDetailsVO.setHospitalId(hospital.getHospitalName());
                            break;
                        }
                    }
                    hospitalTransactionDetailsVO.setPurchaseOrderNumber(purchaseOrder1.getPurchaseOrderNumber());
                    hospitalTransactionDetailsVO.setNameOfPurchaseOrder(purchaseOrder1.getNameOfPurchaseOrder());
                    SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
                    Date startDate = purchaseOrder1.getStartTime();
                    Date endDate = purchaseOrder1.getEndTime();
                    String startTime = ft.format(startDate);
                    String endTime = ft.format(endDate);
                    hospitalTransactionDetailsVO.setStartTime(startTime);
                    hospitalTransactionDetailsVO.setEndTime(endTime);
                }
            }
            for (DrugInformation drugInformation1:drugInformationList) {
                if (hospitalTransactionDetails.getDrugInformationId()==drugInformation1.getId()){
                    hospitalTransactionDetailsVO.setSerialNumber(drugInformation1.getSerialNumber());
                    hospitalTransactionDetailsVO.setCommonName(drugInformation1.getCommonName());
                    hospitalTransactionDetailsVO.setTradeName(drugInformation1.getTradeName());
                    for (DurgsFrom durgsFrom: listDurgsFrom) {
                        if (drugInformation1.getDosageFormId() == durgsFrom.getDurgFromId()){
                            hospitalTransactionDetailsVO.setDosageFormId(durgsFrom.getDrugFrom());
                            break;
                        }
                    }
                    hospitalTransactionDetailsVO.setSpecification(drugInformation1.getSpecification());
                    hospitalTransactionDetailsVO.setUnit(drugInformation1.getUnit());
                    hospitalTransactionDetailsVO.setConversionFraction(drugInformation1.getConversionFraction());
                    for (QualityLevel qualityLevel:qualityLevelList) {
                        if (drugInformation1.getQualityLevelId() == qualityLevel.getQuaId()){
                            hospitalTransactionDetailsVO.setQualityLevelId(qualityLevel.getLevel());
                            break;
                        }
                    }
                }
            }
            for (Enterprise enterprise: enterpriseList) {
                if (hospitalTransactionDetails.getEnterpriseId() == enterprise.getId()){
                    hospitalTransactionDetailsVO.setEnterpriseId(enterprise.getEnterpriseName());
                }
            }
            hospitalTransactionDetailsVO.setBiddingPrice(hospitalTransactionDetails.getBiddingPrice());
            hospitalTransactionDetailsVO.setTransactionPrice(hospitalTransactionDetails.getTransactionPrice());
            hospitalTransactionDetailsVO.setPurchasedAmount(hospitalTransactionDetails.getPurchasedAmount());
            hospitalTransactionDetailsVO.setPurchasedMoney(hospitalTransactionDetails.getPurchasedMoney());
            for (PurchaseStatus purchaseStatus: purchaseStatusList) {
                if (hospitalTransactionDetails.getPurchasedState() == purchaseStatus.getId()){
                    hospitalTransactionDetailsVO.setPurchasedState(purchaseStatus.getPurchasedExplain());
                }
            }
            hospitalTransactionDetailsVO.setReceiptAmount(hospitalTransactionDetails.getReceiptAmount());
            hospitalTransactionDetailsVO.setReceiptMoney(hospitalTransactionDetails.getReceiptMoney());

            hospitalTransactionDetailsVOList.add(hospitalTransactionDetailsVO);
        }
        String fileName = "查询药品交易明细表"+System.currentTimeMillis()+".xls";
        fileName= URLEncoder.encode(fileName,"utf-8");
        String[] headers = {"序号","采购医院","采购单编号","采购单名称","开始采购时间","结束采购时间","流水号","通用名","商品名称","剂型","规格","单位","转换系数","质量层次","生产企业","中标价","交易价","采购量","采购金额","采购状态","入库量","入库金额"};
        response.setContentType("application/octet-stream;charset=utf-8");
        response.setHeader("Content-Disposition", "attachment;filename="+ fileName);
        OutputStream out = response.getOutputStream();
        ExportExcel exportExcel = new ExportExcel();
        exportExcel.exportExcel("查询药品交易明细表",headers,hospitalTransactionDetailsVOList,out,null);

    }
}
