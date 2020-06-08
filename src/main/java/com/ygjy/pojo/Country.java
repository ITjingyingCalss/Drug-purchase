package com.ygjy.pojo;

import java.io.Serializable;

/**
 * country
 * @author 
 */
public class Country implements Serializable {
    private Integer 


countryId;

    private String 

countryName;

    /**
     * 等级
     */
    private Integer grade;

    /**
     * 父区域id
     */
    private Integer parentId;

    private static final long serialVersionUID = 1L;

    public Integer get


countryId() {
        return 


countryId;
    }

    public void set


countryId(Integer 


countryId) {
        this.


countryId = 


countryId;
    }

    public String get

countryName() {
        return 

countryName;
    }

    public void set

countryName(String 

countryName) {
        this.

countryName = 

countryName;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
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
        Country other = (Country) that;
        return (this.get


countryId() == null ? other.get


countryId() == null : this.get


countryId().equals(other.get


countryId()))
            && (this.get

countryName() == null ? other.get

countryName() == null : this.get

countryName().equals(other.get

countryName()))
            && (this.getGrade() == null ? other.getGrade() == null : this.getGrade().equals(other.getGrade()))
            && (this.getParentId() == null ? other.getParentId() == null : this.getParentId().equals(other.getParentId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((get


countryId() == null) ? 0 : get


countryId().hashCode());
        result = prime * result + ((get

countryName() == null) ? 0 : get

countryName().hashCode());
        result = prime * result + ((getGrade() == null) ? 0 : getGrade().hashCode());
        result = prime * result + ((getParentId() == null) ? 0 : getParentId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", 


countryId=").append(


countryId);
        sb.append(", 

countryName=").append(

countryName);
        sb.append(", grade=").append(grade);
        sb.append(", parentId=").append(parentId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}