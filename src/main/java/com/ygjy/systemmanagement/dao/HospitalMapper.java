package com.ygjy.systemmanagement.dao;

import com.ygjy.systemmanagement.pojo.Hospital;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface HospitalMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Hospital record);

    int insertSelective(Hospital record);

    Hospital selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Hospital record);

    int updateByPrimaryKey(Hospital record);

    List<Hospital> selectAllHospital(@Param("hospitalName") String hospitalName,@Param("hospitalLevel") String hospitalLevel,@Param("hospitalType") String hospitalType);

    List<Hospital> queryHospitalList(String[] id);

    Hospital selectHospitalProperty(@Param("hospitalName") String hospitalName,@Param("hospitalTelephone") String hospitalTelephone,@Param("hospitalFax") String hospitalFax,@Param("pharmacyTelephone") String pharmacyTelephone);
}