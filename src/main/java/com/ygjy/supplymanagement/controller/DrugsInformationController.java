package com.ygjy.supplymanagement.controller;

import com.ygjy.supplymanagement.service.DrugsInformationService;
import com.ygjy.supplymanagement.utils.Dto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: 赵林
 * @Date: 2020/6/9 13:50
 * @Description:
 */
@RestController
public class DrugsInformationController {
    /**
     * 药品品目模糊查询及全部查询
     * @return
     */
    @Resource
    private DrugsInformationService drugsInformationService;
    @RequestMapping(value = "/DrugsInformation" ,produces = "application/json;charset=utf-8",method = RequestMethod.GET)
    public Dto findAll(@RequestParam(value = "commonName",required = false) String commonName,String serialNumber,@RequestParam(value = "dosageFormId",required = false)Integer dosageFormId,String specification,String unit,String conversionFraction,Integer drugCategoryId,Integer drugTransactionStatusId,String enterpriseName,String tradeName,Float latestRetailPrice,Integer qualityLevelId){
        Dto query = drugsInformationService.getQuery(commonName, serialNumber, dosageFormId, specification, unit, conversionFraction, drugCategoryId, drugTransactionStatusId,enterpriseName,tradeName,latestRetailPrice,qualityLevelId);
        return query;
    }
    /**
     * 剂型表查询
     */
    @RequestMapping(value = "/selectDurgsFrom" ,produces = "application/json;charset=utf-8",method = RequestMethod.GET)
    public Dto selectDurgsFrom(){
        Dto query = drugsInformationService.selectDurgsFrom();
        return query;
    }
    /**
     * 药品类别表查询
     */
    @RequestMapping(value = "/selectdrugcategory" ,produces = "application/json;charset=utf-8",method = RequestMethod.GET)
    public Dto selectdrugcategory(){
        Dto query = drugsInformationService.selectDrugCategory();
        return query;
    }
    /**
     * 药品状态表查询
     */
    @RequestMapping(value = "/selectDrugTransactionStatus" ,produces = "application/json;charset=utf-8",method = RequestMethod.GET)
    public Dto selectDrugTransactionStatus(){
        Dto query = drugsInformationService.selectDrugTransactionStatus();
        return query;
    }
    /**
     * 质量层次查询
     */
    @RequestMapping(value = "/qualityLevel" ,produces = "application/json;charset=utf-8",method = RequestMethod.GET)
    public Dto qualityLevel(){
        Dto query = drugsInformationService.qualityLevel();
        return query;
    }
}
