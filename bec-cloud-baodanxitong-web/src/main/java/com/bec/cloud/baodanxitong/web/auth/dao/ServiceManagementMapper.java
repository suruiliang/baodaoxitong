package com.bec.cloud.baodanxitong.web.auth.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.bec.cloud.baodanxitong.web.auth.model.ServiceManagement;

@Mapper
public interface ServiceManagementMapper {
    int deleteByPrimaryKey(Long serviceId);

    int insert(ServiceManagement record);

    int insertSelective(ServiceManagement record);

    ServiceManagement selectByPrimaryKey(Long serviceId);

    int updateByPrimaryKeySelective(ServiceManagement record);

    int updateByPrimaryKey(ServiceManagement record);

	List<ServiceManagement> selectServiceManagement(ServiceManagement record);
}