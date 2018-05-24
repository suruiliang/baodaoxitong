package com.bec.cloud.baodanxitong.web.tax.dao;

import org.apache.ibatis.annotations.Mapper;

import com.bec.cloud.baodanxitong.web.tax.model.TaxGoodItem;

@Mapper
public interface TaxGoodItemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TaxGoodItem record);

    int insertSelective(TaxGoodItem record);

    TaxGoodItem selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TaxGoodItem record);

    int updateByPrimaryKey(TaxGoodItem record);
}