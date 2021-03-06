package com.ygjy.purchasingmanagement1.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * drug_information
 * @author 
 */
public class DrugInformation implements Serializable {
    private Integer id;

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
    private Integer dosageFormId;

    /**
     * 规格
     */
    private String specification;

    /**
     * 转换系数
     */
    private String conversionFraction;

    /**
     * 生产企业名称
     */
    private Integer enterpriseNameId;

    /**
     * 商品名
     */
    private String tradeName;

    /**
     * 中标价
     */
    private Float biddingPrice;

    /**
     * 单位
     */
    private String unit;

    /**
     * 通用名拼音
     */
    private String commonNamePinyin;

    /**
     * 产品照片(照片相对路径)
     */
    private String productPicture;

    /**
     * 批准文号
     */
    private String approvalNumber;

    /**
     * 批准文号有效期
     */
    private String validityOfApprovalNumber;

    /**
     * 是否进口药(1：是、0：否)
     */
    private Integer importedDrug;

    /**
     * 包装材质
     */
    private String packagingMaterial;

    /**
     * 包装单位
     */
    private String packingUnit;

    /**
     * 最新零售价
     */
    private Float latestRetailPrice;

    /**
     * 零售价出处
     */
    private String sourceOfRetailPrice;

    /**
     * 质量层次id
     */
    private Integer qualityLevelId;

    /**
     * 质量层次说明
     */
    private String qualityLevelDescription;

    /**
     * 有无药品检验报告(1：有、0：无)
     */
    private Integer drugInspectionReport;

    /**
     * 药品检验报告编号
     */
    private String drugInspectionReportNumber;

    /**
     * 药品检验报告有效期（年月日）
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date validityOfDrugInspectionReport;

    /**
     * 产品说明
     */
    private String descriptionOfProducts;

    /**
     * 药品类别(1.处方药2.非处方药)
     */
    private Integer drugCategoryId;

    /**
     * 药品交易状态
     */
    private Integer drugTransactionStatusId;

    /**
     * 删除状态(0：展示，1：不展示)
     */
    private Integer delState;

    /**
     * 审核状态(0通过1不通过)
     */
    private Integer auditStatus;

    /**
     * 供货状态(0正常1不正常)
     */
    private Integer availabilityStatus;

    private static final long serialVersionUID = 1L;

    public Integer getAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(Integer availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Integer getDosageFormId() {
        return dosageFormId;
    }

    public void setDosageFormId(Integer dosageFormId) {
        this.dosageFormId = dosageFormId;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getConversionFraction() {
        return conversionFraction;
    }

    public void setConversionFraction(String conversionFraction) {
        this.conversionFraction = conversionFraction;
    }

    public Integer getEnterpriseNameId() {
        return enterpriseNameId;
    }

    public void setEnterpriseNameId(Integer enterpriseNameId) {
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

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getCommonNamePinyin() {
        return commonNamePinyin;
    }

    public void setCommonNamePinyin(String commonNamePinyin) {
        this.commonNamePinyin = commonNamePinyin;
    }

    public String getProductPicture() {
        return productPicture;
    }

    public void setProductPicture(String productPicture) {
        this.productPicture = productPicture;
    }

    public String getApprovalNumber() {
        return approvalNumber;
    }

    public void setApprovalNumber(String approvalNumber) {
        this.approvalNumber = approvalNumber;
    }

    public String getValidityOfApprovalNumber() {
        return validityOfApprovalNumber;
    }

    public void setValidityOfApprovalNumber(String validityOfApprovalNumber) {
        this.validityOfApprovalNumber = validityOfApprovalNumber;
    }

    public Integer getImportedDrug() {
        return importedDrug;
    }

    public void setImportedDrug(Integer importedDrug) {
        this.importedDrug = importedDrug;
    }

    public String getPackagingMaterial() {
        return packagingMaterial;
    }

    public void setPackagingMaterial(String packagingMaterial) {
        this.packagingMaterial = packagingMaterial;
    }

    public String getPackingUnit() {
        return packingUnit;
    }

    public void setPackingUnit(String packingUnit) {
        this.packingUnit = packingUnit;
    }

    public Float getLatestRetailPrice() {
        return latestRetailPrice;
    }

    public void setLatestRetailPrice(Float latestRetailPrice) {
        this.latestRetailPrice = latestRetailPrice;
    }

    public String getSourceOfRetailPrice() {
        return sourceOfRetailPrice;
    }

    public void setSourceOfRetailPrice(String sourceOfRetailPrice) {
        this.sourceOfRetailPrice = sourceOfRetailPrice;
    }

    public Integer getQualityLevelId() {
        return qualityLevelId;
    }

    public void setQualityLevelId(Integer qualityLevelId) {
        this.qualityLevelId = qualityLevelId;
    }

    public String getQualityLevelDescription() {
        return qualityLevelDescription;
    }

    public void setQualityLevelDescription(String qualityLevelDescription) {
        this.qualityLevelDescription = qualityLevelDescription;
    }

    public Integer getDrugInspectionReport() {
        return drugInspectionReport;
    }

    public void setDrugInspectionReport(Integer drugInspectionReport) {
        this.drugInspectionReport = drugInspectionReport;
    }

    public String getDrugInspectionReportNumber() {
        return drugInspectionReportNumber;
    }

    public void setDrugInspectionReportNumber(String drugInspectionReportNumber) {
        this.drugInspectionReportNumber = drugInspectionReportNumber;
    }

    public Date getValidityOfDrugInspectionReport() {
        return validityOfDrugInspectionReport;
    }

    public void setValidityOfDrugInspectionReport(Date validityOfDrugInspectionReport) {
        this.validityOfDrugInspectionReport = validityOfDrugInspectionReport;
    }

    public String getDescriptionOfProducts() {
        return descriptionOfProducts;
    }

    public void setDescriptionOfProducts(String descriptionOfProducts) {
        this.descriptionOfProducts = descriptionOfProducts;
    }

    public Integer getDrugCategoryId() {
        return drugCategoryId;
    }

    public void setDrugCategoryId(Integer drugCategoryId) {
        this.drugCategoryId = drugCategoryId;
    }

    public Integer getDrugTransactionStatusId() {
        return drugTransactionStatusId;
    }

    public void setDrugTransactionStatusId(Integer drugTransactionStatusId) {
        this.drugTransactionStatusId = drugTransactionStatusId;
    }

    public Integer getDelState() {
        return delState;
    }

    public void setDelState(Integer delState) {
        this.delState = delState;
    }

    public Integer getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        DrugInformation other = (DrugInformation) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSerialNumber() == null ? other.getSerialNumber() == null : this.getSerialNumber().equals(other.getSerialNumber()))
            && (this.getCommonName() == null ? other.getCommonName() == null : this.getCommonName().equals(other.getCommonName()))
            && (this.getDosageFormId() == null ? other.getDosageFormId() == null : this.getDosageFormId().equals(other.getDosageFormId()))
            && (this.getSpecification() == null ? other.getSpecification() == null : this.getSpecification().equals(other.getSpecification()))
            && (this.getConversionFraction() == null ? other.getConversionFraction() == null : this.getConversionFraction().equals(other.getConversionFraction()))
            && (this.getEnterpriseNameId() == null ? other.getEnterpriseNameId() == null : this.getEnterpriseNameId().equals(other.getEnterpriseNameId()))
            && (this.getTradeName() == null ? other.getTradeName() == null : this.getTradeName().equals(other.getTradeName()))
            && (this.getBiddingPrice() == null ? other.getBiddingPrice() == null : this.getBiddingPrice().equals(other.getBiddingPrice()))
            && (this.getUnit() == null ? other.getUnit() == null : this.getUnit().equals(other.getUnit()))
            && (this.getCommonNamePinyin() == null ? other.getCommonNamePinyin() == null : this.getCommonNamePinyin().equals(other.getCommonNamePinyin()))
            && (this.getProductPicture() == null ? other.getProductPicture() == null : this.getProductPicture().equals(other.getProductPicture()))
            && (this.getApprovalNumber() == null ? other.getApprovalNumber() == null : this.getApprovalNumber().equals(other.getApprovalNumber()))
            && (this.getValidityOfApprovalNumber() == null ? other.getValidityOfApprovalNumber() == null : this.getValidityOfApprovalNumber().equals(other.getValidityOfApprovalNumber()))
            && (this.getImportedDrug() == null ? other.getImportedDrug() == null : this.getImportedDrug().equals(other.getImportedDrug()))
            && (this.getPackagingMaterial() == null ? other.getPackagingMaterial() == null : this.getPackagingMaterial().equals(other.getPackagingMaterial()))
            && (this.getPackingUnit() == null ? other.getPackingUnit() == null : this.getPackingUnit().equals(other.getPackingUnit()))
            && (this.getLatestRetailPrice() == null ? other.getLatestRetailPrice() == null : this.getLatestRetailPrice().equals(other.getLatestRetailPrice()))
            && (this.getSourceOfRetailPrice() == null ? other.getSourceOfRetailPrice() == null : this.getSourceOfRetailPrice().equals(other.getSourceOfRetailPrice()))
            && (this.getQualityLevelId() == null ? other.getQualityLevelId() == null : this.getQualityLevelId().equals(other.getQualityLevelId()))
            && (this.getQualityLevelDescription() == null ? other.getQualityLevelDescription() == null : this.getQualityLevelDescription().equals(other.getQualityLevelDescription()))
            && (this.getDrugInspectionReport() == null ? other.getDrugInspectionReport() == null : this.getDrugInspectionReport().equals(other.getDrugInspectionReport()))
            && (this.getDrugInspectionReportNumber() == null ? other.getDrugInspectionReportNumber() == null : this.getDrugInspectionReportNumber().equals(other.getDrugInspectionReportNumber()))
            && (this.getValidityOfDrugInspectionReport() == null ? other.getValidityOfDrugInspectionReport() == null : this.getValidityOfDrugInspectionReport().equals(other.getValidityOfDrugInspectionReport()))
            && (this.getDescriptionOfProducts() == null ? other.getDescriptionOfProducts() == null : this.getDescriptionOfProducts().equals(other.getDescriptionOfProducts()))
            && (this.getDrugCategoryId() == null ? other.getDrugCategoryId() == null : this.getDrugCategoryId().equals(other.getDrugCategoryId()))
            && (this.getDrugTransactionStatusId() == null ? other.getDrugTransactionStatusId() == null : this.getDrugTransactionStatusId().equals(other.getDrugTransactionStatusId()))
            && (this.getDelState() == null ? other.getDelState() == null : this.getDelState().equals(other.getDelState()))
            && (this.getAuditStatus() == null ? other.getAuditStatus() == null : this.getAuditStatus().equals(other.getAuditStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSerialNumber() == null) ? 0 : getSerialNumber().hashCode());
        result = prime * result + ((getCommonName() == null) ? 0 : getCommonName().hashCode());
        result = prime * result + ((getDosageFormId() == null) ? 0 : getDosageFormId().hashCode());
        result = prime * result + ((getSpecification() == null) ? 0 : getSpecification().hashCode());
        result = prime * result + ((getConversionFraction() == null) ? 0 : getConversionFraction().hashCode());
        result = prime * result + ((getEnterpriseNameId() == null) ? 0 : getEnterpriseNameId().hashCode());
        result = prime * result + ((getTradeName() == null) ? 0 : getTradeName().hashCode());
        result = prime * result + ((getBiddingPrice() == null) ? 0 : getBiddingPrice().hashCode());
        result = prime * result + ((getUnit() == null) ? 0 : getUnit().hashCode());
        result = prime * result + ((getCommonNamePinyin() == null) ? 0 : getCommonNamePinyin().hashCode());
        result = prime * result + ((getProductPicture() == null) ? 0 : getProductPicture().hashCode());
        result = prime * result + ((getApprovalNumber() == null) ? 0 : getApprovalNumber().hashCode());
        result = prime * result + ((getValidityOfApprovalNumber() == null) ? 0 : getValidityOfApprovalNumber().hashCode());
        result = prime * result + ((getImportedDrug() == null) ? 0 : getImportedDrug().hashCode());
        result = prime * result + ((getPackagingMaterial() == null) ? 0 : getPackagingMaterial().hashCode());
        result = prime * result + ((getPackingUnit() == null) ? 0 : getPackingUnit().hashCode());
        result = prime * result + ((getLatestRetailPrice() == null) ? 0 : getLatestRetailPrice().hashCode());
        result = prime * result + ((getSourceOfRetailPrice() == null) ? 0 : getSourceOfRetailPrice().hashCode());
        result = prime * result + ((getQualityLevelId() == null) ? 0 : getQualityLevelId().hashCode());
        result = prime * result + ((getQualityLevelDescription() == null) ? 0 : getQualityLevelDescription().hashCode());
        result = prime * result + ((getDrugInspectionReport() == null) ? 0 : getDrugInspectionReport().hashCode());
        result = prime * result + ((getDrugInspectionReportNumber() == null) ? 0 : getDrugInspectionReportNumber().hashCode());
        result = prime * result + ((getValidityOfDrugInspectionReport() == null) ? 0 : getValidityOfDrugInspectionReport().hashCode());
        result = prime * result + ((getDescriptionOfProducts() == null) ? 0 : getDescriptionOfProducts().hashCode());
        result = prime * result + ((getDrugCategoryId() == null) ? 0 : getDrugCategoryId().hashCode());
        result = prime * result + ((getDrugTransactionStatusId() == null) ? 0 : getDrugTransactionStatusId().hashCode());
        result = prime * result + ((getDelState() == null) ? 0 : getDelState().hashCode());
        result = prime * result + ((getAuditStatus() == null) ? 0 : getAuditStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", serialNumber=").append(serialNumber);
        sb.append(", commonName=").append(commonName);
        sb.append(", dosageFormId=").append(dosageFormId);
        sb.append(", specification=").append(specification);
        sb.append(", conversionFraction=").append(conversionFraction);
        sb.append(", enterpriseNameId=").append(enterpriseNameId);
        sb.append(", tradeName=").append(tradeName);
        sb.append(", biddingPrice=").append(biddingPrice);
        sb.append(", unit=").append(unit);
        sb.append(", commonNamePinyin=").append(commonNamePinyin);
        sb.append(", productPicture=").append(productPicture);
        sb.append(", approvalNumber=").append(approvalNumber);
        sb.append(", validityOfApprovalNumber=").append(validityOfApprovalNumber);
        sb.append(", importedDrug=").append(importedDrug);
        sb.append(", packagingMaterial=").append(packagingMaterial);
        sb.append(", packingUnit=").append(packingUnit);
        sb.append(", latestRetailPrice=").append(latestRetailPrice);
        sb.append(", sourceOfRetailPrice=").append(sourceOfRetailPrice);
        sb.append(", qualityLevelId=").append(qualityLevelId);
        sb.append(", qualityLevelDescription=").append(qualityLevelDescription);
        sb.append(", drugInspectionReport=").append(drugInspectionReport);
        sb.append(", drugInspectionReportNumber=").append(drugInspectionReportNumber);
        sb.append(", validityOfDrugInspectionReport=").append(validityOfDrugInspectionReport);
        sb.append(", descriptionOfProducts=").append(descriptionOfProducts);
        sb.append(", drugCategoryId=").append(drugCategoryId);
        sb.append(", drugTransactionStatusId=").append(drugTransactionStatusId);
        sb.append(", delState=").append(delState);
        sb.append(", auditStatus=").append(auditStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}