package com.ygjy.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * purchase_order
 * @author 
 */
public class PurchaseOrder implements Serializable {
    private Integer id;

    /**
     * 采购单编号
     */
    private String purchaseOrderNumber;

    /**
     * 采购单名称
     */
    private String nameOfPurchaseOrder;

    /**
     * 医院id
     */
    private Integer hospitalId;

    /**
     * 联系人
     */
    private String contacts;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 建单时间(年月日时分秒)
     */
    private Date createReceiptsTime;

    /**
     * 最近修改时间(年月日时分秒)
     */
    private Date lastModificationTime;

    /**
     * 提交时间(年月日时分秒)
     */
    private Date submissionTime;

    /**
     * 备注
     */
    private String remark;

    /**
     * 采购单状态
     */
    private Integer purchaseState;

    /**
     * 审核人
     */
    private String auditPerson;

    /**
     * 审核意见
     */
    private String auditOpinion;

    /**
     * 审核时间(年月日时分秒) 
     */
    private Date auditTime;

    /**
     * 删除（1：删除，0：不删除）
     */
    private Integer delState;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPurchaseOrderNumber() {
        return purchaseOrderNumber;
    }

    public void setPurchaseOrderNumber(String purchaseOrderNumber) {
        this.purchaseOrderNumber = purchaseOrderNumber;
    }

    public String getNameOfPurchaseOrder() {
        return nameOfPurchaseOrder;
    }

    public void setNameOfPurchaseOrder(String nameOfPurchaseOrder) {
        this.nameOfPurchaseOrder = nameOfPurchaseOrder;
    }

    public Integer getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(Integer hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getCreateReceiptsTime() {
        return createReceiptsTime;
    }

    public void setCreateReceiptsTime(Date createReceiptsTime) {
        this.createReceiptsTime = createReceiptsTime;
    }

    public Date getLastModificationTime() {
        return lastModificationTime;
    }

    public void setLastModificationTime(Date lastModificationTime) {
        this.lastModificationTime = lastModificationTime;
    }

    public Date getSubmissionTime() {
        return submissionTime;
    }

    public void setSubmissionTime(Date submissionTime) {
        this.submissionTime = submissionTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getPurchaseState() {
        return purchaseState;
    }

    public void setPurchaseState(Integer purchaseState) {
        this.purchaseState = purchaseState;
    }

    public String getAuditPerson() {
        return auditPerson;
    }

    public void setAuditPerson(String auditPerson) {
        this.auditPerson = auditPerson;
    }

    public String getAuditOpinion() {
        return auditOpinion;
    }

    public void setAuditOpinion(String auditOpinion) {
        this.auditOpinion = auditOpinion;
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public Integer getDelState() {
        return delState;
    }

    public void setDelState(Integer delState) {
        this.delState = delState;
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
        PurchaseOrder other = (PurchaseOrder) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPurchaseOrderNumber() == null ? other.getPurchaseOrderNumber() == null : this.getPurchaseOrderNumber().equals(other.getPurchaseOrderNumber()))
            && (this.getNameOfPurchaseOrder() == null ? other.getNameOfPurchaseOrder() == null : this.getNameOfPurchaseOrder().equals(other.getNameOfPurchaseOrder()))
            && (this.getHospitalId() == null ? other.getHospitalId() == null : this.getHospitalId().equals(other.getHospitalId()))
            && (this.getContacts() == null ? other.getContacts() == null : this.getContacts().equals(other.getContacts()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getCreateReceiptsTime() == null ? other.getCreateReceiptsTime() == null : this.getCreateReceiptsTime().equals(other.getCreateReceiptsTime()))
            && (this.getLastModificationTime() == null ? other.getLastModificationTime() == null : this.getLastModificationTime().equals(other.getLastModificationTime()))
            && (this.getSubmissionTime() == null ? other.getSubmissionTime() == null : this.getSubmissionTime().equals(other.getSubmissionTime()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getPurchaseState() == null ? other.getPurchaseState() == null : this.getPurchaseState().equals(other.getPurchaseState()))
            && (this.getAuditPerson() == null ? other.getAuditPerson() == null : this.getAuditPerson().equals(other.getAuditPerson()))
            && (this.getAuditOpinion() == null ? other.getAuditOpinion() == null : this.getAuditOpinion().equals(other.getAuditOpinion()))
            && (this.getAuditTime() == null ? other.getAuditTime() == null : this.getAuditTime().equals(other.getAuditTime()))
            && (this.getDelState() == null ? other.getDelState() == null : this.getDelState().equals(other.getDelState()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPurchaseOrderNumber() == null) ? 0 : getPurchaseOrderNumber().hashCode());
        result = prime * result + ((getNameOfPurchaseOrder() == null) ? 0 : getNameOfPurchaseOrder().hashCode());
        result = prime * result + ((getHospitalId() == null) ? 0 : getHospitalId().hashCode());
        result = prime * result + ((getContacts() == null) ? 0 : getContacts().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getCreateReceiptsTime() == null) ? 0 : getCreateReceiptsTime().hashCode());
        result = prime * result + ((getLastModificationTime() == null) ? 0 : getLastModificationTime().hashCode());
        result = prime * result + ((getSubmissionTime() == null) ? 0 : getSubmissionTime().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getPurchaseState() == null) ? 0 : getPurchaseState().hashCode());
        result = prime * result + ((getAuditPerson() == null) ? 0 : getAuditPerson().hashCode());
        result = prime * result + ((getAuditOpinion() == null) ? 0 : getAuditOpinion().hashCode());
        result = prime * result + ((getAuditTime() == null) ? 0 : getAuditTime().hashCode());
        result = prime * result + ((getDelState() == null) ? 0 : getDelState().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", purchaseOrderNumber=").append(purchaseOrderNumber);
        sb.append(", nameOfPurchaseOrder=").append(nameOfPurchaseOrder);
        sb.append(", hospitalId=").append(hospitalId);
        sb.append(", contacts=").append(contacts);
        sb.append(", phone=").append(phone);
        sb.append(", createReceiptsTime=").append(createReceiptsTime);
        sb.append(", lastModificationTime=").append(lastModificationTime);
        sb.append(", submissionTime=").append(submissionTime);
        sb.append(", remark=").append(remark);
        sb.append(", purchaseState=").append(purchaseState);
        sb.append(", auditPerson=").append(auditPerson);
        sb.append(", auditOpinion=").append(auditOpinion);
        sb.append(", auditTime=").append(auditTime);
        sb.append(", delState=").append(delState);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}