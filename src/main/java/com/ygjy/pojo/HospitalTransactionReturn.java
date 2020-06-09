package com.ygjy.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * hospital_transaction_return
 * @author 
 */
public class HospitalTransactionReturn implements Serializable {
    private Integer id;

    /**
     * 退货单编号
     */
    private String returnOrderNumber;

    /**
     * 退货单名称
     */
    private String returnOrderName;

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
     * 建单人
     */
    private String creatReceiptsPerson;

    /**
     * 建单时间
     */
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createReceiptsTime;

    /**
     * 提交时间
     */
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date submissionTime;

    /**
     * 备注
     */
    private String remark;

    /**
     * 退货状态
     */
    private Integer returnStateId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReturnOrderNumber() {
        return returnOrderNumber;
    }

    public void setReturnOrderNumber(String returnOrderNumber) {
        this.returnOrderNumber = returnOrderNumber;
    }

    public String getReturnOrderName() {
        return returnOrderName;
    }

    public void setReturnOrderName(String returnOrderName) {
        this.returnOrderName = returnOrderName;
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

    public String getCreatReceiptsPerson() {
        return creatReceiptsPerson;
    }

    public void setCreatReceiptsPerson(String creatReceiptsPerson) {
        this.creatReceiptsPerson = creatReceiptsPerson;
    }

    public Date getCreateReceiptsTime() {
        return createReceiptsTime;
    }

    public void setCreateReceiptsTime(Date createReceiptsTime) {
        this.createReceiptsTime = createReceiptsTime;
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

    public Integer getReturnStateId() {
        return returnStateId;
    }

    public void setReturnStateId(Integer returnStateId) {
        this.returnStateId = returnStateId;
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
        HospitalTransactionReturn other = (HospitalTransactionReturn) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getReturnOrderNumber() == null ? other.getReturnOrderNumber() == null : this.getReturnOrderNumber().equals(other.getReturnOrderNumber()))
            && (this.getReturnOrderName() == null ? other.getReturnOrderName() == null : this.getReturnOrderName().equals(other.getReturnOrderName()))
            && (this.getHospitalId() == null ? other.getHospitalId() == null : this.getHospitalId().equals(other.getHospitalId()))
            && (this.getContacts() == null ? other.getContacts() == null : this.getContacts().equals(other.getContacts()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getCreatReceiptsPerson() == null ? other.getCreatReceiptsPerson() == null : this.getCreatReceiptsPerson().equals(other.getCreatReceiptsPerson()))
            && (this.getCreateReceiptsTime() == null ? other.getCreateReceiptsTime() == null : this.getCreateReceiptsTime().equals(other.getCreateReceiptsTime()))
            && (this.getSubmissionTime() == null ? other.getSubmissionTime() == null : this.getSubmissionTime().equals(other.getSubmissionTime()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getReturnStateId() == null ? other.getReturnStateId() == null : this.getReturnStateId().equals(other.getReturnStateId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getReturnOrderNumber() == null) ? 0 : getReturnOrderNumber().hashCode());
        result = prime * result + ((getReturnOrderName() == null) ? 0 : getReturnOrderName().hashCode());
        result = prime * result + ((getHospitalId() == null) ? 0 : getHospitalId().hashCode());
        result = prime * result + ((getContacts() == null) ? 0 : getContacts().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getCreatReceiptsPerson() == null) ? 0 : getCreatReceiptsPerson().hashCode());
        result = prime * result + ((getCreateReceiptsTime() == null) ? 0 : getCreateReceiptsTime().hashCode());
        result = prime * result + ((getSubmissionTime() == null) ? 0 : getSubmissionTime().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getReturnStateId() == null) ? 0 : getReturnStateId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", returnOrderNumber=").append(returnOrderNumber);
        sb.append(", returnOrderName=").append(returnOrderName);
        sb.append(", hospitalId=").append(hospitalId);
        sb.append(", contacts=").append(contacts);
        sb.append(", phone=").append(phone);
        sb.append(", creatReceiptsPerson=").append(creatReceiptsPerson);
        sb.append(", createReceiptsTime=").append(createReceiptsTime);
        sb.append(", submissionTime=").append(submissionTime);
        sb.append(", remark=").append(remark);
        sb.append(", returnStateId=").append(returnStateId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}