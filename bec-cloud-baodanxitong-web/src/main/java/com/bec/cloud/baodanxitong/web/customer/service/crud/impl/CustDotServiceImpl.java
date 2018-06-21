package com.bec.cloud.baodanxitong.web.customer.service.crud.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bec.cloud.baodanxitong.web.customer.dao.CustDotMapper;
import com.bec.cloud.baodanxitong.web.customer.model.CustDot;
import com.bec.cloud.baodanxitong.web.customer.service.crud.CustDotService;

@Service
public class CustDotServiceImpl implements CustDotService {
	
	@Autowired
	private CustDotMapper mapper;

	@Override
	public int deleteByPrimaryKey(Long dotId) {
		return mapper.deleteByPrimaryKey(dotId);
	}

	@Override
	public int insert(CustDot record) {
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(CustDot record) {
		return mapper.insertSelective(record);
	}

	@Override
	public CustDot selectByPrimaryKey(Long dotId) {
		return mapper.selectByPrimaryKey(dotId);
	}

	@Override
	public int updateByPrimaryKeySelective(CustDot record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CustDot record) {
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public List<CustDot> selectCustDots(CustDot record) {
		return mapper.selectCustDots(record);
	}

}
