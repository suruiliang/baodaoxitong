package com.bec.cloud.baodanxitong.web.dict.dao;

import org.apache.ibatis.annotations.Mapper;

import com.bec.cloud.baodanxitong.web.dict.model.BecMcc;

@Mapper
public interface BecMccMapper {
    int deleteByPrimaryKey(Integer categoryId);

    int insert(BecMcc record);

    int insertSelective(BecMcc record);

    BecMcc selectByPrimaryKey(Integer categoryId);

    int updateByPrimaryKeySelective(BecMcc record);

    int updateByPrimaryKey(BecMcc record);
}