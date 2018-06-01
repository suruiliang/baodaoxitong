package com.bec.cloud.baodanxitong.web.customer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bec.cloud.baodanxitong.web.customer.dao.CustSettleAccountMapper;
import com.bec.cloud.baodanxitong.web.customer.model.CustSettleAccount;
import com.bec.cloud.baodanxitong.web.customer.service.CustSettleAccountService;

@Service
public class CustSettleAccountServiceImpl implements CustSettleAccountService {
	
	@Autowired
	private CustSettleAccountMapper mapper;

	@Override
	public int deleteByPrimaryKey(Long accountId) {
		return mapper.deleteByPrimaryKey(accountId);
	}

	@Override
	public int insert(CustSettleAccount record) {
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(CustSettleAccount record) {
		return mapper.insertSelective(record);
	}

	@Override
	public CustSettleAccount selectByPrimaryKey(Long accountId) {
		return mapper.selectByPrimaryKey(accountId);
	}

	@Override
	public int updateByPrimaryKeySelective(CustSettleAccount record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CustSettleAccount record) {
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public List<CustSettleAccount> selectustCustSettleAccounts(CustSettleAccount info) {
		return mapper.selectustCustSettleAccounts(info);
	}

}
