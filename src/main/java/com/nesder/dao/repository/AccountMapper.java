package com.nesder.dao.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.nesder.dao.entity.Account;
import com.nesder.dao.entity.AccountExample;

public interface AccountMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.account
	 * @mbg.generated
	 */
	long countByExample(AccountExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.account
	 * @mbg.generated
	 */
	int deleteByExample(AccountExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.account
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.account
	 * @mbg.generated
	 */
	int insert(Account record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.account
	 * @mbg.generated
	 */
	int insertSelective(Account record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.account
	 * @mbg.generated
	 */
	List<Account> selectByExample(AccountExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.account
	 * @mbg.generated
	 */
	Account selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.account
	 * @mbg.generated
	 */
	int updateByExampleSelective(@Param("record") Account record, @Param("example") AccountExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.account
	 * @mbg.generated
	 */
	int updateByExample(@Param("record") Account record, @Param("example") AccountExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.account
	 * @mbg.generated
	 */
	int updateByPrimaryKeySelective(Account record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table public.account
	 * @mbg.generated
	 */
	int updateByPrimaryKey(Account record);
}