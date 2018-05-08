package com.bec.cloud.baodanxitong.web.auth.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.bec.cloud.baodanxitong.web.auth.model.AuthRole;

@Mapper
public interface AuthRoleMapper {
    int deleteByPrimaryKey(Integer roleId);

    int insert(AuthRole record);

    int insertSelective(AuthRole record);

    AuthRole selectByPrimaryKey(Integer roleId);

    int updateByPrimaryKeySelective(AuthRole record);

    int updateByPrimaryKey(AuthRole record);

	List<AuthRole> selectAuthRoleByUserId(Long userId);

	List<AuthRole> selectAuthRole(AuthRole record);

	int deleteRoleMenuBtn(Integer roleId);

	int saveRoleMenuBtn(List<Map<String, Object>> list);

	List<Map<String, Integer>> selectMenuBtnByRoleId(Integer roleId);

}