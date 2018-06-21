package com.bec.cloud.baodanxitong.web.customer.service.crud.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bec.cloud.baodanxitong.web.customer.dao.CustSettleAccountModifyMapper;
import com.bec.cloud.baodanxitong.web.customer.model.CustSettleAccountModify;
import com.bec.cloud.baodanxitong.web.customer.service.crud.CustSettleAccountModifyService;

@Service
public class CustSettleAccountModifyServiceImp implements CustSettleAccountModifyService {
	
	@Autowired
	private CustSettleAccountModifyMapper mapper;

	@Override
	public int deleteByPrimaryKey(Long accountId) {
		return mapper.deleteByPrimaryKey(accountId);
	}

	@Override
	public int insert(CustSettleAccountModify record) {
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(CustSettleAccountModify record) {
		return mapper.insertSelective(record);
	}

	@Override
	public CustSettleAccountModify selectByPrimaryKey(Long accountId) {
		return mapper.selectByPrimaryKey(accountId);
	}

	@Override
	public int updateByPrimaryKeySelective(CustSettleAccountModify record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CustSettleAccountModify record) {
		return mapper.updateByPrimaryKey(record);
	}

}
