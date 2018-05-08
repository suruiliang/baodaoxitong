package com.bec.cloud.baodanxitong.web.auth.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.bec.cloud.baodanxitong.web.auth.model.AuthLog;

@Mapper
public interface AuthLogMapper {
    int deleteByPrimaryKey(Long logId);

    int insert(AuthLog record);

    int insertSelective(AuthLog record);

    AuthLog selectByPrimaryKey(Long logId);

    int updateByPrimaryKeySelective(AuthLog record);

    int updateByPrimaryKey(AuthLog record);

	List<AuthLog> selectAuthLog(AuthLog record);
}