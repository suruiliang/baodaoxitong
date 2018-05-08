package com.bec.cloud.baodanxitong.web.auth.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bec.cloud.auth.core.support.Result;
import com.bec.cloud.baodanxitong.web.auth.model.AuthUser;
import com.bec.cloud.baodanxitong.web.auth.service.AuthUserService;
import com.bec.cloud.baodanxitong.web.util.PageUtil;


/**
* @author suruiliang
* @version 创建时间：2018年5月5日 上午11:05:06
* @ClassName 类名称
* @Description 类描述
*/
@RestController
@RequestMapping(value="/user")
public class AuthUserController {
	@Autowired
	private AuthUserService authUserService;
	
	@GetMapping(value="/list")
	public Result<?> list(HttpServletRequest request,AuthUser record) {
		PageUtil.startPage(request);
		return Result.success(authUserService.selectAuthUser(record));
	}
	
	@GetMapping(value="/view/{userId}")
	public Result<AuthUser> view(@PathVariable Long userId) {
		return Result.success(authUserService.selectByPrimaryKey(userId));
	}
	
	@PostMapping(value="/save")
	public Result<AuthUser> save(AuthUser record,String roleIds) {
		return Result.success(authUserService.saveAuthUser(record,roleIds));
	}
	
	@PostMapping(value="/setPasswd/{userId}")
	public Result<?> setPasswd(@PathVariable Long userId,String oldUserpasswd,String newUserpasswd) {
		return Result.success(authUserService.setPasswd(userId,oldUserpasswd,newUserpasswd));
	}
	
	@PostMapping(value="/del/{userId}")
	public Result<?> delete(@PathVariable Long userId) {
		return Result.success(authUserService.deleteAuthUser(userId));
	}
	
	@PostMapping(value="/delbatch")
	public Result<?> deleteBatch(String userIds) {
		return Result.success(authUserService.deleteAuthUser(userIds));
	}
	
	@PostMapping(value="/forbidden/{userId}")
	public Result<?> forbidden(@PathVariable Long userId) {
		return Result.success(authUserService.forbiddenAuthUser(userId));
	}
	
	@PostMapping(value="/forbiddenbatch")
	public Result<?> forbiddenBatch(String userIds) {
		return Result.success(authUserService.forbiddenAuthUser(userIds));
	}
	
	@PostMapping(value="/restore/{userId}")
	public Result<?> restore(@PathVariable Long userId) {
		return Result.success(authUserService.restoreAuthUser(userId));
	}
	
	@PostMapping(value="/restorebatch")
	public Result<?> restoreBatch(String userIds) {
		return Result.success(authUserService.restoreAuthUser(userIds));
	}

}
