package com.ygjy.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HospitalTransactionDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public HospitalTransactionDetailsExample() {
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

        public Criteria andReturnOrderIdIsNull() {
            addCriterion("return_order_id is null");
            return (Criteria) this;
        }

        public Criteria andReturnOrderIdIsNotNull() {
            addCriterion("return_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andReturnOrderIdEqualTo(Integer value) {
            addCriterion("return_order_id =", value, "returnOrderId");
            return (Criteria) this;
        }

        public Criteria andReturnOrderIdNotEqualTo(Integer value) {
            addCriterion("return_order_id <>", value, "returnOrderId");
            return (Criteria) this;
        }

        public Criteria andReturnOrderIdGreaterThan(Integer value) {
            addCriterion("return_order_id >", value, "returnOrderId");
            return (Criteria) this;
        }

        public Criteria andReturnOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("return_order_id >=", value, "returnOrderId");
            return (Criteria) this;
        }

        public Criteria andReturnOrderIdLessThan(Integer value) {
            addCriterion("return_order_id <", value, "returnOrderId");
            return (Criteria) this;
        }

        public Criteria andReturnOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("return_order_id <=", value, "returnOrderId");
            return (Criteria) this;
        }

        public Criteria andReturnOrderIdIn(List<Integer> values) {
            addCriterion("return_order_id in", values, "returnOrderId");
            return (Criteria) this;
        }

        public Criteria andReturnOrderIdNotIn(List<Integer> values) {
            addCriterion("return_order_id not in", values, "returnOrderId");
            return (Criteria) this;
        }

        public Criteria andReturnOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("return_order_id between", value1, value2, "returnOrderId");
            return (Criteria) this;
        }

        public Criteria andReturnOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("return_order_id not between", value1, value2, "returnOrderId");
            return (Criteria) this;
        }

        public Criteria andReturnsTheAmountIsNull() {
            addCriterion("returns_the_amount is null");
            return (Criteria) this;
        }

        public Criteria andReturnsTheAmountIsNotNull() {
            addCriterion("returns_the_amount is not null");
            return (Criteria) this;
        }

        public Criteria andReturnsTheAmountEqualTo(Integer value) {
            addCriterion("returns_the_amount =", value, "returnsTheAmount");
            return (Criteria) this;
        }

        public Criteria andReturnsTheAmountNotEqualTo(Integer value) {
            addCriterion("returns_the_amount <>", value, "returnsTheAmount");
            return (Criteria) this;
        }

        public Criteria andReturnsTheAmountGreaterThan(Integer value) {
            addCriterion("returns_the_amount >", value, "returnsTheAmount");
            return (Criteria) this;
        }

        public Criteria andReturnsTheAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("returns_the_amount >=", value, "returnsTheAmount");
            return (Criteria) this;
        }

        public Criteria andReturnsTheAmountLessThan(Integer value) {
            addCriterion("returns_the_amount <", value, "returnsTheAmount");
            return (Criteria) this;
        }

        public Criteria andReturnsTheAmountLessThanOrEqualTo(Integer value) {
            addCriterion("returns_the_amount <=", value, "returnsTheAmount");
            return (Criteria) this;
        }

        public Criteria andReturnsTheAmountIn(List<Integer> values) {
            addCriterion("returns_the_amount in", values, "returnsTheAmount");
            return (Criteria) this;
        }

        public Criteria andReturnsTheAmountNotIn(List<Integer> values) {
            addCriterion("returns_the_amount not in", values, "returnsTheAmount");
            return (Criteria) this;
        }

        public Criteria andReturnsTheAmountBetween(Integer value1, Integer value2) {
            addCriterion("returns_the_amount between", value1, value2, "returnsTheAmount");
            return (Criteria) this;
        }

        public Criteria andReturnsTheAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("returns_the_amount not between", value1, value2, "returnsTheAmount");
            return (Criteria) this;
        }

        public Criteria andReturnsTheMoneyIsNull() {
            addCriterion("returns_the_money is null");
            return (Criteria) this;
        }

        public Criteria andReturnsTheMoneyIsNotNull() {
            addCriterion("returns_the_money is not null");
            return (Criteria) this;
        }

        public Criteria andReturnsTheMoneyEqualTo(Float value) {
            addCriterion("returns_the_money =", value, "returnsTheMoney");
            return (Criteria) this;
        }

        public Criteria andReturnsTheMoneyNotEqualTo(Float value) {
            addCriterion("returns_the_money <>", value, "returnsTheMoney");
            return (Criteria) this;
        }

        public Criteria andReturnsTheMoneyGreaterThan(Float value) {
            addCriterion("returns_the_money >", value, "returnsTheMoney");
            return (Criteria) this;
        }

        public Criteria andReturnsTheMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("returns_the_money >=", value, "returnsTheMoney");
            return (Criteria) this;
        }

        public Criteria andReturnsTheMoneyLessThan(Float value) {
            addCriterion("returns_the_money <", value, "returnsTheMoney");
            return (Criteria) this;
        }

        public Criteria andReturnsTheMoneyLessThanOrEqualTo(Float value) {
            addCriterion("returns_the_money <=", value, "returnsTheMoney");
            return (Criteria) this;
        }

        public Criteria andReturnsTheMoneyIn(List<Float> values) {
            addCriterion("returns_the_money in", values, "returnsTheMoney");
            return (Criteria) this;
        }

        public Criteria andReturnsTheMoneyNotIn(List<Float> values) {
            addCriterion("returns_the_money not in", values, "returnsTheMoney");
            return (Criteria) this;
        }

        public Criteria andReturnsTheMoneyBetween(Float value1, Float value2) {
            addCriterion("returns_the_money between", value1, value2, "returnsTheMoney");
            return (Criteria) this;
        }

        public Criteria andReturnsTheMoneyNotBetween(Float value1, Float value2) {
            addCriterion("returns_the_money not between", value1, value2, "returnsTheMoney");
            return (Criteria) this;
        }

        public Criteria andReasonForReturnIsNull() {
            addCriterion("reason_for_return is null");
            return (Criteria) this;
        }

        public Criteria andReasonForReturnIsNotNull() {
            addCriterion("reason_for_return is not null");
            return (Criteria) this;
        }

        public Criteria andReasonForReturnEqualTo(String value) {
            addCriterion("reason_for_return =", value, "reasonForReturn");
            return (Criteria) this;
        }

        public Criteria andReasonForReturnNotEqualTo(String value) {
            addCriterion("reason_for_return <>", value, "reasonForReturn");
            return (Criteria) this;
        }

        public Criteria andReasonForReturnGreaterThan(String value) {
            addCriterion("reason_for_return >", value, "reasonForReturn");
            return (Criteria) this;
        }

        public Criteria andReasonForReturnGreaterThanOrEqualTo(String value) {
            addCriterion("reason_for_return >=", value, "reasonForReturn");
            return (Criteria) this;
        }

        public Criteria andReasonForReturnLessThan(String value) {
            addCriterion("reason_for_return <", value, "reasonForReturn");
            return (Criteria) this;
        }

        public Criteria andReasonForReturnLessThanOrEqualTo(String value) {
            addCriterion("reason_for_return <=", value, "reasonForReturn");
            return (Criteria) this;
        }

        public Criteria andReasonForReturnLike(String value) {
            addCriterion("reason_for_return like", value, "reasonForReturn");
            return (Criteria) this;
        }

        public Criteria andReasonForReturnNotLike(String value) {
            addCriterion("reason_for_return not like", value, "reasonForReturn");
            return (Criteria) this;
        }

        public Criteria andReasonForReturnIn(List<String> values) {
            addCriterion("reason_for_return in", values, "reasonForReturn");
            return (Criteria) this;
        }

        public Criteria andReasonForReturnNotIn(List<String> values) {
            addCriterion("reason_for_return not in", values, "reasonForReturn");
            return (Criteria) this;
        }

        public Criteria andReasonForReturnBetween(String value1, String value2) {
            addCriterion("reason_for_return between", value1, value2, "reasonForReturn");
            return (Criteria) this;
        }

        public Criteria andReasonForReturnNotBetween(String value1, String value2) {
            addCriterion("reason_for_return not between", value1, value2, "reasonForReturn");
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

        public Criteria andFinalSettlementIdIsNull() {
            addCriterion("`final_settlement _id` is null");
            return (Criteria) this;
        }

        public Criteria andFinalSettlementIdIsNotNull() {
            addCriterion("`final_settlement _id` is not null");
            return (Criteria) this;
        }

        public Criteria andFinalSettlementIdEqualTo(Integer value) {
            addCriterion("`final_settlement _id` =", value, "finalSettlementId");
            return (Criteria) this;
        }

        public Criteria andFinalSettlementIdNotEqualTo(Integer value) {
            addCriterion("`final_settlement _id` <>", value, "finalSettlementId");
            return (Criteria) this;
        }

        public Criteria andFinalSettlementIdGreaterThan(Integer value) {
            addCriterion("`final_settlement _id` >", value, "finalSettlementId");
            return (Criteria) this;
        }

        public Criteria andFinalSettlementIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("`final_settlement _id` >=", value, "finalSettlementId");
            return (Criteria) this;
        }

        public Criteria andFinalSettlementIdLessThan(Integer value) {
            addCriterion("`final_settlement _id` <", value, "finalSettlementId");
            return (Criteria) this;
        }

        public Criteria andFinalSettlementIdLessThanOrEqualTo(Integer value) {
            addCriterion("`final_settlement _id` <=", value, "finalSettlementId");
            return (Criteria) this;
        }

        public Criteria andFinalSettlementIdIn(List<Integer> values) {
            addCriterion("`final_settlement _id` in", values, "finalSettlementId");
            return (Criteria) this;
        }

        public Criteria andFinalSettlementIdNotIn(List<Integer> values) {
            addCriterion("`final_settlement _id` not in", values, "finalSettlementId");
            return (Criteria) this;
        }

        public Criteria andFinalSettlementIdBetween(Integer value1, Integer value2) {
            addCriterion("`final_settlement _id` between", value1, value2, "finalSettlementId");
            return (Criteria) this;
        }

        public Criteria andFinalSettlementIdNotBetween(Integer value1, Integer value2) {
            addCriterion("`final_settlement _id` not between", value1, value2, "finalSettlementId");
            return (Criteria) this;
        }

        public Criteria andFinalSettlementAmountIsNull() {
            addCriterion("`final_settlement _amount` is null");
            return (Criteria) this;
        }

        public Criteria andFinalSettlementAmountIsNotNull() {
            addCriterion("`final_settlement _amount` is not null");
            return (Criteria) this;
        }

        public Criteria andFinalSettlementAmountEqualTo(Integer value) {
            addCriterion("`final_settlement _amount` =", value, "finalSettlementAmount");
            return (Criteria) this;
        }

        public Criteria andFinalSettlementAmountNotEqualTo(Integer value) {
            addCriterion("`final_settlement _amount` <>", value, "finalSettlementAmount");
            return (Criteria) this;
        }

        public Criteria andFinalSettlementAmountGreaterThan(Integer value) {
            addCriterion("`final_settlement _amount` >", value, "finalSettlementAmount");
            return (Criteria) this;
        }

        public Criteria andFinalSettlementAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("`final_settlement _amount` >=", value, "finalSettlementAmount");
            return (Criteria) this;
        }

        public Criteria andFinalSettlementAmountLessThan(Integer value) {
            addCriterion("`final_settlement _amount` <", value, "finalSettlementAmount");
            return (Criteria) this;
        }

        public Criteria andFinalSettlementAmountLessThanOrEqualTo(Integer value) {
            addCriterion("`final_settlement _amount` <=", value, "finalSettlementAmount");
            return (Criteria) this;
        }

        public Criteria andFinalSettlementAmountIn(List<Integer> values) {
            addCriterion("`final_settlement _amount` in", values, "finalSettlementAmount");
            return (Criteria) this;
        }

        public Criteria andFinalSettlementAmountNotIn(List<Integer> values) {
            addCriterion("`final_settlement _amount` not in", values, "finalSettlementAmount");
            return (Criteria) this;
        }

        public Criteria andFinalSettlementAmountBetween(Integer value1, Integer value2) {
            addCriterion("`final_settlement _amount` between", value1, value2, "finalSettlementAmount");
            return (Criteria) this;
        }

        public Criteria andFinalSettlementAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("`final_settlement _amount` not between", value1, value2, "finalSettlementAmount");
            return (Criteria) this;
        }

        public Criteria andFinalSettlementMoneyIsNull() {
            addCriterion("`final_settlement _money` is null");
            return (Criteria) this;
        }

        public Criteria andFinalSettlementMoneyIsNotNull() {
            addCriterion("`final_settlement _money` is not null");
            return (Criteria) this;
        }

        public Criteria andFinalSettlementMoneyEqualTo(Float value) {
            addCriterion("`final_settlement _money` =", value, "finalSettlementMoney");
            return (Criteria) this;
        }

        public Criteria andFinalSettlementMoneyNotEqualTo(Float value) {
            addCriterion("`final_settlement _money` <>", value, "finalSettlementMoney");
            return (Criteria) this;
        }

        public Criteria andFinalSettlementMoneyGreaterThan(Float value) {
            addCriterion("`final_settlement _money` >", value, "finalSettlementMoney");
            return (Criteria) this;
        }

        public Criteria andFinalSettlementMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("`final_settlement _money` >=", value, "finalSettlementMoney");
            return (Criteria) this;
        }

        public Criteria andFinalSettlementMoneyLessThan(Float value) {
            addCriterion("`final_settlement _money` <", value, "finalSettlementMoney");
            return (Criteria) this;
        }

        public Criteria andFinalSettlementMoneyLessThanOrEqualTo(Float value) {
            addCriterion("`final_settlement _money` <=", value, "finalSettlementMoney");
            return (Criteria) this;
        }

        public Criteria andFinalSettlementMoneyIn(List<Float> values) {
            addCriterion("`final_settlement _money` in", values, "finalSettlementMoney");
            return (Criteria) this;
        }

        public Criteria andFinalSettlementMoneyNotIn(List<Float> values) {
            addCriterion("`final_settlement _money` not in", values, "finalSettlementMoney");
            return (Criteria) this;
        }

        public Criteria andFinalSettlementMoneyBetween(Float value1, Float value2) {
            addCriterion("`final_settlement _money` between", value1, value2, "finalSettlementMoney");
            return (Criteria) this;
        }

        public Criteria andFinalSettlementMoneyNotBetween(Float value1, Float value2) {
            addCriterion("`final_settlement _money` not between", value1, value2, "finalSettlementMoney");
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

        public Criteria andSuppliersIdIsNull() {
            addCriterion("suppliers_id is null");
            return (Criteria) this;
        }

        public Criteria andSuppliersIdIsNotNull() {
            addCriterion("suppliers_id is not null");
            return (Criteria) this;
        }

        public Criteria andSuppliersIdEqualTo(Integer value) {
            addCriterion("suppliers_id =", value, "suppliersId");
            return (Criteria) this;
        }

        public Criteria andSuppliersIdNotEqualTo(Integer value) {
            addCriterion("suppliers_id <>", value, "suppliersId");
            return (Criteria) this;
        }

        public Criteria andSuppliersIdGreaterThan(Integer value) {
            addCriterion("suppliers_id >", value, "suppliersId");
            return (Criteria) this;
        }

        public Criteria andSuppliersIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("suppliers_id >=", value, "suppliersId");
            return (Criteria) this;
        }

        public Criteria andSuppliersIdLessThan(Integer value) {
            addCriterion("suppliers_id <", value, "suppliersId");
            return (Criteria) this;
        }

        public Criteria andSuppliersIdLessThanOrEqualTo(Integer value) {
            addCriterion("suppliers_id <=", value, "suppliersId");
            return (Criteria) this;
        }

        public Criteria andSuppliersIdIn(List<Integer> values) {
            addCriterion("suppliers_id in", values, "suppliersId");
            return (Criteria) this;
        }

        public Criteria andSuppliersIdNotIn(List<Integer> values) {
            addCriterion("suppliers_id not in", values, "suppliersId");
            return (Criteria) this;
        }

        public Criteria andSuppliersIdBetween(Integer value1, Integer value2) {
            addCriterion("suppliers_id between", value1, value2, "suppliersId");
            return (Criteria) this;
        }

        public Criteria andSuppliersIdNotBetween(Integer value1, Integer value2) {
            addCriterion("suppliers_id not between", value1, value2, "suppliersId");
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