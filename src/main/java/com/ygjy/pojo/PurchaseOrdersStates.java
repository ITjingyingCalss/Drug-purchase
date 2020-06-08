package com.ygjy.pojo;

import java.io.Serializable;

/**
 * purchase_orders_states
 * @author 
 */
public class PurchaseOrdersStates implements Serializable {
    private Integer id;

    /**
     * 采购单状态
     */
    private Integer purchaseOrdersState;

    /**
     * 采购单状态
     */
    private String purchaseOrdersExplain;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPurchaseOrdersState() {
        return purchaseOrdersState;
    }

    public void setPurchaseOrdersState(Integer purchaseOrdersState) {
        this.purchaseOrdersState = purchaseOrdersState;
    }

    public String getPurchaseOrdersExplain() {
        return purchaseOrdersExplain;
    }

    public void setPurchaseOrdersExplain(String purchaseOrdersExplain) {
        this.purchaseOrdersExplain = purchaseOrdersExplain;
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
        PurchaseOrdersStates other = (PurchaseOrdersStates) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPurchaseOrdersState() == null ? other.getPurchaseOrdersState() == null : this.getPurchaseOrdersState().equals(other.getPurchaseOrdersState()))
            && (this.getPurchaseOrdersExplain() == null ? other.getPurchaseOrdersExplain() == null : this.getPurchaseOrdersExplain().equals(other.getPurchaseOrdersExplain()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPurchaseOrdersState() == null) ? 0 : getPurchaseOrdersState().hashCode());
        result = prime * result + ((getPurchaseOrdersExplain() == null) ? 0 : getPurchaseOrdersExplain().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", purchaseOrdersState=").append(purchaseOrdersState);
        sb.append(", purchaseOrdersExplain=").append(purchaseOrdersExplain);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}