package com.bec.cloud.baodanxitong.web.task.service.impl;

import java.lang.reflect.Method;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONObject;
import com.bec.cloud.auth.core.exception.BecException;
import com.bec.cloud.auth.core.exception.BecExceptionEnum;
import com.bec.cloud.auth.core.support.Constant;
import com.bec.cloud.baodanxitong.web.task.dao.TaskMapper;
import com.bec.cloud.baodanxitong.web.task.model.Task;
import com.bec.cloud.baodanxitong.web.task.service.GroupTaskService;
import com.bec.cloud.service.example.model.UserInfo;
import com.bec.cloud.service.example.utils.SpringUtil;
import com.bec.cloud.service.example.utils.UserInfoUtil;

/**
 * @author suruiliang
 * @version 创建时间：2018年5月11日 上午11:30:43
 * @ClassName 类名称
 * @Description 类描述
 */
@Service
public class GroupTaskServiceImpl implements GroupTaskService{
	@Autowired
	private TaskMapper taskMapper;
	@Autowired
	private UserInfoUtil userInfoUtil;

	@Override
	public List<Task> groupListTask(UserInfo userInfo, Task record) {
		record.setFinishStatus(Constant.FinishStatus.UNFINISH);
		return taskMapper.selecTask(record);
	}

	@Override
	public Object groupViewTask(Long taskId) {
		return viewTaskByTaskId(taskId,"viewTask");
	}
	
	private Object viewTaskByTaskId(Long taskId,String methodName) {
		Task task=taskMapper.selectByPrimaryKey(taskId);
		if (task==null) {
			throw new BecException(BecExceptionEnum.UNKNOWN_EXCEPTION);
		}
		//TODO,实现具体业务逻辑
		if (StringUtils.endsWithIgnoreCase(task.getTaskType(),"information_modification")) {//信息修改特殊处理
			methodName=methodName+"Compare";
		}
		try {
			Class<?> clazz=Class.forName(task.getFullClassName());
			Object obj=SpringUtil.getBean(clazz);
			Method method=clazz.getDeclaredMethod(methodName,task.getLaunchId().getClass());
			Object object=method.invoke(obj,task.getLaunchId());
			return object;
		} catch (Exception e) {
			e.printStackTrace();
			throw new BecException(BecExceptionEnum.UNKNOWN_EXCEPTION);
		}
	}

	@Override
	@Transactional(rollbackFor=Exception.class)
	public Object groupAcceptTask(Long taskId, JSONObject json) {
		UserInfo userInfo=userInfoUtil.simpleUserInfo();
		if (userInfo==null) {
			throw new BecException(BecExceptionEnum.NORIGHT_EXCEPTION);
		}
		Task task=taskMapper.selectByPrimaryKey(taskId);
		if (task==null) {
			throw new BecException(BecExceptionEnum.UNKNOWN_EXCEPTION);
		}
		if (task.getDelStatus()!=0||task.getFinishStatus()!=0||task.getTaskStatus()!=0) {
			throw new BecException(BecExceptionEnum.NORIGHT_EXCEPTION);
		}
		task.setTaskStatus(Constant.TaskStatus.AUDIT_ACCEPT);
		task.setOperationTime(new Date());
		task.setOperationUserId(userInfo.getUserId());
		task.setFinishStatus(Constant.FinishStatus.FINISHED);
		if (StringUtils.endsWithIgnoreCase(task.getTaskType(),"network_application")) {//入网申请特殊处理
			if (StringUtils.isEmpty(json.getString("channelCustNo"))) {
				task.setTaskStatus(Constant.TaskStatus.UN_FUYOU_AUDIT);
				task.setFinishStatus(Constant.FinishStatus.UNFINISH);
			}
		}
		taskMapper.updateByPrimaryKeySelective(task);
		return updateTaskByTask(task,json,"acceptTask");
	}

	private Object updateTaskByTask(Task task, JSONObject json,String methodName) {
		//TODO,实现具体业务逻辑
		try {
			json.put("launchId", task.getLaunchId());
			Class<?> clazz=Class.forName(task.getFullClassName());
			Object obj=SpringUtil.getBean(clazz);
			Method method=clazz.getDeclaredMethod(methodName,json.getClass());
			Object object=method.invoke(obj,json);
			return object;
		} catch (Exception e) {
			e.printStackTrace();
			throw new BecException(BecExceptionEnum.UNKNOWN_EXCEPTION);
		}
	}

	@Override
	@Transactional(rollbackFor=Exception.class)
	public Object groupRejectTask(Long taskId, String rejectReason) {
		UserInfo userInfo=userInfoUtil.simpleUserInfo();
		if (userInfo==null) {
			throw new BecException(BecExceptionEnum.NORIGHT_EXCEPTION);
		}
		Task task=taskMapper.selectByPrimaryKey(taskId);
		if (task==null) {
			throw new BecException(BecExceptionEnum.UNKNOWN_EXCEPTION);
		}
		if (task.getDelStatus()!=0||task.getFinishStatus()!=0||task.getTaskStatus()!=0) {
			throw new BecException(BecExceptionEnum.NORIGHT_EXCEPTION);
		}
		task.setTaskStatus(Constant.TaskStatus.AUDIT_REJECTED);
		task.setOperationTime(new Date());
		task.setOperationUserId(userInfo.getUserId());
		task.setFinishStatus(Constant.FinishStatus.FINISHED);
		task.setRejectReason(rejectReason);
		taskMapper.updateByPrimaryKey(task);
		
		return rejectTaskByTask(task,"rejectTask");
	}
	
	private Object rejectTaskByTask(Task task,String methodName) {
		try {
			Class<?> clazz=Class.forName(task.getFullClassName());
			Object obj=SpringUtil.getBean(clazz);
			Method method=clazz.getDeclaredMethod(methodName,task.getLaunchId().getClass(),task.getRejectReason().getClass());
			Object object=method.invoke(obj,task.getLaunchId(),task.getRejectReason());
			return object;
		} catch (Exception e) {
			e.printStackTrace();
			throw new BecException(BecExceptionEnum.UNKNOWN_EXCEPTION);
		}
	}
	
	@Override
	@Transactional(rollbackFor=Exception.class)
	public Object groupRejectTask(String taskIds, String rejectReason) {
		String taskIdArray[]=StringUtils.split(taskIds, ",");
		for (String taskId : taskIdArray) {
			if (StringUtils.isNotEmpty(taskId)) {
				groupRejectTask(Long.valueOf(taskId),rejectReason);
			}
		}
		return 0;
	}

}
