package com.bec.cloud.baodanxitong.web.channel.dao;

import org.apache.ibatis.annotations.Mapper;

import com.bec.cloud.baodanxitong.web.channel.model.PayRouteMapping;

@Mapper
public interface PayRouteMappingMapper {
    int insert(PayRouteMapping record);

    int insertSelective(PayRouteMapping record);
}