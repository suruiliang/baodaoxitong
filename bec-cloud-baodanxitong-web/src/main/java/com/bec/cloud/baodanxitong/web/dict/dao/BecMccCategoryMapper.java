package com.bec.cloud.baodanxitong.web.dict.dao;

import org.apache.ibatis.annotations.Mapper;

import com.bec.cloud.baodanxitong.web.dict.model.BecMccCategory;

@Mapper
public interface BecMccCategoryMapper {
    int deleteByPrimaryKey(Integer categoryId);

    int insert(BecMccCategory record);

    int insertSelective(BecMccCategory record);

    BecMccCategory selectByPrimaryKey(Integer categoryId);

    int updateByPrimaryKeySelective(BecMccCategory record);

    int updateByPrimaryKey(BecMccCategory record);
}