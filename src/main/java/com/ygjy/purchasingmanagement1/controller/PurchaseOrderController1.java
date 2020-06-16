package com.ygjy.purchasingmanagement1.controller;

import com.ygjy.purchasingmanagement1.pojo.PurchaseOrder;
import com.ygjy.purchasingmanagement1.service.impl.PurchaseOrderImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
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
    @RequestMapping("addPurchaseOrder")
    public int addPurchaseOrder(PurchaseOrder purchaseOrder){
        return purchaseOrderImpl.addPurchaseOrder(purchaseOrder);
    }

    @ResponseBody
    @RequestMapping("deletePurchaseOrder")
    public int deletePurchaseOrder(Integer id){
        int i = purchaseOrderImpl.deletePurchaseOrder(id);
        return i;
    }

    @ResponseBody
    @RequestMapping("selectLikePurchaseOrder")
    public List<PurchaseOrder> selectLikePurchaseOrder(String purchaseOrderNumber, String nameOfPurchaseOrder, Integer purchaseState, Date submissionTime, Integer hospitalId){
        List<PurchaseOrder> purchaseOrders = purchaseOrderImpl.selectLikePurchaseOrder(purchaseOrderNumber, nameOfPurchaseOrder, purchaseState, submissionTime, hospitalId);
        return purchaseOrders;
    }
    @InitBinder
    public void initBinder(WebDataBinder binder, WebRequest request) {

        //转换日期
        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));// CustomDateEditor为自定义日期编辑器
    }







}
