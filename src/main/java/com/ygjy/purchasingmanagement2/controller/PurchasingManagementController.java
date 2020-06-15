package com.ygjy.purchasingmanagement2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 *
 * @outher: Huangdebao
 * @Date: 2020/6/8 0008 下午 2:00
 * Desc: 描述
 */
@Controller
public class PurchasingManagementController {

    /*
     *跳转到主页面单页面
     */
    @RequestMapping("/purchasing_management_index")
    public String purchasingManagementIndex() {
        return "purchasingmanagement2/purchasing_management_index";
    }

    /*
     *跳转到退货单页面
     */
    @RequestMapping("/purchasing_management_return_form")
    public String purchasingManagementReturnForm() {
        return "purchasingmanagement2/purchasin_management_return_form";
    }

    /*
     *跳转到添加退货药品页面
     */
    @RequestMapping("/purchasin_management_add_returned_drugs")
    public String purchasinManagementSettlementManagement() {
        return "purchasingmanagement2/purchasin_management_add_returned_drugs";
    }

    /*
     *跳转到退货单维护页面
     */
    @RequestMapping("/purchasin_management_return_drug")
    public String purchasinManagementReturnDrug() {
        return "purchasingmanagement2/purchasin_management_return_drug";
    }

    /*
     *跳转到添加结单页面
     */
    @RequestMapping("/purchasing_management_add_statement")
    public String purchasingManagementAddStatement() {
        return "purchasingmanagement2/purchasing_management_add_statement";
    }

    /*
     *跳转到添加结算药品页面
     */
    @RequestMapping("/purchasin_management_add_settlement_medicine")
    public String purchasinManagementAddSettlementMedicine() {
        return "purchasingmanagement2/purchasin_management_add_settlement_medicine";
    }


    /*
     *跳转到添加结算单维护页面
     */
    @RequestMapping("/purchasing_management_settlement_doc_maintenance")
    public String purchasingManagementSettlementDocMaintenance() {
        return "purchasingmanagement2/purchasin_management_settlement_doc_maintenance";
    }
}
