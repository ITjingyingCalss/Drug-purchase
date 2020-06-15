package com.ygjy.purchasingmanagement2.controller;

import com.alibaba.fastjson.JSON;
import com.ygjy.purchasingmanagement2.pojo.HospitalTransactionStatement;
import com.ygjy.purchasingmanagement2.service.HospitalTransactionStatementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @outher: Huangdebao
 * @Date: 2020/6/9 0009 下午 2:25
 * Desc: 添加退货单
 */
@Controller
public class HospitalTransactionStatementController {

    @Autowired
    HospitalTransactionStatementService hospitalTransactionStatementService;


    /*添加退货单*/
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
    @ResponseBody
    @RequestMapping("lists1")
    public List<HospitalTransactionStatement> list(HospitalTransactionStatement htrLis){

        List<HospitalTransactionStatement> list1 = hospitalTransactionStatementService.list(htrLis);

        return list1;
    }

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


    /*条件查询*/
    @ResponseBody
    @RequestMapping("sele1")
    public List<HospitalTransactionStatement> selList (String statementNumber,String statementName,Integer hospitalId,Integer statementStateId){

        List<HospitalTransactionStatement> select = hospitalTransactionStatementService.selList(statementNumber,statementName,hospitalId,statementStateId);

        return select;

    }

}
