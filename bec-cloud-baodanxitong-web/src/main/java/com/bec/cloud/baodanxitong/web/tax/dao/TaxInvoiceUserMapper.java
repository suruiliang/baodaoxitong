package com.bec.cloud.baodanxitong.web.tax.dao;

import org.apache.ibatis.annotations.Mapper;

import com.bec.cloud.baodanxitong.web.tax.model.TaxInvoiceUser;

@Mapper
public interface TaxInvoiceUserMapper {
    int deleteByPrimaryKey(String id);

    int insert(TaxInvoiceUser record);

    int insertSelective(TaxInvoiceUser record);

    TaxInvoiceUser selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TaxInvoiceUser record);

    int updateByPrimaryKey(TaxInvoiceUser record);
}