package com.ygjy.purchasingmanagement2.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PurchaseOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public PurchaseOrderExample() {
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

        public Criteria andPurchaseOrderNumberIsNull() {
            addCriterion("purchase_order_number is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderNumberIsNotNull() {
            addCriterion("purchase_order_number is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderNumberEqualTo(String value) {
            addCriterion("purchase_order_number =", value, "purchaseOrderNumber");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderNumberNotEqualTo(String value) {
            addCriterion("purchase_order_number <>", value, "purchaseOrderNumber");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderNumberGreaterThan(String value) {
            addCriterion("purchase_order_number >", value, "purchaseOrderNumber");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderNumberGreaterThanOrEqualTo(String value) {
            addCriterion("purchase_order_number >=", value, "purchaseOrderNumber");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderNumberLessThan(String value) {
            addCriterion("purchase_order_number <", value, "purchaseOrderNumber");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderNumberLessThanOrEqualTo(String value) {
            addCriterion("purchase_order_number <=", value, "purchaseOrderNumber");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderNumberLike(String value) {
            addCriterion("purchase_order_number like", value, "purchaseOrderNumber");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderNumberNotLike(String value) {
            addCriterion("purchase_order_number not like", value, "purchaseOrderNumber");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderNumberIn(List<String> values) {
            addCriterion("purchase_order_number in", values, "purchaseOrderNumber");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderNumberNotIn(List<String> values) {
            addCriterion("purchase_order_number not in", values, "purchaseOrderNumber");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderNumberBetween(String value1, String value2) {
            addCriterion("purchase_order_number between", value1, value2, "purchaseOrderNumber");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderNumberNotBetween(String value1, String value2) {
            addCriterion("purchase_order_number not between", value1, value2, "purchaseOrderNumber");
            return (Criteria) this;
        }

        public Criteria andNameOfPurchaseOrderIsNull() {
            addCriterion("name_of_purchase_order is null");
            return (Criteria) this;
        }

        public Criteria andNameOfPurchaseOrderIsNotNull() {
            addCriterion("name_of_purchase_order is not null");
            return (Criteria) this;
        }

        public Criteria andNameOfPurchaseOrderEqualTo(String value) {
            addCriterion("name_of_purchase_order =", value, "nameOfPurchaseOrder");
            return (Criteria) this;
        }

        public Criteria andNameOfPurchaseOrderNotEqualTo(String value) {
            addCriterion("name_of_purchase_order <>", value, "nameOfPurchaseOrder");
            return (Criteria) this;
        }

        public Criteria andNameOfPurchaseOrderGreaterThan(String value) {
            addCriterion("name_of_purchase_order >", value, "nameOfPurchaseOrder");
            return (Criteria) this;
        }

        public Criteria andNameOfPurchaseOrderGreaterThanOrEqualTo(String value) {
            addCriterion("name_of_purchase_order >=", value, "nameOfPurchaseOrder");
            return (Criteria) this;
        }

        public Criteria andNameOfPurchaseOrderLessThan(String value) {
            addCriterion("name_of_purchase_order <", value, "nameOfPurchaseOrder");
            return (Criteria) this;
        }

        public Criteria andNameOfPurchaseOrderLessThanOrEqualTo(String value) {
            addCriterion("name_of_purchase_order <=", value, "nameOfPurchaseOrder");
            return (Criteria) this;
        }

        public Criteria andNameOfPurchaseOrderLike(String value) {
            addCriterion("name_of_purchase_order like", value, "nameOfPurchaseOrder");
            return (Criteria) this;
        }

        public Criteria andNameOfPurchaseOrderNotLike(String value) {
            addCriterion("name_of_purchase_order not like", value, "nameOfPurchaseOrder");
            return (Criteria) this;
        }

        public Criteria andNameOfPurchaseOrderIn(List<String> values) {
            addCriterion("name_of_purchase_order in", values, "nameOfPurchaseOrder");
            return (Criteria) this;
        }

        public Criteria andNameOfPurchaseOrderNotIn(List<String> values) {
            addCriterion("name_of_purchase_order not in", values, "nameOfPurchaseOrder");
            return (Criteria) this;
        }

        public Criteria andNameOfPurchaseOrderBetween(String value1, String value2) {
            addCriterion("name_of_purchase_order between", value1, value2, "nameOfPurchaseOrder");
            return (Criteria) this;
        }

        public Criteria andNameOfPurchaseOrderNotBetween(String value1, String value2) {
            addCriterion("name_of_purchase_order not between", value1, value2, "nameOfPurchaseOrder");
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

        public Criteria andLastModificationTimeIsNull() {
            addCriterion("last_modification_time is null");
            return (Criteria) this;
        }

        public Criteria andLastModificationTimeIsNotNull() {
            addCriterion("last_modification_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastModificationTimeEqualTo(Date value) {
            addCriterion("last_modification_time =", value, "lastModificationTime");
            return (Criteria) this;
        }

        public Criteria andLastModificationTimeNotEqualTo(Date value) {
            addCriterion("last_modification_time <>", value, "lastModificationTime");
            return (Criteria) this;
        }

        public Criteria andLastModificationTimeGreaterThan(Date value) {
            addCriterion("last_modification_time >", value, "lastModificationTime");
            return (Criteria) this;
        }

        public Criteria andLastModificationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_modification_time >=", value, "lastModificationTime");
            return (Criteria) this;
        }

        public Criteria andLastModificationTimeLessThan(Date value) {
            addCriterion("last_modification_time <", value, "lastModificationTime");
            return (Criteria) this;
        }

        public Criteria andLastModificationTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_modification_time <=", value, "lastModificationTime");
            return (Criteria) this;
        }

        public Criteria andLastModificationTimeIn(List<Date> values) {
            addCriterion("last_modification_time in", values, "lastModificationTime");
            return (Criteria) this;
        }

        public Criteria andLastModificationTimeNotIn(List<Date> values) {
            addCriterion("last_modification_time not in", values, "lastModificationTime");
            return (Criteria) this;
        }

        public Criteria andLastModificationTimeBetween(Date value1, Date value2) {
            addCriterion("last_modification_time between", value1, value2, "lastModificationTime");
            return (Criteria) this;
        }

        public Criteria andLastModificationTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_modification_time not between", value1, value2, "lastModificationTime");
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

        public Criteria andPurchaseStateIsNull() {
            addCriterion("purchase_state is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseStateIsNotNull() {
            addCriterion("purchase_state is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseStateEqualTo(Integer value) {
            addCriterion("purchase_state =", value, "purchaseState");
            return (Criteria) this;
        }

        public Criteria andPurchaseStateNotEqualTo(Integer value) {
            addCriterion("purchase_state <>", value, "purchaseState");
            return (Criteria) this;
        }

        public Criteria andPurchaseStateGreaterThan(Integer value) {
            addCriterion("purchase_state >", value, "purchaseState");
            return (Criteria) this;
        }

        public Criteria andPurchaseStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("purchase_state >=", value, "purchaseState");
            return (Criteria) this;
        }

        public Criteria andPurchaseStateLessThan(Integer value) {
            addCriterion("purchase_state <", value, "purchaseState");
            return (Criteria) this;
        }

        public Criteria andPurchaseStateLessThanOrEqualTo(Integer value) {
            addCriterion("purchase_state <=", value, "purchaseState");
            return (Criteria) this;
        }

        public Criteria andPurchaseStateIn(List<Integer> values) {
            addCriterion("purchase_state in", values, "purchaseState");
            return (Criteria) this;
        }

        public Criteria andPurchaseStateNotIn(List<Integer> values) {
            addCriterion("purchase_state not in", values, "purchaseState");
            return (Criteria) this;
        }

        public Criteria andPurchaseStateBetween(Integer value1, Integer value2) {
            addCriterion("purchase_state between", value1, value2, "purchaseState");
            return (Criteria) this;
        }

        public Criteria andPurchaseStateNotBetween(Integer value1, Integer value2) {
            addCriterion("purchase_state not between", value1, value2, "purchaseState");
            return (Criteria) this;
        }

        public Criteria andAuditPersonIsNull() {
            addCriterion("audit_person is null");
            return (Criteria) this;
        }

        public Criteria andAuditPersonIsNotNull() {
            addCriterion("audit_person is not null");
            return (Criteria) this;
        }

        public Criteria andAuditPersonEqualTo(String value) {
            addCriterion("audit_person =", value, "auditPerson");
            return (Criteria) this;
        }

        public Criteria andAuditPersonNotEqualTo(String value) {
            addCriterion("audit_person <>", value, "auditPerson");
            return (Criteria) this;
        }

        public Criteria andAuditPersonGreaterThan(String value) {
            addCriterion("audit_person >", value, "auditPerson");
            return (Criteria) this;
        }

        public Criteria andAuditPersonGreaterThanOrEqualTo(String value) {
            addCriterion("audit_person >=", value, "auditPerson");
            return (Criteria) this;
        }

        public Criteria andAuditPersonLessThan(String value) {
            addCriterion("audit_person <", value, "auditPerson");
            return (Criteria) this;
        }

        public Criteria andAuditPersonLessThanOrEqualTo(String value) {
            addCriterion("audit_person <=", value, "auditPerson");
            return (Criteria) this;
        }

        public Criteria andAuditPersonLike(String value) {
            addCriterion("audit_person like", value, "auditPerson");
            return (Criteria) this;
        }

        public Criteria andAuditPersonNotLike(String value) {
            addCriterion("audit_person not like", value, "auditPerson");
            return (Criteria) this;
        }

        public Criteria andAuditPersonIn(List<String> values) {
            addCriterion("audit_person in", values, "auditPerson");
            return (Criteria) this;
        }

        public Criteria andAuditPersonNotIn(List<String> values) {
            addCriterion("audit_person not in", values, "auditPerson");
            return (Criteria) this;
        }

        public Criteria andAuditPersonBetween(String value1, String value2) {
            addCriterion("audit_person between", value1, value2, "auditPerson");
            return (Criteria) this;
        }

        public Criteria andAuditPersonNotBetween(String value1, String value2) {
            addCriterion("audit_person not between", value1, value2, "auditPerson");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionIsNull() {
            addCriterion("audit_opinion is null");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionIsNotNull() {
            addCriterion("audit_opinion is not null");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionEqualTo(String value) {
            addCriterion("audit_opinion =", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotEqualTo(String value) {
            addCriterion("audit_opinion <>", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionGreaterThan(String value) {
            addCriterion("audit_opinion >", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionGreaterThanOrEqualTo(String value) {
            addCriterion("audit_opinion >=", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionLessThan(String value) {
            addCriterion("audit_opinion <", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionLessThanOrEqualTo(String value) {
            addCriterion("audit_opinion <=", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionLike(String value) {
            addCriterion("audit_opinion like", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotLike(String value) {
            addCriterion("audit_opinion not like", value, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionIn(List<String> values) {
            addCriterion("audit_opinion in", values, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotIn(List<String> values) {
            addCriterion("audit_opinion not in", values, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionBetween(String value1, String value2) {
            addCriterion("audit_opinion between", value1, value2, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditOpinionNotBetween(String value1, String value2) {
            addCriterion("audit_opinion not between", value1, value2, "auditOpinion");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNull() {
            addCriterion("audit_time is null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNotNull() {
            addCriterion("audit_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeEqualTo(Date value) {
            addCriterion("audit_time =", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotEqualTo(Date value) {
            addCriterion("audit_time <>", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThan(Date value) {
            addCriterion("audit_time >", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("audit_time >=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThan(Date value) {
            addCriterion("audit_time <", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThanOrEqualTo(Date value) {
            addCriterion("audit_time <=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIn(List<Date> values) {
            addCriterion("audit_time in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotIn(List<Date> values) {
            addCriterion("audit_time not in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeBetween(Date value1, Date value2) {
            addCriterion("audit_time between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotBetween(Date value1, Date value2) {
            addCriterion("audit_time not between", value1, value2, "auditTime");
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

        public Criteria andDelStateEqualTo(Integer value) {
            addCriterion("del_state =", value, "delState");
            return (Criteria) this;
        }

        public Criteria andDelStateNotEqualTo(Integer value) {
            addCriterion("del_state <>", value, "delState");
            return (Criteria) this;
        }

        public Criteria andDelStateGreaterThan(Integer value) {
            addCriterion("del_state >", value, "delState");
            return (Criteria) this;
        }

        public Criteria andDelStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("del_state >=", value, "delState");
            return (Criteria) this;
        }

        public Criteria andDelStateLessThan(Integer value) {
            addCriterion("del_state <", value, "delState");
            return (Criteria) this;
        }

        public Criteria andDelStateLessThanOrEqualTo(Integer value) {
            addCriterion("del_state <=", value, "delState");
            return (Criteria) this;
        }

        public Criteria andDelStateIn(List<Integer> values) {
            addCriterion("del_state in", values, "delState");
            return (Criteria) this;
        }

        public Criteria andDelStateNotIn(List<Integer> values) {
            addCriterion("del_state not in", values, "delState");
            return (Criteria) this;
        }

        public Criteria andDelStateBetween(Integer value1, Integer value2) {
            addCriterion("del_state between", value1, value2, "delState");
            return (Criteria) this;
        }

        public Criteria andDelStateNotBetween(Integer value1, Integer value2) {
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