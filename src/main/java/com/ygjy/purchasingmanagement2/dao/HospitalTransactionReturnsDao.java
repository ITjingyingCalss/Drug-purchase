package com.ygjy.purchasingmanagement2.dao;


import com.ygjy.purchasingmanagement2.pojo.HospitalTransactionReturn;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.sql.Date;
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
    List<HospitalTransactionReturn> list(@Param("returnOrderNumber") String returnOrderNumber,
                                         @Param("returnOrderName") String returnOrderName,
                                         @Param("returnStateId") Integer returnStateId,
                                         @Param("contacts") String contacts,
                                         @Param("phone") String phone,
                                         @Param("creatReceiptsPerson") String creatReceiptsPerson,
                                         @Param("createReceiptsTime") String createReceiptsTime,
                                         @Param("submissionTime") String submissionTime,
                                         @Param("remark") String remark,
                                         @Param("hospitalId") Integer hospitalId);

    /*修改回显*/
    HospitalTransactionReturn htrSee(Integer id);

    /*更新*/
    int update(HospitalTransactionReturn htr);

    /*批量删除*/
    int deleteByKeys(String[] ids);

    /*条件查询*/
/*    List<HospitalTransactionReturn> selList(@Param("returnOrderNumber") String returnOrderNumber, @Param("returnOrderName") String returnOrderName,
                                            @Param("hospitalId") Integer hospitalId, @Param("returnStateId") Integer returnStateId);*/

    /*导出*/
    List<HospitalTransactionReturn> exportAll(HospitalTransactionReturn hospital);
}