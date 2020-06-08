package com.ygjy.pojo;

import java.util.ArrayList;
import java.util.List;

public class DurgsFromExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public DurgsFromExample() {
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

        public Criteria andDurgFromIdIsNull() {
            addCriterion("durg_from_id is null");
            return (Criteria) this;
        }

        public Criteria andDurgFromIdIsNotNull() {
            addCriterion("durg_from_id is not null");
            return (Criteria) this;
        }

        public Criteria andDurgFromIdEqualTo(Integer value) {
            addCriterion("durg_from_id =", value, "durgFromId");
            return (Criteria) this;
        }

        public Criteria andDurgFromIdNotEqualTo(Integer value) {
            addCriterion("durg_from_id <>", value, "durgFromId");
            return (Criteria) this;
        }

        public Criteria andDurgFromIdGreaterThan(Integer value) {
            addCriterion("durg_from_id >", value, "durgFromId");
            return (Criteria) this;
        }

        public Criteria andDurgFromIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("durg_from_id >=", value, "durgFromId");
            return (Criteria) this;
        }

        public Criteria andDurgFromIdLessThan(Integer value) {
            addCriterion("durg_from_id <", value, "durgFromId");
            return (Criteria) this;
        }

        public Criteria andDurgFromIdLessThanOrEqualTo(Integer value) {
            addCriterion("durg_from_id <=", value, "durgFromId");
            return (Criteria) this;
        }

        public Criteria andDurgFromIdIn(List<Integer> values) {
            addCriterion("durg_from_id in", values, "durgFromId");
            return (Criteria) this;
        }

        public Criteria andDurgFromIdNotIn(List<Integer> values) {
            addCriterion("durg_from_id not in", values, "durgFromId");
            return (Criteria) this;
        }

        public Criteria andDurgFromIdBetween(Integer value1, Integer value2) {
            addCriterion("durg_from_id between", value1, value2, "durgFromId");
            return (Criteria) this;
        }

        public Criteria andDurgFromIdNotBetween(Integer value1, Integer value2) {
            addCriterion("durg_from_id not between", value1, value2, "durgFromId");
            return (Criteria) this;
        }

        public Criteria andDrugFromIsNull() {
            addCriterion("drug_from is null");
            return (Criteria) this;
        }

        public Criteria andDrugFromIsNotNull() {
            addCriterion("drug_from is not null");
            return (Criteria) this;
        }

        public Criteria andDrugFromEqualTo(String value) {
            addCriterion("drug_from =", value, "drugFrom");
            return (Criteria) this;
        }

        public Criteria andDrugFromNotEqualTo(String value) {
            addCriterion("drug_from <>", value, "drugFrom");
            return (Criteria) this;
        }

        public Criteria andDrugFromGreaterThan(String value) {
            addCriterion("drug_from >", value, "drugFrom");
            return (Criteria) this;
        }

        public Criteria andDrugFromGreaterThanOrEqualTo(String value) {
            addCriterion("drug_from >=", value, "drugFrom");
            return (Criteria) this;
        }

        public Criteria andDrugFromLessThan(String value) {
            addCriterion("drug_from <", value, "drugFrom");
            return (Criteria) this;
        }

        public Criteria andDrugFromLessThanOrEqualTo(String value) {
            addCriterion("drug_from <=", value, "drugFrom");
            return (Criteria) this;
        }

        public Criteria andDrugFromLike(String value) {
            addCriterion("drug_from like", value, "drugFrom");
            return (Criteria) this;
        }

        public Criteria andDrugFromNotLike(String value) {
            addCriterion("drug_from not like", value, "drugFrom");
            return (Criteria) this;
        }

        public Criteria andDrugFromIn(List<String> values) {
            addCriterion("drug_from in", values, "drugFrom");
            return (Criteria) this;
        }

        public Criteria andDrugFromNotIn(List<String> values) {
            addCriterion("drug_from not in", values, "drugFrom");
            return (Criteria) this;
        }

        public Criteria andDrugFromBetween(String value1, String value2) {
            addCriterion("drug_from between", value1, value2, "drugFrom");
            return (Criteria) this;
        }

        public Criteria andDrugFromNotBetween(String value1, String value2) {
            addCriterion("drug_from not between", value1, value2, "drugFrom");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
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