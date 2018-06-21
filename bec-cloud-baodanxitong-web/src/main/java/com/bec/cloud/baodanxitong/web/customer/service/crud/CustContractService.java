package com.bec.cloud.baodanxitong.web.customer.service.crud;

import java.util.List;

import com.bec.cloud.baodanxitong.web.customer.model.CustContract;

public interface CustContractService {
	int deleteByPrimaryKey(Long contId);

    int insert(CustContract record);

    int insertSelective(CustContract record);

    CustContract selectByPrimaryKey(Long contId);

    int updateByPrimaryKeySelective(CustContract record);

    int updateByPrimaryKey(CustContract record);
    
    List<CustContract> selectCustContracts(CustContract record);
}
