package com.ygjy.supervision.vo;

public class DrugTradeQueryVO {
    private String id;
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
    /**
     * 退货量
     */
    private Integer returnsTheAmount;

    /**
     * 退货金额
     */
    private Float returnsTheMoney;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Integer getReturnsTheAmount() {
        return returnsTheAmount;
    }

    public void setReturnsTheAmount(Integer returnsTheAmount) {
        this.returnsTheAmount = returnsTheAmount;
    }

    public Float getReturnsTheMoney() {
        return returnsTheMoney;
    }

    public void setReturnsTheMoney(Float returnsTheMoney) {
        this.returnsTheMoney = returnsTheMoney;
    }
}
