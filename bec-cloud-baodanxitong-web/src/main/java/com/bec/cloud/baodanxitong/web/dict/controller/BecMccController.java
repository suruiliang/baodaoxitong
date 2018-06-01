package com.bec.cloud.baodanxitong.web.dict.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bec.cloud.auth.core.support.Result;
import com.bec.cloud.baodanxitong.web.dict.model.BecMcc;
import com.bec.cloud.baodanxitong.web.dict.service.BecMccService;
import com.bec.cloud.baodanxitong.web.util.PageUtil;

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

	@PostMapping(value="/add")
	public Result<?> add(HttpServletRequest request,BecMcc record){

		return Result.success(becMccService.insertSelective(record));
	}
	
	@PostMapping(value="/modify")
	public Result<?> modify(HttpServletRequest request,BecMcc record){
		
		return Result.success(becMccService.updateByPrimaryKeySelective(record));
	}
	
	@PostMapping(value="/remove")
	public Result<?> remove(HttpServletRequest request,Integer categoryId){
		
		return Result.success(becMccService.deleteByPrimaryKey(categoryId));
	}
	
	@GetMapping(value="/list")
	public Result<?> list(HttpServletRequest request,BecMcc record){
		
		PageUtil.startPage(request);
		return Result.success(becMccService.selectBecMcc(record));
	}
}
