package com.bec.cloud.baodanxitong.web.customer.model;

import java.util.Date;

public class CustContractModify {
    private Long contId;

    private Long custCode;

    private String contName;

    private String contCode;

    private Integer auditStatus;

    private String remark;

    private String delStatus;

    private Integer changeStatus;

    private String contPhoto1;

    private String contPhoto2;

    private String contPhoto3;

    private String contPhoto4;

    private String contPhoto5;

    private Date recordTime;

    private Long entryUserId;

    private Long operationUserId;

    private Date operationTime;

    public Long getContId() {
        return contId;
    }

    public void setContId(Long contId) {
        this.contId = contId;
    }

    public Long getCustCode() {
        return custCode;
    }

    public void setCustCode(Long custCode) {
        this.custCode = custCode;
    }

    public String getContName() {
        return contName;
    }

    public void setContName(String contName) {
        this.contName = contName == null ? null : contName.trim();
    }

    public String getContCode() {
        return contCode;
    }

    public void setContCode(String contCode) {
        this.contCode = contCode == null ? null : contCode.trim();
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

    public String getDelStatus() {
        return delStatus;
    }

    public void setDelStatus(String delStatus) {
        this.delStatus = delStatus == null ? null : delStatus.trim();
    }

    public Integer getChangeStatus() {
        return changeStatus;
    }

    public void setChangeStatus(Integer changeStatus) {
        this.changeStatus = changeStatus;
    }

    public String getContPhoto1() {
        return contPhoto1;
    }

    public void setContPhoto1(String contPhoto1) {
        this.contPhoto1 = contPhoto1 == null ? null : contPhoto1.trim();
    }

    public String getContPhoto2() {
        return contPhoto2;
    }

    public void setContPhoto2(String contPhoto2) {
        this.contPhoto2 = contPhoto2 == null ? null : contPhoto2.trim();
    }

    public String getContPhoto3() {
        return contPhoto3;
    }

    public void setContPhoto3(String contPhoto3) {
        this.contPhoto3 = contPhoto3 == null ? null : contPhoto3.trim();
    }

    public String getContPhoto4() {
        return contPhoto4;
    }

    public void setContPhoto4(String contPhoto4) {
        this.contPhoto4 = contPhoto4 == null ? null : contPhoto4.trim();
    }

    public String getContPhoto5() {
        return contPhoto5;
    }

    public void setContPhoto5(String contPhoto5) {
        this.contPhoto5 = contPhoto5 == null ? null : contPhoto5.trim();
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