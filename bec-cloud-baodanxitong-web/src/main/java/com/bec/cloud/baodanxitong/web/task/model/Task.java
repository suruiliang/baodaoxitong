package com.bec.cloud.baodanxitong.web.task.model;

import java.util.Date;

import lombok.Data;

@Data
public class Task {
	private Long startTime;
	private Long endTime;
	private Long userId;
	//================request
    private Long taskId;

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