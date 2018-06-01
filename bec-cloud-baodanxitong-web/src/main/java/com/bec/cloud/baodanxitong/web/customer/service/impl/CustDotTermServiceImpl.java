package com.bec.cloud.baodanxitong.web.customer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bec.cloud.baodanxitong.web.customer.dao.CustDotTermMapper;
import com.bec.cloud.baodanxitong.web.customer.model.CustDot;
import com.bec.cloud.baodanxitong.web.customer.model.CustDotTerm;
import com.bec.cloud.baodanxitong.web.customer.service.CustDotTermService;

@Service
public class CustDotTermServiceImpl implements CustDotTermService {
	
	@Autowired
	private CustDotTermMapper mapper;

	@Override
	public int deleteByPrimaryKey(Long dtId) {
		return mapper.deleteByPrimaryKey(dtId);
	}

	@Override
	public int insert(CustDotTerm record) {
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(CustDotTerm record) {
		return mapper.insertSelective(record);
	}

	@Override
	public CustDotTerm selectByPrimaryKey(Long dtId) {
		return mapper.selectByPrimaryKey(dtId);
	}

	@Override
	public int updateByPrimaryKeySelective(CustDotTerm record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CustDotTerm record) {
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public List<CustDotTerm> selectustDotTerms(CustDot custDot) {
		return mapper.selectustDotTerms(custDot);
	}

}
