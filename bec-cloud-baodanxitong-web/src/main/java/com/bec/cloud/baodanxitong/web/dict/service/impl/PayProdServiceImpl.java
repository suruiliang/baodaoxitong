package com.bec.cloud.baodanxitong.web.dict.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bec.cloud.baodanxitong.web.dict.dao.PayProdMapper;
import com.bec.cloud.baodanxitong.web.dict.model.PayProd;
import com.bec.cloud.baodanxitong.web.dict.service.PayProdService;

@Service
public class PayProdServiceImpl implements PayProdService {
	
	@Autowired
	private PayProdMapper mapper;

	@Override
	public int deleteByPrimaryKey(Integer prodId) {
		return mapper.deleteByPrimaryKey(prodId);
	}

	@Override
	public int insert(PayProd record) {
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(PayProd record) {
		return mapper.insertSelective(record);
	}

	@Override
	public PayProd selectByPrimaryKey(Integer prodId) {
		return mapper.selectByPrimaryKey(prodId);
	}

	@Override
	public int updateByPrimaryKeySelective(PayProd record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(PayProd record) {
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public List<PayProd> selectPayProd(PayProd record) {
		return mapper.selectPayProd(record);
	}

}
