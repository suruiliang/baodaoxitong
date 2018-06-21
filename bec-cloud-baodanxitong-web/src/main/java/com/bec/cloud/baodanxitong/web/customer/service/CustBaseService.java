package com.bec.cloud.baodanxitong.web.customer.service;

import java.util.List;

import com.bec.cloud.baodanxitong.web.customer.model.resp.CustBaseDetailResp;
import com.bec.cloud.baodanxitong.web.customer.model.resp.CustBaseSimpleResp;

public interface CustBaseService {

	List<CustBaseSimpleResp> selectCustBaseResp(CustBaseSimpleResp record);

	CustBaseDetailResp selectCustBaseDetailRespByPrimaryKey(Long custId);

	void update(String req);

}
