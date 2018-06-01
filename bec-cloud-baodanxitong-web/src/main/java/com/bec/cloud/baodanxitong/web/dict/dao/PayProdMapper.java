package com.bec.cloud.baodanxitong.web.dict.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.bec.cloud.baodanxitong.web.dict.model.PayProd;

@Mapper
public interface PayProdMapper {
    int deleteByPrimaryKey(Integer prodId);

    int insert(PayProd record);

    int insertSelective(PayProd record);

    PayProd selectByPrimaryKey(Integer prodId);

    int updateByPrimaryKeySelective(PayProd record);

    int updateByPrimaryKey(PayProd record);
    
    List<PayProd> selectPayProd(PayProd record);
}