// 
// 
// 

package cn.oza.logistic.ssm.pojo;

import java.util.Iterator;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class UserExample
{
    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;
    
    public UserExample() {
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
        
        protected void addCriterionForJDBCDate(final String condition, final Date value, final String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            this.addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }
        
        protected void addCriterionForJDBCDate(final String condition, final List<Date> values, final String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            final List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            final Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            this.addCriterion(condition, dateList, property);
        }
        
        protected void addCriterionForJDBCDate(final String condition, final Date value1, final Date value2, final String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            this.addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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
        
        public Criteria andRealnameIsNull() {
            this.addCriterion("realname is null");
            return (Criteria)this;
        }
        
        public Criteria andRealnameIsNotNull() {
            this.addCriterion("realname is not null");
            return (Criteria)this;
        }
        
        public Criteria andRealnameEqualTo(final String value) {
            this.addCriterion("realname =", value, "realname");
            return (Criteria)this;
        }
        
        public Criteria andRealnameNotEqualTo(final String value) {
            this.addCriterion("realname <>", value, "realname");
            return (Criteria)this;
        }
        
        public Criteria andRealnameGreaterThan(final String value) {
            this.addCriterion("realname >", value, "realname");
            return (Criteria)this;
        }
        
        public Criteria andRealnameGreaterThanOrEqualTo(final String value) {
            this.addCriterion("realname >=", value, "realname");
            return (Criteria)this;
        }
        
        public Criteria andRealnameLessThan(final String value) {
            this.addCriterion("realname <", value, "realname");
            return (Criteria)this;
        }
        
        public Criteria andRealnameLessThanOrEqualTo(final String value) {
            this.addCriterion("realname <=", value, "realname");
            return (Criteria)this;
        }
        
        public Criteria andRealnameLike(final String value) {
            this.addCriterion("realname like", value, "realname");
            return (Criteria)this;
        }
        
        public Criteria andRealnameNotLike(final String value) {
            this.addCriterion("realname not like", value, "realname");
            return (Criteria)this;
        }
        
        public Criteria andRealnameIn(final List<String> values) {
            this.addCriterion("realname in", values, "realname");
            return (Criteria)this;
        }
        
        public Criteria andRealnameNotIn(final List<String> values) {
            this.addCriterion("realname not in", values, "realname");
            return (Criteria)this;
        }
        
        public Criteria andRealnameBetween(final String value1, final String value2) {
            this.addCriterion("realname between", value1, value2, "realname");
            return (Criteria)this;
        }
        
        public Criteria andRealnameNotBetween(final String value1, final String value2) {
            this.addCriterion("realname not between", value1, value2, "realname");
            return (Criteria)this;
        }
        
        public Criteria andPasswordIsNull() {
            this.addCriterion("password is null");
            return (Criteria)this;
        }
        
        public Criteria andPasswordIsNotNull() {
            this.addCriterion("password is not null");
            return (Criteria)this;
        }
        
        public Criteria andPasswordEqualTo(final String value) {
            this.addCriterion("password =", value, "password");
            return (Criteria)this;
        }
        
        public Criteria andPasswordNotEqualTo(final String value) {
            this.addCriterion("password <>", value, "password");
            return (Criteria)this;
        }
        
        public Criteria andPasswordGreaterThan(final String value) {
            this.addCriterion("password >", value, "password");
            return (Criteria)this;
        }
        
        public Criteria andPasswordGreaterThanOrEqualTo(final String value) {
            this.addCriterion("password >=", value, "password");
            return (Criteria)this;
        }
        
        public Criteria andPasswordLessThan(final String value) {
            this.addCriterion("password <", value, "password");
            return (Criteria)this;
        }
        
        public Criteria andPasswordLessThanOrEqualTo(final String value) {
            this.addCriterion("password <=", value, "password");
            return (Criteria)this;
        }
        
        public Criteria andPasswordLike(final String value) {
            this.addCriterion("password like", value, "password");
            return (Criteria)this;
        }
        
        public Criteria andPasswordNotLike(final String value) {
            this.addCriterion("password not like", value, "password");
            return (Criteria)this;
        }
        
        public Criteria andPasswordIn(final List<String> values) {
            this.addCriterion("password in", values, "password");
            return (Criteria)this;
        }
        
        public Criteria andPasswordNotIn(final List<String> values) {
            this.addCriterion("password not in", values, "password");
            return (Criteria)this;
        }
        
        public Criteria andPasswordBetween(final String value1, final String value2) {
            this.addCriterion("password between", value1, value2, "password");
            return (Criteria)this;
        }
        
        public Criteria andPasswordNotBetween(final String value1, final String value2) {
            this.addCriterion("password not between", value1, value2, "password");
            return (Criteria)this;
        }
        
        public Criteria andSaltIsNull() {
            this.addCriterion("salt is null");
            return (Criteria)this;
        }
        
        public Criteria andSaltIsNotNull() {
            this.addCriterion("salt is not null");
            return (Criteria)this;
        }
        
        public Criteria andSaltEqualTo(final String value) {
            this.addCriterion("salt =", value, "salt");
            return (Criteria)this;
        }
        
        public Criteria andSaltNotEqualTo(final String value) {
            this.addCriterion("salt <>", value, "salt");
            return (Criteria)this;
        }
        
        public Criteria andSaltGreaterThan(final String value) {
            this.addCriterion("salt >", value, "salt");
            return (Criteria)this;
        }
        
        public Criteria andSaltGreaterThanOrEqualTo(final String value) {
            this.addCriterion("salt >=", value, "salt");
            return (Criteria)this;
        }
        
        public Criteria andSaltLessThan(final String value) {
            this.addCriterion("salt <", value, "salt");
            return (Criteria)this;
        }
        
        public Criteria andSaltLessThanOrEqualTo(final String value) {
            this.addCriterion("salt <=", value, "salt");
            return (Criteria)this;
        }
        
        public Criteria andSaltLike(final String value) {
            this.addCriterion("salt like", value, "salt");
            return (Criteria)this;
        }
        
        public Criteria andSaltNotLike(final String value) {
            this.addCriterion("salt not like", value, "salt");
            return (Criteria)this;
        }
        
        public Criteria andSaltIn(final List<String> values) {
            this.addCriterion("salt in", values, "salt");
            return (Criteria)this;
        }
        
        public Criteria andSaltNotIn(final List<String> values) {
            this.addCriterion("salt not in", values, "salt");
            return (Criteria)this;
        }
        
        public Criteria andSaltBetween(final String value1, final String value2) {
            this.addCriterion("salt between", value1, value2, "salt");
            return (Criteria)this;
        }
        
        public Criteria andSaltNotBetween(final String value1, final String value2) {
            this.addCriterion("salt not between", value1, value2, "salt");
            return (Criteria)this;
        }
        
        public Criteria andStatusIsNull() {
            this.addCriterion("status is null");
            return (Criteria)this;
        }
        
        public Criteria andStatusIsNotNull() {
            this.addCriterion("status is not null");
            return (Criteria)this;
        }
        
        public Criteria andStatusEqualTo(final Integer value) {
            this.addCriterion("status =", value, "status");
            return (Criteria)this;
        }
        
        public Criteria andStatusNotEqualTo(final Integer value) {
            this.addCriterion("status <>", value, "status");
            return (Criteria)this;
        }
        
        public Criteria andStatusGreaterThan(final Integer value) {
            this.addCriterion("status >", value, "status");
            return (Criteria)this;
        }
        
        public Criteria andStatusGreaterThanOrEqualTo(final Integer value) {
            this.addCriterion("status >=", value, "status");
            return (Criteria)this;
        }
        
        public Criteria andStatusLessThan(final Integer value) {
            this.addCriterion("status <", value, "status");
            return (Criteria)this;
        }
        
        public Criteria andStatusLessThanOrEqualTo(final Integer value) {
            this.addCriterion("status <=", value, "status");
            return (Criteria)this;
        }
        
        public Criteria andStatusIn(final List<Integer> values) {
            this.addCriterion("status in", values, "status");
            return (Criteria)this;
        }
        
        public Criteria andStatusNotIn(final List<Integer> values) {
            this.addCriterion("status not in", values, "status");
            return (Criteria)this;
        }
        
        public Criteria andStatusBetween(final Integer value1, final Integer value2) {
            this.addCriterion("status between", value1, value2, "status");
            return (Criteria)this;
        }
        
        public Criteria andStatusNotBetween(final Integer value1, final Integer value2) {
            this.addCriterion("status not between", value1, value2, "status");
            return (Criteria)this;
        }
        
        public Criteria andCreateDateIsNull() {
            this.addCriterion("create_date is null");
            return (Criteria)this;
        }
        
        public Criteria andCreateDateIsNotNull() {
            this.addCriterion("create_date is not null");
            return (Criteria)this;
        }
        
        public Criteria andCreateDateEqualTo(final Date value) {
            this.addCriterionForJDBCDate("create_date =", value, "createDate");
            return (Criteria)this;
        }
        
        public Criteria andCreateDateNotEqualTo(final Date value) {
            this.addCriterionForJDBCDate("create_date <>", value, "createDate");
            return (Criteria)this;
        }
        
        public Criteria andCreateDateGreaterThan(final Date value) {
            this.addCriterionForJDBCDate("create_date >", value, "createDate");
            return (Criteria)this;
        }
        
        public Criteria andCreateDateGreaterThanOrEqualTo(final Date value) {
            this.addCriterionForJDBCDate("create_date >=", value, "createDate");
            return (Criteria)this;
        }
        
        public Criteria andCreateDateLessThan(final Date value) {
            this.addCriterionForJDBCDate("create_date <", value, "createDate");
            return (Criteria)this;
        }
        
        public Criteria andCreateDateLessThanOrEqualTo(final Date value) {
            this.addCriterionForJDBCDate("create_date <=", value, "createDate");
            return (Criteria)this;
        }
        
        public Criteria andCreateDateIn(final List<Date> values) {
            this.addCriterionForJDBCDate("create_date in", values, "createDate");
            return (Criteria)this;
        }
        
        public Criteria andCreateDateNotIn(final List<Date> values) {
            this.addCriterionForJDBCDate("create_date not in", values, "createDate");
            return (Criteria)this;
        }
        
        public Criteria andCreateDateBetween(final Date value1, final Date value2) {
            this.addCriterionForJDBCDate("create_date between", value1, value2, "createDate");
            return (Criteria)this;
        }
        
        public Criteria andCreateDateNotBetween(final Date value1, final Date value2) {
            this.addCriterionForJDBCDate("create_date not between", value1, value2, "createDate");
            return (Criteria)this;
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
