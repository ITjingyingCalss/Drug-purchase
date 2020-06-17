package com.ygjy.purchasingmanagement1.service.impl;

import com.ygjy.purchasingmanagement1.pojo.DrugItems;
import com.ygjy.purchasingmanagement1.dao.DrugItemsDao;
import com.ygjy.purchasingmanagement1.service.DrugItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Repository
public class DrugItemsImpl implements DrugItemsService {

    @Autowired
    DrugItemsDao drugItemsDao;

    @Override
    public List<DrugItems> selectItems() {
        return drugItemsDao.selectItems();
    }

    @Override
    public List<DrugItems> selectItemsLike(String drugItemsNumber, String commonName, Integer dosageFormId, String specification, String unit, String conversionFraction, Integer drugCategoryId, String state) {
        return drugItemsDao.selectItemsLike(drugItemsNumber,commonName, dosageFormId,specification, unit,  conversionFraction, drugCategoryId ,state);
    }

    @Override
    public DrugItems selectByItemsId(Integer itemsId) {
        return drugItemsDao.selectByItemsId(itemsId);
    }

    @Override
    public int updataDrugItems(DrugItems drugItems) {
        return drugItemsDao.updataDrugItems(drugItems);
    }

    @Override
    public int deleteDrugItems(Integer itemsId) {
        return drugItemsDao.deleteDrugItems(itemsId);
    }

    @Override
    public int insertDrugItems(DrugItems drugItems) {
        return drugItemsDao.insertDrugItems(drugItems);
    }


}
