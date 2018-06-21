package com.bec.cloud.baodanxitong.web.customer.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bec.cloud.auth.core.support.Constant;
import com.bec.cloud.baodanxitong.web.customer.dao.CustBusiLicenseMapper;
import com.bec.cloud.baodanxitong.web.customer.dao.CustContractMapper;
import com.bec.cloud.baodanxitong.web.customer.dao.CustDotDeviceMapper;
import com.bec.cloud.baodanxitong.web.customer.dao.CustDotMapper;
import com.bec.cloud.baodanxitong.web.customer.dao.CustSettleAccountMapper;
import com.bec.cloud.baodanxitong.web.customer.dao.CustomerMapper;
import com.bec.cloud.baodanxitong.web.customer.model.CustBusiLicense;
import com.bec.cloud.baodanxitong.web.customer.model.CustContract;
import com.bec.cloud.baodanxitong.web.customer.model.CustDot;
import com.bec.cloud.baodanxitong.web.customer.model.CustDotDevice;
import com.bec.cloud.baodanxitong.web.customer.model.CustSettleAccount;
import com.bec.cloud.baodanxitong.web.customer.model.Customer;
import com.bec.cloud.baodanxitong.web.customer.model.req.CustBaseReq;
import com.bec.cloud.baodanxitong.web.customer.model.req.CustDeptReq;
import com.bec.cloud.baodanxitong.web.customer.model.req.CustDeviceReq;
import com.bec.cloud.baodanxitong.web.customer.service.OneButtonDeclarationService;
import com.bec.cloud.baodanxitong.web.task.dao.TaskMapper;
import com.bec.cloud.baodanxitong.web.task.model.Task;
import com.bec.cloud.baodanxitong.web.task.service.TaskBaseService;
import com.bec.cloud.service.example.model.UserInfo;
import com.bec.cloud.service.example.utils.CheckParamUtil;
import com.bec.cloud.service.example.utils.UserInfoUtil;


/**
 * @author suruiliang
 * @version 创建时间：2018年6月19日 下午2:07:40
 * @ClassName 类名称
 * @Description 类描述
 */
@Service
public class OneButtonDeclarationServiceImpl implements OneButtonDeclarationService,TaskBaseService<CustBaseReq> {
	@Autowired
	private UserInfoUtil userInfoUtil;
	@Autowired
	private CustomerMapper customerMapper;
	@Autowired
	private CustContractMapper custContractMapper;
	@Autowired
	private CustBusiLicenseMapper custBusiLicenseMapper;
	@Autowired
	private CustSettleAccountMapper custSettleAccountMapper;
	@Autowired
	private CustDotMapper custDotMapper;
	@Autowired
	private CustDotDeviceMapper custDotDeviceMapper;
	@Autowired
	private TaskMapper taskMapper;

	@Override
	@Transactional(rollbackFor=Exception.class)
	public void add(String req) {
		UserInfo userInfo=userInfoUtil.simpleUserInfo();
		CustBaseReq record=JSONObject.toJavaObject(JSONObject.parseObject(req), CustBaseReq.class);
		//1.customer
		Customer customer=initBean(new Customer(), record);
		CheckParamUtil.checkParam(customer, "categoryId");//TODO 校验参数
		String custCode="BEC"+System.currentTimeMillis();
		customer.setCustCode(custCode);
		customer.setEntryUserId(userInfo.getUserId());
		customer.setOperationTime(new Date());
		customer.setOperationUserId(userInfo.getUserId());
		customer.setRecordTime(new Date());
		customer.setCustStatus(Constant.OnOffStatus.ON);
		customer.setDelStatus(Constant.DelStatus.NORMAL);
		customerMapper.insertSelective(customer);
		//2.cust_contract
		CustContract custContract=initBean(new CustContract(), record);
		CheckParamUtil.checkParam(custContract, "contCode");//TODO 校验参数
		custContract.setAuditStatus(Constant.TaskStatus.UN_AUDIT);
		custContract.setCustId(customer.getCustId());
		custContract.setEntryUserId(userInfo.getUserId());
		custContract.setOperationTime(new Date());
		custContract.setOperationUserId(userInfo.getUserId());
		custContract.setRecordTime(new Date());
		custContractMapper.insertSelective(custContract);
		//3.cust_busi_license
		CustBusiLicense custBusiLicense=initBean(new CustBusiLicense(), record);
		CheckParamUtil.checkParam(custBusiLicense, "cblCode");//TODO 校验参数
		custBusiLicense.setCustId(customer.getCustId());
		custBusiLicense.setDelStatus(Constant.DelStatus.NORMAL);
		custBusiLicense.setEntryUserId(userInfo.getUserId());
		custBusiLicense.setOperationTime(new Date());
		custBusiLicense.setOperationUserId(userInfo.getUserId());
		custBusiLicense.setRecordTime(new Date());
		custBusiLicenseMapper.insertSelective(custBusiLicense);
		//4.cust_settle_account
		CustSettleAccount custSettleAccount=initBean(new CustSettleAccount(), record);
		CheckParamUtil.checkParam(custSettleAccount, "accountType");//TODO 校验参数
		custSettleAccount.setAuditStatus(Constant.TaskStatus.UN_AUDIT);
		custSettleAccount.setDelStatus(Constant.DelStatus.NORMAL);
		custSettleAccount.setCustId(customer.getCustId());		
		custSettleAccount.setEntryUserId(userInfo.getUserId());
		custSettleAccount.setOperationTime(new Date());
		custSettleAccount.setOperationUserId(userInfo.getUserId());
		custSettleAccount.setRecordTime(new Date());
		custSettleAccountMapper.insertSelective(custSettleAccount);
		//5.cust_dot
		List<CustDeptReq> custDeptInfos=initDeptAndDevice(req);
		if (custDeptInfos!=null&&custDeptInfos.size()>0) {
			for (CustDeptReq custDeptInfo : custDeptInfos) {
				CustDot custDot=initBean(new CustDot(), custDeptInfo);
				CheckParamUtil.checkParam(custDot, "dotName");//TODO 校验参数
				custDot.setAuditStatus(Constant.TaskStatus.UN_AUDIT);
				custDot.setDelStatus(Constant.DelStatus.NORMAL);
				custDot.setCustId(customer.getCustId());		
				custDot.setEntryUserId(userInfo.getUserId());
				custDot.setOperationTime(new Date());
				custDot.setOperationUserId(userInfo.getUserId());
				custDot.setRecordTime(new Date());
				custDotMapper.insertSelective(custDot);
				//6.cust_dot_term
				List<CustDeviceReq> custDeviceInfos=custDeptInfo.getCustDeviceInfos();
				if (custDeviceInfos!=null&&custDeviceInfos.size()>0) {
					for (CustDeviceReq custDeviceInfo : custDeviceInfos) {
						CustDotDevice custDotDevice=initBean(new CustDotDevice(), custDeviceInfo);
						CheckParamUtil.checkParam(custDotDevice, "useType");//TODO 校验参数
						custDotDevice.setDelStatus(Constant.DelStatus.NORMAL);
						custDotDevice.setCustId(customer.getCustId());
						custDotDevice.setDotId(custDot.getDotId());	
						custDotDevice.setEntryUserId(userInfo.getUserId());
						custDotDevice.setOperationTime(new Date());
						custDotDevice.setOperationUserId(userInfo.getUserId());
						custDotDevice.setRecordTime(new Date());
						custDotDeviceMapper.insertSelective(custDotDevice);
					}					
				}
			}
		}
		//7.task
		Task task=new Task(customer.getCustId(), "报单申请", customer.getCustPhone(), customer.getCustName(), custCode, customer.getOrgCode(), "报单申请", "application", "application", Constant.FinishStatus.UNFINISH, Constant.TaskStatus.UN_AUDIT, Constant.DelStatus.NORMAL, new Date(), userInfo.getUserId(), userInfo.getUserId(), new Date(), this.getClass().getName());
		taskMapper.insertSelective(task);
	}

	private List<CustDeptReq> initDeptAndDevice(String req) {
		List<CustDeptReq> custDeptInfos=new ArrayList<CustDeptReq>();
		String deptStr=JSONObject.parseObject(req).getString("deptStr");
		JSONArray deptArray=JSONArray.parseArray(deptStr);
		if (deptArray!=null&&deptArray.size()>0) {
			for (Object o : deptArray) {
				CustDeptReq custDeptInfo=JSONObject.toJavaObject((JSONObject) o, CustDeptReq.class);
				String deviceStr=((JSONObject) o).getString("deviceStr");
				JSONArray deviceArray=JSONArray.parseArray(deviceStr);
				if (deviceArray!=null&&deviceArray.size()>0) {
					List<CustDeviceReq> custDeviceInfos=new ArrayList<>();
					for (Object obj : deviceArray) {
						CustDeviceReq custDeviceInfo=JSONObject.toJavaObject((JSONObject)obj, CustDeviceReq.class);
						custDeviceInfos.add(custDeviceInfo);
					}	
					custDeptInfo.setCustDeviceInfos(custDeviceInfos);
				}
				custDeptInfos.add(custDeptInfo);
			}

		}
		return custDeptInfos;
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
	public CustBaseReq viewTask(Long launchId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, CustBaseReq> viewTaskCompare(Long launchId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustBaseReq updateTask(JSONObject json) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustBaseReq acceptTask(JSONObject json) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteTask(Long launchId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int rejectTask(Long launchId, String rejectReason) {
		// TODO Auto-generated method stub
		return 0;
	}

}
