package com.bec.cloud.baodanxitong.web.customer.service.crud.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bec.cloud.baodanxitong.web.customer.dao.CustBusiLicenseMapper;
import com.bec.cloud.baodanxitong.web.customer.model.CustBusiLicense;
import com.bec.cloud.baodanxitong.web.customer.service.crud.CustBusiLicenseService;

@Service
public class CustBusiLicenseServiceImpl implements CustBusiLicenseService {
	
	@Autowired
	private CustBusiLicenseMapper mapper;

	@Override
	public int deleteByPrimaryKey(Long dotId) {
		return mapper.deleteByPrimaryKey(dotId);
	}

	@Override
	public int insertSelective(CustBusiLicense record) {
		return mapper.insertSelective(record);
	}

	@Override
	public CustBusiLicense selectByPrimaryKey(Long dotId) {
		return mapper.selectByPrimaryKey(dotId);
	}

	@Override
	public int updateByPrimaryKeySelective(CustBusiLicense record) {
		return mapper.updateByPrimaryKeySelective(record);
	}


	@Override
	public List<CustBusiLicense> selectCustBusiLicenses(CustBusiLicense record) {
		return mapper.selectCustBusiLicenses(record);
	}

}
