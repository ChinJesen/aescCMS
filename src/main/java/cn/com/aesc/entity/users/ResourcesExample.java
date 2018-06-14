package cn.com.aesc.entity.users;

import java.util.ArrayList;
import java.util.List;

public class ResourcesExample {
  protected String orderByClause;

  protected boolean distinct;

  protected List<Criteria> oredCriteria;

  public ResourcesExample() {
    oredCriteria = new ArrayList<Criteria>();
  }

  public String getOrderByClause() {
    return orderByClause;
  }

  public void setOrderByClause(String orderByClause) {
    this.orderByClause = orderByClause;
  }

  public boolean isDistinct() {
    return distinct;
  }

  public void setDistinct(boolean distinct) {
    this.distinct = distinct;
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

    public Criteria andIdIsNull() {
      addCriterion("id is null");
      return (Criteria) this;
    }

    public Criteria andIdIsNotNull() {
      addCriterion("id is not null");
      return (Criteria) this;
    }

    public Criteria andIdEqualTo(Integer value) {
      addCriterion("id =", value, "id");
      return (Criteria) this;
    }

    public Criteria andIdNotEqualTo(Integer value) {
      addCriterion("id <>", value, "id");
      return (Criteria) this;
    }

    public Criteria andIdGreaterThan(Integer value) {
      addCriterion("id >", value, "id");
      return (Criteria) this;
    }

    public Criteria andIdGreaterThanOrEqualTo(Integer value) {
      addCriterion("id >=", value, "id");
      return (Criteria) this;
    }

    public Criteria andIdLessThan(Integer value) {
      addCriterion("id <", value, "id");
      return (Criteria) this;
    }

    public Criteria andIdLessThanOrEqualTo(Integer value) {
      addCriterion("id <=", value, "id");
      return (Criteria) this;
    }

    public Criteria andIdIn(List<Integer> values) {
      addCriterion("id in", values, "id");
      return (Criteria) this;
    }

    public Criteria andIdNotIn(List<Integer> values) {
      addCriterion("id not in", values, "id");
      return (Criteria) this;
    }

    public Criteria andIdBetween(Integer value1, Integer value2) {
      addCriterion("id between", value1, value2, "id");
      return (Criteria) this;
    }

    public Criteria andIdNotBetween(Integer value1, Integer value2) {
      addCriterion("id not between", value1, value2, "id");
      return (Criteria) this;
    }

    public Criteria andNameIsNull() {
      addCriterion("name is null");
      return (Criteria) this;
    }

    public Criteria andNameIsNotNull() {
      addCriterion("name is not null");
      return (Criteria) this;
    }

    public Criteria andNameEqualTo(String value) {
      addCriterion("name =", value, "name");
      return (Criteria) this;
    }

    public Criteria andNameNotEqualTo(String value) {
      addCriterion("name <>", value, "name");
      return (Criteria) this;
    }

    public Criteria andNameGreaterThan(String value) {
      addCriterion("name >", value, "name");
      return (Criteria) this;
    }

    public Criteria andNameGreaterThanOrEqualTo(String value) {
      addCriterion("name >=", value, "name");
      return (Criteria) this;
    }

    public Criteria andNameLessThan(String value) {
      addCriterion("name <", value, "name");
      return (Criteria) this;
    }

    public Criteria andNameLessThanOrEqualTo(String value) {
      addCriterion("name <=", value, "name");
      return (Criteria) this;
    }

    public Criteria andNameLike(String value) {
      addCriterion("name like", value, "name");
      return (Criteria) this;
    }

    public Criteria andNameNotLike(String value) {
      addCriterion("name not like", value, "name");
      return (Criteria) this;
    }

    public Criteria andNameIn(List<String> values) {
      addCriterion("name in", values, "name");
      return (Criteria) this;
    }

    public Criteria andNameNotIn(List<String> values) {
      addCriterion("name not in", values, "name");
      return (Criteria) this;
    }

    public Criteria andNameBetween(String value1, String value2) {
      addCriterion("name between", value1, value2, "name");
      return (Criteria) this;
    }

    public Criteria andNameNotBetween(String value1, String value2) {
      addCriterion("name not between", value1, value2, "name");
      return (Criteria) this;
    }

    public Criteria andResurlIsNull() {
      addCriterion("resUrl is null");
      return (Criteria) this;
    }

    public Criteria andResurlIsNotNull() {
      addCriterion("resUrl is not null");
      return (Criteria) this;
    }

    public Criteria andResurlEqualTo(String value) {
      addCriterion("resUrl =", value, "resurl");
      return (Criteria) this;
    }

    public Criteria andResurlNotEqualTo(String value) {
      addCriterion("resUrl <>", value, "resurl");
      return (Criteria) this;
    }

    public Criteria andResurlGreaterThan(String value) {
      addCriterion("resUrl >", value, "resurl");
      return (Criteria) this;
    }

    public Criteria andResurlGreaterThanOrEqualTo(String value) {
      addCriterion("resUrl >=", value, "resurl");
      return (Criteria) this;
    }

    public Criteria andResurlLessThan(String value) {
      addCriterion("resUrl <", value, "resurl");
      return (Criteria) this;
    }

    public Criteria andResurlLessThanOrEqualTo(String value) {
      addCriterion("resUrl <=", value, "resurl");
      return (Criteria) this;
    }

    public Criteria andResurlLike(String value) {
      addCriterion("resUrl like", value, "resurl");
      return (Criteria) this;
    }

    public Criteria andResurlNotLike(String value) {
      addCriterion("resUrl not like", value, "resurl");
      return (Criteria) this;
    }

    public Criteria andResurlIn(List<String> values) {
      addCriterion("resUrl in", values, "resurl");
      return (Criteria) this;
    }

    public Criteria andResurlNotIn(List<String> values) {
      addCriterion("resUrl not in", values, "resurl");
      return (Criteria) this;
    }

    public Criteria andResurlBetween(String value1, String value2) {
      addCriterion("resUrl between", value1, value2, "resurl");
      return (Criteria) this;
    }

    public Criteria andResurlNotBetween(String value1, String value2) {
      addCriterion("resUrl not between", value1, value2, "resurl");
      return (Criteria) this;
    }

    public Criteria andTypeIsNull() {
      addCriterion("type is null");
      return (Criteria) this;
    }

    public Criteria andTypeIsNotNull() {
      addCriterion("type is not null");
      return (Criteria) this;
    }

    public Criteria andTypeEqualTo(Integer value) {
      addCriterion("type =", value, "type");
      return (Criteria) this;
    }

    public Criteria andTypeNotEqualTo(Integer value) {
      addCriterion("type <>", value, "type");
      return (Criteria) this;
    }

    public Criteria andTypeGreaterThan(Integer value) {
      addCriterion("type >", value, "type");
      return (Criteria) this;
    }

    public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
      addCriterion("type >=", value, "type");
      return (Criteria) this;
    }

    public Criteria andTypeLessThan(Integer value) {
      addCriterion("type <", value, "type");
      return (Criteria) this;
    }

    public Criteria andTypeLessThanOrEqualTo(Integer value) {
      addCriterion("type <=", value, "type");
      return (Criteria) this;
    }

    public Criteria andTypeIn(List<Integer> values) {
      addCriterion("type in", values, "type");
      return (Criteria) this;
    }

    public Criteria andTypeNotIn(List<Integer> values) {
      addCriterion("type not in", values, "type");
      return (Criteria) this;
    }

    public Criteria andTypeBetween(Integer value1, Integer value2) {
      addCriterion("type between", value1, value2, "type");
      return (Criteria) this;
    }

    public Criteria andTypeNotBetween(Integer value1, Integer value2) {
      addCriterion("type not between", value1, value2, "type");
      return (Criteria) this;
    }

    public Criteria andParentidIsNull() {
      addCriterion("parentId is null");
      return (Criteria) this;
    }

    public Criteria andParentidIsNotNull() {
      addCriterion("parentId is not null");
      return (Criteria) this;
    }

    public Criteria andParentidEqualTo(Integer value) {
      addCriterion("parentId =", value, "parentid");
      return (Criteria) this;
    }

    public Criteria andParentidNotEqualTo(Integer value) {
      addCriterion("parentId <>", value, "parentid");
      return (Criteria) this;
    }

    public Criteria andParentidGreaterThan(Integer value) {
      addCriterion("parentId >", value, "parentid");
      return (Criteria) this;
    }

    public Criteria andParentidGreaterThanOrEqualTo(Integer value) {
      addCriterion("parentId >=", value, "parentid");
      return (Criteria) this;
    }

    public Criteria andParentidLessThan(Integer value) {
      addCriterion("parentId <", value, "parentid");
      return (Criteria) this;
    }

    public Criteria andParentidLessThanOrEqualTo(Integer value) {
      addCriterion("parentId <=", value, "parentid");
      return (Criteria) this;
    }

    public Criteria andParentidIn(List<Integer> values) {
      addCriterion("parentId in", values, "parentid");
      return (Criteria) this;
    }

    public Criteria andParentidNotIn(List<Integer> values) {
      addCriterion("parentId not in", values, "parentid");
      return (Criteria) this;
    }

    public Criteria andParentidBetween(Integer value1, Integer value2) {
      addCriterion("parentId between", value1, value2, "parentid");
      return (Criteria) this;
    }

    public Criteria andParentidNotBetween(Integer value1, Integer value2) {
      addCriterion("parentId not between", value1, value2, "parentid");
      return (Criteria) this;
    }

    public Criteria andSortIsNull() {
      addCriterion("sort is null");
      return (Criteria) this;
    }

    public Criteria andSortIsNotNull() {
      addCriterion("sort is not null");
      return (Criteria) this;
    }

    public Criteria andSortEqualTo(Integer value) {
      addCriterion("sort =", value, "sort");
      return (Criteria) this;
    }

    public Criteria andSortNotEqualTo(Integer value) {
      addCriterion("sort <>", value, "sort");
      return (Criteria) this;
    }

    public Criteria andSortGreaterThan(Integer value) {
      addCriterion("sort >", value, "sort");
      return (Criteria) this;
    }

    public Criteria andSortGreaterThanOrEqualTo(Integer value) {
      addCriterion("sort >=", value, "sort");
      return (Criteria) this;
    }

    public Criteria andSortLessThan(Integer value) {
      addCriterion("sort <", value, "sort");
      return (Criteria) this;
    }

    public Criteria andSortLessThanOrEqualTo(Integer value) {
      addCriterion("sort <=", value, "sort");
      return (Criteria) this;
    }

    public Criteria andSortIn(List<Integer> values) {
      addCriterion("sort in", values, "sort");
      return (Criteria) this;
    }

    public Criteria andSortNotIn(List<Integer> values) {
      addCriterion("sort not in", values, "sort");
      return (Criteria) this;
    }

    public Criteria andSortBetween(Integer value1, Integer value2) {
      addCriterion("sort between", value1, value2, "sort");
      return (Criteria) this;
    }

    public Criteria andSortNotBetween(Integer value1, Integer value2) {
      addCriterion("sort not between", value1, value2, "sort");
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
  }
}