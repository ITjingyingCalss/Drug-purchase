package com.ygjy.systemmanagement.dao;

import com.ygjy.systemmanagement.pojo.ProxyMonitor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Mapper
public interface ProxyMonitorMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ProxyMonitor record);

    int insertSelective(ProxyMonitor record);

    ProxyMonitor selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProxyMonitor record);

    int updateByPrimaryKey(ProxyMonitor record);

    List<ProxyMonitor> selectProxyMonitorAll(@Param("proxyMonitorId") Integer proxyMonitorId, @Param("proxyMonitorName")String proxyMonitorName,
                                             @Param("proxyMonitorAddress") String proxyMonitorAddress);

    List<ProxyMonitor> queryProxyMonitorList(String[] id);

}