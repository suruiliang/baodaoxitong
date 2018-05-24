package com.bec.cloud.baodanxitong.web.customer.dao;

import org.apache.ibatis.annotations.Mapper;

import com.bec.cloud.baodanxitong.web.customer.model.CustContractModify;

@Mapper
public interface CustContractModifyMapper {
    int deleteByPrimaryKey(Long contId);

    int insert(CustContractModify record);

    int insertSelective(CustContractModify record);

    CustContractModify selectByPrimaryKey(Long contId);

    int updateByPrimaryKeySelective(CustContractModify record);

    int updateByPrimaryKey(CustContractModify record);
}