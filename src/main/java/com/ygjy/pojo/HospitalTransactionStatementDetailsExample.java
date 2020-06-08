package com.ygjy.pojo;

import java.util.ArrayList;
import java.util.List;

public class HospitalTransactionStatementDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public HospitalTransactionStatementDetailsExample() {
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

        public Criteria andHospitalTransactionStatementIdIsNull() {
            addCriterion("hospital_transaction_statement_id is null");
            return (Criteria) this;
        }

        public Criteria andHospitalTransactionStatementIdIsNotNull() {
            addCriterion("hospital_transaction_statement_id is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalTransactionStatementIdEqualTo(Integer value) {
            addCriterion("hospital_transaction_statement_id =", value, "hospitalTransactionStatementId");
            return (Criteria) this;
        }

        public Criteria andHospitalTransactionStatementIdNotEqualTo(Integer value) {
            addCriterion("hospital_transaction_statement_id <>", value, "hospitalTransactionStatementId");
            return (Criteria) this;
        }

        public Criteria andHospitalTransactionStatementIdGreaterThan(Integer value) {
            addCriterion("hospital_transaction_statement_id >", value, "hospitalTransactionStatementId");
            return (Criteria) this;
        }

        public Criteria andHospitalTransactionStatementIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("hospital_transaction_statement_id >=", value, "hospitalTransactionStatementId");
            return (Criteria) this;
        }

        public Criteria andHospitalTransactionStatementIdLessThan(Integer value) {
            addCriterion("hospital_transaction_statement_id <", value, "hospitalTransactionStatementId");
            return (Criteria) this;
        }

        public Criteria andHospitalTransactionStatementIdLessThanOrEqualTo(Integer value) {
            addCriterion("hospital_transaction_statement_id <=", value, "hospitalTransactionStatementId");
            return (Criteria) this;
        }

        public Criteria andHospitalTransactionStatementIdIn(List<Integer> values) {
            addCriterion("hospital_transaction_statement_id in", values, "hospitalTransactionStatementId");
            return (Criteria) this;
        }

        public Criteria andHospitalTransactionStatementIdNotIn(List<Integer> values) {
            addCriterion("hospital_transaction_statement_id not in", values, "hospitalTransactionStatementId");
            return (Criteria) this;
        }

        public Criteria andHospitalTransactionStatementIdBetween(Integer value1, Integer value2) {
            addCriterion("hospital_transaction_statement_id between", value1, value2, "hospitalTransactionStatementId");
            return (Criteria) this;
        }

        public Criteria andHospitalTransactionStatementIdNotBetween(Integer value1, Integer value2) {
            addCriterion("hospital_transaction_statement_id not between", value1, value2, "hospitalTransactionStatementId");
            return (Criteria) this;
        }

        public Criteria andSettleAccountsIsNull() {
            addCriterion("settle_accounts is null");
            return (Criteria) this;
        }

        public Criteria andSettleAccountsIsNotNull() {
            addCriterion("settle_accounts is not null");
            return (Criteria) this;
        }

        public Criteria andSettleAccountsEqualTo(Integer value) {
            addCriterion("settle_accounts =", value, "settleAccounts");
            return (Criteria) this;
        }

        public Criteria andSettleAccountsNotEqualTo(Integer value) {
            addCriterion("settle_accounts <>", value, "settleAccounts");
            return (Criteria) this;
        }

        public Criteria andSettleAccountsGreaterThan(Integer value) {
            addCriterion("settle_accounts >", value, "settleAccounts");
            return (Criteria) this;
        }

        public Criteria andSettleAccountsGreaterThanOrEqualTo(Integer value) {
            addCriterion("settle_accounts >=", value, "settleAccounts");
            return (Criteria) this;
        }

        public Criteria andSettleAccountsLessThan(Integer value) {
            addCriterion("settle_accounts <", value, "settleAccounts");
            return (Criteria) this;
        }

        public Criteria andSettleAccountsLessThanOrEqualTo(Integer value) {
            addCriterion("settle_accounts <=", value, "settleAccounts");
            return (Criteria) this;
        }

        public Criteria andSettleAccountsIn(List<Integer> values) {
            addCriterion("settle_accounts in", values, "settleAccounts");
            return (Criteria) this;
        }

        public Criteria andSettleAccountsNotIn(List<Integer> values) {
            addCriterion("settle_accounts not in", values, "settleAccounts");
            return (Criteria) this;
        }

        public Criteria andSettleAccountsBetween(Integer value1, Integer value2) {
            addCriterion("settle_accounts between", value1, value2, "settleAccounts");
            return (Criteria) this;
        }

        public Criteria andSettleAccountsNotBetween(Integer value1, Integer value2) {
            addCriterion("settle_accounts not between", value1, value2, "settleAccounts");
            return (Criteria) this;
        }

        public Criteria andSettlementMoneyIsNull() {
            addCriterion("settlement_money is null");
            return (Criteria) this;
        }

        public Criteria andSettlementMoneyIsNotNull() {
            addCriterion("settlement_money is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementMoneyEqualTo(Float value) {
            addCriterion("settlement_money =", value, "settlementMoney");
            return (Criteria) this;
        }

        public Criteria andSettlementMoneyNotEqualTo(Float value) {
            addCriterion("settlement_money <>", value, "settlementMoney");
            return (Criteria) this;
        }

        public Criteria andSettlementMoneyGreaterThan(Float value) {
            addCriterion("settlement_money >", value, "settlementMoney");
            return (Criteria) this;
        }

        public Criteria andSettlementMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("settlement_money >=", value, "settlementMoney");
            return (Criteria) this;
        }

        public Criteria andSettlementMoneyLessThan(Float value) {
            addCriterion("settlement_money <", value, "settlementMoney");
            return (Criteria) this;
        }

        public Criteria andSettlementMoneyLessThanOrEqualTo(Float value) {
            addCriterion("settlement_money <=", value, "settlementMoney");
            return (Criteria) this;
        }

        public Criteria andSettlementMoneyIn(List<Float> values) {
            addCriterion("settlement_money in", values, "settlementMoney");
            return (Criteria) this;
        }

        public Criteria andSettlementMoneyNotIn(List<Float> values) {
            addCriterion("settlement_money not in", values, "settlementMoney");
            return (Criteria) this;
        }

        public Criteria andSettlementMoneyBetween(Float value1, Float value2) {
            addCriterion("settlement_money between", value1, value2, "settlementMoney");
            return (Criteria) this;
        }

        public Criteria andSettlementMoneyNotBetween(Float value1, Float value2) {
            addCriterion("settlement_money not between", value1, value2, "settlementMoney");
            return (Criteria) this;
        }

        public Criteria andSettlementStateIdIsNull() {
            addCriterion("`settlement _state_id` is null");
            return (Criteria) this;
        }

        public Criteria andSettlementStateIdIsNotNull() {
            addCriterion("`settlement _state_id` is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementStateIdEqualTo(Integer value) {
            addCriterion("`settlement _state_id` =", value, "settlementStateId");
            return (Criteria) this;
        }

        public Criteria andSettlementStateIdNotEqualTo(Integer value) {
            addCriterion("`settlement _state_id` <>", value, "settlementStateId");
            return (Criteria) this;
        }

        public Criteria andSettlementStateIdGreaterThan(Integer value) {
            addCriterion("`settlement _state_id` >", value, "settlementStateId");
            return (Criteria) this;
        }

        public Criteria andSettlementStateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("`settlement _state_id` >=", value, "settlementStateId");
            return (Criteria) this;
        }

        public Criteria andSettlementStateIdLessThan(Integer value) {
            addCriterion("`settlement _state_id` <", value, "settlementStateId");
            return (Criteria) this;
        }

        public Criteria andSettlementStateIdLessThanOrEqualTo(Integer value) {
            addCriterion("`settlement _state_id` <=", value, "settlementStateId");
            return (Criteria) this;
        }

        public Criteria andSettlementStateIdIn(List<Integer> values) {
            addCriterion("`settlement _state_id` in", values, "settlementStateId");
            return (Criteria) this;
        }

        public Criteria andSettlementStateIdNotIn(List<Integer> values) {
            addCriterion("`settlement _state_id` not in", values, "settlementStateId");
            return (Criteria) this;
        }

        public Criteria andSettlementStateIdBetween(Integer value1, Integer value2) {
            addCriterion("`settlement _state_id` between", value1, value2, "settlementStateId");
            return (Criteria) this;
        }

        public Criteria andSettlementStateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("`settlement _state_id` not between", value1, value2, "settlementStateId");
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