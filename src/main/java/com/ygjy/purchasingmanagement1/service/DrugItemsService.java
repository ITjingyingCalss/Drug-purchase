package com.ygjy.purchasingmanagement1.service;

import com.ygjy.purchasingmanagement1.pojo.DrugItems;

import java.util.List;

public interface DrugItemsService {

    //查询所有
    public List<DrugItems> selectItems();
    //模糊查询
    public List<DrugItems> selectItemsLike(String drugItemsNumber,String commonName, Integer dosageFormId, String specification, String unit, String conversionFraction,Integer drugCategoryId ,String state);
    //品目Id查询
    public DrugItems selectByItemsId(Integer itemsId);
    //药品品目修改
    public int updataDrugItems(DrugItems drugItems);
    //药品目录删除
    public int deleteDrugItems(Integer itemsId);
    //添加药品品目
    public int insertDrugItems(DrugItems drugItems);
}
