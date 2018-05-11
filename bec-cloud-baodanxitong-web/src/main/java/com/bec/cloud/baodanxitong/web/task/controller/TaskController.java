package com.bec.cloud.baodanxitong.web.task.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.bec.cloud.auth.core.exception.BecException;
import com.bec.cloud.auth.core.exception.BecExceptionEnum;
import com.bec.cloud.auth.core.support.Result;
import com.bec.cloud.baodanxitong.web.task.model.Task;
import com.bec.cloud.baodanxitong.web.task.service.FinishedTaskService;
import com.bec.cloud.baodanxitong.web.task.service.GroupTaskService;
import com.bec.cloud.baodanxitong.web.task.service.SelfTaskService;
import com.bec.cloud.baodanxitong.web.util.PageUtil;
import com.bec.cloud.service.example.model.UserInfo;
import com.bec.cloud.service.example.utils.UserInfoUtil;


/**
* @author suruiliang
* @version 创建时间：2018年5月10日 下午1:06:00
* @ClassName 类名称
* @Description 类描述
*/
@RestController
@RequestMapping(value="/task")
public class TaskController {
	@Autowired
	private SelfTaskService selfTaskService;
	@Autowired
	private GroupTaskService groupTaskService;
	@Autowired
	private FinishedTaskService finishedTaskService;
	@Autowired
	private UserInfoUtil userInfoUtil;
	
	@GetMapping(value="/self/list")
	public Result<?> selfList(HttpServletRequest request,Task record) {
		UserInfo userInfo=userInfoUtil.simpleUserInfo();
		if (userInfo==null) {
			throw new BecException(BecExceptionEnum.NORIGHT_EXCEPTION);
		}
		PageUtil.startPage(request);
		return Result.success(selfTaskService.selfListTask(userInfo,record));
	}
	
	@GetMapping(value="/self/view/{taskId}")
	public Result<?> selfView(@PathVariable Long taskId) {
		return Result.success(selfTaskService.selfViewTask(taskId));
	}
	
	@PostMapping(value="/self/update/{taskId}")
	public Result<?> selfUpdate(@PathVariable Long taskId,@RequestParam Map<String,Object> map) {
		return Result.success(selfTaskService.selfUpdateTask(taskId,new JSONObject(map)));
	}
	
	@PostMapping(value="/self/del/{taskId}")
	public Result<?> selfDelete(@PathVariable Long taskId) {
		return Result.success(selfTaskService.selfDeleteTask(taskId));
	}
	
	@PostMapping(value="/self/delbatch")
	public Result<?> selfBatchDelete(String taskIds) {
		return Result.success(selfTaskService.selfDeleteTask(taskIds));
	}
	
	@GetMapping(value="/group/list")
	public Result<?> groupList(HttpServletRequest request,Task record) {
		UserInfo userInfo=userInfoUtil.simpleUserInfo();
		if (userInfo==null) {
			throw new BecException(BecExceptionEnum.NORIGHT_EXCEPTION);
		}
		PageUtil.startPage(request);
		return Result.success(groupTaskService.groupListTask(userInfo,record));
	}
	
	@GetMapping(value="/group/view/{taskId}")
	public Result<?> groupView(@PathVariable Long taskId) {
		return Result.success(groupTaskService.groupViewTask(taskId));
	}
	
	@PostMapping(value="/group/accept/{taskId}")
	public Result<?> groupAccept(@PathVariable Long taskId,@RequestParam Map<String,Object> map) {
		return Result.success(groupTaskService.groupAcceptTask(taskId,new JSONObject(map)));
	}
	
	@PostMapping(value="/group/reject/{taskId}")
	public Result<?> groupReject(@PathVariable Long taskId,String rejectReason) {
		return Result.success(groupTaskService.groupRejectTask(taskId,rejectReason));
	}
	
	@PostMapping(value="/group/rejectbatch")
	public Result<?> groupBatchReject(String taskIds,String rejectReason) {
		return Result.success(groupTaskService.groupRejectTask(taskIds,rejectReason));
	}
	
	@GetMapping(value="/finished/list")
	public Result<?> finishedList(HttpServletRequest request,Task record) {
		UserInfo userInfo=userInfoUtil.simpleUserInfo();
		if (userInfo==null) {
			throw new BecException(BecExceptionEnum.NORIGHT_EXCEPTION);
		}
		PageUtil.startPage(request);
		return Result.success(finishedTaskService.finishedListTask(userInfo,record));
	}
	
	@GetMapping(value="/finished/view/{taskId}")
	public Result<Task> finishedView(@PathVariable Long taskId) {
		return Result.success(finishedTaskService.finishedViewTask(taskId));
	}

}
