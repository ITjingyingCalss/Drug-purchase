package com.ygjy.supervision.controller;

import com.github.pagehelper.PageInfo;
import com.ygjy.pojo.*;
import com.ygjy.supervision.service.DrugInformationMaintenanceService;
import com.ygjy.supervision.service.DrugItemMaintenanceService;
import com.ygjy.supervision.vo.DrugInformationVO;
import com.ygjy.supplymanagement.utils.DateUtil;
import com.ygjy.util.ExportExcel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.thymeleaf.util.DateUtils;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/DrugInformationMaintenance")
public class DrugInformationMaintenanceController {
    @Autowired private DrugInformationMaintenanceService drugInformationMaintenanceServiceImpl;
    @Autowired private DrugItemMaintenanceService drugItemMaintenanceService;
    /*
    * 查询质量层次和药品交易状态
    * @return map*/
    @RequestMapping("/findQualityLevelAndDrugTradingStatus")
    public Map findQualityLevelAndDrugTradingStatus(){
        return drugInformationMaintenanceServiceImpl.findQualityLevelAndDrugTradingStatus();
    }
    /*
    *查询所有药品信息
     *return pageInfo
     */
    @RequestMapping("/findAllDrugInformation")
    public PageInfo findAllDrugInformation(Integer pageNum, DrugInformation drugInformation,Float startPrice,Float endPrice){
        return drugInformationMaintenanceServiceImpl.findAllDrugInformation(pageNum,drugInformation,startPrice,endPrice);
    }
    /*
    * 查出所有企业
    * rerturn list
    */
    @RequestMapping("/findAllEnterprise")
    public List<Enterprise> findAllEnterprise(){
        return drugInformationMaintenanceServiceImpl.findAllEnterprise();
    }
    /*
     * 添加药品信息
     * rerturn list
     */
    @RequestMapping("/saveDrugInformation")
    public Map saveDrugInformation(DrugItems drugItems,DrugInformation drugInformation) throws ParseException {
        //System.err.println(drugInformation);
        return drugInformationMaintenanceServiceImpl.saveDrugInformation(drugItems,drugInformation);
    }
    /*
    * 根据ID查询
    * return DrugInformation
    */
    @RequestMapping("/findDrugInformationById")
    public DrugInformation findDrugInformationById(@RequestParam(value = "id")Integer id){
        if (id!=null){
            return drugInformationMaintenanceServiceImpl.findDrugInformationById(id);
        }else {
            return null;
        }
    }
    /*
     * 根据ID删除
     * return Integer
     */
    @RequestMapping("/updateDrugInformationState")
    public Integer updateDrugInformationState(@RequestParam(value = "id")Integer id){
        if (id!=null){
            return drugInformationMaintenanceServiceImpl.updateDrugInformationState(id);
        }else {
            return null;
        }
    }
    /*
     * 导出药品信息到Excel
     */
    @RequestMapping("/exportDrugInformationExcle")
    public void exportDrugInformationExcle(HttpServletResponse response,DrugInformation drugInformation, Float startPrice, Float endPrice) throws IOException {
        List<DrugInformation> drugInformations = drugInformationMaintenanceServiceImpl.exportDrugInformationExcle(drugInformation,startPrice,endPrice);
        List<DrugInformationVO> drugInformationVOS = new ArrayList<>();
        //查出剂型，药品类别，质量层次，药品交易状态和企业名称
        Map map = drugItemMaintenanceService.findDrugFromAndDrugCategory();
        Map map1 = this.findQualityLevelAndDrugTradingStatus();
        List<Enterprise> enterpriseList = this.findAllEnterprise();
        List<DurgsFrom> durgsFromList = (List<DurgsFrom>) map.get("list_durgsFrom");
        List<DrugCategory> drugCategoryList = (List<DrugCategory>) map.get("list_drugCategory");
        List<QualityLevel> qualityLevelList = (List<QualityLevel>) map1.get("list_qualityLevel");
        List<DrugTransactionStatus> drugTransactionStatusList = (List<DrugTransactionStatus>) map1.get("list_drugTransactionStatus");
        //把导出数据存到DrugInformationVO
        for (DrugInformation drugInformation1:drugInformations){
            DrugInformationVO drugInformationVO = new DrugInformationVO();
            drugInformationVO.setSerialNumber(drugInformation1.getSerialNumber());
            drugInformationVO.setCommonName(drugInformation1.getCommonName());
            drugInformationVO.setSpecification(drugInformation1.getSpecification());
            drugInformationVO.setUnit(drugInformation1.getUnit());
            drugInformationVO.setConversionFraction(drugInformation1.getConversionFraction());
            drugInformationVO.setTradeName(drugInformation1.getTradeName());
            drugInformationVO.setBiddingPrice(drugInformation1.getBiddingPrice());
            for (int i = 0;i<durgsFromList.size();i++){
                if (drugInformation1.getDosageFormId()==durgsFromList.get(i).getDurgFromId()){
                    drugInformationVO.setDosageFormId(durgsFromList.get(i).getDrugFrom());
                    break;
                }
            }
            for (int j=0;j<drugCategoryList.size();j++){
                if (drugInformation1.getDrugCategoryId()==drugCategoryList.get(j).getDrugCategoryId()){
                    drugInformationVO.setDrugCategoryId(drugCategoryList.get(j).getDrugCategoryName());
                    break;
                }
            }
            for (QualityLevel qualityLevel:qualityLevelList){
                if (drugInformation1.getQualityLevelId()==qualityLevel.getQuaId()){
                    drugInformationVO.setQualityLevelId(qualityLevel.getLevel());
                }
            }
            for (DrugTransactionStatus drugTransactionStatus:drugTransactionStatusList){
                if (drugInformation1.getDrugTransactionStatusId()==drugTransactionStatus.getId()){
                    drugInformationVO.setDrugTransactionStatusId(drugTransactionStatus.getDrugTransactionExplain());
                }
            }
            for (Enterprise enterprise:enterpriseList){
                if (drugInformation1.getEnterpriseNameId()==enterprise.getId()){
                    drugInformationVO.setEnterpriseNameId(enterprise.getEnterpriseName());
                }
            }
            drugInformationVOS.add(drugInformationVO);
        }
        String fileName = "药品信息文档"+System.currentTimeMillis()+".xls";
        fileName= URLEncoder.encode(fileName,"utf-8");
        String[] headers = {"药品流水号","通用名","剂型","规格","单位","转换系数","生产企业","商品名称","中标价","质量层次","药品类别","交易状态"};
        response.setContentType("application/octet-stream;charset=utf-8");
        response.setHeader("Content-Disposition", "attachment;filename="+ fileName);
        OutputStream out = response.getOutputStream();
        ExportExcel exportExcel = new ExportExcel();
        exportExcel.exportExcel("药品信息文档",headers,drugInformationVOS,out,null);
    }
    /*
    * 下载药品信息模板
    */
    @RequestMapping("/downloadTemplate")
    public void downloadTemplate(HttpServletResponse response,String filenames) throws IOException {
        String path = "D:\\工作文件\\项目\\Drug-purchase\\药品信息导入说明.xls";
        // path是指欲下载的文件的路径。
        File file = new File(path);
// 取得文件名。
        String filename = file.getName();
// 取得文件的后缀名。
        String ext = filename.substring(filename.lastIndexOf(".") + 1).toUpperCase();
// 以流的形式下载文件。
        InputStream fis = new BufferedInputStream(new FileInputStream(path));
        byte[] buffer = new byte[fis.available()];
        fis.read(buffer);
        fis.close();
// 清空response
// 设置response的Header
        filename=URLEncoder.encode(filenames,"utf-8");
        response.addHeader("Content-Disposition", "attachment;filename=" + filename+".xls");
        response.addHeader("Content-Length", "" + file.length());
        OutputStream toClient = new BufferedOutputStream(response.getOutputStream());
        response.setContentType("application/octet-stream");
        toClient.write(buffer);
        toClient.flush();
        toClient.close();
    }
    @RequestMapping("/downloadTemplate1")
    public void downloadTemplate1(HttpServletResponse response,String filenames) throws IOException {
        String path = "D:\\工作文件\\项目\\Drug-purchase\\药品信息模板.xls";
        // path是指欲下载的文件的路径。
        File file = new File(path);
// 取得文件名。
        String filename = file.getName();
// 取得文件的后缀名。
        String ext = filename.substring(filename.lastIndexOf(".") + 1).toUpperCase();
// 以流的形式下载文件。
        InputStream fis = new BufferedInputStream(new FileInputStream(path));
        byte[] buffer = new byte[fis.available()];
        fis.read(buffer);
        fis.close();
// 清空response
// 设置response的Header
        filename=URLEncoder.encode(filenames,"utf-8");
        response.addHeader("Content-Disposition", "attachment;filename=" + filename+".xls");
        response.addHeader("Content-Length", "" + file.length());
        OutputStream toClient = new BufferedOutputStream(response.getOutputStream());
        response.setContentType("application/octet-stream");
        toClient.write(buffer);
        toClient.flush();
        toClient.close();
    }
    /*
     * 读取excle*/
    @RequestMapping("/readExcel")
    public Integer multipartFileToFile(@RequestParam MultipartFile file) throws Exception {
        if(file.isEmpty()){
            return 0;
        }else {
            return drugInformationMaintenanceServiceImpl.multipartFileToFile(file);
        }

    }
}
