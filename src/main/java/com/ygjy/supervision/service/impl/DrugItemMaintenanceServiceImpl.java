package com.ygjy.supervision.service.impl;

import com.ygjy.dao.DrugCategoryDAO;
import com.ygjy.pojo.DrugCategory;
import com.ygjy.pojo.DrugCategoryExample;
import com.ygjy.pojo.DurgsFrom;
import com.ygjy.dao.DurgsFromDAO;
import com.ygjy.pojo.DurgsFromExample;
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

    @Override
    public List<DurgsFrom> findSelectOption() {
        DurgsFromExample durgsFromExample=new DurgsFromExample();
        return durgsFromDAO.selectByExample(durgsFromExample);
                //durgsFromMapper.selectAll();
        /*for (DurgsFrom durgsFrom :
                list) {
            System.err.println(durgsFrom);
        }*/
    }

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
}
