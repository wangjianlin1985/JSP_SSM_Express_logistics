// 
// 
// 

package cn.oza.logistic.ssm.pojo;

import java.util.ArrayList;
import java.util.List;

public class RoleExample
{
    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;
    
    public RoleExample() {
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
        
        public Criteria andRoleIdIsNull() {
            this.addCriterion("role_id is null");
            return (Criteria)this;
        }
        
        public Criteria andRoleIdIsNotNull() {
            this.addCriterion("role_id is not null");
            return (Criteria)this;
        }
        
        public Criteria andRoleIdEqualTo(final Long value) {
            this.addCriterion("role_id =", value, "roleId");
            return (Criteria)this;
        }
        
        public Criteria andRoleIdNotEqualTo(final Long value) {
            this.addCriterion("role_id <>", value, "roleId");
            return (Criteria)this;
        }
        
        public Criteria andRoleIdGreaterThan(final Long value) {
            this.addCriterion("role_id >", value, "roleId");
            return (Criteria)this;
        }
        
        public Criteria andRoleIdGreaterThanOrEqualTo(final Long value) {
            this.addCriterion("role_id >=", value, "roleId");
            return (Criteria)this;
        }
        
        public Criteria andRoleIdLessThan(final Long value) {
            this.addCriterion("role_id <", value, "roleId");
            return (Criteria)this;
        }
        
        public Criteria andRoleIdLessThanOrEqualTo(final Long value) {
            this.addCriterion("role_id <=", value, "roleId");
            return (Criteria)this;
        }
        
        public Criteria andRoleIdIn(final List<Long> values) {
            this.addCriterion("role_id in", values, "roleId");
            return (Criteria)this;
        }
        
        public Criteria andRoleIdNotIn(final List<Long> values) {
            this.addCriterion("role_id not in", values, "roleId");
            return (Criteria)this;
        }
        
        public Criteria andRoleIdBetween(final Long value1, final Long value2) {
            this.addCriterion("role_id between", value1, value2, "roleId");
            return (Criteria)this;
        }
        
        public Criteria andRoleIdNotBetween(final Long value1, final Long value2) {
            this.addCriterion("role_id not between", value1, value2, "roleId");
            return (Criteria)this;
        }
        
        public Criteria andRolenameIsNull() {
            this.addCriterion("rolename is null");
            return (Criteria)this;
        }
        
        public Criteria andRolenameIsNotNull() {
            this.addCriterion("rolename is not null");
            return (Criteria)this;
        }
        
        public Criteria andRolenameEqualTo(final String value) {
            this.addCriterion("rolename =", value, "rolename");
            return (Criteria)this;
        }
        
        public Criteria andRolenameNotEqualTo(final String value) {
            this.addCriterion("rolename <>", value, "rolename");
            return (Criteria)this;
        }
        
        public Criteria andRolenameGreaterThan(final String value) {
            this.addCriterion("rolename >", value, "rolename");
            return (Criteria)this;
        }
        
        public Criteria andRolenameGreaterThanOrEqualTo(final String value) {
            this.addCriterion("rolename >=", value, "rolename");
            return (Criteria)this;
        }
        
        public Criteria andRolenameLessThan(final String value) {
            this.addCriterion("rolename <", value, "rolename");
            return (Criteria)this;
        }
        
        public Criteria andRolenameLessThanOrEqualTo(final String value) {
            this.addCriterion("rolename <=", value, "rolename");
            return (Criteria)this;
        }
        
        public Criteria andRolenameLike(final String value) {
            this.addCriterion("rolename like", value, "rolename");
            return (Criteria)this;
        }
        
        public Criteria andRolenameNotLike(final String value) {
            this.addCriterion("rolename not like", value, "rolename");
            return (Criteria)this;
        }
        
        public Criteria andRolenameIn(final List<String> values) {
            this.addCriterion("rolename in", values, "rolename");
            return (Criteria)this;
        }
        
        public Criteria andRolenameNotIn(final List<String> values) {
            this.addCriterion("rolename not in", values, "rolename");
            return (Criteria)this;
        }
        
        public Criteria andRolenameBetween(final String value1, final String value2) {
            this.addCriterion("rolename between", value1, value2, "rolename");
            return (Criteria)this;
        }
        
        public Criteria andRolenameNotBetween(final String value1, final String value2) {
            this.addCriterion("rolename not between", value1, value2, "rolename");
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
        
        public Criteria andPermissionIdsIsNull() {
            this.addCriterion("permission_ids is null");
            return (Criteria)this;
        }
        
        public Criteria andPermissionIdsIsNotNull() {
            this.addCriterion("permission_ids is not null");
            return (Criteria)this;
        }
        
        public Criteria andPermissionIdsEqualTo(final String value) {
            this.addCriterion("permission_ids =", value, "permissionIds");
            return (Criteria)this;
        }
        
        public Criteria andPermissionIdsNotEqualTo(final String value) {
            this.addCriterion("permission_ids <>", value, "permissionIds");
            return (Criteria)this;
        }
        
        public Criteria andPermissionIdsGreaterThan(final String value) {
            this.addCriterion("permission_ids >", value, "permissionIds");
            return (Criteria)this;
        }
        
        public Criteria andPermissionIdsGreaterThanOrEqualTo(final String value) {
            this.addCriterion("permission_ids >=", value, "permissionIds");
            return (Criteria)this;
        }
        
        public Criteria andPermissionIdsLessThan(final String value) {
            this.addCriterion("permission_ids <", value, "permissionIds");
            return (Criteria)this;
        }
        
        public Criteria andPermissionIdsLessThanOrEqualTo(final String value) {
            this.addCriterion("permission_ids <=", value, "permissionIds");
            return (Criteria)this;
        }
        
        public Criteria andPermissionIdsLike(final String value) {
            this.addCriterion("permission_ids like", value, "permissionIds");
            return (Criteria)this;
        }
        
        public Criteria andPermissionIdsNotLike(final String value) {
            this.addCriterion("permission_ids not like", value, "permissionIds");
            return (Criteria)this;
        }
        
        public Criteria andPermissionIdsIn(final List<String> values) {
            this.addCriterion("permission_ids in", values, "permissionIds");
            return (Criteria)this;
        }
        
        public Criteria andPermissionIdsNotIn(final List<String> values) {
            this.addCriterion("permission_ids not in", values, "permissionIds");
            return (Criteria)this;
        }
        
        public Criteria andPermissionIdsBetween(final String value1, final String value2) {
            this.addCriterion("permission_ids between", value1, value2, "permissionIds");
            return (Criteria)this;
        }
        
        public Criteria andPermissionIdsNotBetween(final String value1, final String value2) {
            this.addCriterion("permission_ids not between", value1, value2, "permissionIds");
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
