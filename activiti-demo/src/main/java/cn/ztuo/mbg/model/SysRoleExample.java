/**
 *
 * @author ztuo
 * @date 2022-03-25 11:17:27
 */
package cn.ztuo.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysRoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * SysRoleExample
     * 
     * @return null
     */
    public SysRoleExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * setOrderByClause
     * 
     * @param orderByClause
     * @return null
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * getOrderByClause
     * 
     * @return java.lang.String
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * setDistinct
     * 
     * @param distinct
     * @return null
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * isDistinct
     * 
     * @return boolean
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * getOredCriteria
     * 
     * @return java.util.List<Criteria>
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * or
     * 
     * @param criteria
     * @return null
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * or
     * 
     * @return Criteria
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * createCriteria
     * 
     * @return Criteria
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * createCriteriaInternal
     * 
     * @return Criteria
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * clear
     * 
     * @return null
     */
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRoleNameIsNull() {
            addCriterion("ROLE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRoleNameIsNotNull() {
            addCriterion("ROLE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRoleNameEqualTo(String value) {
            addCriterion("ROLE_NAME =", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotEqualTo(String value) {
            addCriterion("ROLE_NAME <>", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThan(String value) {
            addCriterion("ROLE_NAME >", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThanOrEqualTo(String value) {
            addCriterion("ROLE_NAME >=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThan(String value) {
            addCriterion("ROLE_NAME <", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThanOrEqualTo(String value) {
            addCriterion("ROLE_NAME <=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLike(String value) {
            addCriterion("ROLE_NAME like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotLike(String value) {
            addCriterion("ROLE_NAME not like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameIn(List<String> values) {
            addCriterion("ROLE_NAME in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotIn(List<String> values) {
            addCriterion("ROLE_NAME not in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameBetween(String value1, String value2) {
            addCriterion("ROLE_NAME between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotBetween(String value1, String value2) {
            addCriterion("ROLE_NAME not between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleCodeIsNull() {
            addCriterion("ROLE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andRoleCodeIsNotNull() {
            addCriterion("ROLE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andRoleCodeEqualTo(String value) {
            addCriterion("ROLE_CODE =", value, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeNotEqualTo(String value) {
            addCriterion("ROLE_CODE <>", value, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeGreaterThan(String value) {
            addCriterion("ROLE_CODE >", value, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ROLE_CODE >=", value, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeLessThan(String value) {
            addCriterion("ROLE_CODE <", value, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeLessThanOrEqualTo(String value) {
            addCriterion("ROLE_CODE <=", value, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeLike(String value) {
            addCriterion("ROLE_CODE like", value, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeNotLike(String value) {
            addCriterion("ROLE_CODE not like", value, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeIn(List<String> values) {
            addCriterion("ROLE_CODE in", values, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeNotIn(List<String> values) {
            addCriterion("ROLE_CODE not in", values, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeBetween(String value1, String value2) {
            addCriterion("ROLE_CODE between", value1, value2, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleCodeNotBetween(String value1, String value2) {
            addCriterion("ROLE_CODE not between", value1, value2, "roleCode");
            return (Criteria) this;
        }

        public Criteria andRoleSortIsNull() {
            addCriterion("ROLE_SORT is null");
            return (Criteria) this;
        }

        public Criteria andRoleSortIsNotNull() {
            addCriterion("ROLE_SORT is not null");
            return (Criteria) this;
        }

        public Criteria andRoleSortEqualTo(Long value) {
            addCriterion("ROLE_SORT =", value, "roleSort");
            return (Criteria) this;
        }

        public Criteria andRoleSortNotEqualTo(Long value) {
            addCriterion("ROLE_SORT <>", value, "roleSort");
            return (Criteria) this;
        }

        public Criteria andRoleSortGreaterThan(Long value) {
            addCriterion("ROLE_SORT >", value, "roleSort");
            return (Criteria) this;
        }

        public Criteria andRoleSortGreaterThanOrEqualTo(Long value) {
            addCriterion("ROLE_SORT >=", value, "roleSort");
            return (Criteria) this;
        }

        public Criteria andRoleSortLessThan(Long value) {
            addCriterion("ROLE_SORT <", value, "roleSort");
            return (Criteria) this;
        }

        public Criteria andRoleSortLessThanOrEqualTo(Long value) {
            addCriterion("ROLE_SORT <=", value, "roleSort");
            return (Criteria) this;
        }

        public Criteria andRoleSortIn(List<Long> values) {
            addCriterion("ROLE_SORT in", values, "roleSort");
            return (Criteria) this;
        }

        public Criteria andRoleSortNotIn(List<Long> values) {
            addCriterion("ROLE_SORT not in", values, "roleSort");
            return (Criteria) this;
        }

        public Criteria andRoleSortBetween(Long value1, Long value2) {
            addCriterion("ROLE_SORT between", value1, value2, "roleSort");
            return (Criteria) this;
        }

        public Criteria andRoleSortNotBetween(Long value1, Long value2) {
            addCriterion("ROLE_SORT not between", value1, value2, "roleSort");
            return (Criteria) this;
        }

        public Criteria andDataScopeIsNull() {
            addCriterion("DATA_SCOPE is null");
            return (Criteria) this;
        }

        public Criteria andDataScopeIsNotNull() {
            addCriterion("DATA_SCOPE is not null");
            return (Criteria) this;
        }

        public Criteria andDataScopeEqualTo(String value) {
            addCriterion("DATA_SCOPE =", value, "dataScope");
            return (Criteria) this;
        }

        public Criteria andDataScopeNotEqualTo(String value) {
            addCriterion("DATA_SCOPE <>", value, "dataScope");
            return (Criteria) this;
        }

        public Criteria andDataScopeGreaterThan(String value) {
            addCriterion("DATA_SCOPE >", value, "dataScope");
            return (Criteria) this;
        }

        public Criteria andDataScopeGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_SCOPE >=", value, "dataScope");
            return (Criteria) this;
        }

        public Criteria andDataScopeLessThan(String value) {
            addCriterion("DATA_SCOPE <", value, "dataScope");
            return (Criteria) this;
        }

        public Criteria andDataScopeLessThanOrEqualTo(String value) {
            addCriterion("DATA_SCOPE <=", value, "dataScope");
            return (Criteria) this;
        }

        public Criteria andDataScopeLike(String value) {
            addCriterion("DATA_SCOPE like", value, "dataScope");
            return (Criteria) this;
        }

        public Criteria andDataScopeNotLike(String value) {
            addCriterion("DATA_SCOPE not like", value, "dataScope");
            return (Criteria) this;
        }

        public Criteria andDataScopeIn(List<String> values) {
            addCriterion("DATA_SCOPE in", values, "dataScope");
            return (Criteria) this;
        }

        public Criteria andDataScopeNotIn(List<String> values) {
            addCriterion("DATA_SCOPE not in", values, "dataScope");
            return (Criteria) this;
        }

        public Criteria andDataScopeBetween(String value1, String value2) {
            addCriterion("DATA_SCOPE between", value1, value2, "dataScope");
            return (Criteria) this;
        }

        public Criteria andDataScopeNotBetween(String value1, String value2) {
            addCriterion("DATA_SCOPE not between", value1, value2, "dataScope");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andSysFlagIsNull() {
            addCriterion("SYS_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andSysFlagIsNotNull() {
            addCriterion("SYS_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andSysFlagEqualTo(String value) {
            addCriterion("SYS_FLAG =", value, "sysFlag");
            return (Criteria) this;
        }

        public Criteria andSysFlagNotEqualTo(String value) {
            addCriterion("SYS_FLAG <>", value, "sysFlag");
            return (Criteria) this;
        }

        public Criteria andSysFlagGreaterThan(String value) {
            addCriterion("SYS_FLAG >", value, "sysFlag");
            return (Criteria) this;
        }

        public Criteria andSysFlagGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_FLAG >=", value, "sysFlag");
            return (Criteria) this;
        }

        public Criteria andSysFlagLessThan(String value) {
            addCriterion("SYS_FLAG <", value, "sysFlag");
            return (Criteria) this;
        }

        public Criteria andSysFlagLessThanOrEqualTo(String value) {
            addCriterion("SYS_FLAG <=", value, "sysFlag");
            return (Criteria) this;
        }

        public Criteria andSysFlagLike(String value) {
            addCriterion("SYS_FLAG like", value, "sysFlag");
            return (Criteria) this;
        }

        public Criteria andSysFlagNotLike(String value) {
            addCriterion("SYS_FLAG not like", value, "sysFlag");
            return (Criteria) this;
        }

        public Criteria andSysFlagIn(List<String> values) {
            addCriterion("SYS_FLAG in", values, "sysFlag");
            return (Criteria) this;
        }

        public Criteria andSysFlagNotIn(List<String> values) {
            addCriterion("SYS_FLAG not in", values, "sysFlag");
            return (Criteria) this;
        }

        public Criteria andSysFlagBetween(String value1, String value2) {
            addCriterion("SYS_FLAG between", value1, value2, "sysFlag");
            return (Criteria) this;
        }

        public Criteria andSysFlagNotBetween(String value1, String value2) {
            addCriterion("SYS_FLAG not between", value1, value2, "sysFlag");
            return (Criteria) this;
        }

        public Criteria andSysDeptIsNull() {
            addCriterion("SYS_DEPT is null");
            return (Criteria) this;
        }

        public Criteria andSysDeptIsNotNull() {
            addCriterion("SYS_DEPT is not null");
            return (Criteria) this;
        }

        public Criteria andSysDeptEqualTo(String value) {
            addCriterion("SYS_DEPT =", value, "sysDept");
            return (Criteria) this;
        }

        public Criteria andSysDeptNotEqualTo(String value) {
            addCriterion("SYS_DEPT <>", value, "sysDept");
            return (Criteria) this;
        }

        public Criteria andSysDeptGreaterThan(String value) {
            addCriterion("SYS_DEPT >", value, "sysDept");
            return (Criteria) this;
        }

        public Criteria andSysDeptGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_DEPT >=", value, "sysDept");
            return (Criteria) this;
        }

        public Criteria andSysDeptLessThan(String value) {
            addCriterion("SYS_DEPT <", value, "sysDept");
            return (Criteria) this;
        }

        public Criteria andSysDeptLessThanOrEqualTo(String value) {
            addCriterion("SYS_DEPT <=", value, "sysDept");
            return (Criteria) this;
        }

        public Criteria andSysDeptLike(String value) {
            addCriterion("SYS_DEPT like", value, "sysDept");
            return (Criteria) this;
        }

        public Criteria andSysDeptNotLike(String value) {
            addCriterion("SYS_DEPT not like", value, "sysDept");
            return (Criteria) this;
        }

        public Criteria andSysDeptIn(List<String> values) {
            addCriterion("SYS_DEPT in", values, "sysDept");
            return (Criteria) this;
        }

        public Criteria andSysDeptNotIn(List<String> values) {
            addCriterion("SYS_DEPT not in", values, "sysDept");
            return (Criteria) this;
        }

        public Criteria andSysDeptBetween(String value1, String value2) {
            addCriterion("SYS_DEPT between", value1, value2, "sysDept");
            return (Criteria) this;
        }

        public Criteria andSysDeptNotBetween(String value1, String value2) {
            addCriterion("SYS_DEPT not between", value1, value2, "sysDept");
            return (Criteria) this;
        }

        public Criteria andSysCreateUserIsNull() {
            addCriterion("SYS_CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andSysCreateUserIsNotNull() {
            addCriterion("SYS_CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andSysCreateUserEqualTo(String value) {
            addCriterion("SYS_CREATE_USER =", value, "sysCreateUser");
            return (Criteria) this;
        }

        public Criteria andSysCreateUserNotEqualTo(String value) {
            addCriterion("SYS_CREATE_USER <>", value, "sysCreateUser");
            return (Criteria) this;
        }

        public Criteria andSysCreateUserGreaterThan(String value) {
            addCriterion("SYS_CREATE_USER >", value, "sysCreateUser");
            return (Criteria) this;
        }

        public Criteria andSysCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_CREATE_USER >=", value, "sysCreateUser");
            return (Criteria) this;
        }

        public Criteria andSysCreateUserLessThan(String value) {
            addCriterion("SYS_CREATE_USER <", value, "sysCreateUser");
            return (Criteria) this;
        }

        public Criteria andSysCreateUserLessThanOrEqualTo(String value) {
            addCriterion("SYS_CREATE_USER <=", value, "sysCreateUser");
            return (Criteria) this;
        }

        public Criteria andSysCreateUserLike(String value) {
            addCriterion("SYS_CREATE_USER like", value, "sysCreateUser");
            return (Criteria) this;
        }

        public Criteria andSysCreateUserNotLike(String value) {
            addCriterion("SYS_CREATE_USER not like", value, "sysCreateUser");
            return (Criteria) this;
        }

        public Criteria andSysCreateUserIn(List<String> values) {
            addCriterion("SYS_CREATE_USER in", values, "sysCreateUser");
            return (Criteria) this;
        }

        public Criteria andSysCreateUserNotIn(List<String> values) {
            addCriterion("SYS_CREATE_USER not in", values, "sysCreateUser");
            return (Criteria) this;
        }

        public Criteria andSysCreateUserBetween(String value1, String value2) {
            addCriterion("SYS_CREATE_USER between", value1, value2, "sysCreateUser");
            return (Criteria) this;
        }

        public Criteria andSysCreateUserNotBetween(String value1, String value2) {
            addCriterion("SYS_CREATE_USER not between", value1, value2, "sysCreateUser");
            return (Criteria) this;
        }

        public Criteria andSysUpdateUserIsNull() {
            addCriterion("SYS_UPDATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andSysUpdateUserIsNotNull() {
            addCriterion("SYS_UPDATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andSysUpdateUserEqualTo(String value) {
            addCriterion("SYS_UPDATE_USER =", value, "sysUpdateUser");
            return (Criteria) this;
        }

        public Criteria andSysUpdateUserNotEqualTo(String value) {
            addCriterion("SYS_UPDATE_USER <>", value, "sysUpdateUser");
            return (Criteria) this;
        }

        public Criteria andSysUpdateUserGreaterThan(String value) {
            addCriterion("SYS_UPDATE_USER >", value, "sysUpdateUser");
            return (Criteria) this;
        }

        public Criteria andSysUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_UPDATE_USER >=", value, "sysUpdateUser");
            return (Criteria) this;
        }

        public Criteria andSysUpdateUserLessThan(String value) {
            addCriterion("SYS_UPDATE_USER <", value, "sysUpdateUser");
            return (Criteria) this;
        }

        public Criteria andSysUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("SYS_UPDATE_USER <=", value, "sysUpdateUser");
            return (Criteria) this;
        }

        public Criteria andSysUpdateUserLike(String value) {
            addCriterion("SYS_UPDATE_USER like", value, "sysUpdateUser");
            return (Criteria) this;
        }

        public Criteria andSysUpdateUserNotLike(String value) {
            addCriterion("SYS_UPDATE_USER not like", value, "sysUpdateUser");
            return (Criteria) this;
        }

        public Criteria andSysUpdateUserIn(List<String> values) {
            addCriterion("SYS_UPDATE_USER in", values, "sysUpdateUser");
            return (Criteria) this;
        }

        public Criteria andSysUpdateUserNotIn(List<String> values) {
            addCriterion("SYS_UPDATE_USER not in", values, "sysUpdateUser");
            return (Criteria) this;
        }

        public Criteria andSysUpdateUserBetween(String value1, String value2) {
            addCriterion("SYS_UPDATE_USER between", value1, value2, "sysUpdateUser");
            return (Criteria) this;
        }

        public Criteria andSysUpdateUserNotBetween(String value1, String value2) {
            addCriterion("SYS_UPDATE_USER not between", value1, value2, "sysUpdateUser");
            return (Criteria) this;
        }

        public Criteria andSysCreateTimeIsNull() {
            addCriterion("SYS_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSysCreateTimeIsNotNull() {
            addCriterion("SYS_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSysCreateTimeEqualTo(Date value) {
            addCriterion("SYS_CREATE_TIME =", value, "sysCreateTime");
            return (Criteria) this;
        }

        public Criteria andSysCreateTimeNotEqualTo(Date value) {
            addCriterion("SYS_CREATE_TIME <>", value, "sysCreateTime");
            return (Criteria) this;
        }

        public Criteria andSysCreateTimeGreaterThan(Date value) {
            addCriterion("SYS_CREATE_TIME >", value, "sysCreateTime");
            return (Criteria) this;
        }

        public Criteria andSysCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SYS_CREATE_TIME >=", value, "sysCreateTime");
            return (Criteria) this;
        }

        public Criteria andSysCreateTimeLessThan(Date value) {
            addCriterion("SYS_CREATE_TIME <", value, "sysCreateTime");
            return (Criteria) this;
        }

        public Criteria andSysCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("SYS_CREATE_TIME <=", value, "sysCreateTime");
            return (Criteria) this;
        }

        public Criteria andSysCreateTimeIn(List<Date> values) {
            addCriterion("SYS_CREATE_TIME in", values, "sysCreateTime");
            return (Criteria) this;
        }

        public Criteria andSysCreateTimeNotIn(List<Date> values) {
            addCriterion("SYS_CREATE_TIME not in", values, "sysCreateTime");
            return (Criteria) this;
        }

        public Criteria andSysCreateTimeBetween(Date value1, Date value2) {
            addCriterion("SYS_CREATE_TIME between", value1, value2, "sysCreateTime");
            return (Criteria) this;
        }

        public Criteria andSysCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("SYS_CREATE_TIME not between", value1, value2, "sysCreateTime");
            return (Criteria) this;
        }

        public Criteria andSysUpdateTimeIsNull() {
            addCriterion("SYS_UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSysUpdateTimeIsNotNull() {
            addCriterion("SYS_UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSysUpdateTimeEqualTo(Date value) {
            addCriterion("SYS_UPDATE_TIME =", value, "sysUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSysUpdateTimeNotEqualTo(Date value) {
            addCriterion("SYS_UPDATE_TIME <>", value, "sysUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSysUpdateTimeGreaterThan(Date value) {
            addCriterion("SYS_UPDATE_TIME >", value, "sysUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSysUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SYS_UPDATE_TIME >=", value, "sysUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSysUpdateTimeLessThan(Date value) {
            addCriterion("SYS_UPDATE_TIME <", value, "sysUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSysUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("SYS_UPDATE_TIME <=", value, "sysUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSysUpdateTimeIn(List<Date> values) {
            addCriterion("SYS_UPDATE_TIME in", values, "sysUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSysUpdateTimeNotIn(List<Date> values) {
            addCriterion("SYS_UPDATE_TIME not in", values, "sysUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSysUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("SYS_UPDATE_TIME between", value1, value2, "sysUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSysUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("SYS_UPDATE_TIME not between", value1, value2, "sysUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSysRemarkIsNull() {
            addCriterion("SYS_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andSysRemarkIsNotNull() {
            addCriterion("SYS_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andSysRemarkEqualTo(String value) {
            addCriterion("SYS_REMARK =", value, "sysRemark");
            return (Criteria) this;
        }

        public Criteria andSysRemarkNotEqualTo(String value) {
            addCriterion("SYS_REMARK <>", value, "sysRemark");
            return (Criteria) this;
        }

        public Criteria andSysRemarkGreaterThan(String value) {
            addCriterion("SYS_REMARK >", value, "sysRemark");
            return (Criteria) this;
        }

        public Criteria andSysRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_REMARK >=", value, "sysRemark");
            return (Criteria) this;
        }

        public Criteria andSysRemarkLessThan(String value) {
            addCriterion("SYS_REMARK <", value, "sysRemark");
            return (Criteria) this;
        }

        public Criteria andSysRemarkLessThanOrEqualTo(String value) {
            addCriterion("SYS_REMARK <=", value, "sysRemark");
            return (Criteria) this;
        }

        public Criteria andSysRemarkLike(String value) {
            addCriterion("SYS_REMARK like", value, "sysRemark");
            return (Criteria) this;
        }

        public Criteria andSysRemarkNotLike(String value) {
            addCriterion("SYS_REMARK not like", value, "sysRemark");
            return (Criteria) this;
        }

        public Criteria andSysRemarkIn(List<String> values) {
            addCriterion("SYS_REMARK in", values, "sysRemark");
            return (Criteria) this;
        }

        public Criteria andSysRemarkNotIn(List<String> values) {
            addCriterion("SYS_REMARK not in", values, "sysRemark");
            return (Criteria) this;
        }

        public Criteria andSysRemarkBetween(String value1, String value2) {
            addCriterion("SYS_REMARK between", value1, value2, "sysRemark");
            return (Criteria) this;
        }

        public Criteria andSysRemarkNotBetween(String value1, String value2) {
            addCriterion("SYS_REMARK not between", value1, value2, "sysRemark");
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