package com.ygjy.systemmanagement.controller;

import com.alibaba.fastjson.JSON;
import com.ygjy.systemmanagement.pojo.Role;
import com.ygjy.systemmanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: zhaozhiqiang
 * Date: 2020/6/17
 * Desc: 描述
 */

@RestController
public class RoleManageController {

    @Autowired
    private UserService userService;

    /**
     * 查询所有角色信息
     * @return
     */
    @RequestMapping(value = "findAllRole",produces = {"application/json;charset=utf-8"})
    public String findAllRole(){
        return JSON.toJSONString(userService.findRoleAll());
    }

    /**
     * 添加角色信息
     * @param role
     * @return
     */
    @RequestMapping(value ="addRolenfo")
    public String addRolenfo(Role role){
        return JSON.toJSONString(userService.addRole(role));
    }

    /**
     * 更新角色信息
     * @param role
     * @return
     */
    @RequestMapping(value = "updateRoleInfo")
    public String updateRoleInfo(Role role){
        return JSON.toJSONString(userService.updateRoleInfo(role));
    }

    /**
     * 删除角色信息/假删除
     * @param id
     * @return
     */
    @RequestMapping(value ="removeRoleInfo")
    public String removeRoleInfo(Integer id){
        return JSON.toJSONString(userService.reomoveRoleInfo(id));
    }
}
