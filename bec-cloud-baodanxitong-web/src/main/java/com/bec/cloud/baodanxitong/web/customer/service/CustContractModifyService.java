package com.bec.cloud.baodanxitong.web.customer.service;

import com.bec.cloud.baodanxitong.web.customer.model.CustContractModify;

public interface CustContractModifyService {
	int deleteByPrimaryKey(Long contId);

    int insert(CustContractModify record);

    int insertSelective(CustContractModify record);

    CustContractModify selectByPrimaryKey(Long contId);

    int updateByPrimaryKeySelective(CustContractModify record);

    int updateByPrimaryKey(CustContractModify record);
}
