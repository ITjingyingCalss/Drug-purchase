package com.ygjy.systemmanagement.pojo;

import java.util.Date;

public class ProxyMonitor {
    private Integer id;

    private Integer proxyMonitorId;

    private String proxyMonitorName;

    private String proxyMonitorAddress;

    private String proxyMonitorPhone;

    private Integer proxyMonitorStatus;

    private Date proxyMonitorCreateTime;

    private Date proxyMonitorUpdateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProxyMonitorId() {
        return proxyMonitorId;
    }

    public void setProxyMonitorId(Integer proxyMonitorId) {
        this.proxyMonitorId = proxyMonitorId;
    }

    public String getProxyMonitorName() {
        return proxyMonitorName;
    }

    public void setProxyMonitorName(String proxyMonitorName) {
        this.proxyMonitorName = proxyMonitorName == null ? null : proxyMonitorName.trim();
    }

    public String getProxyMonitorAddress() {
        return proxyMonitorAddress;
    }

    public void setProxyMonitorAddress(String proxyMonitorAddress) {
        this.proxyMonitorAddress = proxyMonitorAddress == null ? null : proxyMonitorAddress.trim();
    }

    public String getProxyMonitorPhone() {
        return proxyMonitorPhone;
    }

    public void setProxyMonitorPhone(String proxyMonitorPhone) {
        this.proxyMonitorPhone = proxyMonitorPhone == null ? null : proxyMonitorPhone.trim();
    }

    public Integer getProxyMonitorStatus() {
        return proxyMonitorStatus;
    }

    public void setProxyMonitorStatus(Integer proxyMonitorStatus) {
        this.proxyMonitorStatus = proxyMonitorStatus;
    }

    public Date getProxyMonitorCreateTime() {
        return proxyMonitorCreateTime;
    }

    public void setProxyMonitorCreateTime(Date proxyMonitorCreateTime) {
        this.proxyMonitorCreateTime = proxyMonitorCreateTime;
    }

    public Date getProxyMonitorUpdateTime() {
        return proxyMonitorUpdateTime;
    }

    public void setProxyMonitorUpdateTime(Date proxyMonitorUpdateTime) {
        this.proxyMonitorUpdateTime = proxyMonitorUpdateTime;
    }
}