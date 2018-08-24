package com.jizhiwei.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class EmployeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmployeeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andEIdIsNull() {
            addCriterion("e_id is null");
            return (Criteria) this;
        }

        public Criteria andEIdIsNotNull() {
            addCriterion("e_id is not null");
            return (Criteria) this;
        }

        public Criteria andEIdEqualTo(Integer value) {
            addCriterion("e_id =", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdNotEqualTo(Integer value) {
            addCriterion("e_id <>", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdGreaterThan(Integer value) {
            addCriterion("e_id >", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("e_id >=", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdLessThan(Integer value) {
            addCriterion("e_id <", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdLessThanOrEqualTo(Integer value) {
            addCriterion("e_id <=", value, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdIn(List<Integer> values) {
            addCriterion("e_id in", values, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdNotIn(List<Integer> values) {
            addCriterion("e_id not in", values, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdBetween(Integer value1, Integer value2) {
            addCriterion("e_id between", value1, value2, "eId");
            return (Criteria) this;
        }

        public Criteria andEIdNotBetween(Integer value1, Integer value2) {
            addCriterion("e_id not between", value1, value2, "eId");
            return (Criteria) this;
        }

        public Criteria andENameIsNull() {
            addCriterion("e_name is null");
            return (Criteria) this;
        }

        public Criteria andENameIsNotNull() {
            addCriterion("e_name is not null");
            return (Criteria) this;
        }

        public Criteria andENameEqualTo(String value) {
            addCriterion("e_name =", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameNotEqualTo(String value) {
            addCriterion("e_name <>", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameGreaterThan(String value) {
            addCriterion("e_name >", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameGreaterThanOrEqualTo(String value) {
            addCriterion("e_name >=", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameLessThan(String value) {
            addCriterion("e_name <", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameLessThanOrEqualTo(String value) {
            addCriterion("e_name <=", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameLike(String value) {
            addCriterion("e_name like", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameNotLike(String value) {
            addCriterion("e_name not like", value, "eName");
            return (Criteria) this;
        }

        public Criteria andENameIn(List<String> values) {
            addCriterion("e_name in", values, "eName");
            return (Criteria) this;
        }

        public Criteria andENameNotIn(List<String> values) {
            addCriterion("e_name not in", values, "eName");
            return (Criteria) this;
        }

        public Criteria andENameBetween(String value1, String value2) {
            addCriterion("e_name between", value1, value2, "eName");
            return (Criteria) this;
        }

        public Criteria andENameNotBetween(String value1, String value2) {
            addCriterion("e_name not between", value1, value2, "eName");
            return (Criteria) this;
        }

        public Criteria andEEmailIsNull() {
            addCriterion("e_email is null");
            return (Criteria) this;
        }

        public Criteria andEEmailIsNotNull() {
            addCriterion("e_email is not null");
            return (Criteria) this;
        }

        public Criteria andEEmailEqualTo(String value) {
            addCriterion("e_email =", value, "eEmail");
            return (Criteria) this;
        }

        public Criteria andEEmailNotEqualTo(String value) {
            addCriterion("e_email <>", value, "eEmail");
            return (Criteria) this;
        }

        public Criteria andEEmailGreaterThan(String value) {
            addCriterion("e_email >", value, "eEmail");
            return (Criteria) this;
        }

        public Criteria andEEmailGreaterThanOrEqualTo(String value) {
            addCriterion("e_email >=", value, "eEmail");
            return (Criteria) this;
        }

        public Criteria andEEmailLessThan(String value) {
            addCriterion("e_email <", value, "eEmail");
            return (Criteria) this;
        }

        public Criteria andEEmailLessThanOrEqualTo(String value) {
            addCriterion("e_email <=", value, "eEmail");
            return (Criteria) this;
        }

        public Criteria andEEmailLike(String value) {
            addCriterion("e_email like", value, "eEmail");
            return (Criteria) this;
        }

        public Criteria andEEmailNotLike(String value) {
            addCriterion("e_email not like", value, "eEmail");
            return (Criteria) this;
        }

        public Criteria andEEmailIn(List<String> values) {
            addCriterion("e_email in", values, "eEmail");
            return (Criteria) this;
        }

        public Criteria andEEmailNotIn(List<String> values) {
            addCriterion("e_email not in", values, "eEmail");
            return (Criteria) this;
        }

        public Criteria andEEmailBetween(String value1, String value2) {
            addCriterion("e_email between", value1, value2, "eEmail");
            return (Criteria) this;
        }

        public Criteria andEEmailNotBetween(String value1, String value2) {
            addCriterion("e_email not between", value1, value2, "eEmail");
            return (Criteria) this;
        }

        public Criteria andEPhoneIsNull() {
            addCriterion("e_phone is null");
            return (Criteria) this;
        }

        public Criteria andEPhoneIsNotNull() {
            addCriterion("e_phone is not null");
            return (Criteria) this;
        }

        public Criteria andEPhoneEqualTo(String value) {
            addCriterion("e_phone =", value, "ePhone");
            return (Criteria) this;
        }

        public Criteria andEPhoneNotEqualTo(String value) {
            addCriterion("e_phone <>", value, "ePhone");
            return (Criteria) this;
        }

        public Criteria andEPhoneGreaterThan(String value) {
            addCriterion("e_phone >", value, "ePhone");
            return (Criteria) this;
        }

        public Criteria andEPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("e_phone >=", value, "ePhone");
            return (Criteria) this;
        }

        public Criteria andEPhoneLessThan(String value) {
            addCriterion("e_phone <", value, "ePhone");
            return (Criteria) this;
        }

        public Criteria andEPhoneLessThanOrEqualTo(String value) {
            addCriterion("e_phone <=", value, "ePhone");
            return (Criteria) this;
        }

        public Criteria andEPhoneLike(String value) {
            addCriterion("e_phone like", value, "ePhone");
            return (Criteria) this;
        }

        public Criteria andEPhoneNotLike(String value) {
            addCriterion("e_phone not like", value, "ePhone");
            return (Criteria) this;
        }

        public Criteria andEPhoneIn(List<String> values) {
            addCriterion("e_phone in", values, "ePhone");
            return (Criteria) this;
        }

        public Criteria andEPhoneNotIn(List<String> values) {
            addCriterion("e_phone not in", values, "ePhone");
            return (Criteria) this;
        }

        public Criteria andEPhoneBetween(String value1, String value2) {
            addCriterion("e_phone between", value1, value2, "ePhone");
            return (Criteria) this;
        }

        public Criteria andEPhoneNotBetween(String value1, String value2) {
            addCriterion("e_phone not between", value1, value2, "ePhone");
            return (Criteria) this;
        }

        public Criteria andESexIsNull() {
            addCriterion("e_sex is null");
            return (Criteria) this;
        }

        public Criteria andESexIsNotNull() {
            addCriterion("e_sex is not null");
            return (Criteria) this;
        }

        public Criteria andESexEqualTo(String value) {
            addCriterion("e_sex =", value, "eSex");
            return (Criteria) this;
        }

        public Criteria andESexNotEqualTo(String value) {
            addCriterion("e_sex <>", value, "eSex");
            return (Criteria) this;
        }

        public Criteria andESexGreaterThan(String value) {
            addCriterion("e_sex >", value, "eSex");
            return (Criteria) this;
        }

        public Criteria andESexGreaterThanOrEqualTo(String value) {
            addCriterion("e_sex >=", value, "eSex");
            return (Criteria) this;
        }

        public Criteria andESexLessThan(String value) {
            addCriterion("e_sex <", value, "eSex");
            return (Criteria) this;
        }

        public Criteria andESexLessThanOrEqualTo(String value) {
            addCriterion("e_sex <=", value, "eSex");
            return (Criteria) this;
        }

        public Criteria andESexLike(String value) {
            addCriterion("e_sex like", value, "eSex");
            return (Criteria) this;
        }

        public Criteria andESexNotLike(String value) {
            addCriterion("e_sex not like", value, "eSex");
            return (Criteria) this;
        }

        public Criteria andESexIn(List<String> values) {
            addCriterion("e_sex in", values, "eSex");
            return (Criteria) this;
        }

        public Criteria andESexNotIn(List<String> values) {
            addCriterion("e_sex not in", values, "eSex");
            return (Criteria) this;
        }

        public Criteria andESexBetween(String value1, String value2) {
            addCriterion("e_sex between", value1, value2, "eSex");
            return (Criteria) this;
        }

        public Criteria andESexNotBetween(String value1, String value2) {
            addCriterion("e_sex not between", value1, value2, "eSex");
            return (Criteria) this;
        }

        public Criteria andELocationIdIsNull() {
            addCriterion("e_location_id is null");
            return (Criteria) this;
        }

        public Criteria andELocationIdIsNotNull() {
            addCriterion("e_location_id is not null");
            return (Criteria) this;
        }

        public Criteria andELocationIdEqualTo(Integer value) {
            addCriterion("e_location_id =", value, "eLocationId");
            return (Criteria) this;
        }

        public Criteria andELocationIdNotEqualTo(Integer value) {
            addCriterion("e_location_id <>", value, "eLocationId");
            return (Criteria) this;
        }

        public Criteria andELocationIdGreaterThan(Integer value) {
            addCriterion("e_location_id >", value, "eLocationId");
            return (Criteria) this;
        }

        public Criteria andELocationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("e_location_id >=", value, "eLocationId");
            return (Criteria) this;
        }

        public Criteria andELocationIdLessThan(Integer value) {
            addCriterion("e_location_id <", value, "eLocationId");
            return (Criteria) this;
        }

        public Criteria andELocationIdLessThanOrEqualTo(Integer value) {
            addCriterion("e_location_id <=", value, "eLocationId");
            return (Criteria) this;
        }

        public Criteria andELocationIdIn(List<Integer> values) {
            addCriterion("e_location_id in", values, "eLocationId");
            return (Criteria) this;
        }

        public Criteria andELocationIdNotIn(List<Integer> values) {
            addCriterion("e_location_id not in", values, "eLocationId");
            return (Criteria) this;
        }

        public Criteria andELocationIdBetween(Integer value1, Integer value2) {
            addCriterion("e_location_id between", value1, value2, "eLocationId");
            return (Criteria) this;
        }

        public Criteria andELocationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("e_location_id not between", value1, value2, "eLocationId");
            return (Criteria) this;
        }

        public Criteria andEDeptIdIsNull() {
            addCriterion("e_dept_id is null");
            return (Criteria) this;
        }

        public Criteria andEDeptIdIsNotNull() {
            addCriterion("e_dept_id is not null");
            return (Criteria) this;
        }

        public Criteria andEDeptIdEqualTo(Integer value) {
            addCriterion("e_dept_id =", value, "eDeptId");
            return (Criteria) this;
        }

        public Criteria andEDeptIdNotEqualTo(Integer value) {
            addCriterion("e_dept_id <>", value, "eDeptId");
            return (Criteria) this;
        }

        public Criteria andEDeptIdGreaterThan(Integer value) {
            addCriterion("e_dept_id >", value, "eDeptId");
            return (Criteria) this;
        }

        public Criteria andEDeptIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("e_dept_id >=", value, "eDeptId");
            return (Criteria) this;
        }

        public Criteria andEDeptIdLessThan(Integer value) {
            addCriterion("e_dept_id <", value, "eDeptId");
            return (Criteria) this;
        }

        public Criteria andEDeptIdLessThanOrEqualTo(Integer value) {
            addCriterion("e_dept_id <=", value, "eDeptId");
            return (Criteria) this;
        }

        public Criteria andEDeptIdIn(List<Integer> values) {
            addCriterion("e_dept_id in", values, "eDeptId");
            return (Criteria) this;
        }

        public Criteria andEDeptIdNotIn(List<Integer> values) {
            addCriterion("e_dept_id not in", values, "eDeptId");
            return (Criteria) this;
        }

        public Criteria andEDeptIdBetween(Integer value1, Integer value2) {
            addCriterion("e_dept_id between", value1, value2, "eDeptId");
            return (Criteria) this;
        }

        public Criteria andEDeptIdNotBetween(Integer value1, Integer value2) {
            addCriterion("e_dept_id not between", value1, value2, "eDeptId");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNull() {
            addCriterion("salary is null");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNotNull() {
            addCriterion("salary is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryEqualTo(BigDecimal value) {
            addCriterion("salary =", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotEqualTo(BigDecimal value) {
            addCriterion("salary <>", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThan(BigDecimal value) {
            addCriterion("salary >", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("salary >=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThan(BigDecimal value) {
            addCriterion("salary <", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThanOrEqualTo(BigDecimal value) {
            addCriterion("salary <=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryIn(List<BigDecimal> values) {
            addCriterion("salary in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotIn(List<BigDecimal> values) {
            addCriterion("salary not in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("salary between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("salary not between", value1, value2, "salary");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}