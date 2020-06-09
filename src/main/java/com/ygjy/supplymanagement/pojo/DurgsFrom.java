package com.ygjy.supplymanagement.pojo;

import java.io.Serializable;

/**
 * durgs_from
 * @author 
 */
public class DurgsFrom implements Serializable {
    private Integer durgFromId;

    /**
     * 剂型
     */
    private String drugFrom;

    /**
     * 描述
     */
    private String note;

    private static final long serialVersionUID = 1L;

    public Integer getDurgFromId() {
        return durgFromId;
    }

    public void setDurgFromId(Integer durgFromId) {
        this.durgFromId = durgFromId;
    }

    public String getDrugFrom() {
        return drugFrom;
    }

    public void setDrugFrom(String drugFrom) {
        this.drugFrom = drugFrom;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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
        DurgsFrom other = (DurgsFrom) that;
        return (this.getDurgFromId() == null ? other.getDurgFromId() == null : this.getDurgFromId().equals(other.getDurgFromId()))
            && (this.getDrugFrom() == null ? other.getDrugFrom() == null : this.getDrugFrom().equals(other.getDrugFrom()))
            && (this.getNote() == null ? other.getNote() == null : this.getNote().equals(other.getNote()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDurgFromId() == null) ? 0 : getDurgFromId().hashCode());
        result = prime * result + ((getDrugFrom() == null) ? 0 : getDrugFrom().hashCode());
        result = prime * result + ((getNote() == null) ? 0 : getNote().hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "DurgsFrom{" +
                "durgFromId=" + durgFromId +
                ", drugFrom='" + drugFrom + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}