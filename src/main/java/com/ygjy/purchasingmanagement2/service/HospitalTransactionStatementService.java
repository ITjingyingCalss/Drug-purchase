package com.ygjy.purchasingmanagement2.service;


import com.ygjy.purchasingmanagement2.pojo.HospitalTransactionStatement;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @outher: Huangdebao
 * @Date: 2020/6/9 0009 下午 2:01
 * Desc: 添加退货单
 */
public interface HospitalTransactionStatementService {

   /*添加退货单*/
   int insert(HospitalTransactionStatement hosp);

   /*查询所有到页面*/
   List<HospitalTransactionStatement> list(HospitalTransactionStatement htrList);

   /*修改回显*/
   HospitalTransactionStatement htrSee(Integer id);

   /*更新*/
   int update1(HospitalTransactionStatement htr);

   /*批量删除*/
   boolean removeByKeys(String[] ids);

   /*条件查询*/
   List<HospitalTransactionStatement> selList(@Param("statementNumber") String statementNumber, @Param("statementName") String statementName,
                                              @Param("hospitalId") Integer hospitalId, @Param("statementStateId") Integer statementStateId);


}
