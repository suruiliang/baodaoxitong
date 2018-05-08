package com.bec.cloud.baodanxitong.web.auth.model;

import java.util.Date;

import lombok.Data;

@Data
public class ServiceManagement {
    private Long serviceId;

    private String serviceName;

    private String serviceDesc;

    private String serviceCode;

    private String serviceAccessAddr;

    private String serviceDeployAddr;

    private Integer serviceStatus;

    private Integer delStatus;

    private Date recordTime;

    private Long entryUserId;

    private Long operationUserId;

    private Date opretionTime;

}