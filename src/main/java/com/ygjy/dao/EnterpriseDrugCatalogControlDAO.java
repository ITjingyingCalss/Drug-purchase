package com.ygjy.dao;

import com.ygjy.pojo.EnterpriseDrugCatalogControl;
import com.ygjy.pojo.EnterpriseDrugCatalogControlExample;
import org.springframework.stereotype.Repository;

/**
 * EnterpriseDrugCatalogControlDAO继承基类
 */
@Repository
public interface EnterpriseDrugCatalogControlDAO extends MyBatisBaseDao<EnterpriseDrugCatalogControl, Integer, EnterpriseDrugCatalogControlExample> {
}