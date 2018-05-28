package com.bec.cloud.baodanxitong.web.channel.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bec.cloud.baodanxitong.web.channel.dao.ChannelCustMapper;
import com.bec.cloud.baodanxitong.web.channel.model.ChannelCust;
import com.bec.cloud.baodanxitong.web.channel.service.ChannelCustService;

@Service
public class ChannelCustServiceImpl implements ChannelCustService {
	
	@Autowired
	private ChannelCustMapper mapper;

	@Override
	public int deleteByPrimaryKey(Long ccId) {
		return mapper.deleteByPrimaryKey(ccId);
	}

	@Override
	public int insert(ChannelCust record) {
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(ChannelCust record) {
		return mapper.insertSelective(record);
	}

	@Override
	public ChannelCust selectByPrimaryKey(Long ccId) {
		return mapper.selectByPrimaryKey(ccId);
	}

	@Override
	public int updateByPrimaryKeySelective(ChannelCust record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(ChannelCust record) {
		return mapper.updateByPrimaryKey(record);
	}

}
