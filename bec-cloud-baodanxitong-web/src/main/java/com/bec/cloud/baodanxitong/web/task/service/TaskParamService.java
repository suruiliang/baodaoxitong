package com.bec.cloud.baodanxitong.web.task.service;
/**
* @author suruiliang
* @version 创建时间：2018年5月11日 下午3:16:31
* @ClassName 类名称
* @Description 类描述
*/

import java.util.List;

import com.bec.cloud.baodanxitong.web.task.model.TaskParam;

public interface TaskParamService {
	
	List<TaskParam> selectTaskParam(TaskParam record);

}
