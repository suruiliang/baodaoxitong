package com.bec.cloud.baodanxitong.web.channel.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bec.cloud.baodanxitong.web.channel.dao.ChannelMapper;
import com.bec.cloud.baodanxitong.web.channel.model.Channel;
import com.bec.cloud.baodanxitong.web.channel.service.ChannelService;

@Service
public class ChannelServiceImpl implements ChannelService {
	
	@Autowired
	private ChannelMapper mapper;

	@Override
	public int insert(Channel record) {
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(Channel record) {
		return mapper.insertSelective(record);
	}

}
