// 
// 
// 

package cn.oza.logistic.ssm.pojo;

import java.util.ArrayList;
import java.util.List;

public class BasicDataExample
{
    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;
    
    public BasicDataExample() {
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
        
        public Criteria andBaseIdIsNull() {
            this.addCriterion("base_id is null");
            return (Criteria)this;
        }
        
        public Criteria andBaseIdIsNotNull() {
            this.addCriterion("base_id is not null");
            return (Criteria)this;
        }
        
        public Criteria andBaseIdEqualTo(final Long value) {
            this.addCriterion("base_id =", value, "baseId");
            return (Criteria)this;
        }
        
        public Criteria andBaseIdNotEqualTo(final Long value) {
            this.addCriterion("base_id <>", value, "baseId");
            return (Criteria)this;
        }
        
        public Criteria andBaseIdGreaterThan(final Long value) {
            this.addCriterion("base_id >", value, "baseId");
            return (Criteria)this;
        }
        
        public Criteria andBaseIdGreaterThanOrEqualTo(final Long value) {
            this.addCriterion("base_id >=", value, "baseId");
            return (Criteria)this;
        }
        
        public Criteria andBaseIdLessThan(final Long value) {
            this.addCriterion("base_id <", value, "baseId");
            return (Criteria)this;
        }
        
        public Criteria andBaseIdLessThanOrEqualTo(final Long value) {
            this.addCriterion("base_id <=", value, "baseId");
            return (Criteria)this;
        }
        
        public Criteria andBaseIdIn(final List<Long> values) {
            this.addCriterion("base_id in", values, "baseId");
            return (Criteria)this;
        }
        
        public Criteria andBaseIdNotIn(final List<Long> values) {
            this.addCriterion("base_id not in", values, "baseId");
            return (Criteria)this;
        }
        
        public Criteria andBaseIdBetween(final Long value1, final Long value2) {
            this.addCriterion("base_id between", value1, value2, "baseId");
            return (Criteria)this;
        }
        
        public Criteria andBaseIdNotBetween(final Long value1, final Long value2) {
            this.addCriterion("base_id not between", value1, value2, "baseId");
            return (Criteria)this;
        }
        
        public Criteria andBaseNameIsNull() {
            this.addCriterion("base_name is null");
            return (Criteria)this;
        }
        
        public Criteria andBaseNameIsNotNull() {
            this.addCriterion("base_name is not null");
            return (Criteria)this;
        }
        
        public Criteria andBaseNameEqualTo(final String value) {
            this.addCriterion("base_name =", value, "baseName");
            return (Criteria)this;
        }
        
        public Criteria andBaseNameNotEqualTo(final String value) {
            this.addCriterion("base_name <>", value, "baseName");
            return (Criteria)this;
        }
        
        public Criteria andBaseNameGreaterThan(final String value) {
            this.addCriterion("base_name >", value, "baseName");
            return (Criteria)this;
        }
        
        public Criteria andBaseNameGreaterThanOrEqualTo(final String value) {
            this.addCriterion("base_name >=", value, "baseName");
            return (Criteria)this;
        }
        
        public Criteria andBaseNameLessThan(final String value) {
            this.addCriterion("base_name <", value, "baseName");
            return (Criteria)this;
        }
        
        public Criteria andBaseNameLessThanOrEqualTo(final String value) {
            this.addCriterion("base_name <=", value, "baseName");
            return (Criteria)this;
        }
        
        public Criteria andBaseNameLike(final String value) {
            this.addCriterion("base_name like", value, "baseName");
            return (Criteria)this;
        }
        
        public Criteria andBaseNameNotLike(final String value) {
            this.addCriterion("base_name not like", value, "baseName");
            return (Criteria)this;
        }
        
        public Criteria andBaseNameIn(final List<String> values) {
            this.addCriterion("base_name in", values, "baseName");
            return (Criteria)this;
        }
        
        public Criteria andBaseNameNotIn(final List<String> values) {
            this.addCriterion("base_name not in", values, "baseName");
            return (Criteria)this;
        }
        
        public Criteria andBaseNameBetween(final String value1, final String value2) {
            this.addCriterion("base_name between", value1, value2, "baseName");
            return (Criteria)this;
        }
        
        public Criteria andBaseNameNotBetween(final String value1, final String value2) {
            this.addCriterion("base_name not between", value1, value2, "baseName");
            return (Criteria)this;
        }
        
        public Criteria andBaseDescIsNull() {
            this.addCriterion("base_desc is null");
            return (Criteria)this;
        }
        
        public Criteria andBaseDescIsNotNull() {
            this.addCriterion("base_desc is not null");
            return (Criteria)this;
        }
        
        public Criteria andBaseDescEqualTo(final String value) {
            this.addCriterion("base_desc =", value, "baseDesc");
            return (Criteria)this;
        }
        
        public Criteria andBaseDescNotEqualTo(final String value) {
            this.addCriterion("base_desc <>", value, "baseDesc");
            return (Criteria)this;
        }
        
        public Criteria andBaseDescGreaterThan(final String value) {
            this.addCriterion("base_desc >", value, "baseDesc");
            return (Criteria)this;
        }
        
        public Criteria andBaseDescGreaterThanOrEqualTo(final String value) {
            this.addCriterion("base_desc >=", value, "baseDesc");
            return (Criteria)this;
        }
        
        public Criteria andBaseDescLessThan(final String value) {
            this.addCriterion("base_desc <", value, "baseDesc");
            return (Criteria)this;
        }
        
        public Criteria andBaseDescLessThanOrEqualTo(final String value) {
            this.addCriterion("base_desc <=", value, "baseDesc");
            return (Criteria)this;
        }
        
        public Criteria andBaseDescLike(final String value) {
            this.addCriterion("base_desc like", value, "baseDesc");
            return (Criteria)this;
        }
        
        public Criteria andBaseDescNotLike(final String value) {
            this.addCriterion("base_desc not like", value, "baseDesc");
            return (Criteria)this;
        }
        
        public Criteria andBaseDescIn(final List<String> values) {
            this.addCriterion("base_desc in", values, "baseDesc");
            return (Criteria)this;
        }
        
        public Criteria andBaseDescNotIn(final List<String> values) {
            this.addCriterion("base_desc not in", values, "baseDesc");
            return (Criteria)this;
        }
        
        public Criteria andBaseDescBetween(final String value1, final String value2) {
            this.addCriterion("base_desc between", value1, value2, "baseDesc");
            return (Criteria)this;
        }
        
        public Criteria andBaseDescNotBetween(final String value1, final String value2) {
            this.addCriterion("base_desc not between", value1, value2, "baseDesc");
            return (Criteria)this;
        }
        
        public Criteria andParentIdIsNull() {
            this.addCriterion("parent_id is null");
            return (Criteria)this;
        }
        
        public Criteria andParentIdIsNotNull() {
            this.addCriterion("parent_id is not null");
            return (Criteria)this;
        }
        
        public Criteria andParentIdEqualTo(final Long value) {
            this.addCriterion("parent_id =", value, "parentId");
            return (Criteria)this;
        }
        
        public Criteria andParentIdNotEqualTo(final Long value) {
            this.addCriterion("parent_id <>", value, "parentId");
            return (Criteria)this;
        }
        
        public Criteria andParentIdGreaterThan(final Long value) {
            this.addCriterion("parent_id >", value, "parentId");
            return (Criteria)this;
        }
        
        public Criteria andParentIdGreaterThanOrEqualTo(final Long value) {
            this.addCriterion("parent_id >=", value, "parentId");
            return (Criteria)this;
        }
        
        public Criteria andParentIdLessThan(final Long value) {
            this.addCriterion("parent_id <", value, "parentId");
            return (Criteria)this;
        }
        
        public Criteria andParentIdLessThanOrEqualTo(final Long value) {
            this.addCriterion("parent_id <=", value, "parentId");
            return (Criteria)this;
        }
        
        public Criteria andParentIdIn(final List<Long> values) {
            this.addCriterion("parent_id in", values, "parentId");
            return (Criteria)this;
        }
        
        public Criteria andParentIdNotIn(final List<Long> values) {
            this.addCriterion("parent_id not in", values, "parentId");
            return (Criteria)this;
        }
        
        public Criteria andParentIdBetween(final Long value1, final Long value2) {
            this.addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria)this;
        }
        
        public Criteria andParentIdNotBetween(final Long value1, final Long value2) {
            this.addCriterion("parent_id not between", value1, value2, "parentId");
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
