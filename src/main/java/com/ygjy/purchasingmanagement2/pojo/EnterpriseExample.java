package com.ygjy.purchasingmanagement2.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EnterpriseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public EnterpriseExample() {
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

        public Criteria andEnterpriseTypeIsNull() {
            addCriterion("enterprise_type is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeIsNotNull() {
            addCriterion("enterprise_type is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeEqualTo(String value) {
            addCriterion("enterprise_type =", value, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeNotEqualTo(String value) {
            addCriterion("enterprise_type <>", value, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeGreaterThan(String value) {
            addCriterion("enterprise_type >", value, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_type >=", value, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeLessThan(String value) {
            addCriterion("enterprise_type <", value, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeLessThanOrEqualTo(String value) {
            addCriterion("enterprise_type <=", value, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeLike(String value) {
            addCriterion("enterprise_type like", value, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeNotLike(String value) {
            addCriterion("enterprise_type not like", value, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeIn(List<String> values) {
            addCriterion("enterprise_type in", values, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeNotIn(List<String> values) {
            addCriterion("enterprise_type not in", values, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeBetween(String value1, String value2) {
            addCriterion("enterprise_type between", value1, value2, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeNotBetween(String value1, String value2) {
            addCriterion("enterprise_type not between", value1, value2, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andLicenseIsNull() {
            addCriterion("license is null");
            return (Criteria) this;
        }

        public Criteria andLicenseIsNotNull() {
            addCriterion("license is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseEqualTo(String value) {
            addCriterion("license =", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotEqualTo(String value) {
            addCriterion("license <>", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseGreaterThan(String value) {
            addCriterion("license >", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseGreaterThanOrEqualTo(String value) {
            addCriterion("license >=", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseLessThan(String value) {
            addCriterion("license <", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseLessThanOrEqualTo(String value) {
            addCriterion("license <=", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseLike(String value) {
            addCriterion("license like", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotLike(String value) {
            addCriterion("license not like", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseIn(List<String> values) {
            addCriterion("license in", values, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotIn(List<String> values) {
            addCriterion("license not in", values, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseBetween(String value1, String value2) {
            addCriterion("license between", value1, value2, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotBetween(String value1, String value2) {
            addCriterion("license not between", value1, value2, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseExpirationDateIsNull() {
            addCriterion("license_expiration_date is null");
            return (Criteria) this;
        }

        public Criteria andLicenseExpirationDateIsNotNull() {
            addCriterion("license_expiration_date is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseExpirationDateEqualTo(Date value) {
            addCriterionForJDBCDate("license_expiration_date =", value, "licenseExpirationDate");
            return (Criteria) this;
        }

        public Criteria andLicenseExpirationDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("license_expiration_date <>", value, "licenseExpirationDate");
            return (Criteria) this;
        }

        public Criteria andLicenseExpirationDateGreaterThan(Date value) {
            addCriterionForJDBCDate("license_expiration_date >", value, "licenseExpirationDate");
            return (Criteria) this;
        }

        public Criteria andLicenseExpirationDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("license_expiration_date >=", value, "licenseExpirationDate");
            return (Criteria) this;
        }

        public Criteria andLicenseExpirationDateLessThan(Date value) {
            addCriterionForJDBCDate("license_expiration_date <", value, "licenseExpirationDate");
            return (Criteria) this;
        }

        public Criteria andLicenseExpirationDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("license_expiration_date <=", value, "licenseExpirationDate");
            return (Criteria) this;
        }

        public Criteria andLicenseExpirationDateIn(List<Date> values) {
            addCriterionForJDBCDate("license_expiration_date in", values, "licenseExpirationDate");
            return (Criteria) this;
        }

        public Criteria andLicenseExpirationDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("license_expiration_date not in", values, "licenseExpirationDate");
            return (Criteria) this;
        }

        public Criteria andLicenseExpirationDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("license_expiration_date between", value1, value2, "licenseExpirationDate");
            return (Criteria) this;
        }

        public Criteria andLicenseExpirationDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("license_expiration_date not between", value1, value2, "licenseExpirationDate");
            return (Criteria) this;
        }

        public Criteria andEnterpriseContactsIsNull() {
            addCriterion("enterprise_contacts is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseContactsIsNotNull() {
            addCriterion("enterprise_contacts is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseContactsEqualTo(String value) {
            addCriterion("enterprise_contacts =", value, "enterpriseContacts");
            return (Criteria) this;
        }

        public Criteria andEnterpriseContactsNotEqualTo(String value) {
            addCriterion("enterprise_contacts <>", value, "enterpriseContacts");
            return (Criteria) this;
        }

        public Criteria andEnterpriseContactsGreaterThan(String value) {
            addCriterion("enterprise_contacts >", value, "enterpriseContacts");
            return (Criteria) this;
        }

        public Criteria andEnterpriseContactsGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_contacts >=", value, "enterpriseContacts");
            return (Criteria) this;
        }

        public Criteria andEnterpriseContactsLessThan(String value) {
            addCriterion("enterprise_contacts <", value, "enterpriseContacts");
            return (Criteria) this;
        }

        public Criteria andEnterpriseContactsLessThanOrEqualTo(String value) {
            addCriterion("enterprise_contacts <=", value, "enterpriseContacts");
            return (Criteria) this;
        }

        public Criteria andEnterpriseContactsLike(String value) {
            addCriterion("enterprise_contacts like", value, "enterpriseContacts");
            return (Criteria) this;
        }

        public Criteria andEnterpriseContactsNotLike(String value) {
            addCriterion("enterprise_contacts not like", value, "enterpriseContacts");
            return (Criteria) this;
        }

        public Criteria andEnterpriseContactsIn(List<String> values) {
            addCriterion("enterprise_contacts in", values, "enterpriseContacts");
            return (Criteria) this;
        }

        public Criteria andEnterpriseContactsNotIn(List<String> values) {
            addCriterion("enterprise_contacts not in", values, "enterpriseContacts");
            return (Criteria) this;
        }

        public Criteria andEnterpriseContactsBetween(String value1, String value2) {
            addCriterion("enterprise_contacts between", value1, value2, "enterpriseContacts");
            return (Criteria) this;
        }

        public Criteria andEnterpriseContactsNotBetween(String value1, String value2) {
            addCriterion("enterprise_contacts not between", value1, value2, "enterpriseContacts");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTelephoneIsNull() {
            addCriterion("enterprise_telephone is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTelephoneIsNotNull() {
            addCriterion("enterprise_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTelephoneEqualTo(String value) {
            addCriterion("enterprise_telephone =", value, "enterpriseTelephone");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTelephoneNotEqualTo(String value) {
            addCriterion("enterprise_telephone <>", value, "enterpriseTelephone");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTelephoneGreaterThan(String value) {
            addCriterion("enterprise_telephone >", value, "enterpriseTelephone");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_telephone >=", value, "enterpriseTelephone");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTelephoneLessThan(String value) {
            addCriterion("enterprise_telephone <", value, "enterpriseTelephone");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTelephoneLessThanOrEqualTo(String value) {
            addCriterion("enterprise_telephone <=", value, "enterpriseTelephone");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTelephoneLike(String value) {
            addCriterion("enterprise_telephone like", value, "enterpriseTelephone");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTelephoneNotLike(String value) {
            addCriterion("enterprise_telephone not like", value, "enterpriseTelephone");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTelephoneIn(List<String> values) {
            addCriterion("enterprise_telephone in", values, "enterpriseTelephone");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTelephoneNotIn(List<String> values) {
            addCriterion("enterprise_telephone not in", values, "enterpriseTelephone");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTelephoneBetween(String value1, String value2) {
            addCriterion("enterprise_telephone between", value1, value2, "enterpriseTelephone");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTelephoneNotBetween(String value1, String value2) {
            addCriterion("enterprise_telephone not between", value1, value2, "enterpriseTelephone");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeIsNull() {
            addCriterion("business_scope is null");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeIsNotNull() {
            addCriterion("business_scope is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeEqualTo(String value) {
            addCriterion("business_scope =", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeNotEqualTo(String value) {
            addCriterion("business_scope <>", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeGreaterThan(String value) {
            addCriterion("business_scope >", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeGreaterThanOrEqualTo(String value) {
            addCriterion("business_scope >=", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeLessThan(String value) {
            addCriterion("business_scope <", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeLessThanOrEqualTo(String value) {
            addCriterion("business_scope <=", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeLike(String value) {
            addCriterion("business_scope like", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeNotLike(String value) {
            addCriterion("business_scope not like", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeIn(List<String> values) {
            addCriterion("business_scope in", values, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeNotIn(List<String> values) {
            addCriterion("business_scope not in", values, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeBetween(String value1, String value2) {
            addCriterion("business_scope between", value1, value2, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeNotBetween(String value1, String value2) {
            addCriterion("business_scope not between", value1, value2, "businessScope");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressIsNull() {
            addCriterion("registered_address is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressIsNotNull() {
            addCriterion("registered_address is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressEqualTo(String value) {
            addCriterion("registered_address =", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressNotEqualTo(String value) {
            addCriterion("registered_address <>", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressGreaterThan(String value) {
            addCriterion("registered_address >", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressGreaterThanOrEqualTo(String value) {
            addCriterion("registered_address >=", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressLessThan(String value) {
            addCriterion("registered_address <", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressLessThanOrEqualTo(String value) {
            addCriterion("registered_address <=", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressLike(String value) {
            addCriterion("registered_address like", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressNotLike(String value) {
            addCriterion("registered_address not like", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressIn(List<String> values) {
            addCriterion("registered_address in", values, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressNotIn(List<String> values) {
            addCriterion("registered_address not in", values, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressBetween(String value1, String value2) {
            addCriterion("registered_address between", value1, value2, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressNotBetween(String value1, String value2) {
            addCriterion("registered_address not between", value1, value2, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressIsNull() {
            addCriterion("contact_address is null");
            return (Criteria) this;
        }

        public Criteria andContactAddressIsNotNull() {
            addCriterion("contact_address is not null");
            return (Criteria) this;
        }

        public Criteria andContactAddressEqualTo(String value) {
            addCriterion("contact_address =", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressNotEqualTo(String value) {
            addCriterion("contact_address <>", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressGreaterThan(String value) {
            addCriterion("contact_address >", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressGreaterThanOrEqualTo(String value) {
            addCriterion("contact_address >=", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressLessThan(String value) {
            addCriterion("contact_address <", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressLessThanOrEqualTo(String value) {
            addCriterion("contact_address <=", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressLike(String value) {
            addCriterion("contact_address like", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressNotLike(String value) {
            addCriterion("contact_address not like", value, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressIn(List<String> values) {
            addCriterion("contact_address in", values, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressNotIn(List<String> values) {
            addCriterion("contact_address not in", values, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressBetween(String value1, String value2) {
            addCriterion("contact_address between", value1, value2, "contactAddress");
            return (Criteria) this;
        }

        public Criteria andContactAddressNotBetween(String value1, String value2) {
            addCriterion("contact_address not between", value1, value2, "contactAddress");
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

        public Criteria andTotalAssetsIsNull() {
            addCriterion("total_assets is null");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsIsNotNull() {
            addCriterion("total_assets is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsEqualTo(Float value) {
            addCriterion("total_assets =", value, "totalAssets");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsNotEqualTo(Float value) {
            addCriterion("total_assets <>", value, "totalAssets");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsGreaterThan(Float value) {
            addCriterion("total_assets >", value, "totalAssets");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsGreaterThanOrEqualTo(Float value) {
            addCriterion("total_assets >=", value, "totalAssets");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsLessThan(Float value) {
            addCriterion("total_assets <", value, "totalAssets");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsLessThanOrEqualTo(Float value) {
            addCriterion("total_assets <=", value, "totalAssets");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsIn(List<Float> values) {
            addCriterion("total_assets in", values, "totalAssets");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsNotIn(List<Float> values) {
            addCriterion("total_assets not in", values, "totalAssets");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsBetween(Float value1, Float value2) {
            addCriterion("total_assets between", value1, value2, "totalAssets");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsNotBetween(Float value1, Float value2) {
            addCriterion("total_assets not between", value1, value2, "totalAssets");
            return (Criteria) this;
        }

        public Criteria andCorporateFaxIsNull() {
            addCriterion("corporate_fax is null");
            return (Criteria) this;
        }

        public Criteria andCorporateFaxIsNotNull() {
            addCriterion("corporate_fax is not null");
            return (Criteria) this;
        }

        public Criteria andCorporateFaxEqualTo(String value) {
            addCriterion("corporate_fax =", value, "corporateFax");
            return (Criteria) this;
        }

        public Criteria andCorporateFaxNotEqualTo(String value) {
            addCriterion("corporate_fax <>", value, "corporateFax");
            return (Criteria) this;
        }

        public Criteria andCorporateFaxGreaterThan(String value) {
            addCriterion("corporate_fax >", value, "corporateFax");
            return (Criteria) this;
        }

        public Criteria andCorporateFaxGreaterThanOrEqualTo(String value) {
            addCriterion("corporate_fax >=", value, "corporateFax");
            return (Criteria) this;
        }

        public Criteria andCorporateFaxLessThan(String value) {
            addCriterion("corporate_fax <", value, "corporateFax");
            return (Criteria) this;
        }

        public Criteria andCorporateFaxLessThanOrEqualTo(String value) {
            addCriterion("corporate_fax <=", value, "corporateFax");
            return (Criteria) this;
        }

        public Criteria andCorporateFaxLike(String value) {
            addCriterion("corporate_fax like", value, "corporateFax");
            return (Criteria) this;
        }

        public Criteria andCorporateFaxNotLike(String value) {
            addCriterion("corporate_fax not like", value, "corporateFax");
            return (Criteria) this;
        }

        public Criteria andCorporateFaxIn(List<String> values) {
            addCriterion("corporate_fax in", values, "corporateFax");
            return (Criteria) this;
        }

        public Criteria andCorporateFaxNotIn(List<String> values) {
            addCriterion("corporate_fax not in", values, "corporateFax");
            return (Criteria) this;
        }

        public Criteria andCorporateFaxBetween(String value1, String value2) {
            addCriterion("corporate_fax between", value1, value2, "corporateFax");
            return (Criteria) this;
        }

        public Criteria andCorporateFaxNotBetween(String value1, String value2) {
            addCriterion("corporate_fax not between", value1, value2, "corporateFax");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIsNull() {
            addCriterion("legal_person is null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIsNotNull() {
            addCriterion("legal_person is not null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonEqualTo(String value) {
            addCriterion("legal_person =", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotEqualTo(String value) {
            addCriterion("legal_person <>", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonGreaterThan(String value) {
            addCriterion("legal_person >", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonGreaterThanOrEqualTo(String value) {
            addCriterion("legal_person >=", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLessThan(String value) {
            addCriterion("legal_person <", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLessThanOrEqualTo(String value) {
            addCriterion("legal_person <=", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLike(String value) {
            addCriterion("legal_person like", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotLike(String value) {
            addCriterion("legal_person not like", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIn(List<String> values) {
            addCriterion("legal_person in", values, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotIn(List<String> values) {
            addCriterion("legal_person not in", values, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonBetween(String value1, String value2) {
            addCriterion("legal_person between", value1, value2, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotBetween(String value1, String value2) {
            addCriterion("legal_person not between", value1, value2, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdCardIsNull() {
            addCriterion("legal_person_id_card is null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdCardIsNotNull() {
            addCriterion("legal_person_id_card is not null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdCardEqualTo(String value) {
            addCriterion("legal_person_id_card =", value, "legalPersonIdCard");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdCardNotEqualTo(String value) {
            addCriterion("legal_person_id_card <>", value, "legalPersonIdCard");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdCardGreaterThan(String value) {
            addCriterion("legal_person_id_card >", value, "legalPersonIdCard");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("legal_person_id_card >=", value, "legalPersonIdCard");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdCardLessThan(String value) {
            addCriterion("legal_person_id_card <", value, "legalPersonIdCard");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdCardLessThanOrEqualTo(String value) {
            addCriterion("legal_person_id_card <=", value, "legalPersonIdCard");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdCardLike(String value) {
            addCriterion("legal_person_id_card like", value, "legalPersonIdCard");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdCardNotLike(String value) {
            addCriterion("legal_person_id_card not like", value, "legalPersonIdCard");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdCardIn(List<String> values) {
            addCriterion("legal_person_id_card in", values, "legalPersonIdCard");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdCardNotIn(List<String> values) {
            addCriterion("legal_person_id_card not in", values, "legalPersonIdCard");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdCardBetween(String value1, String value2) {
            addCriterion("legal_person_id_card between", value1, value2, "legalPersonIdCard");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIdCardNotBetween(String value1, String value2) {
            addCriterion("legal_person_id_card not between", value1, value2, "legalPersonIdCard");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegisteredCapitalIsNull() {
            addCriterion("enterprise_registered_capital is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegisteredCapitalIsNotNull() {
            addCriterion("enterprise_registered_capital is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegisteredCapitalEqualTo(Float value) {
            addCriterion("enterprise_registered_capital =", value, "enterpriseRegisteredCapital");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegisteredCapitalNotEqualTo(Float value) {
            addCriterion("enterprise_registered_capital <>", value, "enterpriseRegisteredCapital");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegisteredCapitalGreaterThan(Float value) {
            addCriterion("enterprise_registered_capital >", value, "enterpriseRegisteredCapital");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegisteredCapitalGreaterThanOrEqualTo(Float value) {
            addCriterion("enterprise_registered_capital >=", value, "enterpriseRegisteredCapital");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegisteredCapitalLessThan(Float value) {
            addCriterion("enterprise_registered_capital <", value, "enterpriseRegisteredCapital");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegisteredCapitalLessThanOrEqualTo(Float value) {
            addCriterion("enterprise_registered_capital <=", value, "enterpriseRegisteredCapital");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegisteredCapitalIn(List<Float> values) {
            addCriterion("enterprise_registered_capital in", values, "enterpriseRegisteredCapital");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegisteredCapitalNotIn(List<Float> values) {
            addCriterion("enterprise_registered_capital not in", values, "enterpriseRegisteredCapital");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegisteredCapitalBetween(Float value1, Float value2) {
            addCriterion("enterprise_registered_capital between", value1, value2, "enterpriseRegisteredCapital");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegisteredCapitalNotBetween(Float value1, Float value2) {
            addCriterion("enterprise_registered_capital not between", value1, value2, "enterpriseRegisteredCapital");
            return (Criteria) this;
        }

        public Criteria andSalesAmountLastYearIsNull() {
            addCriterion("sales_amount_last_year is null");
            return (Criteria) this;
        }

        public Criteria andSalesAmountLastYearIsNotNull() {
            addCriterion("sales_amount_last_year is not null");
            return (Criteria) this;
        }

        public Criteria andSalesAmountLastYearEqualTo(Float value) {
            addCriterion("sales_amount_last_year =", value, "salesAmountLastYear");
            return (Criteria) this;
        }

        public Criteria andSalesAmountLastYearNotEqualTo(Float value) {
            addCriterion("sales_amount_last_year <>", value, "salesAmountLastYear");
            return (Criteria) this;
        }

        public Criteria andSalesAmountLastYearGreaterThan(Float value) {
            addCriterion("sales_amount_last_year >", value, "salesAmountLastYear");
            return (Criteria) this;
        }

        public Criteria andSalesAmountLastYearGreaterThanOrEqualTo(Float value) {
            addCriterion("sales_amount_last_year >=", value, "salesAmountLastYear");
            return (Criteria) this;
        }

        public Criteria andSalesAmountLastYearLessThan(Float value) {
            addCriterion("sales_amount_last_year <", value, "salesAmountLastYear");
            return (Criteria) this;
        }

        public Criteria andSalesAmountLastYearLessThanOrEqualTo(Float value) {
            addCriterion("sales_amount_last_year <=", value, "salesAmountLastYear");
            return (Criteria) this;
        }

        public Criteria andSalesAmountLastYearIn(List<Float> values) {
            addCriterion("sales_amount_last_year in", values, "salesAmountLastYear");
            return (Criteria) this;
        }

        public Criteria andSalesAmountLastYearNotIn(List<Float> values) {
            addCriterion("sales_amount_last_year not in", values, "salesAmountLastYear");
            return (Criteria) this;
        }

        public Criteria andSalesAmountLastYearBetween(Float value1, Float value2) {
            addCriterion("sales_amount_last_year between", value1, value2, "salesAmountLastYear");
            return (Criteria) this;
        }

        public Criteria andSalesAmountLastYearNotBetween(Float value1, Float value2) {
            addCriterion("sales_amount_last_year not between", value1, value2, "salesAmountLastYear");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andWebsiteIsNull() {
            addCriterion("website is null");
            return (Criteria) this;
        }

        public Criteria andWebsiteIsNotNull() {
            addCriterion("website is not null");
            return (Criteria) this;
        }

        public Criteria andWebsiteEqualTo(String value) {
            addCriterion("website =", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotEqualTo(String value) {
            addCriterion("website <>", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteGreaterThan(String value) {
            addCriterion("website >", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteGreaterThanOrEqualTo(String value) {
            addCriterion("website >=", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLessThan(String value) {
            addCriterion("website <", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLessThanOrEqualTo(String value) {
            addCriterion("website <=", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLike(String value) {
            addCriterion("website like", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotLike(String value) {
            addCriterion("website not like", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteIn(List<String> values) {
            addCriterion("website in", values, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotIn(List<String> values) {
            addCriterion("website not in", values, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteBetween(String value1, String value2) {
            addCriterion("website between", value1, value2, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotBetween(String value1, String value2) {
            addCriterion("website not between", value1, value2, "website");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeIsNull() {
            addCriterion("enterprise_code is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeIsNotNull() {
            addCriterion("enterprise_code is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeEqualTo(String value) {
            addCriterion("enterprise_code =", value, "enterpriseCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeNotEqualTo(String value) {
            addCriterion("enterprise_code <>", value, "enterpriseCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeGreaterThan(String value) {
            addCriterion("enterprise_code >", value, "enterpriseCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_code >=", value, "enterpriseCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeLessThan(String value) {
            addCriterion("enterprise_code <", value, "enterpriseCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeLessThanOrEqualTo(String value) {
            addCriterion("enterprise_code <=", value, "enterpriseCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeLike(String value) {
            addCriterion("enterprise_code like", value, "enterpriseCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeNotLike(String value) {
            addCriterion("enterprise_code not like", value, "enterpriseCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeIn(List<String> values) {
            addCriterion("enterprise_code in", values, "enterpriseCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeNotIn(List<String> values) {
            addCriterion("enterprise_code not in", values, "enterpriseCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeBetween(String value1, String value2) {
            addCriterion("enterprise_code between", value1, value2, "enterpriseCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeNotBetween(String value1, String value2) {
            addCriterion("enterprise_code not between", value1, value2, "enterpriseCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeDateIsNull() {
            addCriterion("enterprise_code_date is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeDateIsNotNull() {
            addCriterion("enterprise_code_date is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeDateEqualTo(Date value) {
            addCriterionForJDBCDate("enterprise_code_date =", value, "enterpriseCodeDate");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("enterprise_code_date <>", value, "enterpriseCodeDate");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeDateGreaterThan(Date value) {
            addCriterionForJDBCDate("enterprise_code_date >", value, "enterpriseCodeDate");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("enterprise_code_date >=", value, "enterpriseCodeDate");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeDateLessThan(Date value) {
            addCriterionForJDBCDate("enterprise_code_date <", value, "enterpriseCodeDate");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("enterprise_code_date <=", value, "enterpriseCodeDate");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeDateIn(List<Date> values) {
            addCriterionForJDBCDate("enterprise_code_date in", values, "enterpriseCodeDate");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("enterprise_code_date not in", values, "enterpriseCodeDate");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("enterprise_code_date between", value1, value2, "enterpriseCodeDate");
            return (Criteria) this;
        }

        public Criteria andEnterpriseCodeDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("enterprise_code_date not between", value1, value2, "enterpriseCodeDate");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseIsNull() {
            addCriterion("business_license is null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseIsNotNull() {
            addCriterion("business_license is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseEqualTo(String value) {
            addCriterion("business_license =", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNotEqualTo(String value) {
            addCriterion("business_license <>", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseGreaterThan(String value) {
            addCriterion("business_license >", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseGreaterThanOrEqualTo(String value) {
            addCriterion("business_license >=", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseLessThan(String value) {
            addCriterion("business_license <", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseLessThanOrEqualTo(String value) {
            addCriterion("business_license <=", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseLike(String value) {
            addCriterion("business_license like", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNotLike(String value) {
            addCriterion("business_license not like", value, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseIn(List<String> values) {
            addCriterion("business_license in", values, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNotIn(List<String> values) {
            addCriterion("business_license not in", values, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseBetween(String value1, String value2) {
            addCriterion("business_license between", value1, value2, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNotBetween(String value1, String value2) {
            addCriterion("business_license not between", value1, value2, "businessLicense");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseDateIsNull() {
            addCriterion("`business_license _date` is null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseDateIsNotNull() {
            addCriterion("`business_license _date` is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseDateEqualTo(Date value) {
            addCriterionForJDBCDate("`business_license _date` =", value, "businessLicenseDate");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("`business_license _date` <>", value, "businessLicenseDate");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseDateGreaterThan(Date value) {
            addCriterionForJDBCDate("`business_license _date` >", value, "businessLicenseDate");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("`business_license _date` >=", value, "businessLicenseDate");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseDateLessThan(Date value) {
            addCriterionForJDBCDate("`business_license _date` <", value, "businessLicenseDate");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("`business_license _date` <=", value, "businessLicenseDate");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseDateIn(List<Date> values) {
            addCriterionForJDBCDate("`business_license _date` in", values, "businessLicenseDate");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("`business_license _date` not in", values, "businessLicenseDate");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("`business_license _date` between", value1, value2, "businessLicenseDate");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("`business_license _date` not between", value1, value2, "businessLicenseDate");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLetterOfCreditIsNull() {
            addCriterion("enterprise_letter_of_credit is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLetterOfCreditIsNotNull() {
            addCriterion("enterprise_letter_of_credit is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLetterOfCreditEqualTo(Integer value) {
            addCriterion("enterprise_letter_of_credit =", value, "enterpriseLetterOfCredit");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLetterOfCreditNotEqualTo(Integer value) {
            addCriterion("enterprise_letter_of_credit <>", value, "enterpriseLetterOfCredit");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLetterOfCreditGreaterThan(Integer value) {
            addCriterion("enterprise_letter_of_credit >", value, "enterpriseLetterOfCredit");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLetterOfCreditGreaterThanOrEqualTo(Integer value) {
            addCriterion("enterprise_letter_of_credit >=", value, "enterpriseLetterOfCredit");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLetterOfCreditLessThan(Integer value) {
            addCriterion("enterprise_letter_of_credit <", value, "enterpriseLetterOfCredit");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLetterOfCreditLessThanOrEqualTo(Integer value) {
            addCriterion("enterprise_letter_of_credit <=", value, "enterpriseLetterOfCredit");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLetterOfCreditIn(List<Integer> values) {
            addCriterion("enterprise_letter_of_credit in", values, "enterpriseLetterOfCredit");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLetterOfCreditNotIn(List<Integer> values) {
            addCriterion("enterprise_letter_of_credit not in", values, "enterpriseLetterOfCredit");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLetterOfCreditBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_letter_of_credit between", value1, value2, "enterpriseLetterOfCredit");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLetterOfCreditNotBetween(Integer value1, Integer value2) {
            addCriterion("enterprise_letter_of_credit not between", value1, value2, "enterpriseLetterOfCredit");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLetterNumberIsNull() {
            addCriterion("enterprise_letter_number is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLetterNumberIsNotNull() {
            addCriterion("enterprise_letter_number is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLetterNumberEqualTo(String value) {
            addCriterion("enterprise_letter_number =", value, "enterpriseLetterNumber");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLetterNumberNotEqualTo(String value) {
            addCriterion("enterprise_letter_number <>", value, "enterpriseLetterNumber");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLetterNumberGreaterThan(String value) {
            addCriterion("enterprise_letter_number >", value, "enterpriseLetterNumber");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLetterNumberGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_letter_number >=", value, "enterpriseLetterNumber");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLetterNumberLessThan(String value) {
            addCriterion("enterprise_letter_number <", value, "enterpriseLetterNumber");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLetterNumberLessThanOrEqualTo(String value) {
            addCriterion("enterprise_letter_number <=", value, "enterpriseLetterNumber");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLetterNumberLike(String value) {
            addCriterion("enterprise_letter_number like", value, "enterpriseLetterNumber");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLetterNumberNotLike(String value) {
            addCriterion("enterprise_letter_number not like", value, "enterpriseLetterNumber");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLetterNumberIn(List<String> values) {
            addCriterion("enterprise_letter_number in", values, "enterpriseLetterNumber");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLetterNumberNotIn(List<String> values) {
            addCriterion("enterprise_letter_number not in", values, "enterpriseLetterNumber");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLetterNumberBetween(String value1, String value2) {
            addCriterion("enterprise_letter_number between", value1, value2, "enterpriseLetterNumber");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLetterNumberNotBetween(String value1, String value2) {
            addCriterion("enterprise_letter_number not between", value1, value2, "enterpriseLetterNumber");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLetterDataIsNull() {
            addCriterion("enterprise_letter_data is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLetterDataIsNotNull() {
            addCriterion("enterprise_letter_data is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLetterDataEqualTo(Date value) {
            addCriterionForJDBCDate("enterprise_letter_data =", value, "enterpriseLetterData");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLetterDataNotEqualTo(Date value) {
            addCriterionForJDBCDate("enterprise_letter_data <>", value, "enterpriseLetterData");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLetterDataGreaterThan(Date value) {
            addCriterionForJDBCDate("enterprise_letter_data >", value, "enterpriseLetterData");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLetterDataGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("enterprise_letter_data >=", value, "enterpriseLetterData");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLetterDataLessThan(Date value) {
            addCriterionForJDBCDate("enterprise_letter_data <", value, "enterpriseLetterData");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLetterDataLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("enterprise_letter_data <=", value, "enterpriseLetterData");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLetterDataIn(List<Date> values) {
            addCriterionForJDBCDate("enterprise_letter_data in", values, "enterpriseLetterData");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLetterDataNotIn(List<Date> values) {
            addCriterionForJDBCDate("enterprise_letter_data not in", values, "enterpriseLetterData");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLetterDataBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("enterprise_letter_data between", value1, value2, "enterpriseLetterData");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLetterDataNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("enterprise_letter_data not between", value1, value2, "enterpriseLetterData");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsIsNull() {
            addCriterion("fixed_assets is null");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsIsNotNull() {
            addCriterion("fixed_assets is not null");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsEqualTo(Float value) {
            addCriterion("fixed_assets =", value, "fixedAssets");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsNotEqualTo(Float value) {
            addCriterion("fixed_assets <>", value, "fixedAssets");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsGreaterThan(Float value) {
            addCriterion("fixed_assets >", value, "fixedAssets");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsGreaterThanOrEqualTo(Float value) {
            addCriterion("fixed_assets >=", value, "fixedAssets");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsLessThan(Float value) {
            addCriterion("fixed_assets <", value, "fixedAssets");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsLessThanOrEqualTo(Float value) {
            addCriterion("fixed_assets <=", value, "fixedAssets");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsIn(List<Float> values) {
            addCriterion("fixed_assets in", values, "fixedAssets");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsNotIn(List<Float> values) {
            addCriterion("fixed_assets not in", values, "fixedAssets");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsBetween(Float value1, Float value2) {
            addCriterion("fixed_assets between", value1, value2, "fixedAssets");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsNotBetween(Float value1, Float value2) {
            addCriterion("fixed_assets not between", value1, value2, "fixedAssets");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileIsNull() {
            addCriterion("company_profile is null");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileIsNotNull() {
            addCriterion("company_profile is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileEqualTo(String value) {
            addCriterion("company_profile =", value, "companyProfile");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileNotEqualTo(String value) {
            addCriterion("company_profile <>", value, "companyProfile");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileGreaterThan(String value) {
            addCriterion("company_profile >", value, "companyProfile");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileGreaterThanOrEqualTo(String value) {
            addCriterion("company_profile >=", value, "companyProfile");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileLessThan(String value) {
            addCriterion("company_profile <", value, "companyProfile");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileLessThanOrEqualTo(String value) {
            addCriterion("company_profile <=", value, "companyProfile");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileLike(String value) {
            addCriterion("company_profile like", value, "companyProfile");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileNotLike(String value) {
            addCriterion("company_profile not like", value, "companyProfile");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileIn(List<String> values) {
            addCriterion("company_profile in", values, "companyProfile");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileNotIn(List<String> values) {
            addCriterion("company_profile not in", values, "companyProfile");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileBetween(String value1, String value2) {
            addCriterion("company_profile between", value1, value2, "companyProfile");
            return (Criteria) this;
        }

        public Criteria andCompanyProfileNotBetween(String value1, String value2) {
            addCriterion("company_profile not between", value1, value2, "companyProfile");
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