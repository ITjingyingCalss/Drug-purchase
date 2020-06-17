package com.ygjy.purchasingmanagement2.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HospitalTransactionReturnExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public HospitalTransactionReturnExample() {
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

        public Criteria andReturnOrderNumberIsNull() {
            addCriterion("return_order_number is null");
            return (Criteria) this;
        }

        public Criteria andReturnOrderNumberIsNotNull() {
            addCriterion("return_order_number is not null");
            return (Criteria) this;
        }

        public Criteria andReturnOrderNumberEqualTo(String value) {
            addCriterion("return_order_number =", value, "returnOrderNumber");
            return (Criteria) this;
        }

        public Criteria andReturnOrderNumberNotEqualTo(String value) {
            addCriterion("return_order_number <>", value, "returnOrderNumber");
            return (Criteria) this;
        }

        public Criteria andReturnOrderNumberGreaterThan(String value) {
            addCriterion("return_order_number >", value, "returnOrderNumber");
            return (Criteria) this;
        }

        public Criteria andReturnOrderNumberGreaterThanOrEqualTo(String value) {
            addCriterion("return_order_number >=", value, "returnOrderNumber");
            return (Criteria) this;
        }

        public Criteria andReturnOrderNumberLessThan(String value) {
            addCriterion("return_order_number <", value, "returnOrderNumber");
            return (Criteria) this;
        }

        public Criteria andReturnOrderNumberLessThanOrEqualTo(String value) {
            addCriterion("return_order_number <=", value, "returnOrderNumber");
            return (Criteria) this;
        }

        public Criteria andReturnOrderNumberLike(String value) {
            addCriterion("return_order_number like", value, "returnOrderNumber");
            return (Criteria) this;
        }

        public Criteria andReturnOrderNumberNotLike(String value) {
            addCriterion("return_order_number not like", value, "returnOrderNumber");
            return (Criteria) this;
        }

        public Criteria andReturnOrderNumberIn(List<String> values) {
            addCriterion("return_order_number in", values, "returnOrderNumber");
            return (Criteria) this;
        }

        public Criteria andReturnOrderNumberNotIn(List<String> values) {
            addCriterion("return_order_number not in", values, "returnOrderNumber");
            return (Criteria) this;
        }

        public Criteria andReturnOrderNumberBetween(String value1, String value2) {
            addCriterion("return_order_number between", value1, value2, "returnOrderNumber");
            return (Criteria) this;
        }

        public Criteria andReturnOrderNumberNotBetween(String value1, String value2) {
            addCriterion("return_order_number not between", value1, value2, "returnOrderNumber");
            return (Criteria) this;
        }

        public Criteria andReturnOrderNameIsNull() {
            addCriterion("return_order_name is null");
            return (Criteria) this;
        }

        public Criteria andReturnOrderNameIsNotNull() {
            addCriterion("return_order_name is not null");
            return (Criteria) this;
        }

        public Criteria andReturnOrderNameEqualTo(String value) {
            addCriterion("return_order_name =", value, "returnOrderName");
            return (Criteria) this;
        }

        public Criteria andReturnOrderNameNotEqualTo(String value) {
            addCriterion("return_order_name <>", value, "returnOrderName");
            return (Criteria) this;
        }

        public Criteria andReturnOrderNameGreaterThan(String value) {
            addCriterion("return_order_name >", value, "returnOrderName");
            return (Criteria) this;
        }

        public Criteria andReturnOrderNameGreaterThanOrEqualTo(String value) {
            addCriterion("return_order_name >=", value, "returnOrderName");
            return (Criteria) this;
        }

        public Criteria andReturnOrderNameLessThan(String value) {
            addCriterion("return_order_name <", value, "returnOrderName");
            return (Criteria) this;
        }

        public Criteria andReturnOrderNameLessThanOrEqualTo(String value) {
            addCriterion("return_order_name <=", value, "returnOrderName");
            return (Criteria) this;
        }

        public Criteria andReturnOrderNameLike(String value) {
            addCriterion("return_order_name like", value, "returnOrderName");
            return (Criteria) this;
        }

        public Criteria andReturnOrderNameNotLike(String value) {
            addCriterion("return_order_name not like", value, "returnOrderName");
            return (Criteria) this;
        }

        public Criteria andReturnOrderNameIn(List<String> values) {
            addCriterion("return_order_name in", values, "returnOrderName");
            return (Criteria) this;
        }

        public Criteria andReturnOrderNameNotIn(List<String> values) {
            addCriterion("return_order_name not in", values, "returnOrderName");
            return (Criteria) this;
        }

        public Criteria andReturnOrderNameBetween(String value1, String value2) {
            addCriterion("return_order_name between", value1, value2, "returnOrderName");
            return (Criteria) this;
        }

        public Criteria andReturnOrderNameNotBetween(String value1, String value2) {
            addCriterion("return_order_name not between", value1, value2, "returnOrderName");
            return (Criteria) this;
        }

        public Criteria andHospitalIdIsNull() {
            addCriterion("hospital_id is null");
            return (Criteria) this;
        }

        public Criteria andHospitalIdIsNotNull() {
            addCriterion("hospital_id is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalIdEqualTo(Integer value) {
            addCriterion("hospital_id =", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdNotEqualTo(Integer value) {
            addCriterion("hospital_id <>", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdGreaterThan(Integer value) {
            addCriterion("hospital_id >", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("hospital_id >=", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdLessThan(Integer value) {
            addCriterion("hospital_id <", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdLessThanOrEqualTo(Integer value) {
            addCriterion("hospital_id <=", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdIn(List<Integer> values) {
            addCriterion("hospital_id in", values, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdNotIn(List<Integer> values) {
            addCriterion("hospital_id not in", values, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdBetween(Integer value1, Integer value2) {
            addCriterion("hospital_id between", value1, value2, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdNotBetween(Integer value1, Integer value2) {
            addCriterion("hospital_id not between", value1, value2, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andContactsIsNull() {
            addCriterion("contacts is null");
            return (Criteria) this;
        }

        public Criteria andContactsIsNotNull() {
            addCriterion("contacts is not null");
            return (Criteria) this;
        }

        public Criteria andContactsEqualTo(String value) {
            addCriterion("contacts =", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotEqualTo(String value) {
            addCriterion("contacts <>", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsGreaterThan(String value) {
            addCriterion("contacts >", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsGreaterThanOrEqualTo(String value) {
            addCriterion("contacts >=", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLessThan(String value) {
            addCriterion("contacts <", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLessThanOrEqualTo(String value) {
            addCriterion("contacts <=", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLike(String value) {
            addCriterion("contacts like", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotLike(String value) {
            addCriterion("contacts not like", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsIn(List<String> values) {
            addCriterion("contacts in", values, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotIn(List<String> values) {
            addCriterion("contacts not in", values, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsBetween(String value1, String value2) {
            addCriterion("contacts between", value1, value2, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotBetween(String value1, String value2) {
            addCriterion("contacts not between", value1, value2, "contacts");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andCreatReceiptsPersonIsNull() {
            addCriterion("creat_receipts_person is null");
            return (Criteria) this;
        }

        public Criteria andCreatReceiptsPersonIsNotNull() {
            addCriterion("creat_receipts_person is not null");
            return (Criteria) this;
        }

        public Criteria andCreatReceiptsPersonEqualTo(String value) {
            addCriterion("creat_receipts_person =", value, "creatReceiptsPerson");
            return (Criteria) this;
        }

        public Criteria andCreatReceiptsPersonNotEqualTo(String value) {
            addCriterion("creat_receipts_person <>", value, "creatReceiptsPerson");
            return (Criteria) this;
        }

        public Criteria andCreatReceiptsPersonGreaterThan(String value) {
            addCriterion("creat_receipts_person >", value, "creatReceiptsPerson");
            return (Criteria) this;
        }

        public Criteria andCreatReceiptsPersonGreaterThanOrEqualTo(String value) {
            addCriterion("creat_receipts_person >=", value, "creatReceiptsPerson");
            return (Criteria) this;
        }

        public Criteria andCreatReceiptsPersonLessThan(String value) {
            addCriterion("creat_receipts_person <", value, "creatReceiptsPerson");
            return (Criteria) this;
        }

        public Criteria andCreatReceiptsPersonLessThanOrEqualTo(String value) {
            addCriterion("creat_receipts_person <=", value, "creatReceiptsPerson");
            return (Criteria) this;
        }

        public Criteria andCreatReceiptsPersonLike(String value) {
            addCriterion("creat_receipts_person like", value, "creatReceiptsPerson");
            return (Criteria) this;
        }

        public Criteria andCreatReceiptsPersonNotLike(String value) {
            addCriterion("creat_receipts_person not like", value, "creatReceiptsPerson");
            return (Criteria) this;
        }

        public Criteria andCreatReceiptsPersonIn(List<String> values) {
            addCriterion("creat_receipts_person in", values, "creatReceiptsPerson");
            return (Criteria) this;
        }

        public Criteria andCreatReceiptsPersonNotIn(List<String> values) {
            addCriterion("creat_receipts_person not in", values, "creatReceiptsPerson");
            return (Criteria) this;
        }

        public Criteria andCreatReceiptsPersonBetween(String value1, String value2) {
            addCriterion("creat_receipts_person between", value1, value2, "creatReceiptsPerson");
            return (Criteria) this;
        }

        public Criteria andCreatReceiptsPersonNotBetween(String value1, String value2) {
            addCriterion("creat_receipts_person not between", value1, value2, "creatReceiptsPerson");
            return (Criteria) this;
        }

        public Criteria andCreateReceiptsTimeIsNull() {
            addCriterion("create_receipts_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateReceiptsTimeIsNotNull() {
            addCriterion("create_receipts_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateReceiptsTimeEqualTo(Date value) {
            addCriterion("create_receipts_time =", value, "createReceiptsTime");
            return (Criteria) this;
        }

        public Criteria andCreateReceiptsTimeNotEqualTo(Date value) {
            addCriterion("create_receipts_time <>", value, "createReceiptsTime");
            return (Criteria) this;
        }

        public Criteria andCreateReceiptsTimeGreaterThan(Date value) {
            addCriterion("create_receipts_time >", value, "createReceiptsTime");
            return (Criteria) this;
        }

        public Criteria andCreateReceiptsTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_receipts_time >=", value, "createReceiptsTime");
            return (Criteria) this;
        }

        public Criteria andCreateReceiptsTimeLessThan(Date value) {
            addCriterion("create_receipts_time <", value, "createReceiptsTime");
            return (Criteria) this;
        }

        public Criteria andCreateReceiptsTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_receipts_time <=", value, "createReceiptsTime");
            return (Criteria) this;
        }

        public Criteria andCreateReceiptsTimeIn(List<Date> values) {
            addCriterion("create_receipts_time in", values, "createReceiptsTime");
            return (Criteria) this;
        }

        public Criteria andCreateReceiptsTimeNotIn(List<Date> values) {
            addCriterion("create_receipts_time not in", values, "createReceiptsTime");
            return (Criteria) this;
        }

        public Criteria andCreateReceiptsTimeBetween(Date value1, Date value2) {
            addCriterion("create_receipts_time between", value1, value2, "createReceiptsTime");
            return (Criteria) this;
        }

        public Criteria andCreateReceiptsTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_receipts_time not between", value1, value2, "createReceiptsTime");
            return (Criteria) this;
        }

        public Criteria andSubmissionTimeIsNull() {
            addCriterion("submission_time is null");
            return (Criteria) this;
        }

        public Criteria andSubmissionTimeIsNotNull() {
            addCriterion("submission_time is not null");
            return (Criteria) this;
        }

        public Criteria andSubmissionTimeEqualTo(Date value) {
            addCriterion("submission_time =", value, "submissionTime");
            return (Criteria) this;
        }

        public Criteria andSubmissionTimeNotEqualTo(Date value) {
            addCriterion("submission_time <>", value, "submissionTime");
            return (Criteria) this;
        }

        public Criteria andSubmissionTimeGreaterThan(Date value) {
            addCriterion("submission_time >", value, "submissionTime");
            return (Criteria) this;
        }

        public Criteria andSubmissionTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("submission_time >=", value, "submissionTime");
            return (Criteria) this;
        }

        public Criteria andSubmissionTimeLessThan(Date value) {
            addCriterion("submission_time <", value, "submissionTime");
            return (Criteria) this;
        }

        public Criteria andSubmissionTimeLessThanOrEqualTo(Date value) {
            addCriterion("submission_time <=", value, "submissionTime");
            return (Criteria) this;
        }

        public Criteria andSubmissionTimeIn(List<Date> values) {
            addCriterion("submission_time in", values, "submissionTime");
            return (Criteria) this;
        }

        public Criteria andSubmissionTimeNotIn(List<Date> values) {
            addCriterion("submission_time not in", values, "submissionTime");
            return (Criteria) this;
        }

        public Criteria andSubmissionTimeBetween(Date value1, Date value2) {
            addCriterion("submission_time between", value1, value2, "submissionTime");
            return (Criteria) this;
        }

        public Criteria andSubmissionTimeNotBetween(Date value1, Date value2) {
            addCriterion("submission_time not between", value1, value2, "submissionTime");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andReturnStateIdIsNull() {
            addCriterion("return_state_id is null");
            return (Criteria) this;
        }

        public Criteria andReturnStateIdIsNotNull() {
            addCriterion("return_state_id is not null");
            return (Criteria) this;
        }

        public Criteria andReturnStateIdEqualTo(Integer value) {
            addCriterion("return_state_id =", value, "returnStateId");
            return (Criteria) this;
        }

        public Criteria andReturnStateIdNotEqualTo(Integer value) {
            addCriterion("return_state_id <>", value, "returnStateId");
            return (Criteria) this;
        }

        public Criteria andReturnStateIdGreaterThan(Integer value) {
            addCriterion("return_state_id >", value, "returnStateId");
            return (Criteria) this;
        }

        public Criteria andReturnStateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("return_state_id >=", value, "returnStateId");
            return (Criteria) this;
        }

        public Criteria andReturnStateIdLessThan(Integer value) {
            addCriterion("return_state_id <", value, "returnStateId");
            return (Criteria) this;
        }

        public Criteria andReturnStateIdLessThanOrEqualTo(Integer value) {
            addCriterion("return_state_id <=", value, "returnStateId");
            return (Criteria) this;
        }

        public Criteria andReturnStateIdIn(List<Integer> values) {
            addCriterion("return_state_id in", values, "returnStateId");
            return (Criteria) this;
        }

        public Criteria andReturnStateIdNotIn(List<Integer> values) {
            addCriterion("return_state_id not in", values, "returnStateId");
            return (Criteria) this;
        }

        public Criteria andReturnStateIdBetween(Integer value1, Integer value2) {
            addCriterion("return_state_id between", value1, value2, "returnStateId");
            return (Criteria) this;
        }

        public Criteria andReturnStateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("return_state_id not between", value1, value2, "returnStateId");
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