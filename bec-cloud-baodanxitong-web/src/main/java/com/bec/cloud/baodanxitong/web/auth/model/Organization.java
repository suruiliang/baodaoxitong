package com.bec.cloud.baodanxitong.web.auth.model;

import java.util.Date;

import lombok.Data;

@Data
public class Organization {
    private Long orgId;

    private String orgName;

    private String orgAbbr;

    private String orgCode;

    private String orgPhone;

    private String orgIid;

    private String pOrgCode;

    private String legalName;

    private String legalPhone;

    private String busLicense;

    private String busLicensePhoto;

    private String busAddress;

    private String registeredAddress;

    private Integer orgStatus;

    private Integer delStatus;

    private Date recordTime;

    private Long entryUserId;

    private Long operationUserId;

    private Date opretionTime;

    private Integer orgLevel;

    private Long orgPid;
    
}