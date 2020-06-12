package com.ygjy.systemmanagement.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * Created by IntelliJ IDEA.
 * User: zhaozhiqiang
 * Date: 2020/6/11
 * Desc: 导入Excel解析
 */
public class ImportExcel {

    /**
     * 对外提供读取excel 的方法
     * */
    public static List<List<Object>> readExcel(File file) throws IOException {
        String fileName = file.getName();
        String extension = fileName.lastIndexOf(".") == -1 ? "" : fileName
                .substring(fileName.lastIndexOf(".") + 1);
        if ("xls".equals(extension)) {
            HSSFWorkbook hwb = new HSSFWorkbook(new FileInputStream(file));
            HSSFSheet sheet = hwb.getSheetAt(0);
            return readExcel(sheet);
        } else if ("xlsx".equals(extension)) {
            XSSFWorkbook xwb = new XSSFWorkbook(new FileInputStream(file));
            // 读取第一章表格内容
            XSSFSheet sheet = xwb.getSheetAt(0);
            return readExcel(sheet);
        } else {
            throw new IOException("不支持的文件类型");
        }
    }


    private static List<List<Object>> readExcel(Sheet sheet)
            throws IOException {
        List<List<Object>> list = new LinkedList<List<Object>>();

        Object value = null;
        Row row = null;
        Cell cell = null;

        for (int i = sheet.getFirstRowNum(); i < sheet
                .getPhysicalNumberOfRows(); i++) {
            row = sheet.getRow(i);
            if (row == null) {
                continue;
            }
            List<Object> linked = new LinkedList<Object>();
            for (int j = row.getFirstCellNum(); j <= row.getLastCellNum(); j++) {
                cell = row.getCell(j);
                if (cell == null) {
                    value = "";
                }else {

                    value = cell.toString();
                }
                if (value == null || "".equals(value)) {
                    continue;
                }
                linked.add(value);
            }
            list.add(linked);
        }
        return list;
    }


    public static void main(String[] args) {
        try {
            List<List<Object>> list = readExcel(new File("G:\\upload/excel/20200611053614.xlsx"));
            for (List<Object> list2 : list) {
                for (Object list3 : list2) {
                    System.out.print(list3);
                }
                System.out.println();
            }
            // readExcel(new File("D:\\test.xls"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
