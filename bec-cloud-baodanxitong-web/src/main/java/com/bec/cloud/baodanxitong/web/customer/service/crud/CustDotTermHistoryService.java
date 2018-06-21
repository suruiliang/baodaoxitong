package com.bec.cloud.baodanxitong.web.customer.service.crud;

import java.util.List;

import com.bec.cloud.baodanxitong.web.customer.model.CustDotTermHistory;

public interface CustDotTermHistoryService {
	int deleteByPrimaryKey(Long dtId);

    int insert(CustDotTermHistory record);

    int insertSelective(CustDotTermHistory record);

    CustDotTermHistory selectByPrimaryKey(Long dtId);

    int updateByPrimaryKeySelective(CustDotTermHistory record);

    int updateByPrimaryKey(CustDotTermHistory record);

	List<CustDotTermHistory> selectustCustDotTermHistorys(CustDotTermHistory info);
}
