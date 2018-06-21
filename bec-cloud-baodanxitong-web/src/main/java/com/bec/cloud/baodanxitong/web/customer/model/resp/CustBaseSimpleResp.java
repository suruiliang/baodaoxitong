package com.bec.cloud.baodanxitong.web.customer.model.resp;

import lombok.Data;

@Data
public class CustBaseSimpleResp {
	//商户id
	private Long custId;
	//商户账号
	private String custPhone;
	//商户编号
	private String custCode;
	//商户名称
	private String custName;
	//合同编号
	private String contCode;
	//机构编号
	private String orgCode;
	//机构名称
	private String orgName;
	//商户状态：0开通，1关闭
	private Integer custStatus;
	//报单状态：0 报单待审；1 审核通过;2审核驳回
	private Integer modifyStatus;

}