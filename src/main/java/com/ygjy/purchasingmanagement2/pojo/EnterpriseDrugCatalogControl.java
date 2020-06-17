package com.ygjy.purchasingmanagement2.pojo;

import java.io.Serializable;

/**
 * enterprise_drug_catalog_control
 * @author 
 */
public class EnterpriseDrugCatalogControl implements Serializable {
    private Integer id;

    /**
     * 企业id
     */
    private Integer enterpriseId;

    /**
     * 药品信息id
     */
    private Integer drugInformationId;

    /**
     * 监督机构控制状态(1：正常 ,2：暂停)
     */
    private Integer controlsTheState;

    /**
     * 监督机构意见
     */
    private String opinionsOfSupervisory;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(Integer enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public Integer getDrugInformationId() {
        return drugInformationId;
    }

    public void setDrugInformationId(Integer drugInformationId) {
        this.drugInformationId = drugInformationId;
    }

    public Integer getControlsTheState() {
        return controlsTheState;
    }

    public void setControlsTheState(Integer controlsTheState) {
        this.controlsTheState = controlsTheState;
    }

    public String getOpinionsOfSupervisory() {
        return opinionsOfSupervisory;
    }

    public void setOpinionsOfSupervisory(String opinionsOfSupervisory) {
        this.opinionsOfSupervisory = opinionsOfSupervisory;
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
        EnterpriseDrugCatalogControl other = (EnterpriseDrugCatalogControl) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getEnterpriseId() == null ? other.getEnterpriseId() == null : this.getEnterpriseId().equals(other.getEnterpriseId()))
            && (this.getDrugInformationId() == null ? other.getDrugInformationId() == null : this.getDrugInformationId().equals(other.getDrugInformationId()))
            && (this.getControlsTheState() == null ? other.getControlsTheState() == null : this.getControlsTheState().equals(other.getControlsTheState()))
            && (this.getOpinionsOfSupervisory() == null ? other.getOpinionsOfSupervisory() == null : this.getOpinionsOfSupervisory().equals(other.getOpinionsOfSupervisory()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getEnterpriseId() == null) ? 0 : getEnterpriseId().hashCode());
        result = prime * result + ((getDrugInformationId() == null) ? 0 : getDrugInformationId().hashCode());
        result = prime * result + ((getControlsTheState() == null) ? 0 : getControlsTheState().hashCode());
        result = prime * result + ((getOpinionsOfSupervisory() == null) ? 0 : getOpinionsOfSupervisory().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", enterpriseId=").append(enterpriseId);
        sb.append(", drugInformationId=").append(drugInformationId);
        sb.append(", controlsTheState=").append(controlsTheState);
        sb.append(", opinionsOfSupervisory=").append(opinionsOfSupervisory);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}