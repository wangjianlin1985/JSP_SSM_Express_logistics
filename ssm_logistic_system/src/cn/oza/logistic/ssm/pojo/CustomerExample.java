// 
// 
// 

package cn.oza.logistic.ssm.pojo;

import java.util.ArrayList;
import java.util.List;

public class CustomerExample
{
    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;
    
    public CustomerExample() {
        this.oredCriteria = new ArrayList<Criteria>();
    }
    
    public void setOrderByClause(final String orderByClause) {
        this.orderByClause = orderByClause;
    }
    
    public String getOrderByClause() {
        return this.orderByClause;
    }
    
    public void setDistinct(final boolean distinct) {
        this.distinct = distinct;
    }
    
    public boolean isDistinct() {
        return this.distinct;
    }
    
    public List<Criteria> getOredCriteria() {
        return this.oredCriteria;
    }
    
    public void or(final Criteria criteria) {
        this.oredCriteria.add(criteria);
    }
    
    public Criteria or() {
        final Criteria criteria = this.createCriteriaInternal();
        this.oredCriteria.add(criteria);
        return criteria;
    }
    
    public Criteria createCriteria() {
        final Criteria criteria = this.createCriteriaInternal();
        if (this.oredCriteria.size() == 0) {
            this.oredCriteria.add(criteria);
        }
        return criteria;
    }
    
    protected Criteria createCriteriaInternal() {
        final Criteria criteria = new Criteria();
        return criteria;
    }
    
    public void clear() {
        this.oredCriteria.clear();
        this.orderByClause = null;
        this.distinct = false;
    }
    
    public static class Criteria extends GeneratedCriteria
    {
    }
    
    protected abstract static class GeneratedCriteria
    {
        protected List<Criterion> criteria;
        
        protected GeneratedCriteria() {
            this.criteria = new ArrayList<Criterion>();
        }
        
        public boolean isValid() {
            return this.criteria.size() > 0;
        }
        
        public List<Criterion> getAllCriteria() {
            return this.criteria;
        }
        
        public List<Criterion> getCriteria() {
            return this.criteria;
        }
        
        protected void addCriterion(final String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            this.criteria.add(new Criterion(condition));
        }
        
        protected void addCriterion(final String condition, final Object value, final String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            this.criteria.add(new Criterion(condition, value));
        }
        
        protected void addCriterion(final String condition, final Object value1, final Object value2, final String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            this.criteria.add(new Criterion(condition, value1, value2));
        }
        
        public Criteria andCustomerIdIsNull() {
            this.addCriterion("customer_id is null");
            return (Criteria)this;
        }
        
        public Criteria andCustomerIdIsNotNull() {
            this.addCriterion("customer_id is not null");
            return (Criteria)this;
        }
        
        public Criteria andCustomerIdEqualTo(final Long value) {
            this.addCriterion("customer_id =", value, "customerId");
            return (Criteria)this;
        }
        
        public Criteria andCustomerIdNotEqualTo(final Long value) {
            this.addCriterion("customer_id <>", value, "customerId");
            return (Criteria)this;
        }
        
        public Criteria andCustomerIdGreaterThan(final Long value) {
            this.addCriterion("customer_id >", value, "customerId");
            return (Criteria)this;
        }
        
        public Criteria andCustomerIdGreaterThanOrEqualTo(final Long value) {
            this.addCriterion("customer_id >=", value, "customerId");
            return (Criteria)this;
        }
        
        public Criteria andCustomerIdLessThan(final Long value) {
            this.addCriterion("customer_id <", value, "customerId");
            return (Criteria)this;
        }
        
        public Criteria andCustomerIdLessThanOrEqualTo(final Long value) {
            this.addCriterion("customer_id <=", value, "customerId");
            return (Criteria)this;
        }
        
        public Criteria andCustomerIdIn(final List<Long> values) {
            this.addCriterion("customer_id in", values, "customerId");
            return (Criteria)this;
        }
        
        public Criteria andCustomerIdNotIn(final List<Long> values) {
            this.addCriterion("customer_id not in", values, "customerId");
            return (Criteria)this;
        }
        
        public Criteria andCustomerIdBetween(final Long value1, final Long value2) {
            this.addCriterion("customer_id between", value1, value2, "customerId");
            return (Criteria)this;
        }
        
        public Criteria andCustomerIdNotBetween(final Long value1, final Long value2) {
            this.addCriterion("customer_id not between", value1, value2, "customerId");
            return (Criteria)this;
        }
        
        public Criteria andCustomerNameIsNull() {
            this.addCriterion("customer_name is null");
            return (Criteria)this;
        }
        
        public Criteria andCustomerNameIsNotNull() {
            this.addCriterion("customer_name is not null");
            return (Criteria)this;
        }
        
        public Criteria andCustomerNameEqualTo(final String value) {
            this.addCriterion("customer_name =", value, "customerName");
            return (Criteria)this;
        }
        
        public Criteria andCustomerNameNotEqualTo(final String value) {
            this.addCriterion("customer_name <>", value, "customerName");
            return (Criteria)this;
        }
        
        public Criteria andCustomerNameGreaterThan(final String value) {
            this.addCriterion("customer_name >", value, "customerName");
            return (Criteria)this;
        }
        
        public Criteria andCustomerNameGreaterThanOrEqualTo(final String value) {
            this.addCriterion("customer_name >=", value, "customerName");
            return (Criteria)this;
        }
        
        public Criteria andCustomerNameLessThan(final String value) {
            this.addCriterion("customer_name <", value, "customerName");
            return (Criteria)this;
        }
        
        public Criteria andCustomerNameLessThanOrEqualTo(final String value) {
            this.addCriterion("customer_name <=", value, "customerName");
            return (Criteria)this;
        }
        
        public Criteria andCustomerNameLike(final String value) {
            this.addCriterion("customer_name like", value, "customerName");
            return (Criteria)this;
        }
        
        public Criteria andCustomerNameNotLike(final String value) {
            this.addCriterion("customer_name not like", value, "customerName");
            return (Criteria)this;
        }
        
        public Criteria andCustomerNameIn(final List<String> values) {
            this.addCriterion("customer_name in", values, "customerName");
            return (Criteria)this;
        }
        
        public Criteria andCustomerNameNotIn(final List<String> values) {
            this.addCriterion("customer_name not in", values, "customerName");
            return (Criteria)this;
        }
        
        public Criteria andCustomerNameBetween(final String value1, final String value2) {
            this.addCriterion("customer_name between", value1, value2, "customerName");
            return (Criteria)this;
        }
        
        public Criteria andCustomerNameNotBetween(final String value1, final String value2) {
            this.addCriterion("customer_name not between", value1, value2, "customerName");
            return (Criteria)this;
        }
        
        public Criteria andPhoneIsNull() {
            this.addCriterion("phone is null");
            return (Criteria)this;
        }
        
        public Criteria andPhoneIsNotNull() {
            this.addCriterion("phone is not null");
            return (Criteria)this;
        }
        
        public Criteria andPhoneEqualTo(final String value) {
            this.addCriterion("phone =", value, "phone");
            return (Criteria)this;
        }
        
        public Criteria andPhoneNotEqualTo(final String value) {
            this.addCriterion("phone <>", value, "phone");
            return (Criteria)this;
        }
        
        public Criteria andPhoneGreaterThan(final String value) {
            this.addCriterion("phone >", value, "phone");
            return (Criteria)this;
        }
        
        public Criteria andPhoneGreaterThanOrEqualTo(final String value) {
            this.addCriterion("phone >=", value, "phone");
            return (Criteria)this;
        }
        
        public Criteria andPhoneLessThan(final String value) {
            this.addCriterion("phone <", value, "phone");
            return (Criteria)this;
        }
        
        public Criteria andPhoneLessThanOrEqualTo(final String value) {
            this.addCriterion("phone <=", value, "phone");
            return (Criteria)this;
        }
        
        public Criteria andPhoneLike(final String value) {
            this.addCriterion("phone like", value, "phone");
            return (Criteria)this;
        }
        
        public Criteria andPhoneNotLike(final String value) {
            this.addCriterion("phone not like", value, "phone");
            return (Criteria)this;
        }
        
        public Criteria andPhoneIn(final List<String> values) {
            this.addCriterion("phone in", values, "phone");
            return (Criteria)this;
        }
        
        public Criteria andPhoneNotIn(final List<String> values) {
            this.addCriterion("phone not in", values, "phone");
            return (Criteria)this;
        }
        
        public Criteria andPhoneBetween(final String value1, final String value2) {
            this.addCriterion("phone between", value1, value2, "phone");
            return (Criteria)this;
        }
        
        public Criteria andPhoneNotBetween(final String value1, final String value2) {
            this.addCriterion("phone not between", value1, value2, "phone");
            return (Criteria)this;
        }
        
        public Criteria andEmailIsNull() {
            this.addCriterion("email is null");
            return (Criteria)this;
        }
        
        public Criteria andEmailIsNotNull() {
            this.addCriterion("email is not null");
            return (Criteria)this;
        }
        
        public Criteria andEmailEqualTo(final String value) {
            this.addCriterion("email =", value, "email");
            return (Criteria)this;
        }
        
        public Criteria andEmailNotEqualTo(final String value) {
            this.addCriterion("email <>", value, "email");
            return (Criteria)this;
        }
        
        public Criteria andEmailGreaterThan(final String value) {
            this.addCriterion("email >", value, "email");
            return (Criteria)this;
        }
        
        public Criteria andEmailGreaterThanOrEqualTo(final String value) {
            this.addCriterion("email >=", value, "email");
            return (Criteria)this;
        }
        
        public Criteria andEmailLessThan(final String value) {
            this.addCriterion("email <", value, "email");
            return (Criteria)this;
        }
        
        public Criteria andEmailLessThanOrEqualTo(final String value) {
            this.addCriterion("email <=", value, "email");
            return (Criteria)this;
        }
        
        public Criteria andEmailLike(final String value) {
            this.addCriterion("email like", value, "email");
            return (Criteria)this;
        }
        
        public Criteria andEmailNotLike(final String value) {
            this.addCriterion("email not like", value, "email");
            return (Criteria)this;
        }
        
        public Criteria andEmailIn(final List<String> values) {
            this.addCriterion("email in", values, "email");
            return (Criteria)this;
        }
        
        public Criteria andEmailNotIn(final List<String> values) {
            this.addCriterion("email not in", values, "email");
            return (Criteria)this;
        }
        
        public Criteria andEmailBetween(final String value1, final String value2) {
            this.addCriterion("email between", value1, value2, "email");
            return (Criteria)this;
        }
        
        public Criteria andEmailNotBetween(final String value1, final String value2) {
            this.addCriterion("email not between", value1, value2, "email");
            return (Criteria)this;
        }
        
        public Criteria andAddressIsNull() {
            this.addCriterion("address is null");
            return (Criteria)this;
        }
        
        public Criteria andAddressIsNotNull() {
            this.addCriterion("address is not null");
            return (Criteria)this;
        }
        
        public Criteria andAddressEqualTo(final String value) {
            this.addCriterion("address =", value, "address");
            return (Criteria)this;
        }
        
        public Criteria andAddressNotEqualTo(final String value) {
            this.addCriterion("address <>", value, "address");
            return (Criteria)this;
        }
        
        public Criteria andAddressGreaterThan(final String value) {
            this.addCriterion("address >", value, "address");
            return (Criteria)this;
        }
        
        public Criteria andAddressGreaterThanOrEqualTo(final String value) {
            this.addCriterion("address >=", value, "address");
            return (Criteria)this;
        }
        
        public Criteria andAddressLessThan(final String value) {
            this.addCriterion("address <", value, "address");
            return (Criteria)this;
        }
        
        public Criteria andAddressLessThanOrEqualTo(final String value) {
            this.addCriterion("address <=", value, "address");
            return (Criteria)this;
        }
        
        public Criteria andAddressLike(final String value) {
            this.addCriterion("address like", value, "address");
            return (Criteria)this;
        }
        
        public Criteria andAddressNotLike(final String value) {
            this.addCriterion("address not like", value, "address");
            return (Criteria)this;
        }
        
        public Criteria andAddressIn(final List<String> values) {
            this.addCriterion("address in", values, "address");
            return (Criteria)this;
        }
        
        public Criteria andAddressNotIn(final List<String> values) {
            this.addCriterion("address not in", values, "address");
            return (Criteria)this;
        }
        
        public Criteria andAddressBetween(final String value1, final String value2) {
            this.addCriterion("address between", value1, value2, "address");
            return (Criteria)this;
        }
        
        public Criteria andAddressNotBetween(final String value1, final String value2) {
            this.addCriterion("address not between", value1, value2, "address");
            return (Criteria)this;
        }
        
        public Criteria andGenderIsNull() {
            this.addCriterion("gender is null");
            return (Criteria)this;
        }
        
        public Criteria andGenderIsNotNull() {
            this.addCriterion("gender is not null");
            return (Criteria)this;
        }
        
        public Criteria andGenderEqualTo(final Integer value) {
            this.addCriterion("gender =", value, "gender");
            return (Criteria)this;
        }
        
        public Criteria andGenderNotEqualTo(final Integer value) {
            this.addCriterion("gender <>", value, "gender");
            return (Criteria)this;
        }
        
        public Criteria andGenderGreaterThan(final Integer value) {
            this.addCriterion("gender >", value, "gender");
            return (Criteria)this;
        }
        
        public Criteria andGenderGreaterThanOrEqualTo(final Integer value) {
            this.addCriterion("gender >=", value, "gender");
            return (Criteria)this;
        }
        
        public Criteria andGenderLessThan(final Integer value) {
            this.addCriterion("gender <", value, "gender");
            return (Criteria)this;
        }
        
        public Criteria andGenderLessThanOrEqualTo(final Integer value) {
            this.addCriterion("gender <=", value, "gender");
            return (Criteria)this;
        }
        
        public Criteria andGenderIn(final List<Integer> values) {
            this.addCriterion("gender in", values, "gender");
            return (Criteria)this;
        }
        
        public Criteria andGenderNotIn(final List<Integer> values) {
            this.addCriterion("gender not in", values, "gender");
            return (Criteria)this;
        }
        
        public Criteria andGenderBetween(final Integer value1, final Integer value2) {
            this.addCriterion("gender between", value1, value2, "gender");
            return (Criteria)this;
        }
        
        public Criteria andGenderNotBetween(final Integer value1, final Integer value2) {
            this.addCriterion("gender not between", value1, value2, "gender");
            return (Criteria)this;
        }
        
        public Criteria andRemarkIsNull() {
            this.addCriterion("remark is null");
            return (Criteria)this;
        }
        
        public Criteria andRemarkIsNotNull() {
            this.addCriterion("remark is not null");
            return (Criteria)this;
        }
        
        public Criteria andRemarkEqualTo(final String value) {
            this.addCriterion("remark =", value, "remark");
            return (Criteria)this;
        }
        
        public Criteria andRemarkNotEqualTo(final String value) {
            this.addCriterion("remark <>", value, "remark");
            return (Criteria)this;
        }
        
        public Criteria andRemarkGreaterThan(final String value) {
            this.addCriterion("remark >", value, "remark");
            return (Criteria)this;
        }
        
        public Criteria andRemarkGreaterThanOrEqualTo(final String value) {
            this.addCriterion("remark >=", value, "remark");
            return (Criteria)this;
        }
        
        public Criteria andRemarkLessThan(final String value) {
            this.addCriterion("remark <", value, "remark");
            return (Criteria)this;
        }
        
        public Criteria andRemarkLessThanOrEqualTo(final String value) {
            this.addCriterion("remark <=", value, "remark");
            return (Criteria)this;
        }
        
        public Criteria andRemarkLike(final String value) {
            this.addCriterion("remark like", value, "remark");
            return (Criteria)this;
        }
        
        public Criteria andRemarkNotLike(final String value) {
            this.addCriterion("remark not like", value, "remark");
            return (Criteria)this;
        }
        
        public Criteria andRemarkIn(final List<String> values) {
            this.addCriterion("remark in", values, "remark");
            return (Criteria)this;
        }
        
        public Criteria andRemarkNotIn(final List<String> values) {
            this.addCriterion("remark not in", values, "remark");
            return (Criteria)this;
        }
        
        public Criteria andRemarkBetween(final String value1, final String value2) {
            this.addCriterion("remark between", value1, value2, "remark");
            return (Criteria)this;
        }
        
        public Criteria andRemarkNotBetween(final String value1, final String value2) {
            this.addCriterion("remark not between", value1, value2, "remark");
            return (Criteria)this;
        }
        
        public Criteria andIdCardIsNull() {
            this.addCriterion("id_card is null");
            return (Criteria)this;
        }
        
        public Criteria andIdCardIsNotNull() {
            this.addCriterion("id_card is not null");
            return (Criteria)this;
        }
        
        public Criteria andIdCardEqualTo(final String value) {
            this.addCriterion("id_card =", value, "idCard");
            return (Criteria)this;
        }
        
        public Criteria andIdCardNotEqualTo(final String value) {
            this.addCriterion("id_card <>", value, "idCard");
            return (Criteria)this;
        }
        
        public Criteria andIdCardGreaterThan(final String value) {
            this.addCriterion("id_card >", value, "idCard");
            return (Criteria)this;
        }
        
        public Criteria andIdCardGreaterThanOrEqualTo(final String value) {
            this.addCriterion("id_card >=", value, "idCard");
            return (Criteria)this;
        }
        
        public Criteria andIdCardLessThan(final String value) {
            this.addCriterion("id_card <", value, "idCard");
            return (Criteria)this;
        }
        
        public Criteria andIdCardLessThanOrEqualTo(final String value) {
            this.addCriterion("id_card <=", value, "idCard");
            return (Criteria)this;
        }
        
        public Criteria andIdCardLike(final String value) {
            this.addCriterion("id_card like", value, "idCard");
            return (Criteria)this;
        }
        
        public Criteria andIdCardNotLike(final String value) {
            this.addCriterion("id_card not like", value, "idCard");
            return (Criteria)this;
        }
        
        public Criteria andIdCardIn(final List<String> values) {
            this.addCriterion("id_card in", values, "idCard");
            return (Criteria)this;
        }
        
        public Criteria andIdCardNotIn(final List<String> values) {
            this.addCriterion("id_card not in", values, "idCard");
            return (Criteria)this;
        }
        
        public Criteria andIdCardBetween(final String value1, final String value2) {
            this.addCriterion("id_card between", value1, value2, "idCard");
            return (Criteria)this;
        }
        
        public Criteria andIdCardNotBetween(final String value1, final String value2) {
            this.addCriterion("id_card not between", value1, value2, "idCard");
            return (Criteria)this;
        }
        
        public Criteria andUserIdIsNull() {
            this.addCriterion("user_id is null");
            return (Criteria)this;
        }
        
        public Criteria andUserIdIsNotNull() {
            this.addCriterion("user_id is not null");
            return (Criteria)this;
        }
        
        public Criteria andUserIdEqualTo(final Long value) {
            this.addCriterion("user_id =", value, "userId");
            return (Criteria)this;
        }
        
        public Criteria andUserIdNotEqualTo(final Long value) {
            this.addCriterion("user_id <>", value, "userId");
            return (Criteria)this;
        }
        
        public Criteria andUserIdGreaterThan(final Long value) {
            this.addCriterion("user_id >", value, "userId");
            return (Criteria)this;
        }
        
        public Criteria andUserIdGreaterThanOrEqualTo(final Long value) {
            this.addCriterion("user_id >=", value, "userId");
            return (Criteria)this;
        }
        
        public Criteria andUserIdLessThan(final Long value) {
            this.addCriterion("user_id <", value, "userId");
            return (Criteria)this;
        }
        
        public Criteria andUserIdLessThanOrEqualTo(final Long value) {
            this.addCriterion("user_id <=", value, "userId");
            return (Criteria)this;
        }
        
        public Criteria andUserIdIn(final List<Long> values) {
            this.addCriterion("user_id in", values, "userId");
            return (Criteria)this;
        }
        
        public Criteria andUserIdNotIn(final List<Long> values) {
            this.addCriterion("user_id not in", values, "userId");
            return (Criteria)this;
        }
        
        public Criteria andUserIdBetween(final Long value1, final Long value2) {
            this.addCriterion("user_id between", value1, value2, "userId");
            return (Criteria)this;
        }
        
        public Criteria andUserIdNotBetween(final Long value1, final Long value2) {
            this.addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria)this;
        }
        
        public Criteria andLocationIdIsNull() {
            this.addCriterion("location_id is null");
            return (Criteria)this;
        }
        
        public Criteria andLocationIdIsNotNull() {
            this.addCriterion("location_id is not null");
            return (Criteria)this;
        }
        
        public Criteria andLocationIdEqualTo(final Long value) {
            this.addCriterion("location_id =", value, "locationId");
            return (Criteria)this;
        }
        
        public Criteria andLocationIdNotEqualTo(final Long value) {
            this.addCriterion("location_id <>", value, "locationId");
            return (Criteria)this;
        }
        
        public Criteria andLocationIdGreaterThan(final Long value) {
            this.addCriterion("location_id >", value, "locationId");
            return (Criteria)this;
        }
        
        public Criteria andLocationIdGreaterThanOrEqualTo(final Long value) {
            this.addCriterion("location_id >=", value, "locationId");
            return (Criteria)this;
        }
        
        public Criteria andLocationIdLessThan(final Long value) {
            this.addCriterion("location_id <", value, "locationId");
            return (Criteria)this;
        }
        
        public Criteria andLocationIdLessThanOrEqualTo(final Long value) {
            this.addCriterion("location_id <=", value, "locationId");
            return (Criteria)this;
        }
        
        public Criteria andLocationIdIn(final List<Long> values) {
            this.addCriterion("location_id in", values, "locationId");
            return (Criteria)this;
        }
        
        public Criteria andLocationIdNotIn(final List<Long> values) {
            this.addCriterion("location_id not in", values, "locationId");
            return (Criteria)this;
        }
        
        public Criteria andLocationIdBetween(final Long value1, final Long value2) {
            this.addCriterion("location_id between", value1, value2, "locationId");
            return (Criteria)this;
        }
        
        public Criteria andLocationIdNotBetween(final Long value1, final Long value2) {
            this.addCriterion("location_id not between", value1, value2, "locationId");
            return (Criteria)this;
        }
    }
    
    public static class Criterion
    {
        private String condition;
        private Object value;
        private Object secondValue;
        private boolean noValue;
        private boolean singleValue;
        private boolean betweenValue;
        private boolean listValue;
        private String typeHandler;
        
        public String getCondition() {
            return this.condition;
        }
        
        public Object getValue() {
            return this.value;
        }
        
        public Object getSecondValue() {
            return this.secondValue;
        }
        
        public boolean isNoValue() {
            return this.noValue;
        }
        
        public boolean isSingleValue() {
            return this.singleValue;
        }
        
        public boolean isBetweenValue() {
            return this.betweenValue;
        }
        
        public boolean isListValue() {
            return this.listValue;
        }
        
        public String getTypeHandler() {
            return this.typeHandler;
        }
        
        protected Criterion(final String condition) {
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }
        
        protected Criterion(final String condition, final Object value, final String typeHandler) {
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List) {
                this.listValue = true;
            }
            else {
                this.singleValue = true;
            }
        }
        
        protected Criterion(final String condition, final Object value) {
            this(condition, value, null);
        }
        
        protected Criterion(final String condition, final Object value, final Object secondValue, final String typeHandler) {
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }
        
        protected Criterion(final String condition, final Object value, final Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
