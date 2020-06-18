package com.ygjy.systemmanagement.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ygjy.systemmanagement.pojo.ProxyMonitor;
import com.ygjy.systemmanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.security.PublicKey;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: zhaozhiqiang
 * Date: 2020/6/18
 * Desc: 描述
 */
@RestController
public class ProxyMonitorManageController {

    @Autowired
    private UserService userService;
    /**
     * 查询所有监督机构信息
     * @param proxyMonitorId
     * @param proxyMonitorName
     * @param proxyMonitorAddress
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping(value = "findAllProxyMonitor",produces= {"application/json;charset=utf-8"})
    public String findAllProxyMonitor(@RequestParam("proxyMonitorId") Integer proxyMonitorId,@RequestParam("proxyMonitorName")String proxyMonitorName,
                                      @RequestParam("proxyMonitorAddress") String proxyMonitorAddress,@RequestParam(value="pageNum",required = false,defaultValue="1") Integer pageNum,
                                      @RequestParam(value = "pageSize",required = false,defaultValue = "7") Integer pageSize
                                      ){
        PageHelper.startPage(pageNum,pageSize);
        List<ProxyMonitor> proxyMonitorAll = userService.findProxyMonitorAll(proxyMonitorId, proxyMonitorName, proxyMonitorAddress);
        PageInfo<ProxyMonitor> pageInfo = new PageInfo<>(proxyMonitorAll);
        return JSON.toJSONString(pageInfo);
    }

   /* *//**
     * 添加监督机构信息
     * @param proxyMonitor
     * @return
     *//*
    @RequestMapping(value = "addProxyMonitor")
    public String addProxyMonitor(ProxyMonitor proxyMonitor){
        return "";
    }

    *//**
     * 更新监督机构信息
     * @param proxyMonitor
     * @return
     *//*
    @RequestMapping(value = "updateProxyMonitor")
    public String updateProxyMonitor(ProxyMonitor proxyMonitor){
        return "";
    }

    *//**
     * 删除监督机构信息
     * @param id
     * @return
     *//*
    @RequestMapping(value = "removeProxyMonitor")
    public String removeProxyMonitor(Integer id){
        return "";
    }

    *//**
     * 批量操作
     * @param id
     * @return
     *//*
    @RequestMapping(value = "queryProxyMonitorList")
    public String queryProxyMonitorList(String[] id){
        return "";
    }*/
}
