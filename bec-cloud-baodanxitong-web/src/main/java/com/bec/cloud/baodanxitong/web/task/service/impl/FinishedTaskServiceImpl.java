package com.bec.cloud.baodanxitong.web.task.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bec.cloud.auth.core.support.Constant;
import com.bec.cloud.baodanxitong.web.task.dao.TaskMapper;
import com.bec.cloud.baodanxitong.web.task.model.Task;
import com.bec.cloud.baodanxitong.web.task.service.FinishedTaskService;
import com.bec.cloud.service.example.model.UserInfo;

/**
* @author suruiliang
* @version 创建时间：2018年5月11日 下午2:06:02
* @ClassName 类名称
* @Description 类描述
*/
@Service
public class FinishedTaskServiceImpl implements FinishedTaskService {
	@Autowired
	private TaskMapper taskMapper;

	@Override
	public List<Task> finishedListTask(UserInfo userInfo, Task record) {
		record.setFinishStatus(Constant.FinishStatus.FINISHED);
		record.setUserId(userInfo.getUserId());
		return taskMapper.selecTask(record);
	}

	@Override
	public Task finishedViewTask(Long taskId) {
		return taskMapper.selectByPrimaryKey(taskId);
	}

}
