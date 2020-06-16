package com.ygjy.supplymanagement.controller;

import com.ygjy.supplymanagement.pojo.DrugInformation;
import com.ygjy.supplymanagement.service.DrugsInformationService;
import com.ygjy.supplymanagement.utils.ExcelUtil;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: 赵林
 * @Date: 2020/6/16 15:41
 * @Description:
 */
@RestController
public class DeliveryListExportController {
    /**
     * 导出报表
     *
     * @return
     */
    @RequestMapping("export7")
    public String export(HttpServletRequest request, HttpServletResponse response, String[] importId) throws Exception {
        String message="";
        String fileName = "发货清单表"+System.currentTimeMillis()+".xls";

        try {
            fileName= URLEncoder.encode(fileName, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        try {
            //创建工作薄
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            Workbook workbook = new HSSFWorkbook();
            Sheet sheet = workbook.createSheet();
            Sheet sheet2 = workbook.createSheet();
            Row row1 = sheet.createRow(0);
            Row row2 = sheet2.createRow(0);
            Row row3 = sheet2.createRow(1);
            Cell cell12 = row2.createCell(0);
            cell12.setCellValue("1.请在第二个表填写发货药品信息,包括采购单号,采购医院名称,药品流水号,这三项必须填写真确才可以发货");
            Cell cell13 = row3.createCell(0);
            cell13.setCellValue("2.发货药品可通过采购单处理菜单中的导出得到");
            Cell cell1 = row1.createCell(0);
            cell1.setCellValue("采购单编号");
            Cell cell2 = row1.createCell(1);
            cell2.setCellValue("采购单名称");
            Cell cell3 = row1.createCell(2);
            cell3.setCellValue("药品流水号");
            Cell cell4 = row1.createCell(3);
            cell4.setCellValue("通用名");
            Cell cell5 = row1.createCell(4);
            cell5.setCellValue("商品名称");
            Cell cell6 = row1.createCell(5);
            cell6.setCellValue("剂型");
            Cell cell7 = row1.createCell(6);
            cell7.setCellValue("规格");
            Cell cell8 = row1.createCell(7);
            cell8.setCellValue("单位");
            Cell cell9 = row1.createCell(8);
            cell9.setCellValue("转换系数");
            Cell cell10 = row1.createCell(9);
            cell10.setCellValue("生产企业");
            Cell cell11 = row1.createCell(10);
            cell11.setCellValue("采购状态");


            workbook.createSheet();
            workbook.createSheet();
            //注意工作表的名字是不能重复的不然就报错啦
            workbook.setSheetName(0, "发货清单详情表");
            workbook.setSheetName(1, "导入说明");
//            //复制某一个工作表
//            workbook.cloneSheet(2);
//            //隐藏某一个工作表 第一个参数是你需要隐藏的工作表的序列 第二个是时候隐藏true为隐藏 false为不隐藏
//            //如果你选择不隐藏 这就话就可以不要
//            workbook.setSheetHidden(1, true);
            //默认选中的工作表
            workbook.setSelectedTab(2);
            workbook.write(fileOutputStream);
            fileOutputStream.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        //创建HSSFWorkbook
//        HSSFWorkbook wb = ExcelUtil.getHSSFWorkbook(workbook, title, content, null);

        //响应到客户端
        try {
            this.setResponseHeader(response, fileName);
            OutputStream os = response.getOutputStream();
//            wb.write(os);
//            os.flush();
//            os.close();
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
            response.setHeader("Content-Disposition", "attachment;filename="+ fileName);
            response.addHeader("Pargam", "no-cache");
            response.addHeader("Cache-Control", "no-cache");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
