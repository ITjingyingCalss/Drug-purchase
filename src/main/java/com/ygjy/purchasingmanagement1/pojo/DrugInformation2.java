package com.ygjy.purchasingmanagement1.pojo;

import com.ygjy.supplymanagement.pojo.PurchaseOrder;
import com.ygjy.supplymanagement.pojo.*;

import java.io.Serializable;
import java.util.Date;

/**
 * drug_information
 * @author 
 */
public class DrugInformation2 implements Serializable {
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
     * 供应商id
     */
    private int suppliersid;
    /**
     * 药品检验报告有效期（年月日）
     */
    private Date validityOfDrugInspectionReport;

    /**
     * 产品说明
     */
    private String descriptionOfProducts;

    /**
     * 药品类别
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
     * 审核状态
     */
    private Integer auditStatus;

    public Integer getAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(Integer availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    /**
     * 供货状态(0正常1不正常)
     */
    private Integer availabilityStatus;

    /**
     * 供货商
     * @return
     */
    private Suppliers suppliers;

    public Suppliers getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(Suppliers suppliers) {
        this.suppliers = suppliers;
    }

    public Integer getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }

    private static final long serialVersionUID = 1L;
    private DrugTransactionStatus drugTransactionStatus;
    private DurgsFrom durgsFrom;
    private DrugCategory drugCategory;
    private QualityLevel qualityLevel;
    private Enterprise enterprise;
    private EnterpriseDrugCatalog enterpriseDrugCatalog;
    private HospitalTransactionDetails hospitalTransactionDetails;
    private HospitalTransactionReturn hospitalTransactionReturn;
    private Hospital hospital;
    private PurchaseOrder purchaseOrder;
    private PurchaseOrderDrugDetails purchaseOrderDrugDetails;
    private ReturnStatus returnStatus;
    private HospitalTransactionStatement hospitalTransactionStatement;
    private SettlementStatus settlementStatus;

    public HospitalTransactionStatement getHospitalTransactionStatement() {
        return hospitalTransactionStatement;
    }

    public void setHospitalTransactionStatement(HospitalTransactionStatement hospitalTransactionStatement) {
        this.hospitalTransactionStatement = hospitalTransactionStatement;
    }

    public SettlementStatus getSettlementStatus() {
        return settlementStatus;
    }

    public void setSettlementStatus(SettlementStatus settlementStatus) {
        this.settlementStatus = settlementStatus;
    }

    public ReturnStatus getReturnStatus() {
        return returnStatus;
    }

    public void setReturnStatus(ReturnStatus returnStatus) {
        this.returnStatus = returnStatus;
    }

    public PurchaseOrderDrugDetails getPurchaseOrderDrugDetails() {
        return purchaseOrderDrugDetails;
    }

    public void setPurchaseOrderDrugDetails(PurchaseOrderDrugDetails purchaseOrderDrugDetails) {
        this.purchaseOrderDrugDetails = purchaseOrderDrugDetails;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public HospitalTransactionDetails getHospitalTransactionDetails() {
        return hospitalTransactionDetails;
    }

    public void setHospitalTransactionDetails(HospitalTransactionDetails hospitalTransactionDetails) {
        this.hospitalTransactionDetails = hospitalTransactionDetails;
    }

    public HospitalTransactionReturn getHospitalTransactionReturn() {
        return hospitalTransactionReturn;
    }

    public void setHospitalTransactionReturn(HospitalTransactionReturn hospitalTransactionReturn) {
        this.hospitalTransactionReturn = hospitalTransactionReturn;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public PurchaseOrder getPurchaseOrder() {
        return purchaseOrder;
    }

    public void setPurchaseOrder(PurchaseOrder purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
    }

    public int getSuppliersid() {
        return suppliersid;
    }

    public void setSuppliersid(int suppliersid) {
        this.suppliersid = suppliersid;
    }

    public EnterpriseDrugCatalog getEnterpriseDrugCatalog() {
        return enterpriseDrugCatalog;
    }

    public void setEnterpriseDrugCatalog(EnterpriseDrugCatalog enterpriseDrugCatalog) {
        this.enterpriseDrugCatalog = enterpriseDrugCatalog;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public QualityLevel getQualityLevel() {
        return qualityLevel;
    }

    public void setQualityLevel(QualityLevel qualityLevel) {
        this.qualityLevel = qualityLevel;
    }

    public DrugTransactionStatus getDrugTransactionStatus() {
        return drugTransactionStatus;
    }

    public void setDrugTransactionStatus(DrugTransactionStatus drugTransactionStatus) {
        this.drugTransactionStatus = drugTransactionStatus;
    }

    public DurgsFrom getDurgsFrom() {
        return durgsFrom;
    }

    public void setDurgsFrom(DurgsFrom durgsFrom) {
        this.durgsFrom = durgsFrom;
    }

    public DrugCategory getDrugCategory() {
        return drugCategory;
    }

    public void setDrugCategory(DrugCategory drugCategory) {
        this.drugCategory = drugCategory;
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
        DrugInformation2 other = (DrugInformation2) that;
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
            && (this.getDelState() == null ? other.getDelState() == null : this.getDelState().equals(other.getDelState()));
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
        return result;
    }

    @Override
    public String toString() {
        return "DrugInformation{" +
                "id=" + id +
                ", serialNumber='" + serialNumber + '\'' +
                ", commonName='" + commonName + '\'' +
                ", dosageFormId=" + dosageFormId +
                ", specification='" + specification + '\'' +
                ", conversionFraction='" + conversionFraction + '\'' +
                ", enterpriseNameId=" + enterpriseNameId +
                ", tradeName='" + tradeName + '\'' +
                ", biddingPrice=" + biddingPrice +
                ", unit='" + unit + '\'' +
                ", commonNamePinyin='" + commonNamePinyin + '\'' +
                ", productPicture='" + productPicture + '\'' +
                ", approvalNumber='" + approvalNumber + '\'' +
                ", validityOfApprovalNumber='" + validityOfApprovalNumber + '\'' +
                ", importedDrug=" + importedDrug +
                ", packagingMaterial='" + packagingMaterial + '\'' +
                ", packingUnit='" + packingUnit + '\'' +
                ", latestRetailPrice=" + latestRetailPrice +
                ", sourceOfRetailPrice='" + sourceOfRetailPrice + '\'' +
                ", qualityLevelId=" + qualityLevelId +
                ", qualityLevelDescription='" + qualityLevelDescription + '\'' +
                ", drugInspectionReport=" + drugInspectionReport +
                ", drugInspectionReportNumber='" + drugInspectionReportNumber + '\'' +
                ", suppliersid=" + suppliersid +
                ", validityOfDrugInspectionReport=" + validityOfDrugInspectionReport +
                ", descriptionOfProducts='" + descriptionOfProducts + '\'' +
                ", drugCategoryId=" + drugCategoryId +
                ", drugTransactionStatusId=" + drugTransactionStatusId +
                ", delState=" + delState +
                ", auditStatus=" + auditStatus +
                ", suppliers=" + suppliers +
                ", drugTransactionStatus=" + drugTransactionStatus +
                ", durgsFrom=" + durgsFrom +
                ", drugCategory=" + drugCategory +
                ", qualityLevel=" + qualityLevel +
                ", enterprise=" + enterprise +
                ", enterpriseDrugCatalog=" + enterpriseDrugCatalog +
                ", hospitalTransactionDetails=" + hospitalTransactionDetails +
                ", hospitalTransactionReturn=" + hospitalTransactionReturn +
                ", hospital=" + hospital +
                ", purchaseOrder=" + purchaseOrder +
                ", purchaseOrderDrugDetails=" + purchaseOrderDrugDetails +
                ", returnStatus=" + returnStatus +
                ", hospitalTransactionStatement=" + hospitalTransactionStatement +
                ", settlementStatus=" + settlementStatus +
                '}';
    }
}