package com.ygjy.supervision.service;

import com.github.pagehelper.PageInfo;
import com.ygjy.pojo.DrugItems;
import com.ygjy.pojo.DurgsFrom;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

@Service
public interface DrugItemMaintenanceService {
    Map findDrugFromAndDrugCategory();
    //添加药品品目信息
    int drugItemsAdd(DrugItems drugItems);
    //加载全部药品品目信息
    PageInfo findAllDrugItems(Integer pageNum,DrugItems drugItems);

    DrugItems findItemsById(Integer itemsId);

    Integer updateItemsState(Integer itemsId);

    List<DrugItems> exportExcle(DrugItems drugItems);

    Integer multipartFileToFile(MultipartFile file) throws Exception;

}
