package com.bec.cloud.baodanxitong.web.auth.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bec.cloud.baodanxitong.web.auth.dao.AuthLogMapper;
import com.bec.cloud.baodanxitong.web.auth.model.AuthLog;
import com.bec.cloud.baodanxitong.web.auth.service.AuthLogService;

/**
* @author suruiliang
* @version 创建时间：2018年5月8日 下午1:49:27
* @ClassName 类名称
* @Description 类描述
*/
@Service
public class AuthLogServiceImpl implements AuthLogService {
	@Autowired
	private AuthLogMapper authLogMapper;

	@Override
	public List<AuthLog> selectAuthLog(AuthLog record) {
		return authLogMapper.selectAuthLog(record);
	}

}
