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
     *跳转到结算管理页面
     */
    @RequestMapping("/purchasin_management_settlement_management")
    public String purchasinManagementSettlementManagement() {
        return "purchasingmanagement2/purchasin_management_settlement_management";
    }

    /*
     *跳转到退货药品页面
     */
    @RequestMapping("/purchasin_management_return_drug")
    public String purchasinManagementReturnDrug() {
        return "purchasingmanagement2/purchasin_management_return_drug";
    }

    /*
     *跳转到结算药品页面
     */
    @RequestMapping("/purchasing_management_add_statement")
    public String purchasingManagementAddStatement() {
        return "purchasingmanagement2/purchasing_management_add_statement";
    }
}
