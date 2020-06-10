package com.ygjy.supplymanagement.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ygjy.supplymanagement.pojo.DrugInformation;
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
    @RequestMapping(value = "/DrugsInformation" ,produces = "application/json;charset=utf-8")
    public String findAll(@RequestParam(value = "commonName",required = false) String commonName,String serialNumber,@RequestParam(value = "dosageFormId",required = false)Integer dosageFormId,String specification,String unit,String conversionFraction,Integer drugCategoryId,Integer drugTransactionStatusId,String enterpriseName,String tradeName,Float latestRetailPrice,Integer qualityLevelId,
                          @RequestParam(value = "pageNum" ,defaultValue = "1",required = false) Integer pageNum){
        PageHelper.startPage(pageNum,5);
        if(dosageFormId!=null&&dosageFormId<=0){
            dosageFormId=null;
        }
        if(drugCategoryId!=null&&drugCategoryId<=0){
            drugCategoryId=null;
        }
        if(drugTransactionStatusId!=null&&drugTransactionStatusId<=0){
            drugTransactionStatusId=null;
        }
        if(qualityLevelId!=null&&qualityLevelId<=0){
            qualityLevelId=null;
        }

        List<com.ygjy.supplymanagement.pojo.DrugInformation> query = drugsInformationService.getQuery(commonName, serialNumber, dosageFormId, specification, unit, conversionFraction, drugCategoryId, drugTransactionStatusId, enterpriseName, tradeName, latestRetailPrice, qualityLevelId);
        PageInfo<DrugInformation> pageInfo = new PageInfo<>(query);
        return JSON.toJSONString(pageInfo);
    }
    /**
     * 条件查询
     */
    @RequestMapping(value = "/getSelect" ,produces = "application/json;charset=utf-8")
    public Dto getSelect(Integer id){
        Dto query = drugsInformationService.getSelect(id);
        return query;
    }
    /**
     * 剂型表查询
     */
    @RequestMapping(value = "/selectDurgsFrom" ,produces = "application/json;charset=utf-8")
    public Dto selectDurgsFrom(){
        Dto query = drugsInformationService.selectDurgsFrom();
        return query;
    }
    /**
     * 药品类别表查询
     */
    @RequestMapping(value = "/selectdrugcategory" ,produces = "application/json;charset=utf-8")
    public Dto selectdrugcategory(){
        Dto query = drugsInformationService.selectDrugCategory();
        return query;
    }
    /**
     * 药品状态表查询
     */
    @RequestMapping(value = "/selectDrugTransactionStatus" ,produces = "application/json;charset=utf-8")
    public Dto selectDrugTransactionStatus(){
        Dto query = drugsInformationService.selectDrugTransactionStatus();
        return query;
    }
    /**
     * 质量层次查询
     */
    @RequestMapping(value = "/qualityLevel" ,produces = "application/json;charset=utf-8")
    public Dto qualityLevel(){
        Dto query = drugsInformationService.qualityLevel();
        return query;
    }
}
