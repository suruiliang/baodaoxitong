package com.bec.cloud.baodanxitong.web.tax.dao;

import org.apache.ibatis.annotations.Mapper;

import com.bec.cloud.baodanxitong.web.tax.model.SysSet;

@Mapper
public interface SysSetMapper {
    int deleteByPrimaryKey(String id);

    int insert(SysSet record);

    int insertSelective(SysSet record);

    SysSet selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysSet record);

    int updateByPrimaryKey(SysSet record);
}