package com.ygjy.systemmanagement.controller;

import com.alibaba.fastjson.JSON;
import com.ygjy.systemmanagement.pojo.Jurisdiction;
import com.ygjy.systemmanagement.pojo.Role;
import com.ygjy.systemmanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * User: zhaozhiqiang
 * Date: 2020/6/17
 * Desc: 描述
 */

@RestController
public class JurisdictionManageController {

    @Autowired
    private UserService userService;

    /**
     * 查询所有角色信息
     * @return
     */
    @RequestMapping(value = "findAllJurisdiction",produces = {"application/json;charset=utf-8"})
    public String findJurisdiction(){
        return JSON.toJSONString(userService.findJurisdictionAll());
    }

    /**
     * 添加角色信息
     * @param jurisdiction
     * @return
     */
    @RequestMapping(value ="addJurisdiction")
    public String addJurisdiction(Jurisdiction jurisdiction){
        return JSON.toJSONString(userService.addJurisdiction(jurisdiction));
    }

    /**
     * 更新角色信息
     * @param jurisdiction
     * @return
     */
    @RequestMapping(value = "updateJurisdiction")
    public String updateJurisdiction(Jurisdiction jurisdiction){
        return JSON.toJSONString(userService.updateJurisdiction(jurisdiction));
    }

    /**
     * 删除角色信息/假删除
     * @param id
     * @return
     */
    @RequestMapping(value ="removeJurisdiction")
    public String removeJurisdiction(Integer id){
        return JSON.toJSONString(userService.removeJurisdiction(id));
    }
}
