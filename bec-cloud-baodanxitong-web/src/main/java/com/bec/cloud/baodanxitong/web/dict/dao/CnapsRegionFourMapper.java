package com.bec.cloud.baodanxitong.web.dict.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.bec.cloud.baodanxitong.web.dict.model.CnapsRegionFour;

@Mapper
public interface CnapsRegionFourMapper {
    int deleteByPrimaryKey(String cnapsRegion);

    int insert(CnapsRegionFour record);

    int insertSelective(CnapsRegionFour record);

    CnapsRegionFour selectByPrimaryKey(String cnapsRegion);

    int updateByPrimaryKeySelective(CnapsRegionFour record);

    int updateByPrimaryKey(CnapsRegionFour record);
    
    List<CnapsRegionFour> selectCnapsRegionFour(CnapsRegionFour record);
}