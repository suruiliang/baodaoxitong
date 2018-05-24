package com.bec.cloud.baodanxitong.web.tax.model;

import java.util.Date;

public class TaxInvItem {
    private String id;

    private Long custId;

    private String name;

    private String taxRate;

    private String classificationCode;

    private String classificationName;

    private String status;

    private String isDefault;

    private String preferentialPolicy;

    private String dutyFreeType;

    private String addedTaxManage;

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

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(String taxRate) {
        this.taxRate = taxRate == null ? null : taxRate.trim();
    }

    public String getClassificationCode() {
        return classificationCode;
    }

    public void setClassificationCode(String classificationCode) {
        this.classificationCode = classificationCode == null ? null : classificationCode.trim();
    }

    public String getClassificationName() {
        return classificationName;
    }

    public void setClassificationName(String classificationName) {
        this.classificationName = classificationName == null ? null : classificationName.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault == null ? null : isDefault.trim();
    }

    public String getPreferentialPolicy() {
        return preferentialPolicy;
    }

    public void setPreferentialPolicy(String preferentialPolicy) {
        this.preferentialPolicy = preferentialPolicy == null ? null : preferentialPolicy.trim();
    }

    public String getDutyFreeType() {
        return dutyFreeType;
    }

    public void setDutyFreeType(String dutyFreeType) {
        this.dutyFreeType = dutyFreeType == null ? null : dutyFreeType.trim();
    }

    public String getAddedTaxManage() {
        return addedTaxManage;
    }

    public void setAddedTaxManage(String addedTaxManage) {
        this.addedTaxManage = addedTaxManage == null ? null : addedTaxManage.trim();
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