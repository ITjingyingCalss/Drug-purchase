package com.ygjy.supervision.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ygjy.dao.DrugInformationDAO;
import com.ygjy.dao.DrugTransactionStatusDAO;
import com.ygjy.dao.EnterpriseDAO;
import com.ygjy.dao.QualityLevelDAO;
import com.ygjy.pojo.*;
import com.ygjy.supervision.dao.DrugInformationMapper;
import com.ygjy.supervision.dao.DrugItemsMapper;
import com.ygjy.supervision.service.DrugInformationMaintenanceService;
import com.ygjy.supervision.service.DrugItemMaintenanceService;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class DrugInformationMaintenanceServiceImpl implements DrugInformationMaintenanceService {
    @Autowired private QualityLevelDAO qualityLevelDAO;
    @Autowired private DrugTransactionStatusDAO drugTransactionStatusDAO;
    @Autowired private EnterpriseDAO enterpriseDAO;
    @Autowired private DrugInformationDAO drugInformationDAO;
    @Autowired private DrugItemsMapper drugItemsMapper;
    @Autowired private DrugInformationMapper drugInformationMapper;
    @Autowired private DrugItemMaintenanceService drugItemMaintenanceServiceImpl;
    @Override
    public Map findQualityLevelAndDrugTradingStatus() {
        Map map = new HashMap();
        QualityLevelExample qualityLevelExample = new QualityLevelExample();
        DrugTransactionStatusExample drugTransactionStatusExample = new DrugTransactionStatusExample();
        List<QualityLevel> list_qualityLevel = qualityLevelDAO.selectByExample(qualityLevelExample);
        List<DrugTransactionStatus> list_drugTransactionStatus = drugTransactionStatusDAO.selectByExample(drugTransactionStatusExample);
        map.put("list_qualityLevel",list_qualityLevel);
        map.put("list_drugTransactionStatus",list_drugTransactionStatus);
        return map;
    }
//分页查询
    @Override
    public PageInfo findAllDrugInformation(Integer pageNum, DrugInformation drugInformation,Float startPrice,Float endPrice) {
        int count = drugInformationMapper.findDrugInformationCount();
       // System.err.println(count);
        PageHelper.startPage(pageNum, 5);
        List<DrugInformation> drugInformationList = drugInformationMapper.findAllDrugInformation(drugInformation,startPrice,endPrice);
        return new PageInfo(drugInformationList);
    }

    @Override
    public List<Enterprise> findAllEnterprise() {
        EnterpriseExample enterpriseExample = new EnterpriseExample();
        return enterpriseDAO.selectByExample(enterpriseExample);
    }

    @Override
    public Map saveDrugInformation(DrugItems drugItems, DrugInformation drugInformation) {
        Map map = new HashMap();
        if (drugInformation.getId()==null){
            map.put("drugItems",drugItems);
            DrugItems drugItems1 = drugItemsMapper.findDrugItemsByDrugItems(drugItems);
            if (drugItems1!=null){
                DrugInformationExample drugInformationExample = new DrugInformationExample();
                List<DrugInformation> list = drugInformationDAO.selectByExample(drugInformationExample);
                if (drugInformation.getSerialNumber()==null){
                    //获取随机数并判断数据库是否存在
                    String random = "";
                    random = this.redom();
                    for (DrugInformation drugInformation1:list){
                        if (random!=drugInformation1.getSerialNumber()){
                            drugInformation.setSerialNumber(random);
                        }else {
                            random = this.redom();
                        }
                    }
                }
                if (drugInformation.getDrugCategoryId()==null){
                    drugInformation.setDrugCategoryId(drugItems1.getDrugCategoryId());
                }
                int i = drugInformationMapper.insertDrugInformation(drugInformation);
                map.put("drugInformation",drugInformation);
                map.put("i",i);
            }else {
                map.put("i",0);
            }
            return map;
        }else {
            Integer i = drugInformationDAO.updateByPrimaryKeySelective(drugInformation);
            map.put("i",i);
            return map;
        }
    }
//根据ID查询
    @Override
    public DrugInformation findDrugInformationById(Integer id) {
        return drugInformationDAO.selectByPrimaryKey(id);
    }
//根据ID删除
    @Override
    public Integer updateDrugInformationState(Integer id) {
        DrugInformation drugInformation = new DrugInformation();
        drugInformation.setId(id);
        drugInformation.setDelState(1);
        return drugInformationDAO.updateByPrimaryKeySelective(drugInformation);
    }

    @Override
    public List<DrugInformation> exportDrugInformationExcle(DrugInformation drugInformation,Float startPrice,Float endPrice ) {
        return drugInformationMapper.findAllDrugInformation(drugInformation,startPrice,endPrice);
    }

    /*
     * ajax传递file转成io.file
     * */
    @Override
    public Integer multipartFileToFile(MultipartFile file) throws Exception {
        File toFile = null;
        if (file.equals("") || file.getSize() <= 0) {
            file = null;
        } else {
            InputStream ins = null;
            ins = file.getInputStream();
            toFile = new File(file.getOriginalFilename());
            OutputStream os = new FileOutputStream(toFile);
            int bytesRead = 0;
            byte[] buffer = new byte[8192];
            while ((bytesRead = ins.read(buffer, 0, 8192)) != -1) {
                os.write(buffer, 0, bytesRead);
            }
            os.close();
            ins.close();
        }
        return readExcel(toFile);
    }
    /*
     * 读取文件内容
     */
    private Integer readExcel(File file) throws IOException, ParseException {
        Workbook workbook = new HSSFWorkbook(new FileInputStream(file));
        List<List<Object>> list = new LinkedList<List<Object>>();
        Sheet sheet = workbook.getSheetAt(0);
        Object value = null;
        Row row = null;
        Cell cell = null;
        int counter = 0;
        for (int i = sheet.getFirstRowNum(); counter < sheet
                .getPhysicalNumberOfRows(); i++) {
            row = sheet.getRow(i);
            if (row == null) {
                continue;
            } else {
                counter++;
            }
            List<Object> linked = new LinkedList<Object>();
            for (int j = row.getFirstCellNum(); j <= row.getLastCellNum(); j++) {
                cell = row.getCell(j);
                if (cell == null) {
                    value = "";
                } else {
                    value = cell.toString();
                }
                linked.add(value);
            }
            list.add(linked);
        }
        System.err.println(list);
        int sum = 0;
        //循环判断文件内容是否符合要求
        Map map = drugItemMaintenanceServiceImpl.findDrugFromAndDrugCategory();
        List<Enterprise> enterpriseList = this.findAllEnterprise();
        Map map1 = this.findQualityLevelAndDrugTradingStatus();
        a:for (int i = 1; i < list.size(); i++) {
            DrugItems drugItems = new DrugItems();
            DrugInformation drugInformation = new DrugInformation();
            if (list.get(i).get(0) != null) {
                String serialNumber = (String) list.get(i).get(0);
                System.err.println(serialNumber);
                DrugInformation drugInformation1 = drugInformationMapper.findDrugInformationBySerialNumber(serialNumber);
                if (drugInformation1==null){
                    drugInformation.setSerialNumber(serialNumber);
                }else {
                    continue;
                }

            }else {
                continue;
            }
            if (list.get(i).get(1) != null) {
                String commonName = (String) list.get(i).get(1);
                drugItems.setCommonName(commonName);
                drugInformation.setCommonName(commonName);
            }else {
                continue;
            }
            if (list.get(i).get(2) != null) {
                List<DurgsFrom> list_durgsFrom = (List<DurgsFrom>) map.get("list_durgsFrom");
                //循环判断表格的剂型是否在数据库里存在
                for (DurgsFrom durgsFrom : list_durgsFrom) {
                    if (list.get(i).get(2).equals(durgsFrom.getDrugFrom())) {
                        drugItems.setDosageFormId(durgsFrom.getDurgFromId());
                        drugInformation.setDosageFormId(durgsFrom.getDurgFromId());
                        break;
                    }
                }
                //如果不存在说明填写不正确，那么此条数据作废，继续下一条
                if (drugItems.getDosageFormId()==null){
                    continue;
                }
            }else {
                continue;
            }
            if (list.get(i).get(3) != null) {
                String specification = (String) list.get(i).get(3);
                drugItems.setSpecification(specification);
                drugInformation.setSpecification(specification);
            }else {
                continue;
            }
            if (list.get(i).get(4) != null) {
                String unit = (String) list.get(i).get(4);
                drugItems.setUnit(unit);
                drugInformation.setUnit(unit);
            }else {
                continue;
            }
            if (list.get(i).get(5) != null) {
                String conversionFraction = (String) list.get(i).get(5);
                drugItems.setConversionFraction(conversionFraction);
                drugInformation.setConversionFraction(conversionFraction);
            }else {
                continue;
            }
            if (list.get(i).get(6) != null) {
                for (Enterprise enterprise : enterpriseList) {
                    if (list.get(i).get(6).equals(enterprise.getEnterpriseName())) {
                        drugInformation.setEnterpriseNameId(enterprise.getId());
                        break;
                    }
                }
            }
            if (list.get(i).get(7) != null){
                String tradeName = (String) list.get(i).get(7);
                drugInformation.setTradeName(tradeName);
            }
            if (list.get(i).get(8) != null){
                Float biddingPrice = Float.parseFloat((String )list.get(i).get(8));
                drugInformation.setBiddingPrice(biddingPrice);
            }
            if (list.get(i).get(9) != null){
                String approvalNumber = (String) list.get(i).get(9);
                drugInformation.setApprovalNumber(approvalNumber);
            }
            if (list.get(i).get(10) != null){
                String importedDrug = (String) list.get(i).get(10);
                if (importedDrug.equals("是")){
                    drugInformation.setImportedDrug(1);
                }else if (importedDrug.equals("否")){
                    drugInformation.setImportedDrug(2);
                }
            }
            if (list.get(i).get(11) != null){
                String validityOfApprovalNumber = (String) list.get(i).get(11);
                drugInformation.setValidityOfApprovalNumber(validityOfApprovalNumber);
            }
            if (list.get(i).get(12) != null){
                String packagingMaterial = (String) list.get(i).get(12);
                drugInformation.setPackagingMaterial(packagingMaterial);
            }
            if (list.get(i).get(13) != null){
                String packingUnit = (String) list.get(i).get(13);
                drugInformation.setPackingUnit(packingUnit);
            }
            if (list.get(i).get(14) != null){
                Float latestRetailPrice = Float.parseFloat((String)list.get(i).get(14));
                drugInformation.setLatestRetailPrice(latestRetailPrice);
            }
            if (list.get(i).get(15) != null){
                String sourceOfRetailPrice = (String) list.get(i).get(15);
                drugInformation.setSourceOfRetailPrice(sourceOfRetailPrice);
            }
            if (list.get(i).get(16) != null) {
                List<QualityLevel> qualityLevelList = (List<QualityLevel>) map1.get("list_qualityLevel");
                //循环判断表格的剂型是否在数据库里存在
                for (QualityLevel qualityLevel : qualityLevelList) {
                    if (list.get(i).get(16).equals(qualityLevel.getLevel())) {
                        drugInformation.setQualityLevelId(qualityLevel.getQuaId());
                        break;
                    }
                }
            }
            if (list.get(i).get(17) != null){
                String qualityLevelDescription = (String) list.get(i).get(17);
                drugInformation.setQualityLevelDescription(qualityLevelDescription);
            }
            if (list.get(i).get(18) != null){
                String drugInspectionReport = (String) list.get(i).get(18);
                if (drugInspectionReport.equals("有")){
                    drugInformation.setDrugInspectionReport(1);
                }else if (drugInspectionReport.equals("无")||drugInspectionReport.equals("没有")){
                    drugInformation.setDrugInspectionReport(2);
                }
            }
            if (list.get(i).get(19) != null){
                String drugInspectionReportNumber = (String) list.get(i).get(19);
                drugInformation.setDrugInspectionReportNumber(drugInspectionReportNumber);
            }
            if (list.get(i).get(20) != null){
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");//注意月份是MM
                Date validityOfDrugInspectionReport = simpleDateFormat.parse((String) list.get(i).get(20));
                drugInformation.setValidityOfDrugInspectionReport(validityOfDrugInspectionReport);
            }
            if (list.get(i).get(21) != null) {
                List<DrugTransactionStatus> drugTransactionStatusList = (List<DrugTransactionStatus>) map1.get("list_drugTransactionStatus");
                //循环判断表格的剂型是否在数据库里存在
                for (DrugTransactionStatus drugTransactionStatus : drugTransactionStatusList) {
                    if (list.get(i).get(21).equals(drugTransactionStatus.getDrugTransactionExplain())) {
                        drugInformation.setDrugTransactionStatusId(drugTransactionStatus.getId());
                        break;
                    }
                }
            }
            if (list.get(i).get(22) != null){
                String descriptionOfProducts = (String) list.get(i).get(22);
                drugInformation.setDescriptionOfProducts(descriptionOfProducts);
            }
            Map map2 = this.saveDrugInformation(drugItems,drugInformation);
            sum+=(int)map2.get("i");
            map2.put("sum",sum);
        }
        return sum;
    }

    //获取随机数
    public String redom(){
        Random random = new Random();
        int i = random.nextInt(1000000);
        String str = Integer.toString(i);
        return str;
    }
}
