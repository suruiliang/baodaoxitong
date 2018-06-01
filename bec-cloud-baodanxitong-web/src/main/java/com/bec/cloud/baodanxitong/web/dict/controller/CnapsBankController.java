package com.bec.cloud.baodanxitong.web.dict.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bec.cloud.auth.core.support.Result;
import com.bec.cloud.baodanxitong.web.dict.model.CnapsBank;
import com.bec.cloud.baodanxitong.web.dict.service.CnapsBankService;
import com.bec.cloud.baodanxitong.web.util.PageUtil;

/**
 * 
 * @author niwei
 * @time   2018下午4:37:11
 * @description
 */
@RestController
@RequestMapping(value="/cnapsBank")
public class CnapsBankController {
	@Autowired
	private CnapsBankService bankService;
	
	@PostMapping(value="/add")
	public Result<?> add(HttpServletRequest request,CnapsBank record){

		return Result.success(bankService.insertSelective(record));
	}
	
	@PostMapping(value="/modify")
	public Result<?> modify(HttpServletRequest request,CnapsBank record){
		
		return Result.success(bankService.updateByPrimaryKeySelective(record));
	}
	
	@PostMapping(value="/remove")
	public Result<?> remove(HttpServletRequest request,String bankcode){
		
		return Result.success(bankService.deleteByPrimaryKey(bankcode));
	}
	
	@GetMapping(value="/list")
	public Result<?> list(HttpServletRequest request,CnapsBank record){
		
		PageUtil.startPage(request);
		return Result.success(bankService.selectCnapsBank(record));
	}
}
