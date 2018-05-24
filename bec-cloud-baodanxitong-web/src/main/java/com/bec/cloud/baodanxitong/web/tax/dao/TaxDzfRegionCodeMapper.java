package com.bec.cloud.baodanxitong.web.tax.dao;

import org.apache.ibatis.annotations.Mapper;

import com.bec.cloud.baodanxitong.web.tax.model.TaxDzfRegionCode;

@Mapper
public interface TaxDzfRegionCodeMapper {
    int deleteByPrimaryKey(String id);

    int insert(TaxDzfRegionCode record);

    int insertSelective(TaxDzfRegionCode record);

    TaxDzfRegionCode selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TaxDzfRegionCode record);

    int updateByPrimaryKey(TaxDzfRegionCode record);
}