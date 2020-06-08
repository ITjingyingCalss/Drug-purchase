package com.ygjy.dao;

import com.ygjy.pojo.EnterpriseDrugCatalog;
import com.ygjy.pojo.EnterpriseDrugCatalogExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * EnterpriseDrugCatalogDAO继承基类
 */
@Mapper
@Repository
public interface EnterpriseDrugCatalogDAO extends MyBatisBaseDao<EnterpriseDrugCatalog, Integer, EnterpriseDrugCatalogExample> {
}