package com.bec.cloud.baodanxitong.web.auth.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.bec.cloud.baodanxitong.web.auth.model.AuthMenu;
import com.bec.cloud.baodanxitong.web.auth.model.AuthMenuBtn;

@Mapper
public interface AuthMenuBtnMapper {
    int deleteByPrimaryKey(Integer btnId);

    int insert(AuthMenuBtn record);

    int insertSelective(AuthMenuBtn record);

    AuthMenuBtn selectByPrimaryKey(Integer btnId);

    int updateByPrimaryKeySelective(AuthMenuBtn record);

    int updateByPrimaryKey(AuthMenuBtn record);

	List<AuthMenuBtn> selectAuthMenuBtnByAuthMenus(List<AuthMenu> authMenus);
}