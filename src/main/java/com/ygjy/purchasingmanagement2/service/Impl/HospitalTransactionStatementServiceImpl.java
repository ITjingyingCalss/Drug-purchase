package com.ygjy.purchasingmanagement2.service.Impl;


import com.ygjy.purchasingmanagement2.dao.HospitalTransactionStatementDao;
import com.ygjy.purchasingmanagement2.pojo.HospitalTransactionStatement;
import com.ygjy.purchasingmanagement2.service.HospitalTransactionStatementService;
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
public class HospitalTransactionStatementServiceImpl implements HospitalTransactionStatementService {

    @Autowired
    HospitalTransactionStatementDao hospitalTransactionStatementDao;

    /*添加退货单*/
    @Override
    public int insert(HospitalTransactionStatement hosp) {

        return hospitalTransactionStatementDao.insert(hosp);
    }

    /*查询全部到页面*/
    @Override
    public List<HospitalTransactionStatement> list(HospitalTransactionStatement htrList) {

        return hospitalTransactionStatementDao.list(htrList);
    }

    /*修改回显*/
    @Override
    public HospitalTransactionStatement htrSee(Integer id) {

        return hospitalTransactionStatementDao.htrSee(id);

    }

    /*更新*/
    @Override
    public int update1(HospitalTransactionStatement htr) {

        return hospitalTransactionStatementDao.update1(htr);
    }

    @Override
    public boolean removeByKeys(String[] ids) {


        int result=hospitalTransactionStatementDao.deleteByKeys(ids);
        if (result>0) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public List<HospitalTransactionStatement> selList(String statementNumber, String statementName, Integer hospitalId, Integer statementStateId) {

        return hospitalTransactionStatementDao.selList(statementNumber,statementName, hospitalId, statementStateId);
    }
}
