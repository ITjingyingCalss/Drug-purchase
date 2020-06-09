package com.ygjy.supplymanagement.pojo;

import java.io.Serializable;

/**
 * hospital_transaction_statement_details
 * @author 
 */
public class HospitalTransactionStatementDetails implements Serializable {
    private Integer id;

    /**
     * 采购单id
     */
    private Integer purchaseOrdersId;

    /**
     * 药品信息id
     */
    private Integer drugInformationId;

    /**
     * 医院交易结算单id
     */
    private Integer hospitalTransactionStatementId;

    /**
     * Settle_accounts
     */
    private Integer settleAccounts;

    /**
     * 结算金额
     */
    private Float settlementMoney;

    /**
     * 结算状态id
     */
    private Integer settlementStateId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPurchaseOrdersId() {
        return purchaseOrdersId;
    }

    public void setPurchaseOrdersId(Integer purchaseOrdersId) {
        this.purchaseOrdersId = purchaseOrdersId;
    }

    public Integer getDrugInformationId() {
        return drugInformationId;
    }

    public void setDrugInformationId(Integer drugInformationId) {
        this.drugInformationId = drugInformationId;
    }

    public Integer getHospitalTransactionStatementId() {
        return hospitalTransactionStatementId;
    }

    public void setHospitalTransactionStatementId(Integer hospitalTransactionStatementId) {
        this.hospitalTransactionStatementId = hospitalTransactionStatementId;
    }

    public Integer getSettleAccounts() {
        return settleAccounts;
    }

    public void setSettleAccounts(Integer settleAccounts) {
        this.settleAccounts = settleAccounts;
    }

    public Float getSettlementMoney() {
        return settlementMoney;
    }

    public void setSettlementMoney(Float settlementMoney) {
        this.settlementMoney = settlementMoney;
    }

    public Integer getSettlementStateId() {
        return settlementStateId;
    }

    public void setSettlementStateId(Integer settlementStateId) {
        this.settlementStateId = settlementStateId;
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
        HospitalTransactionStatementDetails other = (HospitalTransactionStatementDetails) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPurchaseOrdersId() == null ? other.getPurchaseOrdersId() == null : this.getPurchaseOrdersId().equals(other.getPurchaseOrdersId()))
            && (this.getDrugInformationId() == null ? other.getDrugInformationId() == null : this.getDrugInformationId().equals(other.getDrugInformationId()))
            && (this.getHospitalTransactionStatementId() == null ? other.getHospitalTransactionStatementId() == null : this.getHospitalTransactionStatementId().equals(other.getHospitalTransactionStatementId()))
            && (this.getSettleAccounts() == null ? other.getSettleAccounts() == null : this.getSettleAccounts().equals(other.getSettleAccounts()))
            && (this.getSettlementMoney() == null ? other.getSettlementMoney() == null : this.getSettlementMoney().equals(other.getSettlementMoney()))
            && (this.getSettlementStateId() == null ? other.getSettlementStateId() == null : this.getSettlementStateId().equals(other.getSettlementStateId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPurchaseOrdersId() == null) ? 0 : getPurchaseOrdersId().hashCode());
        result = prime * result + ((getDrugInformationId() == null) ? 0 : getDrugInformationId().hashCode());
        result = prime * result + ((getHospitalTransactionStatementId() == null) ? 0 : getHospitalTransactionStatementId().hashCode());
        result = prime * result + ((getSettleAccounts() == null) ? 0 : getSettleAccounts().hashCode());
        result = prime * result + ((getSettlementMoney() == null) ? 0 : getSettlementMoney().hashCode());
        result = prime * result + ((getSettlementStateId() == null) ? 0 : getSettlementStateId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", purchaseOrdersId=").append(purchaseOrdersId);
        sb.append(", drugInformationId=").append(drugInformationId);
        sb.append(", hospitalTransactionStatementId=").append(hospitalTransactionStatementId);
        sb.append(", settleAccounts=").append(settleAccounts);
        sb.append(", settlementMoney=").append(settlementMoney);
        sb.append(", settlementStateId=").append(settlementStateId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}