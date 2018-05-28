package com.bec.cloud.baodanxitong.web.channel.service;

import com.bec.cloud.baodanxitong.web.channel.model.ChannelCust;

public interface ChannelCustService {
	int deleteByPrimaryKey(Long ccId);

    int insert(ChannelCust record);

    int insertSelective(ChannelCust record);

    ChannelCust selectByPrimaryKey(Long ccId);

    int updateByPrimaryKeySelective(ChannelCust record);

    int updateByPrimaryKey(ChannelCust record);
}
