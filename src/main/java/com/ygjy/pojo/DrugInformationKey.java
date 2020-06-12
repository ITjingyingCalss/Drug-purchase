package com.ygjy.pojo;

import java.io.Serializable;

/**
 * drug_information
 * @author 
 */
public class DrugInformationKey implements Serializable {
    private Integer id;

    /**
     * 生产企业名称
     */
    private Integer enterpriseNameId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEnterpriseNameId() {
        return enterpriseNameId;
    }

    public void setEnterpriseNameId(Integer enterpriseNameId) {
        this.enterpriseNameId = enterpriseNameId;
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
        DrugInformationKey other = (DrugInformationKey) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getEnterpriseNameId() == null ? other.getEnterpriseNameId() == null : this.getEnterpriseNameId().equals(other.getEnterpriseNameId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getEnterpriseNameId() == null) ? 0 : getEnterpriseNameId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", enterpriseNameId=").append(enterpriseNameId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}