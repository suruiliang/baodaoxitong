package com.bec.cloud.baodanxitong.web.channel.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.bec.cloud.baodanxitong.web.channel.model.ChannelCust;

@Mapper
public interface ChannelCustMapper {
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
	int delByChannelCustNo(ChannelCust record);
}