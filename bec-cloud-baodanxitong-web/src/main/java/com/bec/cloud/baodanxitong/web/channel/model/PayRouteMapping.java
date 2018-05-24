package com.bec.cloud.baodanxitong.web.channel.model;

import java.util.Date;

public class PayRouteMapping {
    private String custCode;

    private Integer channelId1;

    private Integer channelId2;

    private Integer channelId3;

    private Date recordTime;

    private Long entryUserId;

    private Date operationTime;

    private Long operationUserId;

    public String getCustCode() {
        return custCode;
    }

    public void setCustCode(String custCode) {
        this.custCode = custCode == null ? null : custCode.trim();
    }

    public Integer getChannelId1() {
        return channelId1;
    }

    public void setChannelId1(Integer channelId1) {
        this.channelId1 = channelId1;
    }

    public Integer getChannelId2() {
        return channelId2;
    }

    public void setChannelId2(Integer channelId2) {
        this.channelId2 = channelId2;
    }

    public Integer getChannelId3() {
        return channelId3;
    }

    public void setChannelId3(Integer channelId3) {
        this.channelId3 = channelId3;
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

    public Date getOperationTime() {
        return operationTime;
    }

    public void setOperationTime(Date operationTime) {
        this.operationTime = operationTime;
    }

    public Long getOperationUserId() {
        return operationUserId;
    }

    public void setOperationUserId(Long operationUserId) {
        this.operationUserId = operationUserId;
    }
}