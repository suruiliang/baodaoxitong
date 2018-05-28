package com.bec.cloud.baodanxitong.web.dict.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bec.cloud.baodanxitong.web.dict.dao.BecMccMapper;
import com.bec.cloud.baodanxitong.web.dict.model.BecMcc;
import com.bec.cloud.baodanxitong.web.dict.service.BecMccService;

@Service
public class BecMccServiceImpl implements BecMccService {
	
	@Autowired
	private BecMccMapper mapper;

	@Override
	public int deleteByPrimaryKey(Integer categoryId) {
		return mapper.deleteByPrimaryKey(categoryId);
	}

	@Override
	public int insert(BecMcc record) {
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(BecMcc record) {
		return mapper.insertSelective(record);
	}

	@Override
	public BecMcc selectByPrimaryKey(Integer categoryId) {
		return mapper.selectByPrimaryKey(categoryId);
	}

	@Override
	public int updateByPrimaryKeySelective(BecMcc record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(BecMcc record) {
		return mapper.updateByPrimaryKey(record);
	}

}
