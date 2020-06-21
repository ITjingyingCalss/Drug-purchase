package com.ygjy.purchasingmanagement2.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ygjy.purchasingmanagement2.pojo.*;
import com.ygjy.purchasingmanagement2.service.HospitalTransactionReturnService;
import com.ygjy.purchasingmanagement2.vo.HospitalTransactionReturnVo;

import com.ygjy.supplymanagement.pojo.DrugInformation;
import com.ygjy.util.ExportExcel;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 *
 * @outher: Huangdebao
 * @Date: 2020/6/9 0009 下午 2:25
 * Desc: 添加退货单
 */
@RestController
public class HospitalTransactionReturnController {

    @Resource
    HospitalTransactionReturnService hospitalTransactionReturnService;


    /*添加退货单*/
    @ResponseBody
    @RequestMapping("hospss")
    public int insert(HospitalTransactionReturn hosp){

/*        HospitalTransactionReturn htr = new HospitalTransactionReturn();
        htr.setCreateReceiptsTime(new Date());
        htr.setSubmissionTime(new Date());*/

        int hosps = hospitalTransactionReturnService.insert(hosp);
        return hosps;
    }

    /*查询所有到页面*/
    @ResponseBody
    @RequestMapping(value = "lists" , produces = "application/json;charset=utf-8")
    public String list(String returnOrderNumber,String returnOrderName,
                                                Integer returnStateId,
                                                String contacts,
                                                String phone,
                                                String creatReceiptsPerson,
                                                String createReceiptsTime,
                                                String submissionTime,
                                                String remark,
                                                Integer hospitalId,
                                                @RequestParam(value = "pageNum" ,defaultValue = "1",required = false) Integer pageNum){
        PageHelper.startPage(pageNum,5);
        List<HospitalTransactionReturn> list1 = hospitalTransactionReturnService.list(returnOrderNumber, returnOrderName, returnStateId, contacts, phone, creatReceiptsPerson, createReceiptsTime, submissionTime,remark,hospitalId);
        PageInfo<HospitalTransactionReturn> pageInfo = new PageInfo<>(list1);
        return JSON.toJSONString(pageInfo);

    }

    /*修改回显*/
    @ResponseBody
    @RequestMapping("htrsees")
    public HospitalTransactionReturn htrSee(Integer id){

        HospitalTransactionReturn htrsee = hospitalTransactionReturnService.htrSee(id);

        return htrsee;
    }

    /*更新*/
    @ResponseBody
    @RequestMapping("updates")
    public int update(HospitalTransactionReturn htr){

        int update = hospitalTransactionReturnService.update(htr);

        return update;

    }

    /*批量删除*/
    @ResponseBody
    @RequestMapping(value="removeByKeys",produces={"application/json;charset=utf-8"})
    public String removeByKeys(@RequestParam(value = "list[]") String[] list){

        boolean result=hospitalTransactionReturnService.removeByKeys(list);

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
/*    @ResponseBody
    @RequestMapping("sele")
    public List<HospitalTransactionReturn> selList (String returnOrderNumber,String returnOrderName,Integer hospitalId,Integer returnStateId){

        List<HospitalTransactionReturn> select = hospitalTransactionReturnService.selList(returnOrderNumber,returnOrderName,hospitalId,returnStateId);

        return select;
    }*/

    /*
     * 导出文档
     * @return String*/
    @RequestMapping("exportAll")
    @ResponseBody
    public void exportAll(HttpServletResponse response,HospitalTransactionReturn hospital) throws IOException {
        List<HospitalTransactionReturn> list = hospitalTransactionReturnService.exportAll(hospital);
        List<HospitalTransactionReturnVo> list_hospitalVo = new ArrayList<>();
        /*Map map = this.findDrugFromAndDrugCategory();
        List<DurgsFrom> list_durgsFrom = (List<DurgsFrom>) map.get("list_durgsFrom");
        List<DrugCategory> list_drugCategory = (List<DrugCategory>) map.get("list_drugCategory");*/
        for (HospitalTransactionReturn hospitals:list) {
            HospitalTransactionReturnVo hospitalVo = new HospitalTransactionReturnVo();

            hospitalVo.setReturnOrderNumber(hospitals.getReturnOrderNumber());
            hospitalVo.setReturnOrderName(hospitals.getReturnOrderName());
            hospitalVo.setHospitalId(hospitals.getHospitalId());
            hospitalVo.setContacts(hospitals.getContacts());
            hospitalVo.setPhone(hospitals.getPhone());
            hospitalVo.setCreatReceiptsPerson(hospitals.getCreatReceiptsPerson());
            hospitalVo.setCreateReceiptsTime(hospitals.getCreateReceiptsTime());
            hospitalVo.setSubmissionTime(hospitals.getSubmissionTime());
            hospitalVo.setRemark(hospitals.getRemark());
            hospitalVo.setReturnStateId((hospitals.getReturnStateId().equals("1")?"提交":"未提交"));

            list_hospitalVo.add(hospitalVo);
        }
        String fileName = "退货单文档"+System.currentTimeMillis()+".xls";
        fileName= URLEncoder.encode(fileName,"utf-8");
        String[] headers = {"退货单编号","退货单名称","医院编号","联系人","联系电话","建单人","建单时间","提交时间","备注","退货状态"};
        response.setContentType("application/octet-stream;charset=utf-8");
        response.setHeader("Content-Disposition", "attachment;filename="+ fileName);
        OutputStream out = response.getOutputStream();
        ExportExcel exportExcel = new ExportExcel();
        exportExcel.exportExcel("测试文档",headers,list_hospitalVo,out,null);
    }


/*退货单维护*/
    /*退货药品查询*/
    @RequestMapping(value = "seletedrugs" ,produces = "application/json;charset=utf-8")
    public String seletedrugs(String purchaseOrderNumber,
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

        List<HospitalTransactionDetails> listss = hospitalTransactionReturnService.seletedrugs(
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
    @RequestMapping(value = "seleDurgsFrom" ,produces = "application/json;charset=utf-8")
    public List<DurgsFrom> seleDatafrom(){
        List<DurgsFrom> result = hospitalTransactionReturnService.seleDatafrom();
        return result;
    }
    /**
     * 药品类别表查询
     */
    @RequestMapping(value = "seleDrugCategory" ,produces = "application/json;charset=utf-8")
    public List<DrugCategory> seleDrugCategory(){
        List<DrugCategory> result = hospitalTransactionReturnService.seleDrugCategory();
        return result;
    }
    /**
     * 质量层次查询
     */
    @RequestMapping(value = "selequalityLevel" ,produces = "application/json;charset=utf-8")
    public List<QualityLevel> selequalityLevel(){
        List<QualityLevel> result = hospitalTransactionReturnService.selequalityLevel();
        return result;
    }

    /**
     * 供货商
     */
    @RequestMapping(value = "selesuppliers" ,produces = "application/json;charset=utf-8")
    public List<Suppliers> selesuppliers(){
        List<Suppliers> result = hospitalTransactionReturnService.selesuppliers();
        return result;
    }

    /*批量删除*/
    @ResponseBody
    @RequestMapping(value="removeByKeyss",produces={"application/json;charset=utf-8"})
    public String deleteByKeyss(@RequestParam(value = "list[]") String[] list){

        boolean result=hospitalTransactionReturnService.deleteByKeyss(list);

        return JSON.toJSONString(result);
    }


    /*查看*/
    @ResponseBody
    @RequestMapping(value="seleteBy2",produces={"application/json;charset=utf-8"})
    public HospitalTransactionDetails htd2(Integer id){

        HospitalTransactionDetails result=hospitalTransactionReturnService.htd2(id);

        return result;
    }

}
