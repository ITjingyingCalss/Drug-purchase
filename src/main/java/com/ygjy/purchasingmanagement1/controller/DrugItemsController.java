package com.ygjy.purchasingmanagement1.controller;

import com.ygjy.pojo.DrugItems;
import com.ygjy.purchasingmanagement1.service.impl.DrugItemsImpl;
import com.ygjy.util.ExcelUtil;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;

@Controller
public class DrugItemsController {

    @Autowired
    DrugItemsImpl drugItemsImpl;

    /**
     * 药品品目的导出实现
     * @param request
     * @param response
     * @return
     */
    @ResponseBody
    @RequestMapping("/expor")
    public String expor(HttpServletRequest request, HttpServletResponse response) {
        //如果集合.size() 为零  导出所有
        String message = "";

        //获取数据
        List<DrugItems> list = drugItemsImpl.selectItems();

        //excel标题
        String[] title = {"序号","药品品目号","通用名","剂型","规格","单位","转换系数","药品类别","状态"};

        //excel文件名
        String fileName = "123"+System.currentTimeMillis()+".xls";

        //sheet名
        String sheetName = "药品品目信息表";

        String [][] content = new String[list.size()][];//5 5
        for (int i = 0; i < list.size(); i++) {
            content[i] = new String[title.length];
            DrugItems stu = list.get(i);
            content[i][0] = stu.getItemsId()+"";
            content[i][1] = stu.getDrugItemsNumber()+"";
            content[i][2] = stu.getCommonName()+"";
            content[i][3] = stu.getDosageFormId()+"";
            content[i][4] = stu.getSpecification()+"";
            content[i][5] = stu.getUnit()+"";
            content[i][6] = stu.getConversionFraction()+"";
            content[i][7] = stu.getDrugCategoryId()+"";
            content[i][8] = stu.getState()+"";
        }

        //创建HSSFWorkbook
        HSSFWorkbook wb = ExcelUtil.getHSSFWorkbook(sheetName, title, content, null);
        //响应到客户端
        try {
            this.setResponseHeader(response, fileName);
            OutputStream os = response.getOutputStream();
            wb.write(os);
            os.flush();
            os.close();
            message = "SUCCESS";
        } catch (Exception e) {
            e.printStackTrace();
            message = "ERROR";
        }
        return null;
    }

    //发送响应流方法
    public void setResponseHeader(HttpServletResponse response, String fileName) {
        try {
            try {
                fileName = new String(fileName.getBytes(),"utf-8");
            } catch (UnsupportedEncodingException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            response.setContentType("application/octet-stream;charset=utf-8");
            response.setHeader("Content-Disposition","attachment;filename="+ fileName);
            response.addHeader("Pargam","no-cache");
            response.addHeader("Cache-Control","no-cache");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
