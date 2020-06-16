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

/**
 * @author: 赵林
 * @Date: 2020/6/16 14:34
 * @Description:
 */
@RestController
public class PurchaseorderExportController {
    @Autowired
    private DrugsInformationService drugsInformationService;
    /**
     * 导出报表
     * @return
     */
    @RequestMapping("export6")
    public String export(HttpServletRequest request, HttpServletResponse response, String[] importId) throws Exception {

        String message = "";

        //获取数据
        List<DrugInformation> list = drugsInformationService.selectPurchaseOrderProcessingExport(importId);
        System.out.println(list+"=======================");
        //excel标题
        String[] title = {"采购单编号","采购单名称","采购医院","开始采购时间","结束采购时间","流水号","通用名","剂型","规格","单位","转换系数","生产企业","中标价","交易价","采购量","采购金额","供货企业" ,"采购状态"};

        //excel文件名
        String fileName = "采购单详情表"+System.currentTimeMillis()+".xls";

        fileName= URLEncoder.encode(fileName, "UTF-8");

        //sheet名
        String sheetName = "采购单详情表";
        String purchaseOrdersStatesId="";
        String [][] content = new String[list.size()][];
        for (int i = 0; i < list.size(); i++) {
            content[i] = new String[title.length];
            DrugInformation stu = list.get(i);
            purchaseOrdersStatesId=stu.getPurchaseOrderDrugDetails().getPurchaseOrdersStatesId().toString();
            if(purchaseOrdersStatesId=="1"){
                purchaseOrdersStatesId="未确认送货";
            }
            if(purchaseOrdersStatesId=="2"){
                purchaseOrdersStatesId="已发货";
            }
            if(purchaseOrdersStatesId=="3"){
                purchaseOrdersStatesId="已入库";
            }
            if(purchaseOrdersStatesId=="4"){
                purchaseOrdersStatesId="无法供货";
            }
            if(purchaseOrdersStatesId=="5"){
                purchaseOrdersStatesId="到期无法供货";
            }
            try {
                content[i][0] = stu.getPurchaseOrder().getPurchaseOrderNumber()+"";
                content[i][1] = stu.getPurchaseOrder().getNameOfPurchaseOrder()+"";
                content[i][2] = stu.getHospital().getHospitalName()+"";
                content[i][3] = stu.getPurchaseOrder().getCreateReceiptsTimes()+"";
                content[i][4] = stu.getPurchaseOrder().getSubmissionTimes()+"";
                content[i][5] = stu.getSerialNumber()+"";
                content[i][6] = stu.getCommonName()+"";
                content[i][7] = stu.getDurgsFrom().getDrugFrom()+"";
                content[i][8] = stu.getSpecification()+"";
                content[i][9] = stu.getUnit()+"";
                content[i][10] = stu.getConversionFraction()+"";
                content[i][11] = stu.getEnterprise().getEnterpriseName()+"";
                content[i][12] = stu.getPurchaseOrderDrugDetails().getBiddingPrice()+"";
                content[i][13] =stu.getHospitalTransactionDetails().getTransactionPrice()+"";
                content[i][14] =stu.getPurchaseOrderDrugDetails().getPurchasedAmount()+"";
                content[i][15] =stu.getPurchaseOrderDrugDetails().getPurchasedMoney()+"";
                content[i][16] =stu.getEnterprise().getEnterpriseName()+"";
                content[i][17] =purchaseOrdersStatesId+"";
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
