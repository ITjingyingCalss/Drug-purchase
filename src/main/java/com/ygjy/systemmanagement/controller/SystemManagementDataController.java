package com.ygjy.systemmanagement.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ygjy.systemmanagement.pojo.Suppliers;
import com.ygjy.systemmanagement.pojo.User;
import com.ygjy.systemmanagement.service.UserService;
import com.ygjy.systemmanagement.util.ExportExcel;
import com.ygjy.systemmanagement.util.ImportExcel;
import com.ygjy.systemmanagement.util.Md5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import sun.security.provider.MD5;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
                              @RequestParam("contactAddress") String contactAddress,@RequestParam(value="pageNum",required = false,defaultValue="1") Integer pageNum,
                              @RequestParam(value="pageSize",required = false,defaultValue="10") Integer pageSize,@RequestParam(value = "userState",required = false,defaultValue = "0") Integer userState){
        PageHelper.startPage(pageNum, pageSize);
        List<User> userAll = userService.findUserAll(userId, userAccount, contactAddress, userState);
        PageInfo<User> pageInfo = new PageInfo<>(userAll);
        return JSON.toJSONString(pageInfo);
    }

    //验证字段合理性
    @RequestMapping(value="findAllProperty",produces= {"application/json;charset=utf-8"})
    public String findAllProperty(String userPhone,String username,String password,String userEmail) {
        User user = userService.selectUserProperty(username, password, userPhone, userEmail);
        if (user == null) {
            return JSON.toJSONString(true);
        }else {
            return JSON.toJSONString(false);
        }
    }

    /**
     * 查询所有省
     * @return
     */
    @RequestMapping(value = "findProvince",produces= {"application/json;charset=utf-8"})
    public String findProvince() {
        return JSON.toJSONString(userService.findAll());

    }

    @RequestMapping(value = "findAllSuppliers",produces= {"application/json;charset=utf-8"})
    public String findAllSuppliers(@RequestParam("suppliersId") Integer suppliersId,@RequestParam("supplierName") String supplierName,
                                   @RequestParam("supplierAddress") String supplierAddress,@RequestParam(value="pageNum",required = false,defaultValue="1") Integer pageNum){
        PageHelper.startPage(pageNum, 7);
        List<Suppliers> allSuppliers = userService.findAllSuppliers(suppliersId, supplierName, supplierAddress);
        PageInfo<Suppliers> pageInfo = new PageInfo<>(allSuppliers);
        return JSON.toJSONString(pageInfo);
    }

    /**
     * 通过省编码查询下属市
     * @param pcode
     * @return
     */
    @RequestMapping(value = "findCityByPcode",produces= {"application/json;charset=utf-8"})
    public String findCityByPcode(String pcode) {
        return JSON.toJSONString(userService.findByPcode(pcode));
    }

    /**
     * 通过市编码查询下属县
     * @param ccode
     * @return
     */
    @RequestMapping(value = "findCountyByCcode",produces= {"application/json;charset=utf-8"})
    public String findCountyByCcode(String ccode) {
        return JSON.toJSONString(userService.findTownByCcode(ccode));
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
        String message = Md5Util.getMessage(user.getPassword());
        user.setSalt(message);
        user.setUserCreateTime(new Date());
        return JSON.toJSONString(userService.addUserInfo(user));
    }

    @RequestMapping(value = "addSuppliers")
    public String addSuppliers(Suppliers suppliers){
        return JSON.toJSONString(userService.addSuppliers(suppliers));
    }

    /**
     * 修改用户信息
     * @param user
     * @return
     */
    @RequestMapping(value = "updateUserInfo")
    public String updateUserInfo(User user){
        user.setUserUpdateTime(new Date());
        return JSON.toJSONString(userService.updateUserInfo(user));
    }

    @RequestMapping(value = "updateSuppliers")
    public String updateSuppliers(Suppliers suppliers){
        return JSON.toJSONString(userService.updateSuppliers(suppliers));
    }

    /**
     * 上传Excel文档解析存储至数据库
     * @return
     */
    @RequestMapping(value = "importUserExcel",produces = {"application/json;charset=utf-8"})
    public String importUserExcel(@RequestParam("file") MultipartFile file) throws IOException {
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
        if (newFileName.endsWith("xls") || newFileName.endsWith("xlsx")) {
            ImportExcel excel = new ImportExcel();
            List<List<Object>> list = excel.readExcel(new File(path));
            List<User> userLists = new ArrayList<>();
            for (int i = 0; i < list.size()-1; i++) {
                User user = new User();
			/*	System.out.println(list.get(i+1).get(0).toString());
				cases.setId((int)(Double.parseDouble(list.get(i+1).get(0).toString())));*/
               /* user.set(list.get(i+1).get(1).toString());
                user.setIdCard(list.get(i+1).get(2).toString());
                casess.add(cases);*/
               user.setUserCreateTime(new Date());
               user.setUserState(0);
               userLists.add(user);
            }
           /* registrationOfCasesService.addBeachRegis(casess);*/
            //执行Service;
        }
        return "";
    }

    /**
     * 以Excel格式导出User文档
     * @return
     */
    @RequestMapping(value = "outputUserExcel")
    public String outputUserExcel(String ids,HttpServletRequest request,HttpServletResponse response) throws IOException {
      String[] head = {"用Id","用户名","用户类别","用户账号","用户密码","单位名称","联系地址","邮政编码","联系人","联系方式","邮箱"};
      String title = "用户信息";
      String fileName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date())+".xlsx";
      if (ids != null && !"".equals(ids)){
           String[] id = ids.split(",");
           List<User> userList = userService.queryUserList(id);
           ExportExcel<User> exportExcel = new ExportExcel<>();
           exportExcel.export(title,head,userList,new FileOutputStream("G://upload/excel/"+fileName));
          /*  List<Suppliers> suppliersList = userService.querySuppliersList(id);
            ExportExcel<Suppliers> exportExcelSuppliers= new ExportExcel<>();
          exportExcel.export(title,head,suppliersList,new FileOutputStream("G://upload/excel/"+fileName));*/
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
   /* @RequestMapping(value = "downloadFile")
    public void downloadFile(HttpServletRequest request ,HttpServletResponse response) throws IOException {
        String fileName = "G://upload/img/哈哈.jpg";
        InputStream inputStream = new BufferedInputStream(new FileInputStream(new File(fileName)));

        String filename = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());

        fileName = URLEncoder.encode(fileName,"UTF-8");

        response.addHeader("Content-Disposition", "attachment;filename=" + filename);

        response.setContentType("multipart/form-data");

        BufferedOutputStream outputStream = new BufferedOutputStream(response.getOutputStream());

        int len  = 0 ;
        while ((len = inputStream.read())!=-1){
            outputStream.write(len);
            outputStream.flush();
        }
        outputStream.close();
    }*/

}
