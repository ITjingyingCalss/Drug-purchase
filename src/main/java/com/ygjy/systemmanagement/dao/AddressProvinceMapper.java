package com.ygjy.systemmanagement.dao;

import com.ygjy.systemmanagement.pojo.AddressProvince;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface AddressProvinceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AddressProvince record);

    int insertSelective(AddressProvince record);

    AddressProvince selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AddressProvince record);

    int updateByPrimaryKey(AddressProvince record);

    /**
     * 查询所有省
     * @return
     */
    List<AddressProvince> selectAll();
}