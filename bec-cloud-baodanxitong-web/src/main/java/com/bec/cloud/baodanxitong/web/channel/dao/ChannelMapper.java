package com.bec.cloud.baodanxitong.web.channel.dao;

import org.apache.ibatis.annotations.Mapper;

import com.bec.cloud.baodanxitong.web.channel.model.Channel;

@Mapper
public interface ChannelMapper {
    int insert(Channel record);

    int insertSelective(Channel record);
}