package com.ygjy.systemmanagement.pojo;

public class Hospital {
    private Integer id;

    private Integer hospitalId;

    private String hospitalName;

    private String postalAddress;

    private String postalCode;

    private String area;

    private String hospitalLevel;

    private Integer numberOfBeds;

    private Float makeMoney;

    private String hospitalTelephone;

    private String hospitalFax;

    private String pharmacyTelephone;

    private String hospitalType;

    private String drugRevenueLastYear;

    private String businessIncomeLastYear;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(Integer hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName == null ? null : hospitalName.trim();
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress == null ? null : postalAddress.trim();
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode == null ? null : postalCode.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getHospitalLevel() {
        return hospitalLevel;
    }

    public void setHospitalLevel(String hospitalLevel) {
        this.hospitalLevel = hospitalLevel == null ? null : hospitalLevel.trim();
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
        this.hospitalTelephone = hospitalTelephone == null ? null : hospitalTelephone.trim();
    }

    public String getHospitalFax() {
        return hospitalFax;
    }

    public void setHospitalFax(String hospitalFax) {
        this.hospitalFax = hospitalFax == null ? null : hospitalFax.trim();
    }

    public String getPharmacyTelephone() {
        return pharmacyTelephone;
    }

    public void setPharmacyTelephone(String pharmacyTelephone) {
        this.pharmacyTelephone = pharmacyTelephone == null ? null : pharmacyTelephone.trim();
    }

    public String getHospitalType() {
        return hospitalType;
    }

    public void setHospitalType(String hospitalType) {
        this.hospitalType = hospitalType == null ? null : hospitalType.trim();
    }

    public String getDrugRevenueLastYear() {
        return drugRevenueLastYear;
    }

    public void setDrugRevenueLastYear(String drugRevenueLastYear) {
        this.drugRevenueLastYear = drugRevenueLastYear == null ? null : drugRevenueLastYear.trim();
    }

    public String getBusinessIncomeLastYear() {
        return businessIncomeLastYear;
    }

    public void setBusinessIncomeLastYear(String businessIncomeLastYear) {
        this.businessIncomeLastYear = businessIncomeLastYear == null ? null : businessIncomeLastYear.trim();
    }
}