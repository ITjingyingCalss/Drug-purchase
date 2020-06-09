package com.ygjy.pojo;

import java.util.ArrayList;
import java.util.List;

public class DrugItemsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public DrugItemsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andItemsIdIsNull() {
            addCriterion("items_id is null");
            return (Criteria) this;
        }

        public Criteria andItemsIdIsNotNull() {
            addCriterion("items_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemsIdEqualTo(Integer value) {
            addCriterion("items_id =", value, "itemsId");
            return (Criteria) this;
        }

        public Criteria andItemsIdNotEqualTo(Integer value) {
            addCriterion("items_id <>", value, "itemsId");
            return (Criteria) this;
        }

        public Criteria andItemsIdGreaterThan(Integer value) {
            addCriterion("items_id >", value, "itemsId");
            return (Criteria) this;
        }

        public Criteria andItemsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("items_id >=", value, "itemsId");
            return (Criteria) this;
        }

        public Criteria andItemsIdLessThan(Integer value) {
            addCriterion("items_id <", value, "itemsId");
            return (Criteria) this;
        }

        public Criteria andItemsIdLessThanOrEqualTo(Integer value) {
            addCriterion("items_id <=", value, "itemsId");
            return (Criteria) this;
        }

        public Criteria andItemsIdIn(List<Integer> values) {
            addCriterion("items_id in", values, "itemsId");
            return (Criteria) this;
        }

        public Criteria andItemsIdNotIn(List<Integer> values) {
            addCriterion("items_id not in", values, "itemsId");
            return (Criteria) this;
        }

        public Criteria andItemsIdBetween(Integer value1, Integer value2) {
            addCriterion("items_id between", value1, value2, "itemsId");
            return (Criteria) this;
        }

        public Criteria andItemsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("items_id not between", value1, value2, "itemsId");
            return (Criteria) this;
        }

        public Criteria andDrugItemsNumberIsNull() {
            addCriterion("drug_items_number is null");
            return (Criteria) this;
        }

        public Criteria andDrugItemsNumberIsNotNull() {
            addCriterion("drug_items_number is not null");
            return (Criteria) this;
        }

        public Criteria andDrugItemsNumberEqualTo(String value) {
            addCriterion("drug_items_number =", value, "drugItemsNumber");
            return (Criteria) this;
        }

        public Criteria andDrugItemsNumberNotEqualTo(String value) {
            addCriterion("drug_items_number <>", value, "drugItemsNumber");
            return (Criteria) this;
        }

        public Criteria andDrugItemsNumberGreaterThan(String value) {
            addCriterion("drug_items_number >", value, "drugItemsNumber");
            return (Criteria) this;
        }

        public Criteria andDrugItemsNumberGreaterThanOrEqualTo(String value) {
            addCriterion("drug_items_number >=", value, "drugItemsNumber");
            return (Criteria) this;
        }

        public Criteria andDrugItemsNumberLessThan(String value) {
            addCriterion("drug_items_number <", value, "drugItemsNumber");
            return (Criteria) this;
        }

        public Criteria andDrugItemsNumberLessThanOrEqualTo(String value) {
            addCriterion("drug_items_number <=", value, "drugItemsNumber");
            return (Criteria) this;
        }

        public Criteria andDrugItemsNumberLike(String value) {
            addCriterion("drug_items_number like", value, "drugItemsNumber");
            return (Criteria) this;
        }

        public Criteria andDrugItemsNumberNotLike(String value) {
            addCriterion("drug_items_number not like", value, "drugItemsNumber");
            return (Criteria) this;
        }

        public Criteria andDrugItemsNumberIn(List<String> values) {
            addCriterion("drug_items_number in", values, "drugItemsNumber");
            return (Criteria) this;
        }

        public Criteria andDrugItemsNumberNotIn(List<String> values) {
            addCriterion("drug_items_number not in", values, "drugItemsNumber");
            return (Criteria) this;
        }

        public Criteria andDrugItemsNumberBetween(String value1, String value2) {
            addCriterion("drug_items_number between", value1, value2, "drugItemsNumber");
            return (Criteria) this;
        }

        public Criteria andDrugItemsNumberNotBetween(String value1, String value2) {
            addCriterion("drug_items_number not between", value1, value2, "drugItemsNumber");
            return (Criteria) this;
        }

        public Criteria andCommonNameIsNull() {
            addCriterion("common_name is null");
            return (Criteria) this;
        }

        public Criteria andCommonNameIsNotNull() {
            addCriterion("common_name is not null");
            return (Criteria) this;
        }

        public Criteria andCommonNameEqualTo(String value) {
            addCriterion("common_name =", value, "commonName");
            return (Criteria) this;
        }

        public Criteria andCommonNameNotEqualTo(String value) {
            addCriterion("common_name <>", value, "commonName");
            return (Criteria) this;
        }

        public Criteria andCommonNameGreaterThan(String value) {
            addCriterion("common_name >", value, "commonName");
            return (Criteria) this;
        }

        public Criteria andCommonNameGreaterThanOrEqualTo(String value) {
            addCriterion("common_name >=", value, "commonName");
            return (Criteria) this;
        }

        public Criteria andCommonNameLessThan(String value) {
            addCriterion("common_name <", value, "commonName");
            return (Criteria) this;
        }

        public Criteria andCommonNameLessThanOrEqualTo(String value) {
            addCriterion("common_name <=", value, "commonName");
            return (Criteria) this;
        }

        public Criteria andCommonNameLike(String value) {
            addCriterion("common_name like", value, "commonName");
            return (Criteria) this;
        }

        public Criteria andCommonNameNotLike(String value) {
            addCriterion("common_name not like", value, "commonName");
            return (Criteria) this;
        }

        public Criteria andCommonNameIn(List<String> values) {
            addCriterion("common_name in", values, "commonName");
            return (Criteria) this;
        }

        public Criteria andCommonNameNotIn(List<String> values) {
            addCriterion("common_name not in", values, "commonName");
            return (Criteria) this;
        }

        public Criteria andCommonNameBetween(String value1, String value2) {
            addCriterion("common_name between", value1, value2, "commonName");
            return (Criteria) this;
        }

        public Criteria andCommonNameNotBetween(String value1, String value2) {
            addCriterion("common_name not between", value1, value2, "commonName");
            return (Criteria) this;
        }

        public Criteria andDosageFormIdIsNull() {
            addCriterion("dosage_form_id is null");
            return (Criteria) this;
        }

        public Criteria andDosageFormIdIsNotNull() {
            addCriterion("dosage_form_id is not null");
            return (Criteria) this;
        }

        public Criteria andDosageFormIdEqualTo(Integer value) {
            addCriterion("dosage_form_id =", value, "dosageFormId");
            return (Criteria) this;
        }

        public Criteria andDosageFormIdNotEqualTo(Integer value) {
            addCriterion("dosage_form_id <>", value, "dosageFormId");
            return (Criteria) this;
        }

        public Criteria andDosageFormIdGreaterThan(Integer value) {
            addCriterion("dosage_form_id >", value, "dosageFormId");
            return (Criteria) this;
        }

        public Criteria andDosageFormIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dosage_form_id >=", value, "dosageFormId");
            return (Criteria) this;
        }

        public Criteria andDosageFormIdLessThan(Integer value) {
            addCriterion("dosage_form_id <", value, "dosageFormId");
            return (Criteria) this;
        }

        public Criteria andDosageFormIdLessThanOrEqualTo(Integer value) {
            addCriterion("dosage_form_id <=", value, "dosageFormId");
            return (Criteria) this;
        }

        public Criteria andDosageFormIdIn(List<Integer> values) {
            addCriterion("dosage_form_id in", values, "dosageFormId");
            return (Criteria) this;
        }

        public Criteria andDosageFormIdNotIn(List<Integer> values) {
            addCriterion("dosage_form_id not in", values, "dosageFormId");
            return (Criteria) this;
        }

        public Criteria andDosageFormIdBetween(Integer value1, Integer value2) {
            addCriterion("dosage_form_id between", value1, value2, "dosageFormId");
            return (Criteria) this;
        }

        public Criteria andDosageFormIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dosage_form_id not between", value1, value2, "dosageFormId");
            return (Criteria) this;
        }

        public Criteria andSpecificationIsNull() {
            addCriterion("specification is null");
            return (Criteria) this;
        }

        public Criteria andSpecificationIsNotNull() {
            addCriterion("specification is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificationEqualTo(String value) {
            addCriterion("specification =", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotEqualTo(String value) {
            addCriterion("specification <>", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationGreaterThan(String value) {
            addCriterion("specification >", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationGreaterThanOrEqualTo(String value) {
            addCriterion("specification >=", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLessThan(String value) {
            addCriterion("specification <", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLessThanOrEqualTo(String value) {
            addCriterion("specification <=", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLike(String value) {
            addCriterion("specification like", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotLike(String value) {
            addCriterion("specification not like", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationIn(List<String> values) {
            addCriterion("specification in", values, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotIn(List<String> values) {
            addCriterion("specification not in", values, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationBetween(String value1, String value2) {
            addCriterion("specification between", value1, value2, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotBetween(String value1, String value2) {
            addCriterion("specification not between", value1, value2, "specification");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andConversionFractionIsNull() {
            addCriterion("conversion_fraction is null");
            return (Criteria) this;
        }

        public Criteria andConversionFractionIsNotNull() {
            addCriterion("conversion_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andConversionFractionEqualTo(String value) {
            addCriterion("conversion_fraction =", value, "conversionFraction");
            return (Criteria) this;
        }

        public Criteria andConversionFractionNotEqualTo(String value) {
            addCriterion("conversion_fraction <>", value, "conversionFraction");
            return (Criteria) this;
        }

        public Criteria andConversionFractionGreaterThan(String value) {
            addCriterion("conversion_fraction >", value, "conversionFraction");
            return (Criteria) this;
        }

        public Criteria andConversionFractionGreaterThanOrEqualTo(String value) {
            addCriterion("conversion_fraction >=", value, "conversionFraction");
            return (Criteria) this;
        }

        public Criteria andConversionFractionLessThan(String value) {
            addCriterion("conversion_fraction <", value, "conversionFraction");
            return (Criteria) this;
        }

        public Criteria andConversionFractionLessThanOrEqualTo(String value) {
            addCriterion("conversion_fraction <=", value, "conversionFraction");
            return (Criteria) this;
        }

        public Criteria andConversionFractionLike(String value) {
            addCriterion("conversion_fraction like", value, "conversionFraction");
            return (Criteria) this;
        }

        public Criteria andConversionFractionNotLike(String value) {
            addCriterion("conversion_fraction not like", value, "conversionFraction");
            return (Criteria) this;
        }

        public Criteria andConversionFractionIn(List<String> values) {
            addCriterion("conversion_fraction in", values, "conversionFraction");
            return (Criteria) this;
        }

        public Criteria andConversionFractionNotIn(List<String> values) {
            addCriterion("conversion_fraction not in", values, "conversionFraction");
            return (Criteria) this;
        }

        public Criteria andConversionFractionBetween(String value1, String value2) {
            addCriterion("conversion_fraction between", value1, value2, "conversionFraction");
            return (Criteria) this;
        }

        public Criteria andConversionFractionNotBetween(String value1, String value2) {
            addCriterion("conversion_fraction not between", value1, value2, "conversionFraction");
            return (Criteria) this;
        }

        public Criteria andDrugCategoryIdIsNull() {
            addCriterion("drug_category_id is null");
            return (Criteria) this;
        }

        public Criteria andDrugCategoryIdIsNotNull() {
            addCriterion("drug_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andDrugCategoryIdEqualTo(Integer value) {
            addCriterion("drug_category_id =", value, "drugCategoryId");
            return (Criteria) this;
        }

        public Criteria andDrugCategoryIdNotEqualTo(Integer value) {
            addCriterion("drug_category_id <>", value, "drugCategoryId");
            return (Criteria) this;
        }

        public Criteria andDrugCategoryIdGreaterThan(Integer value) {
            addCriterion("drug_category_id >", value, "drugCategoryId");
            return (Criteria) this;
        }

        public Criteria andDrugCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("drug_category_id >=", value, "drugCategoryId");
            return (Criteria) this;
        }

        public Criteria andDrugCategoryIdLessThan(Integer value) {
            addCriterion("drug_category_id <", value, "drugCategoryId");
            return (Criteria) this;
        }

        public Criteria andDrugCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("drug_category_id <=", value, "drugCategoryId");
            return (Criteria) this;
        }

        public Criteria andDrugCategoryIdIn(List<Integer> values) {
            addCriterion("drug_category_id in", values, "drugCategoryId");
            return (Criteria) this;
        }

        public Criteria andDrugCategoryIdNotIn(List<Integer> values) {
            addCriterion("drug_category_id not in", values, "drugCategoryId");
            return (Criteria) this;
        }

        public Criteria andDrugCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("drug_category_id between", value1, value2, "drugCategoryId");
            return (Criteria) this;
        }

        public Criteria andDrugCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("drug_category_id not between", value1, value2, "drugCategoryId");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("`state` is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("`state` is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("`state` =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("`state` <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("`state` >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("`state` >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("`state` <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("`state` <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("`state` like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("`state` not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("`state` in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("`state` not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("`state` between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("`state` not between", value1, value2, "state");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}