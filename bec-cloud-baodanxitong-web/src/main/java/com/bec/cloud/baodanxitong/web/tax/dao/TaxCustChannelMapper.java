package com.bec.cloud.baodanxitong.web.tax.dao;

import org.apache.ibatis.annotations.Mapper;

import com.bec.cloud.baodanxitong.web.tax.model.TaxCustChannel;

@Mapper
public interface TaxCustChannelMapper {
    int deleteByPrimaryKey(String id);

    int insert(TaxCustChannel record);

    int insertSelective(TaxCustChannel record);

    TaxCustChannel selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TaxCustChannel record);

    int updateByPrimaryKey(TaxCustChannel record);
}