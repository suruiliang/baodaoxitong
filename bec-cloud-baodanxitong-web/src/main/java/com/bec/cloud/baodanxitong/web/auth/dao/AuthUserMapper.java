package com.bec.cloud.baodanxitong.web.auth.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.bec.cloud.baodanxitong.web.auth.model.AuthUser;

@Mapper
public interface AuthUserMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(AuthUser record);

    int insertSelective(AuthUser record);

    AuthUser selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(AuthUser record);

    int updateByPrimaryKey(AuthUser record);

	List<AuthUser> selectAuthUser(AuthUser record);

	int deleteUserRole(Long userId);

	void saveUserRole(Map<String, Object> data);

}