package com.ygjy.purchasingmanagement1.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * enterprise
 * @author 
 */
public class Enterprise implements Serializable {
    private Integer id;

    /**
     * 企业名称
     */
    private String enterpriseName;

    /**
     * 企业类别(生产企业、经营企业)
     */
    private String enterpriseType;

    /**
     * (生产或经营)许可证
     */
    private String license;

    /**
     * 许可证到期时间(年月日)
     */
    private Date licenseExpirationDate;

    /**
     * 企业联系人
     */
    private String enterpriseContacts;

    /**
     * 企业联系电话
     */
    private String enterpriseTelephone;

    /**
     * 经营范围
     */
    private String businessScope;

    /**
     * 注册地址
     */
    private String registeredAddress;

    /**
     * 联系地址
     */
    private String contactAddress;

    /**
     * 邮政编码
     */
    private String postalCode;

    /**
     * 总资产(万元)
     */
    private Float totalAssets;

    /**
     * 企业传真
     */
    private String corporateFax;

    /**
     * 法人代表姓名
     */
    private String legalPerson;

    /**
     * 法人身份证
     */
    private String legalPersonIdCard;

    /**
     * 企业注册资金(万元)
     */
    private Float enterpriseRegisteredCapital;

    /**
     * 上年度销售金额(万元)
     */
    private Float salesAmountLastYear;

    /**
     * 电子信箱
     */
    private String email;

    /**
     * 网址
     */
    private String website;

    /**
     * 企业代码证号
     */
    private String enterpriseCode;

    /**
     * 企业代码有效期
     */
    private Date enterpriseCodeDate;

    /**
     * 营业执照
     */
    private String businessLicense;

    /**
     * 营业执照有效期
     */
    private Date businessLicenseDate;

    /**
     * 是否有企业信用证（1：是，2：否）
     */
    private Integer enterpriseLetterOfCredit;

    /**
     * 信用证号
     */
    private String enterpriseLetterNumber;

    /**
     * 信用证有效期
     */
    private Date enterpriseLetterData;

    /**
     * 固定资产（万元）
     */
    private Float fixedAssets;

    /**
     * 公司简介
     */
    private String companyProfile;

    /**
     * 备注
     */
    private String remark;

    /**
     * 删除（1：删除，0：不删除）
     */
    private Integer delState;

    /**
     * 供货商id
     */
    private Integer suppliersId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(String enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Date getLicenseExpirationDate() {
        return licenseExpirationDate;
    }

    public void setLicenseExpirationDate(Date licenseExpirationDate) {
        this.licenseExpirationDate = licenseExpirationDate;
    }

    public String getEnterpriseContacts() {
        return enterpriseContacts;
    }

    public void setEnterpriseContacts(String enterpriseContacts) {
        this.enterpriseContacts = enterpriseContacts;
    }

    public String getEnterpriseTelephone() {
        return enterpriseTelephone;
    }

    public void setEnterpriseTelephone(String enterpriseTelephone) {
        this.enterpriseTelephone = enterpriseTelephone;
    }

    public String getBusinessScope() {
        return businessScope;
    }

    public void setBusinessScope(String businessScope) {
        this.businessScope = businessScope;
    }

    public String getRegisteredAddress() {
        return registeredAddress;
    }

    public void setRegisteredAddress(String registeredAddress) {
        this.registeredAddress = registeredAddress;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Float getTotalAssets() {
        return totalAssets;
    }

    public void setTotalAssets(Float totalAssets) {
        this.totalAssets = totalAssets;
    }

    public String getCorporateFax() {
        return corporateFax;
    }

    public void setCorporateFax(String corporateFax) {
        this.corporateFax = corporateFax;
    }

    public String getLegalPerson() {
        return legalPerson;
    }

    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson;
    }

    public String getLegalPersonIdCard() {
        return legalPersonIdCard;
    }

    public void setLegalPersonIdCard(String legalPersonIdCard) {
        this.legalPersonIdCard = legalPersonIdCard;
    }

    public Float getEnterpriseRegisteredCapital() {
        return enterpriseRegisteredCapital;
    }

    public void setEnterpriseRegisteredCapital(Float enterpriseRegisteredCapital) {
        this.enterpriseRegisteredCapital = enterpriseRegisteredCapital;
    }

    public Float getSalesAmountLastYear() {
        return salesAmountLastYear;
    }

    public void setSalesAmountLastYear(Float salesAmountLastYear) {
        this.salesAmountLastYear = salesAmountLastYear;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getEnterpriseCode() {
        return enterpriseCode;
    }

    public void setEnterpriseCode(String enterpriseCode) {
        this.enterpriseCode = enterpriseCode;
    }

    public Date getEnterpriseCodeDate() {
        return enterpriseCodeDate;
    }

    public void setEnterpriseCodeDate(Date enterpriseCodeDate) {
        this.enterpriseCodeDate = enterpriseCodeDate;
    }

    public String getBusinessLicense() {
        return businessLicense;
    }

    public void setBusinessLicense(String businessLicense) {
        this.businessLicense = businessLicense;
    }

    public Date getBusinessLicenseDate() {
        return businessLicenseDate;
    }

    public void setBusinessLicenseDate(Date businessLicenseDate) {
        this.businessLicenseDate = businessLicenseDate;
    }

    public Integer getEnterpriseLetterOfCredit() {
        return enterpriseLetterOfCredit;
    }

    public void setEnterpriseLetterOfCredit(Integer enterpriseLetterOfCredit) {
        this.enterpriseLetterOfCredit = enterpriseLetterOfCredit;
    }

    public String getEnterpriseLetterNumber() {
        return enterpriseLetterNumber;
    }

    public void setEnterpriseLetterNumber(String enterpriseLetterNumber) {
        this.enterpriseLetterNumber = enterpriseLetterNumber;
    }

    public Date getEnterpriseLetterData() {
        return enterpriseLetterData;
    }

    public void setEnterpriseLetterData(Date enterpriseLetterData) {
        this.enterpriseLetterData = enterpriseLetterData;
    }

    public Float getFixedAssets() {
        return fixedAssets;
    }

    public void setFixedAssets(Float fixedAssets) {
        this.fixedAssets = fixedAssets;
    }

    public String getCompanyProfile() {
        return companyProfile;
    }

    public void setCompanyProfile(String companyProfile) {
        this.companyProfile = companyProfile;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getDelState() {
        return delState;
    }

    public void setDelState(Integer delState) {
        this.delState = delState;
    }

    public Integer getSuppliersId() {
        return suppliersId;
    }

    public void setSuppliersId(Integer suppliersId) {
        this.suppliersId = suppliersId;
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
        Enterprise other = (Enterprise) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getEnterpriseName() == null ? other.getEnterpriseName() == null : this.getEnterpriseName().equals(other.getEnterpriseName()))
            && (this.getEnterpriseType() == null ? other.getEnterpriseType() == null : this.getEnterpriseType().equals(other.getEnterpriseType()))
            && (this.getLicense() == null ? other.getLicense() == null : this.getLicense().equals(other.getLicense()))
            && (this.getLicenseExpirationDate() == null ? other.getLicenseExpirationDate() == null : this.getLicenseExpirationDate().equals(other.getLicenseExpirationDate()))
            && (this.getEnterpriseContacts() == null ? other.getEnterpriseContacts() == null : this.getEnterpriseContacts().equals(other.getEnterpriseContacts()))
            && (this.getEnterpriseTelephone() == null ? other.getEnterpriseTelephone() == null : this.getEnterpriseTelephone().equals(other.getEnterpriseTelephone()))
            && (this.getBusinessScope() == null ? other.getBusinessScope() == null : this.getBusinessScope().equals(other.getBusinessScope()))
            && (this.getRegisteredAddress() == null ? other.getRegisteredAddress() == null : this.getRegisteredAddress().equals(other.getRegisteredAddress()))
            && (this.getContactAddress() == null ? other.getContactAddress() == null : this.getContactAddress().equals(other.getContactAddress()))
            && (this.getPostalCode() == null ? other.getPostalCode() == null : this.getPostalCode().equals(other.getPostalCode()))
            && (this.getTotalAssets() == null ? other.getTotalAssets() == null : this.getTotalAssets().equals(other.getTotalAssets()))
            && (this.getCorporateFax() == null ? other.getCorporateFax() == null : this.getCorporateFax().equals(other.getCorporateFax()))
            && (this.getLegalPerson() == null ? other.getLegalPerson() == null : this.getLegalPerson().equals(other.getLegalPerson()))
            && (this.getLegalPersonIdCard() == null ? other.getLegalPersonIdCard() == null : this.getLegalPersonIdCard().equals(other.getLegalPersonIdCard()))
            && (this.getEnterpriseRegisteredCapital() == null ? other.getEnterpriseRegisteredCapital() == null : this.getEnterpriseRegisteredCapital().equals(other.getEnterpriseRegisteredCapital()))
            && (this.getSalesAmountLastYear() == null ? other.getSalesAmountLastYear() == null : this.getSalesAmountLastYear().equals(other.getSalesAmountLastYear()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getWebsite() == null ? other.getWebsite() == null : this.getWebsite().equals(other.getWebsite()))
            && (this.getEnterpriseCode() == null ? other.getEnterpriseCode() == null : this.getEnterpriseCode().equals(other.getEnterpriseCode()))
            && (this.getEnterpriseCodeDate() == null ? other.getEnterpriseCodeDate() == null : this.getEnterpriseCodeDate().equals(other.getEnterpriseCodeDate()))
            && (this.getBusinessLicense() == null ? other.getBusinessLicense() == null : this.getBusinessLicense().equals(other.getBusinessLicense()))
            && (this.getBusinessLicenseDate() == null ? other.getBusinessLicenseDate() == null : this.getBusinessLicenseDate().equals(other.getBusinessLicenseDate()))
            && (this.getEnterpriseLetterOfCredit() == null ? other.getEnterpriseLetterOfCredit() == null : this.getEnterpriseLetterOfCredit().equals(other.getEnterpriseLetterOfCredit()))
            && (this.getEnterpriseLetterNumber() == null ? other.getEnterpriseLetterNumber() == null : this.getEnterpriseLetterNumber().equals(other.getEnterpriseLetterNumber()))
            && (this.getEnterpriseLetterData() == null ? other.getEnterpriseLetterData() == null : this.getEnterpriseLetterData().equals(other.getEnterpriseLetterData()))
            && (this.getFixedAssets() == null ? other.getFixedAssets() == null : this.getFixedAssets().equals(other.getFixedAssets()))
            && (this.getCompanyProfile() == null ? other.getCompanyProfile() == null : this.getCompanyProfile().equals(other.getCompanyProfile()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getDelState() == null ? other.getDelState() == null : this.getDelState().equals(other.getDelState()))
            && (this.getSuppliersId() == null ? other.getSuppliersId() == null : this.getSuppliersId().equals(other.getSuppliersId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getEnterpriseName() == null) ? 0 : getEnterpriseName().hashCode());
        result = prime * result + ((getEnterpriseType() == null) ? 0 : getEnterpriseType().hashCode());
        result = prime * result + ((getLicense() == null) ? 0 : getLicense().hashCode());
        result = prime * result + ((getLicenseExpirationDate() == null) ? 0 : getLicenseExpirationDate().hashCode());
        result = prime * result + ((getEnterpriseContacts() == null) ? 0 : getEnterpriseContacts().hashCode());
        result = prime * result + ((getEnterpriseTelephone() == null) ? 0 : getEnterpriseTelephone().hashCode());
        result = prime * result + ((getBusinessScope() == null) ? 0 : getBusinessScope().hashCode());
        result = prime * result + ((getRegisteredAddress() == null) ? 0 : getRegisteredAddress().hashCode());
        result = prime * result + ((getContactAddress() == null) ? 0 : getContactAddress().hashCode());
        result = prime * result + ((getPostalCode() == null) ? 0 : getPostalCode().hashCode());
        result = prime * result + ((getTotalAssets() == null) ? 0 : getTotalAssets().hashCode());
        result = prime * result + ((getCorporateFax() == null) ? 0 : getCorporateFax().hashCode());
        result = prime * result + ((getLegalPerson() == null) ? 0 : getLegalPerson().hashCode());
        result = prime * result + ((getLegalPersonIdCard() == null) ? 0 : getLegalPersonIdCard().hashCode());
        result = prime * result + ((getEnterpriseRegisteredCapital() == null) ? 0 : getEnterpriseRegisteredCapital().hashCode());
        result = prime * result + ((getSalesAmountLastYear() == null) ? 0 : getSalesAmountLastYear().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getWebsite() == null) ? 0 : getWebsite().hashCode());
        result = prime * result + ((getEnterpriseCode() == null) ? 0 : getEnterpriseCode().hashCode());
        result = prime * result + ((getEnterpriseCodeDate() == null) ? 0 : getEnterpriseCodeDate().hashCode());
        result = prime * result + ((getBusinessLicense() == null) ? 0 : getBusinessLicense().hashCode());
        result = prime * result + ((getBusinessLicenseDate() == null) ? 0 : getBusinessLicenseDate().hashCode());
        result = prime * result + ((getEnterpriseLetterOfCredit() == null) ? 0 : getEnterpriseLetterOfCredit().hashCode());
        result = prime * result + ((getEnterpriseLetterNumber() == null) ? 0 : getEnterpriseLetterNumber().hashCode());
        result = prime * result + ((getEnterpriseLetterData() == null) ? 0 : getEnterpriseLetterData().hashCode());
        result = prime * result + ((getFixedAssets() == null) ? 0 : getFixedAssets().hashCode());
        result = prime * result + ((getCompanyProfile() == null) ? 0 : getCompanyProfile().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getDelState() == null) ? 0 : getDelState().hashCode());
        result = prime * result + ((getSuppliersId() == null) ? 0 : getSuppliersId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", enterpriseName=").append(enterpriseName);
        sb.append(", enterpriseType=").append(enterpriseType);
        sb.append(", license=").append(license);
        sb.append(", licenseExpirationDate=").append(licenseExpirationDate);
        sb.append(", enterpriseContacts=").append(enterpriseContacts);
        sb.append(", enterpriseTelephone=").append(enterpriseTelephone);
        sb.append(", businessScope=").append(businessScope);
        sb.append(", registeredAddress=").append(registeredAddress);
        sb.append(", contactAddress=").append(contactAddress);
        sb.append(", postalCode=").append(postalCode);
        sb.append(", totalAssets=").append(totalAssets);
        sb.append(", corporateFax=").append(corporateFax);
        sb.append(", legalPerson=").append(legalPerson);
        sb.append(", legalPersonIdCard=").append(legalPersonIdCard);
        sb.append(", enterpriseRegisteredCapital=").append(enterpriseRegisteredCapital);
        sb.append(", salesAmountLastYear=").append(salesAmountLastYear);
        sb.append(", email=").append(email);
        sb.append(", website=").append(website);
        sb.append(", enterpriseCode=").append(enterpriseCode);
        sb.append(", enterpriseCodeDate=").append(enterpriseCodeDate);
        sb.append(", businessLicense=").append(businessLicense);
        sb.append(", businessLicenseDate=").append(businessLicenseDate);
        sb.append(", enterpriseLetterOfCredit=").append(enterpriseLetterOfCredit);
        sb.append(", enterpriseLetterNumber=").append(enterpriseLetterNumber);
        sb.append(", enterpriseLetterData=").append(enterpriseLetterData);
        sb.append(", fixedAssets=").append(fixedAssets);
        sb.append(", companyProfile=").append(companyProfile);
        sb.append(", remark=").append(remark);
        sb.append(", delState=").append(delState);
        sb.append(", suppliersId=").append(suppliersId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}