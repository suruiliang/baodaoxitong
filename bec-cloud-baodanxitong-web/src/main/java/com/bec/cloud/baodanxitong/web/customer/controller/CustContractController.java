package com.bec.cloud.baodanxitong.web.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bec.cloud.baodanxitong.web.customer.service.CustContractService;

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
}
