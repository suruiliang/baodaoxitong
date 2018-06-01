package com.bec.cloud.baodanxitong.web.dict.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bec.cloud.baodanxitong.web.dict.dao.CnapsBankMapper;
import com.bec.cloud.baodanxitong.web.dict.model.CnapsBank;
import com.bec.cloud.baodanxitong.web.dict.service.CnapsBankService;

@Service
public class CnapsBankServiceImpl implements CnapsBankService {
	
	@Autowired
	private CnapsBankMapper mapper;

	@Override
	public int deleteByPrimaryKey(String bankcode) {
		return mapper.deleteByPrimaryKey(bankcode);
	}

	@Override
	public int insert(CnapsBank record) {
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(CnapsBank record) {
		return mapper.insertSelective(record);
	}

	@Override
	public CnapsBank selectByPrimaryKey(String bankcode) {
		return mapper.selectByPrimaryKey(bankcode);
	}

	@Override
	public int updateByPrimaryKeySelective(CnapsBank record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CnapsBank record) {
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public List<CnapsBank> selectCnapsBank(CnapsBank record) {
		return mapper.selectCnapsBank(record);
	}

}
