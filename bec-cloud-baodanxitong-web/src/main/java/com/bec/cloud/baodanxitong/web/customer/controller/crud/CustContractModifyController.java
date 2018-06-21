package com.bec.cloud.baodanxitong.web.customer.controller.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bec.cloud.baodanxitong.web.customer.service.crud.CustContractModifyService;

/**
 * 合同变更控制层
 * @author niwei
 * @time   2018下午2:55:52
 * @description
 */
@RestController
@RequestMapping(value = "/custContractModify")
public class CustContractModifyController {

	@Autowired
	private CustContractModifyService contractModifyService;
}
