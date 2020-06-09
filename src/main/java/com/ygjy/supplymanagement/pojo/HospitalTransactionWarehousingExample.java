package com.ygjy.supplymanagement.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HospitalTransactionWarehousingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public HospitalTransactionWarehousingExample() {
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

        public Criteria andPurchaseOrdersIdIsNull() {
            addCriterion("purchase_orders_id is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrdersIdIsNotNull() {
            addCriterion("purchase_orders_id is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrdersIdEqualTo(Integer value) {
            addCriterion("purchase_orders_id =", value, "purchaseOrdersId");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrdersIdNotEqualTo(Integer value) {
            addCriterion("purchase_orders_id <>", value, "purchaseOrdersId");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrdersIdGreaterThan(Integer value) {
            addCriterion("purchase_orders_id >", value, "purchaseOrdersId");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrdersIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("purchase_orders_id >=", value, "purchaseOrdersId");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrdersIdLessThan(Integer value) {
            addCriterion("purchase_orders_id <", value, "purchaseOrdersId");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrdersIdLessThanOrEqualTo(Integer value) {
            addCriterion("purchase_orders_id <=", value, "purchaseOrdersId");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrdersIdIn(List<Integer> values) {
            addCriterion("purchase_orders_id in", values, "purchaseOrdersId");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrdersIdNotIn(List<Integer> values) {
            addCriterion("purchase_orders_id not in", values, "purchaseOrdersId");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrdersIdBetween(Integer value1, Integer value2) {
            addCriterion("purchase_orders_id between", value1, value2, "purchaseOrdersId");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrdersIdNotBetween(Integer value1, Integer value2) {
            addCriterion("purchase_orders_id not between", value1, value2, "purchaseOrdersId");
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

        public Criteria andReceiptAmountIsNull() {
            addCriterion("receipt_amount is null");
            return (Criteria) this;
        }

        public Criteria andReceiptAmountIsNotNull() {
            addCriterion("receipt_amount is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptAmountEqualTo(Integer value) {
            addCriterion("receipt_amount =", value, "receiptAmount");
            return (Criteria) this;
        }

        public Criteria andReceiptAmountNotEqualTo(Integer value) {
            addCriterion("receipt_amount <>", value, "receiptAmount");
            return (Criteria) this;
        }

        public Criteria andReceiptAmountGreaterThan(Integer value) {
            addCriterion("receipt_amount >", value, "receiptAmount");
            return (Criteria) this;
        }

        public Criteria andReceiptAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("receipt_amount >=", value, "receiptAmount");
            return (Criteria) this;
        }

        public Criteria andReceiptAmountLessThan(Integer value) {
            addCriterion("receipt_amount <", value, "receiptAmount");
            return (Criteria) this;
        }

        public Criteria andReceiptAmountLessThanOrEqualTo(Integer value) {
            addCriterion("receipt_amount <=", value, "receiptAmount");
            return (Criteria) this;
        }

        public Criteria andReceiptAmountIn(List<Integer> values) {
            addCriterion("receipt_amount in", values, "receiptAmount");
            return (Criteria) this;
        }

        public Criteria andReceiptAmountNotIn(List<Integer> values) {
            addCriterion("receipt_amount not in", values, "receiptAmount");
            return (Criteria) this;
        }

        public Criteria andReceiptAmountBetween(Integer value1, Integer value2) {
            addCriterion("receipt_amount between", value1, value2, "receiptAmount");
            return (Criteria) this;
        }

        public Criteria andReceiptAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("receipt_amount not between", value1, value2, "receiptAmount");
            return (Criteria) this;
        }

        public Criteria andReceiptMoneyIsNull() {
            addCriterion("receipt_money is null");
            return (Criteria) this;
        }

        public Criteria andReceiptMoneyIsNotNull() {
            addCriterion("receipt_money is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptMoneyEqualTo(Float value) {
            addCriterion("receipt_money =", value, "receiptMoney");
            return (Criteria) this;
        }

        public Criteria andReceiptMoneyNotEqualTo(Float value) {
            addCriterion("receipt_money <>", value, "receiptMoney");
            return (Criteria) this;
        }

        public Criteria andReceiptMoneyGreaterThan(Float value) {
            addCriterion("receipt_money >", value, "receiptMoney");
            return (Criteria) this;
        }

        public Criteria andReceiptMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("receipt_money >=", value, "receiptMoney");
            return (Criteria) this;
        }

        public Criteria andReceiptMoneyLessThan(Float value) {
            addCriterion("receipt_money <", value, "receiptMoney");
            return (Criteria) this;
        }

        public Criteria andReceiptMoneyLessThanOrEqualTo(Float value) {
            addCriterion("receipt_money <=", value, "receiptMoney");
            return (Criteria) this;
        }

        public Criteria andReceiptMoneyIn(List<Float> values) {
            addCriterion("receipt_money in", values, "receiptMoney");
            return (Criteria) this;
        }

        public Criteria andReceiptMoneyNotIn(List<Float> values) {
            addCriterion("receipt_money not in", values, "receiptMoney");
            return (Criteria) this;
        }

        public Criteria andReceiptMoneyBetween(Float value1, Float value2) {
            addCriterion("receipt_money between", value1, value2, "receiptMoney");
            return (Criteria) this;
        }

        public Criteria andReceiptMoneyNotBetween(Float value1, Float value2) {
            addCriterion("receipt_money not between", value1, value2, "receiptMoney");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberIsNull() {
            addCriterion("invoice_number is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberIsNotNull() {
            addCriterion("invoice_number is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberEqualTo(String value) {
            addCriterion("invoice_number =", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberNotEqualTo(String value) {
            addCriterion("invoice_number <>", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberGreaterThan(String value) {
            addCriterion("invoice_number >", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_number >=", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberLessThan(String value) {
            addCriterion("invoice_number <", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberLessThanOrEqualTo(String value) {
            addCriterion("invoice_number <=", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberLike(String value) {
            addCriterion("invoice_number like", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberNotLike(String value) {
            addCriterion("invoice_number not like", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberIn(List<String> values) {
            addCriterion("invoice_number in", values, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberNotIn(List<String> values) {
            addCriterion("invoice_number not in", values, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberBetween(String value1, String value2) {
            addCriterion("invoice_number between", value1, value2, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberNotBetween(String value1, String value2) {
            addCriterion("invoice_number not between", value1, value2, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andDrugBatchNumberIsNull() {
            addCriterion("drug_batch_number is null");
            return (Criteria) this;
        }

        public Criteria andDrugBatchNumberIsNotNull() {
            addCriterion("drug_batch_number is not null");
            return (Criteria) this;
        }

        public Criteria andDrugBatchNumberEqualTo(String value) {
            addCriterion("drug_batch_number =", value, "drugBatchNumber");
            return (Criteria) this;
        }

        public Criteria andDrugBatchNumberNotEqualTo(String value) {
            addCriterion("drug_batch_number <>", value, "drugBatchNumber");
            return (Criteria) this;
        }

        public Criteria andDrugBatchNumberGreaterThan(String value) {
            addCriterion("drug_batch_number >", value, "drugBatchNumber");
            return (Criteria) this;
        }

        public Criteria andDrugBatchNumberGreaterThanOrEqualTo(String value) {
            addCriterion("drug_batch_number >=", value, "drugBatchNumber");
            return (Criteria) this;
        }

        public Criteria andDrugBatchNumberLessThan(String value) {
            addCriterion("drug_batch_number <", value, "drugBatchNumber");
            return (Criteria) this;
        }

        public Criteria andDrugBatchNumberLessThanOrEqualTo(String value) {
            addCriterion("drug_batch_number <=", value, "drugBatchNumber");
            return (Criteria) this;
        }

        public Criteria andDrugBatchNumberLike(String value) {
            addCriterion("drug_batch_number like", value, "drugBatchNumber");
            return (Criteria) this;
        }

        public Criteria andDrugBatchNumberNotLike(String value) {
            addCriterion("drug_batch_number not like", value, "drugBatchNumber");
            return (Criteria) this;
        }

        public Criteria andDrugBatchNumberIn(List<String> values) {
            addCriterion("drug_batch_number in", values, "drugBatchNumber");
            return (Criteria) this;
        }

        public Criteria andDrugBatchNumberNotIn(List<String> values) {
            addCriterion("drug_batch_number not in", values, "drugBatchNumber");
            return (Criteria) this;
        }

        public Criteria andDrugBatchNumberBetween(String value1, String value2) {
            addCriterion("drug_batch_number between", value1, value2, "drugBatchNumber");
            return (Criteria) this;
        }

        public Criteria andDrugBatchNumberNotBetween(String value1, String value2) {
            addCriterion("drug_batch_number not between", value1, value2, "drugBatchNumber");
            return (Criteria) this;
        }

        public Criteria andDrugValidityIsNull() {
            addCriterion("drug_Validity is null");
            return (Criteria) this;
        }

        public Criteria andDrugValidityIsNotNull() {
            addCriterion("drug_Validity is not null");
            return (Criteria) this;
        }

        public Criteria andDrugValidityEqualTo(String value) {
            addCriterion("drug_Validity =", value, "drugValidity");
            return (Criteria) this;
        }

        public Criteria andDrugValidityNotEqualTo(String value) {
            addCriterion("drug_Validity <>", value, "drugValidity");
            return (Criteria) this;
        }

        public Criteria andDrugValidityGreaterThan(String value) {
            addCriterion("drug_Validity >", value, "drugValidity");
            return (Criteria) this;
        }

        public Criteria andDrugValidityGreaterThanOrEqualTo(String value) {
            addCriterion("drug_Validity >=", value, "drugValidity");
            return (Criteria) this;
        }

        public Criteria andDrugValidityLessThan(String value) {
            addCriterion("drug_Validity <", value, "drugValidity");
            return (Criteria) this;
        }

        public Criteria andDrugValidityLessThanOrEqualTo(String value) {
            addCriterion("drug_Validity <=", value, "drugValidity");
            return (Criteria) this;
        }

        public Criteria andDrugValidityLike(String value) {
            addCriterion("drug_Validity like", value, "drugValidity");
            return (Criteria) this;
        }

        public Criteria andDrugValidityNotLike(String value) {
            addCriterion("drug_Validity not like", value, "drugValidity");
            return (Criteria) this;
        }

        public Criteria andDrugValidityIn(List<String> values) {
            addCriterion("drug_Validity in", values, "drugValidity");
            return (Criteria) this;
        }

        public Criteria andDrugValidityNotIn(List<String> values) {
            addCriterion("drug_Validity not in", values, "drugValidity");
            return (Criteria) this;
        }

        public Criteria andDrugValidityBetween(String value1, String value2) {
            addCriterion("drug_Validity between", value1, value2, "drugValidity");
            return (Criteria) this;
        }

        public Criteria andDrugValidityNotBetween(String value1, String value2) {
            addCriterion("drug_Validity not between", value1, value2, "drugValidity");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeIsNull() {
            addCriterion("receipt_time is null");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeIsNotNull() {
            addCriterion("receipt_time is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeEqualTo(Date value) {
            addCriterion("receipt_time =", value, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeNotEqualTo(Date value) {
            addCriterion("receipt_time <>", value, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeGreaterThan(Date value) {
            addCriterion("receipt_time >", value, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("receipt_time >=", value, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeLessThan(Date value) {
            addCriterion("receipt_time <", value, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeLessThanOrEqualTo(Date value) {
            addCriterion("receipt_time <=", value, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeIn(List<Date> values) {
            addCriterion("receipt_time in", values, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeNotIn(List<Date> values) {
            addCriterion("receipt_time not in", values, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeBetween(Date value1, Date value2) {
            addCriterion("receipt_time between", value1, value2, "receiptTime");
            return (Criteria) this;
        }

        public Criteria andReceiptTimeNotBetween(Date value1, Date value2) {
            addCriterion("receipt_time not between", value1, value2, "receiptTime");
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