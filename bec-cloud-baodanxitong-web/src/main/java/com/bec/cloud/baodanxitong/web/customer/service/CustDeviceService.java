package com.bec.cloud.baodanxitong.web.customer.service;

import java.util.List;

import com.bec.cloud.baodanxitong.web.customer.model.resp.CustDeviceDetailResp;
import com.bec.cloud.baodanxitong.web.customer.model.resp.CustDeviceSimpleResp;

public interface CustDeviceService {

	List<CustDeviceSimpleResp> selectCustDeviceSimpleResp(CustDeviceSimpleResp record);

	CustDeviceDetailResp selectCustDeviceDetailRespByPrimaryKey(Long ddId);

	void update(String req);

	void add(String req);

	int deleteCustDevice(Long ddId);

	int deleteCustDevice(String ddIds);

}
