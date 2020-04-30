package com.colodoo.manager.task.taskAttr.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskAttrExample {
    /**
     * task_attr
     */
    protected String orderByClause;

    /**
     * task_attr
     */
    protected boolean distinct;

    /**
     * task_attr
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated 2019-09-03
     */
    public TaskAttrExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbg.generated 2019-09-03
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbg.generated 2019-09-03
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbg.generated 2019-09-03
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbg.generated 2019-09-03
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbg.generated 2019-09-03
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbg.generated 2019-09-03
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbg.generated 2019-09-03
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbg.generated 2019-09-03
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *
     * @mbg.generated 2019-09-03
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbg.generated 2019-09-03
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * task_attr 2019-09-03
     */
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

        public Criteria andTaskAttrIdIsNull() {
            addCriterion("task_attr_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskAttrIdIsNotNull() {
            addCriterion("task_attr_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskAttrIdEqualTo(String value) {
            addCriterion("task_attr_id =", value, "taskAttrId");
            return (Criteria) this;
        }

        public Criteria andTaskAttrIdNotEqualTo(String value) {
            addCriterion("task_attr_id <>", value, "taskAttrId");
            return (Criteria) this;
        }

        public Criteria andTaskAttrIdGreaterThan(String value) {
            addCriterion("task_attr_id >", value, "taskAttrId");
            return (Criteria) this;
        }

        public Criteria andTaskAttrIdGreaterThanOrEqualTo(String value) {
            addCriterion("task_attr_id >=", value, "taskAttrId");
            return (Criteria) this;
        }

        public Criteria andTaskAttrIdLessThan(String value) {
            addCriterion("task_attr_id <", value, "taskAttrId");
            return (Criteria) this;
        }

        public Criteria andTaskAttrIdLessThanOrEqualTo(String value) {
            addCriterion("task_attr_id <=", value, "taskAttrId");
            return (Criteria) this;
        }

        public Criteria andTaskAttrIdLike(String value) {
            addCriterion("task_attr_id like", value, "taskAttrId");
            return (Criteria) this;
        }

        public Criteria andTaskAttrIdNotLike(String value) {
            addCriterion("task_attr_id not like", value, "taskAttrId");
            return (Criteria) this;
        }

        public Criteria andTaskAttrIdIn(List<String> values) {
            addCriterion("task_attr_id in", values, "taskAttrId");
            return (Criteria) this;
        }

        public Criteria andTaskAttrIdNotIn(List<String> values) {
            addCriterion("task_attr_id not in", values, "taskAttrId");
            return (Criteria) this;
        }

        public Criteria andTaskAttrIdBetween(String value1, String value2) {
            addCriterion("task_attr_id between", value1, value2, "taskAttrId");
            return (Criteria) this;
        }

        public Criteria andTaskAttrIdNotBetween(String value1, String value2) {
            addCriterion("task_attr_id not between", value1, value2, "taskAttrId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNull() {
            addCriterion("task_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("task_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(String value) {
            addCriterion("task_id =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(String value) {
            addCriterion("task_id <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(String value) {
            addCriterion("task_id >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(String value) {
            addCriterion("task_id >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(String value) {
            addCriterion("task_id <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(String value) {
            addCriterion("task_id <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLike(String value) {
            addCriterion("task_id like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotLike(String value) {
            addCriterion("task_id not like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<String> values) {
            addCriterion("task_id in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<String> values) {
            addCriterion("task_id not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(String value1, String value2) {
            addCriterion("task_id between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(String value1, String value2) {
            addCriterion("task_id not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskAttrKeyIsNull() {
            addCriterion("task_attr_key is null");
            return (Criteria) this;
        }

        public Criteria andTaskAttrKeyIsNotNull() {
            addCriterion("task_attr_key is not null");
            return (Criteria) this;
        }

        public Criteria andTaskAttrKeyEqualTo(String value) {
            addCriterion("task_attr_key =", value, "taskAttrKey");
            return (Criteria) this;
        }

        public Criteria andTaskAttrKeyNotEqualTo(String value) {
            addCriterion("task_attr_key <>", value, "taskAttrKey");
            return (Criteria) this;
        }

        public Criteria andTaskAttrKeyGreaterThan(String value) {
            addCriterion("task_attr_key >", value, "taskAttrKey");
            return (Criteria) this;
        }

        public Criteria andTaskAttrKeyGreaterThanOrEqualTo(String value) {
            addCriterion("task_attr_key >=", value, "taskAttrKey");
            return (Criteria) this;
        }

        public Criteria andTaskAttrKeyLessThan(String value) {
            addCriterion("task_attr_key <", value, "taskAttrKey");
            return (Criteria) this;
        }

        public Criteria andTaskAttrKeyLessThanOrEqualTo(String value) {
            addCriterion("task_attr_key <=", value, "taskAttrKey");
            return (Criteria) this;
        }

        public Criteria andTaskAttrKeyLike(String value) {
            addCriterion("task_attr_key like", value, "taskAttrKey");
            return (Criteria) this;
        }

        public Criteria andTaskAttrKeyNotLike(String value) {
            addCriterion("task_attr_key not like", value, "taskAttrKey");
            return (Criteria) this;
        }

        public Criteria andTaskAttrKeyIn(List<String> values) {
            addCriterion("task_attr_key in", values, "taskAttrKey");
            return (Criteria) this;
        }

        public Criteria andTaskAttrKeyNotIn(List<String> values) {
            addCriterion("task_attr_key not in", values, "taskAttrKey");
            return (Criteria) this;
        }

        public Criteria andTaskAttrKeyBetween(String value1, String value2) {
            addCriterion("task_attr_key between", value1, value2, "taskAttrKey");
            return (Criteria) this;
        }

        public Criteria andTaskAttrKeyNotBetween(String value1, String value2) {
            addCriterion("task_attr_key not between", value1, value2, "taskAttrKey");
            return (Criteria) this;
        }

        public Criteria andTaskAttrValueIsNull() {
            addCriterion("task_attr_value is null");
            return (Criteria) this;
        }

        public Criteria andTaskAttrValueIsNotNull() {
            addCriterion("task_attr_value is not null");
            return (Criteria) this;
        }

        public Criteria andTaskAttrValueEqualTo(String value) {
            addCriterion("task_attr_value =", value, "taskAttrValue");
            return (Criteria) this;
        }

        public Criteria andTaskAttrValueNotEqualTo(String value) {
            addCriterion("task_attr_value <>", value, "taskAttrValue");
            return (Criteria) this;
        }

        public Criteria andTaskAttrValueGreaterThan(String value) {
            addCriterion("task_attr_value >", value, "taskAttrValue");
            return (Criteria) this;
        }

        public Criteria andTaskAttrValueGreaterThanOrEqualTo(String value) {
            addCriterion("task_attr_value >=", value, "taskAttrValue");
            return (Criteria) this;
        }

        public Criteria andTaskAttrValueLessThan(String value) {
            addCriterion("task_attr_value <", value, "taskAttrValue");
            return (Criteria) this;
        }

        public Criteria andTaskAttrValueLessThanOrEqualTo(String value) {
            addCriterion("task_attr_value <=", value, "taskAttrValue");
            return (Criteria) this;
        }

        public Criteria andTaskAttrValueLike(String value) {
            addCriterion("task_attr_value like", value, "taskAttrValue");
            return (Criteria) this;
        }

        public Criteria andTaskAttrValueNotLike(String value) {
            addCriterion("task_attr_value not like", value, "taskAttrValue");
            return (Criteria) this;
        }

        public Criteria andTaskAttrValueIn(List<String> values) {
            addCriterion("task_attr_value in", values, "taskAttrValue");
            return (Criteria) this;
        }

        public Criteria andTaskAttrValueNotIn(List<String> values) {
            addCriterion("task_attr_value not in", values, "taskAttrValue");
            return (Criteria) this;
        }

        public Criteria andTaskAttrValueBetween(String value1, String value2) {
            addCriterion("task_attr_value between", value1, value2, "taskAttrValue");
            return (Criteria) this;
        }

        public Criteria andTaskAttrValueNotBetween(String value1, String value2) {
            addCriterion("task_attr_value not between", value1, value2, "taskAttrValue");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNull() {
            addCriterion("create_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNotNull() {
            addCriterion("create_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdEqualTo(String value) {
            addCriterion("create_user_id =", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotEqualTo(String value) {
            addCriterion("create_user_id <>", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThan(String value) {
            addCriterion("create_user_id >", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("create_user_id >=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThan(String value) {
            addCriterion("create_user_id <", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThanOrEqualTo(String value) {
            addCriterion("create_user_id <=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLike(String value) {
            addCriterion("create_user_id like", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotLike(String value) {
            addCriterion("create_user_id not like", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIn(List<String> values) {
            addCriterion("create_user_id in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotIn(List<String> values) {
            addCriterion("create_user_id not in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdBetween(String value1, String value2) {
            addCriterion("create_user_id between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotBetween(String value1, String value2) {
            addCriterion("create_user_id not between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdIsNull() {
            addCriterion("update_user_id is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdIsNotNull() {
            addCriterion("update_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdEqualTo(String value) {
            addCriterion("update_user_id =", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotEqualTo(String value) {
            addCriterion("update_user_id <>", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdGreaterThan(String value) {
            addCriterion("update_user_id >", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("update_user_id >=", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdLessThan(String value) {
            addCriterion("update_user_id <", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdLessThanOrEqualTo(String value) {
            addCriterion("update_user_id <=", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdLike(String value) {
            addCriterion("update_user_id like", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotLike(String value) {
            addCriterion("update_user_id not like", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdIn(List<String> values) {
            addCriterion("update_user_id in", values, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotIn(List<String> values) {
            addCriterion("update_user_id not in", values, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdBetween(String value1, String value2) {
            addCriterion("update_user_id between", value1, value2, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotBetween(String value1, String value2) {
            addCriterion("update_user_id not between", value1, value2, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }
    }

    /**
     *  * task_attr
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * task_attr 2019-09-03
     */
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