package com.ygjy.supplymanagement.pojo;

import java.io.Serializable;

/**
 * drug_transaction_status
 * @author 
 */
public class DrugTransactionStatus implements Serializable {
    private Integer id;

    /**
     * 药品交易状态
     */
    private String drugTransactionStatus;

    /**
     * 药品交易状态
     */
    private String drugTransactionExplain;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDrugTransactionStatus() {
        return drugTransactionStatus;
    }

    public void setDrugTransactionStatus(String drugTransactionStatus) {
        this.drugTransactionStatus = drugTransactionStatus;
    }

    public String getDrugTransactionExplain() {
        return drugTransactionExplain;
    }

    public void setDrugTransactionExplain(String drugTransactionExplain) {
        this.drugTransactionExplain = drugTransactionExplain;
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
        DrugTransactionStatus other = (DrugTransactionStatus) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDrugTransactionStatus() == null ? other.getDrugTransactionStatus() == null : this.getDrugTransactionStatus().equals(other.getDrugTransactionStatus()))
            && (this.getDrugTransactionExplain() == null ? other.getDrugTransactionExplain() == null : this.getDrugTransactionExplain().equals(other.getDrugTransactionExplain()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDrugTransactionStatus() == null) ? 0 : getDrugTransactionStatus().hashCode());
        result = prime * result + ((getDrugTransactionExplain() == null) ? 0 : getDrugTransactionExplain().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", drugTransactionStatus=").append(drugTransactionStatus);
        sb.append(", drugTransactionExplain=").append(drugTransactionExplain);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}