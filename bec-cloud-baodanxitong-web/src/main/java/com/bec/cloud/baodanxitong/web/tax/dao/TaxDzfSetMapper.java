package com.bec.cloud.baodanxitong.web.tax.dao;

import org.apache.ibatis.annotations.Mapper;

import com.bec.cloud.baodanxitong.web.tax.model.TaxDzfSet;

@Mapper
public interface TaxDzfSetMapper {
    int deleteByPrimaryKey(String id);

    int insert(TaxDzfSet record);

    int insertSelective(TaxDzfSet record);

    TaxDzfSet selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TaxDzfSet record);

    int updateByPrimaryKey(TaxDzfSet record);
}