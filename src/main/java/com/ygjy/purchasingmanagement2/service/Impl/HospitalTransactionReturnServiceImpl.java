package com.ygjy.purchasingmanagement2.service.Impl;

import com.ygjy.pojo.HospitalTransactionReturn;
import com.ygjy.purchasingmanagement2.dao.HospitalTransactionReturnsDao;
import com.ygjy.purchasingmanagement2.service.HospitalTransactionReturnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @outher: Huangdebao
 * @Date: 2020/6/9 0009 下午 2:10
 * Desc: 添加退货单
 */
@Service
public class HospitalTransactionReturnServiceImpl implements HospitalTransactionReturnService {

    @Autowired
    HospitalTransactionReturnsDao hospitalTransactionReturnsDao;

    @Override
    public int insert(HospitalTransactionReturn hosp) {

        return hospitalTransactionReturnsDao.insert(hosp);
    }
}
