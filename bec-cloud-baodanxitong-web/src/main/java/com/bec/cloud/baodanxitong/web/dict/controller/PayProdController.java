package com.bec.cloud.baodanxitong.web.dict.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bec.cloud.auth.core.support.Result;
import com.bec.cloud.baodanxitong.web.dict.model.BecMcc;
import com.bec.cloud.baodanxitong.web.dict.model.PayProd;
import com.bec.cloud.baodanxitong.web.dict.service.PayProdService;
import com.bec.cloud.baodanxitong.web.util.PageUtil;

/**
 * 
 * @author niwei
 * @time   2018下午4:48:46
 * @description
 */
@RestController
@RequestMapping(value="/payProd")
public class PayProdController {
	
	@Autowired
	private PayProdService payProdService;
	
	@PostMapping(value="/add")
	public Result<?> add(HttpServletRequest request,PayProd record){

		return Result.success(payProdService.insertSelective(record));
	}
	
	@PostMapping(value="/modify")
	public Result<?> modify(HttpServletRequest request,PayProd record){
		
		return Result.success(payProdService.updateByPrimaryKeySelective(record));
	}
	
	@PostMapping(value="/remove")
	public Result<?> remove(HttpServletRequest request,Integer prodId){
		
		return Result.success(payProdService.deleteByPrimaryKey(prodId));
	}
	
	@GetMapping(value="/list")
	public Result<?> list(HttpServletRequest request,PayProd record){
		
		PageUtil.startPage(request);
		return Result.success(payProdService.selectPayProd(record));
	}
}
