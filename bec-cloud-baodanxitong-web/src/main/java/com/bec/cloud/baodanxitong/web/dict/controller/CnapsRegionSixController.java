package com.bec.cloud.baodanxitong.web.dict.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bec.cloud.baodanxitong.web.dict.service.CnapsRegionSixService;

/**
 * 
 * @author niwei
 * @time   2018下午4:45:36
 * @description
 */
@RestController
@RequestMapping(value = "/cnapsRegionSix")
public class CnapsRegionSixController {

	@Autowired
	private CnapsRegionSixService cnapsRegionSixService;
}
