package com.bec.cloud.baodanxitong.web.dict.service;

import com.bec.cloud.baodanxitong.web.dict.model.CnapsRegionSix;

public interface CnapsRegionSixService {
	int deleteByPrimaryKey(String cnapsRegion);

    int insert(CnapsRegionSix record);

    int insertSelective(CnapsRegionSix record);

    CnapsRegionSix selectByPrimaryKey(String cnapsRegion);

    int updateByPrimaryKeySelective(CnapsRegionSix record);

    int updateByPrimaryKey(CnapsRegionSix record);
}
