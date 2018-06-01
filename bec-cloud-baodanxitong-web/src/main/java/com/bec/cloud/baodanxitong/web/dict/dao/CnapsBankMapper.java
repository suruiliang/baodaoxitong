package com.bec.cloud.baodanxitong.web.dict.dao;

import java.util.List;

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
    
    List<CnapsBank> selectCnapsBank(CnapsBank record);
}