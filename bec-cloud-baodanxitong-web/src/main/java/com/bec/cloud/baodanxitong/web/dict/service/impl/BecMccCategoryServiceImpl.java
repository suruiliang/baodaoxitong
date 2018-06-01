package com.bec.cloud.baodanxitong.web.dict.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bec.cloud.baodanxitong.web.dict.dao.BecMccCategoryMapper;
import com.bec.cloud.baodanxitong.web.dict.model.BecMccCategory;
import com.bec.cloud.baodanxitong.web.dict.service.BecMccCategoryService;

@Service
public class BecMccCategoryServiceImpl implements BecMccCategoryService {
	
	@Autowired
	private BecMccCategoryMapper mapper;

	@Override
	public int deleteByPrimaryKey(Integer categoryId) {
		return mapper.deleteByPrimaryKey(categoryId);
	}

	@Override
	public int insert(BecMccCategory record) {
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(BecMccCategory record) {
		return mapper.insertSelective(record);
	}

	@Override
	public BecMccCategory selectByPrimaryKey(Integer categoryId) {
		return mapper.selectByPrimaryKey(categoryId);
	}

	@Override
	public int updateByPrimaryKeySelective(BecMccCategory record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(BecMccCategory record) {
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public List<BecMccCategory> selectBecMccCategory(BecMccCategory record) {
		
		return mapper.selectBecMccCategory(record);
	}

}
