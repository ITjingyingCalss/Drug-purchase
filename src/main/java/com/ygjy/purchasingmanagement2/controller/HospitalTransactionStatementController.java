package com.ygjy.purchasingmanagement2.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ygjy.purchasingmanagement2.pojo.*;
import com.ygjy.purchasingmanagement2.service.HospitalTransactionStatementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @outher: Huangdebao
 * @Date: 2020/6/9 0009 下午 2:25
 * Desc: 添加结算单
 */
@Controller
public class HospitalTransactionStatementController {

    @Autowired
    HospitalTransactionStatementService hospitalTransactionStatementService;


    /*添加结算单*/
    @ResponseBody
    @RequestMapping("hospss1")
    public int insert(HospitalTransactionStatement hosp){

/*        HospitalTransactionReturn htr = new HospitalTransactionReturn();
        htr.setCreateReceiptsTime(new Date());
        htr.setSubmissionTime(new Date());*/

        int hosps = hospitalTransactionStatementService.insert(hosp);
        return hosps;
    }

    /*查询所有到页面*/
    @ResponseBody
    @RequestMapping("lists1")
    public List<HospitalTransactionStatement> list(HospitalTransactionStatement htrLis){

        List<HospitalTransactionStatement> list1 = hospitalTransactionStatementService.list(htrLis);

        return list1;
    }

    /*修改回显*/
    @ResponseBody
    @RequestMapping("htrsees1")
    public HospitalTransactionStatement htrSee(Integer id){

        HospitalTransactionStatement htrsee = hospitalTransactionStatementService.htrSee(id);

        return htrsee;
    }

    /*更新*/
    @ResponseBody
    @RequestMapping("updates1")
    public int update1(HospitalTransactionStatement htr){

        int update = hospitalTransactionStatementService.update1(htr);

        return update;

    }

    /*批量删除*/
    @ResponseBody
    @RequestMapping(value="removeByKeys1",produces={"application/json;charset=utf-8"})
    public String removeByKeys(@RequestParam(value = "list[]") String[] list){

        boolean result=hospitalTransactionStatementService.removeByKeys(list);

        return JSON.toJSONString(result);
    }

/*    批量删除
    @ResponseBody
    @RequestMapping(value="removeByKeys",produces={"application/json;charset=utf-8"})
    public String removeByKeys(@RequestParam(value = "list")String list){

        String[] ids=list.split(",");

        boolean result=hospitalTransactionReturnService.removeByKeys(ids);

        return JSON.toJSONString(result);

    }*/


    /*条件查询*/
    @ResponseBody
    @RequestMapping("sele1")
    public List<HospitalTransactionStatement> selList (String statementNumber,String statementName,Integer hospitalId,Integer statementStateId){

        List<HospitalTransactionStatement> select = hospitalTransactionStatementService.selList(statementNumber,statementName,hospitalId,statementStateId);

        return select;

    }



/*退货单维护*/
    /*退货药品查询*/
   @RequestMapping(value = "seleteSettlement" ,produces = "application/json;charset=utf-8")
    public String seletedrugs2(String purchaseOrderNumber,
                              String nameOfPurchaseOrder,
                              String supplierName,
                              String drugCategoryName,
                              String serialNumber,
                              String commonName,
                              String drugFrom,
                              String specification,
                              String unit,
                              String conversionFraction,
                              String tradeName,
                              String level,
                              @DateTimeFormat(pattern = "yyyy-MM-dd") Date createReceiptsTime,
                              @DateTimeFormat(pattern = "yyyy-MM-dd") Date submissionTime,
                              String drugBatchNumber,
                              String returnOfState,
                              String enterpriseName,
                              String InvoiceNumber,
                              @RequestParam(value = "pageNum" ,defaultValue = "1",required = false) Integer pageNum){
        PageHelper.startPage(pageNum,5);

        List<HospitalTransactionDetails> listss = hospitalTransactionStatementService.seletedrugs2(
                purchaseOrderNumber,
                nameOfPurchaseOrder, supplierName,drugCategoryName,
                serialNumber, commonName,drugFrom, specification,
                unit, conversionFraction,tradeName, level,
                createReceiptsTime, submissionTime,drugBatchNumber,
                returnOfState, enterpriseName, InvoiceNumber);
        PageInfo<HospitalTransactionDetails> pageInfo = new PageInfo<>(listss);
        return JSON.toJSONString(pageInfo);
    }

    /**
     * 剂型表查询
     */
    @RequestMapping(value = "seleDatafrom2" ,produces = "application/json;charset=utf-8")
    public List<DurgsFrom> seleDatafrom2(){
        List<DurgsFrom> result = hospitalTransactionStatementService.seleDatafrom2();
        return result;
    }
    /**
     * 药品类别表查询
     */
    @RequestMapping(value = "seleDrugCategory2" ,produces = "application/json;charset=utf-8")
    public List<DrugCategory> seleDrugCategory2(){
        List<DrugCategory> result = hospitalTransactionStatementService.seleDrugCategory2();
        return result;
    }
    /**
     * 质量层次查询
     */
    @RequestMapping(value = "selequalityLevel2" ,produces = "application/json;charset=utf-8")
    public List<QualityLevel> selequalityLevel2(){
        List<QualityLevel> result = hospitalTransactionStatementService.selequalityLevel2();
        return result;
    }

    /**
     * 供货商
     */
    @RequestMapping(value = "selesuppliers2" ,produces = "application/json;charset=utf-8")
    public List<Suppliers> selesuppliers2(){
        List<Suppliers> result = hospitalTransactionStatementService.selesuppliers2();
        return result;
    }

    /*批量删除*/
    @ResponseBody
    @RequestMapping(value="removeByKeyss2",produces={"application/json;charset=utf-8"})
    public String deleteByKeyss2(@RequestParam(value = "list[]") String[] list){

        boolean result=hospitalTransactionStatementService.deleteByKeyss2(list);

        return JSON.toJSONString(result);
    }


}
