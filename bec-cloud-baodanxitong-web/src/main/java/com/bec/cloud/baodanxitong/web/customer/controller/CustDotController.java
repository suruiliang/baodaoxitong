package com.bec.cloud.baodanxitong.web.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bec.cloud.baodanxitong.web.customer.service.CustDotService;

/**
 * 
 * @author niwei
 * @time   2018下午3:14:29
 * @description
 */
@RestController
@RequestMapping(value="/custDot")
public class CustDotController {
	@Autowired
	private CustDotService custDotService;
}
