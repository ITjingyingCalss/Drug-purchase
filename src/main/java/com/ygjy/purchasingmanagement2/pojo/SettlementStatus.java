package com.ygjy.purchasingmanagement2.pojo;

import java.io.Serializable;

/**
 * settlement_status
 * @author 
 */
public class SettlementStatus implements Serializable {
    private Integer id;

    /**
     * 结算状态
     */
    private Integer settlementState;

    /**
     * 结算状态
     */
    private String settlementExplain;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSettlementState() {
        return settlementState;
    }

    public void setSettlementState(Integer settlementState) {
        this.settlementState = settlementState;
    }

    public String getSettlementExplain() {
        return settlementExplain;
    }

    public void setSettlementExplain(String settlementExplain) {
        this.settlementExplain = settlementExplain;
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
        SettlementStatus other = (SettlementStatus) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSettlementState() == null ? other.getSettlementState() == null : this.getSettlementState().equals(other.getSettlementState()))
            && (this.getSettlementExplain() == null ? other.getSettlementExplain() == null : this.getSettlementExplain().equals(other.getSettlementExplain()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSettlementState() == null) ? 0 : getSettlementState().hashCode());
        result = prime * result + ((getSettlementExplain() == null) ? 0 : getSettlementExplain().hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "SettlementStatus{" +
                "id=" + id +
                ", settlementState=" + settlementState +
                ", settlementExplain='" + settlementExplain + '\'' +
                '}';
    }
}