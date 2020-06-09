package com.ygjy.supplymanagement.pojo;

import java.io.Serializable;

/**
 * jurisdiction
 * @author 
 */
public class Jurisdiction implements Serializable {
    private Integer jurId;

    /**
     * 权限
     */
    private String jurisd;

    /**
     * 权限说明
     */
    private String description;

    /**
     * 删除状态（1：删除，0：不删除）
     */
    private String delState;

    private static final long serialVersionUID = 1L;

    public Integer getJurId() {
        return jurId;
    }

    public void setJurId(Integer jurId) {
        this.jurId = jurId;
    }

    public String getJurisd() {
        return jurisd;
    }

    public void setJurisd(String jurisd) {
        this.jurisd = jurisd;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDelState() {
        return delState;
    }

    public void setDelState(String delState) {
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
        Jurisdiction other = (Jurisdiction) that;
        return (this.getJurId() == null ? other.getJurId() == null : this.getJurId().equals(other.getJurId()))
            && (this.getJurisd() == null ? other.getJurisd() == null : this.getJurisd().equals(other.getJurisd()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getDelState() == null ? other.getDelState() == null : this.getDelState().equals(other.getDelState()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getJurId() == null) ? 0 : getJurId().hashCode());
        result = prime * result + ((getJurisd() == null) ? 0 : getJurisd().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getDelState() == null) ? 0 : getDelState().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", jurId=").append(jurId);
        sb.append(", jurisd=").append(jurisd);
        sb.append(", description=").append(description);
        sb.append(", delState=").append(delState);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}