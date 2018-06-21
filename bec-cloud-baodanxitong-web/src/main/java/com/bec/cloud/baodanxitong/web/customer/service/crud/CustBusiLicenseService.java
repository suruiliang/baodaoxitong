package com.bec.cloud.baodanxitong.web.customer.service.crud;

import java.util.List;

import com.bec.cloud.baodanxitong.web.customer.model.CustBusiLicense;

public interface CustBusiLicenseService {
	int deleteByPrimaryKey(Long cblId);

    int insertSelective(CustBusiLicense record);

    CustBusiLicense selectByPrimaryKey(Long dotId);

    int updateByPrimaryKeySelective(CustBusiLicense record);

    List<CustBusiLicense> selectCustBusiLicenses(CustBusiLicense record);
}
