package com.bec.cloud.baodanxitong.web.customer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bec.cloud.baodanxitong.web.customer.dao.CustomerMapper;
import com.bec.cloud.baodanxitong.web.customer.model.Customer;
import com.bec.cloud.baodanxitong.web.customer.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerMapper mapper;

	@Override
	public int deleteByPrimaryKey(Long custId) {
		return mapper.deleteByPrimaryKey(custId);
	}

	@Override
	public int insert(Customer record) {
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(Customer record) {
		return mapper.insertSelective(record);
	}

	@Override
	public Customer selectByPrimaryKey(Long custId) {
		return mapper.selectByPrimaryKey(custId);
	}

	@Override
	public int updateByPrimaryKeySelective(Customer record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Customer record) {
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public List<Customer> selectustCustomers(Customer record) {
		return mapper.selectustCustomers(record);
	}

}
