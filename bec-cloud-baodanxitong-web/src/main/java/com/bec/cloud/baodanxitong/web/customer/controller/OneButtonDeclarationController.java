package com.bec.cloud.baodanxitong.web.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bec.cloud.auth.core.support.Result;
import com.bec.cloud.baodanxitong.web.customer.service.OneButtonDeclarationService;

/**
* @author suruiliang
* @version 创建时间：2018年6月19日 上午11:19:51
* @ClassName 类名称
* @Description 一键报单
*/
@RestController
@RequestMapping(value="/cust/oneButton")
public class OneButtonDeclarationController {
	@Autowired
	private OneButtonDeclarationService service;

	@PostMapping("/add")
	public Result<?> add(String req){
		service.add(req);
		return Result.success(null);
	}

}
