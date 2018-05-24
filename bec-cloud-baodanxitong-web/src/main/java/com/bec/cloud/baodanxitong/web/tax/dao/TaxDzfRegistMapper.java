package com.bec.cloud.baodanxitong.web.tax.dao;

import org.apache.ibatis.annotations.Mapper;

import com.bec.cloud.baodanxitong.web.tax.model.TaxDzfRegist;

@Mapper
public interface TaxDzfRegistMapper {
    int deleteByPrimaryKey(String id);

    int insert(TaxDzfRegist record);

    int insertSelective(TaxDzfRegist record);

    TaxDzfRegist selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TaxDzfRegist record);

    int updateByPrimaryKey(TaxDzfRegist record);
}