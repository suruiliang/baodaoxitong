package com.bec.cloud.baodanxitong.web.dict.service;

import com.bec.cloud.baodanxitong.web.dict.model.CnapsRegionFour;

public interface CnapsRegionFourService {
	int deleteByPrimaryKey(String cnapsRegion);

    int insert(CnapsRegionFour record);

    int insertSelective(CnapsRegionFour record);

    CnapsRegionFour selectByPrimaryKey(String cnapsRegion);

    int updateByPrimaryKeySelective(CnapsRegionFour record);

    int updateByPrimaryKey(CnapsRegionFour record);
}
