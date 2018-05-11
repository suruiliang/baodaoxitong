package com.bec.cloud.baodanxitong.web.task.service;
/**
 * @author suruiliang
 * @version 创建时间：2018年5月10日 上午11:54:30
 * @ClassName 类名称
 * @Description 类描述
 */

import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.bec.cloud.baodanxitong.web.task.model.Task;
import com.bec.cloud.service.example.model.UserInfo;

public interface GroupTaskService {
	List<Task> groupListTask(UserInfo userInfo, Task record);

	Object groupViewTask(Long taskId);

	Object groupAcceptTask(Long taskId, JSONObject json);

	Object groupRejectTask(Long taskId, String rejectReason);

	Object groupRejectTask(String taskIds, String rejectReason);
}
