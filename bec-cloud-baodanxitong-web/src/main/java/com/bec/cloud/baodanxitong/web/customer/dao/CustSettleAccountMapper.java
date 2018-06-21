package com.bec.cloud.baodanxitong.web.customer.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.bec.cloud.baodanxitong.web.customer.model.CustSettleAccount;

@Mapper
public interface CustSettleAccountMapper {
    int deleteByPrimaryKey(Long accountId);

    int insert(CustSettleAccount record);

    int insertSelective(CustSettleAccount record);

    CustSettleAccount selectByPrimaryKey(Long accountId);

    int updateByPrimaryKeySelective(CustSettleAccount record);

    int updateByPrimaryKey(CustSettleAccount record);

	List<CustSettleAccount> selectCustSettleAccounts(CustSettleAccount info);
}