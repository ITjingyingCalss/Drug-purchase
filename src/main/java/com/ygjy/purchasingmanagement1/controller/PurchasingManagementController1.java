package com.ygjy.purchasingmanagement1.controller;

import com.ygjy.pojo.DrugInformation;
import com.ygjy.pojo.DrugItems;
import com.ygjy.purchasingmanagement1.service.impl.DrugInformationImpl;
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
public class PurchasingManagementController1 {

    @Autowired
    DrugInformationImpl drugInformationImpl;
    @Autowired
    DrugItemsImpl drugItemsImpl;

    @ResponseBody
    @RequestMapping("/selectAll")//查询所有
    public List<DrugInformation> selectAll() {
        List<DrugInformation> drugInformations = drugInformationImpl.selectAll();
        return drugInformations;
    }

    @ResponseBody
    @RequestMapping("/selectLike")//模糊查询
    public List<DrugInformation> selectLike(Integer serialNumber, String commonName, Integer dosageFormId, String specification, String unit, String conversionFraction, Integer enterpriseNameId, String tradeName, Double biddingPrice, Integer qualityLevelId, Integer drugCategoryId, Integer drugTransactionStatusId) {
        List<DrugInformation> drugInformations = drugInformationImpl.selectLike(serialNumber, commonName, dosageFormId, specification, unit, conversionFraction, enterpriseNameId, tradeName, biddingPrice, qualityLevelId, drugCategoryId, drugTransactionStatusId);
        return drugInformations;
    }

    @ResponseBody
    @RequestMapping("/add")//添加药品
    public int addDrug(DrugInformation drugInformation) {
        int i = drugInformationImpl.addDrug(drugInformation);
        return i;
    }

    @ResponseBody
    @RequestMapping("/selectById")//Id查询
    public DrugInformation selectById(Integer id){
        DrugInformation drugInformation = drugInformationImpl.selectById(id);
        return drugInformation;
    }

    @ResponseBody
    @RequestMapping("/updateDrug")//药品修改
    public int  updateDrug(DrugInformation drugInformation){
        int i = drugInformationImpl.updateDrug(drugInformation);
        return i;
    }
    @ResponseBody
    @RequestMapping("/deleteDrug")//药品删除
    public int deleteDrug(Integer id){
        int i = drugInformationImpl.deleteDrug(id);
        return i;
    }

    @ResponseBody
    @RequestMapping("/expore")
    public String expore(HttpServletRequest request, HttpServletResponse response) {
        //如果集合.size() 为零  导出所有
        String message = "";

        //获取数据
        List<DrugInformation> list = drugInformationImpl.selectAll();

        //excel标题
        String[] title = {"序号","流水号","通用名","剂型","规格","转换系数","生产企业","商品名","中标价","单位","通用名拼音","产品照片","批准文号","批准文号有效期","是否进口药","包装材质","包装单位","最新零售价","零售价出处","质量层次编号","质量层次说明","有无药检报告","药检报告编号","药检报告有效期","产品说明","药品类别","药品交易状态","显示状态","审核状态"};

        //excel文件名
        String fileName = "123"+System.currentTimeMillis()+".xls";

        //sheet名
        String sheetName = "药品信息表";

        String [][] content = new String[list.size()][];//5 5
        for (int i = 0; i < list.size(); i++) {
            content[i] = new String[title.length];
            DrugInformation stu = list.get(i);
            content[i][0] = stu.getId()+"";
            content[i][1] = stu.getSerialNumber()+"";
            content[i][2] = stu.getCommonName()+"";
            content[i][3] = stu.getDosageFormId()+"";
            content[i][4] = stu.getSpecification()+"";
            content[i][5] = stu.getConversionFraction()+"";
            content[i][6] = stu.getEnterpriseNameId()+"";
            content[i][7] = stu.getTradeName()+"";
            content[i][8] = stu.getBiddingPrice()+"";
            content[i][9] = stu.getUnit()+"";
            content[i][10] = stu.getCommonNamePinyin()+"";
            content[i][11] = stu.getProductPicture()+"";
            content[i][12] = stu.getApprovalNumber()+"";
            content[i][13] = stu.getValidityOfApprovalNumber()+"";
            content[i][14] = stu.getImportedDrug()+"";
            content[i][15] = stu.getPackagingMaterial()+"";
            content[i][16] = stu.getPackingUnit()+"";
            content[i][17] = stu.getLatestRetailPrice()+"";
            content[i][18] = stu.getSourceOfRetailPrice()+"";
            content[i][19] = stu.getQualityLevelId()+"";
            content[i][20] = stu.getQualityLevelDescription()+"";
            content[i][21] = stu.getDrugInspectionReport()+"";
            content[i][22] = stu.getDrugInspectionReportNumber()+"";
            content[i][23] = stu.getValidityOfDrugInspectionReport()+"";
            content[i][24] = stu.getDescriptionOfProducts()+"";
            content[i][25] = stu.getDrugCategoryId()+"";
            content[i][26] = stu.getDrugTransactionStatusId()+"";
            content[i][27] = stu.getDelState()+"";
            content[i][28] = stu.getAuditStatus()+"";

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

/*-----------------------------------------------------------------------------------------*/
    @ResponseBody
    @RequestMapping("/selectItems")
    public List<DrugItems> selectItems(){
        return drugItemsImpl.selectItems();
    }

    @ResponseBody
    @RequestMapping("/selectItemsLike")
    public List<DrugItems> selectItemsLike(String drugItemsNumber,String commonName, Integer dosageFormId, String specification, String unit, String conversionFraction,Integer drugCategoryId ,String state){
        return drugItemsImpl.selectItemsLike(drugItemsNumber,commonName, dosageFormId,specification, unit,  conversionFraction, drugCategoryId ,state);
    }

    @ResponseBody
    @RequestMapping("/selectItemsId")
    public DrugItems selectItemsId(Integer itemsId){
        DrugItems drugItems = drugItemsImpl.selectByItemsId(itemsId);
        return drugItems;
    }

    @ResponseBody
    @RequestMapping("/updateDrugItems")
    public int updataDrugItems(DrugItems drugItems){
        int i = drugItemsImpl.updataDrugItems(drugItems);
        return i;
    }

    @ResponseBody
    @RequestMapping("/deleteDrugItems")
    public int deleteDrugItems(Integer itemsId){
        int i = drugItemsImpl.deleteDrugItems(itemsId);
        return i;
    }

    @ResponseBody
    @RequestMapping("/insertDrugItems")
    public int insertDrugItems(DrugItems drugItems){
        int i = drugItemsImpl.insertDrugItems(drugItems);
        return i;
    }





























    /**
     *
     * @return  采购管理主页面
     */
    @RequestMapping("/purchasing_management_index1")
    public String purchasingManagementIndex1() {
        return "purchasingmanagement1/purchasing_management_index1";
    }

    /**
     *
     * @return 药品品目管理页面
     */
    @RequestMapping("/drug_item_maintenance1")
    public String drugItemMaintenance1(){
        return "purchasingmanagement1/drug_item_maintenance1";
    }

    /**
     *
     * @return 药品信息管理页面
     */
    @RequestMapping("/drug_information_maintenance1")
    public String drugInformationMaintenance1(){
        return "purchasingmanagement1/drug_information_maintenance1";
    }

    /**
     *
     * @return  采购单审核页面
     */
    @RequestMapping("/purchase_order_approval1")
    public String purchaseOrderApproval1(){
        return "purchasingmanagement1/purchase_order_approval1";
    }

    /**
     *
     * @return  选择采购药品页面
     */
    @RequestMapping("/purchase_drug_selection1")
    public String purchaseDrugSelection1(){
        return "purchasingmanagement1/purchase_drug_selection1";
    }

    /**
     *
     * @return  采购目录维护页面
     */
    @RequestMapping("/purchase_directory_maintenance1")
    public String purchaseDirectoryMaintenance1(){
        return "purchasingmanagement1/purchase_directory_maintenance1";
    }

    /**
     *
     * @return  采购单维护页面
     */
    @RequestMapping("/po_maintenance1")
    public String poMaintenance1(){
        return "purchasingmanagement1/po_maintenance1";
    }

    /**
     *
     * @return  采购药品查询页面
     */
    @RequestMapping("/purchase_drug_inquiry1")
    public String purchaseDrugInquiry1(){
        return "purchasingmanagement1/purchase_drug_inquiry1";
    }

    /**
     *
     * @return  采购入库页面
     */
    @RequestMapping("/purchase_receipt1")
    public String purchaseReceipt1(){
        return "purchasingmanagement1/purchase_receipt1";
    }
}
