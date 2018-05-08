package com.bec.cloud.baodanxitong.web.auth.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bec.cloud.auth.core.support.Result;
import com.bec.cloud.baodanxitong.web.auth.model.AuthLog;
import com.bec.cloud.baodanxitong.web.auth.service.AuthLogService;
import com.bec.cloud.baodanxitong.web.util.PageUtil;


/**
 * 
 * @date 2018年5月7日下午3:54:18
 * @author suruiliang
 *
 */
@RestController
@RequestMapping(value="/log")
public class AuthLogController {
	@Autowired
	private AuthLogService authLogService;
	
	@GetMapping(value="/list")
	public Result<?> list(HttpServletRequest request,AuthLog record) {
		PageUtil.startPage(request);
		return Result.success(authLogService.selectAuthLog(record));
	}

}
