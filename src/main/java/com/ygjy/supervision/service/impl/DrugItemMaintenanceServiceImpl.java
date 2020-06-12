package com.ygjy.supervision.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ygjy.dao.DrugCategoryDAO;
import com.ygjy.dao.DrugItemsDAO;
import com.ygjy.dao.DurgsFromDAO;
import com.ygjy.pojo.*;


import com.ygjy.supervision.dao.DrugItemsMapper;
import com.ygjy.supervision.service.DrugItemMaintenanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class DrugItemMaintenanceServiceImpl implements DrugItemMaintenanceService {


    @Autowired private DurgsFromDAO durgsFromDAO;
    @Autowired private DrugCategoryDAO drugCategoryDAO;
    @Autowired private DrugItemsDAO drugItemsDAO;
    @Autowired private DrugItemsMapper drugItemsMapper;

    @Override
    public Map findDrugFromAndDrugCategory() {
        Map map = new HashMap();
        DurgsFromExample durgsFromExample=new DurgsFromExample();
        DrugCategoryExample drugCategoryExample = new DrugCategoryExample();
        List<DurgsFrom> list_durgsFrom = durgsFromDAO.selectByExample(durgsFromExample);
        List<DrugCategory> list_drugCategory = drugCategoryDAO.selectByExample(drugCategoryExample);
        map.put("list_durgsFrom",list_durgsFrom);
        map.put("list_drugCategory",list_drugCategory);
        return map;
    }

    @Override
    public int drugItemsAdd(DrugItems drugItems) {
        System.err.println(drugItems);
        if (drugItems.getItemsId()==null){
            int itemsId = drugItemsMapper.findMaxItemsId()+1;
            String drugItemsNumber = "0000"+itemsId;
            drugItems.setDrugItemsNumber(drugItemsNumber);
            return  drugItemsMapper.drugItemsAdd(drugItems);
        }else {
            return  drugItemsDAO.updateByPrimaryKeySelective(drugItems);
        }

    }

    @Override
    public PageInfo findAllDrugItems(Integer pageNum,DrugItems drugItems) {
        int count = drugItemsMapper.findDrugItemsCount();
        PageHelper.startPage(pageNum,5);
        List<DrugItems> list = drugItemsMapper.findAllDrugItems(drugItems);
        return new PageInfo(list);
    }

    @Override
    public DrugItems findItemsById(Integer itemsId) {
        return drugItemsDAO.selectByPrimaryKey(itemsId);
    }

    @Override
    public Integer updateItemsState(Integer itemsId) {
        return drugItemsMapper.updateItemsState(itemsId);
    }

    @Override
    public List<DrugItems> exportExcle() {
        DrugItemsExample drugItemsExample = new DrugItemsExample();
        return drugItemsDAO.selectByExample(drugItemsExample);
    }
}
