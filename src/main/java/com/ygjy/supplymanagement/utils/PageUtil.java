package com.ygjy.supplymanagement.utils;

import java.util.List;

/**
 * @author: 赵林
 * @Date: 2020/5/18 14:28
 * @Description:
 */
public class PageUtil {

    private int pageNum;

    private int pageSize;

    private int pages;

    private int  total;

    private List<Object> list;


    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getTotal() {
        return total;

    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }
}
