package com.ygjy.pojo;

import java.io.Serializable;

/**
 * role_jurisdiction
 * @author 
 */
public class RoleJurisdiction implements Serializable {
    /**
     * 角色id
     */
    private Integer roleId;

    /**
     * 权限id
     */
    private Integer jurId;

    private static final long serialVersionUID = 1L;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getJurId() {
        return jurId;
    }

    public void setJurId(Integer jurId) {
        this.jurId = jurId;
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
        RoleJurisdiction other = (RoleJurisdiction) that;
        return (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()))
            && (this.getJurId() == null ? other.getJurId() == null : this.getJurId().equals(other.getJurId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        result = prime * result + ((getJurId() == null) ? 0 : getJurId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", roleId=").append(roleId);
        sb.append(", jurId=").append(jurId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}