package com.ygjy.systemmanagement.util;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.formula.functions.T;

import javax.servlet.http.HttpServlet;

/**
 * Created by IntelliJ IDEA.
 * User: zhaozhiqiang
 * Date: 2020/6/11
 * Desc: 导出Excel
 */
public class  ExportExcel<T>{

    public void export(String title,String[] head,List<T> dataList,OutputStream outputStream) {
        export(title, head, dataList, outputStream,"yyyy-MM-dd");
    }

    public void export(String title,String[] headers,Collection<T> data,OutputStream outputStream,String pattern) {
        //创建工作薄
        HSSFWorkbook workbook = new HSSFWorkbook();
        //表
        HSSFSheet sheet = workbook.createSheet("工作表");
        //行
        HSSFRow row = sheet.createRow(0);
        //单元格
        for (int i = 0; i < headers.length; i++) {
            HSSFCell cell = row.createCell(i);
            cell.setCellValue(headers[i]);
        }
        //遍历数据
        Iterator<T> iterator = data.iterator();
        int index = 0;
        while (iterator.hasNext()) {
            index++;
            row = sheet.createRow(index);
            T t = iterator.next();
            //通过反射赋值
            Field[] fields = t.getClass().getDeclaredFields();
            for (int i = 0; i < fields.length; i++) {
                HSSFCell cell = row.createCell(i);
                Field field = fields[i];
                String fileName = field.getName();
                String getMethod = "get" + fileName.substring(0,1).toUpperCase()+ fileName.substring(1);
                try {
                    Class<T> class1 = (Class<T>) t.getClass();
                    Method method = class1.getMethod(getMethod, new Class[] {});
                    Object value  = method.invoke(t, new Object[] {});
                    String textValue = "";
                    if (value!=null) {
                        textValue = value.toString();
                    }
                    cell.setCellValue(textValue);
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
        try {
            workbook.write(outputStream);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
