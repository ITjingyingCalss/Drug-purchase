package com.ygjy.supplymanagement.controller;

import com.ygjy.supplymanagement.pojo.DrugInformation;
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
 * @Date: 2020/6/14 23:44
 * @Description:
 */
@RestController
public class ReturnExportController {
    @Autowired
    private DrugsInformationService drugsInformationService;
    /**
     * 导出报表
     * @return
     */
    @RequestMapping("export4")
    public String export(HttpServletRequest request, HttpServletResponse response, String[] importId) throws Exception {

        String message = "";

        //获取数据
        List<DrugInformation> list = drugsInformationService.selectReturnExport(importId);
        System.out.println(list+"=======================");
        //excel标题
        String[] title = {"退货单编号","退货单名称","下单医院","开始采购时间","结束采购时间","对应菜单编号","对应采购名称","流水号","通用名","剂型","规格","单位","转换系数","生产企业","商品名","质量层次","交易价","采购量","采购金额","入库量" ,"入库金额","药品批号","药品有效期","退货量","退货金额","退货原因","退货状态","总价"};

        //excel文件名
        String fileName = "退货单详情表"+System.currentTimeMillis()+".xls";

        fileName= URLEncoder.encode(fileName, "UTF-8");

        //sheet名
        String sheetName = "退货单详情表";

        String [][] content = new String[list.size()][];
        Integer purchasedAmount=0;
        Float purchasedMoney=0.0f;
        float v=0.0f;
        for (int i = 0; i < list.size(); i++) {
            content[i] = new String[title.length];
            DrugInformation stu = list.get(i);
            String AuditStatus=stu.getHospitalTransactionReturn().getReturnStateId()==1?"未确认退货":"已确认退货";
            purchasedAmount= stu.getPurchaseOrderDrugDetails().getPurchasedAmount();
            purchasedMoney =stu.getPurchaseOrderDrugDetails().getPurchasedMoney();
            v = purchasedAmount * purchasedMoney;
            try {
                content[i][0] = stu.getHospitalTransactionReturn().getReturnOrderNumber()+"";
                content[i][1] = stu.getHospitalTransactionReturn().getReturnOrderName()+"";
                content[i][2] = stu.getHospital().getHospitalName()+"";
                content[i][3] =stu.getPurchaseOrder().getStartTime()+"";
                content[i][4] = stu.getPurchaseOrder().getEndTime()+"";
                content[i][5] = stu.getPurchaseOrder().getPurchaseOrderNumber()+"";
                content[i][6] = stu.getPurchaseOrder().getNameOfPurchaseOrder()+"";
                content[i][7] = stu.getSerialNumber()+"";
                content[i][8] = stu.getCommonName()+"";
                content[i][9] = stu.getDurgsFrom().getDrugFrom()+"";
                content[i][10] = stu.getSpecification()+"";
                content[i][11] = stu.getUnit()+"";
                content[i][12] = stu.getConversionFraction()+"";
                content[i][13] = stu.getEnterprise().getEnterpriseName()+"";
                content[i][14] = stu.getTradeName()+"";
                content[i][15] = stu.getQualityLevel().getLevel()+"";
                content[i][16] =stu.getHospitalTransactionDetails().getTransactionPrice()+"";
                content[i][17] =stu.getPurchaseOrderDrugDetails().getPurchasedAmount()+"";
                content[i][18] =stu.getPurchaseOrderDrugDetails().getPurchasedMoney()+"";
                content[i][19] =stu.getHospitalTransactionDetails().getReceiptAmount()+"";
                content[i][20] =stu.getHospitalTransactionDetails().getReceiptMoney()+"";
                content[i][21] =stu.getHospitalTransactionDetails().getDrugBatchNumber()+"";
                content[i][22] =stu.getHospitalTransactionDetails().getDrugValidity()+"";
                content[i][23] =stu.getHospitalTransactionDetails().getReturnsTheAmount()+"";
                content[i][24] =stu.getHospitalTransactionDetails().getReturnsTheMoney()+"";
                content[i][25] =stu.getHospitalTransactionDetails().getReasonForReturn()+"";
                content[i][26] =AuditStatus+"";
                content[i][27] =v+"￥";
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
