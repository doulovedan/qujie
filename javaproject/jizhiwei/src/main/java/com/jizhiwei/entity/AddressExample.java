package com.jizhiwei.entity;

import java.util.ArrayList;
import java.util.List;

public class AddressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AddressExample() {
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

        public Criteria andAddIdIsNull() {
            addCriterion("add_id is null");
            return (Criteria) this;
        }

        public Criteria andAddIdIsNotNull() {
            addCriterion("add_id is not null");
            return (Criteria) this;
        }

        public Criteria andAddIdEqualTo(Integer value) {
            addCriterion("add_id =", value, "addId");
            return (Criteria) this;
        }

        public Criteria andAddIdNotEqualTo(Integer value) {
            addCriterion("add_id <>", value, "addId");
            return (Criteria) this;
        }

        public Criteria andAddIdGreaterThan(Integer value) {
            addCriterion("add_id >", value, "addId");
            return (Criteria) this;
        }

        public Criteria andAddIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("add_id >=", value, "addId");
            return (Criteria) this;
        }

        public Criteria andAddIdLessThan(Integer value) {
            addCriterion("add_id <", value, "addId");
            return (Criteria) this;
        }

        public Criteria andAddIdLessThanOrEqualTo(Integer value) {
            addCriterion("add_id <=", value, "addId");
            return (Criteria) this;
        }

        public Criteria andAddIdIn(List<Integer> values) {
            addCriterion("add_id in", values, "addId");
            return (Criteria) this;
        }

        public Criteria andAddIdNotIn(List<Integer> values) {
            addCriterion("add_id not in", values, "addId");
            return (Criteria) this;
        }

        public Criteria andAddIdBetween(Integer value1, Integer value2) {
            addCriterion("add_id between", value1, value2, "addId");
            return (Criteria) this;
        }

        public Criteria andAddIdNotBetween(Integer value1, Integer value2) {
            addCriterion("add_id not between", value1, value2, "addId");
            return (Criteria) this;
        }

        public Criteria andAddCityIsNull() {
            addCriterion("add_city is null");
            return (Criteria) this;
        }

        public Criteria andAddCityIsNotNull() {
            addCriterion("add_city is not null");
            return (Criteria) this;
        }

        public Criteria andAddCityEqualTo(String value) {
            addCriterion("add_city =", value, "addCity");
            return (Criteria) this;
        }

        public Criteria andAddCityNotEqualTo(String value) {
            addCriterion("add_city <>", value, "addCity");
            return (Criteria) this;
        }

        public Criteria andAddCityGreaterThan(String value) {
            addCriterion("add_city >", value, "addCity");
            return (Criteria) this;
        }

        public Criteria andAddCityGreaterThanOrEqualTo(String value) {
            addCriterion("add_city >=", value, "addCity");
            return (Criteria) this;
        }

        public Criteria andAddCityLessThan(String value) {
            addCriterion("add_city <", value, "addCity");
            return (Criteria) this;
        }

        public Criteria andAddCityLessThanOrEqualTo(String value) {
            addCriterion("add_city <=", value, "addCity");
            return (Criteria) this;
        }

        public Criteria andAddCityLike(String value) {
            addCriterion("add_city like", value, "addCity");
            return (Criteria) this;
        }

        public Criteria andAddCityNotLike(String value) {
            addCriterion("add_city not like", value, "addCity");
            return (Criteria) this;
        }

        public Criteria andAddCityIn(List<String> values) {
            addCriterion("add_city in", values, "addCity");
            return (Criteria) this;
        }

        public Criteria andAddCityNotIn(List<String> values) {
            addCriterion("add_city not in", values, "addCity");
            return (Criteria) this;
        }

        public Criteria andAddCityBetween(String value1, String value2) {
            addCriterion("add_city between", value1, value2, "addCity");
            return (Criteria) this;
        }

        public Criteria andAddCityNotBetween(String value1, String value2) {
            addCriterion("add_city not between", value1, value2, "addCity");
            return (Criteria) this;
        }

        public Criteria andAddAreaIsNull() {
            addCriterion("add_area is null");
            return (Criteria) this;
        }

        public Criteria andAddAreaIsNotNull() {
            addCriterion("add_area is not null");
            return (Criteria) this;
        }

        public Criteria andAddAreaEqualTo(String value) {
            addCriterion("add_area =", value, "addArea");
            return (Criteria) this;
        }

        public Criteria andAddAreaNotEqualTo(String value) {
            addCriterion("add_area <>", value, "addArea");
            return (Criteria) this;
        }

        public Criteria andAddAreaGreaterThan(String value) {
            addCriterion("add_area >", value, "addArea");
            return (Criteria) this;
        }

        public Criteria andAddAreaGreaterThanOrEqualTo(String value) {
            addCriterion("add_area >=", value, "addArea");
            return (Criteria) this;
        }

        public Criteria andAddAreaLessThan(String value) {
            addCriterion("add_area <", value, "addArea");
            return (Criteria) this;
        }

        public Criteria andAddAreaLessThanOrEqualTo(String value) {
            addCriterion("add_area <=", value, "addArea");
            return (Criteria) this;
        }

        public Criteria andAddAreaLike(String value) {
            addCriterion("add_area like", value, "addArea");
            return (Criteria) this;
        }

        public Criteria andAddAreaNotLike(String value) {
            addCriterion("add_area not like", value, "addArea");
            return (Criteria) this;
        }

        public Criteria andAddAreaIn(List<String> values) {
            addCriterion("add_area in", values, "addArea");
            return (Criteria) this;
        }

        public Criteria andAddAreaNotIn(List<String> values) {
            addCriterion("add_area not in", values, "addArea");
            return (Criteria) this;
        }

        public Criteria andAddAreaBetween(String value1, String value2) {
            addCriterion("add_area between", value1, value2, "addArea");
            return (Criteria) this;
        }

        public Criteria andAddAreaNotBetween(String value1, String value2) {
            addCriterion("add_area not between", value1, value2, "addArea");
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