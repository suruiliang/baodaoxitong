package com.bec.cloud.baodanxitong.web.tax.model;

import java.util.Date;

public class SysSet {
    private String id;

    private String httpIp;

    private String httpPrefix;

    private String httpSuffix;

    private Integer delStatus;

    private Date recordTime;

    private Long entryUserId;

    private Long operationId;

    private Date operationTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getHttpIp() {
        return httpIp;
    }

    public void setHttpIp(String httpIp) {
        this.httpIp = httpIp == null ? null : httpIp.trim();
    }

    public String getHttpPrefix() {
        return httpPrefix;
    }

    public void setHttpPrefix(String httpPrefix) {
        this.httpPrefix = httpPrefix == null ? null : httpPrefix.trim();
    }

    public String getHttpSuffix() {
        return httpSuffix;
    }

    public void setHttpSuffix(String httpSuffix) {
        this.httpSuffix = httpSuffix == null ? null : httpSuffix.trim();
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

    public Long getOperationId() {
        return operationId;
    }

    public void setOperationId(Long operationId) {
        this.operationId = operationId;
    }

    public Date getOperationTime() {
        return operationTime;
    }

    public void setOperationTime(Date operationTime) {
        this.operationTime = operationTime;
    }
}