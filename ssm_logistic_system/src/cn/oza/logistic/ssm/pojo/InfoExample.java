// 
// 
// 

package cn.oza.logistic.ssm.pojo;

import java.util.ArrayList;
import java.util.List;

public class InfoExample
{
    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;
    
    public InfoExample() {
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
        
        public Criteria andTotalVolumeIsNull() {
            this.addCriterion("total_volume is null");
            return (Criteria)this;
        }
        
        public Criteria andTotalVolumeIsNotNull() {
            this.addCriterion("total_volume is not null");
            return (Criteria)this;
        }
        
        public Criteria andTotalVolumeEqualTo(final Double value) {
            this.addCriterion("total_volume =", value, "totalVolume");
            return (Criteria)this;
        }
        
        public Criteria andTotalVolumeNotEqualTo(final Double value) {
            this.addCriterion("total_volume <>", value, "totalVolume");
            return (Criteria)this;
        }
        
        public Criteria andTotalVolumeGreaterThan(final Double value) {
            this.addCriterion("total_volume >", value, "totalVolume");
            return (Criteria)this;
        }
        
        public Criteria andTotalVolumeGreaterThanOrEqualTo(final Double value) {
            this.addCriterion("total_volume >=", value, "totalVolume");
            return (Criteria)this;
        }
        
        public Criteria andTotalVolumeLessThan(final Double value) {
            this.addCriterion("total_volume <", value, "totalVolume");
            return (Criteria)this;
        }
        
        public Criteria andTotalVolumeLessThanOrEqualTo(final Double value) {
            this.addCriterion("total_volume <=", value, "totalVolume");
            return (Criteria)this;
        }
        
        public Criteria andTotalVolumeIn(final List<Double> values) {
            this.addCriterion("total_volume in", values, "totalVolume");
            return (Criteria)this;
        }
        
        public Criteria andTotalVolumeNotIn(final List<Double> values) {
            this.addCriterion("total_volume not in", values, "totalVolume");
            return (Criteria)this;
        }
        
        public Criteria andTotalVolumeBetween(final Double value1, final Double value2) {
            this.addCriterion("total_volume between", value1, value2, "totalVolume");
            return (Criteria)this;
        }
        
        public Criteria andTotalVolumeNotBetween(final Double value1, final Double value2) {
            this.addCriterion("total_volume not between", value1, value2, "totalVolume");
            return (Criteria)this;
        }
        
        public Criteria andTotalWeightIsNull() {
            this.addCriterion("total_weight is null");
            return (Criteria)this;
        }
        
        public Criteria andTotalWeightIsNotNull() {
            this.addCriterion("total_weight is not null");
            return (Criteria)this;
        }
        
        public Criteria andTotalWeightEqualTo(final Double value) {
            this.addCriterion("total_weight =", value, "totalWeight");
            return (Criteria)this;
        }
        
        public Criteria andTotalWeightNotEqualTo(final Double value) {
            this.addCriterion("total_weight <>", value, "totalWeight");
            return (Criteria)this;
        }
        
        public Criteria andTotalWeightGreaterThan(final Double value) {
            this.addCriterion("total_weight >", value, "totalWeight");
            return (Criteria)this;
        }
        
        public Criteria andTotalWeightGreaterThanOrEqualTo(final Double value) {
            this.addCriterion("total_weight >=", value, "totalWeight");
            return (Criteria)this;
        }
        
        public Criteria andTotalWeightLessThan(final Double value) {
            this.addCriterion("total_weight <", value, "totalWeight");
            return (Criteria)this;
        }
        
        public Criteria andTotalWeightLessThanOrEqualTo(final Double value) {
            this.addCriterion("total_weight <=", value, "totalWeight");
            return (Criteria)this;
        }
        
        public Criteria andTotalWeightIn(final List<Double> values) {
            this.addCriterion("total_weight in", values, "totalWeight");
            return (Criteria)this;
        }
        
        public Criteria andTotalWeightNotIn(final List<Double> values) {
            this.addCriterion("total_weight not in", values, "totalWeight");
            return (Criteria)this;
        }
        
        public Criteria andTotalWeightBetween(final Double value1, final Double value2) {
            this.addCriterion("total_weight between", value1, value2, "totalWeight");
            return (Criteria)this;
        }
        
        public Criteria andTotalWeightNotBetween(final Double value1, final Double value2) {
            this.addCriterion("total_weight not between", value1, value2, "totalWeight");
            return (Criteria)this;
        }
        
        public Criteria andTotalValueIsNull() {
            this.addCriterion("total_value is null");
            return (Criteria)this;
        }
        
        public Criteria andTotalValueIsNotNull() {
            this.addCriterion("total_value is not null");
            return (Criteria)this;
        }
        
        public Criteria andTotalValueEqualTo(final Double value) {
            this.addCriterion("total_value =", value, "totalValue");
            return (Criteria)this;
        }
        
        public Criteria andTotalValueNotEqualTo(final Double value) {
            this.addCriterion("total_value <>", value, "totalValue");
            return (Criteria)this;
        }
        
        public Criteria andTotalValueGreaterThan(final Double value) {
            this.addCriterion("total_value >", value, "totalValue");
            return (Criteria)this;
        }
        
        public Criteria andTotalValueGreaterThanOrEqualTo(final Double value) {
            this.addCriterion("total_value >=", value, "totalValue");
            return (Criteria)this;
        }
        
        public Criteria andTotalValueLessThan(final Double value) {
            this.addCriterion("total_value <", value, "totalValue");
            return (Criteria)this;
        }
        
        public Criteria andTotalValueLessThanOrEqualTo(final Double value) {
            this.addCriterion("total_value <=", value, "totalValue");
            return (Criteria)this;
        }
        
        public Criteria andTotalValueIn(final List<Double> values) {
            this.addCriterion("total_value in", values, "totalValue");
            return (Criteria)this;
        }
        
        public Criteria andTotalValueNotIn(final List<Double> values) {
            this.addCriterion("total_value not in", values, "totalValue");
            return (Criteria)this;
        }
        
        public Criteria andTotalValueBetween(final Double value1, final Double value2) {
            this.addCriterion("total_value between", value1, value2, "totalValue");
            return (Criteria)this;
        }
        
        public Criteria andTotalValueNotBetween(final Double value1, final Double value2) {
            this.addCriterion("total_value not between", value1, value2, "totalValue");
            return (Criteria)this;
        }
        
        public Criteria andTaxRateIsNull() {
            this.addCriterion("tax_rate is null");
            return (Criteria)this;
        }
        
        public Criteria andTaxRateIsNotNull() {
            this.addCriterion("tax_rate is not null");
            return (Criteria)this;
        }
        
        public Criteria andTaxRateEqualTo(final Double value) {
            this.addCriterion("tax_rate =", value, "taxRate");
            return (Criteria)this;
        }
        
        public Criteria andTaxRateNotEqualTo(final Double value) {
            this.addCriterion("tax_rate <>", value, "taxRate");
            return (Criteria)this;
        }
        
        public Criteria andTaxRateGreaterThan(final Double value) {
            this.addCriterion("tax_rate >", value, "taxRate");
            return (Criteria)this;
        }
        
        public Criteria andTaxRateGreaterThanOrEqualTo(final Double value) {
            this.addCriterion("tax_rate >=", value, "taxRate");
            return (Criteria)this;
        }
        
        public Criteria andTaxRateLessThan(final Double value) {
            this.addCriterion("tax_rate <", value, "taxRate");
            return (Criteria)this;
        }
        
        public Criteria andTaxRateLessThanOrEqualTo(final Double value) {
            this.addCriterion("tax_rate <=", value, "taxRate");
            return (Criteria)this;
        }
        
        public Criteria andTaxRateIn(final List<Double> values) {
            this.addCriterion("tax_rate in", values, "taxRate");
            return (Criteria)this;
        }
        
        public Criteria andTaxRateNotIn(final List<Double> values) {
            this.addCriterion("tax_rate not in", values, "taxRate");
            return (Criteria)this;
        }
        
        public Criteria andTaxRateBetween(final Double value1, final Double value2) {
            this.addCriterion("tax_rate between", value1, value2, "taxRate");
            return (Criteria)this;
        }
        
        public Criteria andTaxRateNotBetween(final Double value1, final Double value2) {
            this.addCriterion("tax_rate not between", value1, value2, "taxRate");
            return (Criteria)this;
        }
        
        public Criteria andWeightFeeIsNull() {
            this.addCriterion("weight_fee is null");
            return (Criteria)this;
        }
        
        public Criteria andWeightFeeIsNotNull() {
            this.addCriterion("weight_fee is not null");
            return (Criteria)this;
        }
        
        public Criteria andWeightFeeEqualTo(final Double value) {
            this.addCriterion("weight_fee =", value, "weightFee");
            return (Criteria)this;
        }
        
        public Criteria andWeightFeeNotEqualTo(final Double value) {
            this.addCriterion("weight_fee <>", value, "weightFee");
            return (Criteria)this;
        }
        
        public Criteria andWeightFeeGreaterThan(final Double value) {
            this.addCriterion("weight_fee >", value, "weightFee");
            return (Criteria)this;
        }
        
        public Criteria andWeightFeeGreaterThanOrEqualTo(final Double value) {
            this.addCriterion("weight_fee >=", value, "weightFee");
            return (Criteria)this;
        }
        
        public Criteria andWeightFeeLessThan(final Double value) {
            this.addCriterion("weight_fee <", value, "weightFee");
            return (Criteria)this;
        }
        
        public Criteria andWeightFeeLessThanOrEqualTo(final Double value) {
            this.addCriterion("weight_fee <=", value, "weightFee");
            return (Criteria)this;
        }
        
        public Criteria andWeightFeeIn(final List<Double> values) {
            this.addCriterion("weight_fee in", values, "weightFee");
            return (Criteria)this;
        }
        
        public Criteria andWeightFeeNotIn(final List<Double> values) {
            this.addCriterion("weight_fee not in", values, "weightFee");
            return (Criteria)this;
        }
        
        public Criteria andWeightFeeBetween(final Double value1, final Double value2) {
            this.addCriterion("weight_fee between", value1, value2, "weightFee");
            return (Criteria)this;
        }
        
        public Criteria andWeightFeeNotBetween(final Double value1, final Double value2) {
            this.addCriterion("weight_fee not between", value1, value2, "weightFee");
            return (Criteria)this;
        }
        
        public Criteria andVolumeFeeIsNull() {
            this.addCriterion("volume_fee is null");
            return (Criteria)this;
        }
        
        public Criteria andVolumeFeeIsNotNull() {
            this.addCriterion("volume_fee is not null");
            return (Criteria)this;
        }
        
        public Criteria andVolumeFeeEqualTo(final Double value) {
            this.addCriterion("volume_fee =", value, "volumeFee");
            return (Criteria)this;
        }
        
        public Criteria andVolumeFeeNotEqualTo(final Double value) {
            this.addCriterion("volume_fee <>", value, "volumeFee");
            return (Criteria)this;
        }
        
        public Criteria andVolumeFeeGreaterThan(final Double value) {
            this.addCriterion("volume_fee >", value, "volumeFee");
            return (Criteria)this;
        }
        
        public Criteria andVolumeFeeGreaterThanOrEqualTo(final Double value) {
            this.addCriterion("volume_fee >=", value, "volumeFee");
            return (Criteria)this;
        }
        
        public Criteria andVolumeFeeLessThan(final Double value) {
            this.addCriterion("volume_fee <", value, "volumeFee");
            return (Criteria)this;
        }
        
        public Criteria andVolumeFeeLessThanOrEqualTo(final Double value) {
            this.addCriterion("volume_fee <=", value, "volumeFee");
            return (Criteria)this;
        }
        
        public Criteria andVolumeFeeIn(final List<Double> values) {
            this.addCriterion("volume_fee in", values, "volumeFee");
            return (Criteria)this;
        }
        
        public Criteria andVolumeFeeNotIn(final List<Double> values) {
            this.addCriterion("volume_fee not in", values, "volumeFee");
            return (Criteria)this;
        }
        
        public Criteria andVolumeFeeBetween(final Double value1, final Double value2) {
            this.addCriterion("volume_fee between", value1, value2, "volumeFee");
            return (Criteria)this;
        }
        
        public Criteria andVolumeFeeNotBetween(final Double value1, final Double value2) {
            this.addCriterion("volume_fee not between", value1, value2, "volumeFee");
            return (Criteria)this;
        }
        
        public Criteria andTaxFeeIsNull() {
            this.addCriterion("tax_fee is null");
            return (Criteria)this;
        }
        
        public Criteria andTaxFeeIsNotNull() {
            this.addCriterion("tax_fee is not null");
            return (Criteria)this;
        }
        
        public Criteria andTaxFeeEqualTo(final Double value) {
            this.addCriterion("tax_fee =", value, "taxFee");
            return (Criteria)this;
        }
        
        public Criteria andTaxFeeNotEqualTo(final Double value) {
            this.addCriterion("tax_fee <>", value, "taxFee");
            return (Criteria)this;
        }
        
        public Criteria andTaxFeeGreaterThan(final Double value) {
            this.addCriterion("tax_fee >", value, "taxFee");
            return (Criteria)this;
        }
        
        public Criteria andTaxFeeGreaterThanOrEqualTo(final Double value) {
            this.addCriterion("tax_fee >=", value, "taxFee");
            return (Criteria)this;
        }
        
        public Criteria andTaxFeeLessThan(final Double value) {
            this.addCriterion("tax_fee <", value, "taxFee");
            return (Criteria)this;
        }
        
        public Criteria andTaxFeeLessThanOrEqualTo(final Double value) {
            this.addCriterion("tax_fee <=", value, "taxFee");
            return (Criteria)this;
        }
        
        public Criteria andTaxFeeIn(final List<Double> values) {
            this.addCriterion("tax_fee in", values, "taxFee");
            return (Criteria)this;
        }
        
        public Criteria andTaxFeeNotIn(final List<Double> values) {
            this.addCriterion("tax_fee not in", values, "taxFee");
            return (Criteria)this;
        }
        
        public Criteria andTaxFeeBetween(final Double value1, final Double value2) {
            this.addCriterion("tax_fee between", value1, value2, "taxFee");
            return (Criteria)this;
        }
        
        public Criteria andTaxFeeNotBetween(final Double value1, final Double value2) {
            this.addCriterion("tax_fee not between", value1, value2, "taxFee");
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
        
        public Criteria andTotalFeeEqualTo(final Double value) {
            this.addCriterion("total_fee =", value, "totalFee");
            return (Criteria)this;
        }
        
        public Criteria andTotalFeeNotEqualTo(final Double value) {
            this.addCriterion("total_fee <>", value, "totalFee");
            return (Criteria)this;
        }
        
        public Criteria andTotalFeeGreaterThan(final Double value) {
            this.addCriterion("total_fee >", value, "totalFee");
            return (Criteria)this;
        }
        
        public Criteria andTotalFeeGreaterThanOrEqualTo(final Double value) {
            this.addCriterion("total_fee >=", value, "totalFee");
            return (Criteria)this;
        }
        
        public Criteria andTotalFeeLessThan(final Double value) {
            this.addCriterion("total_fee <", value, "totalFee");
            return (Criteria)this;
        }
        
        public Criteria andTotalFeeLessThanOrEqualTo(final Double value) {
            this.addCriterion("total_fee <=", value, "totalFee");
            return (Criteria)this;
        }
        
        public Criteria andTotalFeeIn(final List<Double> values) {
            this.addCriterion("total_fee in", values, "totalFee");
            return (Criteria)this;
        }
        
        public Criteria andTotalFeeNotIn(final List<Double> values) {
            this.addCriterion("total_fee not in", values, "totalFee");
            return (Criteria)this;
        }
        
        public Criteria andTotalFeeBetween(final Double value1, final Double value2) {
            this.addCriterion("total_fee between", value1, value2, "totalFee");
            return (Criteria)this;
        }
        
        public Criteria andTotalFeeNotBetween(final Double value1, final Double value2) {
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
