/**
 *
 * @author ztuo
 * @date 2022-03-25 11:18:58
 */
package cn.ztuo.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysDeptExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * SysDeptExample
     * 
     * @return null
     */
    public SysDeptExample() {
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

        public Criteria andParentIdIsNull() {
            addCriterion("PARENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("PARENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(String value) {
            addCriterion("PARENT_ID =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(String value) {
            addCriterion("PARENT_ID <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(String value) {
            addCriterion("PARENT_ID >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(String value) {
            addCriterion("PARENT_ID >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(String value) {
            addCriterion("PARENT_ID <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(String value) {
            addCriterion("PARENT_ID <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLike(String value) {
            addCriterion("PARENT_ID like", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotLike(String value) {
            addCriterion("PARENT_ID not like", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<String> values) {
            addCriterion("PARENT_ID in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<String> values) {
            addCriterion("PARENT_ID not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(String value1, String value2) {
            addCriterion("PARENT_ID between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(String value1, String value2) {
            addCriterion("PARENT_ID not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andRootNodeIsNull() {
            addCriterion("ROOT_NODE is null");
            return (Criteria) this;
        }

        public Criteria andRootNodeIsNotNull() {
            addCriterion("ROOT_NODE is not null");
            return (Criteria) this;
        }

        public Criteria andRootNodeEqualTo(String value) {
            addCriterion("ROOT_NODE =", value, "rootNode");
            return (Criteria) this;
        }

        public Criteria andRootNodeNotEqualTo(String value) {
            addCriterion("ROOT_NODE <>", value, "rootNode");
            return (Criteria) this;
        }

        public Criteria andRootNodeGreaterThan(String value) {
            addCriterion("ROOT_NODE >", value, "rootNode");
            return (Criteria) this;
        }

        public Criteria andRootNodeGreaterThanOrEqualTo(String value) {
            addCriterion("ROOT_NODE >=", value, "rootNode");
            return (Criteria) this;
        }

        public Criteria andRootNodeLessThan(String value) {
            addCriterion("ROOT_NODE <", value, "rootNode");
            return (Criteria) this;
        }

        public Criteria andRootNodeLessThanOrEqualTo(String value) {
            addCriterion("ROOT_NODE <=", value, "rootNode");
            return (Criteria) this;
        }

        public Criteria andRootNodeLike(String value) {
            addCriterion("ROOT_NODE like", value, "rootNode");
            return (Criteria) this;
        }

        public Criteria andRootNodeNotLike(String value) {
            addCriterion("ROOT_NODE not like", value, "rootNode");
            return (Criteria) this;
        }

        public Criteria andRootNodeIn(List<String> values) {
            addCriterion("ROOT_NODE in", values, "rootNode");
            return (Criteria) this;
        }

        public Criteria andRootNodeNotIn(List<String> values) {
            addCriterion("ROOT_NODE not in", values, "rootNode");
            return (Criteria) this;
        }

        public Criteria andRootNodeBetween(String value1, String value2) {
            addCriterion("ROOT_NODE between", value1, value2, "rootNode");
            return (Criteria) this;
        }

        public Criteria andRootNodeNotBetween(String value1, String value2) {
            addCriterion("ROOT_NODE not between", value1, value2, "rootNode");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNull() {
            addCriterion("DEPT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNotNull() {
            addCriterion("DEPT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDeptNameEqualTo(String value) {
            addCriterion("DEPT_NAME =", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotEqualTo(String value) {
            addCriterion("DEPT_NAME <>", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThan(String value) {
            addCriterion("DEPT_NAME >", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_NAME >=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThan(String value) {
            addCriterion("DEPT_NAME <", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThanOrEqualTo(String value) {
            addCriterion("DEPT_NAME <=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLike(String value) {
            addCriterion("DEPT_NAME like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotLike(String value) {
            addCriterion("DEPT_NAME not like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameIn(List<String> values) {
            addCriterion("DEPT_NAME in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotIn(List<String> values) {
            addCriterion("DEPT_NAME not in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameBetween(String value1, String value2) {
            addCriterion("DEPT_NAME between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotBetween(String value1, String value2) {
            addCriterion("DEPT_NAME not between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameEnIsNull() {
            addCriterion("DEPT_NAME_EN is null");
            return (Criteria) this;
        }

        public Criteria andDeptNameEnIsNotNull() {
            addCriterion("DEPT_NAME_EN is not null");
            return (Criteria) this;
        }

        public Criteria andDeptNameEnEqualTo(String value) {
            addCriterion("DEPT_NAME_EN =", value, "deptNameEn");
            return (Criteria) this;
        }

        public Criteria andDeptNameEnNotEqualTo(String value) {
            addCriterion("DEPT_NAME_EN <>", value, "deptNameEn");
            return (Criteria) this;
        }

        public Criteria andDeptNameEnGreaterThan(String value) {
            addCriterion("DEPT_NAME_EN >", value, "deptNameEn");
            return (Criteria) this;
        }

        public Criteria andDeptNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_NAME_EN >=", value, "deptNameEn");
            return (Criteria) this;
        }

        public Criteria andDeptNameEnLessThan(String value) {
            addCriterion("DEPT_NAME_EN <", value, "deptNameEn");
            return (Criteria) this;
        }

        public Criteria andDeptNameEnLessThanOrEqualTo(String value) {
            addCriterion("DEPT_NAME_EN <=", value, "deptNameEn");
            return (Criteria) this;
        }

        public Criteria andDeptNameEnLike(String value) {
            addCriterion("DEPT_NAME_EN like", value, "deptNameEn");
            return (Criteria) this;
        }

        public Criteria andDeptNameEnNotLike(String value) {
            addCriterion("DEPT_NAME_EN not like", value, "deptNameEn");
            return (Criteria) this;
        }

        public Criteria andDeptNameEnIn(List<String> values) {
            addCriterion("DEPT_NAME_EN in", values, "deptNameEn");
            return (Criteria) this;
        }

        public Criteria andDeptNameEnNotIn(List<String> values) {
            addCriterion("DEPT_NAME_EN not in", values, "deptNameEn");
            return (Criteria) this;
        }

        public Criteria andDeptNameEnBetween(String value1, String value2) {
            addCriterion("DEPT_NAME_EN between", value1, value2, "deptNameEn");
            return (Criteria) this;
        }

        public Criteria andDeptNameEnNotBetween(String value1, String value2) {
            addCriterion("DEPT_NAME_EN not between", value1, value2, "deptNameEn");
            return (Criteria) this;
        }

        public Criteria andDeptNameAbbrIsNull() {
            addCriterion("DEPT_NAME_ABBR is null");
            return (Criteria) this;
        }

        public Criteria andDeptNameAbbrIsNotNull() {
            addCriterion("DEPT_NAME_ABBR is not null");
            return (Criteria) this;
        }

        public Criteria andDeptNameAbbrEqualTo(String value) {
            addCriterion("DEPT_NAME_ABBR =", value, "deptNameAbbr");
            return (Criteria) this;
        }

        public Criteria andDeptNameAbbrNotEqualTo(String value) {
            addCriterion("DEPT_NAME_ABBR <>", value, "deptNameAbbr");
            return (Criteria) this;
        }

        public Criteria andDeptNameAbbrGreaterThan(String value) {
            addCriterion("DEPT_NAME_ABBR >", value, "deptNameAbbr");
            return (Criteria) this;
        }

        public Criteria andDeptNameAbbrGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_NAME_ABBR >=", value, "deptNameAbbr");
            return (Criteria) this;
        }

        public Criteria andDeptNameAbbrLessThan(String value) {
            addCriterion("DEPT_NAME_ABBR <", value, "deptNameAbbr");
            return (Criteria) this;
        }

        public Criteria andDeptNameAbbrLessThanOrEqualTo(String value) {
            addCriterion("DEPT_NAME_ABBR <=", value, "deptNameAbbr");
            return (Criteria) this;
        }

        public Criteria andDeptNameAbbrLike(String value) {
            addCriterion("DEPT_NAME_ABBR like", value, "deptNameAbbr");
            return (Criteria) this;
        }

        public Criteria andDeptNameAbbrNotLike(String value) {
            addCriterion("DEPT_NAME_ABBR not like", value, "deptNameAbbr");
            return (Criteria) this;
        }

        public Criteria andDeptNameAbbrIn(List<String> values) {
            addCriterion("DEPT_NAME_ABBR in", values, "deptNameAbbr");
            return (Criteria) this;
        }

        public Criteria andDeptNameAbbrNotIn(List<String> values) {
            addCriterion("DEPT_NAME_ABBR not in", values, "deptNameAbbr");
            return (Criteria) this;
        }

        public Criteria andDeptNameAbbrBetween(String value1, String value2) {
            addCriterion("DEPT_NAME_ABBR between", value1, value2, "deptNameAbbr");
            return (Criteria) this;
        }

        public Criteria andDeptNameAbbrNotBetween(String value1, String value2) {
            addCriterion("DEPT_NAME_ABBR not between", value1, value2, "deptNameAbbr");
            return (Criteria) this;
        }

        public Criteria andDeptOrderIsNull() {
            addCriterion("DEPT_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andDeptOrderIsNotNull() {
            addCriterion("DEPT_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andDeptOrderEqualTo(Long value) {
            addCriterion("DEPT_ORDER =", value, "deptOrder");
            return (Criteria) this;
        }

        public Criteria andDeptOrderNotEqualTo(Long value) {
            addCriterion("DEPT_ORDER <>", value, "deptOrder");
            return (Criteria) this;
        }

        public Criteria andDeptOrderGreaterThan(Long value) {
            addCriterion("DEPT_ORDER >", value, "deptOrder");
            return (Criteria) this;
        }

        public Criteria andDeptOrderGreaterThanOrEqualTo(Long value) {
            addCriterion("DEPT_ORDER >=", value, "deptOrder");
            return (Criteria) this;
        }

        public Criteria andDeptOrderLessThan(Long value) {
            addCriterion("DEPT_ORDER <", value, "deptOrder");
            return (Criteria) this;
        }

        public Criteria andDeptOrderLessThanOrEqualTo(Long value) {
            addCriterion("DEPT_ORDER <=", value, "deptOrder");
            return (Criteria) this;
        }

        public Criteria andDeptOrderIn(List<Long> values) {
            addCriterion("DEPT_ORDER in", values, "deptOrder");
            return (Criteria) this;
        }

        public Criteria andDeptOrderNotIn(List<Long> values) {
            addCriterion("DEPT_ORDER not in", values, "deptOrder");
            return (Criteria) this;
        }

        public Criteria andDeptOrderBetween(Long value1, Long value2) {
            addCriterion("DEPT_ORDER between", value1, value2, "deptOrder");
            return (Criteria) this;
        }

        public Criteria andDeptOrderNotBetween(Long value1, Long value2) {
            addCriterion("DEPT_ORDER not between", value1, value2, "deptOrder");
            return (Criteria) this;
        }

        public Criteria andOrgCategoryIsNull() {
            addCriterion("ORG_CATEGORY is null");
            return (Criteria) this;
        }

        public Criteria andOrgCategoryIsNotNull() {
            addCriterion("ORG_CATEGORY is not null");
            return (Criteria) this;
        }

        public Criteria andOrgCategoryEqualTo(String value) {
            addCriterion("ORG_CATEGORY =", value, "orgCategory");
            return (Criteria) this;
        }

        public Criteria andOrgCategoryNotEqualTo(String value) {
            addCriterion("ORG_CATEGORY <>", value, "orgCategory");
            return (Criteria) this;
        }

        public Criteria andOrgCategoryGreaterThan(String value) {
            addCriterion("ORG_CATEGORY >", value, "orgCategory");
            return (Criteria) this;
        }

        public Criteria andOrgCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_CATEGORY >=", value, "orgCategory");
            return (Criteria) this;
        }

        public Criteria andOrgCategoryLessThan(String value) {
            addCriterion("ORG_CATEGORY <", value, "orgCategory");
            return (Criteria) this;
        }

        public Criteria andOrgCategoryLessThanOrEqualTo(String value) {
            addCriterion("ORG_CATEGORY <=", value, "orgCategory");
            return (Criteria) this;
        }

        public Criteria andOrgCategoryLike(String value) {
            addCriterion("ORG_CATEGORY like", value, "orgCategory");
            return (Criteria) this;
        }

        public Criteria andOrgCategoryNotLike(String value) {
            addCriterion("ORG_CATEGORY not like", value, "orgCategory");
            return (Criteria) this;
        }

        public Criteria andOrgCategoryIn(List<String> values) {
            addCriterion("ORG_CATEGORY in", values, "orgCategory");
            return (Criteria) this;
        }

        public Criteria andOrgCategoryNotIn(List<String> values) {
            addCriterion("ORG_CATEGORY not in", values, "orgCategory");
            return (Criteria) this;
        }

        public Criteria andOrgCategoryBetween(String value1, String value2) {
            addCriterion("ORG_CATEGORY between", value1, value2, "orgCategory");
            return (Criteria) this;
        }

        public Criteria andOrgCategoryNotBetween(String value1, String value2) {
            addCriterion("ORG_CATEGORY not between", value1, value2, "orgCategory");
            return (Criteria) this;
        }

        public Criteria andOrgTypeIsNull() {
            addCriterion("ORG_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOrgTypeIsNotNull() {
            addCriterion("ORG_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOrgTypeEqualTo(String value) {
            addCriterion("ORG_TYPE =", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeNotEqualTo(String value) {
            addCriterion("ORG_TYPE <>", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeGreaterThan(String value) {
            addCriterion("ORG_TYPE >", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_TYPE >=", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeLessThan(String value) {
            addCriterion("ORG_TYPE <", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeLessThanOrEqualTo(String value) {
            addCriterion("ORG_TYPE <=", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeLike(String value) {
            addCriterion("ORG_TYPE like", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeNotLike(String value) {
            addCriterion("ORG_TYPE not like", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeIn(List<String> values) {
            addCriterion("ORG_TYPE in", values, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeNotIn(List<String> values) {
            addCriterion("ORG_TYPE not in", values, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeBetween(String value1, String value2) {
            addCriterion("ORG_TYPE between", value1, value2, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeNotBetween(String value1, String value2) {
            addCriterion("ORG_TYPE not between", value1, value2, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIsNull() {
            addCriterion("ORG_CODE is null");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIsNotNull() {
            addCriterion("ORG_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andOrgCodeEqualTo(String value) {
            addCriterion("ORG_CODE =", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotEqualTo(String value) {
            addCriterion("ORG_CODE <>", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeGreaterThan(String value) {
            addCriterion("ORG_CODE >", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_CODE >=", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLessThan(String value) {
            addCriterion("ORG_CODE <", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLessThanOrEqualTo(String value) {
            addCriterion("ORG_CODE <=", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLike(String value) {
            addCriterion("ORG_CODE like", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotLike(String value) {
            addCriterion("ORG_CODE not like", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIn(List<String> values) {
            addCriterion("ORG_CODE in", values, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotIn(List<String> values) {
            addCriterion("ORG_CODE not in", values, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeBetween(String value1, String value2) {
            addCriterion("ORG_CODE between", value1, value2, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotBetween(String value1, String value2) {
            addCriterion("ORG_CODE not between", value1, value2, "orgCode");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("PHONE =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("PHONE <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("PHONE >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("PHONE <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("PHONE <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("PHONE like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("PHONE not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("PHONE in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("PHONE not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("PHONE between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("PHONE not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andFaxIsNull() {
            addCriterion("FAX is null");
            return (Criteria) this;
        }

        public Criteria andFaxIsNotNull() {
            addCriterion("FAX is not null");
            return (Criteria) this;
        }

        public Criteria andFaxEqualTo(String value) {
            addCriterion("FAX =", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotEqualTo(String value) {
            addCriterion("FAX <>", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThan(String value) {
            addCriterion("FAX >", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThanOrEqualTo(String value) {
            addCriterion("FAX >=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThan(String value) {
            addCriterion("FAX <", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThanOrEqualTo(String value) {
            addCriterion("FAX <=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLike(String value) {
            addCriterion("FAX like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotLike(String value) {
            addCriterion("FAX not like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxIn(List<String> values) {
            addCriterion("FAX in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotIn(List<String> values) {
            addCriterion("FAX not in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxBetween(String value1, String value2) {
            addCriterion("FAX between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotBetween(String value1, String value2) {
            addCriterion("FAX not between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andPathIsNull() {
            addCriterion("PATH is null");
            return (Criteria) this;
        }

        public Criteria andPathIsNotNull() {
            addCriterion("PATH is not null");
            return (Criteria) this;
        }

        public Criteria andPathEqualTo(String value) {
            addCriterion("PATH =", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotEqualTo(String value) {
            addCriterion("PATH <>", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThan(String value) {
            addCriterion("PATH >", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThanOrEqualTo(String value) {
            addCriterion("PATH >=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThan(String value) {
            addCriterion("PATH <", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThanOrEqualTo(String value) {
            addCriterion("PATH <=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLike(String value) {
            addCriterion("PATH like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotLike(String value) {
            addCriterion("PATH not like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathIn(List<String> values) {
            addCriterion("PATH in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotIn(List<String> values) {
            addCriterion("PATH not in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathBetween(String value1, String value2) {
            addCriterion("PATH between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotBetween(String value1, String value2) {
            addCriterion("PATH not between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIsNull() {
            addCriterion("DEPT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIsNotNull() {
            addCriterion("DEPT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDeptTypeEqualTo(String value) {
            addCriterion("DEPT_TYPE =", value, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeNotEqualTo(String value) {
            addCriterion("DEPT_TYPE <>", value, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeGreaterThan(String value) {
            addCriterion("DEPT_TYPE >", value, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_TYPE >=", value, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeLessThan(String value) {
            addCriterion("DEPT_TYPE <", value, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeLessThanOrEqualTo(String value) {
            addCriterion("DEPT_TYPE <=", value, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeLike(String value) {
            addCriterion("DEPT_TYPE like", value, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeNotLike(String value) {
            addCriterion("DEPT_TYPE not like", value, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIn(List<String> values) {
            addCriterion("DEPT_TYPE in", values, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeNotIn(List<String> values) {
            addCriterion("DEPT_TYPE not in", values, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeBetween(String value1, String value2) {
            addCriterion("DEPT_TYPE between", value1, value2, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeNotBetween(String value1, String value2) {
            addCriterion("DEPT_TYPE not between", value1, value2, "deptType");
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