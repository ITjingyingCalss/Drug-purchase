package com.ygjy.purchasingmanagement1.controller;

import com.ygjy.purchasingmanagement1.pojo.PurchaseOrder;
import com.ygjy.purchasingmanagement1.service.impl.PurchaseOrderImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PurchaseOrderController1 {

    @Autowired
    PurchaseOrderImpl purchaseOrderImpl;

    @ResponseBody
    @RequestMapping("/selectPurchaseOrderAll")
    public List<PurchaseOrder> selectPurchaseOrder(){
        List<PurchaseOrder> purchaseOrders = purchaseOrderImpl.selectPurchaseOrder();
        return purchaseOrders;
    }

    @ResponseBody
    @RequestMapping("/selectOne")
    public PurchaseOrder selectOne(Integer id){
        PurchaseOrder purchaseOrder = purchaseOrderImpl.selectOne(id);
        return purchaseOrder;
    }

    @ResponseBody
    @RequestMapping("updatePurchaseOrder")
    public int updatePurchaseOrder(PurchaseOrder purchaseOrder){
        int i = purchaseOrderImpl.updatePurchaseOrder(purchaseOrder);
        return i;
    }

    @ResponseBody
    @RequestMapping("deletePurchaseOrder")
    public int deletePurchaseOrder(Integer id){
        int i = purchaseOrderImpl.deletePurchaseOrder(id);
        return i;
    }







}
