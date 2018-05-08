package com.bec.cloud.baodanxitong.web.auth.model;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class AuthUser {
	private String searchName;
	//==================request
	private String userStatusName;
	private String roleNames;
	private List<AuthRole> authRoles;
	//==================response
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

    private Date operationTime;

    private String userPhone;
    
    private String userType;

}