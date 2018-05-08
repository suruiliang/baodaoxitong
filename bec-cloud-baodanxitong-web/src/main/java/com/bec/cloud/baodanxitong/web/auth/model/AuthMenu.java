package com.bec.cloud.baodanxitong.web.auth.model;

import java.util.Date;

import lombok.Data;

@Data
public class AuthMenu {
    private Integer menuId;

    private Integer menuType;

    private String menuName;

    private Integer menuUp;

    private Integer menuPid;

    private String menuUrl;

    private String echoPath;

    private Integer menuStatus;

    private Integer delStatus;

    private Date recordTime;

    private Long entryUserId;

    private Long operationUserId;

    private Date operationTime;

    private String reqMethod;

}