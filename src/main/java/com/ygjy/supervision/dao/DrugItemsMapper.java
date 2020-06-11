package com.ygjy.supervision.dao;

import com.ygjy.pojo.DrugItems;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DrugItemsMapper {
    List<DrugItems> findAllDrugItems(DrugItems drugItems);

    int findMaxItemsId();

    Integer updateItemsState(Integer itemsId);

    int findDrugItemsCount();
    /*
    * 添加药品品目*/
    int drugItemsAdd(DrugItems drugItems);
}
