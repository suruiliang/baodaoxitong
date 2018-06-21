package com.bec.cloud.baodanxitong.web.customer.model;

import java.util.Date;

public class CustDotDevice {
    private Long ddId;

    private Long dotId;

    private Long custId;

    private Integer useType;

    private String cashierType;

    private String cashierNo;

    private Integer cashierStatus;

    private String cashierInstallAddr;

    private Integer cashierBindingStatus;

    private Integer cashierAbnormalStatus;

    private String cashierRemark;

    private String posType;

    private String posSn;

    private String posChannelNo;

    private Integer posStatus;

    private Integer posAbnormalStatus;

    private String posRemark;

    private Integer delStatus;

    private Date recordTime;

    private Long entryUserId;

    private Long operationUserId;

    private Date operationTime;

    public Long getDdId() {
        return ddId;
    }

    public void setDdId(Long ddId) {
        this.ddId = ddId;
    }

    public Long getDotId() {
        return dotId;
    }

    public void setDotId(Long dotId) {
        this.dotId = dotId;
    }

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public Integer getUseType() {
        return useType;
    }

    public void setUseType(Integer useType) {
        this.useType = useType;
    }

    public String getCashierType() {
        return cashierType;
    }

    public void setCashierType(String cashierType) {
        this.cashierType = cashierType == null ? null : cashierType.trim();
    }

    public String getCashierNo() {
        return cashierNo;
    }

    public void setCashierNo(String cashierNo) {
        this.cashierNo = cashierNo == null ? null : cashierNo.trim();
    }

    public Integer getCashierStatus() {
        return cashierStatus;
    }

    public void setCashierStatus(Integer cashierStatus) {
        this.cashierStatus = cashierStatus;
    }

    public String getCashierInstallAddr() {
        return cashierInstallAddr;
    }

    public void setCashierInstallAddr(String cashierInstallAddr) {
        this.cashierInstallAddr = cashierInstallAddr == null ? null : cashierInstallAddr.trim();
    }

    public Integer getCashierBindingStatus() {
        return cashierBindingStatus;
    }

    public void setCashierBindingStatus(Integer cashierBindingStatus) {
        this.cashierBindingStatus = cashierBindingStatus;
    }

    public Integer getCashierAbnormalStatus() {
        return cashierAbnormalStatus;
    }

    public void setCashierAbnormalStatus(Integer cashierAbnormalStatus) {
        this.cashierAbnormalStatus = cashierAbnormalStatus;
    }

    public String getCashierRemark() {
        return cashierRemark;
    }

    public void setCashierRemark(String cashierRemark) {
        this.cashierRemark = cashierRemark == null ? null : cashierRemark.trim();
    }

    public String getPosType() {
        return posType;
    }

    public void setPosType(String posType) {
        this.posType = posType == null ? null : posType.trim();
    }

    public String getPosSn() {
        return posSn;
    }

    public void setPosSn(String posSn) {
        this.posSn = posSn == null ? null : posSn.trim();
    }

    public String getPosChannelNo() {
        return posChannelNo;
    }

    public void setPosChannelNo(String posChannelNo) {
        this.posChannelNo = posChannelNo == null ? null : posChannelNo.trim();
    }

    public Integer getPosStatus() {
        return posStatus;
    }

    public void setPosStatus(Integer posStatus) {
        this.posStatus = posStatus;
    }

    public Integer getPosAbnormalStatus() {
        return posAbnormalStatus;
    }

    public void setPosAbnormalStatus(Integer posAbnormalStatus) {
        this.posAbnormalStatus = posAbnormalStatus;
    }

    public String getPosRemark() {
        return posRemark;
    }

    public void setPosRemark(String posRemark) {
        this.posRemark = posRemark == null ? null : posRemark.trim();
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