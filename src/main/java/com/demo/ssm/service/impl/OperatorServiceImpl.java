package com.demo.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.ssm.dao.OperatorMapper;
import com.demo.ssm.model.Operator;
import com.demo.ssm.service.OperatorService;

@Service("operatorService")
public class OperatorServiceImpl implements OperatorService {
	@Autowired
	private OperatorMapper operatorMapper;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return operatorMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Operator record) {
		return operatorMapper.insert(record);
	}

	@Override
	public int insertSelective(Operator record) {
		return operatorMapper.insertSelective(record);
	}

	@Override
	public Operator selectByPrimaryKey(Integer id) {
		return operatorMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(Operator record) {
		return operatorMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Operator record) {
		return operatorMapper.updateByPrimaryKey(record);
	}

}
