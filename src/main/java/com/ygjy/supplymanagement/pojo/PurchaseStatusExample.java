package com.ygjy.supplymanagement.pojo;

import java.util.ArrayList;
import java.util.List;

public class PurchaseStatusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public PurchaseStatusExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPurchasedStateIsNull() {
            addCriterion("purchased_state is null");
            return (Criteria) this;
        }

        public Criteria andPurchasedStateIsNotNull() {
            addCriterion("purchased_state is not null");
            return (Criteria) this;
        }

        public Criteria andPurchasedStateEqualTo(Integer value) {
            addCriterion("purchased_state =", value, "purchasedState");
            return (Criteria) this;
        }

        public Criteria andPurchasedStateNotEqualTo(Integer value) {
            addCriterion("purchased_state <>", value, "purchasedState");
            return (Criteria) this;
        }

        public Criteria andPurchasedStateGreaterThan(Integer value) {
            addCriterion("purchased_state >", value, "purchasedState");
            return (Criteria) this;
        }

        public Criteria andPurchasedStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("purchased_state >=", value, "purchasedState");
            return (Criteria) this;
        }

        public Criteria andPurchasedStateLessThan(Integer value) {
            addCriterion("purchased_state <", value, "purchasedState");
            return (Criteria) this;
        }

        public Criteria andPurchasedStateLessThanOrEqualTo(Integer value) {
            addCriterion("purchased_state <=", value, "purchasedState");
            return (Criteria) this;
        }

        public Criteria andPurchasedStateIn(List<Integer> values) {
            addCriterion("purchased_state in", values, "purchasedState");
            return (Criteria) this;
        }

        public Criteria andPurchasedStateNotIn(List<Integer> values) {
            addCriterion("purchased_state not in", values, "purchasedState");
            return (Criteria) this;
        }

        public Criteria andPurchasedStateBetween(Integer value1, Integer value2) {
            addCriterion("purchased_state between", value1, value2, "purchasedState");
            return (Criteria) this;
        }

        public Criteria andPurchasedStateNotBetween(Integer value1, Integer value2) {
            addCriterion("purchased_state not between", value1, value2, "purchasedState");
            return (Criteria) this;
        }

        public Criteria andPurchasedExplainIsNull() {
            addCriterion("purchased_explain is null");
            return (Criteria) this;
        }

        public Criteria andPurchasedExplainIsNotNull() {
            addCriterion("purchased_explain is not null");
            return (Criteria) this;
        }

        public Criteria andPurchasedExplainEqualTo(String value) {
            addCriterion("purchased_explain =", value, "purchasedExplain");
            return (Criteria) this;
        }

        public Criteria andPurchasedExplainNotEqualTo(String value) {
            addCriterion("purchased_explain <>", value, "purchasedExplain");
            return (Criteria) this;
        }

        public Criteria andPurchasedExplainGreaterThan(String value) {
            addCriterion("purchased_explain >", value, "purchasedExplain");
            return (Criteria) this;
        }

        public Criteria andPurchasedExplainGreaterThanOrEqualTo(String value) {
            addCriterion("purchased_explain >=", value, "purchasedExplain");
            return (Criteria) this;
        }

        public Criteria andPurchasedExplainLessThan(String value) {
            addCriterion("purchased_explain <", value, "purchasedExplain");
            return (Criteria) this;
        }

        public Criteria andPurchasedExplainLessThanOrEqualTo(String value) {
            addCriterion("purchased_explain <=", value, "purchasedExplain");
            return (Criteria) this;
        }

        public Criteria andPurchasedExplainLike(String value) {
            addCriterion("purchased_explain like", value, "purchasedExplain");
            return (Criteria) this;
        }

        public Criteria andPurchasedExplainNotLike(String value) {
            addCriterion("purchased_explain not like", value, "purchasedExplain");
            return (Criteria) this;
        }

        public Criteria andPurchasedExplainIn(List<String> values) {
            addCriterion("purchased_explain in", values, "purchasedExplain");
            return (Criteria) this;
        }

        public Criteria andPurchasedExplainNotIn(List<String> values) {
            addCriterion("purchased_explain not in", values, "purchasedExplain");
            return (Criteria) this;
        }

        public Criteria andPurchasedExplainBetween(String value1, String value2) {
            addCriterion("purchased_explain between", value1, value2, "purchasedExplain");
            return (Criteria) this;
        }

        public Criteria andPurchasedExplainNotBetween(String value1, String value2) {
            addCriterion("purchased_explain not between", value1, value2, "purchasedExplain");
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