package com.bec.cloud.baodanxitong.web.customer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bec.cloud.baodanxitong.web.customer.dao.CustContractMapper;
import com.bec.cloud.baodanxitong.web.customer.model.CustContract;
import com.bec.cloud.baodanxitong.web.customer.service.CustContractService;

/**
 * 
 * @author niwei
 * @time   2018下午2:38:35
 * @description
 */
@Service
public class CustContractServiceImpl implements CustContractService {
	
	@Autowired
	private CustContractMapper mapper;
	
	@Override
	public int deleteByPrimaryKey(Long contId) {
		return mapper.deleteByPrimaryKey(contId);
	}

	@Override
	public int insert(CustContract record) {
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(CustContract record) {
		return mapper.insertSelective(record);
	}

	@Override
	public CustContract selectByPrimaryKey(Long contId) {
		return mapper.selectByPrimaryKey(contId);
	}

	@Override
	public int updateByPrimaryKeySelective(CustContract record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CustContract record) {
		return 0;
	}

}
