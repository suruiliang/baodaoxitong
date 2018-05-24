package com.bec.cloud.baodanxitong.web.customer.model;

import java.util.Date;

public class CustDotTerm {
    private Long dtId;

    private String dotCode;

    private Integer getType;

    private String deviceId;

    private Integer deviceStatus;

    private Integer deviceAbnoStatus;

    private String deviceRemark;

    private String termId;

    private Integer termStatus;

    private Integer termAbnoStatus;

    private String termRemark;

    private String installAddr;

    private Integer bindingStatus;

    private Integer delStatus;

    private Date recordTime;

    private Long entryUserId;

    private Long operationUserId;

    private Date operationTime;

    public Long getDtId() {
        return dtId;
    }

    public void setDtId(Long dtId) {
        this.dtId = dtId;
    }

    public String getDotCode() {
        return dotCode;
    }

    public void setDotCode(String dotCode) {
        this.dotCode = dotCode == null ? null : dotCode.trim();
    }

    public Integer getGetType() {
        return getType;
    }

    public void setGetType(Integer getType) {
        this.getType = getType;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId == null ? null : deviceId.trim();
    }

    public Integer getDeviceStatus() {
        return deviceStatus;
    }

    public void setDeviceStatus(Integer deviceStatus) {
        this.deviceStatus = deviceStatus;
    }

    public Integer getDeviceAbnoStatus() {
        return deviceAbnoStatus;
    }

    public void setDeviceAbnoStatus(Integer deviceAbnoStatus) {
        this.deviceAbnoStatus = deviceAbnoStatus;
    }

    public String getDeviceRemark() {
        return deviceRemark;
    }

    public void setDeviceRemark(String deviceRemark) {
        this.deviceRemark = deviceRemark == null ? null : deviceRemark.trim();
    }

    public String getTermId() {
        return termId;
    }

    public void setTermId(String termId) {
        this.termId = termId == null ? null : termId.trim();
    }

    public Integer getTermStatus() {
        return termStatus;
    }

    public void setTermStatus(Integer termStatus) {
        this.termStatus = termStatus;
    }

    public Integer getTermAbnoStatus() {
        return termAbnoStatus;
    }

    public void setTermAbnoStatus(Integer termAbnoStatus) {
        this.termAbnoStatus = termAbnoStatus;
    }

    public String getTermRemark() {
        return termRemark;
    }

    public void setTermRemark(String termRemark) {
        this.termRemark = termRemark == null ? null : termRemark.trim();
    }

    public String getInstallAddr() {
        return installAddr;
    }

    public void setInstallAddr(String installAddr) {
        this.installAddr = installAddr == null ? null : installAddr.trim();
    }

    public Integer getBindingStatus() {
        return bindingStatus;
    }

    public void setBindingStatus(Integer bindingStatus) {
        this.bindingStatus = bindingStatus;
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