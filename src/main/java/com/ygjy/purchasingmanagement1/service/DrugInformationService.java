package com.ygjy.purchasingmanagement1.service;

import com.ygjy.pojo.DrugInformation;
import com.ygjy.purchasingmanagement1.pojo.DrugInformation2;

import java.util.List;

public interface DrugInformationService {
    //查询所有
    public List<DrugInformation2> selectAll();
    //模糊查询
    public List<DrugInformation2> selectLike(Integer serialNumber, String commonName, Integer dosageFormId, String specification, String unit, String conversionFraction, Integer enterpriseNameId, String tradeName, Double biddingPrice, Integer qualityLevelId, Integer drugCategoryId, Integer drugTransactionStatusId);
    //添加药品
    public int addDrug(DrugInformation2 drugInformation);
    //流水号查询
    public DrugInformation2 selectById(Integer id);
    //修改
    public int updateDrug(DrugInformation2 drugInformation);
    //删除
    public int deleteDrug(Integer id);
}
