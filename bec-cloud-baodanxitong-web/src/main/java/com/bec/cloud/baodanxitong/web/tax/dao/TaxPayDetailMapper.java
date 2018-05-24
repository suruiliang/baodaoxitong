package com.bec.cloud.baodanxitong.web.tax.dao;

import org.apache.ibatis.annotations.Mapper;

import com.bec.cloud.baodanxitong.web.tax.model.TaxPayDetail;

@Mapper
public interface TaxPayDetailMapper {
    int deleteByPrimaryKey(String id);

    int insert(TaxPayDetail record);

    int insertSelective(TaxPayDetail record);

    TaxPayDetail selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TaxPayDetail record);

    int updateByPrimaryKey(TaxPayDetail record);
}