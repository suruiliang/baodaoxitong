package com.bec.cloud.baodanxitong.web.auth.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bec.cloud.auth.core.exception.BecException;
import com.bec.cloud.auth.core.exception.BecExceptionEnum;
import com.bec.cloud.auth.core.support.Constant;
import com.bec.cloud.baodanxitong.web.auth.dao.OrganizationMapper;
import com.bec.cloud.baodanxitong.web.auth.model.Organization;
import com.bec.cloud.baodanxitong.web.auth.service.OrganizationService;
import com.bec.cloud.service.example.model.UserInfo;
import com.bec.cloud.service.example.utils.UserInfoUtil;

/**
* @author suruiliang
* @version 创建时间：2018年5月8日 上午11:25:09
* @ClassName 类名称
* @Description 类描述
*/
@Service
public class OrganizationServiceImpl implements OrganizationService {
	@Autowired
	private OrganizationMapper organizationMapper;
	@Autowired
	private UserInfoUtil userInfoUtil;

	@Override
	public List<Organization> selectOrganization(Organization record) {
		return organizationMapper.selectOrganization(record);
	}

	@Override
	public Organization selectByPrimaryKey(Long orgId) {
		Organization organization=organizationMapper.selectByPrimaryKey(orgId);
		return organization;
	}

	@Override
	@Transactional(rollbackFor=Exception.class)
	public int deleteOrganization(Long orgId) {
		Organization record=new Organization();
		record.setOrgId(orgId);
		record.setDelStatus(Constant.DelStatus.DELETED);
		record.setOperationUserId(userInfoUtil.simpleUserInfo().getUserId());
		record.setOpretionTime(new Date());
		return organizationMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	@Transactional(rollbackFor=Exception.class)
	public Organization saveOrganization(Organization record) {
		UserInfo userInfo=userInfoUtil.simpleUserInfo();
		Long pid=record.getOrgPid();
		if (pid==null||pid==0) {
			record.setOrgLevel(1);
		}else {
			Organization po=organizationMapper.selectByPrimaryKey(pid);
			if (po==null) {
				throw new BecException(BecExceptionEnum.UNKNOWN_EXCEPTION);
			}
			record.setOrgLevel(po.getOrgLevel()+1);
			record.setPOrgCode(po.getOrgCode());
		}
		if (record.getOrgId()==null) {//insert
			//TODO 判断是否重复
			record.setOrgCode("Bec086"+RandomStringUtils.randomNumeric(10));
			record.setEntryUserId(userInfo.getUserId());
			record.setOperationUserId(userInfo.getUserId());
			record.setRecordTime(new Date());
			record.setOpretionTime(new Date());
			organizationMapper.insertSelective(record);
		}else {//update
			record.setOperationUserId(userInfo.getUserId());
			record.setOpretionTime(new Date());
			organizationMapper.updateByPrimaryKeySelective(record);
		}
		return organizationMapper.selectByPrimaryKey(record.getOrgId());
	}

}
