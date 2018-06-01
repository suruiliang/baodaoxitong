package com.bec.cloud.baodanxitong.web.customer.service;

import java.util.List;

import com.bec.cloud.baodanxitong.web.customer.model.CustDot;
import com.bec.cloud.baodanxitong.web.customer.model.CustDotTerm;

public interface CustDotTermService {
	int deleteByPrimaryKey(Long dtId);

    int insert(CustDotTerm record);

    int insertSelective(CustDotTerm record);

    CustDotTerm selectByPrimaryKey(Long dtId);

    int updateByPrimaryKeySelective(CustDotTerm record);

    int updateByPrimaryKey(CustDotTerm record);

	List<CustDotTerm> selectustDotTerms(CustDot custDot);
}
