package com.ygjy.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DrugInformationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public DrugInformationExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andSerialNumberIsNull() {
            addCriterion("serial_number is null");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIsNotNull() {
            addCriterion("serial_number is not null");
            return (Criteria) this;
        }

        public Criteria andSerialNumberEqualTo(Integer value) {
            addCriterion("serial_number =", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotEqualTo(Integer value) {
            addCriterion("serial_number <>", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberGreaterThan(Integer value) {
            addCriterion("serial_number >", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("serial_number >=", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLessThan(Integer value) {
            addCriterion("serial_number <", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberLessThanOrEqualTo(Integer value) {
            addCriterion("serial_number <=", value, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberIn(List<Integer> values) {
            addCriterion("serial_number in", values, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotIn(List<Integer> values) {
            addCriterion("serial_number not in", values, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberBetween(Integer value1, Integer value2) {
            addCriterion("serial_number between", value1, value2, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andSerialNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("serial_number not between", value1, value2, "serialNumber");
            return (Criteria) this;
        }

        public Criteria andCommonNameIsNull() {
            addCriterion("common_name is null");
            return (Criteria) this;
        }

        public Criteria andCommonNameIsNotNull() {
            addCriterion("common_name is not null");
            return (Criteria) this;
        }

        public Criteria andCommonNameEqualTo(String value) {
            addCriterion("common_name =", value, "commonName");
            return (Criteria) this;
        }

        public Criteria andCommonNameNotEqualTo(String value) {
            addCriterion("common_name <>", value, "commonName");
            return (Criteria) this;
        }

        public Criteria andCommonNameGreaterThan(String value) {
            addCriterion("common_name >", value, "commonName");
            return (Criteria) this;
        }

        public Criteria andCommonNameGreaterThanOrEqualTo(String value) {
            addCriterion("common_name >=", value, "commonName");
            return (Criteria) this;
        }

        public Criteria andCommonNameLessThan(String value) {
            addCriterion("common_name <", value, "commonName");
            return (Criteria) this;
        }

        public Criteria andCommonNameLessThanOrEqualTo(String value) {
            addCriterion("common_name <=", value, "commonName");
            return (Criteria) this;
        }

        public Criteria andCommonNameLike(String value) {
            addCriterion("common_name like", value, "commonName");
            return (Criteria) this;
        }

        public Criteria andCommonNameNotLike(String value) {
            addCriterion("common_name not like", value, "commonName");
            return (Criteria) this;
        }

        public Criteria andCommonNameIn(List<String> values) {
            addCriterion("common_name in", values, "commonName");
            return (Criteria) this;
        }

        public Criteria andCommonNameNotIn(List<String> values) {
            addCriterion("common_name not in", values, "commonName");
            return (Criteria) this;
        }

        public Criteria andCommonNameBetween(String value1, String value2) {
            addCriterion("common_name between", value1, value2, "commonName");
            return (Criteria) this;
        }

        public Criteria andCommonNameNotBetween(String value1, String value2) {
            addCriterion("common_name not between", value1, value2, "commonName");
            return (Criteria) this;
        }

        public Criteria andDosageFormIdIsNull() {
            addCriterion("dosage_form_id is null");
            return (Criteria) this;
        }

        public Criteria andDosageFormIdIsNotNull() {
            addCriterion("dosage_form_id is not null");
            return (Criteria) this;
        }

        public Criteria andDosageFormIdEqualTo(Integer value) {
            addCriterion("dosage_form_id =", value, "dosageFormId");
            return (Criteria) this;
        }

        public Criteria andDosageFormIdNotEqualTo(Integer value) {
            addCriterion("dosage_form_id <>", value, "dosageFormId");
            return (Criteria) this;
        }

        public Criteria andDosageFormIdGreaterThan(Integer value) {
            addCriterion("dosage_form_id >", value, "dosageFormId");
            return (Criteria) this;
        }

        public Criteria andDosageFormIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dosage_form_id >=", value, "dosageFormId");
            return (Criteria) this;
        }

        public Criteria andDosageFormIdLessThan(Integer value) {
            addCriterion("dosage_form_id <", value, "dosageFormId");
            return (Criteria) this;
        }

        public Criteria andDosageFormIdLessThanOrEqualTo(Integer value) {
            addCriterion("dosage_form_id <=", value, "dosageFormId");
            return (Criteria) this;
        }

        public Criteria andDosageFormIdIn(List<Integer> values) {
            addCriterion("dosage_form_id in", values, "dosageFormId");
            return (Criteria) this;
        }

        public Criteria andDosageFormIdNotIn(List<Integer> values) {
            addCriterion("dosage_form_id not in", values, "dosageFormId");
            return (Criteria) this;
        }

        public Criteria andDosageFormIdBetween(Integer value1, Integer value2) {
            addCriterion("dosage_form_id between", value1, value2, "dosageFormId");
            return (Criteria) this;
        }

        public Criteria andDosageFormIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dosage_form_id not between", value1, value2, "dosageFormId");
            return (Criteria) this;
        }

        public Criteria andSpecificationIsNull() {
            addCriterion("specification is null");
            return (Criteria) this;
        }

        public Criteria andSpecificationIsNotNull() {
            addCriterion("specification is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificationEqualTo(String value) {
            addCriterion("specification =", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotEqualTo(String value) {
            addCriterion("specification <>", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationGreaterThan(String value) {
            addCriterion("specification >", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationGreaterThanOrEqualTo(String value) {
            addCriterion("specification >=", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLessThan(String value) {
            addCriterion("specification <", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLessThanOrEqualTo(String value) {
            addCriterion("specification <=", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLike(String value) {
            addCriterion("specification like", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotLike(String value) {
            addCriterion("specification not like", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationIn(List<String> values) {
            addCriterion("specification in", values, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotIn(List<String> values) {
            addCriterion("specification not in", values, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationBetween(String value1, String value2) {
            addCriterion("specification between", value1, value2, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotBetween(String value1, String value2) {
            addCriterion("specification not between", value1, value2, "specification");
            return (Criteria) this;
        }

        public Criteria andConversionFractionIsNull() {
            addCriterion("conversion_fraction is null");
            return (Criteria) this;
        }

        public Criteria andConversionFractionIsNotNull() {
            addCriterion("conversion_fraction is not null");
            return (Criteria) this;
        }

        public Criteria andConversionFractionEqualTo(String value) {
            addCriterion("conversion_fraction =", value, "conversionFraction");
            return (Criteria) this;
        }

        public Criteria andConversionFractionNotEqualTo(String value) {
            addCriterion("conversion_fraction <>", value, "conversionFraction");
            return (Criteria) this;
        }

        public Criteria andConversionFractionGreaterThan(String value) {
            addCriterion("conversion_fraction >", value, "conversionFraction");
            return (Criteria) this;
        }

        public Criteria andConversionFractionGreaterThanOrEqualTo(String value) {
            addCriterion("conversion_fraction >=", value, "conversionFraction");
            return (Criteria) this;
        }

        public Criteria andConversionFractionLessThan(String value) {
            addCriterion("conversion_fraction <", value, "conversionFraction");
            return (Criteria) this;
        }

        public Criteria andConversionFractionLessThanOrEqualTo(String value) {
            addCriterion("conversion_fraction <=", value, "conversionFraction");
            return (Criteria) this;
        }

        public Criteria andConversionFractionLike(String value) {
            addCriterion("conversion_fraction like", value, "conversionFraction");
            return (Criteria) this;
        }

        public Criteria andConversionFractionNotLike(String value) {
            addCriterion("conversion_fraction not like", value, "conversionFraction");
            return (Criteria) this;
        }

        public Criteria andConversionFractionIn(List<String> values) {
            addCriterion("conversion_fraction in", values, "conversionFraction");
            return (Criteria) this;
        }

        public Criteria andConversionFractionNotIn(List<String> values) {
            addCriterion("conversion_fraction not in", values, "conversionFraction");
            return (Criteria) this;
        }

        public Criteria andConversionFractionBetween(String value1, String value2) {
            addCriterion("conversion_fraction between", value1, value2, "conversionFraction");
            return (Criteria) this;
        }

        public Criteria andConversionFractionNotBetween(String value1, String value2) {
            addCriterion("conversion_fraction not between", value1, value2, "conversionFraction");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameIsNull() {
            addCriterion("enterprise_name is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameIsNotNull() {
            addCriterion("enterprise_name is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameEqualTo(String value) {
            addCriterion("enterprise_name =", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotEqualTo(String value) {
            addCriterion("enterprise_name <>", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameGreaterThan(String value) {
            addCriterion("enterprise_name >", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_name >=", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameLessThan(String value) {
            addCriterion("enterprise_name <", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameLessThanOrEqualTo(String value) {
            addCriterion("enterprise_name <=", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameLike(String value) {
            addCriterion("enterprise_name like", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotLike(String value) {
            addCriterion("enterprise_name not like", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameIn(List<String> values) {
            addCriterion("enterprise_name in", values, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotIn(List<String> values) {
            addCriterion("enterprise_name not in", values, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameBetween(String value1, String value2) {
            addCriterion("enterprise_name between", value1, value2, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotBetween(String value1, String value2) {
            addCriterion("enterprise_name not between", value1, value2, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andTradeNameIsNull() {
            addCriterion("trade_name is null");
            return (Criteria) this;
        }

        public Criteria andTradeNameIsNotNull() {
            addCriterion("trade_name is not null");
            return (Criteria) this;
        }

        public Criteria andTradeNameEqualTo(String value) {
            addCriterion("trade_name =", value, "tradeName");
            return (Criteria) this;
        }

        public Criteria andTradeNameNotEqualTo(String value) {
            addCriterion("trade_name <>", value, "tradeName");
            return (Criteria) this;
        }

        public Criteria andTradeNameGreaterThan(String value) {
            addCriterion("trade_name >", value, "tradeName");
            return (Criteria) this;
        }

        public Criteria andTradeNameGreaterThanOrEqualTo(String value) {
            addCriterion("trade_name >=", value, "tradeName");
            return (Criteria) this;
        }

        public Criteria andTradeNameLessThan(String value) {
            addCriterion("trade_name <", value, "tradeName");
            return (Criteria) this;
        }

        public Criteria andTradeNameLessThanOrEqualTo(String value) {
            addCriterion("trade_name <=", value, "tradeName");
            return (Criteria) this;
        }

        public Criteria andTradeNameLike(String value) {
            addCriterion("trade_name like", value, "tradeName");
            return (Criteria) this;
        }

        public Criteria andTradeNameNotLike(String value) {
            addCriterion("trade_name not like", value, "tradeName");
            return (Criteria) this;
        }

        public Criteria andTradeNameIn(List<String> values) {
            addCriterion("trade_name in", values, "tradeName");
            return (Criteria) this;
        }

        public Criteria andTradeNameNotIn(List<String> values) {
            addCriterion("trade_name not in", values, "tradeName");
            return (Criteria) this;
        }

        public Criteria andTradeNameBetween(String value1, String value2) {
            addCriterion("trade_name between", value1, value2, "tradeName");
            return (Criteria) this;
        }

        public Criteria andTradeNameNotBetween(String value1, String value2) {
            addCriterion("trade_name not between", value1, value2, "tradeName");
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

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andCommonNamePinyinIsNull() {
            addCriterion("common_name_pinyin is null");
            return (Criteria) this;
        }

        public Criteria andCommonNamePinyinIsNotNull() {
            addCriterion("common_name_pinyin is not null");
            return (Criteria) this;
        }

        public Criteria andCommonNamePinyinEqualTo(String value) {
            addCriterion("common_name_pinyin =", value, "commonNamePinyin");
            return (Criteria) this;
        }

        public Criteria andCommonNamePinyinNotEqualTo(String value) {
            addCriterion("common_name_pinyin <>", value, "commonNamePinyin");
            return (Criteria) this;
        }

        public Criteria andCommonNamePinyinGreaterThan(String value) {
            addCriterion("common_name_pinyin >", value, "commonNamePinyin");
            return (Criteria) this;
        }

        public Criteria andCommonNamePinyinGreaterThanOrEqualTo(String value) {
            addCriterion("common_name_pinyin >=", value, "commonNamePinyin");
            return (Criteria) this;
        }

        public Criteria andCommonNamePinyinLessThan(String value) {
            addCriterion("common_name_pinyin <", value, "commonNamePinyin");
            return (Criteria) this;
        }

        public Criteria andCommonNamePinyinLessThanOrEqualTo(String value) {
            addCriterion("common_name_pinyin <=", value, "commonNamePinyin");
            return (Criteria) this;
        }

        public Criteria andCommonNamePinyinLike(String value) {
            addCriterion("common_name_pinyin like", value, "commonNamePinyin");
            return (Criteria) this;
        }

        public Criteria andCommonNamePinyinNotLike(String value) {
            addCriterion("common_name_pinyin not like", value, "commonNamePinyin");
            return (Criteria) this;
        }

        public Criteria andCommonNamePinyinIn(List<String> values) {
            addCriterion("common_name_pinyin in", values, "commonNamePinyin");
            return (Criteria) this;
        }

        public Criteria andCommonNamePinyinNotIn(List<String> values) {
            addCriterion("common_name_pinyin not in", values, "commonNamePinyin");
            return (Criteria) this;
        }

        public Criteria andCommonNamePinyinBetween(String value1, String value2) {
            addCriterion("common_name_pinyin between", value1, value2, "commonNamePinyin");
            return (Criteria) this;
        }

        public Criteria andCommonNamePinyinNotBetween(String value1, String value2) {
            addCriterion("common_name_pinyin not between", value1, value2, "commonNamePinyin");
            return (Criteria) this;
        }

        public Criteria andProductPictureIsNull() {
            addCriterion("product_picture is null");
            return (Criteria) this;
        }

        public Criteria andProductPictureIsNotNull() {
            addCriterion("product_picture is not null");
            return (Criteria) this;
        }

        public Criteria andProductPictureEqualTo(String value) {
            addCriterion("product_picture =", value, "productPicture");
            return (Criteria) this;
        }

        public Criteria andProductPictureNotEqualTo(String value) {
            addCriterion("product_picture <>", value, "productPicture");
            return (Criteria) this;
        }

        public Criteria andProductPictureGreaterThan(String value) {
            addCriterion("product_picture >", value, "productPicture");
            return (Criteria) this;
        }

        public Criteria andProductPictureGreaterThanOrEqualTo(String value) {
            addCriterion("product_picture >=", value, "productPicture");
            return (Criteria) this;
        }

        public Criteria andProductPictureLessThan(String value) {
            addCriterion("product_picture <", value, "productPicture");
            return (Criteria) this;
        }

        public Criteria andProductPictureLessThanOrEqualTo(String value) {
            addCriterion("product_picture <=", value, "productPicture");
            return (Criteria) this;
        }

        public Criteria andProductPictureLike(String value) {
            addCriterion("product_picture like", value, "productPicture");
            return (Criteria) this;
        }

        public Criteria andProductPictureNotLike(String value) {
            addCriterion("product_picture not like", value, "productPicture");
            return (Criteria) this;
        }

        public Criteria andProductPictureIn(List<String> values) {
            addCriterion("product_picture in", values, "productPicture");
            return (Criteria) this;
        }

        public Criteria andProductPictureNotIn(List<String> values) {
            addCriterion("product_picture not in", values, "productPicture");
            return (Criteria) this;
        }

        public Criteria andProductPictureBetween(String value1, String value2) {
            addCriterion("product_picture between", value1, value2, "productPicture");
            return (Criteria) this;
        }

        public Criteria andProductPictureNotBetween(String value1, String value2) {
            addCriterion("product_picture not between", value1, value2, "productPicture");
            return (Criteria) this;
        }

        public Criteria andApprovalNumberIsNull() {
            addCriterion("approval_number is null");
            return (Criteria) this;
        }

        public Criteria andApprovalNumberIsNotNull() {
            addCriterion("approval_number is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalNumberEqualTo(String value) {
            addCriterion("approval_number =", value, "approvalNumber");
            return (Criteria) this;
        }

        public Criteria andApprovalNumberNotEqualTo(String value) {
            addCriterion("approval_number <>", value, "approvalNumber");
            return (Criteria) this;
        }

        public Criteria andApprovalNumberGreaterThan(String value) {
            addCriterion("approval_number >", value, "approvalNumber");
            return (Criteria) this;
        }

        public Criteria andApprovalNumberGreaterThanOrEqualTo(String value) {
            addCriterion("approval_number >=", value, "approvalNumber");
            return (Criteria) this;
        }

        public Criteria andApprovalNumberLessThan(String value) {
            addCriterion("approval_number <", value, "approvalNumber");
            return (Criteria) this;
        }

        public Criteria andApprovalNumberLessThanOrEqualTo(String value) {
            addCriterion("approval_number <=", value, "approvalNumber");
            return (Criteria) this;
        }

        public Criteria andApprovalNumberLike(String value) {
            addCriterion("approval_number like", value, "approvalNumber");
            return (Criteria) this;
        }

        public Criteria andApprovalNumberNotLike(String value) {
            addCriterion("approval_number not like", value, "approvalNumber");
            return (Criteria) this;
        }

        public Criteria andApprovalNumberIn(List<String> values) {
            addCriterion("approval_number in", values, "approvalNumber");
            return (Criteria) this;
        }

        public Criteria andApprovalNumberNotIn(List<String> values) {
            addCriterion("approval_number not in", values, "approvalNumber");
            return (Criteria) this;
        }

        public Criteria andApprovalNumberBetween(String value1, String value2) {
            addCriterion("approval_number between", value1, value2, "approvalNumber");
            return (Criteria) this;
        }

        public Criteria andApprovalNumberNotBetween(String value1, String value2) {
            addCriterion("approval_number not between", value1, value2, "approvalNumber");
            return (Criteria) this;
        }

        public Criteria andValidityOfApprovalNumberIsNull() {
            addCriterion("validity_of_approval_number is null");
            return (Criteria) this;
        }

        public Criteria andValidityOfApprovalNumberIsNotNull() {
            addCriterion("validity_of_approval_number is not null");
            return (Criteria) this;
        }

        public Criteria andValidityOfApprovalNumberEqualTo(String value) {
            addCriterion("validity_of_approval_number =", value, "validityOfApprovalNumber");
            return (Criteria) this;
        }

        public Criteria andValidityOfApprovalNumberNotEqualTo(String value) {
            addCriterion("validity_of_approval_number <>", value, "validityOfApprovalNumber");
            return (Criteria) this;
        }

        public Criteria andValidityOfApprovalNumberGreaterThan(String value) {
            addCriterion("validity_of_approval_number >", value, "validityOfApprovalNumber");
            return (Criteria) this;
        }

        public Criteria andValidityOfApprovalNumberGreaterThanOrEqualTo(String value) {
            addCriterion("validity_of_approval_number >=", value, "validityOfApprovalNumber");
            return (Criteria) this;
        }

        public Criteria andValidityOfApprovalNumberLessThan(String value) {
            addCriterion("validity_of_approval_number <", value, "validityOfApprovalNumber");
            return (Criteria) this;
        }

        public Criteria andValidityOfApprovalNumberLessThanOrEqualTo(String value) {
            addCriterion("validity_of_approval_number <=", value, "validityOfApprovalNumber");
            return (Criteria) this;
        }

        public Criteria andValidityOfApprovalNumberLike(String value) {
            addCriterion("validity_of_approval_number like", value, "validityOfApprovalNumber");
            return (Criteria) this;
        }

        public Criteria andValidityOfApprovalNumberNotLike(String value) {
            addCriterion("validity_of_approval_number not like", value, "validityOfApprovalNumber");
            return (Criteria) this;
        }

        public Criteria andValidityOfApprovalNumberIn(List<String> values) {
            addCriterion("validity_of_approval_number in", values, "validityOfApprovalNumber");
            return (Criteria) this;
        }

        public Criteria andValidityOfApprovalNumberNotIn(List<String> values) {
            addCriterion("validity_of_approval_number not in", values, "validityOfApprovalNumber");
            return (Criteria) this;
        }

        public Criteria andValidityOfApprovalNumberBetween(String value1, String value2) {
            addCriterion("validity_of_approval_number between", value1, value2, "validityOfApprovalNumber");
            return (Criteria) this;
        }

        public Criteria andValidityOfApprovalNumberNotBetween(String value1, String value2) {
            addCriterion("validity_of_approval_number not between", value1, value2, "validityOfApprovalNumber");
            return (Criteria) this;
        }

        public Criteria andImportedDrugIsNull() {
            addCriterion("imported_drug is null");
            return (Criteria) this;
        }

        public Criteria andImportedDrugIsNotNull() {
            addCriterion("imported_drug is not null");
            return (Criteria) this;
        }

        public Criteria andImportedDrugEqualTo(Integer value) {
            addCriterion("imported_drug =", value, "importedDrug");
            return (Criteria) this;
        }

        public Criteria andImportedDrugNotEqualTo(Integer value) {
            addCriterion("imported_drug <>", value, "importedDrug");
            return (Criteria) this;
        }

        public Criteria andImportedDrugGreaterThan(Integer value) {
            addCriterion("imported_drug >", value, "importedDrug");
            return (Criteria) this;
        }

        public Criteria andImportedDrugGreaterThanOrEqualTo(Integer value) {
            addCriterion("imported_drug >=", value, "importedDrug");
            return (Criteria) this;
        }

        public Criteria andImportedDrugLessThan(Integer value) {
            addCriterion("imported_drug <", value, "importedDrug");
            return (Criteria) this;
        }

        public Criteria andImportedDrugLessThanOrEqualTo(Integer value) {
            addCriterion("imported_drug <=", value, "importedDrug");
            return (Criteria) this;
        }

        public Criteria andImportedDrugIn(List<Integer> values) {
            addCriterion("imported_drug in", values, "importedDrug");
            return (Criteria) this;
        }

        public Criteria andImportedDrugNotIn(List<Integer> values) {
            addCriterion("imported_drug not in", values, "importedDrug");
            return (Criteria) this;
        }

        public Criteria andImportedDrugBetween(Integer value1, Integer value2) {
            addCriterion("imported_drug between", value1, value2, "importedDrug");
            return (Criteria) this;
        }

        public Criteria andImportedDrugNotBetween(Integer value1, Integer value2) {
            addCriterion("imported_drug not between", value1, value2, "importedDrug");
            return (Criteria) this;
        }

        public Criteria andPackagingMaterialIsNull() {
            addCriterion("packaging_material is null");
            return (Criteria) this;
        }

        public Criteria andPackagingMaterialIsNotNull() {
            addCriterion("packaging_material is not null");
            return (Criteria) this;
        }

        public Criteria andPackagingMaterialEqualTo(String value) {
            addCriterion("packaging_material =", value, "packagingMaterial");
            return (Criteria) this;
        }

        public Criteria andPackagingMaterialNotEqualTo(String value) {
            addCriterion("packaging_material <>", value, "packagingMaterial");
            return (Criteria) this;
        }

        public Criteria andPackagingMaterialGreaterThan(String value) {
            addCriterion("packaging_material >", value, "packagingMaterial");
            return (Criteria) this;
        }

        public Criteria andPackagingMaterialGreaterThanOrEqualTo(String value) {
            addCriterion("packaging_material >=", value, "packagingMaterial");
            return (Criteria) this;
        }

        public Criteria andPackagingMaterialLessThan(String value) {
            addCriterion("packaging_material <", value, "packagingMaterial");
            return (Criteria) this;
        }

        public Criteria andPackagingMaterialLessThanOrEqualTo(String value) {
            addCriterion("packaging_material <=", value, "packagingMaterial");
            return (Criteria) this;
        }

        public Criteria andPackagingMaterialLike(String value) {
            addCriterion("packaging_material like", value, "packagingMaterial");
            return (Criteria) this;
        }

        public Criteria andPackagingMaterialNotLike(String value) {
            addCriterion("packaging_material not like", value, "packagingMaterial");
            return (Criteria) this;
        }

        public Criteria andPackagingMaterialIn(List<String> values) {
            addCriterion("packaging_material in", values, "packagingMaterial");
            return (Criteria) this;
        }

        public Criteria andPackagingMaterialNotIn(List<String> values) {
            addCriterion("packaging_material not in", values, "packagingMaterial");
            return (Criteria) this;
        }

        public Criteria andPackagingMaterialBetween(String value1, String value2) {
            addCriterion("packaging_material between", value1, value2, "packagingMaterial");
            return (Criteria) this;
        }

        public Criteria andPackagingMaterialNotBetween(String value1, String value2) {
            addCriterion("packaging_material not between", value1, value2, "packagingMaterial");
            return (Criteria) this;
        }

        public Criteria andPackingUnitIsNull() {
            addCriterion("packing_unit is null");
            return (Criteria) this;
        }

        public Criteria andPackingUnitIsNotNull() {
            addCriterion("packing_unit is not null");
            return (Criteria) this;
        }

        public Criteria andPackingUnitEqualTo(String value) {
            addCriterion("packing_unit =", value, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitNotEqualTo(String value) {
            addCriterion("packing_unit <>", value, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitGreaterThan(String value) {
            addCriterion("packing_unit >", value, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitGreaterThanOrEqualTo(String value) {
            addCriterion("packing_unit >=", value, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitLessThan(String value) {
            addCriterion("packing_unit <", value, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitLessThanOrEqualTo(String value) {
            addCriterion("packing_unit <=", value, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitLike(String value) {
            addCriterion("packing_unit like", value, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitNotLike(String value) {
            addCriterion("packing_unit not like", value, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitIn(List<String> values) {
            addCriterion("packing_unit in", values, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitNotIn(List<String> values) {
            addCriterion("packing_unit not in", values, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitBetween(String value1, String value2) {
            addCriterion("packing_unit between", value1, value2, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitNotBetween(String value1, String value2) {
            addCriterion("packing_unit not between", value1, value2, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andLatestRetailPriceIsNull() {
            addCriterion("latest_retail_price is null");
            return (Criteria) this;
        }

        public Criteria andLatestRetailPriceIsNotNull() {
            addCriterion("latest_retail_price is not null");
            return (Criteria) this;
        }

        public Criteria andLatestRetailPriceEqualTo(Float value) {
            addCriterion("latest_retail_price =", value, "latestRetailPrice");
            return (Criteria) this;
        }

        public Criteria andLatestRetailPriceNotEqualTo(Float value) {
            addCriterion("latest_retail_price <>", value, "latestRetailPrice");
            return (Criteria) this;
        }

        public Criteria andLatestRetailPriceGreaterThan(Float value) {
            addCriterion("latest_retail_price >", value, "latestRetailPrice");
            return (Criteria) this;
        }

        public Criteria andLatestRetailPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("latest_retail_price >=", value, "latestRetailPrice");
            return (Criteria) this;
        }

        public Criteria andLatestRetailPriceLessThan(Float value) {
            addCriterion("latest_retail_price <", value, "latestRetailPrice");
            return (Criteria) this;
        }

        public Criteria andLatestRetailPriceLessThanOrEqualTo(Float value) {
            addCriterion("latest_retail_price <=", value, "latestRetailPrice");
            return (Criteria) this;
        }

        public Criteria andLatestRetailPriceIn(List<Float> values) {
            addCriterion("latest_retail_price in", values, "latestRetailPrice");
            return (Criteria) this;
        }

        public Criteria andLatestRetailPriceNotIn(List<Float> values) {
            addCriterion("latest_retail_price not in", values, "latestRetailPrice");
            return (Criteria) this;
        }

        public Criteria andLatestRetailPriceBetween(Float value1, Float value2) {
            addCriterion("latest_retail_price between", value1, value2, "latestRetailPrice");
            return (Criteria) this;
        }

        public Criteria andLatestRetailPriceNotBetween(Float value1, Float value2) {
            addCriterion("latest_retail_price not between", value1, value2, "latestRetailPrice");
            return (Criteria) this;
        }

        public Criteria andSourceOfRetailPriceIsNull() {
            addCriterion("source_of_retail_price is null");
            return (Criteria) this;
        }

        public Criteria andSourceOfRetailPriceIsNotNull() {
            addCriterion("source_of_retail_price is not null");
            return (Criteria) this;
        }

        public Criteria andSourceOfRetailPriceEqualTo(String value) {
            addCriterion("source_of_retail_price =", value, "sourceOfRetailPrice");
            return (Criteria) this;
        }

        public Criteria andSourceOfRetailPriceNotEqualTo(String value) {
            addCriterion("source_of_retail_price <>", value, "sourceOfRetailPrice");
            return (Criteria) this;
        }

        public Criteria andSourceOfRetailPriceGreaterThan(String value) {
            addCriterion("source_of_retail_price >", value, "sourceOfRetailPrice");
            return (Criteria) this;
        }

        public Criteria andSourceOfRetailPriceGreaterThanOrEqualTo(String value) {
            addCriterion("source_of_retail_price >=", value, "sourceOfRetailPrice");
            return (Criteria) this;
        }

        public Criteria andSourceOfRetailPriceLessThan(String value) {
            addCriterion("source_of_retail_price <", value, "sourceOfRetailPrice");
            return (Criteria) this;
        }

        public Criteria andSourceOfRetailPriceLessThanOrEqualTo(String value) {
            addCriterion("source_of_retail_price <=", value, "sourceOfRetailPrice");
            return (Criteria) this;
        }

        public Criteria andSourceOfRetailPriceLike(String value) {
            addCriterion("source_of_retail_price like", value, "sourceOfRetailPrice");
            return (Criteria) this;
        }

        public Criteria andSourceOfRetailPriceNotLike(String value) {
            addCriterion("source_of_retail_price not like", value, "sourceOfRetailPrice");
            return (Criteria) this;
        }

        public Criteria andSourceOfRetailPriceIn(List<String> values) {
            addCriterion("source_of_retail_price in", values, "sourceOfRetailPrice");
            return (Criteria) this;
        }

        public Criteria andSourceOfRetailPriceNotIn(List<String> values) {
            addCriterion("source_of_retail_price not in", values, "sourceOfRetailPrice");
            return (Criteria) this;
        }

        public Criteria andSourceOfRetailPriceBetween(String value1, String value2) {
            addCriterion("source_of_retail_price between", value1, value2, "sourceOfRetailPrice");
            return (Criteria) this;
        }

        public Criteria andSourceOfRetailPriceNotBetween(String value1, String value2) {
            addCriterion("source_of_retail_price not between", value1, value2, "sourceOfRetailPrice");
            return (Criteria) this;
        }

        public Criteria andQualityLevelIdIsNull() {
            addCriterion("quality_level_id is null");
            return (Criteria) this;
        }

        public Criteria andQualityLevelIdIsNotNull() {
            addCriterion("quality_level_id is not null");
            return (Criteria) this;
        }

        public Criteria andQualityLevelIdEqualTo(Integer value) {
            addCriterion("quality_level_id =", value, "qualityLevelId");
            return (Criteria) this;
        }

        public Criteria andQualityLevelIdNotEqualTo(Integer value) {
            addCriterion("quality_level_id <>", value, "qualityLevelId");
            return (Criteria) this;
        }

        public Criteria andQualityLevelIdGreaterThan(Integer value) {
            addCriterion("quality_level_id >", value, "qualityLevelId");
            return (Criteria) this;
        }

        public Criteria andQualityLevelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("quality_level_id >=", value, "qualityLevelId");
            return (Criteria) this;
        }

        public Criteria andQualityLevelIdLessThan(Integer value) {
            addCriterion("quality_level_id <", value, "qualityLevelId");
            return (Criteria) this;
        }

        public Criteria andQualityLevelIdLessThanOrEqualTo(Integer value) {
            addCriterion("quality_level_id <=", value, "qualityLevelId");
            return (Criteria) this;
        }

        public Criteria andQualityLevelIdIn(List<Integer> values) {
            addCriterion("quality_level_id in", values, "qualityLevelId");
            return (Criteria) this;
        }

        public Criteria andQualityLevelIdNotIn(List<Integer> values) {
            addCriterion("quality_level_id not in", values, "qualityLevelId");
            return (Criteria) this;
        }

        public Criteria andQualityLevelIdBetween(Integer value1, Integer value2) {
            addCriterion("quality_level_id between", value1, value2, "qualityLevelId");
            return (Criteria) this;
        }

        public Criteria andQualityLevelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("quality_level_id not between", value1, value2, "qualityLevelId");
            return (Criteria) this;
        }

        public Criteria andQualityLevelDescriptionIsNull() {
            addCriterion("quality_level_description is null");
            return (Criteria) this;
        }

        public Criteria andQualityLevelDescriptionIsNotNull() {
            addCriterion("quality_level_description is not null");
            return (Criteria) this;
        }

        public Criteria andQualityLevelDescriptionEqualTo(String value) {
            addCriterion("quality_level_description =", value, "qualityLevelDescription");
            return (Criteria) this;
        }

        public Criteria andQualityLevelDescriptionNotEqualTo(String value) {
            addCriterion("quality_level_description <>", value, "qualityLevelDescription");
            return (Criteria) this;
        }

        public Criteria andQualityLevelDescriptionGreaterThan(String value) {
            addCriterion("quality_level_description >", value, "qualityLevelDescription");
            return (Criteria) this;
        }

        public Criteria andQualityLevelDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("quality_level_description >=", value, "qualityLevelDescription");
            return (Criteria) this;
        }

        public Criteria andQualityLevelDescriptionLessThan(String value) {
            addCriterion("quality_level_description <", value, "qualityLevelDescription");
            return (Criteria) this;
        }

        public Criteria andQualityLevelDescriptionLessThanOrEqualTo(String value) {
            addCriterion("quality_level_description <=", value, "qualityLevelDescription");
            return (Criteria) this;
        }

        public Criteria andQualityLevelDescriptionLike(String value) {
            addCriterion("quality_level_description like", value, "qualityLevelDescription");
            return (Criteria) this;
        }

        public Criteria andQualityLevelDescriptionNotLike(String value) {
            addCriterion("quality_level_description not like", value, "qualityLevelDescription");
            return (Criteria) this;
        }

        public Criteria andQualityLevelDescriptionIn(List<String> values) {
            addCriterion("quality_level_description in", values, "qualityLevelDescription");
            return (Criteria) this;
        }

        public Criteria andQualityLevelDescriptionNotIn(List<String> values) {
            addCriterion("quality_level_description not in", values, "qualityLevelDescription");
            return (Criteria) this;
        }

        public Criteria andQualityLevelDescriptionBetween(String value1, String value2) {
            addCriterion("quality_level_description between", value1, value2, "qualityLevelDescription");
            return (Criteria) this;
        }

        public Criteria andQualityLevelDescriptionNotBetween(String value1, String value2) {
            addCriterion("quality_level_description not between", value1, value2, "qualityLevelDescription");
            return (Criteria) this;
        }

        public Criteria andDrugInspectionReportIsNull() {
            addCriterion("drug_inspection_report is null");
            return (Criteria) this;
        }

        public Criteria andDrugInspectionReportIsNotNull() {
            addCriterion("drug_inspection_report is not null");
            return (Criteria) this;
        }

        public Criteria andDrugInspectionReportEqualTo(Integer value) {
            addCriterion("drug_inspection_report =", value, "drugInspectionReport");
            return (Criteria) this;
        }

        public Criteria andDrugInspectionReportNotEqualTo(Integer value) {
            addCriterion("drug_inspection_report <>", value, "drugInspectionReport");
            return (Criteria) this;
        }

        public Criteria andDrugInspectionReportGreaterThan(Integer value) {
            addCriterion("drug_inspection_report >", value, "drugInspectionReport");
            return (Criteria) this;
        }

        public Criteria andDrugInspectionReportGreaterThanOrEqualTo(Integer value) {
            addCriterion("drug_inspection_report >=", value, "drugInspectionReport");
            return (Criteria) this;
        }

        public Criteria andDrugInspectionReportLessThan(Integer value) {
            addCriterion("drug_inspection_report <", value, "drugInspectionReport");
            return (Criteria) this;
        }

        public Criteria andDrugInspectionReportLessThanOrEqualTo(Integer value) {
            addCriterion("drug_inspection_report <=", value, "drugInspectionReport");
            return (Criteria) this;
        }

        public Criteria andDrugInspectionReportIn(List<Integer> values) {
            addCriterion("drug_inspection_report in", values, "drugInspectionReport");
            return (Criteria) this;
        }

        public Criteria andDrugInspectionReportNotIn(List<Integer> values) {
            addCriterion("drug_inspection_report not in", values, "drugInspectionReport");
            return (Criteria) this;
        }

        public Criteria andDrugInspectionReportBetween(Integer value1, Integer value2) {
            addCriterion("drug_inspection_report between", value1, value2, "drugInspectionReport");
            return (Criteria) this;
        }

        public Criteria andDrugInspectionReportNotBetween(Integer value1, Integer value2) {
            addCriterion("drug_inspection_report not between", value1, value2, "drugInspectionReport");
            return (Criteria) this;
        }

        public Criteria andDrugInspectionReportNumberIsNull() {
            addCriterion("drug_inspection_report_number is null");
            return (Criteria) this;
        }

        public Criteria andDrugInspectionReportNumberIsNotNull() {
            addCriterion("drug_inspection_report_number is not null");
            return (Criteria) this;
        }

        public Criteria andDrugInspectionReportNumberEqualTo(String value) {
            addCriterion("drug_inspection_report_number =", value, "drugInspectionReportNumber");
            return (Criteria) this;
        }

        public Criteria andDrugInspectionReportNumberNotEqualTo(String value) {
            addCriterion("drug_inspection_report_number <>", value, "drugInspectionReportNumber");
            return (Criteria) this;
        }

        public Criteria andDrugInspectionReportNumberGreaterThan(String value) {
            addCriterion("drug_inspection_report_number >", value, "drugInspectionReportNumber");
            return (Criteria) this;
        }

        public Criteria andDrugInspectionReportNumberGreaterThanOrEqualTo(String value) {
            addCriterion("drug_inspection_report_number >=", value, "drugInspectionReportNumber");
            return (Criteria) this;
        }

        public Criteria andDrugInspectionReportNumberLessThan(String value) {
            addCriterion("drug_inspection_report_number <", value, "drugInspectionReportNumber");
            return (Criteria) this;
        }

        public Criteria andDrugInspectionReportNumberLessThanOrEqualTo(String value) {
            addCriterion("drug_inspection_report_number <=", value, "drugInspectionReportNumber");
            return (Criteria) this;
        }

        public Criteria andDrugInspectionReportNumberLike(String value) {
            addCriterion("drug_inspection_report_number like", value, "drugInspectionReportNumber");
            return (Criteria) this;
        }

        public Criteria andDrugInspectionReportNumberNotLike(String value) {
            addCriterion("drug_inspection_report_number not like", value, "drugInspectionReportNumber");
            return (Criteria) this;
        }

        public Criteria andDrugInspectionReportNumberIn(List<String> values) {
            addCriterion("drug_inspection_report_number in", values, "drugInspectionReportNumber");
            return (Criteria) this;
        }

        public Criteria andDrugInspectionReportNumberNotIn(List<String> values) {
            addCriterion("drug_inspection_report_number not in", values, "drugInspectionReportNumber");
            return (Criteria) this;
        }

        public Criteria andDrugInspectionReportNumberBetween(String value1, String value2) {
            addCriterion("drug_inspection_report_number between", value1, value2, "drugInspectionReportNumber");
            return (Criteria) this;
        }

        public Criteria andDrugInspectionReportNumberNotBetween(String value1, String value2) {
            addCriterion("drug_inspection_report_number not between", value1, value2, "drugInspectionReportNumber");
            return (Criteria) this;
        }

        public Criteria andValidityOfDrugInspectionReportIsNull() {
            addCriterion("validity_of_drug_inspection_report is null");
            return (Criteria) this;
        }

        public Criteria andValidityOfDrugInspectionReportIsNotNull() {
            addCriterion("validity_of_drug_inspection_report is not null");
            return (Criteria) this;
        }

        public Criteria andValidityOfDrugInspectionReportEqualTo(Date value) {
            addCriterionForJDBCDate("validity_of_drug_inspection_report =", value, "validityOfDrugInspectionReport");
            return (Criteria) this;
        }

        public Criteria andValidityOfDrugInspectionReportNotEqualTo(Date value) {
            addCriterionForJDBCDate("validity_of_drug_inspection_report <>", value, "validityOfDrugInspectionReport");
            return (Criteria) this;
        }

        public Criteria andValidityOfDrugInspectionReportGreaterThan(Date value) {
            addCriterionForJDBCDate("validity_of_drug_inspection_report >", value, "validityOfDrugInspectionReport");
            return (Criteria) this;
        }

        public Criteria andValidityOfDrugInspectionReportGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("validity_of_drug_inspection_report >=", value, "validityOfDrugInspectionReport");
            return (Criteria) this;
        }

        public Criteria andValidityOfDrugInspectionReportLessThan(Date value) {
            addCriterionForJDBCDate("validity_of_drug_inspection_report <", value, "validityOfDrugInspectionReport");
            return (Criteria) this;
        }

        public Criteria andValidityOfDrugInspectionReportLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("validity_of_drug_inspection_report <=", value, "validityOfDrugInspectionReport");
            return (Criteria) this;
        }

        public Criteria andValidityOfDrugInspectionReportIn(List<Date> values) {
            addCriterionForJDBCDate("validity_of_drug_inspection_report in", values, "validityOfDrugInspectionReport");
            return (Criteria) this;
        }

        public Criteria andValidityOfDrugInspectionReportNotIn(List<Date> values) {
            addCriterionForJDBCDate("validity_of_drug_inspection_report not in", values, "validityOfDrugInspectionReport");
            return (Criteria) this;
        }

        public Criteria andValidityOfDrugInspectionReportBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("validity_of_drug_inspection_report between", value1, value2, "validityOfDrugInspectionReport");
            return (Criteria) this;
        }

        public Criteria andValidityOfDrugInspectionReportNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("validity_of_drug_inspection_report not between", value1, value2, "validityOfDrugInspectionReport");
            return (Criteria) this;
        }

        public Criteria andDescriptionOfProductsIsNull() {
            addCriterion("description_of_products is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionOfProductsIsNotNull() {
            addCriterion("description_of_products is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionOfProductsEqualTo(String value) {
            addCriterion("description_of_products =", value, "descriptionOfProducts");
            return (Criteria) this;
        }

        public Criteria andDescriptionOfProductsNotEqualTo(String value) {
            addCriterion("description_of_products <>", value, "descriptionOfProducts");
            return (Criteria) this;
        }

        public Criteria andDescriptionOfProductsGreaterThan(String value) {
            addCriterion("description_of_products >", value, "descriptionOfProducts");
            return (Criteria) this;
        }

        public Criteria andDescriptionOfProductsGreaterThanOrEqualTo(String value) {
            addCriterion("description_of_products >=", value, "descriptionOfProducts");
            return (Criteria) this;
        }

        public Criteria andDescriptionOfProductsLessThan(String value) {
            addCriterion("description_of_products <", value, "descriptionOfProducts");
            return (Criteria) this;
        }

        public Criteria andDescriptionOfProductsLessThanOrEqualTo(String value) {
            addCriterion("description_of_products <=", value, "descriptionOfProducts");
            return (Criteria) this;
        }

        public Criteria andDescriptionOfProductsLike(String value) {
            addCriterion("description_of_products like", value, "descriptionOfProducts");
            return (Criteria) this;
        }

        public Criteria andDescriptionOfProductsNotLike(String value) {
            addCriterion("description_of_products not like", value, "descriptionOfProducts");
            return (Criteria) this;
        }

        public Criteria andDescriptionOfProductsIn(List<String> values) {
            addCriterion("description_of_products in", values, "descriptionOfProducts");
            return (Criteria) this;
        }

        public Criteria andDescriptionOfProductsNotIn(List<String> values) {
            addCriterion("description_of_products not in", values, "descriptionOfProducts");
            return (Criteria) this;
        }

        public Criteria andDescriptionOfProductsBetween(String value1, String value2) {
            addCriterion("description_of_products between", value1, value2, "descriptionOfProducts");
            return (Criteria) this;
        }

        public Criteria andDescriptionOfProductsNotBetween(String value1, String value2) {
            addCriterion("description_of_products not between", value1, value2, "descriptionOfProducts");
            return (Criteria) this;
        }

        public Criteria andDrugCategoryIdIsNull() {
            addCriterion("drug_category_id is null");
            return (Criteria) this;
        }

        public Criteria andDrugCategoryIdIsNotNull() {
            addCriterion("drug_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andDrugCategoryIdEqualTo(Integer value) {
            addCriterion("drug_category_id =", value, "drugCategoryId");
            return (Criteria) this;
        }

        public Criteria andDrugCategoryIdNotEqualTo(Integer value) {
            addCriterion("drug_category_id <>", value, "drugCategoryId");
            return (Criteria) this;
        }

        public Criteria andDrugCategoryIdGreaterThan(Integer value) {
            addCriterion("drug_category_id >", value, "drugCategoryId");
            return (Criteria) this;
        }

        public Criteria andDrugCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("drug_category_id >=", value, "drugCategoryId");
            return (Criteria) this;
        }

        public Criteria andDrugCategoryIdLessThan(Integer value) {
            addCriterion("drug_category_id <", value, "drugCategoryId");
            return (Criteria) this;
        }

        public Criteria andDrugCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("drug_category_id <=", value, "drugCategoryId");
            return (Criteria) this;
        }

        public Criteria andDrugCategoryIdIn(List<Integer> values) {
            addCriterion("drug_category_id in", values, "drugCategoryId");
            return (Criteria) this;
        }

        public Criteria andDrugCategoryIdNotIn(List<Integer> values) {
            addCriterion("drug_category_id not in", values, "drugCategoryId");
            return (Criteria) this;
        }

        public Criteria andDrugCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("drug_category_id between", value1, value2, "drugCategoryId");
            return (Criteria) this;
        }

        public Criteria andDrugCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("drug_category_id not between", value1, value2, "drugCategoryId");
            return (Criteria) this;
        }

        public Criteria andDrugTransactionStatusIdIsNull() {
            addCriterion("drug_transaction_status_id is null");
            return (Criteria) this;
        }

        public Criteria andDrugTransactionStatusIdIsNotNull() {
            addCriterion("drug_transaction_status_id is not null");
            return (Criteria) this;
        }

        public Criteria andDrugTransactionStatusIdEqualTo(Integer value) {
            addCriterion("drug_transaction_status_id =", value, "drugTransactionStatusId");
            return (Criteria) this;
        }

        public Criteria andDrugTransactionStatusIdNotEqualTo(Integer value) {
            addCriterion("drug_transaction_status_id <>", value, "drugTransactionStatusId");
            return (Criteria) this;
        }

        public Criteria andDrugTransactionStatusIdGreaterThan(Integer value) {
            addCriterion("drug_transaction_status_id >", value, "drugTransactionStatusId");
            return (Criteria) this;
        }

        public Criteria andDrugTransactionStatusIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("drug_transaction_status_id >=", value, "drugTransactionStatusId");
            return (Criteria) this;
        }

        public Criteria andDrugTransactionStatusIdLessThan(Integer value) {
            addCriterion("drug_transaction_status_id <", value, "drugTransactionStatusId");
            return (Criteria) this;
        }

        public Criteria andDrugTransactionStatusIdLessThanOrEqualTo(Integer value) {
            addCriterion("drug_transaction_status_id <=", value, "drugTransactionStatusId");
            return (Criteria) this;
        }

        public Criteria andDrugTransactionStatusIdIn(List<Integer> values) {
            addCriterion("drug_transaction_status_id in", values, "drugTransactionStatusId");
            return (Criteria) this;
        }

        public Criteria andDrugTransactionStatusIdNotIn(List<Integer> values) {
            addCriterion("drug_transaction_status_id not in", values, "drugTransactionStatusId");
            return (Criteria) this;
        }

        public Criteria andDrugTransactionStatusIdBetween(Integer value1, Integer value2) {
            addCriterion("drug_transaction_status_id between", value1, value2, "drugTransactionStatusId");
            return (Criteria) this;
        }

        public Criteria andDrugTransactionStatusIdNotBetween(Integer value1, Integer value2) {
            addCriterion("drug_transaction_status_id not between", value1, value2, "drugTransactionStatusId");
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