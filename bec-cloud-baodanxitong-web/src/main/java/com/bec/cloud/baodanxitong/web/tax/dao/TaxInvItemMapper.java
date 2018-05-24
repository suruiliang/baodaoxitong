package com.bec.cloud.baodanxitong.web.tax.dao;

import org.apache.ibatis.annotations.Mapper;

import com.bec.cloud.baodanxitong.web.tax.model.TaxInvItem;

@Mapper
public interface TaxInvItemMapper {
    int deleteByPrimaryKey(String id);

    int insert(TaxInvItem record);

    int insertSelective(TaxInvItem record);

    TaxInvItem selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TaxInvItem record);

    int updateByPrimaryKey(TaxInvItem record);
}