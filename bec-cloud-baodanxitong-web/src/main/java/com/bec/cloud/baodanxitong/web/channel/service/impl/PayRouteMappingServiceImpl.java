package com.bec.cloud.baodanxitong.web.channel.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bec.cloud.baodanxitong.web.channel.dao.PayRouteMappingMapper;
import com.bec.cloud.baodanxitong.web.channel.model.PayRouteMapping;
import com.bec.cloud.baodanxitong.web.channel.service.PayRouteMappingService;

@Service
public class PayRouteMappingServiceImpl implements PayRouteMappingService {
	
	@Autowired
	private PayRouteMappingMapper mapper;

	@Override
	public int insert(PayRouteMapping record) {
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(PayRouteMapping record) {
		return mapper.insertSelective(record);
	}

}
