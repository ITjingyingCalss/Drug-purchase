package com.ygjy.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFormulaEvaluator;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellValue;
 
public class ExcelUtil {
 
    /**
     * 导出Excel
     * @param sheetName sheet名称
     * @param title 标题
     * @param values 内容
     * @param wb HSSFWorkbook对象
     * @return  HSSF ：2003 XSSF ：2007
     */
    public static HSSFWorkbook getHSSFWorkbook(String sheetName,String []title,String [][]values, HSSFWorkbook wb){
 
        // 第一步，创建一个HSSFWorkbook，对应一个Excel文件
        if(wb == null){
            wb = new HSSFWorkbook();
        }
 
        // 第二步，在workbook中添加一个sheet,对应Excel文件中的sheet
        HSSFSheet sheet = wb.createSheet(sheetName);
         
        // 第三步，在sheet中添加表头第0行,注意老版本poi对Excel的行数列数有限制
        HSSFRow row = sheet.createRow(0);
        row.setHeightInPoints(20);//目的是想把行高设置成20px
        // 第四步，创建单元格，并设置值表头 设置表头居中
        HSSFCellStyle style = wb.createCellStyle();
        //自动换行
        style.setWrapText(true);
        //存储最大列宽
        Map<Integer,Integer> maxWidth = new HashMap<Integer,Integer>();
        
        style.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 创建一个居中格式
        //声明列对象
        HSSFCell cell = null; 
        
        for (int k = 0; k < title.length; k++) {
            sheet.autoSizeColumn(k);
        }
 
        //创建标题
        for(int i=0;i<title.length;i++){
            cell = row.createCell(i);
            cell.setCellValue(title[i]);
            cell.setCellStyle(style);
            maxWidth.put(i,cell.getStringCellValue().getBytes().length  * 256 + 200);
            row.getCell(i).setCellStyle(style);//设置自动换行row
        }
  
        //创建内容
        for(int i=0;i<values.length;i++){
            row = sheet.createRow(i + 1);
            for(int j=0;j<values[i].length;j++){
            	//获取最大列宽
            	  int length = cell.getStringCellValue().getBytes().length  * 256 + 200;
                //将内容按顺序赋给对应的列对象
                row.createCell(j).setCellValue(values[i][j]);
                
                //这里把宽度最大限制到15000  
                if (length>15000){  
                    length = 15000;  
                }  
                maxWidth.put(j,Math.max(length,maxWidth.get(j)));
                cell.setCellStyle(style); 
            }
        }
        // 列宽自适应  
        for (int i = 0; i < title.length; i++) {  
            sheet.setColumnWidth(i,maxWidth.get(i));  
        }  
        return wb;
    }
    
    
    
 // 自适应宽度(中文支持)
    /*private static void setSizeColumn(HSSFSheet sheet, int size) {
        for (int columnNum = 0; columnNum < size; columnNum++) {
            int columnWidth = sheet.getColumnWidth(columnNum) / 256;
            for (int rowNum = 0; rowNum < sheet.getLastRowNum(); rowNum++) {
                HSSFRow currentRow;
                //当前行未被使用过
                if (sheet.getRow(rowNum) == null) {
                    currentRow = sheet.createRow(rowNum);
                } else {
                    currentRow = sheet.getRow(rowNum);
                }
 
                if (currentRow.getCell(columnNum) != null) {
                    HSSFCell currentCell = currentRow.getCell(columnNum);
                    if (currentCell.getCellType() == HSSFCell.CELL_TYPE_STRING) {
                        int length = currentCell.getStringCellValue().getBytes().length;
                        if (columnWidth < length) {
                            columnWidth = length;
                        }
                    }
                }
            }
            sheet.setColumnWidth(columnNum, columnWidth * 256);
        }
    }*/
    
    
    
    
}