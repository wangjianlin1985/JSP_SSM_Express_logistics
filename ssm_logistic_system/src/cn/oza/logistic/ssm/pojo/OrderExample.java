// 
// 
// 

package cn.oza.logistic.ssm.pojo;

import java.util.ArrayList;
import java.util.List;

public class OrderExample
{
    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;
    
    public OrderExample() {
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
        
        public Criteria andOrderIdIsNull() {
            this.addCriterion("order_id is null");
            return (Criteria)this;
        }
        
        public Criteria andOrderIdIsNotNull() {
            this.addCriterion("order_id is not null");
            return (Criteria)this;
        }
        
        public Criteria andOrderIdEqualTo(final Long value) {
            this.addCriterion("order_id =", value, "orderId");
            return (Criteria)this;
        }
        
        public Criteria andOrderIdNotEqualTo(final Long value) {
            this.addCriterion("order_id <>", value, "orderId");
            return (Criteria)this;
        }
        
        public Criteria andOrderIdGreaterThan(final Long value) {
            this.addCriterion("order_id >", value, "orderId");
            return (Criteria)this;
        }
        
        public Criteria andOrderIdGreaterThanOrEqualTo(final Long value) {
            this.addCriterion("order_id >=", value, "orderId");
            return (Criteria)this;
        }
        
        public Criteria andOrderIdLessThan(final Long value) {
            this.addCriterion("order_id <", value, "orderId");
            return (Criteria)this;
        }
        
        public Criteria andOrderIdLessThanOrEqualTo(final Long value) {
            this.addCriterion("order_id <=", value, "orderId");
            return (Criteria)this;
        }
        
        public Criteria andOrderIdIn(final List<Long> values) {
            this.addCriterion("order_id in", values, "orderId");
            return (Criteria)this;
        }
        
        public Criteria andOrderIdNotIn(final List<Long> values) {
            this.addCriterion("order_id not in", values, "orderId");
            return (Criteria)this;
        }
        
        public Criteria andOrderIdBetween(final Long value1, final Long value2) {
            this.addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria)this;
        }
        
        public Criteria andOrderIdNotBetween(final Long value1, final Long value2) {
            this.addCriterion("order_id not between", value1, value2, "orderId");
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
        
        public Criteria andShippingAddressIsNull() {
            this.addCriterion("shipping_address is null");
            return (Criteria)this;
        }
        
        public Criteria andShippingAddressIsNotNull() {
            this.addCriterion("shipping_address is not null");
            return (Criteria)this;
        }
        
        public Criteria andShippingAddressEqualTo(final String value) {
            this.addCriterion("shipping_address =", value, "shippingAddress");
            return (Criteria)this;
        }
        
        public Criteria andShippingAddressNotEqualTo(final String value) {
            this.addCriterion("shipping_address <>", value, "shippingAddress");
            return (Criteria)this;
        }
        
        public Criteria andShippingAddressGreaterThan(final String value) {
            this.addCriterion("shipping_address >", value, "shippingAddress");
            return (Criteria)this;
        }
        
        public Criteria andShippingAddressGreaterThanOrEqualTo(final String value) {
            this.addCriterion("shipping_address >=", value, "shippingAddress");
            return (Criteria)this;
        }
        
        public Criteria andShippingAddressLessThan(final String value) {
            this.addCriterion("shipping_address <", value, "shippingAddress");
            return (Criteria)this;
        }
        
        public Criteria andShippingAddressLessThanOrEqualTo(final String value) {
            this.addCriterion("shipping_address <=", value, "shippingAddress");
            return (Criteria)this;
        }
        
        public Criteria andShippingAddressLike(final String value) {
            this.addCriterion("shipping_address like", value, "shippingAddress");
            return (Criteria)this;
        }
        
        public Criteria andShippingAddressNotLike(final String value) {
            this.addCriterion("shipping_address not like", value, "shippingAddress");
            return (Criteria)this;
        }
        
        public Criteria andShippingAddressIn(final List<String> values) {
            this.addCriterion("shipping_address in", values, "shippingAddress");
            return (Criteria)this;
        }
        
        public Criteria andShippingAddressNotIn(final List<String> values) {
            this.addCriterion("shipping_address not in", values, "shippingAddress");
            return (Criteria)this;
        }
        
        public Criteria andShippingAddressBetween(final String value1, final String value2) {
            this.addCriterion("shipping_address between", value1, value2, "shippingAddress");
            return (Criteria)this;
        }
        
        public Criteria andShippingAddressNotBetween(final String value1, final String value2) {
            this.addCriterion("shipping_address not between", value1, value2, "shippingAddress");
            return (Criteria)this;
        }
        
        public Criteria andShippingNameIsNull() {
            this.addCriterion("shipping_name is null");
            return (Criteria)this;
        }
        
        public Criteria andShippingNameIsNotNull() {
            this.addCriterion("shipping_name is not null");
            return (Criteria)this;
        }
        
        public Criteria andShippingNameEqualTo(final String value) {
            this.addCriterion("shipping_name =", value, "shippingName");
            return (Criteria)this;
        }
        
        public Criteria andShippingNameNotEqualTo(final String value) {
            this.addCriterion("shipping_name <>", value, "shippingName");
            return (Criteria)this;
        }
        
        public Criteria andShippingNameGreaterThan(final String value) {
            this.addCriterion("shipping_name >", value, "shippingName");
            return (Criteria)this;
        }
        
        public Criteria andShippingNameGreaterThanOrEqualTo(final String value) {
            this.addCriterion("shipping_name >=", value, "shippingName");
            return (Criteria)this;
        }
        
        public Criteria andShippingNameLessThan(final String value) {
            this.addCriterion("shipping_name <", value, "shippingName");
            return (Criteria)this;
        }
        
        public Criteria andShippingNameLessThanOrEqualTo(final String value) {
            this.addCriterion("shipping_name <=", value, "shippingName");
            return (Criteria)this;
        }
        
        public Criteria andShippingNameLike(final String value) {
            this.addCriterion("shipping_name like", value, "shippingName");
            return (Criteria)this;
        }
        
        public Criteria andShippingNameNotLike(final String value) {
            this.addCriterion("shipping_name not like", value, "shippingName");
            return (Criteria)this;
        }
        
        public Criteria andShippingNameIn(final List<String> values) {
            this.addCriterion("shipping_name in", values, "shippingName");
            return (Criteria)this;
        }
        
        public Criteria andShippingNameNotIn(final List<String> values) {
            this.addCriterion("shipping_name not in", values, "shippingName");
            return (Criteria)this;
        }
        
        public Criteria andShippingNameBetween(final String value1, final String value2) {
            this.addCriterion("shipping_name between", value1, value2, "shippingName");
            return (Criteria)this;
        }
        
        public Criteria andShippingNameNotBetween(final String value1, final String value2) {
            this.addCriterion("shipping_name not between", value1, value2, "shippingName");
            return (Criteria)this;
        }
        
        public Criteria andShippingPhoneIsNull() {
            this.addCriterion("shipping_phone is null");
            return (Criteria)this;
        }
        
        public Criteria andShippingPhoneIsNotNull() {
            this.addCriterion("shipping_phone is not null");
            return (Criteria)this;
        }
        
        public Criteria andShippingPhoneEqualTo(final String value) {
            this.addCriterion("shipping_phone =", value, "shippingPhone");
            return (Criteria)this;
        }
        
        public Criteria andShippingPhoneNotEqualTo(final String value) {
            this.addCriterion("shipping_phone <>", value, "shippingPhone");
            return (Criteria)this;
        }
        
        public Criteria andShippingPhoneGreaterThan(final String value) {
            this.addCriterion("shipping_phone >", value, "shippingPhone");
            return (Criteria)this;
        }
        
        public Criteria andShippingPhoneGreaterThanOrEqualTo(final String value) {
            this.addCriterion("shipping_phone >=", value, "shippingPhone");
            return (Criteria)this;
        }
        
        public Criteria andShippingPhoneLessThan(final String value) {
            this.addCriterion("shipping_phone <", value, "shippingPhone");
            return (Criteria)this;
        }
        
        public Criteria andShippingPhoneLessThanOrEqualTo(final String value) {
            this.addCriterion("shipping_phone <=", value, "shippingPhone");
            return (Criteria)this;
        }
        
        public Criteria andShippingPhoneLike(final String value) {
            this.addCriterion("shipping_phone like", value, "shippingPhone");
            return (Criteria)this;
        }
        
        public Criteria andShippingPhoneNotLike(final String value) {
            this.addCriterion("shipping_phone not like", value, "shippingPhone");
            return (Criteria)this;
        }
        
        public Criteria andShippingPhoneIn(final List<String> values) {
            this.addCriterion("shipping_phone in", values, "shippingPhone");
            return (Criteria)this;
        }
        
        public Criteria andShippingPhoneNotIn(final List<String> values) {
            this.addCriterion("shipping_phone not in", values, "shippingPhone");
            return (Criteria)this;
        }
        
        public Criteria andShippingPhoneBetween(final String value1, final String value2) {
            this.addCriterion("shipping_phone between", value1, value2, "shippingPhone");
            return (Criteria)this;
        }
        
        public Criteria andShippingPhoneNotBetween(final String value1, final String value2) {
            this.addCriterion("shipping_phone not between", value1, value2, "shippingPhone");
            return (Criteria)this;
        }
        
        public Criteria andTakeNameIsNull() {
            this.addCriterion("take_name is null");
            return (Criteria)this;
        }
        
        public Criteria andTakeNameIsNotNull() {
            this.addCriterion("take_name is not null");
            return (Criteria)this;
        }
        
        public Criteria andTakeNameEqualTo(final String value) {
            this.addCriterion("take_name =", value, "takeName");
            return (Criteria)this;
        }
        
        public Criteria andTakeNameNotEqualTo(final String value) {
            this.addCriterion("take_name <>", value, "takeName");
            return (Criteria)this;
        }
        
        public Criteria andTakeNameGreaterThan(final String value) {
            this.addCriterion("take_name >", value, "takeName");
            return (Criteria)this;
        }
        
        public Criteria andTakeNameGreaterThanOrEqualTo(final String value) {
            this.addCriterion("take_name >=", value, "takeName");
            return (Criteria)this;
        }
        
        public Criteria andTakeNameLessThan(final String value) {
            this.addCriterion("take_name <", value, "takeName");
            return (Criteria)this;
        }
        
        public Criteria andTakeNameLessThanOrEqualTo(final String value) {
            this.addCriterion("take_name <=", value, "takeName");
            return (Criteria)this;
        }
        
        public Criteria andTakeNameLike(final String value) {
            this.addCriterion("take_name like", value, "takeName");
            return (Criteria)this;
        }
        
        public Criteria andTakeNameNotLike(final String value) {
            this.addCriterion("take_name not like", value, "takeName");
            return (Criteria)this;
        }
        
        public Criteria andTakeNameIn(final List<String> values) {
            this.addCriterion("take_name in", values, "takeName");
            return (Criteria)this;
        }
        
        public Criteria andTakeNameNotIn(final List<String> values) {
            this.addCriterion("take_name not in", values, "takeName");
            return (Criteria)this;
        }
        
        public Criteria andTakeNameBetween(final String value1, final String value2) {
            this.addCriterion("take_name between", value1, value2, "takeName");
            return (Criteria)this;
        }
        
        public Criteria andTakeNameNotBetween(final String value1, final String value2) {
            this.addCriterion("take_name not between", value1, value2, "takeName");
            return (Criteria)this;
        }
        
        public Criteria andTakeAddressIsNull() {
            this.addCriterion("take_address is null");
            return (Criteria)this;
        }
        
        public Criteria andTakeAddressIsNotNull() {
            this.addCriterion("take_address is not null");
            return (Criteria)this;
        }
        
        public Criteria andTakeAddressEqualTo(final String value) {
            this.addCriterion("take_address =", value, "takeAddress");
            return (Criteria)this;
        }
        
        public Criteria andTakeAddressNotEqualTo(final String value) {
            this.addCriterion("take_address <>", value, "takeAddress");
            return (Criteria)this;
        }
        
        public Criteria andTakeAddressGreaterThan(final String value) {
            this.addCriterion("take_address >", value, "takeAddress");
            return (Criteria)this;
        }
        
        public Criteria andTakeAddressGreaterThanOrEqualTo(final String value) {
            this.addCriterion("take_address >=", value, "takeAddress");
            return (Criteria)this;
        }
        
        public Criteria andTakeAddressLessThan(final String value) {
            this.addCriterion("take_address <", value, "takeAddress");
            return (Criteria)this;
        }
        
        public Criteria andTakeAddressLessThanOrEqualTo(final String value) {
            this.addCriterion("take_address <=", value, "takeAddress");
            return (Criteria)this;
        }
        
        public Criteria andTakeAddressLike(final String value) {
            this.addCriterion("take_address like", value, "takeAddress");
            return (Criteria)this;
        }
        
        public Criteria andTakeAddressNotLike(final String value) {
            this.addCriterion("take_address not like", value, "takeAddress");
            return (Criteria)this;
        }
        
        public Criteria andTakeAddressIn(final List<String> values) {
            this.addCriterion("take_address in", values, "takeAddress");
            return (Criteria)this;
        }
        
        public Criteria andTakeAddressNotIn(final List<String> values) {
            this.addCriterion("take_address not in", values, "takeAddress");
            return (Criteria)this;
        }
        
        public Criteria andTakeAddressBetween(final String value1, final String value2) {
            this.addCriterion("take_address between", value1, value2, "takeAddress");
            return (Criteria)this;
        }
        
        public Criteria andTakeAddressNotBetween(final String value1, final String value2) {
            this.addCriterion("take_address not between", value1, value2, "takeAddress");
            return (Criteria)this;
        }
        
        public Criteria andTakePhoneIsNull() {
            this.addCriterion("take_phone is null");
            return (Criteria)this;
        }
        
        public Criteria andTakePhoneIsNotNull() {
            this.addCriterion("take_phone is not null");
            return (Criteria)this;
        }
        
        public Criteria andTakePhoneEqualTo(final String value) {
            this.addCriterion("take_phone =", value, "takePhone");
            return (Criteria)this;
        }
        
        public Criteria andTakePhoneNotEqualTo(final String value) {
            this.addCriterion("take_phone <>", value, "takePhone");
            return (Criteria)this;
        }
        
        public Criteria andTakePhoneGreaterThan(final String value) {
            this.addCriterion("take_phone >", value, "takePhone");
            return (Criteria)this;
        }
        
        public Criteria andTakePhoneGreaterThanOrEqualTo(final String value) {
            this.addCriterion("take_phone >=", value, "takePhone");
            return (Criteria)this;
        }
        
        public Criteria andTakePhoneLessThan(final String value) {
            this.addCriterion("take_phone <", value, "takePhone");
            return (Criteria)this;
        }
        
        public Criteria andTakePhoneLessThanOrEqualTo(final String value) {
            this.addCriterion("take_phone <=", value, "takePhone");
            return (Criteria)this;
        }
        
        public Criteria andTakePhoneLike(final String value) {
            this.addCriterion("take_phone like", value, "takePhone");
            return (Criteria)this;
        }
        
        public Criteria andTakePhoneNotLike(final String value) {
            this.addCriterion("take_phone not like", value, "takePhone");
            return (Criteria)this;
        }
        
        public Criteria andTakePhoneIn(final List<String> values) {
            this.addCriterion("take_phone in", values, "takePhone");
            return (Criteria)this;
        }
        
        public Criteria andTakePhoneNotIn(final List<String> values) {
            this.addCriterion("take_phone not in", values, "takePhone");
            return (Criteria)this;
        }
        
        public Criteria andTakePhoneBetween(final String value1, final String value2) {
            this.addCriterion("take_phone between", value1, value2, "takePhone");
            return (Criteria)this;
        }
        
        public Criteria andTakePhoneNotBetween(final String value1, final String value2) {
            this.addCriterion("take_phone not between", value1, value2, "takePhone");
            return (Criteria)this;
        }
        
        public Criteria andOrderStatusIsNull() {
            this.addCriterion("order_status is null");
            return (Criteria)this;
        }
        
        public Criteria andOrderStatusIsNotNull() {
            this.addCriterion("order_status is not null");
            return (Criteria)this;
        }
        
        public Criteria andOrderStatusEqualTo(final Integer value) {
            this.addCriterion("order_status =", value, "orderStatus");
            return (Criteria)this;
        }
        
        public Criteria andOrderStatusNotEqualTo(final Integer value) {
            this.addCriterion("order_status <>", value, "orderStatus");
            return (Criteria)this;
        }
        
        public Criteria andOrderStatusGreaterThan(final Integer value) {
            this.addCriterion("order_status >", value, "orderStatus");
            return (Criteria)this;
        }
        
        public Criteria andOrderStatusGreaterThanOrEqualTo(final Integer value) {
            this.addCriterion("order_status >=", value, "orderStatus");
            return (Criteria)this;
        }
        
        public Criteria andOrderStatusLessThan(final Integer value) {
            this.addCriterion("order_status <", value, "orderStatus");
            return (Criteria)this;
        }
        
        public Criteria andOrderStatusLessThanOrEqualTo(final Integer value) {
            this.addCriterion("order_status <=", value, "orderStatus");
            return (Criteria)this;
        }
        
        public Criteria andOrderStatusIn(final List<Integer> values) {
            this.addCriterion("order_status in", values, "orderStatus");
            return (Criteria)this;
        }
        
        public Criteria andOrderStatusNotIn(final List<Integer> values) {
            this.addCriterion("order_status not in", values, "orderStatus");
            return (Criteria)this;
        }
        
        public Criteria andOrderStatusBetween(final Integer value1, final Integer value2) {
            this.addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria)this;
        }
        
        public Criteria andOrderStatusNotBetween(final Integer value1, final Integer value2) {
            this.addCriterion("order_status not between", value1, value2, "orderStatus");
            return (Criteria)this;
        }
        
        public Criteria andPaymentMethodIdIsNull() {
            this.addCriterion("payment_method_id is null");
            return (Criteria)this;
        }
        
        public Criteria andPaymentMethodIdIsNotNull() {
            this.addCriterion("payment_method_id is not null");
            return (Criteria)this;
        }
        
        public Criteria andPaymentMethodIdEqualTo(final Long value) {
            this.addCriterion("payment_method_id =", value, "paymentMethodId");
            return (Criteria)this;
        }
        
        public Criteria andPaymentMethodIdNotEqualTo(final Long value) {
            this.addCriterion("payment_method_id <>", value, "paymentMethodId");
            return (Criteria)this;
        }
        
        public Criteria andPaymentMethodIdGreaterThan(final Long value) {
            this.addCriterion("payment_method_id >", value, "paymentMethodId");
            return (Criteria)this;
        }
        
        public Criteria andPaymentMethodIdGreaterThanOrEqualTo(final Long value) {
            this.addCriterion("payment_method_id >=", value, "paymentMethodId");
            return (Criteria)this;
        }
        
        public Criteria andPaymentMethodIdLessThan(final Long value) {
            this.addCriterion("payment_method_id <", value, "paymentMethodId");
            return (Criteria)this;
        }
        
        public Criteria andPaymentMethodIdLessThanOrEqualTo(final Long value) {
            this.addCriterion("payment_method_id <=", value, "paymentMethodId");
            return (Criteria)this;
        }
        
        public Criteria andPaymentMethodIdIn(final List<Long> values) {
            this.addCriterion("payment_method_id in", values, "paymentMethodId");
            return (Criteria)this;
        }
        
        public Criteria andPaymentMethodIdNotIn(final List<Long> values) {
            this.addCriterion("payment_method_id not in", values, "paymentMethodId");
            return (Criteria)this;
        }
        
        public Criteria andPaymentMethodIdBetween(final Long value1, final Long value2) {
            this.addCriterion("payment_method_id between", value1, value2, "paymentMethodId");
            return (Criteria)this;
        }
        
        public Criteria andPaymentMethodIdNotBetween(final Long value1, final Long value2) {
            this.addCriterion("payment_method_id not between", value1, value2, "paymentMethodId");
            return (Criteria)this;
        }
        
        public Criteria andIntervalIdIsNull() {
            this.addCriterion("interval_id is null");
            return (Criteria)this;
        }
        
        public Criteria andIntervalIdIsNotNull() {
            this.addCriterion("interval_id is not null");
            return (Criteria)this;
        }
        
        public Criteria andIntervalIdEqualTo(final Long value) {
            this.addCriterion("interval_id =", value, "intervalId");
            return (Criteria)this;
        }
        
        public Criteria andIntervalIdNotEqualTo(final Long value) {
            this.addCriterion("interval_id <>", value, "intervalId");
            return (Criteria)this;
        }
        
        public Criteria andIntervalIdGreaterThan(final Long value) {
            this.addCriterion("interval_id >", value, "intervalId");
            return (Criteria)this;
        }
        
        public Criteria andIntervalIdGreaterThanOrEqualTo(final Long value) {
            this.addCriterion("interval_id >=", value, "intervalId");
            return (Criteria)this;
        }
        
        public Criteria andIntervalIdLessThan(final Long value) {
            this.addCriterion("interval_id <", value, "intervalId");
            return (Criteria)this;
        }
        
        public Criteria andIntervalIdLessThanOrEqualTo(final Long value) {
            this.addCriterion("interval_id <=", value, "intervalId");
            return (Criteria)this;
        }
        
        public Criteria andIntervalIdIn(final List<Long> values) {
            this.addCriterion("interval_id in", values, "intervalId");
            return (Criteria)this;
        }
        
        public Criteria andIntervalIdNotIn(final List<Long> values) {
            this.addCriterion("interval_id not in", values, "intervalId");
            return (Criteria)this;
        }
        
        public Criteria andIntervalIdBetween(final Long value1, final Long value2) {
            this.addCriterion("interval_id between", value1, value2, "intervalId");
            return (Criteria)this;
        }
        
        public Criteria andIntervalIdNotBetween(final Long value1, final Long value2) {
            this.addCriterion("interval_id not between", value1, value2, "intervalId");
            return (Criteria)this;
        }
        
        public Criteria andTakeMethodIdIsNull() {
            this.addCriterion("take_method_id is null");
            return (Criteria)this;
        }
        
        public Criteria andTakeMethodIdIsNotNull() {
            this.addCriterion("take_method_id is not null");
            return (Criteria)this;
        }
        
        public Criteria andTakeMethodIdEqualTo(final Long value) {
            this.addCriterion("take_method_id =", value, "takeMethodId");
            return (Criteria)this;
        }
        
        public Criteria andTakeMethodIdNotEqualTo(final Long value) {
            this.addCriterion("take_method_id <>", value, "takeMethodId");
            return (Criteria)this;
        }
        
        public Criteria andTakeMethodIdGreaterThan(final Long value) {
            this.addCriterion("take_method_id >", value, "takeMethodId");
            return (Criteria)this;
        }
        
        public Criteria andTakeMethodIdGreaterThanOrEqualTo(final Long value) {
            this.addCriterion("take_method_id >=", value, "takeMethodId");
            return (Criteria)this;
        }
        
        public Criteria andTakeMethodIdLessThan(final Long value) {
            this.addCriterion("take_method_id <", value, "takeMethodId");
            return (Criteria)this;
        }
        
        public Criteria andTakeMethodIdLessThanOrEqualTo(final Long value) {
            this.addCriterion("take_method_id <=", value, "takeMethodId");
            return (Criteria)this;
        }
        
        public Criteria andTakeMethodIdIn(final List<Long> values) {
            this.addCriterion("take_method_id in", values, "takeMethodId");
            return (Criteria)this;
        }
        
        public Criteria andTakeMethodIdNotIn(final List<Long> values) {
            this.addCriterion("take_method_id not in", values, "takeMethodId");
            return (Criteria)this;
        }
        
        public Criteria andTakeMethodIdBetween(final Long value1, final Long value2) {
            this.addCriterion("take_method_id between", value1, value2, "takeMethodId");
            return (Criteria)this;
        }
        
        public Criteria andTakeMethodIdNotBetween(final Long value1, final Long value2) {
            this.addCriterion("take_method_id not between", value1, value2, "takeMethodId");
            return (Criteria)this;
        }
        
        public Criteria andFreightMethodIdIsNull() {
            this.addCriterion("freight_method_id is null");
            return (Criteria)this;
        }
        
        public Criteria andFreightMethodIdIsNotNull() {
            this.addCriterion("freight_method_id is not null");
            return (Criteria)this;
        }
        
        public Criteria andFreightMethodIdEqualTo(final Long value) {
            this.addCriterion("freight_method_id =", value, "freightMethodId");
            return (Criteria)this;
        }
        
        public Criteria andFreightMethodIdNotEqualTo(final Long value) {
            this.addCriterion("freight_method_id <>", value, "freightMethodId");
            return (Criteria)this;
        }
        
        public Criteria andFreightMethodIdGreaterThan(final Long value) {
            this.addCriterion("freight_method_id >", value, "freightMethodId");
            return (Criteria)this;
        }
        
        public Criteria andFreightMethodIdGreaterThanOrEqualTo(final Long value) {
            this.addCriterion("freight_method_id >=", value, "freightMethodId");
            return (Criteria)this;
        }
        
        public Criteria andFreightMethodIdLessThan(final Long value) {
            this.addCriterion("freight_method_id <", value, "freightMethodId");
            return (Criteria)this;
        }
        
        public Criteria andFreightMethodIdLessThanOrEqualTo(final Long value) {
            this.addCriterion("freight_method_id <=", value, "freightMethodId");
            return (Criteria)this;
        }
        
        public Criteria andFreightMethodIdIn(final List<Long> values) {
            this.addCriterion("freight_method_id in", values, "freightMethodId");
            return (Criteria)this;
        }
        
        public Criteria andFreightMethodIdNotIn(final List<Long> values) {
            this.addCriterion("freight_method_id not in", values, "freightMethodId");
            return (Criteria)this;
        }
        
        public Criteria andFreightMethodIdBetween(final Long value1, final Long value2) {
            this.addCriterion("freight_method_id between", value1, value2, "freightMethodId");
            return (Criteria)this;
        }
        
        public Criteria andFreightMethodIdNotBetween(final Long value1, final Long value2) {
            this.addCriterion("freight_method_id not between", value1, value2, "freightMethodId");
            return (Criteria)this;
        }
        
        public Criteria andOrderRemarkIsNull() {
            this.addCriterion("order_remark is null");
            return (Criteria)this;
        }
        
        public Criteria andOrderRemarkIsNotNull() {
            this.addCriterion("order_remark is not null");
            return (Criteria)this;
        }
        
        public Criteria andOrderRemarkEqualTo(final String value) {
            this.addCriterion("order_remark =", value, "orderRemark");
            return (Criteria)this;
        }
        
        public Criteria andOrderRemarkNotEqualTo(final String value) {
            this.addCriterion("order_remark <>", value, "orderRemark");
            return (Criteria)this;
        }
        
        public Criteria andOrderRemarkGreaterThan(final String value) {
            this.addCriterion("order_remark >", value, "orderRemark");
            return (Criteria)this;
        }
        
        public Criteria andOrderRemarkGreaterThanOrEqualTo(final String value) {
            this.addCriterion("order_remark >=", value, "orderRemark");
            return (Criteria)this;
        }
        
        public Criteria andOrderRemarkLessThan(final String value) {
            this.addCriterion("order_remark <", value, "orderRemark");
            return (Criteria)this;
        }
        
        public Criteria andOrderRemarkLessThanOrEqualTo(final String value) {
            this.addCriterion("order_remark <=", value, "orderRemark");
            return (Criteria)this;
        }
        
        public Criteria andOrderRemarkLike(final String value) {
            this.addCriterion("order_remark like", value, "orderRemark");
            return (Criteria)this;
        }
        
        public Criteria andOrderRemarkNotLike(final String value) {
            this.addCriterion("order_remark not like", value, "orderRemark");
            return (Criteria)this;
        }
        
        public Criteria andOrderRemarkIn(final List<String> values) {
            this.addCriterion("order_remark in", values, "orderRemark");
            return (Criteria)this;
        }
        
        public Criteria andOrderRemarkNotIn(final List<String> values) {
            this.addCriterion("order_remark not in", values, "orderRemark");
            return (Criteria)this;
        }
        
        public Criteria andOrderRemarkBetween(final String value1, final String value2) {
            this.addCriterion("order_remark between", value1, value2, "orderRemark");
            return (Criteria)this;
        }
        
        public Criteria andOrderRemarkNotBetween(final String value1, final String value2) {
            this.addCriterion("order_remark not between", value1, value2, "orderRemark");
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
