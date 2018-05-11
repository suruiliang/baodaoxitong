package com.bec.cloud.baodanxitong.web.task.service;

import java.util.Map;

import com.alibaba.fastjson.JSONObject;

/**
 * @author suruiliang
 * @version 创建时间：2018年5月10日 下午5:21:56
 * @ClassName 类名称
 * @Description 类描述
 */
public interface TaskBaseService<T> {
	/**
	 * 查看任务，发起单详情
	 * viewTask
	 * @param launchId
	 * @return
	 */
	public T viewTask(Long launchId);

	/**
	 * 信息修改，任务发起单改动后newRecord,改动前oldRecord
	 * viewTaskCompare
	 * @param launchId
	 * @return
	 */
	public Map<String, T> viewTaskCompare(Long launchId);

	/**
	 * 任务修改，任务发起单修改
	 * updateTask
	 * @param json
	 * @return
	 */
	public T updateTask(JSONObject json);

	/**
	 * 复审通过，任务发起单修改
	 * acceptTask
	 * @param json
	 * @return
	 */
	public T acceptTask(JSONObject json);

	/**
	 * 任务撤销，任务发起单撤销
	 * deleteTask
	 * @param launchId
	 * @return
	 */
	public int deleteTask(Long launchId);

	/**
	 * 复审驳回，任务发起单修改
	 * rejectTask
	 * @param launchId
	 * @param rejectReason
	 * @return
	 */
	public int rejectTask(Long launchId,String rejectReason);

	default void test() {
		System.out.println("test default method");
	}
}
