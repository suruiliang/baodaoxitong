package com.bec.cloud.baodanxitong.web.tax.dao;

import org.apache.ibatis.annotations.Mapper;

import com.bec.cloud.baodanxitong.web.tax.model.TaxInvData;

@Mapper
public interface TaxInvDataMapper {
    int deleteByPrimaryKey(String id);

    int insert(TaxInvData record);

    int insertSelective(TaxInvData record);

    TaxInvData selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TaxInvData record);

    int updateByPrimaryKey(TaxInvData record);
}