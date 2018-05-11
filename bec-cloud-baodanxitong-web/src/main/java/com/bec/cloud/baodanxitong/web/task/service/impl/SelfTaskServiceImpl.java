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
import com.bec.cloud.baodanxitong.web.task.service.SelfTaskService;
import com.bec.cloud.service.example.model.UserInfo;
import com.bec.cloud.service.example.utils.SpringUtil;
import com.bec.cloud.service.example.utils.UserInfoUtil;

/**
 * @author suruiliang
 * @version 创建时间：2018年5月10日 上午11:56:14
 * @ClassName 类名称
 * @Description 类描述
 */
@Service
public class SelfTaskServiceImpl implements SelfTaskService {
	@Autowired
	private TaskMapper taskMapper;
	@Autowired
	private UserInfoUtil userInfoUtil;

	@Override
	public List<Task> selfListTask(UserInfo userInfo,Task record) {
		record.setEntryUserId(userInfo.getUserId());
		record.setFinishStatus(Constant.FinishStatus.UNFINISH);
		return taskMapper.selecTask(record);
	}

	@Override
	public Object selfViewTask(Long taskId) {
		return viewTaskByTaskId(taskId,"viewTask");
	}

	private Object viewTaskByTaskId(Long taskId,String methodName) {
		Task task=taskMapper.selectByPrimaryKey(taskId);
		if (task==null) {
			throw new BecException(BecExceptionEnum.UNKNOWN_EXCEPTION);
		}
		//TODO,实现具体业务逻辑
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
	public Object selfUpdateTask(Long taskId, JSONObject json) {
		return updateTaskByTaskId(taskId, json,"updateTask");
	}

	private Object updateTaskByTaskId(Long taskId, JSONObject json,String methodName) {
		Task task=taskMapper.selectByPrimaryKey(taskId);
		if (task==null) {
			throw new BecException(BecExceptionEnum.UNKNOWN_EXCEPTION);
		}
		if (task.getDelStatus()!=0||task.getFinishStatus()!=0||task.getTaskStatus()!=0) {
			throw new BecException(BecExceptionEnum.NORIGHT_EXCEPTION);
		}
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
	public Object selfDeleteTask(Long taskId) {
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
		task.setDelStatus(Constant.DelStatus.DELETED);
		task.setOperationTime(new Date());
		task.setOperationUserId(userInfo.getUserId());
		taskMapper.updateByPrimaryKey(task);
		
		return deleteTaskByTask(task,"deleteTask");
	}

	private Object deleteTaskByTask(Task task,String methodName) {
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
	public Object selfDeleteTask(String taskIds) {
		String taskIdArray[]=StringUtils.split(taskIds, ",");
		for (String taskId : taskIdArray) {
			if (StringUtils.isNotEmpty(taskId)) {
				selfDeleteTask(Long.valueOf(taskId));
			}
		}
		return 0;
	}
	

}
