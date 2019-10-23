package com.nesder.dao.entity;

import java.util.Date;

public class Reply {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.reply.id
	 * @mbg.generated
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.reply.content
	 * @mbg.generated
	 */
	private String content;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.reply.create_date
	 * @mbg.generated
	 */
	private Date create_date;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.reply.modify_date
	 * @mbg.generated
	 */
	private Date modify_date;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.reply.aid
	 * @mbg.generated
	 */
	private Integer aid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column public.reply.uid
	 * @mbg.generated
	 */
	private Integer uid;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.reply.id
	 * @return  the value of public.reply.id
	 * @mbg.generated
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.reply.id
	 * @param id  the value for public.reply.id
	 * @mbg.generated
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.reply.content
	 * @return  the value of public.reply.content
	 * @mbg.generated
	 */
	public String getContent() {
		return content;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.reply.content
	 * @param content  the value for public.reply.content
	 * @mbg.generated
	 */
	public void setContent(String content) {
		this.content = content == null ? null : content.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.reply.create_date
	 * @return  the value of public.reply.create_date
	 * @mbg.generated
	 */
	public Date getCreate_date() {
		return create_date;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.reply.create_date
	 * @param create_date  the value for public.reply.create_date
	 * @mbg.generated
	 */
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.reply.modify_date
	 * @return  the value of public.reply.modify_date
	 * @mbg.generated
	 */
	public Date getModify_date() {
		return modify_date;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.reply.modify_date
	 * @param modify_date  the value for public.reply.modify_date
	 * @mbg.generated
	 */
	public void setModify_date(Date modify_date) {
		this.modify_date = modify_date;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.reply.aid
	 * @return  the value of public.reply.aid
	 * @mbg.generated
	 */
	public Integer getAid() {
		return aid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.reply.aid
	 * @param aid  the value for public.reply.aid
	 * @mbg.generated
	 */
	public void setAid(Integer aid) {
		this.aid = aid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column public.reply.uid
	 * @return  the value of public.reply.uid
	 * @mbg.generated
	 */
	public Integer getUid() {
		return uid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column public.reply.uid
	 * @param uid  the value for public.reply.uid
	 * @mbg.generated
	 */
	public void setUid(Integer uid) {
		this.uid = uid;
	}
}