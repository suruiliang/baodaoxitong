package com.bec.cloud.baodanxitong.web.tax.dao;

import org.apache.ibatis.annotations.Mapper;

import com.bec.cloud.baodanxitong.web.tax.model.TaxPayTemplate;

@Mapper
public interface TaxPayTemplateMapper {
    int deleteByPrimaryKey(String id);

    int insert(TaxPayTemplate record);

    int insertSelective(TaxPayTemplate record);

    TaxPayTemplate selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TaxPayTemplate record);

    int updateByPrimaryKey(TaxPayTemplate record);
}