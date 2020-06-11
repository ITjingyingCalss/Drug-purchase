package com.ygjy.supervision.controller;

import com.github.pagehelper.PageInfo;
import com.ygjy.pojo.DrugItems;
import com.ygjy.pojo.DurgsFrom;
import com.ygjy.supervision.service.DrugItemMaintenanceService;
import com.ygjy.util.ExportExcel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.util.List;

@RestController
public class DrugItemMaintenanceController {
    @Autowired private DrugItemMaintenanceService drugItemMaintenanceService;
    /*
    * 加载全部药品品目信息
    * @return List
    * */
    @RequestMapping("/findAllDrugItems")
    public PageInfo findAllDrugItems (Integer pageNum,DrugItems formData){
        PageInfo pageInfo = drugItemMaintenanceService.findAllDrugItems(pageNum,formData);
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
    * 添加修改药品品目信息
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
            }else if (i==0){
                return "保存失败,请尝试刷新页面重新操作";
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
    /*
    * 根据id删除
    * @return Integer
    * */
    @RequestMapping("/updateItemsState")
    public Integer updateItemsState(@RequestParam(value = "id")Integer itemsId){
        if (itemsId!=null){
            return drugItemMaintenanceService.updateItemsState(itemsId);
        }else{
            return 0;
        }

    }
    /*
     * 导出文档
     * @return String*/
    @RequestMapping("/exportExcle")
    public String exportExcle() throws FileNotFoundException {
        List<DrugItems> list = drugItemMaintenanceService.exportExcle();
        String[] headers = {"药品品目号","通用名","剂型","规格","单位","转换系数","药品类别","状态"};
        File file = new File("D:测试文档.xls");
        OutputStream out = new FileOutputStream(file);
        ExportExcel exportExcel = new ExportExcel();
        exportExcel.exportExcel("测试文档",headers,list,out,null);
        return "111";
    }
}


