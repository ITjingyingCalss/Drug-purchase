package com.ygjy.purchasingmanagement2.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * hospital_transaction_statement
 * @author 
 */
public class HospitalTransactionStatementVo implements Serializable {

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
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createReceiptsTime;

    /**
     * 提交时间(年月日时分秒)
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date submissionTime;

    /**
     * 备注
     */
    private String remark;

    /**
     * 结算单状态
     */
    private String statementStateId;

    private static final long serialVersionUID = 1L;

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

    public String getStatementStateId() {
        return statementStateId;
    }

    public void setStatementStateId(String statementStateId) {
        this.statementStateId = statementStateId;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return "HospitalTransactionStatementVo{" +
                "statementNumber='" + statementNumber + '\'' +
                ", statementName='" + statementName + '\'' +
                ", hospitalId=" + hospitalId +
                ", contacts='" + contacts + '\'' +
                ", phone='" + phone + '\'' +
                ", creatReceiptsPerson='" + creatReceiptsPerson + '\'' +
                ", createReceiptsTime=" + createReceiptsTime +
                ", submissionTime=" + submissionTime +
                ", remark='" + remark + '\'' +
                ", statementStateId='" + statementStateId + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HospitalTransactionStatementVo that = (HospitalTransactionStatementVo) o;
        return Objects.equals(statementNumber, that.statementNumber) &&
                Objects.equals(statementName, that.statementName) &&
                Objects.equals(hospitalId, that.hospitalId) &&
                Objects.equals(contacts, that.contacts) &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(creatReceiptsPerson, that.creatReceiptsPerson) &&
                Objects.equals(createReceiptsTime, that.createReceiptsTime) &&
                Objects.equals(submissionTime, that.submissionTime) &&
                Objects.equals(remark, that.remark) &&
                Objects.equals(statementStateId, that.statementStateId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statementNumber, statementName, hospitalId, contacts, phone, creatReceiptsPerson, createReceiptsTime, submissionTime, remark, statementStateId);
    }
}