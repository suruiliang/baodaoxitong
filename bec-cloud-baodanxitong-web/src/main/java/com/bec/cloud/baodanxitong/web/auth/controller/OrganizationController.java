package com.bec.cloud.baodanxitong.web.auth.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bec.cloud.auth.core.support.Result;
import com.bec.cloud.baodanxitong.web.auth.model.Organization;
import com.bec.cloud.baodanxitong.web.auth.service.OrganizationService;
import com.bec.cloud.baodanxitong.web.util.PageUtil;
import com.bec.cloud.service.example.utils.CheckParamUtil;


/**
 * 
 * @date 2018年5月7日下午3:54:18
 * @author suruiliang
 *
 */
@RestController
@RequestMapping(value="/org")
public class OrganizationController {
	@Autowired
	private OrganizationService organizationService;
	
	@GetMapping(value="/list")
	public Result<?> list(HttpServletRequest request,Organization record) {
		PageUtil.startPage(request);
		return Result.success(organizationService.selectOrganization(record));
	}
	
	@GetMapping(value="/view/{orgId}")
	public Result<Organization> view(@PathVariable Long orgId) {
		return Result.success(organizationService.selectByPrimaryKey(orgId));
	}
	
	@PostMapping(value="/save")
	public Result<Organization> save(Organization record) {
		CheckParamUtil.checkParam(record, "orgName","orgPhone","legalName","legalPhone","busAddress");
		return Result.success(organizationService.saveOrganization(record));
	}
	
	@PostMapping(value="/del/{orgId}")
	public Result<?> delete(@PathVariable Long orgId) {
		return Result.success(organizationService.deleteOrganization(orgId));
	}

}
