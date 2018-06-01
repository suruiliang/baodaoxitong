package com.bec.cloud.baodanxitong.web.dict.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bec.cloud.auth.core.support.Result;
import com.bec.cloud.baodanxitong.web.dict.model.BecMccCategory;
import com.bec.cloud.baodanxitong.web.dict.service.BecMccCategoryService;
import com.bec.cloud.baodanxitong.web.util.PageUtil;

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
	
	@PostMapping(value="/add")
	public Result<?> add(HttpServletRequest request,BecMccCategory record){

		return Result.success(becMccCategoryService.insertSelective(record));
	}
	
	@PostMapping(value="/modify")
	public Result<?> modify(HttpServletRequest request,BecMccCategory record){
		
		return Result.success(becMccCategoryService.updateByPrimaryKeySelective(record));
	}
	
	@PostMapping(value="/remove")
	public Result<?> remove(HttpServletRequest request,Integer categoryId){
		
		return Result.success(becMccCategoryService.deleteByPrimaryKey(categoryId));
	}
	
	@GetMapping(value="/list")
	public Result<?> list(HttpServletRequest request,BecMccCategory record){
		
		PageUtil.startPage(request);
		return Result.success(becMccCategoryService.selectBecMccCategory(record));
	}
}
