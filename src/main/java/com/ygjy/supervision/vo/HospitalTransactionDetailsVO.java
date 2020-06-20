package com.ygjy.supervision.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class HospitalTransactionDetailsVO {
    private String id;
    private String hospitalId;
    /**
     * 采购单编号
     */
    private String purchaseOrderNumber;

    /**
     * 采购单名称
     */
    private String nameOfPurchaseOrder;
    /**
     * 开始时间
     */
    private String startTime;
    /**
     * 结束时间
     */
    private String endTime;
    /**
     * 流水号
     */
    private String serialNumber;
    /**
     * 通用名
     */
    private String commonName;
    /**
     * 商品名
     */
    private String tradeName;
    /**
     * 剂型表id
     */
    private String dosageFormId;
    /**
     * 规格
     */
    private String specification;
    /**
     * 单位
     */
    private String unit;
    /**
     * 转换系数
     */
    private String conversionFraction;
    /**
     * 质量层次id
     */
    private String qualityLevelId;
    /**
     * 供货企业id
     */
    private String enterpriseId;
    /**
     * 中标价
     */
    private Float biddingPrice;
    /**
     * 交易价
     */
    private Float transactionPrice;

    /**
     * 采购量
     */
    private Integer purchasedAmount;
    private Float purchasedMoney;
    /**
     * 采购状态
     */
    private String purchasedState;
    /**
     * 入库量
     */
    private Integer receiptAmount;
    /**
     * 入库金额
     */
    private Float receiptMoney;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getPurchaseOrderNumber() {
        return purchaseOrderNumber;
    }

    public void setPurchaseOrderNumber(String purchaseOrderNumber) {
        this.purchaseOrderNumber = purchaseOrderNumber;
    }

    public String getNameOfPurchaseOrder() {
        return nameOfPurchaseOrder;
    }

    public void setNameOfPurchaseOrder(String nameOfPurchaseOrder) {
        this.nameOfPurchaseOrder = nameOfPurchaseOrder;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    public String getDosageFormId() {
        return dosageFormId;
    }

    public void setDosageFormId(String dosageFormId) {
        this.dosageFormId = dosageFormId;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getConversionFraction() {
        return conversionFraction;
    }

    public void setConversionFraction(String conversionFraction) {
        this.conversionFraction = conversionFraction;
    }

    public String getQualityLevelId() {
        return qualityLevelId;
    }

    public void setQualityLevelId(String qualityLevelId) {
        this.qualityLevelId = qualityLevelId;
    }

    public String getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public Float getBiddingPrice() {
        return biddingPrice;
    }

    public void setBiddingPrice(Float biddingPrice) {
        this.biddingPrice = biddingPrice;
    }

    public Float getTransactionPrice() {
        return transactionPrice;
    }

    public void setTransactionPrice(Float transactionPrice) {
        this.transactionPrice = transactionPrice;
    }

    public Integer getPurchasedAmount() {
        return purchasedAmount;
    }

    public void setPurchasedAmount(Integer purchasedAmount) {
        this.purchasedAmount = purchasedAmount;
    }

    public Float getPurchasedMoney() {
        return purchasedMoney;
    }

    public void setPurchasedMoney(Float purchasedMoney) {
        this.purchasedMoney = purchasedMoney;
    }

    public String getPurchasedState() {
        return purchasedState;
    }

    public void setPurchasedState(String purchasedState) {
        this.purchasedState = purchasedState;
    }

    public Integer getReceiptAmount() {
        return receiptAmount;
    }

    public void setReceiptAmount(Integer receiptAmount) {
        this.receiptAmount = receiptAmount;
    }

    public Float getReceiptMoney() {
        return receiptMoney;
    }

    public void setReceiptMoney(Float receiptMoney) {
        this.receiptMoney = receiptMoney;
    }
}
