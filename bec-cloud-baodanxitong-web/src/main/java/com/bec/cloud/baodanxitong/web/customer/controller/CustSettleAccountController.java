package com.bec.cloud.baodanxitong.web.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bec.cloud.baodanxitong.web.customer.service.CustSettleAccountService;

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

}
