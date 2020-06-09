package com.ygjy.supplymanagement.pojo;

import java.util.ArrayList;
import java.util.List;

public class HospitalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public HospitalExample() {
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

        public Criteria andHospitalNameIsNull() {
            addCriterion("hospital_name is null");
            return (Criteria) this;
        }

        public Criteria andHospitalNameIsNotNull() {
            addCriterion("hospital_name is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalNameEqualTo(String value) {
            addCriterion("hospital_name =", value, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameNotEqualTo(String value) {
            addCriterion("hospital_name <>", value, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameGreaterThan(String value) {
            addCriterion("hospital_name >", value, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameGreaterThanOrEqualTo(String value) {
            addCriterion("hospital_name >=", value, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameLessThan(String value) {
            addCriterion("hospital_name <", value, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameLessThanOrEqualTo(String value) {
            addCriterion("hospital_name <=", value, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameLike(String value) {
            addCriterion("hospital_name like", value, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameNotLike(String value) {
            addCriterion("hospital_name not like", value, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameIn(List<String> values) {
            addCriterion("hospital_name in", values, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameNotIn(List<String> values) {
            addCriterion("hospital_name not in", values, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameBetween(String value1, String value2) {
            addCriterion("hospital_name between", value1, value2, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameNotBetween(String value1, String value2) {
            addCriterion("hospital_name not between", value1, value2, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andPostalAddressIsNull() {
            addCriterion("postal_address is null");
            return (Criteria) this;
        }

        public Criteria andPostalAddressIsNotNull() {
            addCriterion("postal_address is not null");
            return (Criteria) this;
        }

        public Criteria andPostalAddressEqualTo(String value) {
            addCriterion("postal_address =", value, "postalAddress");
            return (Criteria) this;
        }

        public Criteria andPostalAddressNotEqualTo(String value) {
            addCriterion("postal_address <>", value, "postalAddress");
            return (Criteria) this;
        }

        public Criteria andPostalAddressGreaterThan(String value) {
            addCriterion("postal_address >", value, "postalAddress");
            return (Criteria) this;
        }

        public Criteria andPostalAddressGreaterThanOrEqualTo(String value) {
            addCriterion("postal_address >=", value, "postalAddress");
            return (Criteria) this;
        }

        public Criteria andPostalAddressLessThan(String value) {
            addCriterion("postal_address <", value, "postalAddress");
            return (Criteria) this;
        }

        public Criteria andPostalAddressLessThanOrEqualTo(String value) {
            addCriterion("postal_address <=", value, "postalAddress");
            return (Criteria) this;
        }

        public Criteria andPostalAddressLike(String value) {
            addCriterion("postal_address like", value, "postalAddress");
            return (Criteria) this;
        }

        public Criteria andPostalAddressNotLike(String value) {
            addCriterion("postal_address not like", value, "postalAddress");
            return (Criteria) this;
        }

        public Criteria andPostalAddressIn(List<String> values) {
            addCriterion("postal_address in", values, "postalAddress");
            return (Criteria) this;
        }

        public Criteria andPostalAddressNotIn(List<String> values) {
            addCriterion("postal_address not in", values, "postalAddress");
            return (Criteria) this;
        }

        public Criteria andPostalAddressBetween(String value1, String value2) {
            addCriterion("postal_address between", value1, value2, "postalAddress");
            return (Criteria) this;
        }

        public Criteria andPostalAddressNotBetween(String value1, String value2) {
            addCriterion("postal_address not between", value1, value2, "postalAddress");
            return (Criteria) this;
        }

        public Criteria andPostalCodeIsNull() {
            addCriterion("postal_Code is null");
            return (Criteria) this;
        }

        public Criteria andPostalCodeIsNotNull() {
            addCriterion("postal_Code is not null");
            return (Criteria) this;
        }

        public Criteria andPostalCodeEqualTo(String value) {
            addCriterion("postal_Code =", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeNotEqualTo(String value) {
            addCriterion("postal_Code <>", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeGreaterThan(String value) {
            addCriterion("postal_Code >", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeGreaterThanOrEqualTo(String value) {
            addCriterion("postal_Code >=", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeLessThan(String value) {
            addCriterion("postal_Code <", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeLessThanOrEqualTo(String value) {
            addCriterion("postal_Code <=", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeLike(String value) {
            addCriterion("postal_Code like", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeNotLike(String value) {
            addCriterion("postal_Code not like", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeIn(List<String> values) {
            addCriterion("postal_Code in", values, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeNotIn(List<String> values) {
            addCriterion("postal_Code not in", values, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeBetween(String value1, String value2) {
            addCriterion("postal_Code between", value1, value2, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeNotBetween(String value1, String value2) {
            addCriterion("postal_Code not between", value1, value2, "postalCode");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andHospitalLevelIsNull() {
            addCriterion("hospital_level is null");
            return (Criteria) this;
        }

        public Criteria andHospitalLevelIsNotNull() {
            addCriterion("hospital_level is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalLevelEqualTo(String value) {
            addCriterion("hospital_level =", value, "hospitalLevel");
            return (Criteria) this;
        }

        public Criteria andHospitalLevelNotEqualTo(String value) {
            addCriterion("hospital_level <>", value, "hospitalLevel");
            return (Criteria) this;
        }

        public Criteria andHospitalLevelGreaterThan(String value) {
            addCriterion("hospital_level >", value, "hospitalLevel");
            return (Criteria) this;
        }

        public Criteria andHospitalLevelGreaterThanOrEqualTo(String value) {
            addCriterion("hospital_level >=", value, "hospitalLevel");
            return (Criteria) this;
        }

        public Criteria andHospitalLevelLessThan(String value) {
            addCriterion("hospital_level <", value, "hospitalLevel");
            return (Criteria) this;
        }

        public Criteria andHospitalLevelLessThanOrEqualTo(String value) {
            addCriterion("hospital_level <=", value, "hospitalLevel");
            return (Criteria) this;
        }

        public Criteria andHospitalLevelLike(String value) {
            addCriterion("hospital_level like", value, "hospitalLevel");
            return (Criteria) this;
        }

        public Criteria andHospitalLevelNotLike(String value) {
            addCriterion("hospital_level not like", value, "hospitalLevel");
            return (Criteria) this;
        }

        public Criteria andHospitalLevelIn(List<String> values) {
            addCriterion("hospital_level in", values, "hospitalLevel");
            return (Criteria) this;
        }

        public Criteria andHospitalLevelNotIn(List<String> values) {
            addCriterion("hospital_level not in", values, "hospitalLevel");
            return (Criteria) this;
        }

        public Criteria andHospitalLevelBetween(String value1, String value2) {
            addCriterion("hospital_level between", value1, value2, "hospitalLevel");
            return (Criteria) this;
        }

        public Criteria andHospitalLevelNotBetween(String value1, String value2) {
            addCriterion("hospital_level not between", value1, value2, "hospitalLevel");
            return (Criteria) this;
        }

        public Criteria andNumberOfBedsIsNull() {
            addCriterion("number_of_beds is null");
            return (Criteria) this;
        }

        public Criteria andNumberOfBedsIsNotNull() {
            addCriterion("number_of_beds is not null");
            return (Criteria) this;
        }

        public Criteria andNumberOfBedsEqualTo(Integer value) {
            addCriterion("number_of_beds =", value, "numberOfBeds");
            return (Criteria) this;
        }

        public Criteria andNumberOfBedsNotEqualTo(Integer value) {
            addCriterion("number_of_beds <>", value, "numberOfBeds");
            return (Criteria) this;
        }

        public Criteria andNumberOfBedsGreaterThan(Integer value) {
            addCriterion("number_of_beds >", value, "numberOfBeds");
            return (Criteria) this;
        }

        public Criteria andNumberOfBedsGreaterThanOrEqualTo(Integer value) {
            addCriterion("number_of_beds >=", value, "numberOfBeds");
            return (Criteria) this;
        }

        public Criteria andNumberOfBedsLessThan(Integer value) {
            addCriterion("number_of_beds <", value, "numberOfBeds");
            return (Criteria) this;
        }

        public Criteria andNumberOfBedsLessThanOrEqualTo(Integer value) {
            addCriterion("number_of_beds <=", value, "numberOfBeds");
            return (Criteria) this;
        }

        public Criteria andNumberOfBedsIn(List<Integer> values) {
            addCriterion("number_of_beds in", values, "numberOfBeds");
            return (Criteria) this;
        }

        public Criteria andNumberOfBedsNotIn(List<Integer> values) {
            addCriterion("number_of_beds not in", values, "numberOfBeds");
            return (Criteria) this;
        }

        public Criteria andNumberOfBedsBetween(Integer value1, Integer value2) {
            addCriterion("number_of_beds between", value1, value2, "numberOfBeds");
            return (Criteria) this;
        }

        public Criteria andNumberOfBedsNotBetween(Integer value1, Integer value2) {
            addCriterion("number_of_beds not between", value1, value2, "numberOfBeds");
            return (Criteria) this;
        }

        public Criteria andMakeMoneyIsNull() {
            addCriterion("make_money is null");
            return (Criteria) this;
        }

        public Criteria andMakeMoneyIsNotNull() {
            addCriterion("make_money is not null");
            return (Criteria) this;
        }

        public Criteria andMakeMoneyEqualTo(Float value) {
            addCriterion("make_money =", value, "makeMoney");
            return (Criteria) this;
        }

        public Criteria andMakeMoneyNotEqualTo(Float value) {
            addCriterion("make_money <>", value, "makeMoney");
            return (Criteria) this;
        }

        public Criteria andMakeMoneyGreaterThan(Float value) {
            addCriterion("make_money >", value, "makeMoney");
            return (Criteria) this;
        }

        public Criteria andMakeMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("make_money >=", value, "makeMoney");
            return (Criteria) this;
        }

        public Criteria andMakeMoneyLessThan(Float value) {
            addCriterion("make_money <", value, "makeMoney");
            return (Criteria) this;
        }

        public Criteria andMakeMoneyLessThanOrEqualTo(Float value) {
            addCriterion("make_money <=", value, "makeMoney");
            return (Criteria) this;
        }

        public Criteria andMakeMoneyIn(List<Float> values) {
            addCriterion("make_money in", values, "makeMoney");
            return (Criteria) this;
        }

        public Criteria andMakeMoneyNotIn(List<Float> values) {
            addCriterion("make_money not in", values, "makeMoney");
            return (Criteria) this;
        }

        public Criteria andMakeMoneyBetween(Float value1, Float value2) {
            addCriterion("make_money between", value1, value2, "makeMoney");
            return (Criteria) this;
        }

        public Criteria andMakeMoneyNotBetween(Float value1, Float value2) {
            addCriterion("make_money not between", value1, value2, "makeMoney");
            return (Criteria) this;
        }

        public Criteria andHospitalTelephoneIsNull() {
            addCriterion("hospital_telephone is null");
            return (Criteria) this;
        }

        public Criteria andHospitalTelephoneIsNotNull() {
            addCriterion("hospital_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalTelephoneEqualTo(String value) {
            addCriterion("hospital_telephone =", value, "hospitalTelephone");
            return (Criteria) this;
        }

        public Criteria andHospitalTelephoneNotEqualTo(String value) {
            addCriterion("hospital_telephone <>", value, "hospitalTelephone");
            return (Criteria) this;
        }

        public Criteria andHospitalTelephoneGreaterThan(String value) {
            addCriterion("hospital_telephone >", value, "hospitalTelephone");
            return (Criteria) this;
        }

        public Criteria andHospitalTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("hospital_telephone >=", value, "hospitalTelephone");
            return (Criteria) this;
        }

        public Criteria andHospitalTelephoneLessThan(String value) {
            addCriterion("hospital_telephone <", value, "hospitalTelephone");
            return (Criteria) this;
        }

        public Criteria andHospitalTelephoneLessThanOrEqualTo(String value) {
            addCriterion("hospital_telephone <=", value, "hospitalTelephone");
            return (Criteria) this;
        }

        public Criteria andHospitalTelephoneLike(String value) {
            addCriterion("hospital_telephone like", value, "hospitalTelephone");
            return (Criteria) this;
        }

        public Criteria andHospitalTelephoneNotLike(String value) {
            addCriterion("hospital_telephone not like", value, "hospitalTelephone");
            return (Criteria) this;
        }

        public Criteria andHospitalTelephoneIn(List<String> values) {
            addCriterion("hospital_telephone in", values, "hospitalTelephone");
            return (Criteria) this;
        }

        public Criteria andHospitalTelephoneNotIn(List<String> values) {
            addCriterion("hospital_telephone not in", values, "hospitalTelephone");
            return (Criteria) this;
        }

        public Criteria andHospitalTelephoneBetween(String value1, String value2) {
            addCriterion("hospital_telephone between", value1, value2, "hospitalTelephone");
            return (Criteria) this;
        }

        public Criteria andHospitalTelephoneNotBetween(String value1, String value2) {
            addCriterion("hospital_telephone not between", value1, value2, "hospitalTelephone");
            return (Criteria) this;
        }

        public Criteria andHospitalFaxIsNull() {
            addCriterion("hospital_fax is null");
            return (Criteria) this;
        }

        public Criteria andHospitalFaxIsNotNull() {
            addCriterion("hospital_fax is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalFaxEqualTo(String value) {
            addCriterion("hospital_fax =", value, "hospitalFax");
            return (Criteria) this;
        }

        public Criteria andHospitalFaxNotEqualTo(String value) {
            addCriterion("hospital_fax <>", value, "hospitalFax");
            return (Criteria) this;
        }

        public Criteria andHospitalFaxGreaterThan(String value) {
            addCriterion("hospital_fax >", value, "hospitalFax");
            return (Criteria) this;
        }

        public Criteria andHospitalFaxGreaterThanOrEqualTo(String value) {
            addCriterion("hospital_fax >=", value, "hospitalFax");
            return (Criteria) this;
        }

        public Criteria andHospitalFaxLessThan(String value) {
            addCriterion("hospital_fax <", value, "hospitalFax");
            return (Criteria) this;
        }

        public Criteria andHospitalFaxLessThanOrEqualTo(String value) {
            addCriterion("hospital_fax <=", value, "hospitalFax");
            return (Criteria) this;
        }

        public Criteria andHospitalFaxLike(String value) {
            addCriterion("hospital_fax like", value, "hospitalFax");
            return (Criteria) this;
        }

        public Criteria andHospitalFaxNotLike(String value) {
            addCriterion("hospital_fax not like", value, "hospitalFax");
            return (Criteria) this;
        }

        public Criteria andHospitalFaxIn(List<String> values) {
            addCriterion("hospital_fax in", values, "hospitalFax");
            return (Criteria) this;
        }

        public Criteria andHospitalFaxNotIn(List<String> values) {
            addCriterion("hospital_fax not in", values, "hospitalFax");
            return (Criteria) this;
        }

        public Criteria andHospitalFaxBetween(String value1, String value2) {
            addCriterion("hospital_fax between", value1, value2, "hospitalFax");
            return (Criteria) this;
        }

        public Criteria andHospitalFaxNotBetween(String value1, String value2) {
            addCriterion("hospital_fax not between", value1, value2, "hospitalFax");
            return (Criteria) this;
        }

        public Criteria andPharmacyTelephoneIsNull() {
            addCriterion("pharmacy_telephone is null");
            return (Criteria) this;
        }

        public Criteria andPharmacyTelephoneIsNotNull() {
            addCriterion("pharmacy_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andPharmacyTelephoneEqualTo(String value) {
            addCriterion("pharmacy_telephone =", value, "pharmacyTelephone");
            return (Criteria) this;
        }

        public Criteria andPharmacyTelephoneNotEqualTo(String value) {
            addCriterion("pharmacy_telephone <>", value, "pharmacyTelephone");
            return (Criteria) this;
        }

        public Criteria andPharmacyTelephoneGreaterThan(String value) {
            addCriterion("pharmacy_telephone >", value, "pharmacyTelephone");
            return (Criteria) this;
        }

        public Criteria andPharmacyTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("pharmacy_telephone >=", value, "pharmacyTelephone");
            return (Criteria) this;
        }

        public Criteria andPharmacyTelephoneLessThan(String value) {
            addCriterion("pharmacy_telephone <", value, "pharmacyTelephone");
            return (Criteria) this;
        }

        public Criteria andPharmacyTelephoneLessThanOrEqualTo(String value) {
            addCriterion("pharmacy_telephone <=", value, "pharmacyTelephone");
            return (Criteria) this;
        }

        public Criteria andPharmacyTelephoneLike(String value) {
            addCriterion("pharmacy_telephone like", value, "pharmacyTelephone");
            return (Criteria) this;
        }

        public Criteria andPharmacyTelephoneNotLike(String value) {
            addCriterion("pharmacy_telephone not like", value, "pharmacyTelephone");
            return (Criteria) this;
        }

        public Criteria andPharmacyTelephoneIn(List<String> values) {
            addCriterion("pharmacy_telephone in", values, "pharmacyTelephone");
            return (Criteria) this;
        }

        public Criteria andPharmacyTelephoneNotIn(List<String> values) {
            addCriterion("pharmacy_telephone not in", values, "pharmacyTelephone");
            return (Criteria) this;
        }

        public Criteria andPharmacyTelephoneBetween(String value1, String value2) {
            addCriterion("pharmacy_telephone between", value1, value2, "pharmacyTelephone");
            return (Criteria) this;
        }

        public Criteria andPharmacyTelephoneNotBetween(String value1, String value2) {
            addCriterion("pharmacy_telephone not between", value1, value2, "pharmacyTelephone");
            return (Criteria) this;
        }

        public Criteria andHospitalTypeIsNull() {
            addCriterion("hospital_type is null");
            return (Criteria) this;
        }

        public Criteria andHospitalTypeIsNotNull() {
            addCriterion("hospital_type is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalTypeEqualTo(String value) {
            addCriterion("hospital_type =", value, "hospitalType");
            return (Criteria) this;
        }

        public Criteria andHospitalTypeNotEqualTo(String value) {
            addCriterion("hospital_type <>", value, "hospitalType");
            return (Criteria) this;
        }

        public Criteria andHospitalTypeGreaterThan(String value) {
            addCriterion("hospital_type >", value, "hospitalType");
            return (Criteria) this;
        }

        public Criteria andHospitalTypeGreaterThanOrEqualTo(String value) {
            addCriterion("hospital_type >=", value, "hospitalType");
            return (Criteria) this;
        }

        public Criteria andHospitalTypeLessThan(String value) {
            addCriterion("hospital_type <", value, "hospitalType");
            return (Criteria) this;
        }

        public Criteria andHospitalTypeLessThanOrEqualTo(String value) {
            addCriterion("hospital_type <=", value, "hospitalType");
            return (Criteria) this;
        }

        public Criteria andHospitalTypeLike(String value) {
            addCriterion("hospital_type like", value, "hospitalType");
            return (Criteria) this;
        }

        public Criteria andHospitalTypeNotLike(String value) {
            addCriterion("hospital_type not like", value, "hospitalType");
            return (Criteria) this;
        }

        public Criteria andHospitalTypeIn(List<String> values) {
            addCriterion("hospital_type in", values, "hospitalType");
            return (Criteria) this;
        }

        public Criteria andHospitalTypeNotIn(List<String> values) {
            addCriterion("hospital_type not in", values, "hospitalType");
            return (Criteria) this;
        }

        public Criteria andHospitalTypeBetween(String value1, String value2) {
            addCriterion("hospital_type between", value1, value2, "hospitalType");
            return (Criteria) this;
        }

        public Criteria andHospitalTypeNotBetween(String value1, String value2) {
            addCriterion("hospital_type not between", value1, value2, "hospitalType");
            return (Criteria) this;
        }

        public Criteria andDrugRevenueLastYearIsNull() {
            addCriterion("drug_revenue_last_year is null");
            return (Criteria) this;
        }

        public Criteria andDrugRevenueLastYearIsNotNull() {
            addCriterion("drug_revenue_last_year is not null");
            return (Criteria) this;
        }

        public Criteria andDrugRevenueLastYearEqualTo(String value) {
            addCriterion("drug_revenue_last_year =", value, "drugRevenueLastYear");
            return (Criteria) this;
        }

        public Criteria andDrugRevenueLastYearNotEqualTo(String value) {
            addCriterion("drug_revenue_last_year <>", value, "drugRevenueLastYear");
            return (Criteria) this;
        }

        public Criteria andDrugRevenueLastYearGreaterThan(String value) {
            addCriterion("drug_revenue_last_year >", value, "drugRevenueLastYear");
            return (Criteria) this;
        }

        public Criteria andDrugRevenueLastYearGreaterThanOrEqualTo(String value) {
            addCriterion("drug_revenue_last_year >=", value, "drugRevenueLastYear");
            return (Criteria) this;
        }

        public Criteria andDrugRevenueLastYearLessThan(String value) {
            addCriterion("drug_revenue_last_year <", value, "drugRevenueLastYear");
            return (Criteria) this;
        }

        public Criteria andDrugRevenueLastYearLessThanOrEqualTo(String value) {
            addCriterion("drug_revenue_last_year <=", value, "drugRevenueLastYear");
            return (Criteria) this;
        }

        public Criteria andDrugRevenueLastYearLike(String value) {
            addCriterion("drug_revenue_last_year like", value, "drugRevenueLastYear");
            return (Criteria) this;
        }

        public Criteria andDrugRevenueLastYearNotLike(String value) {
            addCriterion("drug_revenue_last_year not like", value, "drugRevenueLastYear");
            return (Criteria) this;
        }

        public Criteria andDrugRevenueLastYearIn(List<String> values) {
            addCriterion("drug_revenue_last_year in", values, "drugRevenueLastYear");
            return (Criteria) this;
        }

        public Criteria andDrugRevenueLastYearNotIn(List<String> values) {
            addCriterion("drug_revenue_last_year not in", values, "drugRevenueLastYear");
            return (Criteria) this;
        }

        public Criteria andDrugRevenueLastYearBetween(String value1, String value2) {
            addCriterion("drug_revenue_last_year between", value1, value2, "drugRevenueLastYear");
            return (Criteria) this;
        }

        public Criteria andDrugRevenueLastYearNotBetween(String value1, String value2) {
            addCriterion("drug_revenue_last_year not between", value1, value2, "drugRevenueLastYear");
            return (Criteria) this;
        }

        public Criteria andBusinessIncomeLastYearIsNull() {
            addCriterion("business_income_last_year is null");
            return (Criteria) this;
        }

        public Criteria andBusinessIncomeLastYearIsNotNull() {
            addCriterion("business_income_last_year is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessIncomeLastYearEqualTo(String value) {
            addCriterion("business_income_last_year =", value, "businessIncomeLastYear");
            return (Criteria) this;
        }

        public Criteria andBusinessIncomeLastYearNotEqualTo(String value) {
            addCriterion("business_income_last_year <>", value, "businessIncomeLastYear");
            return (Criteria) this;
        }

        public Criteria andBusinessIncomeLastYearGreaterThan(String value) {
            addCriterion("business_income_last_year >", value, "businessIncomeLastYear");
            return (Criteria) this;
        }

        public Criteria andBusinessIncomeLastYearGreaterThanOrEqualTo(String value) {
            addCriterion("business_income_last_year >=", value, "businessIncomeLastYear");
            return (Criteria) this;
        }

        public Criteria andBusinessIncomeLastYearLessThan(String value) {
            addCriterion("business_income_last_year <", value, "businessIncomeLastYear");
            return (Criteria) this;
        }

        public Criteria andBusinessIncomeLastYearLessThanOrEqualTo(String value) {
            addCriterion("business_income_last_year <=", value, "businessIncomeLastYear");
            return (Criteria) this;
        }

        public Criteria andBusinessIncomeLastYearLike(String value) {
            addCriterion("business_income_last_year like", value, "businessIncomeLastYear");
            return (Criteria) this;
        }

        public Criteria andBusinessIncomeLastYearNotLike(String value) {
            addCriterion("business_income_last_year not like", value, "businessIncomeLastYear");
            return (Criteria) this;
        }

        public Criteria andBusinessIncomeLastYearIn(List<String> values) {
            addCriterion("business_income_last_year in", values, "businessIncomeLastYear");
            return (Criteria) this;
        }

        public Criteria andBusinessIncomeLastYearNotIn(List<String> values) {
            addCriterion("business_income_last_year not in", values, "businessIncomeLastYear");
            return (Criteria) this;
        }

        public Criteria andBusinessIncomeLastYearBetween(String value1, String value2) {
            addCriterion("business_income_last_year between", value1, value2, "businessIncomeLastYear");
            return (Criteria) this;
        }

        public Criteria andBusinessIncomeLastYearNotBetween(String value1, String value2) {
            addCriterion("business_income_last_year not between", value1, value2, "businessIncomeLastYear");
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