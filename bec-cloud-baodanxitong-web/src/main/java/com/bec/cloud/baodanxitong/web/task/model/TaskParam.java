package com.bec.cloud.baodanxitong.web.task.model;

import java.util.Date;

import lombok.Data;

@Data
public class TaskParam {
    private Long paramId;

    private String paramType;

    private String paramTypeName;

    private String paramValue;

    private String paramValueName;

    private String paramValueDesc;

    private Date recordTime;

    private Date operationTime;

    private Long entryUserId;

    private Long operationUserId;

}