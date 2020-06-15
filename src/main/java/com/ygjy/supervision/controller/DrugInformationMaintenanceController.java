package com.ygjy.supervision.controller;

import com.github.pagehelper.PageInfo;
import com.ygjy.pojo.*;
import com.ygjy.supervision.service.DrugInformationMaintenanceService;
import com.ygjy.supervision.vo.DrugInformationVO;
import com.ygjy.supplymanagement.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.util.DateUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/DrugInformationMaintenance")
public class DrugInformationMaintenanceController {
    @Autowired private DrugInformationMaintenanceService drugInformationMaintenanceServiceImpl;
    /*
    * 查询质量层次和药品交易状态
    * @return map*/
    @RequestMapping("/findQualityLevelAndDrugTradingStatus")
    public Map findQualityLevelAndDrugTradingStatus(){
        return drugInformationMaintenanceServiceImpl.findQualityLevelAndDrugTradingStatus();
    }
    /*
    *查询所有药品信息
     *return pageInfo
     */
    @RequestMapping("/findAllDrugInformation")
    public PageInfo findAllDrugInformation(Integer pageNum, DrugInformation drugInformation,Float startPrice,Float endPrice){
        return drugInformationMaintenanceServiceImpl.findAllDrugInformation(pageNum,drugInformation,startPrice,endPrice);
    }
    /*
    * 查出所有企业
    * rerturn list
    */
    @RequestMapping("/findAllEnterprise")
    public List<Enterprise> findAllEnterprise(){
        return drugInformationMaintenanceServiceImpl.findAllEnterprise();
    }
    /*
     * 添加药品信息
     * rerturn list
     */
    @RequestMapping("/saveDrugInformation")
    public Map saveDrugInformation(DrugItems drugItems,DrugInformation drugInformation) throws ParseException {
        //System.err.println(drugInformation);
        return drugInformationMaintenanceServiceImpl.saveDrugInformation(drugItems,drugInformation);
    }
    /*
    * 根据ID查询
    * return DrugInformation
    */
    @RequestMapping("/findDrugInformationById")
    public DrugInformation findDrugInformationById(@RequestParam(value = "id")Integer id){
        if (id!=null){
            return drugInformationMaintenanceServiceImpl.findDrugInformationById(id);
        }else {
            return null;
        }
    }
    /*
     * 根据ID删除
     * return Integer
     */
    @RequestMapping("/updateDrugInformationState")
    public Integer updateDrugInformationState(@RequestParam(value = "id")Integer id){
        if (id!=null){
            return drugInformationMaintenanceServiceImpl.updateDrugInformationState(id);
        }else {
            return null;
        }
    }
    /*
     * 导出药品信息到Excel
     */
    @RequestMapping("/exportDrugInformationExcle")
    public void exportDrugInformationExcle(DrugInformation drugInformation,Float startPrice,Float endPrice){
        List<DrugInformation> drugInformations = drugInformationMaintenanceServiceImpl.exportDrugInformationExcle(drugInformation,startPrice,endPrice);
        List<DrugInformationVO> drugInformationVOS = new ArrayList<>();
        DrugItemMaintenanceController drugItemMaintenanceController = new DrugItemMaintenanceController();
        Map map = drugItemMaintenanceController.findDrugFromAndDrugCategory();
        List<DurgsFrom> durgsFromList = (List<DurgsFrom>) map.get("list_durgsFrom");
        List<DrugCategory> drugCategoryList = (List<DrugCategory>) map.get("list_drugCategory");
        for (DrugInformation drugInformation1:drugInformations){
            DrugInformationVO drugInformationVO = new DrugInformationVO();
            drugInformationVO.setCommonName(drugInformation1.getCommonName());
        }
    }
}
