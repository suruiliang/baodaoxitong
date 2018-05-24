package com.bec.cloud.baodanxitong.web.dict.dao;

import org.apache.ibatis.annotations.Mapper;

import com.bec.cloud.baodanxitong.web.dict.model.CnapsBank;

@Mapper
public interface CnapsBankMapper {
    int deleteByPrimaryKey(String bankcode);

    int insert(CnapsBank record);

    int insertSelective(CnapsBank record);

    CnapsBank selectByPrimaryKey(String bankcode);

    int updateByPrimaryKeySelective(CnapsBank record);

    int updateByPrimaryKey(CnapsBank record);
}