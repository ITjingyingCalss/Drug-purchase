package com.ygjy.purchasingmanagement2.pojo;

import java.io.Serializable;

/**
 * tright
 * @author 
 */
public class Tright implements Serializable {
    private Integer trId;

    /**
     * 权限名称
     */
    private String rightName;

    /**
     * 权限描述
     */
    private String description;

    private static final long serialVersionUID = 1L;

    public Integer getTrId() {
        return trId;
    }

    public void setTrId(Integer trId) {
        this.trId = trId;
    }

    public String getRightName() {
        return rightName;
    }

    public void setRightName(String rightName) {
        this.rightName = rightName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        Tright other = (Tright) that;
        return (this.getTrId() == null ? other.getTrId() == null : this.getTrId().equals(other.getTrId()))
            && (this.getRightName() == null ? other.getRightName() == null : this.getRightName().equals(other.getRightName()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTrId() == null) ? 0 : getTrId().hashCode());
        result = prime * result + ((getRightName() == null) ? 0 : getRightName().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", trId=").append(trId);
        sb.append(", rightName=").append(rightName);
        sb.append(", description=").append(description);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}