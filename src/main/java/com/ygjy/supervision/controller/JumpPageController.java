package com.ygjy.supervision.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JumpPageController {
    @RequestMapping("/supervisionIndex")
    public String supervisionIndex(){
        return "supervision/supervision_index";
    }
    /*
    * 跳转到药品品目维护页面
    * */
    @RequestMapping("/drug_item_maintenance")
    public String drugItemMaintenance(){
        return "supervision/drug_item_maintenance";
    }

    /*
    * 跳转到药品信息维护页面
    * */
    @RequestMapping("/drug_information_maintenance")
    public String drugInformationMaintenance(){
        return "supervision/drug_information_maintenance";
    }
}
