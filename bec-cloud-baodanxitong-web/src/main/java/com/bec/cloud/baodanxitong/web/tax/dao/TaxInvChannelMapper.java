package com.bec.cloud.baodanxitong.web.tax.dao;

import org.apache.ibatis.annotations.Mapper;

import com.bec.cloud.baodanxitong.web.tax.model.TaxInvChannel;

@Mapper
public interface TaxInvChannelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TaxInvChannel record);

    int insertSelective(TaxInvChannel record);

    TaxInvChannel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TaxInvChannel record);

    int updateByPrimaryKey(TaxInvChannel record);
}