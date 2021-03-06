package com.bec.cloud.baodanxitong.web.dict.service;

import java.util.List;

import com.bec.cloud.baodanxitong.web.dict.model.BecMcc;

public interface BecMccService {
	int deleteByPrimaryKey(Integer categoryId);

    int insert(BecMcc record);

    int insertSelective(BecMcc record);

    BecMcc selectByPrimaryKey(Integer categoryId);

    int updateByPrimaryKeySelective(BecMcc record);

    int updateByPrimaryKey(BecMcc record);
    
    List<BecMcc> selectBecMcc(BecMcc record);
}
