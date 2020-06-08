package com.ygjy.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * hospital_transaction_warehousing
 * @author 
 */
public class HospitalTransactionWarehousing implements Serializable {
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
     * 入库量
     */
    private Integer receiptAmount;

    /**
     * 入库金额
     */
    private Float receiptMoney;

    /**
     * 发票号或入库单号
     */
    private String invoiceNumber;

    /**
     * 药品批号
     */
    private String drugBatchNumber;

    /**
     * 药品有效期
     */
    private String drugValidity;

    /**
     * 入库时间
     */
    private Date receiptTime;

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

    public Integer getReceiptAmount() {
        return receiptAmount;
    }

    public void setReceiptAmount(Integer receiptAmount) {
        this.receiptAmount = receiptAmount;
    }

    public Float getReceiptMoney() {
        return receiptMoney;
    }

    public void setReceiptMoney(Float receiptMoney) {
        this.receiptMoney = receiptMoney;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getDrugBatchNumber() {
        return drugBatchNumber;
    }

    public void setDrugBatchNumber(String drugBatchNumber) {
        this.drugBatchNumber = drugBatchNumber;
    }

    public String getDrugValidity() {
        return drugValidity;
    }

    public void setDrugValidity(String drugValidity) {
        this.drugValidity = drugValidity;
    }

    public Date getReceiptTime() {
        return receiptTime;
    }

    public void setReceiptTime(Date receiptTime) {
        this.receiptTime = receiptTime;
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
        HospitalTransactionWarehousing other = (HospitalTransactionWarehousing) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPurchaseOrdersId() == null ? other.getPurchaseOrdersId() == null : this.getPurchaseOrdersId().equals(other.getPurchaseOrdersId()))
            && (this.getDrugInformationId() == null ? other.getDrugInformationId() == null : this.getDrugInformationId().equals(other.getDrugInformationId()))
            && (this.getReceiptAmount() == null ? other.getReceiptAmount() == null : this.getReceiptAmount().equals(other.getReceiptAmount()))
            && (this.getReceiptMoney() == null ? other.getReceiptMoney() == null : this.getReceiptMoney().equals(other.getReceiptMoney()))
            && (this.getInvoiceNumber() == null ? other.getInvoiceNumber() == null : this.getInvoiceNumber().equals(other.getInvoiceNumber()))
            && (this.getDrugBatchNumber() == null ? other.getDrugBatchNumber() == null : this.getDrugBatchNumber().equals(other.getDrugBatchNumber()))
            && (this.getDrugValidity() == null ? other.getDrugValidity() == null : this.getDrugValidity().equals(other.getDrugValidity()))
            && (this.getReceiptTime() == null ? other.getReceiptTime() == null : this.getReceiptTime().equals(other.getReceiptTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPurchaseOrdersId() == null) ? 0 : getPurchaseOrdersId().hashCode());
        result = prime * result + ((getDrugInformationId() == null) ? 0 : getDrugInformationId().hashCode());
        result = prime * result + ((getReceiptAmount() == null) ? 0 : getReceiptAmount().hashCode());
        result = prime * result + ((getReceiptMoney() == null) ? 0 : getReceiptMoney().hashCode());
        result = prime * result + ((getInvoiceNumber() == null) ? 0 : getInvoiceNumber().hashCode());
        result = prime * result + ((getDrugBatchNumber() == null) ? 0 : getDrugBatchNumber().hashCode());
        result = prime * result + ((getDrugValidity() == null) ? 0 : getDrugValidity().hashCode());
        result = prime * result + ((getReceiptTime() == null) ? 0 : getReceiptTime().hashCode());
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
        sb.append(", receiptAmount=").append(receiptAmount);
        sb.append(", receiptMoney=").append(receiptMoney);
        sb.append(", invoiceNumber=").append(invoiceNumber);
        sb.append(", drugBatchNumber=").append(drugBatchNumber);
        sb.append(", drugValidity=").append(drugValidity);
        sb.append(", receiptTime=").append(receiptTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}