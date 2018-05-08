package com.bec.cloud.baodanxitong.web.auth.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bec.cloud.auth.core.support.Result;
import com.bec.cloud.baodanxitong.web.auth.model.ServiceManagement;
import com.bec.cloud.baodanxitong.web.auth.service.ServiceManagementService;
import com.bec.cloud.baodanxitong.web.util.PageUtil;


/**
 * 
 * @date 2018年5月7日下午3:54:18
 * @author suruiliang
 *
 */
@RestController
@RequestMapping(value="/service")
public class ServiceManagementController {
	@Autowired
	private ServiceManagementService serviceManagementService;
	
	@GetMapping(value="/list")
	public Result<?> list(HttpServletRequest request,ServiceManagement record) {
		PageUtil.startPage(request);
		return Result.success(serviceManagementService.selectServiceManagement(record));
	}
	
	@GetMapping(value="/view/{serviceId}")
	public Result<ServiceManagement> view(@PathVariable Long serviceId) {
		return Result.success(serviceManagementService.selectByPrimaryKey(serviceId));
	}
	
	@PostMapping(value="/save")
	public Result<ServiceManagement> save(ServiceManagement record) {
		return Result.success(serviceManagementService.saveServiceManagement(record));
	}
	
	@PostMapping(value="/del/{serviceId}")
	public Result<?> delete(@PathVariable Long serviceId) {
		return Result.success(serviceManagementService.deleteServiceManagement(serviceId));
	}

}
