package com.ygjy.purchasingmanagement2.dao;



import com.ygjy.purchasingmanagement2.pojo.HospitalTransactionStatement;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * HospitalTransactionReturnDAO继承基类
 */
@Mapper
@Repository
public interface HospitalTransactionStatementDao {

    /*添加退货单*/
    int insert(HospitalTransactionStatement hosp);

    /*查询所有到页面*/
    List<HospitalTransactionStatement> list(HospitalTransactionStatement htrList);

    /*修改回显*/
    HospitalTransactionStatement htrSee(Integer id);

    /*更新*/
    int update(HospitalTransactionStatement htr);

    /*批量删除*/
    int deleteByKeys(String[] ids);

    /*条件查询*/
    List<HospitalTransactionStatement> selList(@Param("returnOrderNumber") String returnOrderNumber, @Param("returnOrderName") String returnOrderName,
                                               @Param("hospitalId") Integer hospitalId, @Param("returnStateId") Integer returnStateId);
}