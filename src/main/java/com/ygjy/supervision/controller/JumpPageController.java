package com.ygjy.supervision.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JumpPageController {
    @RequestMapping("/supervisionIndex")
    public String supervisionIndex(){
        return "supervision/supervision_index";
    }
    /*
    * 跳转到药品品目维护页面
    * */
    @RequestMapping("/drug_item_maintenance")
    public String drugItemMaintenance(){
        return "supervision/drug_item_maintenance";
    }

    /*
    * 跳转到药品信息维护页面
    * */
    @RequestMapping("/drug_information_maintenance")
    public String drugInformationMaintenance(){
        return "supervision/drug_information_maintenance";
    }

    /*
     * 跳转到采购单审核页面
     * */
    @RequestMapping("/purchase_order_approval")
    public String purchaseOrderApproval(){
        return "supervision/purchase_order_approval";
    }

    /*
     * 跳转到供货审核页面
     * */
    @RequestMapping("/supplier_audit")
    public String supplierAudit(){
        return "supervision/supplier_audit";
    }

    /*
     * 跳转到采购单查询页面
     * */
    @RequestMapping("/purchase_order_enquiry")
    public String purchaseOrderEnquiry(){
        return "supervision/purchase_order_enquiry";
    }

    /*
     * 跳转到供货商查询页面
     * */
    @RequestMapping("/supplier_enquiry")
    public String supplierEnquiry(){
        return "supervision/supplier_enquiry";
    }

    /*
     * 跳转到医院查询页面
     * */
    @RequestMapping("/hospital_equery")
    public String hospitalEquery(){
        return "supervision/hospital_equery";
    }

    /*
     * 跳转到交易药品查询页面
     * */
    @RequestMapping("/drug_trading_enquiry")
    public String drugTradingEnquiry(){
        return "supervision/drug_trading_enquiry";
    }

    /*
     * 跳转到交易药品查询页面
     * */
    @RequestMapping("/drug_transaction_details_equery")
    public String drugTransactionDetailsEquery(){
        return "supervision/drug_transaction_details_equery";
    }
}
