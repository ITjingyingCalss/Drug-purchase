package com.ygjy.purchasingmanagement2.pojo;

import java.io.Serializable;

/**
 * return_status
 * @author 
 */
public class ReturnStatus implements Serializable {
    private Integer id;

    /**
     * 退货状态
     */
    private Integer returnOfState;

    /**
     * 退货状态
     */
    private String returnOfExplain;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getReturnOfState() {
        return returnOfState;
    }

    public void setReturnOfState(Integer returnOfState) {
        this.returnOfState = returnOfState;
    }

    public String getReturnOfExplain() {
        return returnOfExplain;
    }

    public void setReturnOfExplain(String returnOfExplain) {
        this.returnOfExplain = returnOfExplain;
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
        ReturnStatus other = (ReturnStatus) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getReturnOfState() == null ? other.getReturnOfState() == null : this.getReturnOfState().equals(other.getReturnOfState()))
            && (this.getReturnOfExplain() == null ? other.getReturnOfExplain() == null : this.getReturnOfExplain().equals(other.getReturnOfExplain()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getReturnOfState() == null) ? 0 : getReturnOfState().hashCode());
        result = prime * result + ((getReturnOfExplain() == null) ? 0 : getReturnOfExplain().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", returnOfState=").append(returnOfState);
        sb.append(", returnOfExplain=").append(returnOfExplain);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}