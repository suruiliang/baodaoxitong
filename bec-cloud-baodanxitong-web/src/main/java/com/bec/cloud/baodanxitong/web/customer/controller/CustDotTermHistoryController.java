package com.bec.cloud.baodanxitong.web.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bec.cloud.baodanxitong.web.customer.service.CustDotTermHistoryService;

/**
 * 
 * @author niwei
 * @time   2018下午3:29:19
 * @description
 */
@RestController
@RequestMapping(value="/custDotTermHistory")
public class CustDotTermHistoryController {

	@Autowired
	private CustDotTermHistoryService custDotTermHistoryService;
}
