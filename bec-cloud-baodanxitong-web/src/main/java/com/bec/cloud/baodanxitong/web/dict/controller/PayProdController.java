package com.bec.cloud.baodanxitong.web.dict.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bec.cloud.baodanxitong.web.dict.service.PayProdService;

/**
 * 
 * @author niwei
 * @time   2018下午4:48:46
 * @description
 */
@RestController
@RequestMapping(value="/payProd")
public class PayProdController {
	
	@Autowired
	private PayProdService payProdService;
}
