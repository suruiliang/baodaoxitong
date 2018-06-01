package com.bec.cloud.baodanxitong.web.channel.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.bec.cloud.baodanxitong.web.channel.model.Channel;

@Mapper
public interface ChannelMapper {
    int insert(Channel record);
    //新增通道
    int insertSelective(Channel record);
    //查询通道信息
	List<Channel> selectChannel(Channel record);
	//查询通道信息 单条
	Channel selectByChannelId(Integer channelId);
	//逻辑删除单条通道信息
	int delByChannelId(Channel record);
	//更新通道信息
	int updateByChannelId(Channel record);
}