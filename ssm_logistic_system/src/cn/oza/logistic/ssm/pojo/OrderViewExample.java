// 
// 
// 

package cn.oza.logistic.ssm.pojo;

import java.util.ArrayList;
import java.util.List;

public class OrderViewExample
{
    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;
    
    public OrderViewExample() {
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
        
        public Criteria andCustomerPhoneIsNull() {
            this.addCriterion("customer_phone is null");
            return (Criteria)this;
        }
        
        public Criteria andCustomerPhoneIsNotNull() {
            this.addCriterion("customer_phone is not null");
            return (Criteria)this;
        }
        
        public Criteria andCustomerPhoneEqualTo(final String value) {
            this.addCriterion("customer_phone =", value, "customerPhone");
            return (Criteria)this;
        }
        
        public Criteria andCustomerPhoneNotEqualTo(final String value) {
            this.addCriterion("customer_phone <>", value, "customerPhone");
            return (Criteria)this;
        }
        
        public Criteria andCustomerPhoneGreaterThan(final String value) {
            this.addCriterion("customer_phone >", value, "customerPhone");
            return (Criteria)this;
        }
        
        public Criteria andCustomerPhoneGreaterThanOrEqualTo(final String value) {
            this.addCriterion("customer_phone >=", value, "customerPhone");
            return (Criteria)this;
        }
        
        public Criteria andCustomerPhoneLessThan(final String value) {
            this.addCriterion("customer_phone <", value, "customerPhone");
            return (Criteria)this;
        }
        
        public Criteria andCustomerPhoneLessThanOrEqualTo(final String value) {
            this.addCriterion("customer_phone <=", value, "customerPhone");
            return (Criteria)this;
        }
        
        public Criteria andCustomerPhoneLike(final String value) {
            this.addCriterion("customer_phone like", value, "customerPhone");
            return (Criteria)this;
        }
        
        public Criteria andCustomerPhoneNotLike(final String value) {
            this.addCriterion("customer_phone not like", value, "customerPhone");
            return (Criteria)this;
        }
        
        public Criteria andCustomerPhoneIn(final List<String> values) {
            this.addCriterion("customer_phone in", values, "customerPhone");
            return (Criteria)this;
        }
        
        public Criteria andCustomerPhoneNotIn(final List<String> values) {
            this.addCriterion("customer_phone not in", values, "customerPhone");
            return (Criteria)this;
        }
        
        public Criteria andCustomerPhoneBetween(final String value1, final String value2) {
            this.addCriterion("customer_phone between", value1, value2, "customerPhone");
            return (Criteria)this;
        }
        
        public Criteria andCustomerPhoneNotBetween(final String value1, final String value2) {
            this.addCriterion("customer_phone not between", value1, value2, "customerPhone");
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
        
        public Criteria andUsernameIsNull() {
            this.addCriterion("username is null");
            return (Criteria)this;
        }
        
        public Criteria andUsernameIsNotNull() {
            this.addCriterion("username is not null");
            return (Criteria)this;
        }
        
        public Criteria andUsernameEqualTo(final String value) {
            this.addCriterion("username =", value, "username");
            return (Criteria)this;
        }
        
        public Criteria andUsernameNotEqualTo(final String value) {
            this.addCriterion("username <>", value, "username");
            return (Criteria)this;
        }
        
        public Criteria andUsernameGreaterThan(final String value) {
            this.addCriterion("username >", value, "username");
            return (Criteria)this;
        }
        
        public Criteria andUsernameGreaterThanOrEqualTo(final String value) {
            this.addCriterion("username >=", value, "username");
            return (Criteria)this;
        }
        
        public Criteria andUsernameLessThan(final String value) {
            this.addCriterion("username <", value, "username");
            return (Criteria)this;
        }
        
        public Criteria andUsernameLessThanOrEqualTo(final String value) {
            this.addCriterion("username <=", value, "username");
            return (Criteria)this;
        }
        
        public Criteria andUsernameLike(final String value) {
            this.addCriterion("username like", value, "username");
            return (Criteria)this;
        }
        
        public Criteria andUsernameNotLike(final String value) {
            this.addCriterion("username not like", value, "username");
            return (Criteria)this;
        }
        
        public Criteria andUsernameIn(final List<String> values) {
            this.addCriterion("username in", values, "username");
            return (Criteria)this;
        }
        
        public Criteria andUsernameNotIn(final List<String> values) {
            this.addCriterion("username not in", values, "username");
            return (Criteria)this;
        }
        
        public Criteria andUsernameBetween(final String value1, final String value2) {
            this.addCriterion("username between", value1, value2, "username");
            return (Criteria)this;
        }
        
        public Criteria andUsernameNotBetween(final String value1, final String value2) {
            this.addCriterion("username not between", value1, value2, "username");
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
