package com.bec.cloud.baodanxitong.web.customer.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.bec.cloud.baodanxitong.web.customer.model.CustBusiLicense;

@Mapper
public interface CustBusiLicenseMapper {
    int deleteByPrimaryKey(Long cblId);

    int insert(CustBusiLicense record);

    int insertSelective(CustBusiLicense record);

    CustBusiLicense selectByPrimaryKey(Long cblId);

    int updateByPrimaryKeySelective(CustBusiLicense record);

    int updateByPrimaryKey(CustBusiLicense record);

	List<CustBusiLicense> selectCustBusiLicenses(CustBusiLicense record);
}