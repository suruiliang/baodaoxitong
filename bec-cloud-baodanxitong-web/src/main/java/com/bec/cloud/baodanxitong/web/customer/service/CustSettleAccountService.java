package com.bec.cloud.baodanxitong.web.customer.service;

import com.bec.cloud.baodanxitong.web.customer.model.CustSettleAccount;

public interface CustSettleAccountService {
	int deleteByPrimaryKey(Long accountId);

    int insert(CustSettleAccount record);

    int insertSelective(CustSettleAccount record);

    CustSettleAccount selectByPrimaryKey(Long accountId);

    int updateByPrimaryKeySelective(CustSettleAccount record);

    int updateByPrimaryKey(CustSettleAccount record);
}
