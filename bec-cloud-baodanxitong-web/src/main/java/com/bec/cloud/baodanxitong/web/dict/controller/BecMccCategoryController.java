package com.bec.cloud.baodanxitong.web.dict.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bec.cloud.baodanxitong.web.dict.service.BecMccCategoryService;

/**
 * 
 * @author niwei
 * @time   2018下午4:21:55
 * @description
 */
@RestController
@RequestMapping(value="/becMccCategory")
public class BecMccCategoryController {
	@Autowired
	private BecMccCategoryService becMccCategoryService;
}
