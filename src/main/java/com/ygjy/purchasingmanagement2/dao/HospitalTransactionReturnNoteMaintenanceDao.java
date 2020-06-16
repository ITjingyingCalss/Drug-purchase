package com.ygjy.purchasingmanagement2.dao;


import com.ygjy.purchasingmanagement2.pojo.HospitalTransactionReturn;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * HHospitalTransactionReturnNoteMaintenanceDao继承基类
 * 退货单维护页面
 */
@Mapper
@Repository
public interface HospitalTransactionReturnNoteMaintenanceDao {

    /*导出*/
    List<HospitalTransactionReturn> exportAll1(HospitalTransactionReturn hospital);

}