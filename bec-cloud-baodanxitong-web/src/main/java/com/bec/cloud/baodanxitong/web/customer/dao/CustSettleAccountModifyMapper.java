package com.bec.cloud.baodanxitong.web.customer.dao;

import org.apache.ibatis.annotations.Mapper;

import com.bec.cloud.baodanxitong.web.customer.model.CustSettleAccountModify;

@Mapper
public interface CustSettleAccountModifyMapper {
    int deleteByPrimaryKey(Long accountId);

    int insert(CustSettleAccountModify record);

    int insertSelective(CustSettleAccountModify record);

    CustSettleAccountModify selectByPrimaryKey(Long accountId);

    int updateByPrimaryKeySelective(CustSettleAccountModify record);

    int updateByPrimaryKey(CustSettleAccountModify record);
}