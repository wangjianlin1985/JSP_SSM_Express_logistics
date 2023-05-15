// 
// 
// 

package cn.oza.logistic.ssm.pojo;

import java.util.ArrayList;
import java.util.List;

public class OrderDetailExample
{
    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;
    
    public OrderDetailExample() {
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
        
        public Criteria andGoodsUnitEqualTo(final Long value) {
            this.addCriterion("goods_unit =", value, "goodsUnit");
            return (Criteria)this;
        }
        
        public Criteria andGoodsUnitNotEqualTo(final Long value) {
            this.addCriterion("goods_unit <>", value, "goodsUnit");
            return (Criteria)this;
        }
        
        public Criteria andGoodsUnitGreaterThan(final Long value) {
            this.addCriterion("goods_unit >", value, "goodsUnit");
            return (Criteria)this;
        }
        
        public Criteria andGoodsUnitGreaterThanOrEqualTo(final Long value) {
            this.addCriterion("goods_unit >=", value, "goodsUnit");
            return (Criteria)this;
        }
        
        public Criteria andGoodsUnitLessThan(final Long value) {
            this.addCriterion("goods_unit <", value, "goodsUnit");
            return (Criteria)this;
        }
        
        public Criteria andGoodsUnitLessThanOrEqualTo(final Long value) {
            this.addCriterion("goods_unit <=", value, "goodsUnit");
            return (Criteria)this;
        }
        
        public Criteria andGoodsUnitIn(final List<Long> values) {
            this.addCriterion("goods_unit in", values, "goodsUnit");
            return (Criteria)this;
        }
        
        public Criteria andGoodsUnitNotIn(final List<Long> values) {
            this.addCriterion("goods_unit not in", values, "goodsUnit");
            return (Criteria)this;
        }
        
        public Criteria andGoodsUnitBetween(final Long value1, final Long value2) {
            this.addCriterion("goods_unit between", value1, value2, "goodsUnit");
            return (Criteria)this;
        }
        
        public Criteria andGoodsUnitNotBetween(final Long value1, final Long value2) {
            this.addCriterion("goods_unit not between", value1, value2, "goodsUnit");
            return (Criteria)this;
        }
        
        public Criteria andGoodsUnitPriceIsNull() {
            this.addCriterion("goods_unit_price is null");
            return (Criteria)this;
        }
        
        public Criteria andGoodsUnitPriceIsNotNull() {
            this.addCriterion("goods_unit_price is not null");
            return (Criteria)this;
        }
        
        public Criteria andGoodsUnitPriceEqualTo(final Long value) {
            this.addCriterion("goods_unit_price =", value, "goodsUnitPrice");
            return (Criteria)this;
        }
        
        public Criteria andGoodsUnitPriceNotEqualTo(final Long value) {
            this.addCriterion("goods_unit_price <>", value, "goodsUnitPrice");
            return (Criteria)this;
        }
        
        public Criteria andGoodsUnitPriceGreaterThan(final Long value) {
            this.addCriterion("goods_unit_price >", value, "goodsUnitPrice");
            return (Criteria)this;
        }
        
        public Criteria andGoodsUnitPriceGreaterThanOrEqualTo(final Long value) {
            this.addCriterion("goods_unit_price >=", value, "goodsUnitPrice");
            return (Criteria)this;
        }
        
        public Criteria andGoodsUnitPriceLessThan(final Long value) {
            this.addCriterion("goods_unit_price <", value, "goodsUnitPrice");
            return (Criteria)this;
        }
        
        public Criteria andGoodsUnitPriceLessThanOrEqualTo(final Long value) {
            this.addCriterion("goods_unit_price <=", value, "goodsUnitPrice");
            return (Criteria)this;
        }
        
        public Criteria andGoodsUnitPriceIn(final List<Long> values) {
            this.addCriterion("goods_unit_price in", values, "goodsUnitPrice");
            return (Criteria)this;
        }
        
        public Criteria andGoodsUnitPriceNotIn(final List<Long> values) {
            this.addCriterion("goods_unit_price not in", values, "goodsUnitPrice");
            return (Criteria)this;
        }
        
        public Criteria andGoodsUnitPriceBetween(final Long value1, final Long value2) {
            this.addCriterion("goods_unit_price between", value1, value2, "goodsUnitPrice");
            return (Criteria)this;
        }
        
        public Criteria andGoodsUnitPriceNotBetween(final Long value1, final Long value2) {
            this.addCriterion("goods_unit_price not between", value1, value2, "goodsUnitPrice");
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
        
        public Criteria andGoodsRemarkIsNull() {
            this.addCriterion("goods_remark is null");
            return (Criteria)this;
        }
        
        public Criteria andGoodsRemarkIsNotNull() {
            this.addCriterion("goods_remark is not null");
            return (Criteria)this;
        }
        
        public Criteria andGoodsRemarkEqualTo(final String value) {
            this.addCriterion("goods_remark =", value, "goodsRemark");
            return (Criteria)this;
        }
        
        public Criteria andGoodsRemarkNotEqualTo(final String value) {
            this.addCriterion("goods_remark <>", value, "goodsRemark");
            return (Criteria)this;
        }
        
        public Criteria andGoodsRemarkGreaterThan(final String value) {
            this.addCriterion("goods_remark >", value, "goodsRemark");
            return (Criteria)this;
        }
        
        public Criteria andGoodsRemarkGreaterThanOrEqualTo(final String value) {
            this.addCriterion("goods_remark >=", value, "goodsRemark");
            return (Criteria)this;
        }
        
        public Criteria andGoodsRemarkLessThan(final String value) {
            this.addCriterion("goods_remark <", value, "goodsRemark");
            return (Criteria)this;
        }
        
        public Criteria andGoodsRemarkLessThanOrEqualTo(final String value) {
            this.addCriterion("goods_remark <=", value, "goodsRemark");
            return (Criteria)this;
        }
        
        public Criteria andGoodsRemarkLike(final String value) {
            this.addCriterion("goods_remark like", value, "goodsRemark");
            return (Criteria)this;
        }
        
        public Criteria andGoodsRemarkNotLike(final String value) {
            this.addCriterion("goods_remark not like", value, "goodsRemark");
            return (Criteria)this;
        }
        
        public Criteria andGoodsRemarkIn(final List<String> values) {
            this.addCriterion("goods_remark in", values, "goodsRemark");
            return (Criteria)this;
        }
        
        public Criteria andGoodsRemarkNotIn(final List<String> values) {
            this.addCriterion("goods_remark not in", values, "goodsRemark");
            return (Criteria)this;
        }
        
        public Criteria andGoodsRemarkBetween(final String value1, final String value2) {
            this.addCriterion("goods_remark between", value1, value2, "goodsRemark");
            return (Criteria)this;
        }
        
        public Criteria andGoodsRemarkNotBetween(final String value1, final String value2) {
            this.addCriterion("goods_remark not between", value1, value2, "goodsRemark");
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
