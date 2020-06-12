package com.ygjy.supplymanagement.pojo;

/**
 * @author: 赵林
 * @Date: 2020/6/11 21:56
 * @Description:
 */

/**
 * 供应商表
 */
public class Suppliers {
    /**
     * 供应商id
     */
    private Integer suppliersid;
    /**
     * 供应商名字
     */
    private String suppliername;

    public Integer getSuppliersid() {
        return suppliersid;
    }

    public void setSuppliersid(Integer suppliersid) {
        this.suppliersid = suppliersid;
    }

    public String getSuppliername() {
        return suppliername;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername;
    }

    @Override
    public String toString() {
        return "Suppliers{" +
                "suppliersid=" + suppliersid +
                ", suppliername='" + suppliername + '\'' +
                '}';
    }
}
