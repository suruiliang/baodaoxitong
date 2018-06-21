package com.bec.cloud.baodanxitong.web.customer.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONObject;
import com.bec.cloud.auth.core.support.Constant;
import com.bec.cloud.baodanxitong.web.customer.dao.CustBusiLicenseMapper;
import com.bec.cloud.baodanxitong.web.customer.dao.CustContractMapper;
import com.bec.cloud.baodanxitong.web.customer.dao.CustSettleAccountMapper;
import com.bec.cloud.baodanxitong.web.customer.dao.CustomerMapper;
import com.bec.cloud.baodanxitong.web.customer.model.CustBusiLicense;
import com.bec.cloud.baodanxitong.web.customer.model.CustContract;
import com.bec.cloud.baodanxitong.web.customer.model.CustSettleAccount;
import com.bec.cloud.baodanxitong.web.customer.model.Customer;
import com.bec.cloud.baodanxitong.web.customer.model.req.CustBaseReq;
import com.bec.cloud.baodanxitong.web.customer.model.resp.CustBaseDetailResp;
import com.bec.cloud.baodanxitong.web.customer.model.resp.CustBaseSimpleResp;
import com.bec.cloud.baodanxitong.web.customer.service.CustBaseService;
import com.bec.cloud.baodanxitong.web.task.dao.TaskMapper;
import com.bec.cloud.baodanxitong.web.task.model.Task;
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
public class CustBaseServiceImpl implements CustBaseService {
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
	private TaskMapper taskMapper;


	@Override
	public List<CustBaseSimpleResp> selectCustBaseResp(CustBaseSimpleResp record) {
		return customerMapper.selectCustBaseResp(record);
	}

	@Override
	public CustBaseDetailResp selectCustBaseDetailRespByPrimaryKey(Long custId) {
		CustBaseDetailResp resp=customerMapper.selectCustBaseDetailRespByPrimaryKey(custId);
		return resp;
	}

	@Override
	@Transactional(rollbackFor=Exception.class)
	public void update(String req) {
		UserInfo userInfo=userInfoUtil.simpleUserInfo();
		CustBaseReq record=JSONObject.toJavaObject(JSONObject.parseObject(req), CustBaseReq.class);
		//1.customer
		Customer customer=initBean(new Customer(), record);
		CheckParamUtil.checkParam(customer, "categoryId");//TODO 校验参数
		String custCode="BEC"+System.currentTimeMillis();
		customer.setCustCode(custCode);
		customer.setOperationTime(new Date());
		customer.setOperationUserId(userInfo.getUserId());
		customer.setCustStatus(Constant.OnOffStatus.ON);
		customer.setDelStatus(Constant.DelStatus.NORMAL);
		customerMapper.updateByPrimaryKeySelective(customer);
		//2.cust_contract
		CustContract custContract=initBean(new CustContract(), record);
		CheckParamUtil.checkParam(custContract, "contCode");//TODO 校验参数
		custContract.setAuditStatus(Constant.TaskStatus.UN_AUDIT);
		custContract.setOperationTime(new Date());
		custContract.setOperationUserId(userInfo.getUserId());
		custContractMapper.updateByPrimaryKeySelective(custContract);
		//3.cust_busi_license
		CustBusiLicense custBusiLicense=initBean(new CustBusiLicense(), record);
		CheckParamUtil.checkParam(custBusiLicense, "cblCode");//TODO 校验参数
		custBusiLicense.setDelStatus(Constant.DelStatus.NORMAL);
		custBusiLicense.setOperationTime(new Date());
		custBusiLicense.setOperationUserId(userInfo.getUserId());
		custBusiLicenseMapper.updateByPrimaryKeySelective(custBusiLicense);
		//4.cust_settle_account
		CustSettleAccount custSettleAccount=initBean(new CustSettleAccount(), record);
		CheckParamUtil.checkParam(custSettleAccount, "accountType");//TODO 校验参数
		custSettleAccount.setAuditStatus(Constant.TaskStatus.UN_AUDIT);
		custSettleAccount.setDelStatus(Constant.DelStatus.NORMAL);
		custSettleAccount.setOperationTime(new Date());
		custSettleAccount.setOperationUserId(userInfo.getUserId());
		custSettleAccountMapper.updateByPrimaryKeySelective(custSettleAccount);
		//5.task
		Task task=new Task(customer.getCustId(), "报单申请", customer.getCustPhone(), customer.getCustName(), custCode, customer.getOrgCode(), "报单申请", "application", "application", Constant.FinishStatus.UNFINISH, Constant.TaskStatus.UN_AUDIT, Constant.DelStatus.NORMAL, new Date(), userInfo.getUserId(), userInfo.getUserId(), new Date(), OneButtonDeclarationServiceImpl.class.getName());
		taskMapper.insertSelective(task);
	}
	private <T,O> T initBean(T dest,O orig) {
		try {
			BeanUtils.copyProperties(dest, orig);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dest;
	}

}
