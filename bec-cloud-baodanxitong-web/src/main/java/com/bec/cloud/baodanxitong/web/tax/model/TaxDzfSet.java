package com.bec.cloud.baodanxitong.web.tax.model;

import java.util.Date;

public class TaxDzfSet {
    private String id;

    private String platFormCode;

    private String signType;

    private String format;

    private String version;

    private String serialNoPrefix;

    private String rsaPubKeyDzf;

    private String rsaPubKeyBec;

    private String password;

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

    public String getPlatFormCode() {
        return platFormCode;
    }

    public void setPlatFormCode(String platFormCode) {
        this.platFormCode = platFormCode == null ? null : platFormCode.trim();
    }

    public String getSignType() {
        return signType;
    }

    public void setSignType(String signType) {
        this.signType = signType == null ? null : signType.trim();
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format == null ? null : format.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getSerialNoPrefix() {
        return serialNoPrefix;
    }

    public void setSerialNoPrefix(String serialNoPrefix) {
        this.serialNoPrefix = serialNoPrefix == null ? null : serialNoPrefix.trim();
    }

    public String getRsaPubKeyDzf() {
        return rsaPubKeyDzf;
    }

    public void setRsaPubKeyDzf(String rsaPubKeyDzf) {
        this.rsaPubKeyDzf = rsaPubKeyDzf == null ? null : rsaPubKeyDzf.trim();
    }

    public String getRsaPubKeyBec() {
        return rsaPubKeyBec;
    }

    public void setRsaPubKeyBec(String rsaPubKeyBec) {
        this.rsaPubKeyBec = rsaPubKeyBec == null ? null : rsaPubKeyBec.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
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