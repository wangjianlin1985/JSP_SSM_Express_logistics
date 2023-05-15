// 
// 
// 

package cn.oza.logistic.ssm.pojo;

import java.util.ArrayList;
import java.util.List;

public class TransactionDetailExample
{
    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;
    
    public TransactionDetailExample() {
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
        
        public Criteria andTransactionDetailIdIsNull() {
            this.addCriterion("transaction_detail_id is null");
            return (Criteria)this;
        }
        
        public Criteria andTransactionDetailIdIsNotNull() {
            this.addCriterion("transaction_detail_id is not null");
            return (Criteria)this;
        }
        
        public Criteria andTransactionDetailIdEqualTo(final Long value) {
            this.addCriterion("transaction_detail_id =", value, "transactionDetailId");
            return (Criteria)this;
        }
        
        public Criteria andTransactionDetailIdNotEqualTo(final Long value) {
            this.addCriterion("transaction_detail_id <>", value, "transactionDetailId");
            return (Criteria)this;
        }
        
        public Criteria andTransactionDetailIdGreaterThan(final Long value) {
            this.addCriterion("transaction_detail_id >", value, "transactionDetailId");
            return (Criteria)this;
        }
        
        public Criteria andTransactionDetailIdGreaterThanOrEqualTo(final Long value) {
            this.addCriterion("transaction_detail_id >=", value, "transactionDetailId");
            return (Criteria)this;
        }
        
        public Criteria andTransactionDetailIdLessThan(final Long value) {
            this.addCriterion("transaction_detail_id <", value, "transactionDetailId");
            return (Criteria)this;
        }
        
        public Criteria andTransactionDetailIdLessThanOrEqualTo(final Long value) {
            this.addCriterion("transaction_detail_id <=", value, "transactionDetailId");
            return (Criteria)this;
        }
        
        public Criteria andTransactionDetailIdIn(final List<Long> values) {
            this.addCriterion("transaction_detail_id in", values, "transactionDetailId");
            return (Criteria)this;
        }
        
        public Criteria andTransactionDetailIdNotIn(final List<Long> values) {
            this.addCriterion("transaction_detail_id not in", values, "transactionDetailId");
            return (Criteria)this;
        }
        
        public Criteria andTransactionDetailIdBetween(final Long value1, final Long value2) {
            this.addCriterion("transaction_detail_id between", value1, value2, "transactionDetailId");
            return (Criteria)this;
        }
        
        public Criteria andTransactionDetailIdNotBetween(final Long value1, final Long value2) {
            this.addCriterion("transaction_detail_id not between", value1, value2, "transactionDetailId");
            return (Criteria)this;
        }
        
        public Criteria andOrderDetailIdIsNull() {
            this.addCriterion("order_detail_id is null");
            return (Criteria)this;
        }
        
        public Criteria andOrderDetailIdIsNotNull() {
            this.addCriterion("order_detail_id is not null");
            return (Criteria)this;
        }
        
        public Criteria andOrderDetailIdEqualTo(final Long value) {
            this.addCriterion("order_detail_id =", value, "orderDetailId");
            return (Criteria)this;
        }
        
        public Criteria andOrderDetailIdNotEqualTo(final Long value) {
            this.addCriterion("order_detail_id <>", value, "orderDetailId");
            return (Criteria)this;
        }
        
        public Criteria andOrderDetailIdGreaterThan(final Long value) {
            this.addCriterion("order_detail_id >", value, "orderDetailId");
            return (Criteria)this;
        }
        
        public Criteria andOrderDetailIdGreaterThanOrEqualTo(final Long value) {
            this.addCriterion("order_detail_id >=", value, "orderDetailId");
            return (Criteria)this;
        }
        
        public Criteria andOrderDetailIdLessThan(final Long value) {
            this.addCriterion("order_detail_id <", value, "orderDetailId");
            return (Criteria)this;
        }
        
        public Criteria andOrderDetailIdLessThanOrEqualTo(final Long value) {
            this.addCriterion("order_detail_id <=", value, "orderDetailId");
            return (Criteria)this;
        }
        
        public Criteria andOrderDetailIdIn(final List<Long> values) {
            this.addCriterion("order_detail_id in", values, "orderDetailId");
            return (Criteria)this;
        }
        
        public Criteria andOrderDetailIdNotIn(final List<Long> values) {
            this.addCriterion("order_detail_id not in", values, "orderDetailId");
            return (Criteria)this;
        }
        
        public Criteria andOrderDetailIdBetween(final Long value1, final Long value2) {
            this.addCriterion("order_detail_id between", value1, value2, "orderDetailId");
            return (Criteria)this;
        }
        
        public Criteria andOrderDetailIdNotBetween(final Long value1, final Long value2) {
            this.addCriterion("order_detail_id not between", value1, value2, "orderDetailId");
            return (Criteria)this;
        }
        
        public Criteria andLengthIsNull() {
            this.addCriterion("length is null");
            return (Criteria)this;
        }
        
        public Criteria andLengthIsNotNull() {
            this.addCriterion("length is not null");
            return (Criteria)this;
        }
        
        public Criteria andLengthEqualTo(final Long value) {
            this.addCriterion("length =", value, "length");
            return (Criteria)this;
        }
        
        public Criteria andLengthNotEqualTo(final Long value) {
            this.addCriterion("length <>", value, "length");
            return (Criteria)this;
        }
        
        public Criteria andLengthGreaterThan(final Long value) {
            this.addCriterion("length >", value, "length");
            return (Criteria)this;
        }
        
        public Criteria andLengthGreaterThanOrEqualTo(final Long value) {
            this.addCriterion("length >=", value, "length");
            return (Criteria)this;
        }
        
        public Criteria andLengthLessThan(final Long value) {
            this.addCriterion("length <", value, "length");
            return (Criteria)this;
        }
        
        public Criteria andLengthLessThanOrEqualTo(final Long value) {
            this.addCriterion("length <=", value, "length");
            return (Criteria)this;
        }
        
        public Criteria andLengthIn(final List<Long> values) {
            this.addCriterion("length in", values, "length");
            return (Criteria)this;
        }
        
        public Criteria andLengthNotIn(final List<Long> values) {
            this.addCriterion("length not in", values, "length");
            return (Criteria)this;
        }
        
        public Criteria andLengthBetween(final Long value1, final Long value2) {
            this.addCriterion("length between", value1, value2, "length");
            return (Criteria)this;
        }
        
        public Criteria andLengthNotBetween(final Long value1, final Long value2) {
            this.addCriterion("length not between", value1, value2, "length");
            return (Criteria)this;
        }
        
        public Criteria andWidthIsNull() {
            this.addCriterion("width is null");
            return (Criteria)this;
        }
        
        public Criteria andWidthIsNotNull() {
            this.addCriterion("width is not null");
            return (Criteria)this;
        }
        
        public Criteria andWidthEqualTo(final Long value) {
            this.addCriterion("width =", value, "width");
            return (Criteria)this;
        }
        
        public Criteria andWidthNotEqualTo(final Long value) {
            this.addCriterion("width <>", value, "width");
            return (Criteria)this;
        }
        
        public Criteria andWidthGreaterThan(final Long value) {
            this.addCriterion("width >", value, "width");
            return (Criteria)this;
        }
        
        public Criteria andWidthGreaterThanOrEqualTo(final Long value) {
            this.addCriterion("width >=", value, "width");
            return (Criteria)this;
        }
        
        public Criteria andWidthLessThan(final Long value) {
            this.addCriterion("width <", value, "width");
            return (Criteria)this;
        }
        
        public Criteria andWidthLessThanOrEqualTo(final Long value) {
            this.addCriterion("width <=", value, "width");
            return (Criteria)this;
        }
        
        public Criteria andWidthIn(final List<Long> values) {
            this.addCriterion("width in", values, "width");
            return (Criteria)this;
        }
        
        public Criteria andWidthNotIn(final List<Long> values) {
            this.addCriterion("width not in", values, "width");
            return (Criteria)this;
        }
        
        public Criteria andWidthBetween(final Long value1, final Long value2) {
            this.addCriterion("width between", value1, value2, "width");
            return (Criteria)this;
        }
        
        public Criteria andWidthNotBetween(final Long value1, final Long value2) {
            this.addCriterion("width not between", value1, value2, "width");
            return (Criteria)this;
        }
        
        public Criteria andHeightIsNull() {
            this.addCriterion("height is null");
            return (Criteria)this;
        }
        
        public Criteria andHeightIsNotNull() {
            this.addCriterion("height is not null");
            return (Criteria)this;
        }
        
        public Criteria andHeightEqualTo(final Long value) {
            this.addCriterion("height =", value, "height");
            return (Criteria)this;
        }
        
        public Criteria andHeightNotEqualTo(final Long value) {
            this.addCriterion("height <>", value, "height");
            return (Criteria)this;
        }
        
        public Criteria andHeightGreaterThan(final Long value) {
            this.addCriterion("height >", value, "height");
            return (Criteria)this;
        }
        
        public Criteria andHeightGreaterThanOrEqualTo(final Long value) {
            this.addCriterion("height >=", value, "height");
            return (Criteria)this;
        }
        
        public Criteria andHeightLessThan(final Long value) {
            this.addCriterion("height <", value, "height");
            return (Criteria)this;
        }
        
        public Criteria andHeightLessThanOrEqualTo(final Long value) {
            this.addCriterion("height <=", value, "height");
            return (Criteria)this;
        }
        
        public Criteria andHeightIn(final List<Long> values) {
            this.addCriterion("height in", values, "height");
            return (Criteria)this;
        }
        
        public Criteria andHeightNotIn(final List<Long> values) {
            this.addCriterion("height not in", values, "height");
            return (Criteria)this;
        }
        
        public Criteria andHeightBetween(final Long value1, final Long value2) {
            this.addCriterion("height between", value1, value2, "height");
            return (Criteria)this;
        }
        
        public Criteria andHeightNotBetween(final Long value1, final Long value2) {
            this.addCriterion("height not between", value1, value2, "height");
            return (Criteria)this;
        }
        
        public Criteria andVolumeIsNull() {
            this.addCriterion("volume is null");
            return (Criteria)this;
        }
        
        public Criteria andVolumeIsNotNull() {
            this.addCriterion("volume is not null");
            return (Criteria)this;
        }
        
        public Criteria andVolumeEqualTo(final Double value) {
            this.addCriterion("volume =", value, "volume");
            return (Criteria)this;
        }
        
        public Criteria andVolumeNotEqualTo(final Double value) {
            this.addCriterion("volume <>", value, "volume");
            return (Criteria)this;
        }
        
        public Criteria andVolumeGreaterThan(final Double value) {
            this.addCriterion("volume >", value, "volume");
            return (Criteria)this;
        }
        
        public Criteria andVolumeGreaterThanOrEqualTo(final Double value) {
            this.addCriterion("volume >=", value, "volume");
            return (Criteria)this;
        }
        
        public Criteria andVolumeLessThan(final Double value) {
            this.addCriterion("volume <", value, "volume");
            return (Criteria)this;
        }
        
        public Criteria andVolumeLessThanOrEqualTo(final Double value) {
            this.addCriterion("volume <=", value, "volume");
            return (Criteria)this;
        }
        
        public Criteria andVolumeIn(final List<Double> values) {
            this.addCriterion("volume in", values, "volume");
            return (Criteria)this;
        }
        
        public Criteria andVolumeNotIn(final List<Double> values) {
            this.addCriterion("volume not in", values, "volume");
            return (Criteria)this;
        }
        
        public Criteria andVolumeBetween(final Double value1, final Double value2) {
            this.addCriterion("volume between", value1, value2, "volume");
            return (Criteria)this;
        }
        
        public Criteria andVolumeNotBetween(final Double value1, final Double value2) {
            this.addCriterion("volume not between", value1, value2, "volume");
            return (Criteria)this;
        }
        
        public Criteria andWeightIsNull() {
            this.addCriterion("weight is null");
            return (Criteria)this;
        }
        
        public Criteria andWeightIsNotNull() {
            this.addCriterion("weight is not null");
            return (Criteria)this;
        }
        
        public Criteria andWeightEqualTo(final Double value) {
            this.addCriterion("weight =", value, "weight");
            return (Criteria)this;
        }
        
        public Criteria andWeightNotEqualTo(final Double value) {
            this.addCriterion("weight <>", value, "weight");
            return (Criteria)this;
        }
        
        public Criteria andWeightGreaterThan(final Double value) {
            this.addCriterion("weight >", value, "weight");
            return (Criteria)this;
        }
        
        public Criteria andWeightGreaterThanOrEqualTo(final Double value) {
            this.addCriterion("weight >=", value, "weight");
            return (Criteria)this;
        }
        
        public Criteria andWeightLessThan(final Double value) {
            this.addCriterion("weight <", value, "weight");
            return (Criteria)this;
        }
        
        public Criteria andWeightLessThanOrEqualTo(final Double value) {
            this.addCriterion("weight <=", value, "weight");
            return (Criteria)this;
        }
        
        public Criteria andWeightIn(final List<Double> values) {
            this.addCriterion("weight in", values, "weight");
            return (Criteria)this;
        }
        
        public Criteria andWeightNotIn(final List<Double> values) {
            this.addCriterion("weight not in", values, "weight");
            return (Criteria)this;
        }
        
        public Criteria andWeightBetween(final Double value1, final Double value2) {
            this.addCriterion("weight between", value1, value2, "weight");
            return (Criteria)this;
        }
        
        public Criteria andWeightNotBetween(final Double value1, final Double value2) {
            this.addCriterion("weight not between", value1, value2, "weight");
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
