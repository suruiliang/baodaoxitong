package com.bec.cloud.baodanxitong.web.customer.service;

import java.util.List;

import com.bec.cloud.baodanxitong.web.customer.model.resp.CustDeptDetailResp;
import com.bec.cloud.baodanxitong.web.customer.model.resp.CustDeptSimpleResp;

public interface CustDeptService {

	List<CustDeptSimpleResp> selectCustDeptSimpleResp(CustDeptSimpleResp record);

	CustDeptDetailResp selectCustDeptDetailRespByPrimaryKey(Long dotId);

	void update(String req);

	void add(String req);

}
