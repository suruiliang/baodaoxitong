package com.bec.cloud.baodanxitong.web.dict.model;

import java.util.Date;

import lombok.Data;

@Data
public class BecMcc {
	
	private Long startTime;
	private Long endTime;
	private String searchName;
    private Integer categoryId;

    private Integer mcc;

    private String mccName;

    private String mccLname;

    private String remarks;

    private Integer delStatus;

    private Date recordTime;

    private Long entryUserId;

    private Date operationTime;

    private Long operationUserId;

}