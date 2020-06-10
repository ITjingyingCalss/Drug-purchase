package com.ygjy.purchasingmanagement2.dao;


import com.ygjy.purchasingmanagement2.pojo.HospitalTransactionReturn;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * HospitalTransactionReturnDAO继承基类
 */
@Mapper
@Repository
public interface HospitalTransactionReturnsDao {

    /*添加退货单*/
    int insert(HospitalTransactionReturn hosp);

    /*查询所有到页面*/
    List<HospitalTransactionReturn> list(HospitalTransactionReturn htrList);

    /*修改回显*/
    HospitalTransactionReturn htrSee(Integer id);

    /*更新*/
    int update(HospitalTransactionReturn htr);
}