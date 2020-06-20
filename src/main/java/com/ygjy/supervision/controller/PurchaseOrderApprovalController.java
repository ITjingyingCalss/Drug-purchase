package com.ygjy.supervision.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ygjy.pojo.PurchaseOrder;
import com.ygjy.purchasingmanagement1.service.PurchaseOrderService;
import com.ygjy.supervision.service.PurchaseOrderApprovalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("PurchaseOrderApprovalController")
public class PurchaseOrderApprovalController {
    @Autowired private PurchaseOrderApprovalService purchaseOrderApprovalServiceImpl;

    @RequestMapping("findAllPurchaseOrder")
    public PageInfo findAllPurchaseOrder(PurchaseOrder purchaseOrder,String procurementStartTime,String procurementEndTime,Integer pageNum){
        PageHelper.startPage(pageNum,5);
        List<PurchaseOrder> purchaseOrderList = purchaseOrderApprovalServiceImpl.findAllPurchaseOrder(purchaseOrder, procurementStartTime, procurementEndTime);
        return new PageInfo(purchaseOrderList);
    }
    @RequestMapping("findHospitalAndPurchaseOrderStatus")
    public Map findHospitalAndPurchaseOrderStatus(){
        return purchaseOrderApprovalServiceImpl.findHospitalAndPurchaseOrderStatus();
    }
    //提交审核结果
    @RequestMapping("submitAuditResults")
    public Integer submitAuditResults(@RequestParam("ids[]") List<Integer> ids,@RequestParam("purchaseStateS[]")List<Integer> purchaseStateS,@RequestParam("auditOpinionS[]")List<String> auditOpinionS){
        /*System.err.println(auditOpinionS);
        System.err.println(purchaseStateS);*/
        return purchaseOrderApprovalServiceImpl.submitAuditResults(ids,purchaseStateS,auditOpinionS);
    }
    @RequestMapping("findOne")
    public PurchaseOrder findOne(@RequestParam("id")Integer id){
        return purchaseOrderApprovalServiceImpl.findOne(id);
    }
}
