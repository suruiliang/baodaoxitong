package com.bec.cloud.baodanxitong.web.customer.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.bec.cloud.baodanxitong.web.customer.model.CustDotDevice;
import com.bec.cloud.baodanxitong.web.customer.model.resp.CustDeviceDetailResp;
import com.bec.cloud.baodanxitong.web.customer.model.resp.CustDeviceSimpleResp;

@Mapper
public interface CustDotDeviceMapper {
    int deleteByPrimaryKey(Long ddId);

    int insert(CustDotDevice record);

    int insertSelective(CustDotDevice record);

    CustDotDevice selectByPrimaryKey(Long ddId);

    int updateByPrimaryKeySelective(CustDotDevice record);

    int updateByPrimaryKey(CustDotDevice record);

	List<CustDeviceSimpleResp> selectCustDeviceSimpleResp(CustDeviceSimpleResp record);

	CustDeviceDetailResp selectCustDeviceDetailRespByPrimaryKey(Long ddId);
}