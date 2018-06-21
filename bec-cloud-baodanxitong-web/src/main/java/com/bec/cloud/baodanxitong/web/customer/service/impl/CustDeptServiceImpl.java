package com.bec.cloud.baodanxitong.web.customer.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONObject;
import com.bec.cloud.auth.core.support.Constant;
import com.bec.cloud.baodanxitong.web.customer.dao.CustDotMapper;
import com.bec.cloud.baodanxitong.web.customer.model.CustDot;
import com.bec.cloud.baodanxitong.web.customer.model.req.CustDeptReq;
import com.bec.cloud.baodanxitong.web.customer.model.resp.CustDeptDetailResp;
import com.bec.cloud.baodanxitong.web.customer.model.resp.CustDeptSimpleResp;
import com.bec.cloud.baodanxitong.web.customer.service.CustDeptService;
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
public class CustDeptServiceImpl implements CustDeptService {
	@Autowired
	private UserInfoUtil userInfoUtil;
	@Autowired
	private CustDotMapper custDotMapper;
	
	@Override
	public List<CustDeptSimpleResp> selectCustDeptSimpleResp(CustDeptSimpleResp record) {
		return custDotMapper.selectCustDeptSimpleResp(record);
	}
	
	@Override
	public CustDeptDetailResp selectCustDeptDetailRespByPrimaryKey(Long dotId) {
		CustDeptDetailResp resp=custDotMapper.selectCustDeptDetailRespByPrimaryKey(dotId);
		return resp;
	}
	
	@Override
	@Transactional(rollbackFor=Exception.class)
	public void update(String req) {
		UserInfo userInfo=userInfoUtil.simpleUserInfo();
		CustDeptReq record=JSONObject.toJavaObject(JSONObject.parseObject(req), CustDeptReq.class);
		CustDot custDot=initBean(new CustDot(), record);
		CheckParamUtil.checkParam(custDot, "dotName");//TODO 校验参数
		custDot.setAuditStatus(Constant.TaskStatus.UN_AUDIT);
		custDot.setDelStatus(Constant.DelStatus.NORMAL);
		custDot.setOperationTime(new Date());
		custDot.setOperationUserId(userInfo.getUserId());
		custDotMapper.updateByPrimaryKeySelective(custDot);
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
		CustDeptReq record=JSONObject.toJavaObject(JSONObject.parseObject(req), CustDeptReq.class);
		CustDot custDot=initBean(new CustDot(), record);
		CheckParamUtil.checkParam(custDot, "dotName");//TODO 校验参数
		custDot.setAuditStatus(Constant.TaskStatus.UN_AUDIT);
		custDot.setDelStatus(Constant.DelStatus.NORMAL);
		custDot.setEntryUserId(userInfo.getUserId());
		custDot.setOperationTime(new Date());
		custDot.setOperationUserId(userInfo.getUserId());
		custDot.setRecordTime(new Date());
		custDotMapper.insertSelective(custDot);
	}
}
