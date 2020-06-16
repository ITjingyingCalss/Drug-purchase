package com.ygjy.systemmanagement.dao;

import com.ygjy.systemmanagement.pojo.Suppliers;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SuppliersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Suppliers record);

    int insertSelective(Suppliers record);

    Suppliers selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Suppliers record);

    int updateByPrimaryKey(Suppliers record);

    /**
     * 查询所有供货商
     * @param suppliersId
     * @param supplierName
     * @param supplierAddress
     * @return
     */
    List<Suppliers> selectAllSuppliers(@Param("suppliersId")Integer suppliersId,@Param("supplierName") String supplierName,@Param("supplierAddress") String supplierAddress);

    /**
     * 批量导出供货商信息
     * @param id
     * @return
     */
    List<Suppliers> querySuppliersList(String[] id);
}