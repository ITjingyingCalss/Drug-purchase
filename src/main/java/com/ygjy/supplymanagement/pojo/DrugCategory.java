package com.ygjy.supplymanagement.pojo;

/**
 * @author: 赵林
 * @Date: 2020/6/9 14:17
 * @Description:
 */
public class DrugCategory {
    private Integer id;
    /**
     * 药品类别
     */
    private String drugCategoryName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
                "id=" + id +
                ", drugCategoryName='" + drugCategoryName + '\'' +
                '}';
    }
}
