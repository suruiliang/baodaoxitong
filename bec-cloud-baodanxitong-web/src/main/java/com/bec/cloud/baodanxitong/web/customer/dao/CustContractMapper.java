package com.bec.cloud.baodanxitong.web.customer.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.bec.cloud.baodanxitong.web.customer.model.CustContract;

@Mapper
public interface CustContractMapper {
    int deleteByPrimaryKey(Long contId);

    int insert(CustContract record);

    int insertSelective(CustContract record);

    CustContract selectByPrimaryKey(Long contId);

    int updateByPrimaryKeySelective(CustContract record);

    int updateByPrimaryKey(CustContract record);
    
    List<CustContract> selectCustContracts(CustContract record);
}