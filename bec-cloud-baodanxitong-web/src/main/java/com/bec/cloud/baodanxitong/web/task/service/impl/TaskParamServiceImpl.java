package com.bec.cloud.baodanxitong.web.task.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bec.cloud.baodanxitong.web.task.dao.TaskParamMapper;
import com.bec.cloud.baodanxitong.web.task.model.TaskParam;
import com.bec.cloud.baodanxitong.web.task.service.TaskParamService;

/**
* @author suruiliang
* @version 创建时间：2018年5月11日 下午3:19:00
* @ClassName 类名称
* @Description 类描述
*/
@Service
public class TaskParamServiceImpl implements TaskParamService {
	@Autowired
	private TaskParamMapper taskParamMapper;

	@Override
	public List<TaskParam> selectTaskParam(TaskParam record) {
		return taskParamMapper.selectTaskParam(record);
	}

}
