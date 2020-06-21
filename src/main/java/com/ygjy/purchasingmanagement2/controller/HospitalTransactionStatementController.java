package com.ygjy.purchasingmanagement2.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ygjy.purchasingmanagement2.pojo.*;
import com.ygjy.purchasingmanagement2.service.HospitalTransactionStatementService;
import com.ygjy.purchasingmanagement2.vo.HospitalTransactionStatementVo;
import com.ygjy.util.ExportExcel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @outher: Huangdebao
 * @Date: 2020/6/9 0009 下午 2:25
 * Desc: 添加结算单
 */
@RestController
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
/*    @ResponseBody
    @RequestMapping("lists1")
    public List<HospitalTransactionStatement> list(HospitalTransactionStatement htrLis){

        List<HospitalTransactionStatement> list1 = hospitalTransactionStatementService.list(htrLis);

        return list1;
    }*/

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


    /*查询所有到页面*/
    @ResponseBody
    @RequestMapping(value = "selList" , produces = "application/json;charset=utf-8")
    public String selList (String statementNumber,String statementName,
                                                       Integer statementStateId,
                                                       String contacts,
                                                       String phone,
                                                       String creatReceiptsPerson,
                                                       String createReceiptsTime,
                                                       String submissionTime,
                                                       String remark,
                                                       Integer hospitalId,
                                                       @RequestParam(value = "pageNum" ,defaultValue = "1",required = false) Integer pageNum){
        List<HospitalTransactionStatement> select = hospitalTransactionStatementService.selList(statementNumber,
                                                                                                statementName,
                                                                                                statementStateId,
                                                                                                contacts,
                                                                                                phone,
                                                                                                creatReceiptsPerson,
                                                                                                createReceiptsTime,
                                                                                                submissionTime,
                                                                                                remark,
                                                                                                hospitalId);
        PageHelper.startPage(pageNum,5);
        PageInfo<HospitalTransactionStatement> pageInfo = new PageInfo<>(select);
        return JSON.toJSONString(pageInfo);

    }



    /*
     * 导出文档
     * @return String*/
    @RequestMapping("exportAlls")
    @ResponseBody
    public void exportAll(HttpServletResponse response, HospitalTransactionStatement hospital) throws IOException {
        List<HospitalTransactionStatement> list = hospitalTransactionStatementService.exportAlls(hospital);
        List<HospitalTransactionStatementVo> list_hospitalVo = new ArrayList<>();
        /*Map map = this.findDrugFromAndDrugCategory();
        List<DurgsFrom> list_durgsFrom = (List<DurgsFrom>) map.get("list_durgsFrom");
        List<DrugCategory> list_drugCategory = (List<DrugCategory>) map.get("list_drugCategory");*/
        for (HospitalTransactionStatement hospitals:list) {
            HospitalTransactionStatementVo hospitalVo = new HospitalTransactionStatementVo();

            hospitalVo.setStatementNumber(hospitals.getStatementNumber());
            hospitalVo.setStatementName(hospitals.getStatementName());
            hospitalVo.setHospitalId(hospitals.getHospitalId());
            hospitalVo.setContacts(hospitals.getContacts());
            hospitalVo.setPhone(hospitals.getPhone());
            hospitalVo.setCreatReceiptsPerson(hospitals.getCreatReceiptsPerson());
            hospitalVo.setCreateReceiptsTime(hospitals.getCreateReceiptsTime());
            hospitalVo.setSubmissionTime(hospitals.getSubmissionTime());
            hospitalVo.setRemark(hospitals.getRemark());
            hospitalVo.setStatementStateId((hospitals.getStatementStateId().equals("1")?"未结算":"结算"));

            list_hospitalVo.add(hospitalVo);
        }
        String fileName = "结算单文档"+System.currentTimeMillis()+".xls";
        fileName= URLEncoder.encode(fileName,"utf-8");
        String[] headers = {"结算单编号","结算单名称","医院编号","联系人","联系电话","建单人","建单时间","提交时间","备注","结算状态"};
        response.setContentType("application/octet-stream;charset=utf-8");
        response.setHeader("Content-Disposition", "attachment;filename="+ fileName);
        OutputStream out = response.getOutputStream();
        ExportExcel exportExcel = new ExportExcel();
        exportExcel.exportExcel("测试文档",headers,list_hospitalVo,out,null);
    }


    /*退货单维护*/
    /*退货药品查询*/
   @RequestMapping(value = "seleteSettlement" ,produces = "application/json;charset=utf-8")
   @ResponseBody
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

    /*查看*/
    @ResponseBody
    @RequestMapping(value="seleteBy",produces={"application/json;charset=utf-8"})
    public HospitalTransactionDetails htd(Integer id){

        HospitalTransactionDetails result=hospitalTransactionStatementService.htd(id);

        return result;
    }


}
