package com.bec.cloud.baodanxitong.web.channel.service;

import java.util.List;

import com.bec.cloud.baodanxitong.web.channel.model.ChannelCust;

public interface ChannelCustService {
	int deleteByPrimaryKey(Long ccId);

    int insert(ChannelCust record);
    //新增通道商户信息
    int insertSelective(ChannelCust record);
    //查询通道商户信息
    ChannelCust selectByPrimaryKey(Long ccId);
    //更新通道商户信息
    int updateByPrimaryKeySelective(ChannelCust record);

    int updateByPrimaryKey(ChannelCust record);
    //查询通道商户信息
	List<ChannelCust> selectChannelCust(ChannelCust record);
	//单条删除通道商户信息
	int delByChannelCustNo(String channelCustNo, String remarks);
	//批量删除通道商户信息
	int delByChannelCustNoList(String channelCustNos, String remarks);
}
