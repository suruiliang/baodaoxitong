package com.bec.cloud.baodanxitong.web.channel.service;


import java.util.List;

import com.bec.cloud.baodanxitong.web.channel.model.Channel;

public interface ChannelService {
	int insert(Channel record);
	//新增通道
    int insertSelective(Channel record);
    //查询通道信息 多条
	List<Channel> selectChannel(Channel record);
	//查询通道信息 单条
	Channel selectByChannelId(Integer channelId);
	//逻辑删除单条通道信息
	int delByChannelId(Integer channelId, String channelRemark);
	//逻辑批量删除通道信息
	int delByChannelId(String channelIds, String channelRemark);
	//更新通道信息
	int updateByChannelId(Channel record);
}
