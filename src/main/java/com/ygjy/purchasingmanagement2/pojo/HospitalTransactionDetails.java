package com.ygjy.purchasingmanagement2.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

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

    /**
     * 供货商id
     */
    private Integer suppliersId;

    private DrugInformation drugInformation;

    private PurchaseOrder purchaseOrder;

    private DurgsFrom durgsFrom;

    private Enterprise enterprise;

    private Suppliers suppliers;

    private QualityLevel qualityLevel;

    private ReturnStatus returnStatus;

    private DrugCategory drugCategory;

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

    public Integer getSuppliersId() {
        return suppliersId;
    }

    public void setSuppliersId(Integer suppliersId) {
        this.suppliersId = suppliersId;
    }

    public DrugInformation getDrugInformation() {
        return drugInformation;
    }

    public void setDrugInformation(DrugInformation drugInformation) {
        this.drugInformation = drugInformation;
    }

    public PurchaseOrder getPurchaseOrder() {
        return purchaseOrder;
    }

    public void setPurchaseOrder(PurchaseOrder purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
    }

    public DurgsFrom getDurgsFrom() {
        return durgsFrom;
    }

    public void setDurgsFrom(DurgsFrom durgsFrom) {
        this.durgsFrom = durgsFrom;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public Suppliers getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(Suppliers suppliers) {
        this.suppliers = suppliers;
    }

    public QualityLevel getQualityLevel() {
        return qualityLevel;
    }

    public void setQualityLevel(QualityLevel qualityLevel) {
        this.qualityLevel = qualityLevel;
    }

    public ReturnStatus getReturnStatus() {
        return returnStatus;
    }

    public void setReturnStatus(ReturnStatus returnStatus) {
        this.returnStatus = returnStatus;
    }

    public DrugCategory getDrugCategory() {
        return drugCategory;
    }

    public void setDrugCategory(DrugCategory drugCategory) {
        this.drugCategory = drugCategory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HospitalTransactionDetails that = (HospitalTransactionDetails) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(purchaseOrdersId, that.purchaseOrdersId) &&
                Objects.equals(drugInformationId, that.drugInformationId) &&
                Objects.equals(enterpriseId, that.enterpriseId) &&
                Objects.equals(biddingPrice, that.biddingPrice) &&
                Objects.equals(transactionPrice, that.transactionPrice) &&
                Objects.equals(purchasedAmount, that.purchasedAmount) &&
                Objects.equals(purchasedMoney, that.purchasedMoney) &&
                Objects.equals(purchasedState, that.purchasedState) &&
                Objects.equals(receiptAmount, that.receiptAmount) &&
                Objects.equals(receiptMoney, that.receiptMoney) &&
                Objects.equals(invoiceNumber, that.invoiceNumber) &&
                Objects.equals(drugBatchNumber, that.drugBatchNumber) &&
                Objects.equals(drugValidity, that.drugValidity) &&
                Objects.equals(receiptTime, that.receiptTime) &&
                Objects.equals(returnOrderId, that.returnOrderId) &&
                Objects.equals(returnsTheAmount, that.returnsTheAmount) &&
                Objects.equals(returnsTheMoney, that.returnsTheMoney) &&
                Objects.equals(reasonForReturn, that.reasonForReturn) &&
                Objects.equals(returnStateId, that.returnStateId) &&
                Objects.equals(finalSettlementId, that.finalSettlementId) &&
                Objects.equals(finalSettlementAmount, that.finalSettlementAmount) &&
                Objects.equals(finalSettlementMoney, that.finalSettlementMoney) &&
                Objects.equals(settlementStateId, that.settlementStateId) &&
                Objects.equals(suppliersId, that.suppliersId) &&
                Objects.equals(drugInformation, that.drugInformation) &&
                Objects.equals(purchaseOrder, that.purchaseOrder) &&
                Objects.equals(durgsFrom, that.durgsFrom) &&
                Objects.equals(enterprise, that.enterprise) &&
                Objects.equals(suppliers, that.suppliers) &&
                Objects.equals(qualityLevel, that.qualityLevel) &&
                Objects.equals(returnStatus, that.returnStatus) &&
                Objects.equals(drugCategory, that.drugCategory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, purchaseOrdersId, drugInformationId, enterpriseId, biddingPrice, transactionPrice, purchasedAmount, purchasedMoney, purchasedState, receiptAmount, receiptMoney, invoiceNumber, drugBatchNumber, drugValidity, receiptTime, returnOrderId, returnsTheAmount, returnsTheMoney, reasonForReturn, returnStateId, finalSettlementId, finalSettlementAmount, finalSettlementMoney, settlementStateId, suppliersId, drugInformation, purchaseOrder, durgsFrom, enterprise, suppliers, qualityLevel, returnStatus, drugCategory);
    }

    @Override
    public String toString() {
        return "HospitalTransactionDetails{" +
                "id=" + id +
                ", purchaseOrdersId=" + purchaseOrdersId +
                ", drugInformationId=" + drugInformationId +
                ", enterpriseId=" + enterpriseId +
                ", biddingPrice=" + biddingPrice +
                ", transactionPrice=" + transactionPrice +
                ", purchasedAmount=" + purchasedAmount +
                ", purchasedMoney=" + purchasedMoney +
                ", purchasedState=" + purchasedState +
                ", receiptAmount=" + receiptAmount +
                ", receiptMoney=" + receiptMoney +
                ", invoiceNumber='" + invoiceNumber + '\'' +
                ", drugBatchNumber='" + drugBatchNumber + '\'' +
                ", drugValidity='" + drugValidity + '\'' +
                ", receiptTime=" + receiptTime +
                ", returnOrderId=" + returnOrderId +
                ", returnsTheAmount=" + returnsTheAmount +
                ", returnsTheMoney=" + returnsTheMoney +
                ", reasonForReturn='" + reasonForReturn + '\'' +
                ", returnStateId=" + returnStateId +
                ", finalSettlementId=" + finalSettlementId +
                ", finalSettlementAmount=" + finalSettlementAmount +
                ", finalSettlementMoney=" + finalSettlementMoney +
                ", settlementStateId=" + settlementStateId +
                ", suppliersId=" + suppliersId +
                ", drugInformation=" + drugInformation +
                ", purchaseOrder=" + purchaseOrder +
                ", durgsFrom=" + durgsFrom +
                ", enterprise=" + enterprise +
                ", suppliers=" + suppliers +
                ", qualityLevel=" + qualityLevel +
                ", returnStatus=" + returnStatus +
                ", drugCategory=" + drugCategory +
                '}';
    }
}