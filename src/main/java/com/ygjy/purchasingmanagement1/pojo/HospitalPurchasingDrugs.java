package com.ygjy.purchasingmanagement1.pojo;

import com.ygjy.supplymanagement.pojo.*;
import com.ygjy.purchasingmanagement1.pojo.DrugInformation2;
import com.ygjy.supplymanagement.pojo.Hospital;
import com.ygjy.supplymanagement.pojo.Suppliers;
import com.ygjy.supplymanagement.pojo.Enterprise;
import com.ygjy.supplymanagement.pojo.PurchaseOrder;

import java.io.Serializable;

/**
 * hospital_purchasing_drugs
 * @author 
 */
public class HospitalPurchasingDrugs implements Serializable {
    private Integer id;

    /**
     * 医院id
     */
    private Integer hospitalId;

    /**
     * 药品信息id
     */
    private Integer drugInformationId;

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

    public QualityLevel getQualityLevel() {
        return qualityLevel;
    }

    public void setQualityLevel(QualityLevel qualityLevel) {
        this.qualityLevel = qualityLevel;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public EnterpriseDrugCatalog getEnterpriseDrugCatalog() {
        return enterpriseDrugCatalog;
    }

    public void setEnterpriseDrugCatalog(EnterpriseDrugCatalog enterpriseDrugCatalog) {
        this.enterpriseDrugCatalog = enterpriseDrugCatalog;
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

    public PurchaseOrderDrugDetails getPurchaseOrderDrugDetails() {
        return purchaseOrderDrugDetails;
    }

    public void setPurchaseOrderDrugDetails(PurchaseOrderDrugDetails purchaseOrderDrugDetails) {
        this.purchaseOrderDrugDetails = purchaseOrderDrugDetails;
    }

    public ReturnStatus getReturnStatus() {
        return returnStatus;
    }

    public void setReturnStatus(ReturnStatus returnStatus) {
        this.returnStatus = returnStatus;
    }

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

    /**
     * 药品供货企业id
     */
    private Integer enterpriseId;

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
    private Suppliers suppliers;
    private DrugInformation2 drugInformation2;

    public DrugInformation2 getDrugInformation2() {
        return drugInformation2;
    }

    public void setDrugInformation2(DrugInformation2 drugInformation2) {
        this.drugInformation2 = drugInformation2;
    }

    public Suppliers getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(Suppliers suppliers) {
        this.suppliers = suppliers;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(Integer hospitalId) {
        this.hospitalId = hospitalId;
    }

    public Integer getDrugInformationId() {
        return drugInformationId;
    }

    public void setDrugInformationId(Integer drugInformationId) {
        this.drugInformationId = drugInformationId;
    }

    public Integer getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(Integer enterpriseId) {
        this.enterpriseId = enterpriseId;
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
        HospitalPurchasingDrugs other = (HospitalPurchasingDrugs) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getHospitalId() == null ? other.getHospitalId() == null : this.getHospitalId().equals(other.getHospitalId()))
            && (this.getDrugInformationId() == null ? other.getDrugInformationId() == null : this.getDrugInformationId().equals(other.getDrugInformationId()))
            && (this.getEnterpriseId() == null ? other.getEnterpriseId() == null : this.getEnterpriseId().equals(other.getEnterpriseId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getHospitalId() == null) ? 0 : getHospitalId().hashCode());
        result = prime * result + ((getDrugInformationId() == null) ? 0 : getDrugInformationId().hashCode());
        result = prime * result + ((getEnterpriseId() == null) ? 0 : getEnterpriseId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", hospitalId=").append(hospitalId);
        sb.append(", drugInformationId=").append(drugInformationId);
        sb.append(", enterpriseId=").append(enterpriseId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}