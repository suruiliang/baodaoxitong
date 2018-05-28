package com.bec.cloud.baodanxitong.web.channel.service;

import com.bec.cloud.baodanxitong.web.channel.model.Channel;

public interface ChannelService {
	int insert(Channel record);

    int insertSelective(Channel record);
}
