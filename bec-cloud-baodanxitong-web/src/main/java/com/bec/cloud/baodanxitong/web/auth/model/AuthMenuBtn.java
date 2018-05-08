package com.bec.cloud.baodanxitong.web.auth.model;

import java.util.Date;

import lombok.Data;

@Data
public class AuthMenuBtn {
    private Integer btnId;

    private Integer menuId;

    private Integer btnType;

    private String btnName;

    private String btnUrl;

    private Integer btnStatus;

    private Integer delStatus;

    private Date recordTime;

    private Long entryUserId;

    private Long operationUserId;

    private Date operationTime;

    private String reqMethod;

}