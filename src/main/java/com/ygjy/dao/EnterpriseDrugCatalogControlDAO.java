package com.ygjy.dao;

import com.ygjy.pojo.EnterpriseDrugCatalogControl;
import com.ygjy.pojo.EnterpriseDrugCatalogControlExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * EnterpriseDrugCatalogControlDAO继承基类
 */
@Mapper
@Repository
public interface EnterpriseDrugCatalogControlDAO extends MyBatisBaseDao<EnterpriseDrugCatalogControl, Integer, EnterpriseDrugCatalogControlExample> {
}