package com.bec.cloud.baodanxitong.web.channel.dao;

import org.apache.ibatis.annotations.Mapper;

import com.bec.cloud.baodanxitong.web.channel.model.ChannelCust;

@Mapper
public interface ChannelCustMapper {
    int deleteByPrimaryKey(Long ccId);

    int insert(ChannelCust record);

    int insertSelective(ChannelCust record);

    ChannelCust selectByPrimaryKey(Long ccId);

    int updateByPrimaryKeySelective(ChannelCust record);

    int updateByPrimaryKey(ChannelCust record);
}