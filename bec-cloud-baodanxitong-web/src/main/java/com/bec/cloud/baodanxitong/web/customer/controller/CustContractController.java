package com.bec.cloud.baodanxitong.web.customer.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bec.cloud.auth.core.support.Result;
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
	
	@GetMapping(value="/list")
	public Result<?> list(HttpServletRequest request,CustContract custContract){
		PageUtil.startPage(request);
		return Result.success(contractService.selectByPrimaryKey(66L));
	}
	
}
