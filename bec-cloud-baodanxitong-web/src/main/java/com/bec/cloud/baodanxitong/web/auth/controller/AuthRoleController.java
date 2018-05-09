package com.bec.cloud.baodanxitong.web.auth.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bec.cloud.auth.core.support.Result;
import com.bec.cloud.baodanxitong.web.auth.model.AuthRole;
import com.bec.cloud.baodanxitong.web.auth.service.AuthRoleService;
import com.bec.cloud.baodanxitong.web.util.PageUtil;
import com.bec.cloud.service.example.utils.CheckParamUtil;


/**
 * 
 * @date 2018年5月7日下午3:54:18
 * @author suruiliang
 *
 */
@RestController
@RequestMapping(value="/role")
public class AuthRoleController {
	@Autowired
	private AuthRoleService authRoleService;
	
	@GetMapping(value="/list")
	public Result<?> list(HttpServletRequest request,AuthRole record) {
		PageUtil.startPage(request);
		return Result.success(authRoleService.selectAuthRole(record));
	}
	
	@GetMapping(value="/view/{roleId}")
	public Result<AuthRole> view(@PathVariable Integer roleId) {
		return Result.success(authRoleService.selectByPrimaryKey(roleId));
	}
	
	@PostMapping(value="/save")
	public Result<AuthRole> save(AuthRole record,String authString) {
		CheckParamUtil.checkParam(record, "roleName","roleCode","roleType");
		return Result.success(authRoleService.saveAuthRole(record,authString));
	}
	
	@PostMapping(value="/del/{roleId}")
	public Result<?> delete(@PathVariable Integer roleId) {
		return Result.success(authRoleService.deleteAuthRole(roleId));
	}
	
	@PostMapping(value="/delbatch")
	public Result<?> deleteBatch(String roleIds) {
		return Result.success(authRoleService.deleteAuthRole(roleIds));
	}

}
