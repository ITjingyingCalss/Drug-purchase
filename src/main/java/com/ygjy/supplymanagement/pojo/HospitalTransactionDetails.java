package com.ygjy.supplymanagement.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * hospital_transaction_details
 * @author 
 */
public class HospitalTransactionDetails implements Serializable {
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

    private Float purchasedMoney;

    /**
     * 采购状态
     */
    private Integer purchasedState;

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

    /**
     * 退货单id
     */
    private Integer returnOrderId;

    /**
     * 退货量
     */
    private Integer returnsTheAmount;

    /**
     * 退货金额
     */
    private Float returnsTheMoney;

    /**
     * 退货原因
     */
    private String reasonForReturn;

    /**
     * 退货状态id
     */
    private Integer returnStateId;

    /**
     * 结算单id
     */
    private Integer finalSettlementId;

    /**
     * 结算量
     */
    private Integer finalSettlementAmount;

    /**
     * 结算金额
     */
    private Float finalSettlementMoney;

    /**
     * 结算状态
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

    public Integer getPurchasedState() {
        return purchasedState;
    }

    public void setPurchasedState(Integer purchasedState) {
        this.purchasedState = purchasedState;
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

    public Integer getReturnOrderId() {
        return returnOrderId;
    }

    public void setReturnOrderId(Integer returnOrderId) {
        this.returnOrderId = returnOrderId;
    }

    public Integer getReturnsTheAmount() {
        return returnsTheAmount;
    }

    public void setReturnsTheAmount(Integer returnsTheAmount) {
        this.returnsTheAmount = returnsTheAmount;
    }

    public Float getReturnsTheMoney() {
        return returnsTheMoney;
    }

    public void setReturnsTheMoney(Float returnsTheMoney) {
        this.returnsTheMoney = returnsTheMoney;
    }

    public String getReasonForReturn() {
        return reasonForReturn;
    }

    public void setReasonForReturn(String reasonForReturn) {
        this.reasonForReturn = reasonForReturn;
    }

    public Integer getReturnStateId() {
        return returnStateId;
    }

    public void setReturnStateId(Integer returnStateId) {
        this.returnStateId = returnStateId;
    }

    public Integer getFinalSettlementId() {
        return finalSettlementId;
    }

    public void setFinalSettlementId(Integer finalSettlementId) {
        this.finalSettlementId = finalSettlementId;
    }

    public Integer getFinalSettlementAmount() {
        return finalSettlementAmount;
    }

    public void setFinalSettlementAmount(Integer finalSettlementAmount) {
        this.finalSettlementAmount = finalSettlementAmount;
    }

    public Float getFinalSettlementMoney() {
        return finalSettlementMoney;
    }

    public void setFinalSettlementMoney(Float finalSettlementMoney) {
        this.finalSettlementMoney = finalSettlementMoney;
    }

    public Integer getSettlementStateId() {
        return settlementStateId;
    }

    public void setSettlementStateId(Integer settlementStateId) {
        this.settlementStateId = settlementStateId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPurchaseOrdersId() == null) ? 0 : getPurchaseOrdersId().hashCode());
        result = prime * result + ((getDrugInformationId() == null) ? 0 : getDrugInformationId().hashCode());
        result = prime * result + ((getEnterpriseId() == null) ? 0 : getEnterpriseId().hashCode());
        result = prime * result + ((getBiddingPrice() == null) ? 0 : getBiddingPrice().hashCode());
        result = prime * result + ((getTransactionPrice() == null) ? 0 : getTransactionPrice().hashCode());
        result = prime * result + ((getPurchasedAmount() == null) ? 0 : getPurchasedAmount().hashCode());
        result = prime * result + ((getPurchasedMoney() == null) ? 0 : getPurchasedMoney().hashCode());
        result = prime * result + ((getPurchasedState() == null) ? 0 : getPurchasedState().hashCode());
        result = prime * result + ((getReceiptAmount() == null) ? 0 : getReceiptAmount().hashCode());
        result = prime * result + ((getReceiptMoney() == null) ? 0 : getReceiptMoney().hashCode());
        result = prime * result + ((getInvoiceNumber() == null) ? 0 : getInvoiceNumber().hashCode());
        result = prime * result + ((getDrugBatchNumber() == null) ? 0 : getDrugBatchNumber().hashCode());
        result = prime * result + ((getDrugValidity() == null) ? 0 : getDrugValidity().hashCode());
        result = prime * result + ((getReceiptTime() == null) ? 0 : getReceiptTime().hashCode());
        result = prime * result + ((getReturnOrderId() == null) ? 0 : getReturnOrderId().hashCode());
        result = prime * result + ((getReturnsTheAmount() == null) ? 0 : getReturnsTheAmount().hashCode());
        result = prime * result + ((getReturnsTheMoney() == null) ? 0 : getReturnsTheMoney().hashCode());
        result = prime * result + ((getReasonForReturn() == null) ? 0 : getReasonForReturn().hashCode());
        result = prime * result + ((getReturnStateId() == null) ? 0 : getReturnStateId().hashCode());
        result = prime * result + ((getFinalSettlementId() == null) ? 0 : getFinalSettlementId().hashCode());
        result = prime * result + ((getFinalSettlementAmount() == null) ? 0 : getFinalSettlementAmount().hashCode());
        result = prime * result + ((getFinalSettlementMoney() == null) ? 0 : getFinalSettlementMoney().hashCode());
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
        sb.append(", enterpriseId=").append(enterpriseId);
        sb.append(", biddingPrice=").append(biddingPrice);
        sb.append(", transactionPrice=").append(transactionPrice);
        sb.append(", purchasedAmount=").append(purchasedAmount);
        sb.append(", purchasedMoney=").append(purchasedMoney);
        sb.append(", purchasedState=").append(purchasedState);
        sb.append(", receiptAmount=").append(receiptAmount);
        sb.append(", receiptMoney=").append(receiptMoney);
        sb.append(",  invoiceNumber=").append(invoiceNumber);
        sb.append(", drugBatchNumber=").append(drugBatchNumber);
        sb.append(", drugValidity=").append(drugValidity);
        sb.append(", receiptTime=").append(receiptTime);
        sb.append(", returnOrderId=").append(returnOrderId);
        sb.append(", returnsTheAmount=").append(returnsTheAmount);
        sb.append(", returnsTheMoney=").append(returnsTheMoney);
        sb.append(", reasonForReturn=").append(reasonForReturn);
        sb.append(", returnStateId=").append(returnStateId);
        sb.append(", finalSettlementId=").append(finalSettlementId);
        sb.append(", finalSettlementAmount=").append(finalSettlementAmount);
        sb.append(", finalSettlementMoney=").append(finalSettlementMoney);
        sb.append(", settlementStateId=").append(settlementStateId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}