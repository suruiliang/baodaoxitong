package com.bec.cloud.baodanxitong.web.customer.model.resp;

import lombok.Data;

/**
 * @author suruiliang
 * @version 创建时间：2018年6月15日 下午5:28:01
 * @ClassName 类名称
 * @Description 类描述
 */
@Data
public class CustDeviceDetailResp {
	//设备关联id
	private Long ddId;
	//门店id
	private Long dotId;
	//门店编号
	private String dotCode;
	//商户id
	private Long custId;
	//商户账号
	private String custPhone;
	//商户编号
	private String custCode;
	//商户名称
	private String custName;

	//获取方式/0租金使用 /1押金使用/2免押金使用
	private Integer useType;
	//终端（收银机机身）型号
	private String cashierType;
	//终端（收银机机身）编号
	private String cashierNo;
	//安装地址
	private String cashierInstallAddr;
	//终端（收银机机身）绑定状态：0已绑定,1未绑定
	private Integer cashierBindingStatus;
	//终端（收银机机身）状态：0开通,1关闭
	private Integer cashierStatus;
	//pos机型号
	private String posType;
	//pos机sn号
	private String posSn;
	//mpos报备号
	private String posChannelNo;

}
