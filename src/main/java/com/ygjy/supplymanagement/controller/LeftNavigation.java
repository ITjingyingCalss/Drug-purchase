package com.ygjy.supplymanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: 赵林
 * @Date: 2020/6/5 10:45
 * @Description:
 */
@Controller
public class LeftNavigation {
    /**
     *左侧导航路径
     * @return
     */
    @RequestMapping("/leftnavigation")
    public String leftnavigation() {
        return "supplymanagement/leftnavigation";
    }
    /**
     *药品品目查询路径
     * @return
     */
    @RequestMapping("/drugcategory")
    public String drugcategory() {
        return "supplymanagement/drugcategory";
    }
    /**
     *药品信息查询路径
     * @return
     */
    @RequestMapping("/druginformation")
    public String druginformation() {
        return "supplymanagement/druginformation";
    }
    /**
     *选择供货路径
     * @return
     */
    @RequestMapping("/drugselection")
    public String drugselection() {
        return "supplymanagement/drugselection";
    }
    /**
     *取消供货路径
     * @return
     */
    @RequestMapping("/cancelsupplier")
    public String cancelsupplier() {
        return "supplymanagement/cancelsupplier";
    }
    /**
     *商品信息维护路径
     * @return
     */
    @RequestMapping("/commodityinformationmaintenance")
    public String commodityinformationmaintenance() {
        return "supplymanagement/commodityinformationmaintenance";
    }

    /**
     * 采购单处理路径
     * @return
     */
    @RequestMapping("/purchaseorderprocessing")
    public String purchaseorderprocessing() {
        return "supplymanagement/purchaseorderprocessing";
    }

    /**
     * 按采购单查询路径
     * @return
     */
    @RequestMapping("/purchaseorderquery")
    public String purchaseorderquery() {
        return "supplymanagement/purchaseorderquery";
    }
    /**
     * 按退货商查询
     * @return
     */
    @RequestMapping("/bysupplier")
    public String ysupplier() {
        return "supplymanagement/bysupplier";
    }
    /**
     * 按采购医院查询
     * @return
     */
    @RequestMapping("/bypurchasinghospital")
    public String bypurchasinghospital() {
        return "supplymanagement/bypurchasinghospital";
    }
    /**
     * 按交易药品查询
     * @return
     */
    @RequestMapping("/Inquirybytradingdrugs")
    public String Inquirybytradingdrugs() {
        return "supplymanagement/Inquirybytradingdrugs";
    }
    /**
     * 查询药品交易明细
     * @return
     */
    @RequestMapping("/drugtransactiondetails")
    public String drugtransactiondetails() {
        return "supplymanagement/drugtransactiondetails";
    }
    /**
     * 退货单处理
     * @return
     */
    @RequestMapping("/returnorderprocessing")
    public String returnorderprocessing() {
        return "supplymanagement/returnorderprocessing";
    }
    /**
     * 结算单处理
     * @return
     */
    @RequestMapping("/settlementdocprocessing")
    public String settlementdocprocessing() {
        return "supplymanagement/settlementdocprocessing";
    }
}
