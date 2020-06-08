package com.ygjy.pojo;

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

    /**
     * 药品供货企业id
     */
    private Integer enterpriseId;

    private static final long serialVersionUID = 1L;

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