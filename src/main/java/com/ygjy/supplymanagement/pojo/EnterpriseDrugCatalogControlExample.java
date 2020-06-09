package com.ygjy.supplymanagement.pojo;

import java.util.ArrayList;
import java.util.List;

public class EnterpriseDrugCatalogControlExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public EnterpriseDrugCatalogControlExample() {
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

        public Criteria andEnterpriseIdIsNull() {
            addCriterion("enterprise_id is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdIsNotNull() {
            addCriterion("enterprise_id is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdEqualTo(Integer value) {
            addCriterion("enterprise_id =", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdNotEqualTo(Integer value) {
            addCriterion("enterprise_id <>", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdGreaterThan(Integer value) {
            addCriterion("enterprise_id >", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("enterprise_id >=", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdLessThan(Integer value) {
            addCriterion("enterprise_id <", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdLessThanOrEqualTo(Integer value) {
            addCriterion("enterprise_id <=", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdIn(List<Integer> values) {
            addCriterion("enterprise_id in", values, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdNotIn(List<Integer> values) {
            addCriterion("enterprise_id not in", values, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_id between", value1, value2, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_id not between", value1, value2, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andDrugInformationIdIsNull() {
            addCriterion("drug_information_id is null");
            return (Criteria) this;
        }

        public Criteria andDrugInformationIdIsNotNull() {
            addCriterion("drug_information_id is not null");
            return (Criteria) this;
        }

        public Criteria andDrugInformationIdEqualTo(Integer value) {
            addCriterion("drug_information_id =", value, "drugInformationId");
            return (Criteria) this;
        }

        public Criteria andDrugInformationIdNotEqualTo(Integer value) {
            addCriterion("drug_information_id <>", value, "drugInformationId");
            return (Criteria) this;
        }

        public Criteria andDrugInformationIdGreaterThan(Integer value) {
            addCriterion("drug_information_id >", value, "drugInformationId");
            return (Criteria) this;
        }

        public Criteria andDrugInformationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("drug_information_id >=", value, "drugInformationId");
            return (Criteria) this;
        }

        public Criteria andDrugInformationIdLessThan(Integer value) {
            addCriterion("drug_information_id <", value, "drugInformationId");
            return (Criteria) this;
        }

        public Criteria andDrugInformationIdLessThanOrEqualTo(Integer value) {
            addCriterion("drug_information_id <=", value, "drugInformationId");
            return (Criteria) this;
        }

        public Criteria andDrugInformationIdIn(List<Integer> values) {
            addCriterion("drug_information_id in", values, "drugInformationId");
            return (Criteria) this;
        }

        public Criteria andDrugInformationIdNotIn(List<Integer> values) {
            addCriterion("drug_information_id not in", values, "drugInformationId");
            return (Criteria) this;
        }

        public Criteria andDrugInformationIdBetween(Integer value1, Integer value2) {
            addCriterion("drug_information_id between", value1, value2, "drugInformationId");
            return (Criteria) this;
        }

        public Criteria andDrugInformationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("drug_information_id not between", value1, value2, "drugInformationId");
            return (Criteria) this;
        }

        public Criteria andControlsTheStateIsNull() {
            addCriterion("controls_the_state is null");
            return (Criteria) this;
        }

        public Criteria andControlsTheStateIsNotNull() {
            addCriterion("controls_the_state is not null");
            return (Criteria) this;
        }

        public Criteria andControlsTheStateEqualTo(Integer value) {
            addCriterion("controls_the_state =", value, "controlsTheState");
            return (Criteria) this;
        }

        public Criteria andControlsTheStateNotEqualTo(Integer value) {
            addCriterion("controls_the_state <>", value, "controlsTheState");
            return (Criteria) this;
        }

        public Criteria andControlsTheStateGreaterThan(Integer value) {
            addCriterion("controls_the_state >", value, "controlsTheState");
            return (Criteria) this;
        }

        public Criteria andControlsTheStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("controls_the_state >=", value, "controlsTheState");
            return (Criteria) this;
        }

        public Criteria andControlsTheStateLessThan(Integer value) {
            addCriterion("controls_the_state <", value, "controlsTheState");
            return (Criteria) this;
        }

        public Criteria andControlsTheStateLessThanOrEqualTo(Integer value) {
            addCriterion("controls_the_state <=", value, "controlsTheState");
            return (Criteria) this;
        }

        public Criteria andControlsTheStateIn(List<Integer> values) {
            addCriterion("controls_the_state in", values, "controlsTheState");
            return (Criteria) this;
        }

        public Criteria andControlsTheStateNotIn(List<Integer> values) {
            addCriterion("controls_the_state not in", values, "controlsTheState");
            return (Criteria) this;
        }

        public Criteria andControlsTheStateBetween(Integer value1, Integer value2) {
            addCriterion("controls_the_state between", value1, value2, "controlsTheState");
            return (Criteria) this;
        }

        public Criteria andControlsTheStateNotBetween(Integer value1, Integer value2) {
            addCriterion("controls_the_state not between", value1, value2, "controlsTheState");
            return (Criteria) this;
        }

        public Criteria andOpinionsOfSupervisoryIsNull() {
            addCriterion("opinions_of_supervisory is null");
            return (Criteria) this;
        }

        public Criteria andOpinionsOfSupervisoryIsNotNull() {
            addCriterion("opinions_of_supervisory is not null");
            return (Criteria) this;
        }

        public Criteria andOpinionsOfSupervisoryEqualTo(String value) {
            addCriterion("opinions_of_supervisory =", value, "opinionsOfSupervisory");
            return (Criteria) this;
        }

        public Criteria andOpinionsOfSupervisoryNotEqualTo(String value) {
            addCriterion("opinions_of_supervisory <>", value, "opinionsOfSupervisory");
            return (Criteria) this;
        }

        public Criteria andOpinionsOfSupervisoryGreaterThan(String value) {
            addCriterion("opinions_of_supervisory >", value, "opinionsOfSupervisory");
            return (Criteria) this;
        }

        public Criteria andOpinionsOfSupervisoryGreaterThanOrEqualTo(String value) {
            addCriterion("opinions_of_supervisory >=", value, "opinionsOfSupervisory");
            return (Criteria) this;
        }

        public Criteria andOpinionsOfSupervisoryLessThan(String value) {
            addCriterion("opinions_of_supervisory <", value, "opinionsOfSupervisory");
            return (Criteria) this;
        }

        public Criteria andOpinionsOfSupervisoryLessThanOrEqualTo(String value) {
            addCriterion("opinions_of_supervisory <=", value, "opinionsOfSupervisory");
            return (Criteria) this;
        }

        public Criteria andOpinionsOfSupervisoryLike(String value) {
            addCriterion("opinions_of_supervisory like", value, "opinionsOfSupervisory");
            return (Criteria) this;
        }

        public Criteria andOpinionsOfSupervisoryNotLike(String value) {
            addCriterion("opinions_of_supervisory not like", value, "opinionsOfSupervisory");
            return (Criteria) this;
        }

        public Criteria andOpinionsOfSupervisoryIn(List<String> values) {
            addCriterion("opinions_of_supervisory in", values, "opinionsOfSupervisory");
            return (Criteria) this;
        }

        public Criteria andOpinionsOfSupervisoryNotIn(List<String> values) {
            addCriterion("opinions_of_supervisory not in", values, "opinionsOfSupervisory");
            return (Criteria) this;
        }

        public Criteria andOpinionsOfSupervisoryBetween(String value1, String value2) {
            addCriterion("opinions_of_supervisory between", value1, value2, "opinionsOfSupervisory");
            return (Criteria) this;
        }

        public Criteria andOpinionsOfSupervisoryNotBetween(String value1, String value2) {
            addCriterion("opinions_of_supervisory not between", value1, value2, "opinionsOfSupervisory");
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