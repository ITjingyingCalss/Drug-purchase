package com.ygjy.supervision.controller;

import com.github.pagehelper.PageInfo;
import com.ygjy.pojo.PurchaseOrder;
import com.ygjy.purchasingmanagement1.service.PurchaseOrderService;
import com.ygjy.supervision.service.PurchaseOrderApprovalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.Map;

@RestController
@RequestMapping("PurchaseOrderApprovalController")
public class PurchaseOrderApprovalController {
    @Autowired private PurchaseOrderApprovalService purchaseOrderApprovalServiceImpl;

    @RequestMapping("findAllPurchaseOrder")
    public PageInfo findAllPurchaseOrder(PurchaseOrder purchaseOrder,String procurementStartTime,String procurementEndTime,Integer pageNum){
        return purchaseOrderApprovalServiceImpl.findAllPurchaseOrder(purchaseOrder,procurementStartTime,procurementEndTime,pageNum);
    }
    @RequestMapping("findHospitalAndPurchaseOrderStatus")
    public Map findHospitalAndPurchaseOrderStatus(){
        return purchaseOrderApprovalServiceImpl.findHospitalAndPurchaseOrderStatus();
    }
}
