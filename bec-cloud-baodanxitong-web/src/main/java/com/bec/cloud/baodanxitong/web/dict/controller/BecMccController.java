package com.bec.cloud.baodanxitong.web.dict.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.bec.cloud.baodanxitong.web.dict.service.BecMccService;

/**
 * 
 * @author niwei
 * @time   2018下午4:18:06
 * @description
 */
@RestController
@RequestMapping(value="/becMcc")
public class BecMccController {
	@Autowired
	private BecMccService becMccService;

}
