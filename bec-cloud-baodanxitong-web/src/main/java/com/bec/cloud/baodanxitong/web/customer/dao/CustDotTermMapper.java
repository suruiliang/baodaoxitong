package com.bec.cloud.baodanxitong.web.customer.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.bec.cloud.baodanxitong.web.customer.model.CustDot;
import com.bec.cloud.baodanxitong.web.customer.model.CustDotTerm;

@Mapper
public interface CustDotTermMapper {
    int deleteByPrimaryKey(Long dtId);

    int insert(CustDotTerm record);

    int insertSelective(CustDotTerm record);

    CustDotTerm selectByPrimaryKey(Long dtId);

    int updateByPrimaryKeySelective(CustDotTerm record);

    int updateByPrimaryKey(CustDotTerm record);
    
    List<CustDotTerm> selectustDotTerms(CustDot custDot);
}