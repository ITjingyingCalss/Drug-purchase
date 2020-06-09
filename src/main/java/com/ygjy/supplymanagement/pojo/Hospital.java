package com.ygjy.supplymanagement.pojo;

import java.io.Serializable;

/**
 * hospital
 * @author 
 */
public class Hospital implements Serializable {
    private Integer id;

    /**
     * 医院名称
     */
    private String hospitalName;

    /**
     * 通讯地址
     */
    private String postalAddress;

    /**
     * 邮政编码
     */
    private String postalCode;

    /**
     * 所属地区
     */
    private String area;

    /**
     * 医院级别
     */
    private String hospitalLevel;

    /**
     * 床位数
     */
    private Integer numberOfBeds;

    /**
     * 是否非营利性医疗机构(1：是，0：否)
     */
    private Float makeMoney;

    /**
     * 院办电话
     */
    private String hospitalTelephone;

    /**
     * 院办传真
     */
    private String hospitalFax;

    /**
     * 药剂科电话
     */
    private String pharmacyTelephone;

    /**
     * 医院类型
     */
    private String hospitalType;

    /**
     * 上年度药品收入
     */
    private String drugRevenueLastYear;

    /**
     * 上年度业务收入
     */
    private String businessIncomeLastYear;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getHospitalLevel() {
        return hospitalLevel;
    }

    public void setHospitalLevel(String hospitalLevel) {
        this.hospitalLevel = hospitalLevel;
    }

    public Integer getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(Integer numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public Float getMakeMoney() {
        return makeMoney;
    }

    public void setMakeMoney(Float makeMoney) {
        this.makeMoney = makeMoney;
    }

    public String getHospitalTelephone() {
        return hospitalTelephone;
    }

    public void setHospitalTelephone(String hospitalTelephone) {
        this.hospitalTelephone = hospitalTelephone;
    }

    public String getHospitalFax() {
        return hospitalFax;
    }

    public void setHospitalFax(String hospitalFax) {
        this.hospitalFax = hospitalFax;
    }

    public String getPharmacyTelephone() {
        return pharmacyTelephone;
    }

    public void setPharmacyTelephone(String pharmacyTelephone) {
        this.pharmacyTelephone = pharmacyTelephone;
    }

    public String getHospitalType() {
        return hospitalType;
    }

    public void setHospitalType(String hospitalType) {
        this.hospitalType = hospitalType;
    }

    public String getDrugRevenueLastYear() {
        return drugRevenueLastYear;
    }

    public void setDrugRevenueLastYear(String drugRevenueLastYear) {
        this.drugRevenueLastYear = drugRevenueLastYear;
    }

    public String getBusinessIncomeLastYear() {
        return businessIncomeLastYear;
    }

    public void setBusinessIncomeLastYear(String businessIncomeLastYear) {
        this.businessIncomeLastYear = businessIncomeLastYear;
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
        Hospital other = (Hospital) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getHospitalName() == null ? other.getHospitalName() == null : this.getHospitalName().equals(other.getHospitalName()))
            && (this.getPostalAddress() == null ? other.getPostalAddress() == null : this.getPostalAddress().equals(other.getPostalAddress()))
            && (this.getPostalCode() == null ? other.getPostalCode() == null : this.getPostalCode().equals(other.getPostalCode()))
            && (this.getArea() == null ? other.getArea() == null : this.getArea().equals(other.getArea()))
            && (this.getHospitalLevel() == null ? other.getHospitalLevel() == null : this.getHospitalLevel().equals(other.getHospitalLevel()))
            && (this.getNumberOfBeds() == null ? other.getNumberOfBeds() == null : this.getNumberOfBeds().equals(other.getNumberOfBeds()))
            && (this.getMakeMoney() == null ? other.getMakeMoney() == null : this.getMakeMoney().equals(other.getMakeMoney()))
            && (this.getHospitalTelephone() == null ? other.getHospitalTelephone() == null : this.getHospitalTelephone().equals(other.getHospitalTelephone()))
            && (this.getHospitalFax() == null ? other.getHospitalFax() == null : this.getHospitalFax().equals(other.getHospitalFax()))
            && (this.getPharmacyTelephone() == null ? other.getPharmacyTelephone() == null : this.getPharmacyTelephone().equals(other.getPharmacyTelephone()))
            && (this.getHospitalType() == null ? other.getHospitalType() == null : this.getHospitalType().equals(other.getHospitalType()))
            && (this.getDrugRevenueLastYear() == null ? other.getDrugRevenueLastYear() == null : this.getDrugRevenueLastYear().equals(other.getDrugRevenueLastYear()))
            && (this.getBusinessIncomeLastYear() == null ? other.getBusinessIncomeLastYear() == null : this.getBusinessIncomeLastYear().equals(other.getBusinessIncomeLastYear()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getHospitalName() == null) ? 0 : getHospitalName().hashCode());
        result = prime * result + ((getPostalAddress() == null) ? 0 : getPostalAddress().hashCode());
        result = prime * result + ((getPostalCode() == null) ? 0 : getPostalCode().hashCode());
        result = prime * result + ((getArea() == null) ? 0 : getArea().hashCode());
        result = prime * result + ((getHospitalLevel() == null) ? 0 : getHospitalLevel().hashCode());
        result = prime * result + ((getNumberOfBeds() == null) ? 0 : getNumberOfBeds().hashCode());
        result = prime * result + ((getMakeMoney() == null) ? 0 : getMakeMoney().hashCode());
        result = prime * result + ((getHospitalTelephone() == null) ? 0 : getHospitalTelephone().hashCode());
        result = prime * result + ((getHospitalFax() == null) ? 0 : getHospitalFax().hashCode());
        result = prime * result + ((getPharmacyTelephone() == null) ? 0 : getPharmacyTelephone().hashCode());
        result = prime * result + ((getHospitalType() == null) ? 0 : getHospitalType().hashCode());
        result = prime * result + ((getDrugRevenueLastYear() == null) ? 0 : getDrugRevenueLastYear().hashCode());
        result = prime * result + ((getBusinessIncomeLastYear() == null) ? 0 : getBusinessIncomeLastYear().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", hospitalName=").append(hospitalName);
        sb.append(", postalAddress=").append(postalAddress);
        sb.append(", postalCode=").append(postalCode);
        sb.append(", area=").append(area);
        sb.append(", hospitalLevel=").append(hospitalLevel);
        sb.append(", numberOfBeds=").append(numberOfBeds);
        sb.append(", makeMoney=").append(makeMoney);
        sb.append(", hospitalTelephone=").append(hospitalTelephone);
        sb.append(", hospitalFax=").append(hospitalFax);
        sb.append(", pharmacyTelephone=").append(pharmacyTelephone);
        sb.append(", hospitalType=").append(hospitalType);
        sb.append(", drugRevenueLastYear=").append(drugRevenueLastYear);
        sb.append(", businessIncomeLastYear=").append(businessIncomeLastYear);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}