package com.bec.cloud.baodanxitong.web.dict.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bec.cloud.auth.core.support.Result;
import com.bec.cloud.baodanxitong.web.dict.model.CnapsRegionFour;
import com.bec.cloud.baodanxitong.web.dict.service.CnapsRegionFourService;
import com.bec.cloud.baodanxitong.web.util.PageUtil;

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
	
	@PostMapping(value="/add")
	public Result<?> add(HttpServletRequest request,CnapsRegionFour record){

		return Result.success(cnapsRegionFourService.insertSelective(record));
	}
	
	@PostMapping(value="/modify")
	public Result<?> modify(HttpServletRequest request,CnapsRegionFour record){
		
		return Result.success(cnapsRegionFourService.updateByPrimaryKeySelective(record));
	}
	
	@PostMapping(value="/remove")
	public Result<?> remove(HttpServletRequest request,String cnapsRegion){
		
		return Result.success(cnapsRegionFourService.deleteByPrimaryKey(cnapsRegion));
	}
	
	@GetMapping(value="/list")
	public Result<?> list(HttpServletRequest request,CnapsRegionFour record){
		
		PageUtil.startPage(request);
		return Result.success(cnapsRegionFourService.selectCnapsRegionFour(record));
	}
}
