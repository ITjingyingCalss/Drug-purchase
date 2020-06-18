package com.ygjy.supervision.controller;

import com.github.pagehelper.PageInfo;
import com.ygjy.pojo.PurchaseOrder;
import com.ygjy.supervision.service.DrugTransactionDetailsEqueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/DrugTransactionDetailsEqueryController")
public class DrugTransactionDetailsEqueryController {
    @Autowired private DrugTransactionDetailsEqueryService drugTransactionDetailsEqueryServiceImpl;
    /*
    * 查询所有药品交易明细
    * return PageInfo*/
    @RequestMapping("findAllDetailsEquery")
    public PageInfo findAllDetailsEquery(@RequestParam("pageNum") Integer pageNum){
        System.err.println(pageNum);
        return drugTransactionDetailsEqueryServiceImpl.findAllDetailsEquery(pageNum);
    }
    /*
    * 查询所有采购单
    * return Map*/
    @RequestMapping("findAllPurchaseOrder")
    public Map findAllPurchaseOrder(){
        return drugTransactionDetailsEqueryServiceImpl.findAllPurchaseOrder();
    }
}
