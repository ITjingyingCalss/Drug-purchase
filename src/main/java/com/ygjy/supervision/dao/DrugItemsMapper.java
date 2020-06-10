package com.ygjy.supervision.dao;

import com.ygjy.pojo.DrugItems;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DrugItemsMapper {
    List<DrugItems> findAllDrugItems();

    int findMaxItemsId();
}
