package com.bec.cloud.baodanxitong.web.channel.model;

import java.util.Date;

public class ChannelCust {
	//通道商户表id
    private Long ccId;
    //商户编号
    private String custCode;
    //通道id
    private Integer channelId;
    //支付方式id
    private Integer prodId;
    //通道商户编号
    private String channelCustNo;
    //上游审核状态/0待提交审核请求/1审核中/2审核通过/3审核不通过
    private Integer auditStatus;
    //通道商户状态/0开通/1关闭
    private Integer status;
    //状态备注
    private String remarks;
    //删除状态/0未删除/1删除
    private Integer delStatus;
    //入库时间
    private Date recordTime;
    //录入人员
    private Long entryUserId;
    //操作时间
    private Date operationTime;
    //操作人
    private Long operationUserId;

    public Long getCcId() {
        return ccId;
    }

    public void setCcId(Long ccId) {
        this.ccId = ccId;
    }

    public String getCustCode() {
        return custCode;
    }

    public void setCustCode(String custCode) {
        this.custCode = custCode == null ? null : custCode.trim();
    }

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public Integer getProdId() {
        return prodId;
    }

    public void setProdId(Integer prodId) {
        this.prodId = prodId;
    }

    public String getChannelCustNo() {
        return channelCustNo;
    }

    public void setChannelCustNo(String channelCustNo) {
        this.channelCustNo = channelCustNo == null ? null : channelCustNo.trim();
    }

    public Integer getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
    @Override
    public String toString(){
		return "ChannelCust:{ccId:" + ccId + ",custCode:" + custCode + ",channelId:" + channelId + ",prodId:" +prodId
				+ ",channelCustNo:" + channelCustNo + ",auditStatus:" + auditStatus + ",status:" + status 
				+ ",remarks:" +remarks + ",delStatus:" + delStatus + ",recordTime:" + recordTime 
				+ ",entryUserId:" + entryUserId + ",operationTime:" + operationTime
				+ ",operationUserId:" + operationUserId + "}"
				;
    }
}