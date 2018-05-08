package com.bec.cloud.baodanxitong.web.auth.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.bec.cloud.baodanxitong.web.auth.model.AuthMenu;

@Mapper
public interface AuthMenuMapper {
    int deleteByPrimaryKey(Integer menuId);

    int insert(AuthMenu record);

    int insertSelective(AuthMenu record);

    AuthMenu selectByPrimaryKey(Integer menuId);

    int updateByPrimaryKeySelective(AuthMenu record);

    int updateByPrimaryKey(AuthMenu record);

	List<AuthMenu> selectAuthMenu(AuthMenu record);
}