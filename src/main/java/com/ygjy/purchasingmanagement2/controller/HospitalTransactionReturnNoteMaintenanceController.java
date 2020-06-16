package com.ygjy.purchasingmanagement2.controller;


import com.ygjy.purchasingmanagement2.pojo.HospitalTransactionReturn;
import com.ygjy.purchasingmanagement2.service.HospitalTransactionReturnNoteMaintenanceService;
import com.ygjy.purchasingmanagement2.vo.HospitalTransactionReturnVo;
import com.ygjy.util.ExportExcel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @outher: Huangdebao
 * @Date: 2020/6/9 0009 下午 2:25
 * Desc: 添加退货单
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

}
