package com.ygjy.supervision.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ygjy.dao.DrugCategoryDAO;
import com.ygjy.dao.DrugItemsDAO;
import com.ygjy.dao.DurgsFromDAO;
import com.ygjy.pojo.*;


import com.ygjy.supervision.dao.DrugItemsMapper;
import com.ygjy.supervision.service.DrugItemMaintenanceService;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.*;

@Service
public class DrugItemMaintenanceServiceImpl implements DrugItemMaintenanceService {


    @Autowired
    private DurgsFromDAO durgsFromDAO;
    @Autowired
    private DrugCategoryDAO drugCategoryDAO;
    @Autowired
    private DrugItemsDAO drugItemsDAO;
    @Autowired
    private DrugItemsMapper drugItemsMapper;

    @Override
    public Map findDrugFromAndDrugCategory() {
        Map map = new HashMap();
        DurgsFromExample durgsFromExample = new DurgsFromExample();
        DrugCategoryExample drugCategoryExample = new DrugCategoryExample();
        List<DurgsFrom> list_durgsFrom = durgsFromDAO.selectByExample(durgsFromExample);
        List<DrugCategory> list_drugCategory = drugCategoryDAO.selectByExample(drugCategoryExample);
        map.put("list_durgsFrom", list_durgsFrom);
        map.put("list_drugCategory", list_drugCategory);
        return map;
    }

    @Override
    public int drugItemsAdd(DrugItems drugItems) {
        System.err.println(drugItems);
        if (drugItems.getItemsId() == null) {
            int itemsId = drugItemsMapper.findMaxItemsId() + 1;
            String drugItemsNumber = "0000" + itemsId;
            drugItems.setDrugItemsNumber(drugItemsNumber);
            return drugItemsMapper.drugItemsAdd(drugItems);
        } else {
            return drugItemsDAO.updateByPrimaryKeySelective(drugItems);
        }

    }

    @Override
    public PageInfo findAllDrugItems(Integer pageNum, DrugItems drugItems) {
        int count = drugItemsMapper.findDrugItemsCount();
        PageHelper.startPage(pageNum, 5);
        List<DrugItems> list = drugItemsMapper.findAllDrugItems(drugItems);
        return new PageInfo(list);
    }

    @Override
    public DrugItems findItemsById(Integer itemsId) {
        return drugItemsDAO.selectByPrimaryKey(itemsId);
    }

    @Override
    public Integer updateItemsState(Integer itemsId) {
        return drugItemsMapper.updateItemsState(itemsId);
    }

    @Override
    public List<DrugItems> exportExcle(DrugItems drugItems) {
        return drugItemsMapper.findAllDrugItems(drugItems);
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
    /*\
    * 读取文件内容
    * */
    private Integer readExcel(File file) throws IOException {
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
        Map map = findDrugFromAndDrugCategory();
        a:for (int i = 1; i < list.size(); i++) {
            DrugItems drugItems = new DrugItems();
            if (list.get(i).get(0) != null) {
                String commonName = (String) list.get(i).get(0);
                drugItems.setCommonName(commonName);
            }else {
                continue;
            }
            if (list.get(i).get(1) != null) {
                List<DurgsFrom> list_durgsFrom = (List<DurgsFrom>) map.get("list_durgsFrom");
                //循环判断表格的剂型是否在数据库里存在
                for (DurgsFrom durgsFrom : list_durgsFrom) {
                    if (list.get(i).get(1).equals(durgsFrom.getDrugFrom())) {
                        drugItems.setDosageFormId(durgsFrom.getDurgFromId());
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
            if (list.get(i).get(2) != null) {
                String specification = (String) list.get(i).get(2);
                drugItems.setSpecification(specification);
            }else {
                continue;
            }
            if (list.get(i).get(3) != null) {
                String unit = (String) list.get(i).get(3);
                drugItems.setUnit(unit);
            }else {
                continue;
            }
            if (list.get(i).get(4) != null) {
                String conversionFraction = (String) list.get(i).get(4);
                drugItems.setConversionFraction(conversionFraction);
            }else {
                continue;
            }
            if (list.get(i).get(5) != null) {
                List<DrugCategory> list_durgsFrom = (List<DrugCategory>) map.get("list_drugCategory");
                for (DrugCategory drugCategory : list_durgsFrom) {
                    if (list.get(i).get(5).equals(drugCategory.getDrugCategoryName())) {
                        drugItems.setDrugCategoryId(drugCategory.getDrugCategoryId());
                        break;
                    }
                }
            }
            drugItems.setState(1);
            sum+= drugItemsAdd(drugItems);
        }
        return sum;
    }
}

