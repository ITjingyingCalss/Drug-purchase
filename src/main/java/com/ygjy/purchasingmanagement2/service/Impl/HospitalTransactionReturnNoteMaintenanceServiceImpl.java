package com.ygjy.purchasingmanagement2.service.Impl;


import com.ygjy.purchasingmanagement2.dao.HospitalTransactionReturnNoteMaintenanceDao;
import com.ygjy.purchasingmanagement2.pojo.HospitalTransactionReturn;
import com.ygjy.purchasingmanagement2.service.HospitalTransactionReturnNoteMaintenanceService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * HospitalTransactionReturnNoteMaintenanceDao继承基类
 * 退货单维护页面
 */
@Mapper
@Repository
public class HospitalTransactionReturnNoteMaintenanceServiceImpl implements HospitalTransactionReturnNoteMaintenanceService {

    @Autowired
    HospitalTransactionReturnNoteMaintenanceDao hospitalTransactionReturnNoteMaintenanceDao;


    /*导出*/
    @Override
    public List<HospitalTransactionReturn> exportAll1(HospitalTransactionReturn hospital) {
        return hospitalTransactionReturnNoteMaintenanceDao.exportAll1(hospital);
    }
}