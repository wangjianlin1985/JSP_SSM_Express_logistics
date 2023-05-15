// 
// 
// 

package cn.oza.logistic.ssm.pojo;

import java.util.ArrayList;
import java.util.List;

public class ExportDetailExample
{
    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;
    
    public ExportDetailExample() {
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
        
        public Criteria andGoodsNameIsNull() {
            this.addCriterion("goods_name is null");
            return (Criteria)this;
        }
        
        public Criteria andGoodsNameIsNotNull() {
            this.addCriterion("goods_name is not null");
            return (Criteria)this;
        }
        
        public Criteria andGoodsNameEqualTo(final String value) {
            this.addCriterion("goods_name =", value, "goodsName");
            return (Criteria)this;
        }
        
        public Criteria andGoodsNameNotEqualTo(final String value) {
            this.addCriterion("goods_name <>", value, "goodsName");
            return (Criteria)this;
        }
        
        public Criteria andGoodsNameGreaterThan(final String value) {
            this.addCriterion("goods_name >", value, "goodsName");
            return (Criteria)this;
        }
        
        public Criteria andGoodsNameGreaterThanOrEqualTo(final String value) {
            this.addCriterion("goods_name >=", value, "goodsName");
            return (Criteria)this;
        }
        
        public Criteria andGoodsNameLessThan(final String value) {
            this.addCriterion("goods_name <", value, "goodsName");
            return (Criteria)this;
        }
        
        public Criteria andGoodsNameLessThanOrEqualTo(final String value) {
            this.addCriterion("goods_name <=", value, "goodsName");
            return (Criteria)this;
        }
        
        public Criteria andGoodsNameLike(final String value) {
            this.addCriterion("goods_name like", value, "goodsName");
            return (Criteria)this;
        }
        
        public Criteria andGoodsNameNotLike(final String value) {
            this.addCriterion("goods_name not like", value, "goodsName");
            return (Criteria)this;
        }
        
        public Criteria andGoodsNameIn(final List<String> values) {
            this.addCriterion("goods_name in", values, "goodsName");
            return (Criteria)this;
        }
        
        public Criteria andGoodsNameNotIn(final List<String> values) {
            this.addCriterion("goods_name not in", values, "goodsName");
            return (Criteria)this;
        }
        
        public Criteria andGoodsNameBetween(final String value1, final String value2) {
            this.addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria)this;
        }
        
        public Criteria andGoodsNameNotBetween(final String value1, final String value2) {
            this.addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria)this;
        }
        
        public Criteria andGoodsNumberIsNull() {
            this.addCriterion("goods_number is null");
            return (Criteria)this;
        }
        
        public Criteria andGoodsNumberIsNotNull() {
            this.addCriterion("goods_number is not null");
            return (Criteria)this;
        }
        
        public Criteria andGoodsNumberEqualTo(final Integer value) {
            this.addCriterion("goods_number =", value, "goodsNumber");
            return (Criteria)this;
        }
        
        public Criteria andGoodsNumberNotEqualTo(final Integer value) {
            this.addCriterion("goods_number <>", value, "goodsNumber");
            return (Criteria)this;
        }
        
        public Criteria andGoodsNumberGreaterThan(final Integer value) {
            this.addCriterion("goods_number >", value, "goodsNumber");
            return (Criteria)this;
        }
        
        public Criteria andGoodsNumberGreaterThanOrEqualTo(final Integer value) {
            this.addCriterion("goods_number >=", value, "goodsNumber");
            return (Criteria)this;
        }
        
        public Criteria andGoodsNumberLessThan(final Integer value) {
            this.addCriterion("goods_number <", value, "goodsNumber");
            return (Criteria)this;
        }
        
        public Criteria andGoodsNumberLessThanOrEqualTo(final Integer value) {
            this.addCriterion("goods_number <=", value, "goodsNumber");
            return (Criteria)this;
        }
        
        public Criteria andGoodsNumberIn(final List<Integer> values) {
            this.addCriterion("goods_number in", values, "goodsNumber");
            return (Criteria)this;
        }
        
        public Criteria andGoodsNumberNotIn(final List<Integer> values) {
            this.addCriterion("goods_number not in", values, "goodsNumber");
            return (Criteria)this;
        }
        
        public Criteria andGoodsNumberBetween(final Integer value1, final Integer value2) {
            this.addCriterion("goods_number between", value1, value2, "goodsNumber");
            return (Criteria)this;
        }
        
        public Criteria andGoodsNumberNotBetween(final Integer value1, final Integer value2) {
            this.addCriterion("goods_number not between", value1, value2, "goodsNumber");
            return (Criteria)this;
        }
        
        public Criteria andGoodsUnitIsNull() {
            this.addCriterion("goods_unit is null");
            return (Criteria)this;
        }
        
        public Criteria andGoodsUnitIsNotNull() {
            this.addCriterion("goods_unit is not null");
            return (Criteria)this;
        }
        
        public Criteria andGoodsUnitEqualTo(final String value) {
            this.addCriterion("goods_unit =", value, "goodsUnit");
            return (Criteria)this;
        }
        
        public Criteria andGoodsUnitNotEqualTo(final String value) {
            this.addCriterion("goods_unit <>", value, "goodsUnit");
            return (Criteria)this;
        }
        
        public Criteria andGoodsUnitGreaterThan(final String value) {
            this.addCriterion("goods_unit >", value, "goodsUnit");
            return (Criteria)this;
        }
        
        public Criteria andGoodsUnitGreaterThanOrEqualTo(final String value) {
            this.addCriterion("goods_unit >=", value, "goodsUnit");
            return (Criteria)this;
        }
        
        public Criteria andGoodsUnitLessThan(final String value) {
            this.addCriterion("goods_unit <", value, "goodsUnit");
            return (Criteria)this;
        }
        
        public Criteria andGoodsUnitLessThanOrEqualTo(final String value) {
            this.addCriterion("goods_unit <=", value, "goodsUnit");
            return (Criteria)this;
        }
        
        public Criteria andGoodsUnitLike(final String value) {
            this.addCriterion("goods_unit like", value, "goodsUnit");
            return (Criteria)this;
        }
        
        public Criteria andGoodsUnitNotLike(final String value) {
            this.addCriterion("goods_unit not like", value, "goodsUnit");
            return (Criteria)this;
        }
        
        public Criteria andGoodsUnitIn(final List<String> values) {
            this.addCriterion("goods_unit in", values, "goodsUnit");
            return (Criteria)this;
        }
        
        public Criteria andGoodsUnitNotIn(final List<String> values) {
            this.addCriterion("goods_unit not in", values, "goodsUnit");
            return (Criteria)this;
        }
        
        public Criteria andGoodsUnitBetween(final String value1, final String value2) {
            this.addCriterion("goods_unit between", value1, value2, "goodsUnit");
            return (Criteria)this;
        }
        
        public Criteria andGoodsUnitNotBetween(final String value1, final String value2) {
            this.addCriterion("goods_unit not between", value1, value2, "goodsUnit");
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
        
        public Criteria andGoodsTotalIsNull() {
            this.addCriterion("goods_total is null");
            return (Criteria)this;
        }
        
        public Criteria andGoodsTotalIsNotNull() {
            this.addCriterion("goods_total is not null");
            return (Criteria)this;
        }
        
        public Criteria andGoodsTotalEqualTo(final Long value) {
            this.addCriterion("goods_total =", value, "goodsTotal");
            return (Criteria)this;
        }
        
        public Criteria andGoodsTotalNotEqualTo(final Long value) {
            this.addCriterion("goods_total <>", value, "goodsTotal");
            return (Criteria)this;
        }
        
        public Criteria andGoodsTotalGreaterThan(final Long value) {
            this.addCriterion("goods_total >", value, "goodsTotal");
            return (Criteria)this;
        }
        
        public Criteria andGoodsTotalGreaterThanOrEqualTo(final Long value) {
            this.addCriterion("goods_total >=", value, "goodsTotal");
            return (Criteria)this;
        }
        
        public Criteria andGoodsTotalLessThan(final Long value) {
            this.addCriterion("goods_total <", value, "goodsTotal");
            return (Criteria)this;
        }
        
        public Criteria andGoodsTotalLessThanOrEqualTo(final Long value) {
            this.addCriterion("goods_total <=", value, "goodsTotal");
            return (Criteria)this;
        }
        
        public Criteria andGoodsTotalIn(final List<Long> values) {
            this.addCriterion("goods_total in", values, "goodsTotal");
            return (Criteria)this;
        }
        
        public Criteria andGoodsTotalNotIn(final List<Long> values) {
            this.addCriterion("goods_total not in", values, "goodsTotal");
            return (Criteria)this;
        }
        
        public Criteria andGoodsTotalBetween(final Long value1, final Long value2) {
            this.addCriterion("goods_total between", value1, value2, "goodsTotal");
            return (Criteria)this;
        }
        
        public Criteria andGoodsTotalNotBetween(final Long value1, final Long value2) {
            this.addCriterion("goods_total not between", value1, value2, "goodsTotal");
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
