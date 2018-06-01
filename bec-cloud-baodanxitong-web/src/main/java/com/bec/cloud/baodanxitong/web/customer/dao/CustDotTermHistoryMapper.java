package com.bec.cloud.baodanxitong.web.customer.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.bec.cloud.baodanxitong.web.customer.model.CustDotTermHistory;

@Mapper
public interface CustDotTermHistoryMapper {
    int deleteByPrimaryKey(Long dtId);

    int insert(CustDotTermHistory record);

    int insertSelective(CustDotTermHistory record);

    CustDotTermHistory selectByPrimaryKey(Long dtId);

    int updateByPrimaryKeySelective(CustDotTermHistory record);

    int updateByPrimaryKey(CustDotTermHistory record);
    
    List<CustDotTermHistory> selectustCustDotTermHistorys(CustDotTermHistory info);
}