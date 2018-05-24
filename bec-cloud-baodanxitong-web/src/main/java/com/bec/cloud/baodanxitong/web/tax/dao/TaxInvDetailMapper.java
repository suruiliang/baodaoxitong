package com.bec.cloud.baodanxitong.web.tax.dao;

import org.apache.ibatis.annotations.Mapper;

import com.bec.cloud.baodanxitong.web.tax.model.TaxInvDetail;


@Mapper
public interface TaxInvDetailMapper {
    int deleteByPrimaryKey(String id);

    int insert(TaxInvDetail record);

    int insertSelective(TaxInvDetail record);

    TaxInvDetail selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TaxInvDetail record);

    int updateByPrimaryKey(TaxInvDetail record);
}