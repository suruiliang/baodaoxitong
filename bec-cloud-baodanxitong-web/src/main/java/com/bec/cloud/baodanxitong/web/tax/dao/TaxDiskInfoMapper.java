package com.bec.cloud.baodanxitong.web.tax.dao;

import org.apache.ibatis.annotations.Mapper;

import com.bec.cloud.baodanxitong.web.tax.model.TaxDiskInfo;

@Mapper
public interface TaxDiskInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(TaxDiskInfo record);

    int insertSelective(TaxDiskInfo record);

    TaxDiskInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TaxDiskInfo record);

    int updateByPrimaryKey(TaxDiskInfo record);
}