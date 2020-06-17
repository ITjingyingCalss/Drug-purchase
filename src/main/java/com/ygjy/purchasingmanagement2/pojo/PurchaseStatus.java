package com.ygjy.purchasingmanagement2.pojo;

import java.io.Serializable;

/**
 * purchase_status
 * @author 
 */
public class PurchaseStatus implements Serializable {
    private Integer id;

    /**
     * 采购状态
     */
    private Integer purchasedState;

    /**
     * 采购状态
     */
    private String purchasedExplain;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPurchasedState() {
        return purchasedState;
    }

    public void setPurchasedState(Integer purchasedState) {
        this.purchasedState = purchasedState;
    }

    public String getPurchasedExplain() {
        return purchasedExplain;
    }

    public void setPurchasedExplain(String purchasedExplain) {
        this.purchasedExplain = purchasedExplain;
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
        PurchaseStatus other = (PurchaseStatus) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPurchasedState() == null ? other.getPurchasedState() == null : this.getPurchasedState().equals(other.getPurchasedState()))
            && (this.getPurchasedExplain() == null ? other.getPurchasedExplain() == null : this.getPurchasedExplain().equals(other.getPurchasedExplain()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPurchasedState() == null) ? 0 : getPurchasedState().hashCode());
        result = prime * result + ((getPurchasedExplain() == null) ? 0 : getPurchasedExplain().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", purchasedState=").append(purchasedState);
        sb.append(", purchasedExplain=").append(purchasedExplain);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}