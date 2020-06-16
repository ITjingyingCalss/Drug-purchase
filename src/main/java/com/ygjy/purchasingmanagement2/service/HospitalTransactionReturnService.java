package com.ygjy.purchasingmanagement2.service;


import com.ygjy.pojo.DrugItems;
import com.ygjy.purchasingmanagement2.pojo.HospitalTransactionReturn;
import org.apache.ibatis.annotations.Param;


import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @outher: Huangdebao
 * @Date: 2020/6/9 0009 下午 2:01
 * Desc: 添加退货单
 */
public interface HospitalTransactionReturnService {

   /*添加退货单*/
   int insert(HospitalTransactionReturn hosp);

   /*查询所有到页面*/
   List<HospitalTransactionReturn> list(HospitalTransactionReturn htrList);

   /*修改回显*/
   HospitalTransactionReturn htrSee(Integer id);

   /*更新*/
   int update(HospitalTransactionReturn htr);

   /*批量删除*/
   boolean removeByKeys(String[] ids);

   /*条件查询*/
   List<HospitalTransactionReturn> selList(@Param("returnOrderNumber") String returnOrderNumber, @Param("returnOrderName") String returnOrderName,
                                           @Param("hospitalId") Integer hospitalId, @Param("returnStateId") Integer returnStateId);

   /*导出*/
   List<HospitalTransactionReturn> exportAll(HospitalTransactionReturn hospital);

}
