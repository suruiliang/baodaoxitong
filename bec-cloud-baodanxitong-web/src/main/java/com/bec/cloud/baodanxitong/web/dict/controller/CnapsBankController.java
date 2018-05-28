package com.bec.cloud.baodanxitong.web.dict.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bec.cloud.baodanxitong.web.dict.service.CnapsBankService;

/**
 * 
 * @author niwei
 * @time   2018下午4:37:11
 * @description
 */
@RestController
@RequestMapping(value="/cnapsBank")
public class CnapsBankController {
	@Autowired
	private CnapsBankService bankService;
}
