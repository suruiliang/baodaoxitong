package com.bec.cloud.baodanxitong.web.customer.model.resp;

import lombok.Data;

/**
 * @author suruiliang
 * @version 创建时间：2018年6月15日 下午4:28:45
 * @ClassName 类名称
 * @Description 类描述
 */
@Data
public class CustDeptDetailResp {
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

	//门店id
	private Long dotId;
	//门店编号
	private String dotCode;
	//门店名称
	private String dotName;
	//门店地址区县编码
	private Integer dotOperCountyCode;
	//门店详细地址
	private String dotOperDetailAddr;
	//门店联系人
	private String dotContacts;
	//门店联系人电话
	private String dotContactsPho;
	//门头照片
	private String dotHeadPhotoPath;
	//内景照片
	private String dotInPhotoPath;
	//收银台照片
	private String dotCashPhotoPath;
}
