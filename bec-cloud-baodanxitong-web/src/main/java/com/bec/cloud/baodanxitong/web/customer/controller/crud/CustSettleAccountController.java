package com.bec.cloud.baodanxitong.web.customer.controller.crud;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bec.cloud.auth.core.support.Result;
import com.bec.cloud.baodanxitong.web.auth.model.AuthUser;
import com.bec.cloud.baodanxitong.web.customer.model.CustSettleAccount;
import com.bec.cloud.baodanxitong.web.customer.model.Customer;
import com.bec.cloud.baodanxitong.web.customer.service.crud.CustSettleAccountService;
import com.bec.cloud.baodanxitong.web.util.PageUtil;

/**
 * 
 * @author niwei
 * @time   2018下午3:35:17
 * @description
 */
@RestController
@RequestMapping(value="/custSettleAccount")
public class CustSettleAccountController {
	
	@Autowired
	private CustSettleAccountService accountService;

	
	/**
	 * 获取门店终端全部信息
	 * @author niwei
	 * @time   2018下午2:34:21
	 * @param request
	 * @param custContract
	 * @return
	 */
	@GetMapping(value="/list")
	public Result<?> list(HttpServletRequest request, CustSettleAccount info){
		PageUtil.startPage(request);
		return Result.success(accountService.selectustCustSettleAccounts(info));
	}
	
	/**
	 * 获取单个门店终端信息
	 * @author niwei
	 * @time   2018下午2:36:39
	 * @param contId
	 * @return
	 */
	@GetMapping(value="/view/{accountId}")
	public Result<CustSettleAccount> view(@PathVariable Long accountId) {
		return Result.success(accountService.selectByPrimaryKey(accountId));
	}
	
	/**
	 * 保存门店
	 * @author niwei
	 * @time   2018下午2:37:28
	 * @param record
	 * @param roleIds
	 * @return
	 */
	@PostMapping(value="/save")
	public Result<Customer> save(AuthUser record,String roleIds) {
		//CheckParamUtil.checkParam(record, "orgCode","userName","realName","userPasswd","userIdentity","userType");
		//return Result.success(authUserService.saveAuthUser(record,roleIds));
		return null;
	}
	
	/**
	 * 删除单个门店终端信息
	 * @author niwei
	 * @time   2018下午2:37:44
	 * @param contId
	 * @return
	 */
	@PostMapping(value="/del/{accountId}")
	public Result<?> delete(@PathVariable Long accountId) {
		return Result.success(accountService.deleteByPrimaryKey(accountId));
	}
	
	/**
	 * 批量删除门店终端   TODO待定
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
