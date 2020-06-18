package com.ygjy.systemmanagement.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ygjy.systemmanagement.pojo.Suppliers;
import com.ygjy.systemmanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: zhaozhiqiang
 * Date: 2020/6/18
 * Desc: 描述
 */
@RestController
public class SuppliersManageController {

    @Autowired
    private UserService userService;
    /**
     * 查询所有供货商信息
     * @param suppliersId
     * @param supplierName
     * @param supplierAddress
     * @param pageNum
     * @return
     */
    @RequestMapping(value = "findAllSuppliers",produces= {"application/json;charset=utf-8"})
    public String findAllSuppliers(@RequestParam("suppliersId") Integer suppliersId, @RequestParam("supplierName") String supplierName,
                                   @RequestParam("supplierAddress") String supplierAddress, @RequestParam(value="pageNum",required = false,defaultValue="1") Integer pageNum){
        PageHelper.startPage(pageNum, 7);
        List<Suppliers> allSuppliers = userService.findAllSuppliers(suppliersId, supplierName, supplierAddress);
        PageInfo<Suppliers> pageInfo = new PageInfo<>(allSuppliers);
        return JSON.toJSONString(pageInfo);
    }

    /**
     * 添加供货商信息
     * @param suppliers
     * @return
     */
    @RequestMapping(value = "addSuppliers")
    public String addSuppliers(Suppliers suppliers){
        return JSON.toJSONString(userService.addSuppliers(suppliers));
    }

    /**
     * 更新供货商信息
     * @param suppliers
     * @return
     */
    @RequestMapping(value = "updateSuppliers")
    public String updateSuppliers(Suppliers suppliers){
        return JSON.toJSONString(userService.updateSuppliers(suppliers));
    }
}
