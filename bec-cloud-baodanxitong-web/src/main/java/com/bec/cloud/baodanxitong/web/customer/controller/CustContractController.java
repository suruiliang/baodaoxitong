package com.bec.cloud.baodanxitong.web.customer.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bec.cloud.auth.core.support.Result;
import com.bec.cloud.baodanxitong.web.auth.model.AuthUser;
import com.bec.cloud.baodanxitong.web.customer.model.CustContract;
import com.bec.cloud.baodanxitong.web.customer.service.CustContractService;
import com.bec.cloud.baodanxitong.web.util.PageUtil;

/**
 * 合同控制层
 * @author niwei
 * @time   2018下午2:47:32
 * @description
 */
@RestController
@RequestMapping(value="/custContract")
public class CustContractController {
	@Autowired
	private CustContractService contractService;
	
	/**
	 * 获取合同全部信息
	 * @author niwei
	 * @time   2018下午2:34:21
	 * @param request
	 * @param custContract
	 * @return
	 */
	@GetMapping(value="/list")
	public Result<?> list(HttpServletRequest request,CustContract custContract){
		PageUtil.startPage(request);
		return Result.success(contractService.selectCustContracts(custContract));
	}
	
	/**
	 * 获取单个合同信息
	 * @author niwei
	 * @time   2018下午2:36:39
	 * @param contId
	 * @return
	 */
	@GetMapping(value="/view/{contId}")
	public Result<CustContract> view(@PathVariable Long contId) {
		return Result.success(contractService.selectByPrimaryKey(contId));
	}
	
	/**
	 * 保存合同
	 * @author niwei
	 * @time   2018下午2:37:28
	 * @param record
	 * @param roleIds
	 * @return
	 */
	@PostMapping(value="/save")
	public Result<AuthUser> save(AuthUser record,String roleIds) {
		//CheckParamUtil.checkParam(record, "orgCode","userName","realName","userPasswd","userIdentity","userType");
		//return Result.success(authUserService.saveAuthUser(record,roleIds));
		return null;
	}
	
	/**
	 * 删除单个合同信息
	 * @author niwei
	 * @time   2018下午2:37:44
	 * @param contId
	 * @return
	 */
	@PostMapping(value="/del/{contId}")
	public Result<?> delete(@PathVariable Long contId) {
		return Result.success(contractService.deleteByPrimaryKey(contId));
	}
	
	/**
	 * 批量删除合同   TODO待定
	 * @author niwei
	 * @time   2018下午2:40:22
	 * @param userIds
	 * @return
	 */
	@PostMapping(value="/delbatch")
	public Result<?> deleteBatch(String userIds) {
		return Result.success("");
	}
	
	
}
