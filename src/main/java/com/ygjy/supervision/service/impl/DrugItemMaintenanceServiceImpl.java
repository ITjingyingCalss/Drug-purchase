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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class DrugItemMaintenanceServiceImpl implements DrugItemMaintenanceService {


    @Autowired private DurgsFromDAO durgsFromDAO;
    @Autowired private DrugCategoryDAO drugCategoryDAO;
    @Autowired private DrugItemsDAO drugItemsDAO;
    @Autowired private DrugItemsMapper drugItemsMapper;

    @Override
    public List<List<Object>> findDrugFromAndDrugCategory() {
        List<List<Object>> list = new ArrayList<List<Object>>();
        DurgsFromExample durgsFromExample=new DurgsFromExample();
        DrugCategoryExample drugCategoryExample = new DrugCategoryExample();
        List<DurgsFrom> list_durgsFrom = durgsFromDAO.selectByExample(durgsFromExample);
        List<DrugCategory> list_drugCategory = drugCategoryDAO.selectByExample(drugCategoryExample);
        list.add(Collections.singletonList(list_durgsFrom));
        list.add(Collections.singletonList(list_drugCategory));
        return list;
    }

    @Override
    public int drugItemsAdd(DrugItems drugItems) {
        System.err.println(drugItems);
        if (drugItems.getItemsId()==null){
            int itemsId = drugItemsMapper.findMaxItemsId()+1;
            String drugItemsNumber = "0000"+itemsId;
            drugItems.setDrugItemsNumber(drugItemsNumber);
            return  drugItemsDAO.insert(drugItems);
        }else {
            return  drugItemsDAO.updateByPrimaryKeySelective(drugItems);
        }

    }

    @Override
    public PageInfo findAllDrugItems(Integer pageNum) {
        PageHelper.startPage(pageNum,5);
        List<DrugItems> list = drugItemsMapper.findAllDrugItems();
        return new PageInfo(list);
    }

    @Override
    public DrugItems findItemsById(Integer itemsId) {
        return drugItemsDAO.selectByPrimaryKey(itemsId);
    }
}
