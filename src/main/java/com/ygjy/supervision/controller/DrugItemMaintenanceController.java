package com.ygjy.supervision.controller;

import com.github.pagehelper.PageInfo;
import com.ygjy.pojo.DrugItems;
import com.ygjy.pojo.DurgsFrom;
import com.ygjy.supervision.service.DrugItemMaintenanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DrugItemMaintenanceController {
    @Autowired private DrugItemMaintenanceService drugItemMaintenanceService;
    /*
    * 加载全部药品品目信息
    * @return List
    * */
    @RequestMapping("/findAllDrugItems")
    public PageInfo findAllDrugItems (@RequestParam(value = "pageNum")Integer pageNum){
        PageInfo pageInfo = drugItemMaintenanceService.findAllDrugItems(pageNum);
        return pageInfo;
    }
    /*
    * 查询剂型和药品类别
    * */
    @RequestMapping("/findDrugFromAndDrugCategory")
    public List findDrugFromAndDrugCategory (){
        List list = drugItemMaintenanceService.findDrugFromAndDrugCategory();
        return list;
    }
    /*
    * 添加药品品目信息
    * @return String
    * */
    @RequestMapping("/drugItemsAdd")
    public String drugItemsAdd (DrugItems drugItems){
        if (drugItems==null){
            return "保存失败";
        }else{
            int i = drugItemMaintenanceService.drugItemsAdd(drugItems);
            if (i==1){
                return "保存成功";
            }else {
                return "保存失败";
            }
        }
    }
    /*
    * 根据ID查找药品品目信息
    * @return DrugItems
    * */
    @RequestMapping("/findItemsById")
    public DrugItems findItemsById(@RequestParam(value = "id")Integer itemsId){
        if (itemsId!=null){
            DrugItems drugItems = drugItemMaintenanceService.findItemsById(itemsId);
            return drugItems;
        }else{
            return null;
        }

    }
}
