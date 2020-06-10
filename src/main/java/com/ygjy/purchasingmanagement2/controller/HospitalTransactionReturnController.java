package com.ygjy.purchasingmanagement2.controller;

import com.ygjy.purchasingmanagement2.pojo.HospitalTransactionReturn;
import com.ygjy.purchasingmanagement2.service.HospitalTransactionReturnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

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

}
