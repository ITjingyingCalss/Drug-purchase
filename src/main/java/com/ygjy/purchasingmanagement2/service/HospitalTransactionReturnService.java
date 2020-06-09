package com.ygjy.purchasingmanagement2.service;


import com.ygjy.pojo.HospitalTransactionReturn;
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

   int insert(HospitalTransactionReturn hosp);


}
