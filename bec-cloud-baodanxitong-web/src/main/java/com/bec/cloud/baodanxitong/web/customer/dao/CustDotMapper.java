package com.bec.cloud.baodanxitong.web.customer.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.bec.cloud.baodanxitong.web.customer.model.CustDot;

@Mapper
public interface CustDotMapper {
    int deleteByPrimaryKey(Long dotId);

    int insert(CustDot record);

    int insertSelective(CustDot record);

    CustDot selectByPrimaryKey(Long dotId);

    int updateByPrimaryKeySelective(CustDot record);

    int updateByPrimaryKey(CustDot record);
    
    List<CustDot> selectCustDots(CustDot record);
}