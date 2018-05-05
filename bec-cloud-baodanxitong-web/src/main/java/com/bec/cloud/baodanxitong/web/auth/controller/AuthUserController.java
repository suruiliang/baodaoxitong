package com.bec.cloud.baodanxitong.web.auth.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bec.cloud.auth.core.support.Result;
import com.bec.cloud.auth.core.utils.ResultUtil;
import com.bec.cloud.baodanxitong.web.auth.model.AuthUser;
import com.bec.cloud.baodanxitong.web.auth.service.AuthUserService;
import com.bec.cloud.baodanxitong.web.util.PageUtil;


/**
* @author suruiliang
* @version 创建时间：2018年5月5日 上午11:05:06
* @ClassName 类名称
* @Description 类描述
*/
@RestController
@RequestMapping(value="/user")
public class AuthUserController {
	@Autowired
	private AuthUserService authUserService;
	
	@GetMapping(value="/list")
	public Result<?> list(HttpServletRequest request,AuthUser record) {
		PageUtil.startPage(request);
		return ResultUtil.success(authUserService.selectAuthUser(record));
	}

}
