package com.bec.cloud.baodanxitong.web.channel.service;

import java.util.List;

import com.bec.cloud.baodanxitong.web.channel.model.ChannelCust;

public interface ChannelCustService {
	int deleteByPrimaryKey(Long ccId);

    int insert(ChannelCust record);

    int insertSelective(ChannelCust record);

    ChannelCust selectByPrimaryKey(Long ccId);

    int updateByPrimaryKeySelective(ChannelCust record);

    int updateByPrimaryKey(ChannelCust record);

	List<ChannelCust> selectChannelCust(ChannelCust record);

	int delByChannelCustNo(String channelCustNo, String remarks);

	int delByChannelCustNoList(String channelCustNos, String remarks);
}
