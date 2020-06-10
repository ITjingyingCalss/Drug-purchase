package com.ygjy.systemmanagement.pojo;

import java.util.Date;
import java.util.List;

public class Role {
    private Integer id;

    private Integer roleId;

    private String roleName;

    private String roleDescription;

    private Integer roleStatus;

    private Date roleCreateTime;

    private Date roleUpdateTime;

    private Jurisdiction jurisdiction;

    private List<Jurisdiction> jurisdictionList;

    private List<RoleJurisdiction> roleJurisdictionList;

    public List<RoleJurisdiction> getRoleJurisdictionList() {
        return roleJurisdictionList;
    }

    public void setRoleJurisdictionList(List<RoleJurisdiction> roleJurisdictionList) {
        this.roleJurisdictionList = roleJurisdictionList;
    }

    public List<Jurisdiction> getJurisdictionList() {
        return jurisdictionList;
    }

    public void setJurisdictionList(List<Jurisdiction> jurisdictionList) {
        this.jurisdictionList = jurisdictionList;
    }

    public Jurisdiction getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(Jurisdiction jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRoleDescription() {
        return roleDescription;
    }

    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription == null ? null : roleDescription.trim();
    }

    public Integer getRoleStatus() {
        return roleStatus;
    }

    public void setRoleStatus(Integer roleStatus) {
        this.roleStatus = roleStatus;
    }

    public Date getRoleCreateTime() {
        return roleCreateTime;
    }

    public void setRoleCreateTime(Date roleCreateTime) {
        this.roleCreateTime = roleCreateTime;
    }

    public Date getRoleUpdateTime() {
        return roleUpdateTime;
    }

    public void setRoleUpdateTime(Date roleUpdateTime) {
        this.roleUpdateTime = roleUpdateTime;
    }
}