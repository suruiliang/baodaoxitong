package com.bec.cloud.baodanxitong.web.auth.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bec.cloud.auth.core.support.Constant;
import com.bec.cloud.baodanxitong.web.auth.dao.ServiceManagementMapper;
import com.bec.cloud.baodanxitong.web.auth.model.ServiceManagement;
import com.bec.cloud.baodanxitong.web.auth.service.ServiceManagementService;
import com.bec.cloud.service.example.model.UserInfo;
import com.bec.cloud.service.example.utils.UserInfoUtil;

/**
* @author suruiliang
* @version 创建时间：2018年5月8日 下午1:00:47
* @ClassName 类名称
* @Description 类描述
*/
@Service
public class ServiceManagementServiceImpl implements ServiceManagementService {
	@Autowired
	private ServiceManagementMapper serviceManagementMapper;
	@Autowired
	private UserInfoUtil userInfoUtil;

	@Override
	public List<ServiceManagement> selectServiceManagement(ServiceManagement record) {
		return serviceManagementMapper.selectServiceManagement(record);
	}

	@Override
	public ServiceManagement selectByPrimaryKey(Long serviceId) {
		ServiceManagement serviceManagement=serviceManagementMapper.selectByPrimaryKey(serviceId);
		return serviceManagement;
	}

	@Override
	@Transactional(rollbackFor=Exception.class)
	public int deleteServiceManagement(Long serviceId) {
		ServiceManagement record=new ServiceManagement();
		record.setServiceId(serviceId);
		record.setDelStatus(Constant.DelStatus.DELETED);
		record.setOperationUserId(userInfoUtil.simpleUserInfo().getUserId());
		record.setOpretionTime(new Date());
		return serviceManagementMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	@Transactional(rollbackFor=Exception.class)
	public ServiceManagement saveServiceManagement(ServiceManagement record) {
		UserInfo userInfo=userInfoUtil.simpleUserInfo();
		if (record.getServiceId()==null) {//insert
			record.setEntryUserId(userInfo.getUserId());
			record.setOperationUserId(userInfo.getUserId());
			record.setRecordTime(new Date());
			record.setOpretionTime(new Date());
			serviceManagementMapper.insertSelective(record);
		}else {//update
			record.setOperationUserId(userInfo.getUserId());
			record.setOpretionTime(new Date());
			serviceManagementMapper.updateByPrimaryKeySelective(record);
		}
		return serviceManagementMapper.selectByPrimaryKey(record.getServiceId());
	}

}
