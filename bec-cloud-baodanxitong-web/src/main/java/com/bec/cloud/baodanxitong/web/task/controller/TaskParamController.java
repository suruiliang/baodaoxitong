package com.bec.cloud.baodanxitong.web.task.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bec.cloud.auth.core.support.Result;
import com.bec.cloud.baodanxitong.web.task.model.TaskParam;
import com.bec.cloud.baodanxitong.web.task.service.TaskParamService;
import com.bec.cloud.baodanxitong.web.util.PageUtil;

/**
* @author suruiliang
* @version 创建时间：2018年5月11日 下午3:24:13
* @ClassName 类名称
* @Description 类描述
*/
@RestController
@RequestMapping(value="/task/param")
public class TaskParamController {
	@Autowired
	private TaskParamService taskParamService;
	
	@GetMapping(value="/list")
	public Result<?> list(HttpServletRequest request,TaskParam record) {
		PageUtil.startPage(request);
		return Result.success(taskParamService.selectTaskParam(record));
	}
}
