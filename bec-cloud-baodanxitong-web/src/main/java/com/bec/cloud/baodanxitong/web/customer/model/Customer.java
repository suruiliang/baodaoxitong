package com.bec.cloud.baodanxitong.web.customer.model;

import java.util.Date;

public class Customer {
    private Long custId;

    private Long custPid;

    private String custIid;

    private String custCode;

    private String pCustCode;

    private String orgCode;

    private String custMcc;

    private Integer custLevel;

    private Integer custAttr;

    private String custPhone;

    private String custOldPhone;

    private String custName;

    private String custAbbr;

    private String custCompanyName;

    private String custAddress;

    private Integer countyCode;

    private String custEmail;

    private String legalName;

    private String legalIdentity;

    private String legalIdentityDate;

    private Integer custStatus;

    private Integer modifyStatus;

    private Integer delStatus;

    private Date recordTime;

    private Long entryUserId;

    private Long operationUserId;

    private Date operationTime;

    private Integer custScale;

    private Integer tradingArea;

    private Integer saleNum;

    private String remark;

    private String emergencyContact;

    private String emergencyContactPhone;

    private String affiliationToCustomer;

    private String identityFacePath;

    private String identityBackPath;

    private Integer registerCountyCode;

    private String registerDetailAddr;

    private Integer operCountyCode;

    private String operDetailAddr;

    private String operAddrType;

    private String custLname;

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public Long getCustPid() {
        return custPid;
    }

    public void setCustPid(Long custPid) {
        this.custPid = custPid;
    }

    public String getCustIid() {
        return custIid;
    }

    public void setCustIid(String custIid) {
        this.custIid = custIid == null ? null : custIid.trim();
    }

    public String getCustCode() {
        return custCode;
    }

    public void setCustCode(String custCode) {
        this.custCode = custCode == null ? null : custCode.trim();
    }

    public String getpCustCode() {
        return pCustCode;
    }

    public void setpCustCode(String pCustCode) {
        this.pCustCode = pCustCode == null ? null : pCustCode.trim();
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode == null ? null : orgCode.trim();
    }

    public String getCustMcc() {
        return custMcc;
    }

    public void setCustMcc(String custMcc) {
        this.custMcc = custMcc == null ? null : custMcc.trim();
    }

    public Integer getCustLevel() {
        return custLevel;
    }

    public void setCustLevel(Integer custLevel) {
        this.custLevel = custLevel;
    }

    public Integer getCustAttr() {
        return custAttr;
    }

    public void setCustAttr(Integer custAttr) {
        this.custAttr = custAttr;
    }

    public String getCustPhone() {
        return custPhone;
    }

    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone == null ? null : custPhone.trim();
    }

    public String getCustOldPhone() {
        return custOldPhone;
    }

    public void setCustOldPhone(String custOldPhone) {
        this.custOldPhone = custOldPhone == null ? null : custOldPhone.trim();
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName == null ? null : custName.trim();
    }

    public String getCustAbbr() {
        return custAbbr;
    }

    public void setCustAbbr(String custAbbr) {
        this.custAbbr = custAbbr == null ? null : custAbbr.trim();
    }

    public String getCustCompanyName() {
        return custCompanyName;
    }

    public void setCustCompanyName(String custCompanyName) {
        this.custCompanyName = custCompanyName == null ? null : custCompanyName.trim();
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress == null ? null : custAddress.trim();
    }

    public Integer getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(Integer countyCode) {
        this.countyCode = countyCode;
    }

    public String getCustEmail() {
        return custEmail;
    }

    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail == null ? null : custEmail.trim();
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName == null ? null : legalName.trim();
    }

    public String getLegalIdentity() {
        return legalIdentity;
    }

    public void setLegalIdentity(String legalIdentity) {
        this.legalIdentity = legalIdentity == null ? null : legalIdentity.trim();
    }

    public String getLegalIdentityDate() {
        return legalIdentityDate;
    }

    public void setLegalIdentityDate(String legalIdentityDate) {
        this.legalIdentityDate = legalIdentityDate == null ? null : legalIdentityDate.trim();
    }

    public Integer getCustStatus() {
        return custStatus;
    }

    public void setCustStatus(Integer custStatus) {
        this.custStatus = custStatus;
    }

    public Integer getModifyStatus() {
        return modifyStatus;
    }

    public void setModifyStatus(Integer modifyStatus) {
        this.modifyStatus = modifyStatus;
    }

    public Integer getDelStatus() {
        return delStatus;
    }

    public void setDelStatus(Integer delStatus) {
        this.delStatus = delStatus;
    }

    public Date getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }

    public Long getEntryUserId() {
        return entryUserId;
    }

    public void setEntryUserId(Long entryUserId) {
        this.entryUserId = entryUserId;
    }

    public Long getOperationUserId() {
        return operationUserId;
    }

    public void setOperationUserId(Long operationUserId) {
        this.operationUserId = operationUserId;
    }

    public Date getOperationTime() {
        return operationTime;
    }

    public void setOperationTime(Date operationTime) {
        this.operationTime = operationTime;
    }

    public Integer getCustScale() {
        return custScale;
    }

    public void setCustScale(Integer custScale) {
        this.custScale = custScale;
    }

    public Integer getTradingArea() {
        return tradingArea;
    }

    public void setTradingArea(Integer tradingArea) {
        this.tradingArea = tradingArea;
    }

    public Integer getSaleNum() {
        return saleNum;
    }

    public void setSaleNum(Integer saleNum) {
        this.saleNum = saleNum;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact == null ? null : emergencyContact.trim();
    }

    public String getEmergencyContactPhone() {
        return emergencyContactPhone;
    }

    public void setEmergencyContactPhone(String emergencyContactPhone) {
        this.emergencyContactPhone = emergencyContactPhone == null ? null : emergencyContactPhone.trim();
    }

    public String getAffiliationToCustomer() {
        return affiliationToCustomer;
    }

    public void setAffiliationToCustomer(String affiliationToCustomer) {
        this.affiliationToCustomer = affiliationToCustomer == null ? null : affiliationToCustomer.trim();
    }

    public String getIdentityFacePath() {
        return identityFacePath;
    }

    public void setIdentityFacePath(String identityFacePath) {
        this.identityFacePath = identityFacePath == null ? null : identityFacePath.trim();
    }

    public String getIdentityBackPath() {
        return identityBackPath;
    }

    public void setIdentityBackPath(String identityBackPath) {
        this.identityBackPath = identityBackPath == null ? null : identityBackPath.trim();
    }

    public Integer getRegisterCountyCode() {
        return registerCountyCode;
    }

    public void setRegisterCountyCode(Integer registerCountyCode) {
        this.registerCountyCode = registerCountyCode;
    }

    public String getRegisterDetailAddr() {
        return registerDetailAddr;
    }

    public void setRegisterDetailAddr(String registerDetailAddr) {
        this.registerDetailAddr = registerDetailAddr == null ? null : registerDetailAddr.trim();
    }

    public Integer getOperCountyCode() {
        return operCountyCode;
    }

    public void setOperCountyCode(Integer operCountyCode) {
        this.operCountyCode = operCountyCode;
    }

    public String getOperDetailAddr() {
        return operDetailAddr;
    }

    public void setOperDetailAddr(String operDetailAddr) {
        this.operDetailAddr = operDetailAddr == null ? null : operDetailAddr.trim();
    }

    public String getOperAddrType() {
        return operAddrType;
    }

    public void setOperAddrType(String operAddrType) {
        this.operAddrType = operAddrType == null ? null : operAddrType.trim();
    }

    public String getCustLname() {
        return custLname;
    }

    public void setCustLname(String custLname) {
        this.custLname = custLname == null ? null : custLname.trim();
    }
}