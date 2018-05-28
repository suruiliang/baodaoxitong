package com.bec.cloud.baodanxitong.web.auth.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONObject;
import com.bec.cloud.auth.core.exception.BecException;
import com.bec.cloud.auth.core.exception.BecExceptionEnum;
import com.bec.cloud.auth.core.support.Constant;
import com.bec.cloud.baodanxitong.web.auth.dao.AuthRoleMapper;
import com.bec.cloud.baodanxitong.web.auth.dao.AuthUserMapper;
import com.bec.cloud.baodanxitong.web.auth.model.AuthRole;
import com.bec.cloud.baodanxitong.web.auth.model.AuthUser;
import com.bec.cloud.baodanxitong.web.auth.service.AuthUserService;
import com.bec.cloud.baodanxitong.web.task.service.TaskBaseService;
import com.bec.cloud.service.example.model.UserInfo;
import com.bec.cloud.service.example.utils.UserInfoUtil;

/**
 * @author suruiliang
 * @version 创建时间：2018年5月5日 上午11:04:40
 * @ClassName 类名称
 * @Description 类描述
 */
@Service
public class AuthUserServiceImpl implements AuthUserService,TaskBaseService<AuthUser> {
	@Autowired
	private AuthUserMapper authUserMapper;
	@Autowired
	private AuthRoleMapper authRoleMapper;
	@Autowired
	private UserInfoUtil userInfoUtil;

	//viewTask
	@Override
	public AuthUser viewTask(Long userId) {
		return selectByPrimaryKey(userId);
	}
	
	//updateTask
	@Override
	@Transactional(rollbackFor=Exception.class)
	public AuthUser updateTask(JSONObject json) {
		AuthUser record=json.toJavaObject(AuthUser.class);
		if (record.getUserId()==null) {
			record.setUserId(json.getLong("launchId"));
		}
		String roleIds=json.getString("roleIds");
		return saveAuthUser(record,roleIds);
	}
	
	//deleteTask
	@Override
	@Transactional(rollbackFor=Exception.class)
	public int deleteTask(Long userId) {
		AuthUser record=new AuthUser();
		record.setUserId(userId);
		record.setDelStatus(Constant.DelStatus.DELETED);
		record.setOperationUserId(userInfoUtil.simpleUserInfo().getUserId());
		record.setOperationTime(new Date());
		return authUserMapper.updateByPrimaryKeySelective(record);
	}
	
	//viewTaskCompare
	@Override
	public Map<String, AuthUser> viewTaskCompare(Long launchId) {
		AuthUser newRecord=selectByPrimaryKey(launchId);
		// TODO 
		AuthUser oldRecord=null;
		Map<String, AuthUser> map=new HashMap<>();
		map.put("newRecord", newRecord);
		map.put("oldRecord", oldRecord);
		return map;
	}

	//acceptTask
	@Override
	public AuthUser acceptTask(JSONObject json) {
		AuthUser record=json.toJavaObject(AuthUser.class);
		if (record.getUserId()==null) {
			record.setUserId(json.getLong("launchId"));
		}
		return selectByPrimaryKey(record.getUserId());
	}

	//rejectTask
	@Override
	public int rejectTask(Long launchId, String rejectReason) {
		System.out.println("launchId="+launchId);
		System.out.println("rejectReason="+rejectReason);
		return 0;
	}

	@Override
	public List<AuthUser> selectAuthUser(AuthUser record) {
		return authUserMapper.selectAuthUser(record);
	}

	@Override
	public AuthUser selectByPrimaryKey(Long userId) {
		AuthUser authUser=authUserMapper.selectByPrimaryKey(userId);
		if (authUser!=null) {
			AuthRole record=new AuthRole();
			record.setRoleStatus(Constant.OnOffStatus.ON);
			List<AuthRole> allAuthRoles=authRoleMapper.selectAuthRole(record);
			List<AuthRole> selfauthRoles=authRoleMapper.selectAuthRoleByUserId(userId);
			if (CollectionUtils.isNotEmpty(allAuthRoles)) {
				if (CollectionUtils.isNotEmpty(selfauthRoles)) {
					for (AuthRole authRole : allAuthRoles) {
						authRole.setChecked(false);
						for (AuthRole a : selfauthRoles) {
							if (authRole.getRoleId().equals(a.getRoleId())) {
								authRole.setChecked(true);
								break;
							}
						}
					}
				}
				authUser.setAuthRoles(allAuthRoles);
			}
		}
		return authUser;
	}

	@Override
	@Transactional(rollbackFor=Exception.class)
	public int deleteAuthUser(Long userId) {
		AuthUser record=new AuthUser();
		record.setUserId(userId);
		record.setDelStatus(Constant.DelStatus.DELETED);
		record.setOperationUserId(userInfoUtil.simpleUserInfo().getUserId());
		record.setOperationTime(new Date());
		return authUserMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	@Transactional(rollbackFor=Exception.class)
	public int deleteAuthUser(String userIds) {
		String userIdArray[]=StringUtils.split(userIds, ",");
		for (String userId : userIdArray) {
			if (StringUtils.isNotEmpty(userId)) {
				deleteAuthUser(Long.valueOf(userId));
			}
		}
		return 0;
	}

	@Override
	@Transactional(rollbackFor=Exception.class)
	public AuthUser saveAuthUser(AuthUser record,String roleIds) {
		UserInfo userInfo=userInfoUtil.simpleUserInfo();
		if (StringUtils.isNoneEmpty(record.getUserPasswd())) {
			record.setUserPasswd(new BCryptPasswordEncoder().encode(record.getUserPasswd()));
		}
		if (record.getUserId()==null) {//insert
			record.setEntryUserId(userInfo.getUserId());
			record.setOperationUserId(userInfo.getUserId());
			record.setRecordTime(new Date());
			record.setOperationTime(new Date());
			authUserMapper.insertSelective(record);
			saveUserRole(record, roleIds);
		}else{//update
			record.setOperationUserId(userInfo.getUserId());
			record.setOperationTime(new Date());
			authUserMapper.updateByPrimaryKeySelective(record);
			saveUserRole(record, roleIds);
		}
		return authUserMapper.selectByPrimaryKey(record.getUserId());
	}

	private void saveUserRole(AuthUser record, String roleIds) {
		authUserMapper.deleteUserRole(record.getUserId());
		String roleIdArr[]=StringUtils.split(roleIds, ",");
		List<Long> roleIdList=new ArrayList<>();
		if (roleIdArr!=null&&roleIdArr.length>0) {
			for (String r : roleIdArr) {
				if (StringUtils.isNotEmpty(r)) {
					roleIdList.add(Long.valueOf(r));
				}
			}
		}
		
		if (CollectionUtils.isNotEmpty(roleIdList)) {
			Map<String, Object> data=new HashMap<String, Object>();
			data.put("roleIdList", roleIdList);
			data.put("userId", record.getUserId());
			authUserMapper.saveUserRole(data);
		}
	}

	@Override
	@Transactional(rollbackFor=Exception.class)
	public int setPasswd(Long userId, String oldUserpasswd, String newUserpasswd) {
		UserInfo userInfo=userInfoUtil.simpleUserInfo();
		AuthUser authUser=authUserMapper.selectByPrimaryKey(userId);
		if (authUser==null) {
			throw new BecException(BecExceptionEnum.UNKNOWN_EXCEPTION);
		}
		BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
		if(!encoder.matches(oldUserpasswd, authUser.getUserPasswd())){
			throw new BecException(BecExceptionEnum.PASSWORD_EXCEPTION);
		}
		AuthUser record=new AuthUser();
		record.setUserId(userId);
		record.setUserPasswd(encoder.encode(newUserpasswd));
		record.setOperationUserId(userInfo.getUserId());
		record.setOperationTime(new Date());
		return authUserMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	@Transactional(rollbackFor=Exception.class)
	public int forbiddenAuthUser(Long userId) {
		AuthUser record=new AuthUser();
		record.setUserId(userId);
		record.setUserStatus(Constant.OnOffStatus.OFF);
		record.setOperationUserId(userInfoUtil.simpleUserInfo().getUserId());
		record.setOperationTime(new Date());
		return authUserMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	@Transactional(rollbackFor=Exception.class)
	public int forbiddenAuthUser(String userIds) {
		String userIdArray[]=StringUtils.split(userIds, ",");
		for (String userId : userIdArray) {
			if (StringUtils.isNotEmpty(userId)) {
				forbiddenAuthUser(Long.valueOf(userId));
			}
		}
		return 0;
	}

	@Override
	public int restoreAuthUser(Long userId) {
		AuthUser record=new AuthUser();
		record.setUserId(userId);
		record.setUserStatus(Constant.OnOffStatus.ON);
		record.setOperationUserId(userInfoUtil.simpleUserInfo().getUserId());
		record.setOperationTime(new Date());
		return authUserMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int restoreAuthUser(String userIds) {
		String userIdArray[]=StringUtils.split(userIds, ",");
		for (String userId : userIdArray) {
			if (StringUtils.isNotEmpty(userId)) {
				restoreAuthUser(Long.valueOf(userId));
			}
		}
		return 0;
	}


}
