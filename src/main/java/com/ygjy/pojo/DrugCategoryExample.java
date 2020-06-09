package com.ygjy.pojo;

import java.util.ArrayList;
import java.util.List;

public class DrugCategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public DrugCategoryExample() {
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

        public Criteria andDrugCategoryIdIsNull() {
            addCriterion("drug_category_Id is null");
            return (Criteria) this;
        }

        public Criteria andDrugCategoryIdIsNotNull() {
            addCriterion("drug_category_Id is not null");
            return (Criteria) this;
        }

        public Criteria andDrugCategoryIdEqualTo(Integer value) {
            addCriterion("drug_category_Id =", value, "drugCategoryId");
            return (Criteria) this;
        }

        public Criteria andDrugCategoryIdNotEqualTo(Integer value) {
            addCriterion("drug_category_Id <>", value, "drugCategoryId");
            return (Criteria) this;
        }

        public Criteria andDrugCategoryIdGreaterThan(Integer value) {
            addCriterion("drug_category_Id >", value, "drugCategoryId");
            return (Criteria) this;
        }

        public Criteria andDrugCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("drug_category_Id >=", value, "drugCategoryId");
            return (Criteria) this;
        }

        public Criteria andDrugCategoryIdLessThan(Integer value) {
            addCriterion("drug_category_Id <", value, "drugCategoryId");
            return (Criteria) this;
        }

        public Criteria andDrugCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("drug_category_Id <=", value, "drugCategoryId");
            return (Criteria) this;
        }

        public Criteria andDrugCategoryIdIn(List<Integer> values) {
            addCriterion("drug_category_Id in", values, "drugCategoryId");
            return (Criteria) this;
        }

        public Criteria andDrugCategoryIdNotIn(List<Integer> values) {
            addCriterion("drug_category_Id not in", values, "drugCategoryId");
            return (Criteria) this;
        }

        public Criteria andDrugCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("drug_category_Id between", value1, value2, "drugCategoryId");
            return (Criteria) this;
        }

        public Criteria andDrugCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("drug_category_Id not between", value1, value2, "drugCategoryId");
            return (Criteria) this;
        }

        public Criteria andDrugCategoryNameIsNull() {
            addCriterion("drug_category_name is null");
            return (Criteria) this;
        }

        public Criteria andDrugCategoryNameIsNotNull() {
            addCriterion("drug_category_name is not null");
            return (Criteria) this;
        }

        public Criteria andDrugCategoryNameEqualTo(String value) {
            addCriterion("drug_category_name =", value, "drugCategoryName");
            return (Criteria) this;
        }

        public Criteria andDrugCategoryNameNotEqualTo(String value) {
            addCriterion("drug_category_name <>", value, "drugCategoryName");
            return (Criteria) this;
        }

        public Criteria andDrugCategoryNameGreaterThan(String value) {
            addCriterion("drug_category_name >", value, "drugCategoryName");
            return (Criteria) this;
        }

        public Criteria andDrugCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("drug_category_name >=", value, "drugCategoryName");
            return (Criteria) this;
        }

        public Criteria andDrugCategoryNameLessThan(String value) {
            addCriterion("drug_category_name <", value, "drugCategoryName");
            return (Criteria) this;
        }

        public Criteria andDrugCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("drug_category_name <=", value, "drugCategoryName");
            return (Criteria) this;
        }

        public Criteria andDrugCategoryNameLike(String value) {
            addCriterion("drug_category_name like", value, "drugCategoryName");
            return (Criteria) this;
        }

        public Criteria andDrugCategoryNameNotLike(String value) {
            addCriterion("drug_category_name not like", value, "drugCategoryName");
            return (Criteria) this;
        }

        public Criteria andDrugCategoryNameIn(List<String> values) {
            addCriterion("drug_category_name in", values, "drugCategoryName");
            return (Criteria) this;
        }

        public Criteria andDrugCategoryNameNotIn(List<String> values) {
            addCriterion("drug_category_name not in", values, "drugCategoryName");
            return (Criteria) this;
        }

        public Criteria andDrugCategoryNameBetween(String value1, String value2) {
            addCriterion("drug_category_name between", value1, value2, "drugCategoryName");
            return (Criteria) this;
        }

        public Criteria andDrugCategoryNameNotBetween(String value1, String value2) {
            addCriterion("drug_category_name not between", value1, value2, "drugCategoryName");
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