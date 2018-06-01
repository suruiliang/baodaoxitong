package com.bec.cloud.baodanxitong.web.dict.service;

import java.util.List;

import com.bec.cloud.baodanxitong.web.dict.model.BecMccCategory;


public interface BecMccCategoryService {
	int deleteByPrimaryKey(Integer categoryId);

    int insert(BecMccCategory record);

    int insertSelective(BecMccCategory record);

    BecMccCategory selectByPrimaryKey(Integer categoryId);

    int updateByPrimaryKeySelective(BecMccCategory record);

    int updateByPrimaryKey(BecMccCategory record);
    
    List<BecMccCategory> selectBecMccCategory(BecMccCategory record);
}
