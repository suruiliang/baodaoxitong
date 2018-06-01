package com.bec.cloud.baodanxitong.web.dict.service;

import java.util.List;

import com.bec.cloud.baodanxitong.web.dict.model.CnapsBank;

public interface CnapsBankService {
	int deleteByPrimaryKey(String bankcode);

    int insert(CnapsBank record);

    int insertSelective(CnapsBank record);

    CnapsBank selectByPrimaryKey(String bankcode);

    int updateByPrimaryKeySelective(CnapsBank record);

    int updateByPrimaryKey(CnapsBank record);
    
    List<CnapsBank> selectCnapsBank(CnapsBank record);
}
