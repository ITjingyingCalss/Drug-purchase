package com.ygjy.purchasingmanagement2.pojo;

import java.io.Serializable;

/**
 * quality_level
 * @author 
 */
public class QualityLevel implements Serializable {
    private Integer quaId;

    /**
     * 质量层次
     */
    private String level;

    private static final long serialVersionUID = 1L;

    public Integer getQuaId() {
        return quaId;
    }

    public void setQuaId(Integer quaId) {
        this.quaId = quaId;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
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
        QualityLevel other = (QualityLevel) that;
        return (this.getQuaId() == null ? other.getQuaId() == null : this.getQuaId().equals(other.getQuaId()))
            && (this.getLevel() == null ? other.getLevel() == null : this.getLevel().equals(other.getLevel()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getQuaId() == null) ? 0 : getQuaId().hashCode());
        result = prime * result + ((getLevel() == null) ? 0 : getLevel().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", quaId=").append(quaId);
        sb.append(", level=").append(level);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}