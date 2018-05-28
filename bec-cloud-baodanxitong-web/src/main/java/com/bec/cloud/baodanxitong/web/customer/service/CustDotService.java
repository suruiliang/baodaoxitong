package com.bec.cloud.baodanxitong.web.customer.service;

import com.bec.cloud.baodanxitong.web.customer.model.CustDot;

public interface CustDotService {
	int deleteByPrimaryKey(Long dotId);

    int insert(CustDot record);

    int insertSelective(CustDot record);

    CustDot selectByPrimaryKey(Long dotId);

    int updateByPrimaryKeySelective(CustDot record);

    int updateByPrimaryKey(CustDot record);
}
