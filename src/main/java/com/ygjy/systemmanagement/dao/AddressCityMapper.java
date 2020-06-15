package com.ygjy.systemmanagement.dao;

import com.ygjy.systemmanagement.pojo.AddressCity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface AddressCityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AddressCity record);

    int insertSelective(AddressCity record);

    AddressCity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AddressCity record);

    int updateByPrimaryKey(AddressCity record);

    /**
     * 通过省代码查询下属市
     * @param pcode
     * @return
     */
    List<AddressCity> selectByPcode(String pcode);
}