package com.nesder.dao.repository;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.nesder.dao.entity.ChatGroup;
import com.nesder.dao.entity.ChatGroupExample;

public interface ChatGroupMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.chat_group
	 * @mbg.generated
	 */
	long countByExample(ChatGroupExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.chat_group
	 * @mbg.generated
	 */
	int deleteByExample(ChatGroupExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.chat_group
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.chat_group
	 * @mbg.generated
	 */
	int insert(ChatGroup record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.chat_group
	 * @mbg.generated
	 */
	int insertSelective(ChatGroup record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.chat_group
	 * @mbg.generated
	 */
	List<ChatGroup> selectByExample(ChatGroupExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.chat_group
	 * @mbg.generated
	 */
	ChatGroup selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.chat_group
	 * @mbg.generated
	 */
	int updateByExampleSelective(@Param("record") ChatGroup record, @Param("example") ChatGroupExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.chat_group
	 * @mbg.generated
	 */
	int updateByExample(@Param("record") ChatGroup record, @Param("example") ChatGroupExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.chat_group
	 * @mbg.generated
	 */
	int updateByPrimaryKeySelective(ChatGroup record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.chat_group
	 * @mbg.generated
	 */
	int updateByPrimaryKey(ChatGroup record);
}