package com.bec.cloud.baodanxitong.web.customer.service.crud.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bec.cloud.baodanxitong.web.customer.dao.CustContractModifyMapper;
import com.bec.cloud.baodanxitong.web.customer.model.CustContractModify;
import com.bec.cloud.baodanxitong.web.customer.service.crud.CustContractModifyService;

/**
 * 
 * @author niwei
 * @time   2018下午2:52:26
 * @description
 */
@Service
public class CustContractModifyServiceImpl implements CustContractModifyService {
	
	@Autowired
	private CustContractModifyMapper mapper;

	@Override
	public int deleteByPrimaryKey(Long contId) {
		return mapper.deleteByPrimaryKey(contId);
	}

	@Override
	public int insert(CustContractModify record) {
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(CustContractModify record) {
		return mapper.insertSelective(record);
	}

	@Override
	public CustContractModify selectByPrimaryKey(Long contId) {
		return mapper.selectByPrimaryKey(contId);
	}

	@Override
	public int updateByPrimaryKeySelective(CustContractModify record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CustContractModify record) {
		return mapper.updateByPrimaryKey(record);
	}

}
