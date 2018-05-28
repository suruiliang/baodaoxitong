package com.bec.cloud.baodanxitong.web.channel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bec.cloud.baodanxitong.web.channel.service.PayRouteMappingService;

/**
 * 
 * @author niwei
 * @time   2018下午4:12:56
 * @description
 */
@RestController
@RequestMapping(value="/payRouteMapping")
public class PayRouteMappingController {
	
	@Autowired
	private PayRouteMappingService mappingService;
}
