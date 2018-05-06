package com.bec.cloud.baodanxitong.web.auth.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bec.cloud.auth.core.exception.BecException;
import com.bec.cloud.auth.core.exception.BecExceptionEnum;
import com.bec.cloud.auth.core.support.Constant;
import com.bec.cloud.baodanxitong.web.auth.dao.AuthUserMapper;
import com.bec.cloud.baodanxitong.web.auth.model.AuthUser;
import com.bec.cloud.baodanxitong.web.auth.service.AuthUserService;
import com.bec.cloud.service.example.model.UserInfo;
import com.bec.cloud.service.example.utils.UserInfoUtil;

/**
* @author suruiliang
* @version 创建时间：2018年5月5日 上午11:04:40
* @ClassName 类名称
* @Description 类描述
*/
@Service
public class AuthUserServiceImpl implements AuthUserService {
	@Autowired
	private AuthUserMapper authUserMapper;
	@Autowired
	private UserInfoUtil userInfoUtil;

	@Override
	public List<AuthUser> selectAuthUser(AuthUser record) {
		return authUserMapper.selectAuthUser(record);
	}

	@Override
	public AuthUser selectByPrimaryKey(Long userId) {
		return authUserMapper.selectByPrimaryKey(userId);
	}

	@Override
	@Transactional(rollbackFor=Exception.class)
	public int deleteAuthUser(Long userId) {
		AuthUser record=new AuthUser();
		record.setUserId(userId);
		record.setDelStatus(Constant.DelStatus.DELETED);
		record.setOperationUserId(userInfoUtil.simpleUserInfo().getUserId());
		record.setOpretionTime(new Date());
		return authUserMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	@Transactional(rollbackFor=Exception.class)
	public int saveAuthUser(AuthUser record,String roleIds) {
		UserInfo userInfo=userInfoUtil.simpleUserInfo();
		if (StringUtils.isNoneEmpty(record.getUserPasswd())) {
			record.setUserPasswd(new BCryptPasswordEncoder().encode(record.getUserPasswd()));
		}
		if (record.getUserId()==null) {//insert
			record.setEntryUserId(userInfo.getUserId());
			record.setOperationUserId(userInfo.getUserId());
			record.setRecordTime(new Date());
			record.setOpretionTime(new Date());
			int i=authUserMapper.insertSelective(record);
			saveUserRole(record, roleIds);
			return i;
		}else{//update
			record.setOperationUserId(userInfo.getUserId());
			record.setOpretionTime(new Date());
			int i=authUserMapper.updateByPrimaryKeySelective(record);
			saveUserRole(record, roleIds);
			return i;
		}
	}

	private void saveUserRole(AuthUser record, String roleIds) {
		authUserMapper.deleteUserRole(record.getUserId());
		String roleIdArr[]=StringUtils.split(roleIds, ",");
		List<Long> roleIdList=new ArrayList<>();
		for (String r : roleIdArr) {
			if (StringUtils.isNotEmpty(r)) {
				roleIdList.add(Long.valueOf(r));
			}
		}
		if (CollectionUtils.isNotEmpty(roleIdList)) {
			authUserMapper.saveUserRole(record.getUserId(),roleIdList);
		}
	}

	@Override
	@Transactional(rollbackFor=Exception.class)
	public int setPasswd(Long userId, String oldUserpasswd, String newUserpasswd) {
		UserInfo userInfo=userInfoUtil.simpleUserInfo();
		BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
		if(!encoder.matches(oldUserpasswd, userInfo.getUserPasswd())){
			throw new BecException(BecExceptionEnum.PASSWORD_EXCEPTION);
		}
		AuthUser record=new AuthUser();
		record.setUserId(userId);
		record.setUserPasswd(encoder.encode(newUserpasswd));
		record.setOperationUserId(userInfo.getUserId());
		record.setOpretionTime(new Date());
		return authUserMapper.updateByPrimaryKeySelective(record);
	}

}
