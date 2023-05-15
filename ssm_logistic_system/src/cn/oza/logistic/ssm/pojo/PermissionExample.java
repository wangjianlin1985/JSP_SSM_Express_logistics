// 
// 
// 

package cn.oza.logistic.ssm.pojo;

import java.util.ArrayList;
import java.util.List;

public class PermissionExample
{
    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;
    
    public PermissionExample() {
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
        
        public Criteria andPermissionIdIsNull() {
            this.addCriterion("permission_id is null");
            return (Criteria)this;
        }
        
        public Criteria andPermissionIdIsNotNull() {
            this.addCriterion("permission_id is not null");
            return (Criteria)this;
        }
        
        public Criteria andPermissionIdEqualTo(final Long value) {
            this.addCriterion("permission_id =", value, "permissionId");
            return (Criteria)this;
        }
        
        public Criteria andPermissionIdNotEqualTo(final Long value) {
            this.addCriterion("permission_id <>", value, "permissionId");
            return (Criteria)this;
        }
        
        public Criteria andPermissionIdGreaterThan(final Long value) {
            this.addCriterion("permission_id >", value, "permissionId");
            return (Criteria)this;
        }
        
        public Criteria andPermissionIdGreaterThanOrEqualTo(final Long value) {
            this.addCriterion("permission_id >=", value, "permissionId");
            return (Criteria)this;
        }
        
        public Criteria andPermissionIdLessThan(final Long value) {
            this.addCriterion("permission_id <", value, "permissionId");
            return (Criteria)this;
        }
        
        public Criteria andPermissionIdLessThanOrEqualTo(final Long value) {
            this.addCriterion("permission_id <=", value, "permissionId");
            return (Criteria)this;
        }
        
        public Criteria andPermissionIdIn(final List<Long> values) {
            this.addCriterion("permission_id in", values, "permissionId");
            return (Criteria)this;
        }
        
        public Criteria andPermissionIdNotIn(final List<Long> values) {
            this.addCriterion("permission_id not in", values, "permissionId");
            return (Criteria)this;
        }
        
        public Criteria andPermissionIdBetween(final Long value1, final Long value2) {
            this.addCriterion("permission_id between", value1, value2, "permissionId");
            return (Criteria)this;
        }
        
        public Criteria andPermissionIdNotBetween(final Long value1, final Long value2) {
            this.addCriterion("permission_id not between", value1, value2, "permissionId");
            return (Criteria)this;
        }
        
        public Criteria andNameIsNull() {
            this.addCriterion("name is null");
            return (Criteria)this;
        }
        
        public Criteria andNameIsNotNull() {
            this.addCriterion("name is not null");
            return (Criteria)this;
        }
        
        public Criteria andNameEqualTo(final String value) {
            this.addCriterion("name =", value, "name");
            return (Criteria)this;
        }
        
        public Criteria andNameNotEqualTo(final String value) {
            this.addCriterion("name <>", value, "name");
            return (Criteria)this;
        }
        
        public Criteria andNameGreaterThan(final String value) {
            this.addCriterion("name >", value, "name");
            return (Criteria)this;
        }
        
        public Criteria andNameGreaterThanOrEqualTo(final String value) {
            this.addCriterion("name >=", value, "name");
            return (Criteria)this;
        }
        
        public Criteria andNameLessThan(final String value) {
            this.addCriterion("name <", value, "name");
            return (Criteria)this;
        }
        
        public Criteria andNameLessThanOrEqualTo(final String value) {
            this.addCriterion("name <=", value, "name");
            return (Criteria)this;
        }
        
        public Criteria andNameLike(final String value) {
            this.addCriterion("name like", value, "name");
            return (Criteria)this;
        }
        
        public Criteria andNameNotLike(final String value) {
            this.addCriterion("name not like", value, "name");
            return (Criteria)this;
        }
        
        public Criteria andNameIn(final List<String> values) {
            this.addCriterion("name in", values, "name");
            return (Criteria)this;
        }
        
        public Criteria andNameNotIn(final List<String> values) {
            this.addCriterion("name not in", values, "name");
            return (Criteria)this;
        }
        
        public Criteria andNameBetween(final String value1, final String value2) {
            this.addCriterion("name between", value1, value2, "name");
            return (Criteria)this;
        }
        
        public Criteria andNameNotBetween(final String value1, final String value2) {
            this.addCriterion("name not between", value1, value2, "name");
            return (Criteria)this;
        }
        
        public Criteria andTypeIsNull() {
            this.addCriterion("type is null");
            return (Criteria)this;
        }
        
        public Criteria andTypeIsNotNull() {
            this.addCriterion("type is not null");
            return (Criteria)this;
        }
        
        public Criteria andTypeEqualTo(final String value) {
            this.addCriterion("type =", value, "type");
            return (Criteria)this;
        }
        
        public Criteria andTypeNotEqualTo(final String value) {
            this.addCriterion("type <>", value, "type");
            return (Criteria)this;
        }
        
        public Criteria andTypeGreaterThan(final String value) {
            this.addCriterion("type >", value, "type");
            return (Criteria)this;
        }
        
        public Criteria andTypeGreaterThanOrEqualTo(final String value) {
            this.addCriterion("type >=", value, "type");
            return (Criteria)this;
        }
        
        public Criteria andTypeLessThan(final String value) {
            this.addCriterion("type <", value, "type");
            return (Criteria)this;
        }
        
        public Criteria andTypeLessThanOrEqualTo(final String value) {
            this.addCriterion("type <=", value, "type");
            return (Criteria)this;
        }
        
        public Criteria andTypeLike(final String value) {
            this.addCriterion("type like", value, "type");
            return (Criteria)this;
        }
        
        public Criteria andTypeNotLike(final String value) {
            this.addCriterion("type not like", value, "type");
            return (Criteria)this;
        }
        
        public Criteria andTypeIn(final List<String> values) {
            this.addCriterion("type in", values, "type");
            return (Criteria)this;
        }
        
        public Criteria andTypeNotIn(final List<String> values) {
            this.addCriterion("type not in", values, "type");
            return (Criteria)this;
        }
        
        public Criteria andTypeBetween(final String value1, final String value2) {
            this.addCriterion("type between", value1, value2, "type");
            return (Criteria)this;
        }
        
        public Criteria andTypeNotBetween(final String value1, final String value2) {
            this.addCriterion("type not between", value1, value2, "type");
            return (Criteria)this;
        }
        
        public Criteria andUrlIsNull() {
            this.addCriterion("url is null");
            return (Criteria)this;
        }
        
        public Criteria andUrlIsNotNull() {
            this.addCriterion("url is not null");
            return (Criteria)this;
        }
        
        public Criteria andUrlEqualTo(final String value) {
            this.addCriterion("url =", value, "url");
            return (Criteria)this;
        }
        
        public Criteria andUrlNotEqualTo(final String value) {
            this.addCriterion("url <>", value, "url");
            return (Criteria)this;
        }
        
        public Criteria andUrlGreaterThan(final String value) {
            this.addCriterion("url >", value, "url");
            return (Criteria)this;
        }
        
        public Criteria andUrlGreaterThanOrEqualTo(final String value) {
            this.addCriterion("url >=", value, "url");
            return (Criteria)this;
        }
        
        public Criteria andUrlLessThan(final String value) {
            this.addCriterion("url <", value, "url");
            return (Criteria)this;
        }
        
        public Criteria andUrlLessThanOrEqualTo(final String value) {
            this.addCriterion("url <=", value, "url");
            return (Criteria)this;
        }
        
        public Criteria andUrlLike(final String value) {
            this.addCriterion("url like", value, "url");
            return (Criteria)this;
        }
        
        public Criteria andUrlNotLike(final String value) {
            this.addCriterion("url not like", value, "url");
            return (Criteria)this;
        }
        
        public Criteria andUrlIn(final List<String> values) {
            this.addCriterion("url in", values, "url");
            return (Criteria)this;
        }
        
        public Criteria andUrlNotIn(final List<String> values) {
            this.addCriterion("url not in", values, "url");
            return (Criteria)this;
        }
        
        public Criteria andUrlBetween(final String value1, final String value2) {
            this.addCriterion("url between", value1, value2, "url");
            return (Criteria)this;
        }
        
        public Criteria andUrlNotBetween(final String value1, final String value2) {
            this.addCriterion("url not between", value1, value2, "url");
            return (Criteria)this;
        }
        
        public Criteria andExpressionIsNull() {
            this.addCriterion("expression is null");
            return (Criteria)this;
        }
        
        public Criteria andExpressionIsNotNull() {
            this.addCriterion("expression is not null");
            return (Criteria)this;
        }
        
        public Criteria andExpressionEqualTo(final String value) {
            this.addCriterion("expression =", value, "expression");
            return (Criteria)this;
        }
        
        public Criteria andExpressionNotEqualTo(final String value) {
            this.addCriterion("expression <>", value, "expression");
            return (Criteria)this;
        }
        
        public Criteria andExpressionGreaterThan(final String value) {
            this.addCriterion("expression >", value, "expression");
            return (Criteria)this;
        }
        
        public Criteria andExpressionGreaterThanOrEqualTo(final String value) {
            this.addCriterion("expression >=", value, "expression");
            return (Criteria)this;
        }
        
        public Criteria andExpressionLessThan(final String value) {
            this.addCriterion("expression <", value, "expression");
            return (Criteria)this;
        }
        
        public Criteria andExpressionLessThanOrEqualTo(final String value) {
            this.addCriterion("expression <=", value, "expression");
            return (Criteria)this;
        }
        
        public Criteria andExpressionLike(final String value) {
            this.addCriterion("expression like", value, "expression");
            return (Criteria)this;
        }
        
        public Criteria andExpressionNotLike(final String value) {
            this.addCriterion("expression not like", value, "expression");
            return (Criteria)this;
        }
        
        public Criteria andExpressionIn(final List<String> values) {
            this.addCriterion("expression in", values, "expression");
            return (Criteria)this;
        }
        
        public Criteria andExpressionNotIn(final List<String> values) {
            this.addCriterion("expression not in", values, "expression");
            return (Criteria)this;
        }
        
        public Criteria andExpressionBetween(final String value1, final String value2) {
            this.addCriterion("expression between", value1, value2, "expression");
            return (Criteria)this;
        }
        
        public Criteria andExpressionNotBetween(final String value1, final String value2) {
            this.addCriterion("expression not between", value1, value2, "expression");
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
        
        public Criteria andSortIsNull() {
            this.addCriterion("sort is null");
            return (Criteria)this;
        }
        
        public Criteria andSortIsNotNull() {
            this.addCriterion("sort is not null");
            return (Criteria)this;
        }
        
        public Criteria andSortEqualTo(final Integer value) {
            this.addCriterion("sort =", value, "sort");
            return (Criteria)this;
        }
        
        public Criteria andSortNotEqualTo(final Integer value) {
            this.addCriterion("sort <>", value, "sort");
            return (Criteria)this;
        }
        
        public Criteria andSortGreaterThan(final Integer value) {
            this.addCriterion("sort >", value, "sort");
            return (Criteria)this;
        }
        
        public Criteria andSortGreaterThanOrEqualTo(final Integer value) {
            this.addCriterion("sort >=", value, "sort");
            return (Criteria)this;
        }
        
        public Criteria andSortLessThan(final Integer value) {
            this.addCriterion("sort <", value, "sort");
            return (Criteria)this;
        }
        
        public Criteria andSortLessThanOrEqualTo(final Integer value) {
            this.addCriterion("sort <=", value, "sort");
            return (Criteria)this;
        }
        
        public Criteria andSortIn(final List<Integer> values) {
            this.addCriterion("sort in", values, "sort");
            return (Criteria)this;
        }
        
        public Criteria andSortNotIn(final List<Integer> values) {
            this.addCriterion("sort not in", values, "sort");
            return (Criteria)this;
        }
        
        public Criteria andSortBetween(final Integer value1, final Integer value2) {
            this.addCriterion("sort between", value1, value2, "sort");
            return (Criteria)this;
        }
        
        public Criteria andSortNotBetween(final Integer value1, final Integer value2) {
            this.addCriterion("sort not between", value1, value2, "sort");
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
