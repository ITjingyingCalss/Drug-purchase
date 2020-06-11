package com.ygjy.supplymanagement.controller;
import com.ygjy.supplymanagement.pojo.DrugInformation;
import com.ygjy.supplymanagement.service.DrugsInformationService;
import com.ygjy.supplymanagement.utils.ExcelUtil;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
@RestController
public class DrugcategoryImportController {
    @Autowired
    private DrugsInformationService drugsInformationService;
    /**
     * 导出报表
     * @return
     */
    @RequestMapping("export")
    public String export(HttpServletRequest request, HttpServletResponse response, String[] importId) throws Exception {

        String message = "";

        //获取数据
        List<DrugInformation> list = drugsInformationService.importselect(importId);

        //excel标题
        String[] title = {"流水号","通用名","剂型","规格","单位","转换系数","生产企业","商品名","中标价","质量层次","药品类别","交易状态"};

        //excel文件名
        String fileName = "药品品目详情表"+System.currentTimeMillis()+".xls";

        fileName= URLEncoder.encode(fileName, "UTF-8");

        //sheet名
        String sheetName = "药品品目详情表";

        String [][] content = new String[list.size()][];
        for (int i = 0; i < list.size(); i++) {
            content[i] = new String[title.length];
            DrugInformation stu = list.get(i);
            content[i][0] = stu.getSerialNumber()+"";
            content[i][1] = stu.getCommonName()+"";
            content[i][2] = stu.getDurgsFrom().getDrugFrom()+"";
            content[i][3] = stu.getSerialNumber()+"";
            content[i][4] = stu.getUnit()+"";
            content[i][5] = stu.getConversionFraction()+"";
            content[i][6] = stu.getEnterprise().getEnterpriseName()+"";
            content[i][7] = stu.getTradeName()+"";
            content[i][8] = stu.getBiddingPrice()+"";
            try {
                content[i][9] = stu.getQualityLevel().getLevel()+"";
                content[i][10] = stu.getDrugCategory().getDrugCategoryName()+"";
                content[i][11] = stu.getDrugTransactionStatus().getDrugTransactionExplain()+"";
            } catch (Exception e) {
                e.printStackTrace();
            }
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
            response.setHeader("Content-Disposition", "attachment;filename="+ fileName);
            response.addHeader("Pargam", "no-cache");
            response.addHeader("Cache-Control", "no-cache");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}