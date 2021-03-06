package com.bec.cloud.baodanxitong.web.customer.model;

import java.util.Date;

public class CustBusiLicense {
    private Long cblId;

    private Long custId;

    private Integer cblType;

    private String cblCode;

    private String cblDate;

    private String cblScope;

    private String cblFacePath;

    private String cblBackPath;

    private String remarks;

    private Integer delStatus;

    private Date recordTime;

    private Long entryUserId;

    private Long operationUserId;

    private Date operationTime;

    public Long getCblId() {
        return cblId;
    }

    public void setCblId(Long cblId) {
        this.cblId = cblId;
    }

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public Integer getCblType() {
        return cblType;
    }

    public void setCblType(Integer cblType) {
        this.cblType = cblType;
    }

    public String getCblCode() {
        return cblCode;
    }

    public void setCblCode(String cblCode) {
        this.cblCode = cblCode == null ? null : cblCode.trim();
    }

    public String getCblDate() {
        return cblDate;
    }

    public void setCblDate(String cblDate) {
        this.cblDate = cblDate == null ? null : cblDate.trim();
    }

    public String getCblScope() {
        return cblScope;
    }

    public void setCblScope(String cblScope) {
        this.cblScope = cblScope == null ? null : cblScope.trim();
    }

    public String getCblFacePath() {
        return cblFacePath;
    }

    public void setCblFacePath(String cblFacePath) {
        this.cblFacePath = cblFacePath == null ? null : cblFacePath.trim();
    }

    public String getCblBackPath() {
        return cblBackPath;
    }

    public void setCblBackPath(String cblBackPath) {
        this.cblBackPath = cblBackPath == null ? null : cblBackPath.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
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
}