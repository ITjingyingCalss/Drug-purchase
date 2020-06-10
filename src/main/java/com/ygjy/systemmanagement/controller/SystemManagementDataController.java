package com.ygjy.systemmanagement.controller;

import com.alibaba.fastjson.JSON;
import com.ygjy.systemmanagement.pojo.User;
import com.ygjy.systemmanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: zhaozhiqiang
 * Date: 2020/6/8
 * Desc: 系统管理操作执行页面挑战
 */

@RestController
public class SystemManagementDataController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "findUserAll",produces= {"application/json;charset=utf-8"})
    public String findAllUser(@RequestParam("id") Integer id,@RequestParam("userAccount") String userAccount,@RequestParam("contactAddress") String contactAddress){
        return JSON.toJSONString(userService.findUserAll(id,userAccount,contactAddress));
    }

}
