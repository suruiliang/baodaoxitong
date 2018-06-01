package com.bec.cloud.baodanxitong.web.dict.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bec.cloud.baodanxitong.web.dict.dao.CnapsRegionFourMapper;
import com.bec.cloud.baodanxitong.web.dict.model.CnapsRegionFour;
import com.bec.cloud.baodanxitong.web.dict.service.CnapsRegionFourService;

@Service
public class CnapsRegionFourServiceImpl implements CnapsRegionFourService {

	@Autowired
	private CnapsRegionFourMapper mapper;
	
	@Override
	public int deleteByPrimaryKey(String cnapsRegion) {
		return mapper.deleteByPrimaryKey(cnapsRegion);
	}

	@Override
	public int insert(CnapsRegionFour record) {
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(CnapsRegionFour record) {
		return mapper.insertSelective(record);
	}

	@Override
	public CnapsRegionFour selectByPrimaryKey(String cnapsRegion) {
		return mapper.selectByPrimaryKey(cnapsRegion);
	}

	@Override
	public int updateByPrimaryKeySelective(CnapsRegionFour record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CnapsRegionFour record) {
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public List<CnapsRegionFour> selectCnapsRegionFour(CnapsRegionFour record) {
		return mapper.selectCnapsRegionFour(record);
	}

}
