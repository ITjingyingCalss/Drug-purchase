package com.ygjy.purchasingmanagement2.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * hospital_transaction_statement
 * @author 
 */
public class HospitalTransactionStatement implements Serializable {
    private Integer id;

    /**
     * 结算单编号
     */
    private String statementNumber;

    /**
     * 结算单名称
     */
    private String statementName;

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
     * 建单时间(年月日时分秒)
     */
    private Date createReceiptsTime;

    /**
     * 提交时间(年月日时分秒)
     */
    private Date submissionTime;

    /**
     * 备注
     */
    private String remark;

    /**
     * 结算单状态
     */
    private Integer statementStateId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatementNumber() {
        return statementNumber;
    }

    public void setStatementNumber(String statementNumber) {
        this.statementNumber = statementNumber;
    }

    public String getStatementName() {
        return statementName;
    }

    public void setStatementName(String statementName) {
        this.statementName = statementName;
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

    public Integer getStatementStateId() {
        return statementStateId;
    }

    public void setStatementStateId(Integer statementStateId) {
        this.statementStateId = statementStateId;
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
        HospitalTransactionStatement other = (HospitalTransactionStatement) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getStatementNumber() == null ? other.getStatementNumber() == null : this.getStatementNumber().equals(other.getStatementNumber()))
            && (this.getStatementName() == null ? other.getStatementName() == null : this.getStatementName().equals(other.getStatementName()))
            && (this.getHospitalId() == null ? other.getHospitalId() == null : this.getHospitalId().equals(other.getHospitalId()))
            && (this.getContacts() == null ? other.getContacts() == null : this.getContacts().equals(other.getContacts()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getCreatReceiptsPerson() == null ? other.getCreatReceiptsPerson() == null : this.getCreatReceiptsPerson().equals(other.getCreatReceiptsPerson()))
            && (this.getCreateReceiptsTime() == null ? other.getCreateReceiptsTime() == null : this.getCreateReceiptsTime().equals(other.getCreateReceiptsTime()))
            && (this.getSubmissionTime() == null ? other.getSubmissionTime() == null : this.getSubmissionTime().equals(other.getSubmissionTime()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getStatementStateId() == null ? other.getStatementStateId() == null : this.getStatementStateId().equals(other.getStatementStateId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getStatementNumber() == null) ? 0 : getStatementNumber().hashCode());
        result = prime * result + ((getStatementName() == null) ? 0 : getStatementName().hashCode());
        result = prime * result + ((getHospitalId() == null) ? 0 : getHospitalId().hashCode());
        result = prime * result + ((getContacts() == null) ? 0 : getContacts().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getCreatReceiptsPerson() == null) ? 0 : getCreatReceiptsPerson().hashCode());
        result = prime * result + ((getCreateReceiptsTime() == null) ? 0 : getCreateReceiptsTime().hashCode());
        result = prime * result + ((getSubmissionTime() == null) ? 0 : getSubmissionTime().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getStatementStateId() == null) ? 0 : getStatementStateId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", statementNumber=").append(statementNumber);
        sb.append(", statementName=").append(statementName);
        sb.append(", hospitalId=").append(hospitalId);
        sb.append(", contacts=").append(contacts);
        sb.append(", phone=").append(phone);
        sb.append(", creatReceiptsPerson=").append(creatReceiptsPerson);
        sb.append(", createReceiptsTime=").append(createReceiptsTime);
        sb.append(", submissionTime=").append(submissionTime);
        sb.append(", remark=").append(remark);
        sb.append(", statementStateId=").append(statementStateId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}