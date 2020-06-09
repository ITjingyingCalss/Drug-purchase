package com.ygjy.supplymanagement.pojo;

import java.util.ArrayList;
import java.util.List;

public class StatementStatusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public StatementStatusExample() {
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

        public Criteria andStatementStateIsNull() {
            addCriterion("statement_state is null");
            return (Criteria) this;
        }

        public Criteria andStatementStateIsNotNull() {
            addCriterion("statement_state is not null");
            return (Criteria) this;
        }

        public Criteria andStatementStateEqualTo(Integer value) {
            addCriterion("statement_state =", value, "statementState");
            return (Criteria) this;
        }

        public Criteria andStatementStateNotEqualTo(Integer value) {
            addCriterion("statement_state <>", value, "statementState");
            return (Criteria) this;
        }

        public Criteria andStatementStateGreaterThan(Integer value) {
            addCriterion("statement_state >", value, "statementState");
            return (Criteria) this;
        }

        public Criteria andStatementStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("statement_state >=", value, "statementState");
            return (Criteria) this;
        }

        public Criteria andStatementStateLessThan(Integer value) {
            addCriterion("statement_state <", value, "statementState");
            return (Criteria) this;
        }

        public Criteria andStatementStateLessThanOrEqualTo(Integer value) {
            addCriterion("statement_state <=", value, "statementState");
            return (Criteria) this;
        }

        public Criteria andStatementStateIn(List<Integer> values) {
            addCriterion("statement_state in", values, "statementState");
            return (Criteria) this;
        }

        public Criteria andStatementStateNotIn(List<Integer> values) {
            addCriterion("statement_state not in", values, "statementState");
            return (Criteria) this;
        }

        public Criteria andStatementStateBetween(Integer value1, Integer value2) {
            addCriterion("statement_state between", value1, value2, "statementState");
            return (Criteria) this;
        }

        public Criteria andStatementStateNotBetween(Integer value1, Integer value2) {
            addCriterion("statement_state not between", value1, value2, "statementState");
            return (Criteria) this;
        }

        public Criteria andStatementExplainIsNull() {
            addCriterion("statement_explain is null");
            return (Criteria) this;
        }

        public Criteria andStatementExplainIsNotNull() {
            addCriterion("statement_explain is not null");
            return (Criteria) this;
        }

        public Criteria andStatementExplainEqualTo(String value) {
            addCriterion("statement_explain =", value, "statementExplain");
            return (Criteria) this;
        }

        public Criteria andStatementExplainNotEqualTo(String value) {
            addCriterion("statement_explain <>", value, "statementExplain");
            return (Criteria) this;
        }

        public Criteria andStatementExplainGreaterThan(String value) {
            addCriterion("statement_explain >", value, "statementExplain");
            return (Criteria) this;
        }

        public Criteria andStatementExplainGreaterThanOrEqualTo(String value) {
            addCriterion("statement_explain >=", value, "statementExplain");
            return (Criteria) this;
        }

        public Criteria andStatementExplainLessThan(String value) {
            addCriterion("statement_explain <", value, "statementExplain");
            return (Criteria) this;
        }

        public Criteria andStatementExplainLessThanOrEqualTo(String value) {
            addCriterion("statement_explain <=", value, "statementExplain");
            return (Criteria) this;
        }

        public Criteria andStatementExplainLike(String value) {
            addCriterion("statement_explain like", value, "statementExplain");
            return (Criteria) this;
        }

        public Criteria andStatementExplainNotLike(String value) {
            addCriterion("statement_explain not like", value, "statementExplain");
            return (Criteria) this;
        }

        public Criteria andStatementExplainIn(List<String> values) {
            addCriterion("statement_explain in", values, "statementExplain");
            return (Criteria) this;
        }

        public Criteria andStatementExplainNotIn(List<String> values) {
            addCriterion("statement_explain not in", values, "statementExplain");
            return (Criteria) this;
        }

        public Criteria andStatementExplainBetween(String value1, String value2) {
            addCriterion("statement_explain between", value1, value2, "statementExplain");
            return (Criteria) this;
        }

        public Criteria andStatementExplainNotBetween(String value1, String value2) {
            addCriterion("statement_explain not between", value1, value2, "statementExplain");
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