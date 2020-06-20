package com.ygjy.supervision.controller;

import com.ygjy.pojo.*;
import com.ygjy.supervision.service.DrugInformationMaintenanceService;
import com.ygjy.supervision.service.DrugItemMaintenanceService;
import com.ygjy.supervision.service.DrugTransactionDetailsEqueryService;
import com.ygjy.supervision.vo.DrugTradeQueryVO;
import com.ygjy.util.ExportExcel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/DrugTradingEnquiryController")
public class DrugTradingEnquiryController {
    @Autowired private DrugInformationMaintenanceService drugInformationMaintenanceService;
    @Autowired private DrugTransactionDetailsEqueryService drugTransactionDetailsEqueryServiceImpl;
    @Autowired private DrugItemMaintenanceService drugItemMaintenanceService;

    @RequestMapping("downloadDrugTradeQuery")
    public void downloadDrugTradeQuery(HttpServletResponse response, DrugInformation drugInformation, PurchaseOrder purchaseOrder, String procurementStartTime, String procurementEndTime) throws IOException {
        List<DrugTradeQueryVO> drugTradeQueryVOList = new ArrayList<>();
        //查询出相关关联表，剂型表，企业表，医院表，采购状态表，质量层次表，
        List<HospitalTransactionDetails> list = drugTransactionDetailsEqueryServiceImpl.findAllDetailsEquery(drugInformation, purchaseOrder, procurementStartTime, procurementEndTime);
        List<DrugInformation> drugInformationList = drugInformationMaintenanceService.findAllDrugInformation(drugInformation, null, null);
        Map map1 = drugItemMaintenanceService.findDrugFromAndDrugCategory();
        Map map2 = drugInformationMaintenanceService.findQualityLevelAndDrugTradingStatus();
        List<Enterprise> enterpriseList = drugInformationMaintenanceService.findAllEnterprise();
        Map map3 = drugTransactionDetailsEqueryServiceImpl.findAllPurchaseOrder();

        List<DurgsFrom> listDurgsFrom = (List<DurgsFrom>) map1.get("list_durgsFrom");
        List<QualityLevel> qualityLevelList = (List<QualityLevel>) map2.get("list_qualityLevel");
        List<PurchaseStatus> purchaseStatusList = (List<PurchaseStatus>) map3.get("purchaseStatusList");
        //将数据库数据存到VO类
        for (HospitalTransactionDetails hospitalTransactionDetails: list) {
            DrugTradeQueryVO drugTradeQueryVO = new DrugTradeQueryVO();
            drugTradeQueryVO.setId(hospitalTransactionDetails.getInvoiceNumber());
            drugTradeQueryVO.setReceiptAmount(hospitalTransactionDetails.getReceiptAmount());
            drugTradeQueryVO.setReceiptMoney(hospitalTransactionDetails.getReceiptMoney());
            for (DrugInformation drugInformation1:drugInformationList) {
                if (hospitalTransactionDetails.getDrugInformationId()==drugInformation1.getId()){
                    drugTradeQueryVO.setSerialNumber(drugInformation1.getSerialNumber());
                    drugTradeQueryVO.setCommonName(drugInformation1.getCommonName());
                    drugTradeQueryVO.setTradeName(drugInformation1.getTradeName());
                    for (DurgsFrom durgsFrom: listDurgsFrom) {
                        if (drugInformation1.getDosageFormId() == durgsFrom.getDurgFromId()){
                            drugTradeQueryVO.setDosageFormId(durgsFrom.getDrugFrom());
                            break;
                        }
                    }
                    drugTradeQueryVO.setSpecification(drugInformation1.getSpecification());
                    drugTradeQueryVO.setUnit(drugInformation1.getUnit());
                    drugTradeQueryVO.setConversionFraction(drugInformation1.getConversionFraction());
                    for (QualityLevel qualityLevel:qualityLevelList) {
                        if (drugInformation1.getQualityLevelId() == qualityLevel.getQuaId()){
                            drugTradeQueryVO.setQualityLevelId(qualityLevel.getLevel());
                            break;
                        }
                    }
                }
            }
            for (Enterprise enterprise: enterpriseList) {
                if (hospitalTransactionDetails.getEnterpriseId() == enterprise.getId()){
                    drugTradeQueryVO.setEnterpriseId(enterprise.getEnterpriseName());
                }
            }
            drugTradeQueryVO.setPurchasedAmount(hospitalTransactionDetails.getPurchasedAmount());
            drugTradeQueryVO.setPurchasedMoney(hospitalTransactionDetails.getPurchasedMoney());
            for (PurchaseStatus purchaseStatus: purchaseStatusList) {
                if (hospitalTransactionDetails.getPurchasedState() == purchaseStatus.getId()){
                    drugTradeQueryVO.setPurchasedState(purchaseStatus.getPurchasedExplain());
                }
            }
            drugTradeQueryVO.setReceiptAmount(hospitalTransactionDetails.getReceiptAmount());
            drugTradeQueryVO.setReceiptMoney(hospitalTransactionDetails.getReceiptMoney());
            drugTradeQueryVOList.add(drugTradeQueryVO);
        }
        String fileName = "按药品交易明细查询表"+System.currentTimeMillis()+".xls";
        fileName= URLEncoder.encode(fileName,"utf-8");
        String[] headers = {"序号","流水号","通用名","商品名称","剂型","规格","单位","转换系数","质量层次","生产企业","采购量","采购金额","采购状态","入库量","入库金额","退货量","退货金额"};
        response.setContentType("application/octet-stream;charset=utf-8");
        response.setHeader("Content-Disposition", "attachment;filename="+ fileName);
        OutputStream out = response.getOutputStream();
        ExportExcel exportExcel = new ExportExcel();
        exportExcel.exportExcel("按药品交易明细查询表",headers,drugTradeQueryVOList,out,null);

    }
}
