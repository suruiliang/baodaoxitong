package com.bec.cloud.baodanxitong.web.customer.model.resp;

import lombok.Data;

@Data
public class CustBaseDetailResp {
	//1.=======================商户(customer)start
	//商户id
	private Long custId;
	//机构名称
	private String orgName;
	//机构编号
	private String orgCode;
	//业务员id
	private Long salerId;
	//申报类型：0标准商户
	private Integer custAttr;
	//业务大类：0标准类
	private Integer categoryId;
	//客户类型:/0餐饮/1零售/2商超/3电子发票/4广告机/5支付
	private String custType;
	//商户账号
	private String custPhone;
	//商户名称
	private String custName;
	//法人姓名
	private String legalName;
	//法人身份证号
	private String legalIdentity;
	//身份证到期日
	private String legalIdentityDate;
	//身份证照片正面
	private String identityFacePath;
	//身份证照片反面
	private String identityBackPath;
	//工商注册地址编码
	private Integer registerCountyCode;
	//工商注册详细地址
	private String registerDetailAddr;
	//实际经营地址编码
	private Integer operCountyCode;
	//实际经营详细地址
	private String operDetailAddr;
	//邮箱地址
	private String custEmail;
	//联系人
	private String emergencyContact;
	//联系电话
	private String emergencyContactPhone;
	//商户状态：0开通，1关闭
	private Integer custStatus;
	//经营地类型： 0自有,1租赁
	private String operAddrType;
	//商铺规模
	private Integer custScale;
	//商圈  0:其它  1:商业圈 2:办公区  3:住宅区  4:混合区  5:工业区
	private Integer tradingArea;
	//营业员数量
	private Integer saleNum;
	//备注
	private String remark;
	//1.=======================商户end

	//2.=======================合同(cust_contract)start
	//合同名称
	private String contName;
	//合同编号
	private String contCode;
	//合同照片1-5
	private String contPhoto1;
	private String contPhoto2;
	//2.=======================合同end

	//3.=======================营业证件(cust_busi_license)start
	//证件类型(/0:营业执照（三证合一）/1:营业执照（非18位社会统一信用代码）/2:医疗从业许可证/3:民办非企业单位凭证登记证书/4:其它)
	private Integer cblType;
	//证件代码
	private String cblCode;
	//证件到期日
	private String cblDate;
	//经营范围
	private String cblScope;
	//营业执照正面照片
	private String cblFacePath;
	//营业执照反面照片
	private String cblBackPath;
	//3.=======================营业证件end

	//4.=======================结算账户(cust_settle_account)start
	//结算账户类型：0对公 1对私 2双账户
	private Integer accountType;
	//对公开户银行
	private String gopenbank;
	//对公清算联行号
	private String gopenbankId;
	//对公户名
	private String gaccountName;
	//对公银行账号
	private String gaccountNo;
	//开户许可证照片
	private String accountOpenPermitPath;
	//对私开户银行
	private String sopenbank;
	//对私清算联行号
	private String sopenbankId;
	//对私户名
	private String saccountName;
	//对私银行账号
	private String saccountNo;
	//银行卡正面照片
	private String bankCardFacePath;
	//银行卡反面照片
	private String bankCardBackPath;
	//4.=======================结算账户end
}