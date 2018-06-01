package com.bec.cloud.baodanxitong.web.dict.service;

import java.util.List;

import com.bec.cloud.baodanxitong.web.dict.model.PayProd;

public interface PayProdService {
	int deleteByPrimaryKey(Integer prodId);

    int insert(PayProd record);

    int insertSelective(PayProd record);

    PayProd selectByPrimaryKey(Integer prodId);

    int updateByPrimaryKeySelective(PayProd record);

    int updateByPrimaryKey(PayProd record);
    
    List<PayProd> selectPayProd(PayProd record);
}
