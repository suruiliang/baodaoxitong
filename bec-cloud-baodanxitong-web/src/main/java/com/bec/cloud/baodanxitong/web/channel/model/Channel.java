package com.bec.cloud.baodanxitong.web.channel.model;

import java.util.Date;
/**
 * 上游通道表实例
 * @author wxb
 *
 */
public class Channel {
	//通道表id
    private Integer channelId;
    //通道编号
    private String channelCode;
    //通道名称
    private String channelName;
    //通道接口地址
    private String channelUrl;
    //通道描述
    private String channelRemark;
    //通道状态/0开启/1关闭
    private Integer channelStatus;
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
    
    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode == null ? null : channelCode.trim();
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName == null ? null : channelName.trim();
    }

    public String getChannelUrl() {
        return channelUrl;
    }

    public void setChannelUrl(String channelUrl) {
        this.channelUrl = channelUrl == null ? null : channelUrl.trim();
    }

    public String getChannelRemark() {
        return channelRemark;
    }

    public void setChannelRemark(String channelRemark) {
        this.channelRemark = channelRemark == null ? null : channelRemark.trim();
    }

    public Integer getChannelStatus() {
        return channelStatus;
    }

    public void setChannelStatus(Integer channelStatus) {
        this.channelStatus = channelStatus;
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
		return "Channel:{channelId:" + channelId + ",channelCode:" + channelCode
				+ ",channelName:" + channelName + ",channelUrl:" + channelUrl + ",channelRemark:" + channelRemark
				+ ",channelStatus:" + channelStatus + ",delStatus:" + delStatus + ",recordTime:" + recordTime
				+ ",entryUserId:" + entryUserId + ",operationTime:" + operationTime + ",operationUserId" + operationUserId
				+ "}";
    }
}