package com.bec.cloud.baodanxitong.web.channel.service;

import com.bec.cloud.baodanxitong.web.channel.model.PayRouteMapping;

public interface PayRouteMappingService {
	int insert(PayRouteMapping record);

    int insertSelective(PayRouteMapping record);
}
