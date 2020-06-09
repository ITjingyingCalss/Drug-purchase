package com.ygjy.purchasingmanagement1.service;

import com.ygjy.pojo.DrugInformation;

import java.util.List;

public interface DrugInformationService {
    /**
     * 查询所有药品信息
     * @return
     */
    public List<DrugInformation> selectAll();
}
