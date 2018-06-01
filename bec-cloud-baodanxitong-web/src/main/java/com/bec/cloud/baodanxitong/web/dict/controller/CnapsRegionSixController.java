package com.bec.cloud.baodanxitong.web.dict.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bec.cloud.auth.core.support.Result;
import com.bec.cloud.baodanxitong.web.dict.model.CnapsRegionSix;
import com.bec.cloud.baodanxitong.web.dict.service.CnapsRegionSixService;
import com.bec.cloud.baodanxitong.web.util.PageUtil;

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
	
	@PostMapping(value="/add")
	public Result<?> add(HttpServletRequest request,CnapsRegionSix record){

		return Result.success(cnapsRegionSixService.insertSelective(record));
	}
	
	@PostMapping(value="/modify")
	public Result<?> modify(HttpServletRequest request,CnapsRegionSix record){
		
		return Result.success(cnapsRegionSixService.updateByPrimaryKeySelective(record));
	}
	
	@PostMapping(value="/remove")
	public Result<?> remove(HttpServletRequest request,String cnapsRegion){
		
		return Result.success(cnapsRegionSixService.deleteByPrimaryKey(cnapsRegion));
	}
	
	@GetMapping(value="/list")
	public Result<?> list(HttpServletRequest request,CnapsRegionSix record){
		
		PageUtil.startPage(request);
		return Result.success(cnapsRegionSixService.selectCnapsRegionSix(record));
	}
}
