package com.ygjy.purchasingmanagement1.service;

import com.ygjy.pojo.DrugInformation;

import java.util.List;

public interface DrugInformationService {
    //查询所有
    public List<DrugInformation> selectAll();
    //模糊查询
    public List<DrugInformation> selectLike(Integer serialNumber, String commonName, Integer dosageFormId, String specification, String unit, String conversionFraction, Integer enterpriseNameId, String tradeName, Double biddingPrice, Integer qualityLevelId, Integer drugCategoryId, Integer drugTransactionStatusId);
    //添加药品
    public int addDrug(DrugInformation drugInformation);
    //流水号查询
    public DrugInformation selectById(Integer id);
    //修改
    public int updateDrug(DrugInformation drugInformation);
    //删除
    public int deleteDrug(Integer id);
}
