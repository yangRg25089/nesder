package com.nesder.dao.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArticleExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table public.article
	 * @mbg.generated
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table public.article
	 * @mbg.generated
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table public.article
	 * @mbg.generated
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.article
	 * @mbg.generated
	 */
	public ArticleExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.article
	 * @mbg.generated
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.article
	 * @mbg.generated
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.article
	 * @mbg.generated
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.article
	 * @mbg.generated
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.article
	 * @mbg.generated
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.article
	 * @mbg.generated
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.article
	 * @mbg.generated
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.article
	 * @mbg.generated
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.article
	 * @mbg.generated
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.article
	 * @mbg.generated
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table public.article
	 * @mbg.generated
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

		public Criteria andTitleIsNull() {
			addCriterion("title is null");
			return (Criteria) this;
		}

		public Criteria andTitleIsNotNull() {
			addCriterion("title is not null");
			return (Criteria) this;
		}

		public Criteria andTitleEqualTo(String value) {
			addCriterion("title =", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotEqualTo(String value) {
			addCriterion("title <>", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleGreaterThan(String value) {
			addCriterion("title >", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleGreaterThanOrEqualTo(String value) {
			addCriterion("title >=", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleLessThan(String value) {
			addCriterion("title <", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleLessThanOrEqualTo(String value) {
			addCriterion("title <=", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleLike(String value) {
			addCriterion("title like", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotLike(String value) {
			addCriterion("title not like", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleIn(List<String> values) {
			addCriterion("title in", values, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotIn(List<String> values) {
			addCriterion("title not in", values, "title");
			return (Criteria) this;
		}

		public Criteria andTitleBetween(String value1, String value2) {
			addCriterion("title between", value1, value2, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotBetween(String value1, String value2) {
			addCriterion("title not between", value1, value2, "title");
			return (Criteria) this;
		}

		public Criteria andMarksIsNull() {
			addCriterion("marks is null");
			return (Criteria) this;
		}

		public Criteria andMarksIsNotNull() {
			addCriterion("marks is not null");
			return (Criteria) this;
		}

		public Criteria andMarksEqualTo(Integer value) {
			addCriterion("marks =", value, "marks");
			return (Criteria) this;
		}

		public Criteria andMarksNotEqualTo(Integer value) {
			addCriterion("marks <>", value, "marks");
			return (Criteria) this;
		}

		public Criteria andMarksGreaterThan(Integer value) {
			addCriterion("marks >", value, "marks");
			return (Criteria) this;
		}

		public Criteria andMarksGreaterThanOrEqualTo(Integer value) {
			addCriterion("marks >=", value, "marks");
			return (Criteria) this;
		}

		public Criteria andMarksLessThan(Integer value) {
			addCriterion("marks <", value, "marks");
			return (Criteria) this;
		}

		public Criteria andMarksLessThanOrEqualTo(Integer value) {
			addCriterion("marks <=", value, "marks");
			return (Criteria) this;
		}

		public Criteria andMarksIn(List<Integer> values) {
			addCriterion("marks in", values, "marks");
			return (Criteria) this;
		}

		public Criteria andMarksNotIn(List<Integer> values) {
			addCriterion("marks not in", values, "marks");
			return (Criteria) this;
		}

		public Criteria andMarksBetween(Integer value1, Integer value2) {
			addCriterion("marks between", value1, value2, "marks");
			return (Criteria) this;
		}

		public Criteria andMarksNotBetween(Integer value1, Integer value2) {
			addCriterion("marks not between", value1, value2, "marks");
			return (Criteria) this;
		}

		public Criteria andContentIsNull() {
			addCriterion("content is null");
			return (Criteria) this;
		}

		public Criteria andContentIsNotNull() {
			addCriterion("content is not null");
			return (Criteria) this;
		}

		public Criteria andContentEqualTo(String value) {
			addCriterion("content =", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentNotEqualTo(String value) {
			addCriterion("content <>", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentGreaterThan(String value) {
			addCriterion("content >", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentGreaterThanOrEqualTo(String value) {
			addCriterion("content >=", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentLessThan(String value) {
			addCriterion("content <", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentLessThanOrEqualTo(String value) {
			addCriterion("content <=", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentLike(String value) {
			addCriterion("content like", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentNotLike(String value) {
			addCriterion("content not like", value, "content");
			return (Criteria) this;
		}

		public Criteria andContentIn(List<String> values) {
			addCriterion("content in", values, "content");
			return (Criteria) this;
		}

		public Criteria andContentNotIn(List<String> values) {
			addCriterion("content not in", values, "content");
			return (Criteria) this;
		}

		public Criteria andContentBetween(String value1, String value2) {
			addCriterion("content between", value1, value2, "content");
			return (Criteria) this;
		}

		public Criteria andContentNotBetween(String value1, String value2) {
			addCriterion("content not between", value1, value2, "content");
			return (Criteria) this;
		}

		public Criteria andBrowseIsNull() {
			addCriterion("browse is null");
			return (Criteria) this;
		}

		public Criteria andBrowseIsNotNull() {
			addCriterion("browse is not null");
			return (Criteria) this;
		}

		public Criteria andBrowseEqualTo(Integer value) {
			addCriterion("browse =", value, "browse");
			return (Criteria) this;
		}

		public Criteria andBrowseNotEqualTo(Integer value) {
			addCriterion("browse <>", value, "browse");
			return (Criteria) this;
		}

		public Criteria andBrowseGreaterThan(Integer value) {
			addCriterion("browse >", value, "browse");
			return (Criteria) this;
		}

		public Criteria andBrowseGreaterThanOrEqualTo(Integer value) {
			addCriterion("browse >=", value, "browse");
			return (Criteria) this;
		}

		public Criteria andBrowseLessThan(Integer value) {
			addCriterion("browse <", value, "browse");
			return (Criteria) this;
		}

		public Criteria andBrowseLessThanOrEqualTo(Integer value) {
			addCriterion("browse <=", value, "browse");
			return (Criteria) this;
		}

		public Criteria andBrowseIn(List<Integer> values) {
			addCriterion("browse in", values, "browse");
			return (Criteria) this;
		}

		public Criteria andBrowseNotIn(List<Integer> values) {
			addCriterion("browse not in", values, "browse");
			return (Criteria) this;
		}

		public Criteria andBrowseBetween(Integer value1, Integer value2) {
			addCriterion("browse between", value1, value2, "browse");
			return (Criteria) this;
		}

		public Criteria andBrowseNotBetween(Integer value1, Integer value2) {
			addCriterion("browse not between", value1, value2, "browse");
			return (Criteria) this;
		}

		public Criteria andCreate_dateIsNull() {
			addCriterion("create_date is null");
			return (Criteria) this;
		}

		public Criteria andCreate_dateIsNotNull() {
			addCriterion("create_date is not null");
			return (Criteria) this;
		}

		public Criteria andCreate_dateEqualTo(Date value) {
			addCriterion("create_date =", value, "create_date");
			return (Criteria) this;
		}

		public Criteria andCreate_dateNotEqualTo(Date value) {
			addCriterion("create_date <>", value, "create_date");
			return (Criteria) this;
		}

		public Criteria andCreate_dateGreaterThan(Date value) {
			addCriterion("create_date >", value, "create_date");
			return (Criteria) this;
		}

		public Criteria andCreate_dateGreaterThanOrEqualTo(Date value) {
			addCriterion("create_date >=", value, "create_date");
			return (Criteria) this;
		}

		public Criteria andCreate_dateLessThan(Date value) {
			addCriterion("create_date <", value, "create_date");
			return (Criteria) this;
		}

		public Criteria andCreate_dateLessThanOrEqualTo(Date value) {
			addCriterion("create_date <=", value, "create_date");
			return (Criteria) this;
		}

		public Criteria andCreate_dateIn(List<Date> values) {
			addCriterion("create_date in", values, "create_date");
			return (Criteria) this;
		}

		public Criteria andCreate_dateNotIn(List<Date> values) {
			addCriterion("create_date not in", values, "create_date");
			return (Criteria) this;
		}

		public Criteria andCreate_dateBetween(Date value1, Date value2) {
			addCriterion("create_date between", value1, value2, "create_date");
			return (Criteria) this;
		}

		public Criteria andCreate_dateNotBetween(Date value1, Date value2) {
			addCriterion("create_date not between", value1, value2, "create_date");
			return (Criteria) this;
		}

		public Criteria andModify_dateIsNull() {
			addCriterion("modify_date is null");
			return (Criteria) this;
		}

		public Criteria andModify_dateIsNotNull() {
			addCriterion("modify_date is not null");
			return (Criteria) this;
		}

		public Criteria andModify_dateEqualTo(Date value) {
			addCriterion("modify_date =", value, "modify_date");
			return (Criteria) this;
		}

		public Criteria andModify_dateNotEqualTo(Date value) {
			addCriterion("modify_date <>", value, "modify_date");
			return (Criteria) this;
		}

		public Criteria andModify_dateGreaterThan(Date value) {
			addCriterion("modify_date >", value, "modify_date");
			return (Criteria) this;
		}

		public Criteria andModify_dateGreaterThanOrEqualTo(Date value) {
			addCriterion("modify_date >=", value, "modify_date");
			return (Criteria) this;
		}

		public Criteria andModify_dateLessThan(Date value) {
			addCriterion("modify_date <", value, "modify_date");
			return (Criteria) this;
		}

		public Criteria andModify_dateLessThanOrEqualTo(Date value) {
			addCriterion("modify_date <=", value, "modify_date");
			return (Criteria) this;
		}

		public Criteria andModify_dateIn(List<Date> values) {
			addCriterion("modify_date in", values, "modify_date");
			return (Criteria) this;
		}

		public Criteria andModify_dateNotIn(List<Date> values) {
			addCriterion("modify_date not in", values, "modify_date");
			return (Criteria) this;
		}

		public Criteria andModify_dateBetween(Date value1, Date value2) {
			addCriterion("modify_date between", value1, value2, "modify_date");
			return (Criteria) this;
		}

		public Criteria andModify_dateNotBetween(Date value1, Date value2) {
			addCriterion("modify_date not between", value1, value2, "modify_date");
			return (Criteria) this;
		}

		public Criteria andEnable_editIsNull() {
			addCriterion("enable_edit is null");
			return (Criteria) this;
		}

		public Criteria andEnable_editIsNotNull() {
			addCriterion("enable_edit is not null");
			return (Criteria) this;
		}

		public Criteria andEnable_editEqualTo(Boolean value) {
			addCriterion("enable_edit =", value, "enable_edit");
			return (Criteria) this;
		}

		public Criteria andEnable_editNotEqualTo(Boolean value) {
			addCriterion("enable_edit <>", value, "enable_edit");
			return (Criteria) this;
		}

		public Criteria andEnable_editGreaterThan(Boolean value) {
			addCriterion("enable_edit >", value, "enable_edit");
			return (Criteria) this;
		}

		public Criteria andEnable_editGreaterThanOrEqualTo(Boolean value) {
			addCriterion("enable_edit >=", value, "enable_edit");
			return (Criteria) this;
		}

		public Criteria andEnable_editLessThan(Boolean value) {
			addCriterion("enable_edit <", value, "enable_edit");
			return (Criteria) this;
		}

		public Criteria andEnable_editLessThanOrEqualTo(Boolean value) {
			addCriterion("enable_edit <=", value, "enable_edit");
			return (Criteria) this;
		}

		public Criteria andEnable_editIn(List<Boolean> values) {
			addCriterion("enable_edit in", values, "enable_edit");
			return (Criteria) this;
		}

		public Criteria andEnable_editNotIn(List<Boolean> values) {
			addCriterion("enable_edit not in", values, "enable_edit");
			return (Criteria) this;
		}

		public Criteria andEnable_editBetween(Boolean value1, Boolean value2) {
			addCriterion("enable_edit between", value1, value2, "enable_edit");
			return (Criteria) this;
		}

		public Criteria andEnable_editNotBetween(Boolean value1, Boolean value2) {
			addCriterion("enable_edit not between", value1, value2, "enable_edit");
			return (Criteria) this;
		}

		public Criteria andChannel_idIsNull() {
			addCriterion("channel_id is null");
			return (Criteria) this;
		}

		public Criteria andChannel_idIsNotNull() {
			addCriterion("channel_id is not null");
			return (Criteria) this;
		}

		public Criteria andChannel_idEqualTo(Integer value) {
			addCriterion("channel_id =", value, "channel_id");
			return (Criteria) this;
		}

		public Criteria andChannel_idNotEqualTo(Integer value) {
			addCriterion("channel_id <>", value, "channel_id");
			return (Criteria) this;
		}

		public Criteria andChannel_idGreaterThan(Integer value) {
			addCriterion("channel_id >", value, "channel_id");
			return (Criteria) this;
		}

		public Criteria andChannel_idGreaterThanOrEqualTo(Integer value) {
			addCriterion("channel_id >=", value, "channel_id");
			return (Criteria) this;
		}

		public Criteria andChannel_idLessThan(Integer value) {
			addCriterion("channel_id <", value, "channel_id");
			return (Criteria) this;
		}

		public Criteria andChannel_idLessThanOrEqualTo(Integer value) {
			addCriterion("channel_id <=", value, "channel_id");
			return (Criteria) this;
		}

		public Criteria andChannel_idIn(List<Integer> values) {
			addCriterion("channel_id in", values, "channel_id");
			return (Criteria) this;
		}

		public Criteria andChannel_idNotIn(List<Integer> values) {
			addCriterion("channel_id not in", values, "channel_id");
			return (Criteria) this;
		}

		public Criteria andChannel_idBetween(Integer value1, Integer value2) {
			addCriterion("channel_id between", value1, value2, "channel_id");
			return (Criteria) this;
		}

		public Criteria andChannel_idNotBetween(Integer value1, Integer value2) {
			addCriterion("channel_id not between", value1, value2, "channel_id");
			return (Criteria) this;
		}

		public Criteria andCreated_accountIsNull() {
			addCriterion("created_account is null");
			return (Criteria) this;
		}

		public Criteria andCreated_accountIsNotNull() {
			addCriterion("created_account is not null");
			return (Criteria) this;
		}

		public Criteria andCreated_accountEqualTo(Integer value) {
			addCriterion("created_account =", value, "created_account");
			return (Criteria) this;
		}

		public Criteria andCreated_accountNotEqualTo(Integer value) {
			addCriterion("created_account <>", value, "created_account");
			return (Criteria) this;
		}

		public Criteria andCreated_accountGreaterThan(Integer value) {
			addCriterion("created_account >", value, "created_account");
			return (Criteria) this;
		}

		public Criteria andCreated_accountGreaterThanOrEqualTo(Integer value) {
			addCriterion("created_account >=", value, "created_account");
			return (Criteria) this;
		}

		public Criteria andCreated_accountLessThan(Integer value) {
			addCriterion("created_account <", value, "created_account");
			return (Criteria) this;
		}

		public Criteria andCreated_accountLessThanOrEqualTo(Integer value) {
			addCriterion("created_account <=", value, "created_account");
			return (Criteria) this;
		}

		public Criteria andCreated_accountIn(List<Integer> values) {
			addCriterion("created_account in", values, "created_account");
			return (Criteria) this;
		}

		public Criteria andCreated_accountNotIn(List<Integer> values) {
			addCriterion("created_account not in", values, "created_account");
			return (Criteria) this;
		}

		public Criteria andCreated_accountBetween(Integer value1, Integer value2) {
			addCriterion("created_account between", value1, value2, "created_account");
			return (Criteria) this;
		}

		public Criteria andCreated_accountNotBetween(Integer value1, Integer value2) {
			addCriterion("created_account not between", value1, value2, "created_account");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table public.article
	 * @mbg.generated
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table public.article
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}