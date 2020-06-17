package com.ygjy.purchasingmanagement1.dao;

import com.ygjy.purchasingmanagement1.pojo.DrugItems;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DrugItemsDao {

    //查询所有
    List<DrugItems> selectItems();
    //模糊查询
    List<DrugItems> selectItemsLike(
            @Param("drugItemsNumber")String drugItemsNumber,
            @Param("commonName") String commonName,
            @Param("dosageFormId")Integer dosageFormId,
            @Param("specification") String specification,
            @Param("unit")String unit,
            @Param("conversionFraction")String conversionFraction,
            @Param("drugCategoryId")Integer drugCategoryId,
            @Param("state")String state);
    //id查询
    DrugItems selectByItemsId(Integer itemsId);
    //修改
    int updataDrugItems(DrugItems drugItems);
    //删除
    int deleteDrugItems(Integer itemsId);
    //添加
    int insertDrugItems(DrugItems drugItems);

}
