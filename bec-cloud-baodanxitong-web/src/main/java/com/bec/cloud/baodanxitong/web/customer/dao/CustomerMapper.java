package com.bec.cloud.baodanxitong.web.customer.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.bec.cloud.baodanxitong.web.customer.model.Customer;
import com.bec.cloud.baodanxitong.web.customer.model.resp.CustBaseDetailResp;
import com.bec.cloud.baodanxitong.web.customer.model.resp.CustBaseSimpleResp;

@Mapper
public interface CustomerMapper {
    int deleteByPrimaryKey(Long custId);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(Long custId);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);

	List<Customer> selectCustCustomers(Customer record);

	List<CustBaseSimpleResp> selectCustBaseResp(CustBaseSimpleResp record);

	CustBaseDetailResp selectCustBaseDetailRespByPrimaryKey(Long custId);

}