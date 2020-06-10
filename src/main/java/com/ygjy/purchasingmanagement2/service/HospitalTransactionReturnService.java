package com.ygjy.purchasingmanagement2.service;


import com.ygjy.purchasingmanagement2.pojo.HospitalTransactionReturn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
