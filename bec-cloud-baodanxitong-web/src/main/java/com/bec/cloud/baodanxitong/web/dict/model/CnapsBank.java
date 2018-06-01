package com.bec.cloud.baodanxitong.web.dict.model;

import java.util.Date;

import lombok.Data;

@Data
public class CnapsBank {
	
	private Long startTime;
	private Long endTime;
	private String searchName;
    private String bankcode;

    private Integer countyCode;

    private String bankNetworkName;

    private String bankName;

    private String remarks;

    private Integer delStatus;

    private Date recordTime;

    private Long entryUserId;

    private Date operationTime;

    private Long operationUserId;

}