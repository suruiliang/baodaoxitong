package com.bec.cloud.baodanxitong.web.customer.model.req;

import lombok.Data;

@Data
public class CustDeviceReq {
	//设备关联id
	private Long ddId;
	//门店id
	private Long dotId;
	//商户id
	private Long custId;
	//获取方式/0租金使用 /1押金使用/2免押金使用
	private Integer useType;
	//终端（收银机）型号
	private String cashierType;
	//终端（收银机）机身编号
	private String cashierNo;
	//终端状态：0开通,1关闭
	private Integer cashierStatus;
	//安装地址
	private String cashierInstallAddr;
	//绑定状态：0已绑定,1未绑定
	private Integer cashierBindingStatus;
	//pos型号
	private String posType;
	//pos机sn号
	private String posSn;
	//mpos报备号
	private String posChannelNo;

}