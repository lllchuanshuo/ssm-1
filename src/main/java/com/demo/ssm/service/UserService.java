package com.demo.ssm.service;

import com.demo.ssm.model.User;

public interface UserService {
	/**
	 * 根据主键删除用户
	 * 
	 * @param id
	 * @return
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * 添加用户
	 * 
	 * @param record
	 * @return
	 */
	int insert(User record);

	/**
	 * 添加用户，以空为判断
	 * 
	 * @param record
	 * @return
	 */
	int insertSelective(User record);

	/**
	 * 根据主键查询用户
	 * 
	 * @param id
	 * @return
	 */
	User selectByPrimaryKey(Integer id);

	/**
	 * 根据主键添加用户，以空为判断
	 * 
	 * @param record
	 * @return
	 */
	int updateByPrimaryKeySelective(User record);

	/**
	 * 根据主键添加用户
	 * 
	 * @param record
	 * @return
	 */
	int updateByPrimaryKey(User record);
}
