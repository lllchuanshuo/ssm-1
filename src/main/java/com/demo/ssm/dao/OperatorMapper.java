package com.demo.ssm.dao;

import com.demo.ssm.model.Operator;

public interface OperatorMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(Operator record);

	int insertSelective(Operator record);

	Operator selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Operator record);

	int updateByPrimaryKey(Operator record);
}