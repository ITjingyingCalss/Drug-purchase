package com.ygjy.purchasingmanagement2.service.Impl;

import com.ygjy.purchasingmanagement2.pojo.HospitalTransactionReturn;
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

    /*添加退货单*/
    @Override
    public int insert(HospitalTransactionReturn hosp) {

        return hospitalTransactionReturnsDao.insert(hosp);
    }

    /*查询全部到页面*/
    @Override
    public List<HospitalTransactionReturn> list(HospitalTransactionReturn htrList) {

        return hospitalTransactionReturnsDao.list(htrList);
    }

    /*修改回显*/
    @Override
    public HospitalTransactionReturn htrSee(Integer id) {

        return hospitalTransactionReturnsDao.htrSee(id);

    }

    /*更新*/
    @Override
    public int update(HospitalTransactionReturn htr) {

        return hospitalTransactionReturnsDao.update(htr);
    }
}
