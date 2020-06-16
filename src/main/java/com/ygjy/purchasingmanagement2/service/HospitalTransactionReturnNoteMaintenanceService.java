package com.ygjy.purchasingmanagement2.service;


import com.ygjy.purchasingmanagement2.pojo.HospitalTransactionReturn;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * HospitalTransactionReturnNoteMaintenanceDao继承基类
 * 退货单维护页面
 */
@Mapper
@Repository
public interface HospitalTransactionReturnNoteMaintenanceService {

    /*导出*/
    List<HospitalTransactionReturn> exportAll1(HospitalTransactionReturn hospital);

}