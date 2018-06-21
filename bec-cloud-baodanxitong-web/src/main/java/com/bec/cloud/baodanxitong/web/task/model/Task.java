package com.bec.cloud.baodanxitong.web.task.model;

import java.util.Date;

import lombok.Data;

@Data
public class Task {
	private Long startTime;
	private Long endTime;
	private Long userId;
	private String searchName;
	//================request
    private Long taskId;
    public Task() {
    	
    }

    public Task(Long launchId, String launchModule, String legalPhone, String custName, String custCode, String orgCode,
			String taskName, String taskType, String taskSubType, Integer finishStatus, Integer taskStatus,
			Integer delStatus, Date recordTime, Long entryUserId, Long operationUserId, Date operationTime,
			String fullClassName) {
		super();
		this.launchId = launchId;
		this.launchModule = launchModule;
		this.legalPhone = legalPhone;
		this.custName = custName;
		this.custCode = custCode;
		this.orgCode = orgCode;
		this.taskName = taskName;
		this.taskType = taskType;
		this.taskSubType = taskSubType;
		this.finishStatus = finishStatus;
		this.taskStatus = taskStatus;
		this.delStatus = delStatus;
		this.recordTime = recordTime;
		this.entryUserId = entryUserId;
		this.operationUserId = operationUserId;
		this.operationTime = operationTime;
		this.fullClassName = fullClassName;
	}

	private Long launchId;

    private String launchModule;

    private String legalPhone;

    private String custName;

    private String custCode;

    private String orgCode;

    private String taskName;

    private String taskType;

    private String taskSubType;

    private String rejectReason;

    private Integer finishStatus;

    private Integer taskStatus;

    private Integer delStatus;

    private Date recordTime;

    private Long entryUserId;

    private Long operationUserId;

    private Date operationTime;

    private String fullClassName;
    

}