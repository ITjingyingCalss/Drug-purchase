package com.ygjy.supervision.service.impl;

import com.ygjy.pojo.DurgsFrom;
import com.ygjy.dao.DurgsFromDAO;
import com.ygjy.supervision.service.DrugItemMaintenanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrugItemMaintenanceServiceImpl implements DrugItemMaintenanceService {
    @Autowired private DurgsFromDAO durgsFromMapper;

    @Override
    public List<DurgsFrom> findSelectOption() {
        return null;
                //durgsFromMapper.selectAll();
        /*for (DurgsFrom durgsFrom :
                list) {
            System.err.println(durgsFrom);
        }*/
    }
}
