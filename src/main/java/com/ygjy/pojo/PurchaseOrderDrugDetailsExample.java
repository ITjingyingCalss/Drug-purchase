package com.ygjy.pojo;

import java.util.ArrayList;
import java.util.List;

public class PurchaseOrderDrugDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public PurchaseOrderDrugDetailsExample() {
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

        public Criteria andPurchaseOrderIdIsNull() {
            addCriterion("purchase_order_id is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderIdIsNotNull() {
            addCriterion("purchase_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderIdEqualTo(Integer value) {
            addCriterion("purchase_order_id =", value, "purchaseOrderId");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderIdNotEqualTo(Integer value) {
            addCriterion("purchase_order_id <>", value, "purchaseOrderId");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderIdGreaterThan(Integer value) {
            addCriterion("purchase_order_id >", value, "purchaseOrderId");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("purchase_order_id >=", value, "purchaseOrderId");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderIdLessThan(Integer value) {
            addCriterion("purchase_order_id <", value, "purchaseOrderId");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("purchase_order_id <=", value, "purchaseOrderId");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderIdIn(List<Integer> values) {
            addCriterion("purchase_order_id in", values, "purchaseOrderId");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderIdNotIn(List<Integer> values) {
            addCriterion("purchase_order_id not in", values, "purchaseOrderId");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("purchase_order_id between", value1, value2, "purchaseOrderId");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("purchase_order_id not between", value1, value2, "purchaseOrderId");
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

        public Criteria andBiddingPriceIsNull() {
            addCriterion("bidding_price is null");
            return (Criteria) this;
        }

        public Criteria andBiddingPriceIsNotNull() {
            addCriterion("bidding_price is not null");
            return (Criteria) this;
        }

        public Criteria andBiddingPriceEqualTo(Float value) {
            addCriterion("bidding_price =", value, "biddingPrice");
            return (Criteria) this;
        }

        public Criteria andBiddingPriceNotEqualTo(Float value) {
            addCriterion("bidding_price <>", value, "biddingPrice");
            return (Criteria) this;
        }

        public Criteria andBiddingPriceGreaterThan(Float value) {
            addCriterion("bidding_price >", value, "biddingPrice");
            return (Criteria) this;
        }

        public Criteria andBiddingPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("bidding_price >=", value, "biddingPrice");
            return (Criteria) this;
        }

        public Criteria andBiddingPriceLessThan(Float value) {
            addCriterion("bidding_price <", value, "biddingPrice");
            return (Criteria) this;
        }

        public Criteria andBiddingPriceLessThanOrEqualTo(Float value) {
            addCriterion("bidding_price <=", value, "biddingPrice");
            return (Criteria) this;
        }

        public Criteria andBiddingPriceIn(List<Float> values) {
            addCriterion("bidding_price in", values, "biddingPrice");
            return (Criteria) this;
        }

        public Criteria andBiddingPriceNotIn(List<Float> values) {
            addCriterion("bidding_price not in", values, "biddingPrice");
            return (Criteria) this;
        }

        public Criteria andBiddingPriceBetween(Float value1, Float value2) {
            addCriterion("bidding_price between", value1, value2, "biddingPrice");
            return (Criteria) this;
        }

        public Criteria andBiddingPriceNotBetween(Float value1, Float value2) {
            addCriterion("bidding_price not between", value1, value2, "biddingPrice");
            return (Criteria) this;
        }

        public Criteria andTransactionPriceIsNull() {
            addCriterion("transaction_price is null");
            return (Criteria) this;
        }

        public Criteria andTransactionPriceIsNotNull() {
            addCriterion("transaction_price is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionPriceEqualTo(Float value) {
            addCriterion("transaction_price =", value, "transactionPrice");
            return (Criteria) this;
        }

        public Criteria andTransactionPriceNotEqualTo(Float value) {
            addCriterion("transaction_price <>", value, "transactionPrice");
            return (Criteria) this;
        }

        public Criteria andTransactionPriceGreaterThan(Float value) {
            addCriterion("transaction_price >", value, "transactionPrice");
            return (Criteria) this;
        }

        public Criteria andTransactionPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("transaction_price >=", value, "transactionPrice");
            return (Criteria) this;
        }

        public Criteria andTransactionPriceLessThan(Float value) {
            addCriterion("transaction_price <", value, "transactionPrice");
            return (Criteria) this;
        }

        public Criteria andTransactionPriceLessThanOrEqualTo(Float value) {
            addCriterion("transaction_price <=", value, "transactionPrice");
            return (Criteria) this;
        }

        public Criteria andTransactionPriceIn(List<Float> values) {
            addCriterion("transaction_price in", values, "transactionPrice");
            return (Criteria) this;
        }

        public Criteria andTransactionPriceNotIn(List<Float> values) {
            addCriterion("transaction_price not in", values, "transactionPrice");
            return (Criteria) this;
        }

        public Criteria andTransactionPriceBetween(Float value1, Float value2) {
            addCriterion("transaction_price between", value1, value2, "transactionPrice");
            return (Criteria) this;
        }

        public Criteria andTransactionPriceNotBetween(Float value1, Float value2) {
            addCriterion("transaction_price not between", value1, value2, "transactionPrice");
            return (Criteria) this;
        }

        public Criteria andPurchasedAmountIsNull() {
            addCriterion("purchased_amount is null");
            return (Criteria) this;
        }

        public Criteria andPurchasedAmountIsNotNull() {
            addCriterion("purchased_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPurchasedAmountEqualTo(Integer value) {
            addCriterion("purchased_amount =", value, "purchasedAmount");
            return (Criteria) this;
        }

        public Criteria andPurchasedAmountNotEqualTo(Integer value) {
            addCriterion("purchased_amount <>", value, "purchasedAmount");
            return (Criteria) this;
        }

        public Criteria andPurchasedAmountGreaterThan(Integer value) {
            addCriterion("purchased_amount >", value, "purchasedAmount");
            return (Criteria) this;
        }

        public Criteria andPurchasedAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("purchased_amount >=", value, "purchasedAmount");
            return (Criteria) this;
        }

        public Criteria andPurchasedAmountLessThan(Integer value) {
            addCriterion("purchased_amount <", value, "purchasedAmount");
            return (Criteria) this;
        }

        public Criteria andPurchasedAmountLessThanOrEqualTo(Integer value) {
            addCriterion("purchased_amount <=", value, "purchasedAmount");
            return (Criteria) this;
        }

        public Criteria andPurchasedAmountIn(List<Integer> values) {
            addCriterion("purchased_amount in", values, "purchasedAmount");
            return (Criteria) this;
        }

        public Criteria andPurchasedAmountNotIn(List<Integer> values) {
            addCriterion("purchased_amount not in", values, "purchasedAmount");
            return (Criteria) this;
        }

        public Criteria andPurchasedAmountBetween(Integer value1, Integer value2) {
            addCriterion("purchased_amount between", value1, value2, "purchasedAmount");
            return (Criteria) this;
        }

        public Criteria andPurchasedAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("purchased_amount not between", value1, value2, "purchasedAmount");
            return (Criteria) this;
        }

        public Criteria andPurchasedMoneyIsNull() {
            addCriterion("purchased_money is null");
            return (Criteria) this;
        }

        public Criteria andPurchasedMoneyIsNotNull() {
            addCriterion("purchased_money is not null");
            return (Criteria) this;
        }

        public Criteria andPurchasedMoneyEqualTo(Float value) {
            addCriterion("purchased_money =", value, "purchasedMoney");
            return (Criteria) this;
        }

        public Criteria andPurchasedMoneyNotEqualTo(Float value) {
            addCriterion("purchased_money <>", value, "purchasedMoney");
            return (Criteria) this;
        }

        public Criteria andPurchasedMoneyGreaterThan(Float value) {
            addCriterion("purchased_money >", value, "purchasedMoney");
            return (Criteria) this;
        }

        public Criteria andPurchasedMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("purchased_money >=", value, "purchasedMoney");
            return (Criteria) this;
        }

        public Criteria andPurchasedMoneyLessThan(Float value) {
            addCriterion("purchased_money <", value, "purchasedMoney");
            return (Criteria) this;
        }

        public Criteria andPurchasedMoneyLessThanOrEqualTo(Float value) {
            addCriterion("purchased_money <=", value, "purchasedMoney");
            return (Criteria) this;
        }

        public Criteria andPurchasedMoneyIn(List<Float> values) {
            addCriterion("purchased_money in", values, "purchasedMoney");
            return (Criteria) this;
        }

        public Criteria andPurchasedMoneyNotIn(List<Float> values) {
            addCriterion("purchased_money not in", values, "purchasedMoney");
            return (Criteria) this;
        }

        public Criteria andPurchasedMoneyBetween(Float value1, Float value2) {
            addCriterion("purchased_money between", value1, value2, "purchasedMoney");
            return (Criteria) this;
        }

        public Criteria andPurchasedMoneyNotBetween(Float value1, Float value2) {
            addCriterion("purchased_money not between", value1, value2, "purchasedMoney");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrdersStatesIdIsNull() {
            addCriterion("purchase_orders_states_id is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrdersStatesIdIsNotNull() {
            addCriterion("purchase_orders_states_id is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrdersStatesIdEqualTo(Integer value) {
            addCriterion("purchase_orders_states_id =", value, "purchaseOrdersStatesId");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrdersStatesIdNotEqualTo(Integer value) {
            addCriterion("purchase_orders_states_id <>", value, "purchaseOrdersStatesId");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrdersStatesIdGreaterThan(Integer value) {
            addCriterion("purchase_orders_states_id >", value, "purchaseOrdersStatesId");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrdersStatesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("purchase_orders_states_id >=", value, "purchaseOrdersStatesId");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrdersStatesIdLessThan(Integer value) {
            addCriterion("purchase_orders_states_id <", value, "purchaseOrdersStatesId");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrdersStatesIdLessThanOrEqualTo(Integer value) {
            addCriterion("purchase_orders_states_id <=", value, "purchaseOrdersStatesId");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrdersStatesIdIn(List<Integer> values) {
            addCriterion("purchase_orders_states_id in", values, "purchaseOrdersStatesId");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrdersStatesIdNotIn(List<Integer> values) {
            addCriterion("purchase_orders_states_id not in", values, "purchaseOrdersStatesId");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrdersStatesIdBetween(Integer value1, Integer value2) {
            addCriterion("purchase_orders_states_id between", value1, value2, "purchaseOrdersStatesId");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrdersStatesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("purchase_orders_states_id not between", value1, value2, "purchaseOrdersStatesId");
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