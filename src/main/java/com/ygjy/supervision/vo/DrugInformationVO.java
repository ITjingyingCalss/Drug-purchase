package com.ygjy.supervision.vo;

public class DrugInformationVO {
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

    public String getEnterpriseNameId() {
        return enterpriseNameId;
    }

    public void setEnterpriseNameId(String enterpriseNameId) {
        this.enterpriseNameId = enterpriseNameId;
    }

    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    public Float getBiddingPrice() {
        return biddingPrice;
    }

    public void setBiddingPrice(Float biddingPrice) {
        this.biddingPrice = biddingPrice;
    }

    public String getQualityLevelId() {
        return qualityLevelId;
    }

    public void setQualityLevelId(String qualityLevelId) {
        this.qualityLevelId = qualityLevelId;
    }

    public String getDrugCategoryId() {
        return drugCategoryId;
    }

    public void setDrugCategoryId(String drugCategoryId) {
        this.drugCategoryId = drugCategoryId;
    }

    public String getDrugTransactionStatusId() {
        return drugTransactionStatusId;
    }

    public void setDrugTransactionStatusId(String drugTransactionStatusId) {
        this.drugTransactionStatusId = drugTransactionStatusId;
    }

    /**
     * 流水号
     */
    private String serialNumber;
    /**
     * 通用名
     */
    private String commonName;
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
     * 生产企业名称
     */
    private String enterpriseNameId;
    /**
     * 商品名
     */
    private String tradeName;
    /**
     * 中标价
     */
    private Float biddingPrice;
    /**
     * 质量层次id
     */
    private String qualityLevelId;
    /**
     * 药品类别(1.处方药2.非处方药)
     */
    private String drugCategoryId;
    /**
     * 药品交易状态
     */
    private String drugTransactionStatusId;
}
