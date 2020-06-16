package com.ygjy.systemmanagement.pojo;

public class Suppliers {
    private Integer id;

    private Integer suppliersId;

    private String suppliersStatus;

    private String supplierName;

    private String supplierPhone;

    private String supplierEmail;

    private String supplierAddress;

    private String supplierPostcode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSuppliersId() {
        return suppliersId;
    }

    public void setSuppliersId(Integer suppliersId) {
        this.suppliersId = suppliersId;
    }

    public String getSuppliersStatus() {
        return suppliersStatus;
    }

    public void setSuppliersStatus(String suppliersStatus) {
        this.suppliersStatus = suppliersStatus == null ? null : suppliersStatus.trim();
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName == null ? null : supplierName.trim();
    }

    public String getSupplierPhone() {
        return supplierPhone;
    }

    public void setSupplierPhone(String supplierPhone) {
        this.supplierPhone = supplierPhone == null ? null : supplierPhone.trim();
    }

    public String getSupplierEmail() {
        return supplierEmail;
    }

    public void setSupplierEmail(String supplierEmail) {
        this.supplierEmail = supplierEmail == null ? null : supplierEmail.trim();
    }

    public String getSupplierAddress() {
        return supplierAddress;
    }

    public void setSupplierAddress(String supplierAddress) {
        this.supplierAddress = supplierAddress == null ? null : supplierAddress.trim();
    }

    public String getSupplierPostcode() {
        return supplierPostcode;
    }

    public void setSupplierPostcode(String supplierPostcode) {
        this.supplierPostcode = supplierPostcode == null ? null : supplierPostcode.trim();
    }
}