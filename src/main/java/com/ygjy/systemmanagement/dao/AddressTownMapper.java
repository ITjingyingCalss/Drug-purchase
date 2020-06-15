package com.ygjy.systemmanagement.dao;

import com.ygjy.systemmanagement.pojo.AddressTown;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface AddressTownMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AddressTown record);

    int insertSelective(AddressTown record);

    AddressTown selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AddressTown record);

    int updateByPrimaryKey(AddressTown record);

    /**
     * 通过市代码查询下属县
     * @param ccode
     * @return
     */
    List<AddressTown> selectTownByCcode(String ccode);
}