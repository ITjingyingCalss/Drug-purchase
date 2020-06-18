package com.ygjy.supplymanagement.controller;

import com.ygjy.supplymanagement.pojo.*;
import com.ygjy.supplymanagement.service.DrugsInformationService;
import com.ygjy.supplymanagement.utils.Execel;
import com.ygjy.systemmanagement.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: 赵林
 * @Date: 2020/6/17 9:26
 * @Description:
 */
@Controller
@RequestMapping("/user")
public class UserController{
    @Autowired
    private DrugsInformationService drugsInformationService;

    @RequestMapping(value="/upload",method = RequestMethod.POST)
    @ResponseBody
    public Integer  upload(@RequestParam(value="file",required = false)MultipartFile file, HttpServletRequest request, HttpServletResponse response){
        List<DrugInformation> list1=null;
        Integer result=0;
        try {
            List<String[]> list=Execel.readExcel(file);
          list1=new ArrayList<>();
            for (int i = 1; i < list.size(); i++) {
                String[] strings=list.get(i);
                if(strings.length<=2)continue;
                DrugInformation drugInformation=new DrugInformation();
                drugInformation.setPurchaseOrder(new PurchaseOrder());
                drugInformation.setHospital(new Hospital());
                drugInformation.setPurchaseOrderDrugDetails(new PurchaseOrderDrugDetails());
                drugInformation.getPurchaseOrder().setPurchaseOrderNumber(strings[0]);
                drugInformation.getPurchaseOrder().setNameOfPurchaseOrder(strings[1]);
                drugInformation.setSerialNumber(strings[2]);
                drugInformation.setCommonName(strings[3]);
                drugInformation.setTradeName(strings[4]);
                drugInformation.setDosageFormId(Integer.parseInt(strings[5]));
                drugInformation.setSpecification(strings[6]);
                drugInformation.setUnit(strings[7]);
                drugInformation.setConversionFraction(strings[8]);
                drugInformation.setEnterpriseNameId(Integer.parseInt(strings[9]));
                drugInformation.getPurchaseOrderDrugDetails().setBiddingPrice(Float.parseFloat(strings[10]));
                drugInformation.getPurchaseOrderDrugDetails().setTransactionPrice(Float.parseFloat(strings[11]));
                drugInformation.getPurchaseOrderDrugDetails().setPurchasedAmount(Integer.parseInt(strings[12]));
                drugInformation.getPurchaseOrderDrugDetails().setPurchasedMoney(Float.parseFloat(strings[13]));
                drugInformation.getHospital().setHospitalName(strings[14]);
                list1.add(drugInformation);
            }
            PurchaseOrder purchaseOrder = new PurchaseOrder();
            DrugInformation drugInformation= new DrugInformation();
            PurchaseOrderDrugDetails purchaseOrderDrugDetails=new PurchaseOrderDrugDetails();
            Hospital hospital = new Hospital();
            HospitalTransactionDetails hospitalTransactionDetails = new HospitalTransactionDetails();
            for(int j=0;j<list1.size();j++){
//                药品信息添加
                drugInformation.setSerialNumber(list1.get(j).getSerialNumber());
                drugInformation.setCommonName(list1.get(j).getCommonName());
                drugInformation.setTradeName(list1.get(j).getTradeName());
                drugInformation.setDosageFormId(list1.get(j).getDosageFormId());
                drugInformation.setSpecification(list1.get(j).getSpecification());
                drugInformation.setUnit(list1.get(j).getUnit());
                drugInformation.setConversionFraction(list1.get(j).getConversionFraction());
                drugInformation.setEnterpriseNameId(list1.get(j).getEnterpriseNameId());
                drugInformation.setDrugInspectionReport(2);

                int r2=drugsInformationService.insertDruginformation(drugInformation);
                //医院添加
                hospital.setHospitalName(list1.get(j).getHospital().getHospitalName());
                int h5=drugsInformationService.insertHospitalName(hospital);
                //采购单添加
                purchaseOrder.setHospitalId(hospital.getId());
                purchaseOrder.setPurchaseOrderNumber(list1.get(j).getPurchaseOrder().getPurchaseOrderNumber());
                purchaseOrder.setNameOfPurchaseOrder(list1.get(j).getPurchaseOrder().getNameOfPurchaseOrder());
                purchaseOrder.setPurchaseState(2);
                int r1=drugsInformationService.insertPurchaseorder(purchaseOrder);
                // 采购单药品明细添加
                purchaseOrderDrugDetails.setBiddingPrice(list1.get(j).getPurchaseOrderDrugDetails().getBiddingPrice());
                purchaseOrderDrugDetails.setTransactionPrice(list1.get(j).getPurchaseOrderDrugDetails().getTransactionPrice());
                purchaseOrderDrugDetails.setPurchasedAmount(list1.get(j).getPurchaseOrderDrugDetails().getPurchasedAmount());
                purchaseOrderDrugDetails.setPurchasedMoney(list1.get(j).getPurchaseOrderDrugDetails().getPurchasedMoney());
                purchaseOrderDrugDetails.setPurchaseOrderId(purchaseOrder.getId());
                purchaseOrderDrugDetails.setDrugInformationId(drugInformation.getId());
                purchaseOrderDrugDetails.setEnterpriseId(list1.get(j).getEnterpriseNameId());
                System.out.println(list1.get(j).getPurchaseOrderDrugDetails().getBiddingPrice());
                int r3=drugsInformationService.insert(purchaseOrderDrugDetails);
                //医院交易明细添加
                hospitalTransactionDetails.setPurchaseOrdersId(purchaseOrder.getId());
                hospitalTransactionDetails.setDrugInformationId(drugInformation.getId());
                hospitalTransactionDetails.setEnterpriseId(list1.get(j).getEnterpriseNameId());
                int h4=drugsInformationService.insertHospitalTransactionDetail(hospitalTransactionDetails);
                if (r1==1&&r2==1&&r3==1&&h4==1&&h5==1)result++;
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return result;
    }
}