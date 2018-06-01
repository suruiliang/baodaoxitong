package com.bec.cloud.baodanxitong.web.customer.service;

import java.util.List;

import com.bec.cloud.baodanxitong.web.customer.model.Customer;

public interface CustomerService {
	int deleteByPrimaryKey(Long custId);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(Long custId);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);

	List<Customer> selectustCustomers(Customer record);
}
