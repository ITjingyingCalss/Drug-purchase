package com.ygjy.supervision.controller;

import com.ygjy.pojo.DurgsFrom;
import com.ygjy.supervision.service.DrugItemMaintenanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DrugItemMaintenanceController {
    @Autowired private DrugItemMaintenanceService drugItemMaintenanceService;
    //加载模糊查询select选项
    @RequestMapping("/findSelectOption")
    @ResponseBody
    public List<DurgsFrom> findSelectOption (){
        return drugItemMaintenanceService.findSelectOption();
    }
    /*
    * 查询剂型和药品类别
    * */
    @RequestMapping("/findDrugFromAndDrugCategory")
    @ResponseBody
    public List findDrugFromAndDrugCategory (){
        List list = drugItemMaintenanceService.findDrugFromAndDrugCategory();
        return list;
    }
}
