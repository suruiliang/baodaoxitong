package com.bec.cloud.baodanxitong.web.customer.model;

import java.util.Date;

public class CustDot {
    private Long dotId;

    private Long custId;

    private String dotCode;

    private Integer dotLevel;

    private String dotName;

    private Integer dotOperCountyCode;

    private String dotOperDetailAddr;

    private String dotContacts;

    private String dotContactsPho;

    private String dotHeadPhotoPath;

    private String dotInPhotoPath;

    private String dotCashPhotoPath;

    private Integer auditStatus;

    private String remark;

    private Integer delStatus;

    private String dotEmergencyContact;

    private String dotEmergencyContactPhone;

    private String dotAffiliationToCustomer;

    private Date recordTime;

    private Long entryUserId;

    private Long operationUserId;

    private Date operationTime;

    public Long getDotId() {
        return dotId;
    }

    public void setDotId(Long dotId) {
        this.dotId = dotId;
    }

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public String getDotCode() {
        return dotCode;
    }

    public void setDotCode(String dotCode) {
        this.dotCode = dotCode == null ? null : dotCode.trim();
    }

    public Integer getDotLevel() {
        return dotLevel;
    }

    public void setDotLevel(Integer dotLevel) {
        this.dotLevel = dotLevel;
    }

    public String getDotName() {
        return dotName;
    }

    public void setDotName(String dotName) {
        this.dotName = dotName == null ? null : dotName.trim();
    }

    public Integer getDotOperCountyCode() {
        return dotOperCountyCode;
    }

    public void setDotOperCountyCode(Integer dotOperCountyCode) {
        this.dotOperCountyCode = dotOperCountyCode;
    }

    public String getDotOperDetailAddr() {
        return dotOperDetailAddr;
    }

    public void setDotOperDetailAddr(String dotOperDetailAddr) {
        this.dotOperDetailAddr = dotOperDetailAddr == null ? null : dotOperDetailAddr.trim();
    }

    public String getDotContacts() {
        return dotContacts;
    }

    public void setDotContacts(String dotContacts) {
        this.dotContacts = dotContacts == null ? null : dotContacts.trim();
    }

    public String getDotContactsPho() {
        return dotContactsPho;
    }

    public void setDotContactsPho(String dotContactsPho) {
        this.dotContactsPho = dotContactsPho == null ? null : dotContactsPho.trim();
    }

    public String getDotHeadPhotoPath() {
        return dotHeadPhotoPath;
    }

    public void setDotHeadPhotoPath(String dotHeadPhotoPath) {
        this.dotHeadPhotoPath = dotHeadPhotoPath == null ? null : dotHeadPhotoPath.trim();
    }

    public String getDotInPhotoPath() {
        return dotInPhotoPath;
    }

    public void setDotInPhotoPath(String dotInPhotoPath) {
        this.dotInPhotoPath = dotInPhotoPath == null ? null : dotInPhotoPath.trim();
    }

    public String getDotCashPhotoPath() {
        return dotCashPhotoPath;
    }

    public void setDotCashPhotoPath(String dotCashPhotoPath) {
        this.dotCashPhotoPath = dotCashPhotoPath == null ? null : dotCashPhotoPath.trim();
    }

    public Integer getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getDelStatus() {
        return delStatus;
    }

    public void setDelStatus(Integer delStatus) {
        this.delStatus = delStatus;
    }

    public String getDotEmergencyContact() {
        return dotEmergencyContact;
    }

    public void setDotEmergencyContact(String dotEmergencyContact) {
        this.dotEmergencyContact = dotEmergencyContact == null ? null : dotEmergencyContact.trim();
    }

    public String getDotEmergencyContactPhone() {
        return dotEmergencyContactPhone;
    }

    public void setDotEmergencyContactPhone(String dotEmergencyContactPhone) {
        this.dotEmergencyContactPhone = dotEmergencyContactPhone == null ? null : dotEmergencyContactPhone.trim();
    }

    public String getDotAffiliationToCustomer() {
        return dotAffiliationToCustomer;
    }

    public void setDotAffiliationToCustomer(String dotAffiliationToCustomer) {
        this.dotAffiliationToCustomer = dotAffiliationToCustomer == null ? null : dotAffiliationToCustomer.trim();
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
}