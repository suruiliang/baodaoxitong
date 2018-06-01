package com.bec.cloud.baodanxitong.web.channel.model;

import java.util.Date;
/**
 * 路由表实例
 * @author wxb
 *
 */
public class PayRouteMapping {
	//商户编号
    private String custCode;
    //通道id(主)
    private Integer channelId1;
    //通道id（备）
    private Integer channelId2;
    //通道id（备）
    private Integer channelId3;
    //入库时间
    private Date recordTime;
    //录入人员
    private Long entryUserId;
    //操作时间
    private Date operationTime;
    //操作人
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
    @Override
    public String toString (){
		return "PayRouteMapping:{custCode:" + custCode + ",channelId1:" + channelId1 + ",channelId2:" + channelId2
				+ ",channelId3:" + channelId3 + ",recordTime:" + recordTime + ",entryUserId:" + entryUserId
				+ ",operationTime:" + operationTime + ",operationUserId:" + operationUserId + "}";
    	
    }
}