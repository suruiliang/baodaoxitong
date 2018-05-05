package com.bec.cloud.baodanxitong.web.auth.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bec.cloud.baodanxitong.web.auth.dao.AuthUserMapper1;
import com.bec.cloud.baodanxitong.web.auth.model.AuthUser;
import com.bec.cloud.baodanxitong.web.auth.service.AuthUserService;

/**
* @author suruiliang
* @version 创建时间：2018年5月5日 上午11:04:40
* @ClassName 类名称
* @Description 类描述
*/
@Service
public class AuthUserServiceImpl implements AuthUserService {
	@Autowired
	private AuthUserMapper1 authUserMapper;

	@Override
	public List<AuthUser> selectAuthUser(AuthUser record) {
		return authUserMapper.selectAuthUser(record);
	}

}
