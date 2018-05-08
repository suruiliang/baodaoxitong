package com.bec.cloud.baodanxitong.web.auth.model;

import java.util.Date;
import java.util.List;

import com.bec.cloud.baodanxitong.web.auth.model.resp.MenuBtn;

import lombok.Data;

@Data
public class AuthRole {
	private String searchName;
	//=================request
	private String userName;
	private String realName;
	private List<MenuBtn> menuBtns;
	private Boolean checked;
	//=================response
    private Integer roleId;

    private Integer rolePid;

    private String orgCode;
    
    private String custCode;

    private String roleName;

    private String roleCode;

    private Integer roleStatus;

    private Integer delStatus;

    private Date recordTime;

    private Long entryUserId;

    private Long operationUserId;

    private Date opretionTime;

    private Integer roleType;
}