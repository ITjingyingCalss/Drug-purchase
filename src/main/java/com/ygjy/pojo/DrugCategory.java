package com.ygjy.pojo;

import java.io.Serializable;

/**
 * drug_category
 * @author 
 */
public class DrugCategory implements Serializable {
    private Integer drugCategoryId;

    /**
     * 类别
     */
    private String drugCategoryName;

    private static final long serialVersionUID = 1L;

    public Integer getDrugCategoryId() {
        return drugCategoryId;
    }

    public void setDrugCategoryId(Integer drugCategoryId) {
        this.drugCategoryId = drugCategoryId;
    }

    public String getDrugCategoryName() {
        return drugCategoryName;
    }

    public void setDrugCategoryName(String drugCategoryName) {
        this.drugCategoryName = drugCategoryName;
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
        DrugCategory other = (DrugCategory) that;
        return (this.getDrugCategoryId() == null ? other.getDrugCategoryId() == null : this.getDrugCategoryId().equals(other.getDrugCategoryId()))
            && (this.getDrugCategoryName() == null ? other.getDrugCategoryName() == null : this.getDrugCategoryName().equals(other.getDrugCategoryName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDrugCategoryId() == null) ? 0 : getDrugCategoryId().hashCode());
        result = prime * result + ((getDrugCategoryName() == null) ? 0 : getDrugCategoryName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", drugCategoryId=").append(drugCategoryId);
        sb.append(", drugCategoryName=").append(drugCategoryName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}