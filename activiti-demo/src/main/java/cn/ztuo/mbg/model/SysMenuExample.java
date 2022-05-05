/**
 *
 * @author ztuo
 * @date 2022-03-25 11:18:38
 */
package cn.ztuo.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysMenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * SysMenuExample
     * 
     * @return null
     */
    public SysMenuExample() {
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

        public Criteria andProjectIdIsNull() {
            addCriterion("PROJECT_ID is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("PROJECT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(String value) {
            addCriterion("PROJECT_ID =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(String value) {
            addCriterion("PROJECT_ID <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(String value) {
            addCriterion("PROJECT_ID >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECT_ID >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(String value) {
            addCriterion("PROJECT_ID <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(String value) {
            addCriterion("PROJECT_ID <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLike(String value) {
            addCriterion("PROJECT_ID like", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotLike(String value) {
            addCriterion("PROJECT_ID not like", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<String> values) {
            addCriterion("PROJECT_ID in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<String> values) {
            addCriterion("PROJECT_ID not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(String value1, String value2) {
            addCriterion("PROJECT_ID between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(String value1, String value2) {
            addCriterion("PROJECT_ID not between", value1, value2, "projectId");
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

        public Criteria andMenuStatusIsNull() {
            addCriterion("MENU_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andMenuStatusIsNotNull() {
            addCriterion("MENU_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andMenuStatusEqualTo(String value) {
            addCriterion("MENU_STATUS =", value, "menuStatus");
            return (Criteria) this;
        }

        public Criteria andMenuStatusNotEqualTo(String value) {
            addCriterion("MENU_STATUS <>", value, "menuStatus");
            return (Criteria) this;
        }

        public Criteria andMenuStatusGreaterThan(String value) {
            addCriterion("MENU_STATUS >", value, "menuStatus");
            return (Criteria) this;
        }

        public Criteria andMenuStatusGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_STATUS >=", value, "menuStatus");
            return (Criteria) this;
        }

        public Criteria andMenuStatusLessThan(String value) {
            addCriterion("MENU_STATUS <", value, "menuStatus");
            return (Criteria) this;
        }

        public Criteria andMenuStatusLessThanOrEqualTo(String value) {
            addCriterion("MENU_STATUS <=", value, "menuStatus");
            return (Criteria) this;
        }

        public Criteria andMenuStatusLike(String value) {
            addCriterion("MENU_STATUS like", value, "menuStatus");
            return (Criteria) this;
        }

        public Criteria andMenuStatusNotLike(String value) {
            addCriterion("MENU_STATUS not like", value, "menuStatus");
            return (Criteria) this;
        }

        public Criteria andMenuStatusIn(List<String> values) {
            addCriterion("MENU_STATUS in", values, "menuStatus");
            return (Criteria) this;
        }

        public Criteria andMenuStatusNotIn(List<String> values) {
            addCriterion("MENU_STATUS not in", values, "menuStatus");
            return (Criteria) this;
        }

        public Criteria andMenuStatusBetween(String value1, String value2) {
            addCriterion("MENU_STATUS between", value1, value2, "menuStatus");
            return (Criteria) this;
        }

        public Criteria andMenuStatusNotBetween(String value1, String value2) {
            addCriterion("MENU_STATUS not between", value1, value2, "menuStatus");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIsNull() {
            addCriterion("MENU_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIsNotNull() {
            addCriterion("MENU_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMenuTypeEqualTo(String value) {
            addCriterion("MENU_TYPE =", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotEqualTo(String value) {
            addCriterion("MENU_TYPE <>", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeGreaterThan(String value) {
            addCriterion("MENU_TYPE >", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_TYPE >=", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeLessThan(String value) {
            addCriterion("MENU_TYPE <", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeLessThanOrEqualTo(String value) {
            addCriterion("MENU_TYPE <=", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeLike(String value) {
            addCriterion("MENU_TYPE like", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotLike(String value) {
            addCriterion("MENU_TYPE not like", value, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeIn(List<String> values) {
            addCriterion("MENU_TYPE in", values, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotIn(List<String> values) {
            addCriterion("MENU_TYPE not in", values, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeBetween(String value1, String value2) {
            addCriterion("MENU_TYPE between", value1, value2, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuTypeNotBetween(String value1, String value2) {
            addCriterion("MENU_TYPE not between", value1, value2, "menuType");
            return (Criteria) this;
        }

        public Criteria andMenuSortIsNull() {
            addCriterion("MENU_SORT is null");
            return (Criteria) this;
        }

        public Criteria andMenuSortIsNotNull() {
            addCriterion("MENU_SORT is not null");
            return (Criteria) this;
        }

        public Criteria andMenuSortEqualTo(Long value) {
            addCriterion("MENU_SORT =", value, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuSortNotEqualTo(Long value) {
            addCriterion("MENU_SORT <>", value, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuSortGreaterThan(Long value) {
            addCriterion("MENU_SORT >", value, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuSortGreaterThanOrEqualTo(Long value) {
            addCriterion("MENU_SORT >=", value, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuSortLessThan(Long value) {
            addCriterion("MENU_SORT <", value, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuSortLessThanOrEqualTo(Long value) {
            addCriterion("MENU_SORT <=", value, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuSortIn(List<Long> values) {
            addCriterion("MENU_SORT in", values, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuSortNotIn(List<Long> values) {
            addCriterion("MENU_SORT not in", values, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuSortBetween(Long value1, Long value2) {
            addCriterion("MENU_SORT between", value1, value2, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuSortNotBetween(Long value1, Long value2) {
            addCriterion("MENU_SORT not between", value1, value2, "menuSort");
            return (Criteria) this;
        }

        public Criteria andMenuPermsIsNull() {
            addCriterion("MENU_PERMS is null");
            return (Criteria) this;
        }

        public Criteria andMenuPermsIsNotNull() {
            addCriterion("MENU_PERMS is not null");
            return (Criteria) this;
        }

        public Criteria andMenuPermsEqualTo(String value) {
            addCriterion("MENU_PERMS =", value, "menuPerms");
            return (Criteria) this;
        }

        public Criteria andMenuPermsNotEqualTo(String value) {
            addCriterion("MENU_PERMS <>", value, "menuPerms");
            return (Criteria) this;
        }

        public Criteria andMenuPermsGreaterThan(String value) {
            addCriterion("MENU_PERMS >", value, "menuPerms");
            return (Criteria) this;
        }

        public Criteria andMenuPermsGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_PERMS >=", value, "menuPerms");
            return (Criteria) this;
        }

        public Criteria andMenuPermsLessThan(String value) {
            addCriterion("MENU_PERMS <", value, "menuPerms");
            return (Criteria) this;
        }

        public Criteria andMenuPermsLessThanOrEqualTo(String value) {
            addCriterion("MENU_PERMS <=", value, "menuPerms");
            return (Criteria) this;
        }

        public Criteria andMenuPermsLike(String value) {
            addCriterion("MENU_PERMS like", value, "menuPerms");
            return (Criteria) this;
        }

        public Criteria andMenuPermsNotLike(String value) {
            addCriterion("MENU_PERMS not like", value, "menuPerms");
            return (Criteria) this;
        }

        public Criteria andMenuPermsIn(List<String> values) {
            addCriterion("MENU_PERMS in", values, "menuPerms");
            return (Criteria) this;
        }

        public Criteria andMenuPermsNotIn(List<String> values) {
            addCriterion("MENU_PERMS not in", values, "menuPerms");
            return (Criteria) this;
        }

        public Criteria andMenuPermsBetween(String value1, String value2) {
            addCriterion("MENU_PERMS between", value1, value2, "menuPerms");
            return (Criteria) this;
        }

        public Criteria andMenuPermsNotBetween(String value1, String value2) {
            addCriterion("MENU_PERMS not between", value1, value2, "menuPerms");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
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

        public Criteria andComponentIsNull() {
            addCriterion("COMPONENT is null");
            return (Criteria) this;
        }

        public Criteria andComponentIsNotNull() {
            addCriterion("COMPONENT is not null");
            return (Criteria) this;
        }

        public Criteria andComponentEqualTo(String value) {
            addCriterion("COMPONENT =", value, "component");
            return (Criteria) this;
        }

        public Criteria andComponentNotEqualTo(String value) {
            addCriterion("COMPONENT <>", value, "component");
            return (Criteria) this;
        }

        public Criteria andComponentGreaterThan(String value) {
            addCriterion("COMPONENT >", value, "component");
            return (Criteria) this;
        }

        public Criteria andComponentGreaterThanOrEqualTo(String value) {
            addCriterion("COMPONENT >=", value, "component");
            return (Criteria) this;
        }

        public Criteria andComponentLessThan(String value) {
            addCriterion("COMPONENT <", value, "component");
            return (Criteria) this;
        }

        public Criteria andComponentLessThanOrEqualTo(String value) {
            addCriterion("COMPONENT <=", value, "component");
            return (Criteria) this;
        }

        public Criteria andComponentLike(String value) {
            addCriterion("COMPONENT like", value, "component");
            return (Criteria) this;
        }

        public Criteria andComponentNotLike(String value) {
            addCriterion("COMPONENT not like", value, "component");
            return (Criteria) this;
        }

        public Criteria andComponentIn(List<String> values) {
            addCriterion("COMPONENT in", values, "component");
            return (Criteria) this;
        }

        public Criteria andComponentNotIn(List<String> values) {
            addCriterion("COMPONENT not in", values, "component");
            return (Criteria) this;
        }

        public Criteria andComponentBetween(String value1, String value2) {
            addCriterion("COMPONENT between", value1, value2, "component");
            return (Criteria) this;
        }

        public Criteria andComponentNotBetween(String value1, String value2) {
            addCriterion("COMPONENT not between", value1, value2, "component");
            return (Criteria) this;
        }

        public Criteria andRedirectIsNull() {
            addCriterion("REDIRECT is null");
            return (Criteria) this;
        }

        public Criteria andRedirectIsNotNull() {
            addCriterion("REDIRECT is not null");
            return (Criteria) this;
        }

        public Criteria andRedirectEqualTo(String value) {
            addCriterion("REDIRECT =", value, "redirect");
            return (Criteria) this;
        }

        public Criteria andRedirectNotEqualTo(String value) {
            addCriterion("REDIRECT <>", value, "redirect");
            return (Criteria) this;
        }

        public Criteria andRedirectGreaterThan(String value) {
            addCriterion("REDIRECT >", value, "redirect");
            return (Criteria) this;
        }

        public Criteria andRedirectGreaterThanOrEqualTo(String value) {
            addCriterion("REDIRECT >=", value, "redirect");
            return (Criteria) this;
        }

        public Criteria andRedirectLessThan(String value) {
            addCriterion("REDIRECT <", value, "redirect");
            return (Criteria) this;
        }

        public Criteria andRedirectLessThanOrEqualTo(String value) {
            addCriterion("REDIRECT <=", value, "redirect");
            return (Criteria) this;
        }

        public Criteria andRedirectLike(String value) {
            addCriterion("REDIRECT like", value, "redirect");
            return (Criteria) this;
        }

        public Criteria andRedirectNotLike(String value) {
            addCriterion("REDIRECT not like", value, "redirect");
            return (Criteria) this;
        }

        public Criteria andRedirectIn(List<String> values) {
            addCriterion("REDIRECT in", values, "redirect");
            return (Criteria) this;
        }

        public Criteria andRedirectNotIn(List<String> values) {
            addCriterion("REDIRECT not in", values, "redirect");
            return (Criteria) this;
        }

        public Criteria andRedirectBetween(String value1, String value2) {
            addCriterion("REDIRECT between", value1, value2, "redirect");
            return (Criteria) this;
        }

        public Criteria andRedirectNotBetween(String value1, String value2) {
            addCriterion("REDIRECT not between", value1, value2, "redirect");
            return (Criteria) this;
        }

        public Criteria andMetaShowIsNull() {
            addCriterion("META_SHOW is null");
            return (Criteria) this;
        }

        public Criteria andMetaShowIsNotNull() {
            addCriterion("META_SHOW is not null");
            return (Criteria) this;
        }

        public Criteria andMetaShowEqualTo(String value) {
            addCriterion("META_SHOW =", value, "metaShow");
            return (Criteria) this;
        }

        public Criteria andMetaShowNotEqualTo(String value) {
            addCriterion("META_SHOW <>", value, "metaShow");
            return (Criteria) this;
        }

        public Criteria andMetaShowGreaterThan(String value) {
            addCriterion("META_SHOW >", value, "metaShow");
            return (Criteria) this;
        }

        public Criteria andMetaShowGreaterThanOrEqualTo(String value) {
            addCriterion("META_SHOW >=", value, "metaShow");
            return (Criteria) this;
        }

        public Criteria andMetaShowLessThan(String value) {
            addCriterion("META_SHOW <", value, "metaShow");
            return (Criteria) this;
        }

        public Criteria andMetaShowLessThanOrEqualTo(String value) {
            addCriterion("META_SHOW <=", value, "metaShow");
            return (Criteria) this;
        }

        public Criteria andMetaShowLike(String value) {
            addCriterion("META_SHOW like", value, "metaShow");
            return (Criteria) this;
        }

        public Criteria andMetaShowNotLike(String value) {
            addCriterion("META_SHOW not like", value, "metaShow");
            return (Criteria) this;
        }

        public Criteria andMetaShowIn(List<String> values) {
            addCriterion("META_SHOW in", values, "metaShow");
            return (Criteria) this;
        }

        public Criteria andMetaShowNotIn(List<String> values) {
            addCriterion("META_SHOW not in", values, "metaShow");
            return (Criteria) this;
        }

        public Criteria andMetaShowBetween(String value1, String value2) {
            addCriterion("META_SHOW between", value1, value2, "metaShow");
            return (Criteria) this;
        }

        public Criteria andMetaShowNotBetween(String value1, String value2) {
            addCriterion("META_SHOW not between", value1, value2, "metaShow");
            return (Criteria) this;
        }

        public Criteria andMetaTitleIsNull() {
            addCriterion("META_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andMetaTitleIsNotNull() {
            addCriterion("META_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andMetaTitleEqualTo(String value) {
            addCriterion("META_TITLE =", value, "metaTitle");
            return (Criteria) this;
        }

        public Criteria andMetaTitleNotEqualTo(String value) {
            addCriterion("META_TITLE <>", value, "metaTitle");
            return (Criteria) this;
        }

        public Criteria andMetaTitleGreaterThan(String value) {
            addCriterion("META_TITLE >", value, "metaTitle");
            return (Criteria) this;
        }

        public Criteria andMetaTitleGreaterThanOrEqualTo(String value) {
            addCriterion("META_TITLE >=", value, "metaTitle");
            return (Criteria) this;
        }

        public Criteria andMetaTitleLessThan(String value) {
            addCriterion("META_TITLE <", value, "metaTitle");
            return (Criteria) this;
        }

        public Criteria andMetaTitleLessThanOrEqualTo(String value) {
            addCriterion("META_TITLE <=", value, "metaTitle");
            return (Criteria) this;
        }

        public Criteria andMetaTitleLike(String value) {
            addCriterion("META_TITLE like", value, "metaTitle");
            return (Criteria) this;
        }

        public Criteria andMetaTitleNotLike(String value) {
            addCriterion("META_TITLE not like", value, "metaTitle");
            return (Criteria) this;
        }

        public Criteria andMetaTitleIn(List<String> values) {
            addCriterion("META_TITLE in", values, "metaTitle");
            return (Criteria) this;
        }

        public Criteria andMetaTitleNotIn(List<String> values) {
            addCriterion("META_TITLE not in", values, "metaTitle");
            return (Criteria) this;
        }

        public Criteria andMetaTitleBetween(String value1, String value2) {
            addCriterion("META_TITLE between", value1, value2, "metaTitle");
            return (Criteria) this;
        }

        public Criteria andMetaTitleNotBetween(String value1, String value2) {
            addCriterion("META_TITLE not between", value1, value2, "metaTitle");
            return (Criteria) this;
        }

        public Criteria andMetaIconIsNull() {
            addCriterion("META_ICON is null");
            return (Criteria) this;
        }

        public Criteria andMetaIconIsNotNull() {
            addCriterion("META_ICON is not null");
            return (Criteria) this;
        }

        public Criteria andMetaIconEqualTo(String value) {
            addCriterion("META_ICON =", value, "metaIcon");
            return (Criteria) this;
        }

        public Criteria andMetaIconNotEqualTo(String value) {
            addCriterion("META_ICON <>", value, "metaIcon");
            return (Criteria) this;
        }

        public Criteria andMetaIconGreaterThan(String value) {
            addCriterion("META_ICON >", value, "metaIcon");
            return (Criteria) this;
        }

        public Criteria andMetaIconGreaterThanOrEqualTo(String value) {
            addCriterion("META_ICON >=", value, "metaIcon");
            return (Criteria) this;
        }

        public Criteria andMetaIconLessThan(String value) {
            addCriterion("META_ICON <", value, "metaIcon");
            return (Criteria) this;
        }

        public Criteria andMetaIconLessThanOrEqualTo(String value) {
            addCriterion("META_ICON <=", value, "metaIcon");
            return (Criteria) this;
        }

        public Criteria andMetaIconLike(String value) {
            addCriterion("META_ICON like", value, "metaIcon");
            return (Criteria) this;
        }

        public Criteria andMetaIconNotLike(String value) {
            addCriterion("META_ICON not like", value, "metaIcon");
            return (Criteria) this;
        }

        public Criteria andMetaIconIn(List<String> values) {
            addCriterion("META_ICON in", values, "metaIcon");
            return (Criteria) this;
        }

        public Criteria andMetaIconNotIn(List<String> values) {
            addCriterion("META_ICON not in", values, "metaIcon");
            return (Criteria) this;
        }

        public Criteria andMetaIconBetween(String value1, String value2) {
            addCriterion("META_ICON between", value1, value2, "metaIcon");
            return (Criteria) this;
        }

        public Criteria andMetaIconNotBetween(String value1, String value2) {
            addCriterion("META_ICON not between", value1, value2, "metaIcon");
            return (Criteria) this;
        }

        public Criteria andMetaTargetIsNull() {
            addCriterion("META_TARGET is null");
            return (Criteria) this;
        }

        public Criteria andMetaTargetIsNotNull() {
            addCriterion("META_TARGET is not null");
            return (Criteria) this;
        }

        public Criteria andMetaTargetEqualTo(String value) {
            addCriterion("META_TARGET =", value, "metaTarget");
            return (Criteria) this;
        }

        public Criteria andMetaTargetNotEqualTo(String value) {
            addCriterion("META_TARGET <>", value, "metaTarget");
            return (Criteria) this;
        }

        public Criteria andMetaTargetGreaterThan(String value) {
            addCriterion("META_TARGET >", value, "metaTarget");
            return (Criteria) this;
        }

        public Criteria andMetaTargetGreaterThanOrEqualTo(String value) {
            addCriterion("META_TARGET >=", value, "metaTarget");
            return (Criteria) this;
        }

        public Criteria andMetaTargetLessThan(String value) {
            addCriterion("META_TARGET <", value, "metaTarget");
            return (Criteria) this;
        }

        public Criteria andMetaTargetLessThanOrEqualTo(String value) {
            addCriterion("META_TARGET <=", value, "metaTarget");
            return (Criteria) this;
        }

        public Criteria andMetaTargetLike(String value) {
            addCriterion("META_TARGET like", value, "metaTarget");
            return (Criteria) this;
        }

        public Criteria andMetaTargetNotLike(String value) {
            addCriterion("META_TARGET not like", value, "metaTarget");
            return (Criteria) this;
        }

        public Criteria andMetaTargetIn(List<String> values) {
            addCriterion("META_TARGET in", values, "metaTarget");
            return (Criteria) this;
        }

        public Criteria andMetaTargetNotIn(List<String> values) {
            addCriterion("META_TARGET not in", values, "metaTarget");
            return (Criteria) this;
        }

        public Criteria andMetaTargetBetween(String value1, String value2) {
            addCriterion("META_TARGET between", value1, value2, "metaTarget");
            return (Criteria) this;
        }

        public Criteria andMetaTargetNotBetween(String value1, String value2) {
            addCriterion("META_TARGET not between", value1, value2, "metaTarget");
            return (Criteria) this;
        }

        public Criteria andMetaHideChildrenIsNull() {
            addCriterion("META_HIDE_CHILDREN is null");
            return (Criteria) this;
        }

        public Criteria andMetaHideChildrenIsNotNull() {
            addCriterion("META_HIDE_CHILDREN is not null");
            return (Criteria) this;
        }

        public Criteria andMetaHideChildrenEqualTo(String value) {
            addCriterion("META_HIDE_CHILDREN =", value, "metaHideChildren");
            return (Criteria) this;
        }

        public Criteria andMetaHideChildrenNotEqualTo(String value) {
            addCriterion("META_HIDE_CHILDREN <>", value, "metaHideChildren");
            return (Criteria) this;
        }

        public Criteria andMetaHideChildrenGreaterThan(String value) {
            addCriterion("META_HIDE_CHILDREN >", value, "metaHideChildren");
            return (Criteria) this;
        }

        public Criteria andMetaHideChildrenGreaterThanOrEqualTo(String value) {
            addCriterion("META_HIDE_CHILDREN >=", value, "metaHideChildren");
            return (Criteria) this;
        }

        public Criteria andMetaHideChildrenLessThan(String value) {
            addCriterion("META_HIDE_CHILDREN <", value, "metaHideChildren");
            return (Criteria) this;
        }

        public Criteria andMetaHideChildrenLessThanOrEqualTo(String value) {
            addCriterion("META_HIDE_CHILDREN <=", value, "metaHideChildren");
            return (Criteria) this;
        }

        public Criteria andMetaHideChildrenLike(String value) {
            addCriterion("META_HIDE_CHILDREN like", value, "metaHideChildren");
            return (Criteria) this;
        }

        public Criteria andMetaHideChildrenNotLike(String value) {
            addCriterion("META_HIDE_CHILDREN not like", value, "metaHideChildren");
            return (Criteria) this;
        }

        public Criteria andMetaHideChildrenIn(List<String> values) {
            addCriterion("META_HIDE_CHILDREN in", values, "metaHideChildren");
            return (Criteria) this;
        }

        public Criteria andMetaHideChildrenNotIn(List<String> values) {
            addCriterion("META_HIDE_CHILDREN not in", values, "metaHideChildren");
            return (Criteria) this;
        }

        public Criteria andMetaHideChildrenBetween(String value1, String value2) {
            addCriterion("META_HIDE_CHILDREN between", value1, value2, "metaHideChildren");
            return (Criteria) this;
        }

        public Criteria andMetaHideChildrenNotBetween(String value1, String value2) {
            addCriterion("META_HIDE_CHILDREN not between", value1, value2, "metaHideChildren");
            return (Criteria) this;
        }

        public Criteria andMetaHiddenHeaderContentIsNull() {
            addCriterion("META_HIDDEN_HEADER_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andMetaHiddenHeaderContentIsNotNull() {
            addCriterion("META_HIDDEN_HEADER_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andMetaHiddenHeaderContentEqualTo(String value) {
            addCriterion("META_HIDDEN_HEADER_CONTENT =", value, "metaHiddenHeaderContent");
            return (Criteria) this;
        }

        public Criteria andMetaHiddenHeaderContentNotEqualTo(String value) {
            addCriterion("META_HIDDEN_HEADER_CONTENT <>", value, "metaHiddenHeaderContent");
            return (Criteria) this;
        }

        public Criteria andMetaHiddenHeaderContentGreaterThan(String value) {
            addCriterion("META_HIDDEN_HEADER_CONTENT >", value, "metaHiddenHeaderContent");
            return (Criteria) this;
        }

        public Criteria andMetaHiddenHeaderContentGreaterThanOrEqualTo(String value) {
            addCriterion("META_HIDDEN_HEADER_CONTENT >=", value, "metaHiddenHeaderContent");
            return (Criteria) this;
        }

        public Criteria andMetaHiddenHeaderContentLessThan(String value) {
            addCriterion("META_HIDDEN_HEADER_CONTENT <", value, "metaHiddenHeaderContent");
            return (Criteria) this;
        }

        public Criteria andMetaHiddenHeaderContentLessThanOrEqualTo(String value) {
            addCriterion("META_HIDDEN_HEADER_CONTENT <=", value, "metaHiddenHeaderContent");
            return (Criteria) this;
        }

        public Criteria andMetaHiddenHeaderContentLike(String value) {
            addCriterion("META_HIDDEN_HEADER_CONTENT like", value, "metaHiddenHeaderContent");
            return (Criteria) this;
        }

        public Criteria andMetaHiddenHeaderContentNotLike(String value) {
            addCriterion("META_HIDDEN_HEADER_CONTENT not like", value, "metaHiddenHeaderContent");
            return (Criteria) this;
        }

        public Criteria andMetaHiddenHeaderContentIn(List<String> values) {
            addCriterion("META_HIDDEN_HEADER_CONTENT in", values, "metaHiddenHeaderContent");
            return (Criteria) this;
        }

        public Criteria andMetaHiddenHeaderContentNotIn(List<String> values) {
            addCriterion("META_HIDDEN_HEADER_CONTENT not in", values, "metaHiddenHeaderContent");
            return (Criteria) this;
        }

        public Criteria andMetaHiddenHeaderContentBetween(String value1, String value2) {
            addCriterion("META_HIDDEN_HEADER_CONTENT between", value1, value2, "metaHiddenHeaderContent");
            return (Criteria) this;
        }

        public Criteria andMetaHiddenHeaderContentNotBetween(String value1, String value2) {
            addCriterion("META_HIDDEN_HEADER_CONTENT not between", value1, value2, "metaHiddenHeaderContent");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIsNull() {
            addCriterion("BUSINESS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIsNotNull() {
            addCriterion("BUSINESS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeEqualTo(String value) {
            addCriterion("BUSINESS_TYPE =", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotEqualTo(String value) {
            addCriterion("BUSINESS_TYPE <>", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeGreaterThan(String value) {
            addCriterion("BUSINESS_TYPE >", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_TYPE >=", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLessThan(String value) {
            addCriterion("BUSINESS_TYPE <", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_TYPE <=", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLike(String value) {
            addCriterion("BUSINESS_TYPE like", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotLike(String value) {
            addCriterion("BUSINESS_TYPE not like", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIn(List<String> values) {
            addCriterion("BUSINESS_TYPE in", values, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotIn(List<String> values) {
            addCriterion("BUSINESS_TYPE not in", values, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeBetween(String value1, String value2) {
            addCriterion("BUSINESS_TYPE between", value1, value2, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_TYPE not between", value1, value2, "businessType");
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

        public Criteria andMenuLevelIsNull() {
            addCriterion("MENU_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andMenuLevelIsNotNull() {
            addCriterion("MENU_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andMenuLevelEqualTo(Long value) {
            addCriterion("MENU_LEVEL =", value, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelNotEqualTo(Long value) {
            addCriterion("MENU_LEVEL <>", value, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelGreaterThan(Long value) {
            addCriterion("MENU_LEVEL >", value, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelGreaterThanOrEqualTo(Long value) {
            addCriterion("MENU_LEVEL >=", value, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelLessThan(Long value) {
            addCriterion("MENU_LEVEL <", value, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelLessThanOrEqualTo(Long value) {
            addCriterion("MENU_LEVEL <=", value, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelIn(List<Long> values) {
            addCriterion("MENU_LEVEL in", values, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelNotIn(List<Long> values) {
            addCriterion("MENU_LEVEL not in", values, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelBetween(Long value1, Long value2) {
            addCriterion("MENU_LEVEL between", value1, value2, "menuLevel");
            return (Criteria) this;
        }

        public Criteria andMenuLevelNotBetween(Long value1, Long value2) {
            addCriterion("MENU_LEVEL not between", value1, value2, "menuLevel");
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