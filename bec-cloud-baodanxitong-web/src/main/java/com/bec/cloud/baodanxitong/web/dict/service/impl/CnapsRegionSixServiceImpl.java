package com.bec.cloud.baodanxitong.web.dict.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bec.cloud.baodanxitong.web.dict.dao.CnapsRegionSixMapper;
import com.bec.cloud.baodanxitong.web.dict.model.CnapsRegionSix;
import com.bec.cloud.baodanxitong.web.dict.service.CnapsRegionSixService;

@Service
public class CnapsRegionSixServiceImpl implements CnapsRegionSixService {
	
	@Autowired
	private CnapsRegionSixMapper mapper;

	@Override
	public int deleteByPrimaryKey(String cnapsRegion) {
		return mapper.deleteByPrimaryKey(cnapsRegion);
	}

	@Override
	public int insert(CnapsRegionSix record) {
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(CnapsRegionSix record) {
		return mapper.insertSelective(record);
	}

	@Override
	public CnapsRegionSix selectByPrimaryKey(String cnapsRegion) {
		return mapper.selectByPrimaryKey(cnapsRegion);
	}

	@Override
	public int updateByPrimaryKeySelective(CnapsRegionSix record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CnapsRegionSix record) {
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public List<CnapsRegionSix> selectCnapsRegionSix(CnapsRegionSix record) {
		return mapper.selectCnapsRegionSix(record);
	}

}
