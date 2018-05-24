package com.bec.cloud.baodanxitong.web.customer.model;

import java.util.Date;

public class CustDotTermHistory {
    private Long dtId;

    private String dotNum;

    private String abnoTermType;

    private String abnoTermId;

    private String oldAbnoTermId;

    private String abnoDesc;

    private Date recordTime;

    private Long entryUserId;

    private Integer getType;

    private Integer abnoStatus;

    public Long getDtId() {
        return dtId;
    }

    public void setDtId(Long dtId) {
        this.dtId = dtId;
    }

    public String getDotNum() {
        return dotNum;
    }

    public void setDotNum(String dotNum) {
        this.dotNum = dotNum == null ? null : dotNum.trim();
    }

    public String getAbnoTermType() {
        return abnoTermType;
    }

    public void setAbnoTermType(String abnoTermType) {
        this.abnoTermType = abnoTermType == null ? null : abnoTermType.trim();
    }

    public String getAbnoTermId() {
        return abnoTermId;
    }

    public void setAbnoTermId(String abnoTermId) {
        this.abnoTermId = abnoTermId == null ? null : abnoTermId.trim();
    }

    public String getOldAbnoTermId() {
        return oldAbnoTermId;
    }

    public void setOldAbnoTermId(String oldAbnoTermId) {
        this.oldAbnoTermId = oldAbnoTermId == null ? null : oldAbnoTermId.trim();
    }

    public String getAbnoDesc() {
        return abnoDesc;
    }

    public void setAbnoDesc(String abnoDesc) {
        this.abnoDesc = abnoDesc == null ? null : abnoDesc.trim();
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

    public Integer getGetType() {
        return getType;
    }

    public void setGetType(Integer getType) {
        this.getType = getType;
    }

    public Integer getAbnoStatus() {
        return abnoStatus;
    }

    public void setAbnoStatus(Integer abnoStatus) {
        this.abnoStatus = abnoStatus;
    }
}