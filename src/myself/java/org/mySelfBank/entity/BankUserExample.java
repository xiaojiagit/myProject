package org.mySelfBank.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BankUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BankUserExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("USER_ID like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("USER_ID not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andPassWordIsNull() {
            addCriterion("PASS_WORD is null");
            return (Criteria) this;
        }

        public Criteria andPassWordIsNotNull() {
            addCriterion("PASS_WORD is not null");
            return (Criteria) this;
        }

        public Criteria andPassWordEqualTo(String value) {
            addCriterion("PASS_WORD =", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordNotEqualTo(String value) {
            addCriterion("PASS_WORD <>", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordGreaterThan(String value) {
            addCriterion("PASS_WORD >", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordGreaterThanOrEqualTo(String value) {
            addCriterion("PASS_WORD >=", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordLessThan(String value) {
            addCriterion("PASS_WORD <", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordLessThanOrEqualTo(String value) {
            addCriterion("PASS_WORD <=", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordLike(String value) {
            addCriterion("PASS_WORD like", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordNotLike(String value) {
            addCriterion("PASS_WORD not like", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordIn(List<String> values) {
            addCriterion("PASS_WORD in", values, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordNotIn(List<String> values) {
            addCriterion("PASS_WORD not in", values, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordBetween(String value1, String value2) {
            addCriterion("PASS_WORD between", value1, value2, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordNotBetween(String value1, String value2) {
            addCriterion("PASS_WORD not between", value1, value2, "passWord");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNull() {
            addCriterion("`LOGIN_ NAME` is null");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNotNull() {
            addCriterion("`LOGIN_ NAME` is not null");
            return (Criteria) this;
        }

        public Criteria andLoginNameEqualTo(String value) {
            addCriterion("`LOGIN_ NAME` =", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotEqualTo(String value) {
            addCriterion("`LOGIN_ NAME` <>", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThan(String value) {
            addCriterion("`LOGIN_ NAME` >", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThanOrEqualTo(String value) {
            addCriterion("`LOGIN_ NAME` >=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThan(String value) {
            addCriterion("`LOGIN_ NAME` <", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThanOrEqualTo(String value) {
            addCriterion("`LOGIN_ NAME` <=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLike(String value) {
            addCriterion("`LOGIN_ NAME` like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotLike(String value) {
            addCriterion("`LOGIN_ NAME` not like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameIn(List<String> values) {
            addCriterion("`LOGIN_ NAME` in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotIn(List<String> values) {
            addCriterion("`LOGIN_ NAME` not in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameBetween(String value1, String value2) {
            addCriterion("`LOGIN_ NAME` between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotBetween(String value1, String value2) {
            addCriterion("`LOGIN_ NAME` not between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andPassWordTextIsNull() {
            addCriterion("PASS_WORD_TEXT is null");
            return (Criteria) this;
        }

        public Criteria andPassWordTextIsNotNull() {
            addCriterion("PASS_WORD_TEXT is not null");
            return (Criteria) this;
        }

        public Criteria andPassWordTextEqualTo(String value) {
            addCriterion("PASS_WORD_TEXT =", value, "passWordText");
            return (Criteria) this;
        }

        public Criteria andPassWordTextNotEqualTo(String value) {
            addCriterion("PASS_WORD_TEXT <>", value, "passWordText");
            return (Criteria) this;
        }

        public Criteria andPassWordTextGreaterThan(String value) {
            addCriterion("PASS_WORD_TEXT >", value, "passWordText");
            return (Criteria) this;
        }

        public Criteria andPassWordTextGreaterThanOrEqualTo(String value) {
            addCriterion("PASS_WORD_TEXT >=", value, "passWordText");
            return (Criteria) this;
        }

        public Criteria andPassWordTextLessThan(String value) {
            addCriterion("PASS_WORD_TEXT <", value, "passWordText");
            return (Criteria) this;
        }

        public Criteria andPassWordTextLessThanOrEqualTo(String value) {
            addCriterion("PASS_WORD_TEXT <=", value, "passWordText");
            return (Criteria) this;
        }

        public Criteria andPassWordTextLike(String value) {
            addCriterion("PASS_WORD_TEXT like", value, "passWordText");
            return (Criteria) this;
        }

        public Criteria andPassWordTextNotLike(String value) {
            addCriterion("PASS_WORD_TEXT not like", value, "passWordText");
            return (Criteria) this;
        }

        public Criteria andPassWordTextIn(List<String> values) {
            addCriterion("PASS_WORD_TEXT in", values, "passWordText");
            return (Criteria) this;
        }

        public Criteria andPassWordTextNotIn(List<String> values) {
            addCriterion("PASS_WORD_TEXT not in", values, "passWordText");
            return (Criteria) this;
        }

        public Criteria andPassWordTextBetween(String value1, String value2) {
            addCriterion("PASS_WORD_TEXT between", value1, value2, "passWordText");
            return (Criteria) this;
        }

        public Criteria andPassWordTextNotBetween(String value1, String value2) {
            addCriterion("PASS_WORD_TEXT not between", value1, value2, "passWordText");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("SEX is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("SEX is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("SEX =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("SEX <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("SEX >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("SEX >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("SEX <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("SEX <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("SEX like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("SEX not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("SEX in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("SEX not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("SEX between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("SEX not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("`NAME` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`NAME` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`NAME` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`NAME` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`NAME` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`NAME` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`NAME` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`NAME` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("`NAME` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("`NAME` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("`NAME` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`NAME` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`NAME` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`NAME` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andDefaultRoleCodeIsNull() {
            addCriterion("DEFAULT_ROLE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andDefaultRoleCodeIsNotNull() {
            addCriterion("DEFAULT_ROLE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultRoleCodeEqualTo(String value) {
            addCriterion("DEFAULT_ROLE_CODE =", value, "defaultRoleCode");
            return (Criteria) this;
        }

        public Criteria andDefaultRoleCodeNotEqualTo(String value) {
            addCriterion("DEFAULT_ROLE_CODE <>", value, "defaultRoleCode");
            return (Criteria) this;
        }

        public Criteria andDefaultRoleCodeGreaterThan(String value) {
            addCriterion("DEFAULT_ROLE_CODE >", value, "defaultRoleCode");
            return (Criteria) this;
        }

        public Criteria andDefaultRoleCodeGreaterThanOrEqualTo(String value) {
            addCriterion("DEFAULT_ROLE_CODE >=", value, "defaultRoleCode");
            return (Criteria) this;
        }

        public Criteria andDefaultRoleCodeLessThan(String value) {
            addCriterion("DEFAULT_ROLE_CODE <", value, "defaultRoleCode");
            return (Criteria) this;
        }

        public Criteria andDefaultRoleCodeLessThanOrEqualTo(String value) {
            addCriterion("DEFAULT_ROLE_CODE <=", value, "defaultRoleCode");
            return (Criteria) this;
        }

        public Criteria andDefaultRoleCodeLike(String value) {
            addCriterion("DEFAULT_ROLE_CODE like", value, "defaultRoleCode");
            return (Criteria) this;
        }

        public Criteria andDefaultRoleCodeNotLike(String value) {
            addCriterion("DEFAULT_ROLE_CODE not like", value, "defaultRoleCode");
            return (Criteria) this;
        }

        public Criteria andDefaultRoleCodeIn(List<String> values) {
            addCriterion("DEFAULT_ROLE_CODE in", values, "defaultRoleCode");
            return (Criteria) this;
        }

        public Criteria andDefaultRoleCodeNotIn(List<String> values) {
            addCriterion("DEFAULT_ROLE_CODE not in", values, "defaultRoleCode");
            return (Criteria) this;
        }

        public Criteria andDefaultRoleCodeBetween(String value1, String value2) {
            addCriterion("DEFAULT_ROLE_CODE between", value1, value2, "defaultRoleCode");
            return (Criteria) this;
        }

        public Criteria andDefaultRoleCodeNotBetween(String value1, String value2) {
            addCriterion("DEFAULT_ROLE_CODE not between", value1, value2, "defaultRoleCode");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNull() {
            addCriterion("DELETE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNotNull() {
            addCriterion("DELETE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagEqualTo(String value) {
            addCriterion("DELETE_FLAG =", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotEqualTo(String value) {
            addCriterion("DELETE_FLAG <>", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThan(String value) {
            addCriterion("DELETE_FLAG >", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThanOrEqualTo(String value) {
            addCriterion("DELETE_FLAG >=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThan(String value) {
            addCriterion("DELETE_FLAG <", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThanOrEqualTo(String value) {
            addCriterion("DELETE_FLAG <=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLike(String value) {
            addCriterion("DELETE_FLAG like", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotLike(String value) {
            addCriterion("DELETE_FLAG not like", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIn(List<String> values) {
            addCriterion("DELETE_FLAG in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotIn(List<String> values) {
            addCriterion("DELETE_FLAG not in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagBetween(String value1, String value2) {
            addCriterion("DELETE_FLAG between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotBetween(String value1, String value2) {
            addCriterion("DELETE_FLAG not between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andCreTimeIsNull() {
            addCriterion("CRE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreTimeIsNotNull() {
            addCriterion("CRE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreTimeEqualTo(Date value) {
            addCriterionForJDBCDate("CRE_TIME =", value, "creTime");
            return (Criteria) this;
        }

        public Criteria andCreTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("CRE_TIME <>", value, "creTime");
            return (Criteria) this;
        }

        public Criteria andCreTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("CRE_TIME >", value, "creTime");
            return (Criteria) this;
        }

        public Criteria andCreTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CRE_TIME >=", value, "creTime");
            return (Criteria) this;
        }

        public Criteria andCreTimeLessThan(Date value) {
            addCriterionForJDBCDate("CRE_TIME <", value, "creTime");
            return (Criteria) this;
        }

        public Criteria andCreTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CRE_TIME <=", value, "creTime");
            return (Criteria) this;
        }

        public Criteria andCreTimeIn(List<Date> values) {
            addCriterionForJDBCDate("CRE_TIME in", values, "creTime");
            return (Criteria) this;
        }

        public Criteria andCreTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("CRE_TIME not in", values, "creTime");
            return (Criteria) this;
        }

        public Criteria andCreTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CRE_TIME between", value1, value2, "creTime");
            return (Criteria) this;
        }

        public Criteria andCreTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CRE_TIME not between", value1, value2, "creTime");
            return (Criteria) this;
        }

        public Criteria andCreUserIsNull() {
            addCriterion("CRE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCreUserIsNotNull() {
            addCriterion("CRE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCreUserEqualTo(String value) {
            addCriterion("CRE_USER =", value, "creUser");
            return (Criteria) this;
        }

        public Criteria andCreUserNotEqualTo(String value) {
            addCriterion("CRE_USER <>", value, "creUser");
            return (Criteria) this;
        }

        public Criteria andCreUserGreaterThan(String value) {
            addCriterion("CRE_USER >", value, "creUser");
            return (Criteria) this;
        }

        public Criteria andCreUserGreaterThanOrEqualTo(String value) {
            addCriterion("CRE_USER >=", value, "creUser");
            return (Criteria) this;
        }

        public Criteria andCreUserLessThan(String value) {
            addCriterion("CRE_USER <", value, "creUser");
            return (Criteria) this;
        }

        public Criteria andCreUserLessThanOrEqualTo(String value) {
            addCriterion("CRE_USER <=", value, "creUser");
            return (Criteria) this;
        }

        public Criteria andCreUserLike(String value) {
            addCriterion("CRE_USER like", value, "creUser");
            return (Criteria) this;
        }

        public Criteria andCreUserNotLike(String value) {
            addCriterion("CRE_USER not like", value, "creUser");
            return (Criteria) this;
        }

        public Criteria andCreUserIn(List<String> values) {
            addCriterion("CRE_USER in", values, "creUser");
            return (Criteria) this;
        }

        public Criteria andCreUserNotIn(List<String> values) {
            addCriterion("CRE_USER not in", values, "creUser");
            return (Criteria) this;
        }

        public Criteria andCreUserBetween(String value1, String value2) {
            addCriterion("CRE_USER between", value1, value2, "creUser");
            return (Criteria) this;
        }

        public Criteria andCreUserNotBetween(String value1, String value2) {
            addCriterion("CRE_USER not between", value1, value2, "creUser");
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