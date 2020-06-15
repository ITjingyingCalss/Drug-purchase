package com.ygjy.supervision.controller;

import com.alibaba.excel.EasyExcelFactory;
import com.github.pagehelper.PageInfo;
import com.ygjy.pojo.DrugCategory;
import com.ygjy.pojo.DrugItems;
import com.ygjy.pojo.DurgsFrom;
import com.ygjy.supervision.service.DrugItemMaintenanceService;
import com.ygjy.supervision.vo.DrugItemsVo;
import com.ygjy.util.ExportExcel;
import org.apache.catalina.filters.ExpiresFilter;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.util.*;

@RestController
@RequestMapping("/DrugItemMaintenanceController")
public class DrugItemMaintenanceController {
    @Autowired private DrugItemMaintenanceService drugItemMaintenanceService;
    /*
    * 加载全部药品品目信息
    * @return PageInfo
    * */
    @RequestMapping("/findAllDrugItems")
    public PageInfo findAllDrugItems (Integer pageNum,DrugItems formData){
        PageInfo pageInfo = drugItemMaintenanceService.findAllDrugItems(pageNum,formData);
        return pageInfo;
    }
    /*
    * 查询剂型和药品类别
    * @return map
    * */
    @RequestMapping("/findDrugFromAndDrugCategory")
    public Map findDrugFromAndDrugCategory (){
        Map map = drugItemMaintenanceService.findDrugFromAndDrugCategory();
        return map;
    }
    /*
    * 添加修改药品品目信息
    * @return String
    * */
    @RequestMapping("/drugItemsAdd")
    public Map drugItemsAdd (DrugItems drugItems){
        Map map = new HashMap();
        map.put("drugItems",drugItems);
            int i = drugItemMaintenanceService.drugItemsAdd(drugItems);
            if (i==1){
                map.put("value",i);
                return map;
            }else{
                map.put("value","保存失败,请尝试刷新页面重新操作");
                return map;
            }
    }
    /*
    * 根据ID查找药品品目信息
    * @return DrugItems
    * */
    @RequestMapping("/findItemsById")
    public DrugItems findItemsById(@RequestParam(value = "id")Integer itemsId){
        if (itemsId!=null){
            DrugItems drugItems = drugItemMaintenanceService.findItemsById(itemsId);
            return drugItems;
        }else{
            return null;
        }
    }
    /*
    * 根据id删除
    * @return Integer
    * */
    @RequestMapping("/updateItemsState")
    public Integer updateItemsState(@RequestParam(value = "id")Integer itemsId){
        if (itemsId!=null){
            return drugItemMaintenanceService.updateItemsState(itemsId);
        }else{
            return 0;
        }

    }
    /*
     * 导出文档
     * @return String*/
    @RequestMapping("/exportExcle")
    public void exportExcle(HttpServletResponse response,DrugItems drugItems1) throws IOException {
        List<DrugItems> list = drugItemMaintenanceService.exportExcle(drugItems1);
        List<DrugItemsVo> list_drugItemsVo = new ArrayList<>();
        Map map = this.findDrugFromAndDrugCategory();
        List<DurgsFrom> list_durgsFrom = (List<DurgsFrom>) map.get("list_durgsFrom");
        List<DrugCategory> list_drugCategory = (List<DrugCategory>) map.get("list_drugCategory");
        for (DrugItems drugItems:list) {
            DrugItemsVo drugItemsVo = new DrugItemsVo();
            drugItemsVo.setCommonName(drugItems.getCommonName());
            drugItemsVo.setConversionFraction(drugItems.getConversionFraction());
            drugItemsVo.setDrugItemsNumber(drugItems.getDrugItemsNumber());
            drugItemsVo.setSpecification(drugItems.getSpecification());
            drugItemsVo.setUnit(drugItems.getUnit());
            drugItemsVo.setState((drugItems.getState().equals("0")?"正常":"删除"));
            for (int i = 0;i<list_durgsFrom.size();i++){
                if (drugItems.getDosageFormId()==list_durgsFrom.get(i).getDurgFromId()){
                    drugItemsVo.setDosageFormId(list_durgsFrom.get(i).getDrugFrom());
                    break;
                }
            }
            for (int j=0;j<list_drugCategory.size();j++){
                if (drugItems.getDrugCategoryId()==list_drugCategory.get(j).getDrugCategoryId()){
                    drugItemsVo.setDrugCategoryId(list_drugCategory.get(j).getDrugCategoryName());
                    break;
                }
            }
            list_drugItemsVo.add(drugItemsVo);
        }
        String fileName = "药品品目文档"+System.currentTimeMillis()+".xls";
        fileName= URLEncoder.encode(fileName,"utf-8");
        String[] headers = {"药品品目号","通用名","剂型","规格","单位","转换系数","药品类别","状态"};
        response.setContentType("application/octet-stream;charset=utf-8");
        response.setHeader("Content-Disposition", "attachment;filename="+ fileName);
        OutputStream out = response.getOutputStream();
        ExportExcel exportExcel = new ExportExcel();
        exportExcel.exportExcel("测试文档",headers,list_drugItemsVo,out,null);
    }
    @RequestMapping("/downloadTemplate")
    public void downloadTemplate(HttpServletResponse response,String filenames) throws IOException {
        String path = "D:\\工作文件\\项目\\Drug-purchase\\导入说明.xls";
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
    public void downloadTemplate1(HttpServletResponse response1,String filenames) throws IOException {
        String path1 = "D:\\工作文件\\项目\\Drug-purchase\\药品品目.xls";
        String fileName = "药品品目信息模板"+System.currentTimeMillis()+".xls";
        // path是指欲下载的文件的路径。
        File file1 = new File(path1);
// 取得文件名。
        String filename1 = file1.getName();
// 取得文件的后缀名。
        String ext1 = filename1.substring(filename1.lastIndexOf(".") + 1).toUpperCase();
// 以流的形式下载文件。
        InputStream fis1 = new BufferedInputStream(new FileInputStream(path1));
        byte[] buffer1 = new byte[fis1.available()];
        fis1.read(buffer1);
        fis1.close();
// 清空response
// 设置response的Header
        filename1=URLEncoder.encode(filenames,"utf-8");
        response1.addHeader("Content-Disposition", "attachment;filename=" + filename1+".xls");
        response1.addHeader("Content-Length", "" + file1.length());
        OutputStream toClient1 = new BufferedOutputStream(response1.getOutputStream());
        response1.setContentType("application/octet-stream");
        toClient1.write(buffer1);
        toClient1.flush();
        toClient1.close();
    }
    /*
    * 读取excle*/
    @RequestMapping("/readExcel")
    public Integer multipartFileToFile(@RequestParam MultipartFile file) throws Exception {
        if(file.isEmpty()){
            return 0;
        }else {
            return drugItemMaintenanceService.multipartFileToFile(file);
        }

    }
}



