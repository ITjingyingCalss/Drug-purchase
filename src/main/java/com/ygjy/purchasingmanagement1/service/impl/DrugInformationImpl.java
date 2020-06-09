package com.ygjy.purchasingmanagement1.service.impl;

import com.ygjy.pojo.DrugInformation;
import com.ygjy.purchasingmanagement1.service.DrugInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrugInformationImpl implements DrugInformationService {
    @Autowired
    DrugInformationService drugInformationService;

    @Override
    public List<DrugInformation> selectAll() {
        return drugInformationService.selectAll();
    }
}
