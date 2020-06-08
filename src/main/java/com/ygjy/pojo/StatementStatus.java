package com.ygjy.pojo;

import java.io.Serializable;

/**
 * statement_status
 * @author 
 */
public class StatementStatus implements Serializable {
    /**
     * 结算单状态
     */
    private Integer id;

    /**
     * 结算单状态
     */
    private Integer statementState;

    /**
     * 结算单状态
     */
    private String statementExplain;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStatementState() {
        return statementState;
    }

    public void setStatementState(Integer statementState) {
        this.statementState = statementState;
    }

    public String getStatementExplain() {
        return statementExplain;
    }

    public void setStatementExplain(String statementExplain) {
        this.statementExplain = statementExplain;
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
        StatementStatus other = (StatementStatus) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getStatementState() == null ? other.getStatementState() == null : this.getStatementState().equals(other.getStatementState()))
            && (this.getStatementExplain() == null ? other.getStatementExplain() == null : this.getStatementExplain().equals(other.getStatementExplain()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getStatementState() == null) ? 0 : getStatementState().hashCode());
        result = prime * result + ((getStatementExplain() == null) ? 0 : getStatementExplain().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", statementState=").append(statementState);
        sb.append(", statementExplain=").append(statementExplain);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}