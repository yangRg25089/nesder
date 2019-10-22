package com.nesder.dao.repository;

import com.nesder.dao.domain.ChatContent;
import com.nesder.dao.domain.ChatContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChatContentMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.chat_content
	 * @mbg.generated
	 */
	long countByExample(ChatContentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.chat_content
	 * @mbg.generated
	 */
	int deleteByExample(ChatContentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.chat_content
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.chat_content
	 * @mbg.generated
	 */
	int insert(ChatContent record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.chat_content
	 * @mbg.generated
	 */
	int insertSelective(ChatContent record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.chat_content
	 * @mbg.generated
	 */
	List<ChatContent> selectByExample(ChatContentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.chat_content
	 * @mbg.generated
	 */
	ChatContent selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.chat_content
	 * @mbg.generated
	 */
	int updateByExampleSelective(@Param("record") ChatContent record, @Param("example") ChatContentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.chat_content
	 * @mbg.generated
	 */
	int updateByExample(@Param("record") ChatContent record, @Param("example") ChatContentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.chat_content
	 * @mbg.generated
	 */
	int updateByPrimaryKeySelective(ChatContent record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.chat_content
	 * @mbg.generated
	 */
	int updateByPrimaryKey(ChatContent record);
}