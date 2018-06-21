package com.bec.cloud.baodanxitong.web.customer.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONObject;
import com.bec.cloud.auth.core.support.Constant;
import com.bec.cloud.baodanxitong.web.customer.dao.CustDotDeviceMapper;
import com.bec.cloud.baodanxitong.web.customer.model.CustDotDevice;
import com.bec.cloud.baodanxitong.web.customer.model.req.CustDeviceReq;
import com.bec.cloud.baodanxitong.web.customer.model.resp.CustDeviceDetailResp;
import com.bec.cloud.baodanxitong.web.customer.model.resp.CustDeviceSimpleResp;
import com.bec.cloud.baodanxitong.web.customer.service.CustDeviceService;
import com.bec.cloud.service.example.model.UserInfo;
import com.bec.cloud.service.example.utils.CheckParamUtil;
import com.bec.cloud.service.example.utils.UserInfoUtil;

/**
 * @author suruiliang
 * @version 创建时间：2018年6月20日 下午1:27:15
 * @ClassName 类名称
 * @Description 类描述
 */
@Service
public class CustDeviceServiceImpl implements CustDeviceService {
	@Autowired
	private UserInfoUtil userInfoUtil;
	@Autowired
	private CustDotDeviceMapper custDotDeviceMapper;
	


	@Override
	public List<CustDeviceSimpleResp> selectCustDeviceSimpleResp(CustDeviceSimpleResp record) {
		return custDotDeviceMapper.selectCustDeviceSimpleResp(record);
	}



	@Override
	public CustDeviceDetailResp selectCustDeviceDetailRespByPrimaryKey(Long ddId) {
		return custDotDeviceMapper.selectCustDeviceDetailRespByPrimaryKey(ddId);
	}



	@Override
	@Transactional(rollbackFor=Exception.class)
	public void update(String req) {
		UserInfo userInfo=userInfoUtil.simpleUserInfo();
		CustDeviceReq record=JSONObject.toJavaObject(JSONObject.parseObject(req), CustDeviceReq.class);
		CustDotDevice custDotDevice=initBean(new CustDotDevice(), record);
		CheckParamUtil.checkParam(custDotDevice, "useType");//TODO 校验参数
		custDotDevice.setDelStatus(Constant.DelStatus.NORMAL);
		custDotDevice.setOperationTime(new Date());
		custDotDevice.setOperationUserId(userInfo.getUserId());
		custDotDeviceMapper.updateByPrimaryKeySelective(custDotDevice);		
	}
	
	private <T,O> T initBean(T dest,O orig) {
		try {
			BeanUtils.copyProperties(dest, orig);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dest;
	}

	@Override
	@Transactional(rollbackFor=Exception.class)
	public void add(String req) {
		UserInfo userInfo=userInfoUtil.simpleUserInfo();
		CustDeviceReq record=JSONObject.toJavaObject(JSONObject.parseObject(req), CustDeviceReq.class);
		CustDotDevice custDotDevice=initBean(new CustDotDevice(), record);
		CheckParamUtil.checkParam(custDotDevice, "useType");//TODO 校验参数
		custDotDevice.setDelStatus(Constant.DelStatus.NORMAL);
		custDotDevice.setEntryUserId(userInfo.getUserId());
		custDotDevice.setOperationTime(new Date());
		custDotDevice.setOperationUserId(userInfo.getUserId());
		custDotDevice.setRecordTime(new Date());
		custDotDeviceMapper.insertSelective(custDotDevice);		
	}



	@Override
	@Transactional(rollbackFor=Exception.class)
	public int deleteCustDevice(Long ddId) {
		UserInfo userInfo=userInfoUtil.simpleUserInfo();
		CustDotDevice custDotDevice=new CustDotDevice();
		custDotDevice.setDdId(ddId);
		custDotDevice.setDelStatus(Constant.DelStatus.DELETED);
		custDotDevice.setOperationTime(new Date());
		custDotDevice.setOperationUserId(userInfo.getUserId());
		return custDotDeviceMapper.updateByPrimaryKeySelective(custDotDevice);
	}



	@Override
	@Transactional(rollbackFor=Exception.class)
	public int deleteCustDevice(String ddIds) {
		String ddIdArray[]=StringUtils.split(ddIds, ",");
		for (String ddId : ddIdArray) {
			if (StringUtils.isNotEmpty(ddId)) {
				deleteCustDevice(Long.valueOf(ddId));
			}
		}
		return 0;
	}

}
