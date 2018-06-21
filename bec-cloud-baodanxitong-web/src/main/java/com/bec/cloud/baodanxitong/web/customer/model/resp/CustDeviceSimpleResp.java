package com.bec.cloud.baodanxitong.web.customer.model.resp;

import lombok.Data;

/**
 * @author suruiliang
 * @version 创建时间：2018年6月15日 下午5:28:01
 * @ClassName 类名称
 * @Description 类描述
 */
@Data
public class CustDeviceSimpleResp {
	//商户id
	private Long custId;
	//商户账号
	private String custPhone;
	//商户编号
	private String custCode;
	//商户名称
	private String custName;
	//商户状态：0开通，1关闭
	private Integer custStatus;
	//报单状态：0 报单待审；1 审核通过;2审核驳回
	private Integer modifyStatus;

	//设备关联id
	private Long ddId;
	//门店id
	private Long dotId;
	//收银机机身编号
	private String cashierNo;
	//终端状态：0开通,1关闭
	private Integer cashierStatus;
	//设备报修状态 /0正常/1报修中/2已修复
	private Integer cashierAbnormalStatus;
}
