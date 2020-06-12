package com.ygjy.supplymanagement.pojo;

/**
 * @author: 赵林
 * @Date: 2020/6/9 14:17
 * @Description:
 */
public class DrugCategory {
    private Integer drugCateGoryId;
    /**
     * 药品类别
     */
    private String drugCategoryName;

    public Integer getDrugCateGoryId() {
        return drugCateGoryId;
    }

    public void setDrugCateGoryId(Integer drugCateGoryId) {
        this.drugCateGoryId = drugCateGoryId;
    }

    public String getDrugCategoryName() {
        return drugCategoryName;
    }

    public void setDrugCategoryName(String drugCategoryName) {
        this.drugCategoryName = drugCategoryName;
    }

    @Override
    public String toString() {
        return "DrugCategory{" +
                "drugCateGoryId=" + drugCateGoryId +
                ", drugCategoryName='" + drugCategoryName + '\'' +
                '}';
    }
}
