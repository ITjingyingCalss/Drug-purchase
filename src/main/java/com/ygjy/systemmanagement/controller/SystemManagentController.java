package com.ygjy.systemmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 * User: zhaozhiqiang
 * Date: 2020/6/8
 * Desc: 系统管理页面跳转控制
 */

@Controller
public class SystemManagentController {

    /**
     * 跳转用户管理页面
     * @return
     */
    @RequestMapping("/userControl")
    public String userControl(){
        return "systemmanagement/user_control";
    }

    /**
     * 跳转卫生局页面
     * @return
     */
    @RequestMapping("/healthBureau")
    public String healthBureau(){
        return "systemmanagement/health_bureau";
    }

    /**
     * 跳转卫生院页面
     * @return
     */
    @RequestMapping("/healthCenters")
    public String healthCenters(){
        return "systemmanagement/health_centers";
    }

    /**
     * 跳转卫生室页面
     * @return
     */
    @RequestMapping("/medicalRoom")
    public String medicalRoom(){
        return "systemmanagement/medical_room";
    }

    /**
     * 跳转供货商页面
     * @return
     */
    @RequestMapping("/vendors")
    public String vendors(){
        return "systemmanagement/vendors";
    }

    /**
     * 跳转监督机构页面
     * @return
     */
    @RequestMapping("/proxyMonitor")
    public String proxyMonitor(){
        return "systemmanagement/proxy_monitor";
    }

    /**
     * 跳转数据字典页面
     * @return
     */
    @RequestMapping("/dictionaryManaged")
    public String dictionaryManaged(){
        return "systemmanagement/dictionary_managed";
    }

    /**
     * 跳转区域管理页面
     * @return
     */
    @RequestMapping("/districtManagement")
    public String districtManagement(){
        return "systemmanagement/district_management";
    }

    /**
     * 跳转用户数据管理页面
     * @return
     */
    @RequestMapping("/userManagement")
    public String userManagement(){
        return "systemmanagement/user_management";
    }

    /**
     * 跳转用户权限管理页面
     * @return
     */
    @RequestMapping("/userRightsManagement")
    public String userRightsManagement(){
        return "systemmanagement/user_rights_management";
    }

    /**
     * 跳转系统配置页面
     * @return
     */
    @RequestMapping("/systemParameter")
    public String systemParameter(){
        return "systemmanagement/system_parameter";
    }

}
