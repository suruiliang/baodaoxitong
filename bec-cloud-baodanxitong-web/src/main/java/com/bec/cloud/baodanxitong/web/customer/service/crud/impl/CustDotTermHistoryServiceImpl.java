package com.bec.cloud.baodanxitong.web.customer.service.crud.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bec.cloud.baodanxitong.web.customer.dao.CustDotTermHistoryMapper;
import com.bec.cloud.baodanxitong.web.customer.model.CustDotTermHistory;
import com.bec.cloud.baodanxitong.web.customer.service.crud.CustDotTermHistoryService;

@Service
public class CustDotTermHistoryServiceImpl implements CustDotTermHistoryService {
	
	@Autowired
	private CustDotTermHistoryMapper mapper;

	@Override
	public int deleteByPrimaryKey(Long dtId) {
		return mapper.deleteByPrimaryKey(dtId);
	}

	@Override
	public int insert(CustDotTermHistory record) {
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(CustDotTermHistory record) {
		return mapper.insertSelective(record);
	}

	@Override
	public CustDotTermHistory selectByPrimaryKey(Long dtId) {
		return mapper.selectByPrimaryKey(dtId);
	}

	@Override
	public int updateByPrimaryKeySelective(CustDotTermHistory record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CustDotTermHistory record) {
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public List<CustDotTermHistory> selectustCustDotTermHistorys(CustDotTermHistory info) {
		return mapper.selectustCustDotTermHistorys(info);
	}

}
