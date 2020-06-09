package com.ygjy.purchasingmanagement2.controller;

import com.ygjy.pojo.HospitalTransactionReturn;
import com.ygjy.purchasingmanagement2.service.HospitalTransactionReturnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.text.SimpleDateFormat;
import java.util.Date;

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

    @ResponseBody
    @RequestMapping("hospss")
    public int insert(HospitalTransactionReturn hosp){

/*        HospitalTransactionReturn htr = new HospitalTransactionReturn();
        htr.setCreateReceiptsTime(new Date());
        htr.setSubmissionTime(new Date());*/

        int hosps = hospitalTransactionReturnService.insert(hosp);

        return hosps;
    }

}
