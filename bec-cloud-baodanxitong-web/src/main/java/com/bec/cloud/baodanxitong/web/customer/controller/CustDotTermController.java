package com.bec.cloud.baodanxitong.web.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bec.cloud.baodanxitong.web.customer.service.CustDotTermService;

/**
 * 
 * @author niwei
 * @time   2018下午3:21:44
 * @description
 */
@RestController
@RequestMapping(value="/custDotTerm")
public class CustDotTermController {
	@Autowired
	private CustDotTermService custDotTermService;
}
