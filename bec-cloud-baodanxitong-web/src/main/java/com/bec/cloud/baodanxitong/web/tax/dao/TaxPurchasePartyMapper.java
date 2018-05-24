package com.bec.cloud.baodanxitong.web.tax.dao;

import org.apache.ibatis.annotations.Mapper;

import com.bec.cloud.baodanxitong.web.tax.model.TaxPurchaseParty;

@Mapper
public interface TaxPurchasePartyMapper {
    int deleteByPrimaryKey(String id);

    int insert(TaxPurchaseParty record);

    int insertSelective(TaxPurchaseParty record);

    TaxPurchaseParty selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TaxPurchaseParty record);

    int updateByPrimaryKey(TaxPurchaseParty record);
}