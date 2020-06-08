package com.ygjy.pojo;

import java.util.ArrayList;
import java.util.List;

public class JurisdictionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public JurisdictionExample() {
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

        public Criteria andJurIdIsNull() {
            addCriterion("jur_id is null");
            return (Criteria) this;
        }

        public Criteria andJurIdIsNotNull() {
            addCriterion("jur_id is not null");
            return (Criteria) this;
        }

        public Criteria andJurIdEqualTo(Integer value) {
            addCriterion("jur_id =", value, "jurId");
            return (Criteria) this;
        }

        public Criteria andJurIdNotEqualTo(Integer value) {
            addCriterion("jur_id <>", value, "jurId");
            return (Criteria) this;
        }

        public Criteria andJurIdGreaterThan(Integer value) {
            addCriterion("jur_id >", value, "jurId");
            return (Criteria) this;
        }

        public Criteria andJurIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("jur_id >=", value, "jurId");
            return (Criteria) this;
        }

        public Criteria andJurIdLessThan(Integer value) {
            addCriterion("jur_id <", value, "jurId");
            return (Criteria) this;
        }

        public Criteria andJurIdLessThanOrEqualTo(Integer value) {
            addCriterion("jur_id <=", value, "jurId");
            return (Criteria) this;
        }

        public Criteria andJurIdIn(List<Integer> values) {
            addCriterion("jur_id in", values, "jurId");
            return (Criteria) this;
        }

        public Criteria andJurIdNotIn(List<Integer> values) {
            addCriterion("jur_id not in", values, "jurId");
            return (Criteria) this;
        }

        public Criteria andJurIdBetween(Integer value1, Integer value2) {
            addCriterion("jur_id between", value1, value2, "jurId");
            return (Criteria) this;
        }

        public Criteria andJurIdNotBetween(Integer value1, Integer value2) {
            addCriterion("jur_id not between", value1, value2, "jurId");
            return (Criteria) this;
        }

        public Criteria andJurisdIsNull() {
            addCriterion("jurisd is null");
            return (Criteria) this;
        }

        public Criteria andJurisdIsNotNull() {
            addCriterion("jurisd is not null");
            return (Criteria) this;
        }

        public Criteria andJurisdEqualTo(String value) {
            addCriterion("jurisd =", value, "jurisd");
            return (Criteria) this;
        }

        public Criteria andJurisdNotEqualTo(String value) {
            addCriterion("jurisd <>", value, "jurisd");
            return (Criteria) this;
        }

        public Criteria andJurisdGreaterThan(String value) {
            addCriterion("jurisd >", value, "jurisd");
            return (Criteria) this;
        }

        public Criteria andJurisdGreaterThanOrEqualTo(String value) {
            addCriterion("jurisd >=", value, "jurisd");
            return (Criteria) this;
        }

        public Criteria andJurisdLessThan(String value) {
            addCriterion("jurisd <", value, "jurisd");
            return (Criteria) this;
        }

        public Criteria andJurisdLessThanOrEqualTo(String value) {
            addCriterion("jurisd <=", value, "jurisd");
            return (Criteria) this;
        }

        public Criteria andJurisdLike(String value) {
            addCriterion("jurisd like", value, "jurisd");
            return (Criteria) this;
        }

        public Criteria andJurisdNotLike(String value) {
            addCriterion("jurisd not like", value, "jurisd");
            return (Criteria) this;
        }

        public Criteria andJurisdIn(List<String> values) {
            addCriterion("jurisd in", values, "jurisd");
            return (Criteria) this;
        }

        public Criteria andJurisdNotIn(List<String> values) {
            addCriterion("jurisd not in", values, "jurisd");
            return (Criteria) this;
        }

        public Criteria andJurisdBetween(String value1, String value2) {
            addCriterion("jurisd between", value1, value2, "jurisd");
            return (Criteria) this;
        }

        public Criteria andJurisdNotBetween(String value1, String value2) {
            addCriterion("jurisd not between", value1, value2, "jurisd");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDelStateIsNull() {
            addCriterion("del_state is null");
            return (Criteria) this;
        }

        public Criteria andDelStateIsNotNull() {
            addCriterion("del_state is not null");
            return (Criteria) this;
        }

        public Criteria andDelStateEqualTo(String value) {
            addCriterion("del_state =", value, "delState");
            return (Criteria) this;
        }

        public Criteria andDelStateNotEqualTo(String value) {
            addCriterion("del_state <>", value, "delState");
            return (Criteria) this;
        }

        public Criteria andDelStateGreaterThan(String value) {
            addCriterion("del_state >", value, "delState");
            return (Criteria) this;
        }

        public Criteria andDelStateGreaterThanOrEqualTo(String value) {
            addCriterion("del_state >=", value, "delState");
            return (Criteria) this;
        }

        public Criteria andDelStateLessThan(String value) {
            addCriterion("del_state <", value, "delState");
            return (Criteria) this;
        }

        public Criteria andDelStateLessThanOrEqualTo(String value) {
            addCriterion("del_state <=", value, "delState");
            return (Criteria) this;
        }

        public Criteria andDelStateLike(String value) {
            addCriterion("del_state like", value, "delState");
            return (Criteria) this;
        }

        public Criteria andDelStateNotLike(String value) {
            addCriterion("del_state not like", value, "delState");
            return (Criteria) this;
        }

        public Criteria andDelStateIn(List<String> values) {
            addCriterion("del_state in", values, "delState");
            return (Criteria) this;
        }

        public Criteria andDelStateNotIn(List<String> values) {
            addCriterion("del_state not in", values, "delState");
            return (Criteria) this;
        }

        public Criteria andDelStateBetween(String value1, String value2) {
            addCriterion("del_state between", value1, value2, "delState");
            return (Criteria) this;
        }

        public Criteria andDelStateNotBetween(String value1, String value2) {
            addCriterion("del_state not between", value1, value2, "delState");
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