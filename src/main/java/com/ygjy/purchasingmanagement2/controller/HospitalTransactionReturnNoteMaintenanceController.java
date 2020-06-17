package com.ygjy.purchasingmanagement2.controller;


import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ygjy.purchasingmanagement2.pojo.HospitalTransactionDetails;
import com.ygjy.purchasingmanagement2.pojo.HospitalTransactionReturn;
import com.ygjy.purchasingmanagement2.service.HospitalTransactionReturnNoteMaintenanceService;
import com.ygjy.purchasingmanagement2.vo.HospitalTransactionReturnVo;
import com.ygjy.supplymanagement.pojo.DrugInformation;
import com.ygjy.util.ExportExcel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
 * Desc: 退货单维护
 */
@Controller
public class HospitalTransactionReturnNoteMaintenanceController {

    @Autowired
    HospitalTransactionReturnNoteMaintenanceService hospitalTransactionReturnNoteMaintenanceService;

    /*
     * 导出文档
     * @return String*/
    @RequestMapping("")
    @ResponseBody
    public void exportAll1(HttpServletResponse response,HospitalTransactionReturn hospital) throws IOException {
        List<HospitalTransactionReturn> list = hospitalTransactionReturnNoteMaintenanceService.exportAll1(hospital);
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


    @RequestMapping(value = "seletedrugs" ,produces = "application/json;charset=utf-8")
    public String seletedrugs(String purchaseOrderNumber,
                                                String nameOfPurchaseOrder,
                                                String supplierMame,
                                                String drugCategoryId,
                                                String serialNumber,
                                                String commonName,
                                                String drugFrom,
                                                String specification,
                                                String unit,
                                                String conversionFraction,
                                                String tradeName,
                                                String level,
                                                Date createReceiptsTimes,
                                                Integer submissionTimes,
                                                String drugBatchNumber,
                                                String returnOfState,
                                                String enterpriseName,
                                                String InvoiceNumber,
                                                @RequestParam(value = "pageNum" ,defaultValue = "1",required = false) Integer pageNum){
        PageHelper.startPage(pageNum,5);

        List<HospitalTransactionDetails> listss = hospitalTransactionReturnNoteMaintenanceService.seletedrugs(
                purchaseOrderNumber,
                nameOfPurchaseOrder, supplierMame,drugCategoryId,
                serialNumber, commonName,drugFrom, specification,
                unit, conversionFraction,tradeName, level,
                createReceiptsTimes, submissionTimes,drugBatchNumber,
                returnOfState, enterpriseName, InvoiceNumber);
        PageInfo<HospitalTransactionDetails> pageInfo = new PageInfo<>(listss);
        return JSON.toJSONString(pageInfo);
    }

}
