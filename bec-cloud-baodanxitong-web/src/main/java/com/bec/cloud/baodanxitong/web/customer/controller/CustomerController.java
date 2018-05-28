package com.bec.cloud.baodanxitong.web.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bec.cloud.baodanxitong.web.customer.service.CustomerService;

/**
 * 商户控制层
 * @author niwei
 * @time   2018下午3:09:13
 * @description
 */
@RestController
@RequestMapping(value="/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
}
