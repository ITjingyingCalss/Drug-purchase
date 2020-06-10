package com.ygjy.supervision.service;

import com.github.pagehelper.PageInfo;
import com.ygjy.pojo.DrugItems;
import com.ygjy.pojo.DurgsFrom;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DrugItemMaintenanceService {
    List<List<Object>> findDrugFromAndDrugCategory();
    //添加药品品目信息
    int drugItemsAdd(DrugItems drugItems);
    //加载全部药品品目信息
    PageInfo findAllDrugItems(Integer pageNum);

    DrugItems findItemsById(Integer itemsId);
}
