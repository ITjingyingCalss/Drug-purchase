package com.ygjy.supplymanagement.pojo;

import java.io.Serializable;

/**
 * purchase_order_drug_details
 * @author 
 */
public class PurchaseOrderDrugDetails implements Serializable {
    private Integer id;

    /**
     * 采购单id
     */
    private Integer purchaseOrderId;

    /**
     * 药品信息id
     */
    private Integer drugInformationId;

    /**
     * 供货企业id
     */
    private Integer enterpriseId;

    /**
     * 中标价
     */
    private Float biddingPrice;

    /**
     * 交易价
     */
    private Float transactionPrice;

    /**
     * 采购量
     */
    private Integer purchasedAmount;

    /**
     * 采购金额
     */
    private Float purchasedMoney;

    /**
     * 采购状态
     */
    private Integer purchaseOrdersStatesId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPurchaseOrderId() {
        return purchaseOrderId;
    }

    public void setPurchaseOrderId(Integer purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }

    public Integer getDrugInformationId() {
        return drugInformationId;
    }

    public void setDrugInformationId(Integer drugInformationId) {
        this.drugInformationId = drugInformationId;
    }

    public Integer getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(Integer enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public Float getBiddingPrice() {
        return biddingPrice;
    }

    public void setBiddingPrice(Float biddingPrice) {
        this.biddingPrice = biddingPrice;
    }

    public Float getTransactionPrice() {
        return transactionPrice;
    }

    public void setTransactionPrice(Float transactionPrice) {
        this.transactionPrice = transactionPrice;
    }

    public Integer getPurchasedAmount() {
        return purchasedAmount;
    }

    public void setPurchasedAmount(Integer purchasedAmount) {
        this.purchasedAmount = purchasedAmount;
    }

    public Float getPurchasedMoney() {
        return purchasedMoney;
    }

    public void setPurchasedMoney(Float purchasedMoney) {
        this.purchasedMoney = purchasedMoney;
    }

    public Integer getPurchaseOrdersStatesId() {
        return purchaseOrdersStatesId;
    }

    public void setPurchaseOrdersStatesId(Integer purchaseOrdersStatesId) {
        this.purchaseOrdersStatesId = purchaseOrdersStatesId;
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
        PurchaseOrderDrugDetails other = (PurchaseOrderDrugDetails) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPurchaseOrderId() == null ? other.getPurchaseOrderId() == null : this.getPurchaseOrderId().equals(other.getPurchaseOrderId()))
            && (this.getDrugInformationId() == null ? other.getDrugInformationId() == null : this.getDrugInformationId().equals(other.getDrugInformationId()))
            && (this.getEnterpriseId() == null ? other.getEnterpriseId() == null : this.getEnterpriseId().equals(other.getEnterpriseId()))
            && (this.getBiddingPrice() == null ? other.getBiddingPrice() == null : this.getBiddingPrice().equals(other.getBiddingPrice()))
            && (this.getTransactionPrice() == null ? other.getTransactionPrice() == null : this.getTransactionPrice().equals(other.getTransactionPrice()))
            && (this.getPurchasedAmount() == null ? other.getPurchasedAmount() == null : this.getPurchasedAmount().equals(other.getPurchasedAmount()))
            && (this.getPurchasedMoney() == null ? other.getPurchasedMoney() == null : this.getPurchasedMoney().equals(other.getPurchasedMoney()))
            && (this.getPurchaseOrdersStatesId() == null ? other.getPurchaseOrdersStatesId() == null : this.getPurchaseOrdersStatesId().equals(other.getPurchaseOrdersStatesId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPurchaseOrderId() == null) ? 0 : getPurchaseOrderId().hashCode());
        result = prime * result + ((getDrugInformationId() == null) ? 0 : getDrugInformationId().hashCode());
        result = prime * result + ((getEnterpriseId() == null) ? 0 : getEnterpriseId().hashCode());
        result = prime * result + ((getBiddingPrice() == null) ? 0 : getBiddingPrice().hashCode());
        result = prime * result + ((getTransactionPrice() == null) ? 0 : getTransactionPrice().hashCode());
        result = prime * result + ((getPurchasedAmount() == null) ? 0 : getPurchasedAmount().hashCode());
        result = prime * result + ((getPurchasedMoney() == null) ? 0 : getPurchasedMoney().hashCode());
        result = prime * result + ((getPurchaseOrdersStatesId() == null) ? 0 : getPurchaseOrdersStatesId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", purchaseOrderId=").append(purchaseOrderId);
        sb.append(", drugInformationId=").append(drugInformationId);
        sb.append(", enterpriseId=").append(enterpriseId);
        sb.append(", biddingPrice=").append(biddingPrice);
        sb.append(", transactionPrice=").append(transactionPrice);
        sb.append(", purchasedAmount=").append(purchasedAmount);
        sb.append(", purchasedMoney=").append(purchasedMoney);
        sb.append(", purchaseOrdersStatesId=").append(purchaseOrdersStatesId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}