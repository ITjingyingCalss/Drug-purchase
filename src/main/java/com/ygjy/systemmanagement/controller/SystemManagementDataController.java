package com.ygjy.systemmanagement.controller;

import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.fastjson.JSON;
import com.ygjy.systemmanagement.pojo.User;
import com.ygjy.systemmanagement.service.UserService;
import com.ygjy.systemmanagement.util.ExportExcel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
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

    /**
     * 条件查询所有用户信息
     * @param userId
     * @param userAccount
     * @param contactAddress
     * @return
     */
    @RequestMapping(value = "findUserAll",produces= {"application/json;charset=utf-8"})
    public String findAllUser(@RequestParam("userId") Integer userId,@RequestParam("userAccount") String userAccount,
                              @RequestParam("contactAddress") String contactAddress,@RequestParam(value = "userState",required = false,defaultValue = "0") Integer userState){
        return JSON.toJSONString(userService.findUserAll(userId,userAccount,contactAddress,userState));
    }

    /**
     * 根据用户id(userId)删除该条信息
     * @param userId
     * @return
     */
    @RequestMapping(value = "removeUserInfo")
    public String removeUserInfo(@RequestParam("userId") Integer userId){
        return "";
    }

    /**
     * 根据用户Id(userId)更新用户状态,实现假删除
     * @param user
     * @return
     */
    @RequestMapping(value = "updateUserSave")
    public String updateUserSave(User user){
        return JSON.toJSONString(userService.updateUserStatus(user));
    }

    /**
     * 添加用户信息
     * @return
     */
    @RequestMapping(value = "addUserInfo")
    public String addUserInfo(User user){
        user.setUserCreateTime(new Date());
        return JSON.toJSONString(userService.addUserInfo(user));
    }

    /**
     * 上传Excel文档解析存储至数据库
     * @return
     */
    @RequestMapping(value = "importUserExcel")
    public String importUserExcel(){
        return "";
    }

    /**
     * 以Excel格式导出User文档
     * @return
     */
    @RequestMapping(value = "outputUserExcel")
    public String outputUserExcel(String ids) throws IOException {
      String[] head = {"用Id","用户名","用户类别","用户账号","用户密码","单位名称","联系地址","邮政编码","联系人","联系方式","邮箱"};
      String title = "用户信息";
      String fileName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date())+".xlsx";
      if (ids != null && !"".equals(ids)){
           String[] userId = ids.split(",");
           List<User> userList = userService.queryUserList(userId);
           ExportExcel<User> exportExcel = new ExportExcel<>();
           exportExcel.export(title,head,userList,new FileOutputStream("G://upload/excel/"+fileName));
       }
        return "";
    }

    /**
     * 上传文件
     * @return
     */
    @RequestMapping(value = "uploadFile",produces = {"application/json;charset=utf-8"})
    public String uploadFile(@RequestParam("file") MultipartFile file,Integer id) throws IOException {
        String fileName = file.getOriginalFilename();
        String uname = fileName.substring(0,fileName.lastIndexOf("."));
        String newFileName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date()) + fileName.substring(fileName.lastIndexOf("."));
        String path;
        if (newFileName.endsWith(".doc") || newFileName.endsWith(".docx")){
            path = "G://upload/work/"+newFileName;
        }else if (newFileName.endsWith(".xls") || newFileName.endsWith(".xlsx")){
            path = "G://upload/excel/"+newFileName;
        }else if (newFileName.endsWith(".jpg") || newFileName.endsWith(".png")){
            path = "G://upload/img/"+newFileName;
        }else {
            path = "G://upload/media/"+newFileName;
        }
        file.transferTo(new File(path));
        return "";
    }

    /**
     * 下载文件
     * @return
     */
    @RequestMapping(value = "downloadFile")
    public String downloadFile(MultipartFile file){
        return "";
    }

}
