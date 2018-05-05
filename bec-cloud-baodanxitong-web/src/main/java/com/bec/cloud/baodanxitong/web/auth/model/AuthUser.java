package com.bec.cloud.baodanxitong.web.auth.model;

import java.util.Date;

import lombok.Data;

@Data
public class AuthUser {
    private Long userId;

    private String custCode;

    private String orgCode;

    private String userName;

    private String userOldName;

    private String realName;

    private String userPasswd;

    private String userIdentity;

    private String loginIp;

    private Date loginTime;

    private Integer userStatus;

    private Integer delStatus;

    private Date recordTime;

    private Long entryUserId;

    private Long operationUserId;

    private Date opretionTime;

    private String userPhone;

}