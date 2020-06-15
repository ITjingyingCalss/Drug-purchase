package com.ygjy.systemmanagement.pojo;

public class Area {
    private Integer id;

    private Integer pCode;

    private String pName;

    private Integer cCode;

    private String cName;

    private Integer cuCode;

    private String cuName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getpCode() {
        return pCode;
    }

    public void setpCode(Integer pCode) {
        this.pCode = pCode;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName == null ? null : pName.trim();
    }

    public Integer getcCode() {
        return cCode;
    }

    public void setcCode(Integer cCode) {
        this.cCode = cCode;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    public Integer getCuCode() {
        return cuCode;
    }

    public void setCuCode(Integer cuCode) {
        this.cuCode = cuCode;
    }

    public String getCuName() {
        return cuName;
    }

    public void setCuName(String cuName) {
        this.cuName = cuName == null ? null : cuName.trim();
    }
}