package com.ygjy.purchasingmanagement2.controller;

import com.alibaba.fastjson.JSON;
import com.ygjy.pojo.DrugCategory;
import com.ygjy.pojo.DrugItems;
import com.ygjy.pojo.DurgsFrom;
import com.ygjy.purchasingmanagement2.pojo.HospitalTransactionReturn;
import com.ygjy.purchasingmanagement2.service.HospitalTransactionReturnService;
import com.ygjy.purchasingmanagement2.vo.HospitalTransactionReturnVo;
import com.ygjy.supervision.vo.DrugItemsVo;
import com.ygjy.util.ExportExcel;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


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
@Controller
public class HospitalTransactionReturnController {

    @Autowired
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
    @RequestMapping("lists")
    public List<HospitalTransactionReturn> list(HospitalTransactionReturn htrLis){

        List<HospitalTransactionReturn> list1 = hospitalTransactionReturnService.list(htrLis);

        return list1;
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
    @ResponseBody
    @RequestMapping("sele")
    public List<HospitalTransactionReturn> selList (String returnOrderNumber,String returnOrderName,Integer hospitalId,Integer returnStateId){

        List<HospitalTransactionReturn> select = hospitalTransactionReturnService.selList(returnOrderNumber,returnOrderName,hospitalId,returnStateId);

        return select;
    }

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

}
