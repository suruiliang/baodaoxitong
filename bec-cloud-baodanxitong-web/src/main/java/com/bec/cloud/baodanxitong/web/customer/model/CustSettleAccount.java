package com.bec.cloud.baodanxitong.web.customer.model;

import java.util.Date;

public class CustSettleAccount {
    private Long accountId;

    private Long custCode;

    private Integer accountType;

    private String gOpenbankId;

    private String gAccountName;

    private String gAccountNo;

    private String accountOpenPermitPath;

    private String sOpenbankId;

    private String sAccountName;

    private String sAccountNo;

    private String auditStatus;

    private String remark;

    private Integer delStatus;

    private Integer changeStatus;

    private Date recordTime;

    private Long entryUserId;

    private Long operationUserId;

    private Date operationTime;

    private String bankCardFacePath;

    private String bankCardBackPath;

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getCustCode() {
        return custCode;
    }

    public void setCustCode(Long custCode) {
        this.custCode = custCode;
    }

    public Integer getAccountType() {
        return accountType;
    }

    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }

    public String getgOpenbankId() {
        return gOpenbankId;
    }

    public void setgOpenbankId(String gOpenbankId) {
        this.gOpenbankId = gOpenbankId == null ? null : gOpenbankId.trim();
    }

    public String getgAccountName() {
        return gAccountName;
    }

    public void setgAccountName(String gAccountName) {
        this.gAccountName = gAccountName == null ? null : gAccountName.trim();
    }

    public String getgAccountNo() {
        return gAccountNo;
    }

    public void setgAccountNo(String gAccountNo) {
        this.gAccountNo = gAccountNo == null ? null : gAccountNo.trim();
    }

    public String getAccountOpenPermitPath() {
        return accountOpenPermitPath;
    }

    public void setAccountOpenPermitPath(String accountOpenPermitPath) {
        this.accountOpenPermitPath = accountOpenPermitPath == null ? null : accountOpenPermitPath.trim();
    }

    public String getsOpenbankId() {
        return sOpenbankId;
    }

    public void setsOpenbankId(String sOpenbankId) {
        this.sOpenbankId = sOpenbankId == null ? null : sOpenbankId.trim();
    }

    public String getsAccountName() {
        return sAccountName;
    }

    public void setsAccountName(String sAccountName) {
        this.sAccountName = sAccountName == null ? null : sAccountName.trim();
    }

    public String getsAccountNo() {
        return sAccountNo;
    }

    public void setsAccountNo(String sAccountNo) {
        this.sAccountNo = sAccountNo == null ? null : sAccountNo.trim();
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus == null ? null : auditStatus.trim();
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

    public Integer getChangeStatus() {
        return changeStatus;
    }

    public void setChangeStatus(Integer changeStatus) {
        this.changeStatus = changeStatus;
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

    public String getBankCardFacePath() {
        return bankCardFacePath;
    }

    public void setBankCardFacePath(String bankCardFacePath) {
        this.bankCardFacePath = bankCardFacePath == null ? null : bankCardFacePath.trim();
    }

    public String getBankCardBackPath() {
        return bankCardBackPath;
    }

    public void setBankCardBackPath(String bankCardBackPath) {
        this.bankCardBackPath = bankCardBackPath == null ? null : bankCardBackPath.trim();
    }
}