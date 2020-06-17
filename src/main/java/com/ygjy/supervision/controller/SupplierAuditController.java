package com.ygjy.supervision.controller;

import com.github.pagehelper.PageInfo;
import com.ygjy.pojo.DrugInformation;
import com.ygjy.pojo.Suppliers;
import com.ygjy.supervision.service.SupplierAuditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("supplierAuditController")
public class SupplierAuditController {
    @Autowired private SupplierAuditService supplierAuditServiceimpl;
    @RequestMapping("submitAuditResults")
    public Integer submitAuditResults(@RequestParam("ids[]") List<Integer> ids, @RequestParam("purchaseStateS[]")List<Integer> purchaseStateS){
        /*System.err.println(auditOpinionS);
        System.err.println(purchaseStateS);*/
        return supplierAuditServiceimpl.submitAuditResults(ids,purchaseStateS);
    }
}
