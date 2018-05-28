package com.bec.cloud.baodanxitong.web.customer.service;

import com.bec.cloud.baodanxitong.web.customer.model.CustSettleAccountModify;

public interface CustSettleAccountModifyService {
	int deleteByPrimaryKey(Long accountId);

    int insert(CustSettleAccountModify record);

    int insertSelective(CustSettleAccountModify record);

    CustSettleAccountModify selectByPrimaryKey(Long accountId);

    int updateByPrimaryKeySelective(CustSettleAccountModify record);

    int updateByPrimaryKey(CustSettleAccountModify record);
}
