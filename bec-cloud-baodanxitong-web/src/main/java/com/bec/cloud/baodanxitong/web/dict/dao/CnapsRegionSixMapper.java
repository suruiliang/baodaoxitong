package com.bec.cloud.baodanxitong.web.dict.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.bec.cloud.baodanxitong.web.dict.model.CnapsRegionSix;

@Mapper
public interface CnapsRegionSixMapper {
    int deleteByPrimaryKey(String cnapsRegion);

    int insert(CnapsRegionSix record);

    int insertSelective(CnapsRegionSix record);

    CnapsRegionSix selectByPrimaryKey(String cnapsRegion);

    int updateByPrimaryKeySelective(CnapsRegionSix record);

    int updateByPrimaryKey(CnapsRegionSix record);
    
    List<CnapsRegionSix> selectCnapsRegionSix(CnapsRegionSix record);
}