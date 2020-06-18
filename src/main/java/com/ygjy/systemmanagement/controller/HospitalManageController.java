package com.ygjy.systemmanagement.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ygjy.systemmanagement.pojo.Hospital;
import com.ygjy.systemmanagement.pojo.Jurisdiction;
import com.ygjy.systemmanagement.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: zhaozhiqiang
 * Date: 2020/6/17
 * Desc: 描述
 */
@RestController
public class HospitalManageController {

    @Autowired
    private UserService userService;

    /**
     * 查询所有医院信息
     * @return
     */
    @RequestMapping(value = "findAllHospital",produces = {"application/json;charset=utf-8"})
    public String findAllHospital(@RequestParam("hospitalName") String hospitalName, @RequestParam("hospitalLevel") String hospitalLevel, @RequestParam("hospitalType") String hospitalType,
                                  @RequestParam(value="pageNum",required = false,defaultValue="1") Integer pageNum,@RequestParam(value = "pageSize",required = false,defaultValue = "7") Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<Hospital> allHospital = userService.findAllHospital(hospitalName, hospitalLevel, hospitalType);
        PageInfo<Hospital> pageInfo = new PageInfo<>(allHospital);
        return JSON.toJSONString(pageInfo);
    }

    /**
     * 添加医院信息
     * @param hospital
     * @return
     */
    @RequestMapping(value ="addHospital")
    public String addHospital(Hospital hospital){
        return JSON.toJSONString(userService.addHospital(hospital));
    }

    /**
     * 更新医院信息
     * @param hospital
     * @return
     */
    @RequestMapping(value = "updateHospital")
    public String updateHospital(Hospital hospital){
        return JSON.toJSONString(userService.updateHospital(hospital));
    }

    /**
     * 删除角色信息/假删除
     * @param id
     * @return
     */
    @RequestMapping(value ="removeHospital")
    public String removeHospital(Integer id){
        return JSON.toJSONString(userService.removeJurisdiction(id));
    }

    //验证医院表单字段合理性
    @RequestMapping(value="findHospitalProperty",produces= {"application/json;charset=utf-8"})
    public String findHospitalProperty(String hospitalName, String hospitalTelephone,String hospitalFax,String pharmacyTelephone) {
        Hospital hospitalProperty = userService.findHospitalProperty(hospitalName, hospitalTelephone, hospitalFax, pharmacyTelephone);
        if (hospitalProperty == null) {
            return JSON.toJSONString(true);
        }else {
            return JSON.toJSONString(false);
        }
    }
}
