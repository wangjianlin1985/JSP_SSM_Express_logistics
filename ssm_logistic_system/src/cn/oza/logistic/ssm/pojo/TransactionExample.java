// 
// 
// 

package cn.oza.logistic.ssm.pojo;

import java.util.ArrayList;
import java.util.List;

public class TransactionExample
{
    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;
    
    public TransactionExample() {
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
        
        public Criteria andTransactionIdIsNull() {
            this.addCriterion("transaction_id is null");
            return (Criteria)this;
        }
        
        public Criteria andTransactionIdIsNotNull() {
            this.addCriterion("transaction_id is not null");
            return (Criteria)this;
        }
        
        public Criteria andTransactionIdEqualTo(final Long value) {
            this.addCriterion("transaction_id =", value, "transactionId");
            return (Criteria)this;
        }
        
        public Criteria andTransactionIdNotEqualTo(final Long value) {
            this.addCriterion("transaction_id <>", value, "transactionId");
            return (Criteria)this;
        }
        
        public Criteria andTransactionIdGreaterThan(final Long value) {
            this.addCriterion("transaction_id >", value, "transactionId");
            return (Criteria)this;
        }
        
        public Criteria andTransactionIdGreaterThanOrEqualTo(final Long value) {
            this.addCriterion("transaction_id >=", value, "transactionId");
            return (Criteria)this;
        }
        
        public Criteria andTransactionIdLessThan(final Long value) {
            this.addCriterion("transaction_id <", value, "transactionId");
            return (Criteria)this;
        }
        
        public Criteria andTransactionIdLessThanOrEqualTo(final Long value) {
            this.addCriterion("transaction_id <=", value, "transactionId");
            return (Criteria)this;
        }
        
        public Criteria andTransactionIdIn(final List<Long> values) {
            this.addCriterion("transaction_id in", values, "transactionId");
            return (Criteria)this;
        }
        
        public Criteria andTransactionIdNotIn(final List<Long> values) {
            this.addCriterion("transaction_id not in", values, "transactionId");
            return (Criteria)this;
        }
        
        public Criteria andTransactionIdBetween(final Long value1, final Long value2) {
            this.addCriterion("transaction_id between", value1, value2, "transactionId");
            return (Criteria)this;
        }
        
        public Criteria andTransactionIdNotBetween(final Long value1, final Long value2) {
            this.addCriterion("transaction_id not between", value1, value2, "transactionId");
            return (Criteria)this;
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
        
        public Criteria andPickUpFeeIsNull() {
            this.addCriterion("pick_up_fee is null");
            return (Criteria)this;
        }
        
        public Criteria andPickUpFeeIsNotNull() {
            this.addCriterion("pick_up_fee is not null");
            return (Criteria)this;
        }
        
        public Criteria andPickUpFeeEqualTo(final Integer value) {
            this.addCriterion("pick_up_fee =", value, "pickUpFee");
            return (Criteria)this;
        }
        
        public Criteria andPickUpFeeNotEqualTo(final Integer value) {
            this.addCriterion("pick_up_fee <>", value, "pickUpFee");
            return (Criteria)this;
        }
        
        public Criteria andPickUpFeeGreaterThan(final Integer value) {
            this.addCriterion("pick_up_fee >", value, "pickUpFee");
            return (Criteria)this;
        }
        
        public Criteria andPickUpFeeGreaterThanOrEqualTo(final Integer value) {
            this.addCriterion("pick_up_fee >=", value, "pickUpFee");
            return (Criteria)this;
        }
        
        public Criteria andPickUpFeeLessThan(final Integer value) {
            this.addCriterion("pick_up_fee <", value, "pickUpFee");
            return (Criteria)this;
        }
        
        public Criteria andPickUpFeeLessThanOrEqualTo(final Integer value) {
            this.addCriterion("pick_up_fee <=", value, "pickUpFee");
            return (Criteria)this;
        }
        
        public Criteria andPickUpFeeIn(final List<Integer> values) {
            this.addCriterion("pick_up_fee in", values, "pickUpFee");
            return (Criteria)this;
        }
        
        public Criteria andPickUpFeeNotIn(final List<Integer> values) {
            this.addCriterion("pick_up_fee not in", values, "pickUpFee");
            return (Criteria)this;
        }
        
        public Criteria andPickUpFeeBetween(final Integer value1, final Integer value2) {
            this.addCriterion("pick_up_fee between", value1, value2, "pickUpFee");
            return (Criteria)this;
        }
        
        public Criteria andPickUpFeeNotBetween(final Integer value1, final Integer value2) {
            this.addCriterion("pick_up_fee not between", value1, value2, "pickUpFee");
            return (Criteria)this;
        }
        
        public Criteria andVolumeRateIsNull() {
            this.addCriterion("volume_rate is null");
            return (Criteria)this;
        }
        
        public Criteria andVolumeRateIsNotNull() {
            this.addCriterion("volume_rate is not null");
            return (Criteria)this;
        }
        
        public Criteria andVolumeRateEqualTo(final Double value) {
            this.addCriterion("volume_rate =", value, "volumeRate");
            return (Criteria)this;
        }
        
        public Criteria andVolumeRateNotEqualTo(final Double value) {
            this.addCriterion("volume_rate <>", value, "volumeRate");
            return (Criteria)this;
        }
        
        public Criteria andVolumeRateGreaterThan(final Double value) {
            this.addCriterion("volume_rate >", value, "volumeRate");
            return (Criteria)this;
        }
        
        public Criteria andVolumeRateGreaterThanOrEqualTo(final Double value) {
            this.addCriterion("volume_rate >=", value, "volumeRate");
            return (Criteria)this;
        }
        
        public Criteria andVolumeRateLessThan(final Double value) {
            this.addCriterion("volume_rate <", value, "volumeRate");
            return (Criteria)this;
        }
        
        public Criteria andVolumeRateLessThanOrEqualTo(final Double value) {
            this.addCriterion("volume_rate <=", value, "volumeRate");
            return (Criteria)this;
        }
        
        public Criteria andVolumeRateIn(final List<Double> values) {
            this.addCriterion("volume_rate in", values, "volumeRate");
            return (Criteria)this;
        }
        
        public Criteria andVolumeRateNotIn(final List<Double> values) {
            this.addCriterion("volume_rate not in", values, "volumeRate");
            return (Criteria)this;
        }
        
        public Criteria andVolumeRateBetween(final Double value1, final Double value2) {
            this.addCriterion("volume_rate between", value1, value2, "volumeRate");
            return (Criteria)this;
        }
        
        public Criteria andVolumeRateNotBetween(final Double value1, final Double value2) {
            this.addCriterion("volume_rate not between", value1, value2, "volumeRate");
            return (Criteria)this;
        }
        
        public Criteria andWeightRateIsNull() {
            this.addCriterion("weight_rate is null");
            return (Criteria)this;
        }
        
        public Criteria andWeightRateIsNotNull() {
            this.addCriterion("weight_rate is not null");
            return (Criteria)this;
        }
        
        public Criteria andWeightRateEqualTo(final Double value) {
            this.addCriterion("weight_rate =", value, "weightRate");
            return (Criteria)this;
        }
        
        public Criteria andWeightRateNotEqualTo(final Double value) {
            this.addCriterion("weight_rate <>", value, "weightRate");
            return (Criteria)this;
        }
        
        public Criteria andWeightRateGreaterThan(final Double value) {
            this.addCriterion("weight_rate >", value, "weightRate");
            return (Criteria)this;
        }
        
        public Criteria andWeightRateGreaterThanOrEqualTo(final Double value) {
            this.addCriterion("weight_rate >=", value, "weightRate");
            return (Criteria)this;
        }
        
        public Criteria andWeightRateLessThan(final Double value) {
            this.addCriterion("weight_rate <", value, "weightRate");
            return (Criteria)this;
        }
        
        public Criteria andWeightRateLessThanOrEqualTo(final Double value) {
            this.addCriterion("weight_rate <=", value, "weightRate");
            return (Criteria)this;
        }
        
        public Criteria andWeightRateIn(final List<Double> values) {
            this.addCriterion("weight_rate in", values, "weightRate");
            return (Criteria)this;
        }
        
        public Criteria andWeightRateNotIn(final List<Double> values) {
            this.addCriterion("weight_rate not in", values, "weightRate");
            return (Criteria)this;
        }
        
        public Criteria andWeightRateBetween(final Double value1, final Double value2) {
            this.addCriterion("weight_rate between", value1, value2, "weightRate");
            return (Criteria)this;
        }
        
        public Criteria andWeightRateNotBetween(final Double value1, final Double value2) {
            this.addCriterion("weight_rate not between", value1, value2, "weightRate");
            return (Criteria)this;
        }
        
        public Criteria andStorageIdIsNull() {
            this.addCriterion("storage_id is null");
            return (Criteria)this;
        }
        
        public Criteria andStorageIdIsNotNull() {
            this.addCriterion("storage_id is not null");
            return (Criteria)this;
        }
        
        public Criteria andStorageIdEqualTo(final Long value) {
            this.addCriterion("storage_id =", value, "storageId");
            return (Criteria)this;
        }
        
        public Criteria andStorageIdNotEqualTo(final Long value) {
            this.addCriterion("storage_id <>", value, "storageId");
            return (Criteria)this;
        }
        
        public Criteria andStorageIdGreaterThan(final Long value) {
            this.addCriterion("storage_id >", value, "storageId");
            return (Criteria)this;
        }
        
        public Criteria andStorageIdGreaterThanOrEqualTo(final Long value) {
            this.addCriterion("storage_id >=", value, "storageId");
            return (Criteria)this;
        }
        
        public Criteria andStorageIdLessThan(final Long value) {
            this.addCriterion("storage_id <", value, "storageId");
            return (Criteria)this;
        }
        
        public Criteria andStorageIdLessThanOrEqualTo(final Long value) {
            this.addCriterion("storage_id <=", value, "storageId");
            return (Criteria)this;
        }
        
        public Criteria andStorageIdIn(final List<Long> values) {
            this.addCriterion("storage_id in", values, "storageId");
            return (Criteria)this;
        }
        
        public Criteria andStorageIdNotIn(final List<Long> values) {
            this.addCriterion("storage_id not in", values, "storageId");
            return (Criteria)this;
        }
        
        public Criteria andStorageIdBetween(final Long value1, final Long value2) {
            this.addCriterion("storage_id between", value1, value2, "storageId");
            return (Criteria)this;
        }
        
        public Criteria andStorageIdNotBetween(final Long value1, final Long value2) {
            this.addCriterion("storage_id not between", value1, value2, "storageId");
            return (Criteria)this;
        }
        
        public Criteria andTotalFeeIsNull() {
            this.addCriterion("total_fee is null");
            return (Criteria)this;
        }
        
        public Criteria andTotalFeeIsNotNull() {
            this.addCriterion("total_fee is not null");
            return (Criteria)this;
        }
        
        public Criteria andTotalFeeEqualTo(final String value) {
            this.addCriterion("total_fee =", value, "totalFee");
            return (Criteria)this;
        }
        
        public Criteria andTotalFeeNotEqualTo(final String value) {
            this.addCriterion("total_fee <>", value, "totalFee");
            return (Criteria)this;
        }
        
        public Criteria andTotalFeeGreaterThan(final String value) {
            this.addCriterion("total_fee >", value, "totalFee");
            return (Criteria)this;
        }
        
        public Criteria andTotalFeeGreaterThanOrEqualTo(final String value) {
            this.addCriterion("total_fee >=", value, "totalFee");
            return (Criteria)this;
        }
        
        public Criteria andTotalFeeLessThan(final String value) {
            this.addCriterion("total_fee <", value, "totalFee");
            return (Criteria)this;
        }
        
        public Criteria andTotalFeeLessThanOrEqualTo(final String value) {
            this.addCriterion("total_fee <=", value, "totalFee");
            return (Criteria)this;
        }
        
        public Criteria andTotalFeeLike(final String value) {
            this.addCriterion("total_fee like", value, "totalFee");
            return (Criteria)this;
        }
        
        public Criteria andTotalFeeNotLike(final String value) {
            this.addCriterion("total_fee not like", value, "totalFee");
            return (Criteria)this;
        }
        
        public Criteria andTotalFeeIn(final List<String> values) {
            this.addCriterion("total_fee in", values, "totalFee");
            return (Criteria)this;
        }
        
        public Criteria andTotalFeeNotIn(final List<String> values) {
            this.addCriterion("total_fee not in", values, "totalFee");
            return (Criteria)this;
        }
        
        public Criteria andTotalFeeBetween(final String value1, final String value2) {
            this.addCriterion("total_fee between", value1, value2, "totalFee");
            return (Criteria)this;
        }
        
        public Criteria andTotalFeeNotBetween(final String value1, final String value2) {
            this.addCriterion("total_fee not between", value1, value2, "totalFee");
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
