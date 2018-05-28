package com.bec.cloud.baodanxitong.web.dict.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bec.cloud.baodanxitong.web.dict.service.CnapsRegionFourService;

/**
 * 
 * @author niwei
 * @time   2018下午4:40:52
 * @description
 */
@RestController
@RequestMapping(value="/cnapsRegionFour")
public class CnapsRegionFourController {
	@Autowired
	private CnapsRegionFourService cnapsRegionFourService;
}
