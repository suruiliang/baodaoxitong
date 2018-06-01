package com.bec.cloud.baodanxitong.web.dict.model;

import java.util.Date;

import lombok.Data;

@Data
public class CnapsRegionSix {
	private Long startTime;
	private Long endTime;
	private String searchName;
    private String cnapsRegion;

    private Integer regionType;

    private String parentCode;

    private String regionName;

    private String regionFullName;

    private String remarks;

    private Integer delStatus;

    private Date recordTime;

    private Long entryUserId;

    private Date operationTime;

    private Long operationUserId;

    public String getCnapsRegion() {
        return cnapsRegion;
    }

    public void setCnapsRegion(String cnapsRegion) {
        this.cnapsRegion = cnapsRegion == null ? null : cnapsRegion.trim();
    }

    public Integer getRegionType() {
        return regionType;
    }

    public void setRegionType(Integer regionType) {
        this.regionType = regionType;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode == null ? null : parentCode.trim();
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName == null ? null : regionName.trim();
    }

    public String getRegionFullName() {
        return regionFullName;
    }

    public void setRegionFullName(String regionFullName) {
        this.regionFullName = regionFullName == null ? null : regionFullName.trim();
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