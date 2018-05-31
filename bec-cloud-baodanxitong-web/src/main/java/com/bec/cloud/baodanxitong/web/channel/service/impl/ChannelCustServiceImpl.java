package com.bec.cloud.baodanxitong.web.channel.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bec.cloud.auth.core.support.Constant;
import com.bec.cloud.baodanxitong.web.channel.dao.ChannelCustMapper;
import com.bec.cloud.baodanxitong.web.channel.model.ChannelCust;
import com.bec.cloud.baodanxitong.web.channel.service.ChannelCustService;
import com.bec.cloud.service.example.utils.UserInfoUtil;

@Service
public class ChannelCustServiceImpl implements ChannelCustService {
	
	@Autowired
	private ChannelCustMapper mapper;
	@Autowired
	private UserInfoUtil userInfoUtil;

	@Override
	public int deleteByPrimaryKey(Long ccId) {
		return mapper.deleteByPrimaryKey(ccId);
	}

	@Override
	public int insert(ChannelCust record) {
		return mapper.insert(record);
	}
	//新增通道商户信息
	@Override
	public int insertSelective(ChannelCust record) {
		return mapper.insertSelective(record);
	}
	//查询通道商户信息
	@Override
	public ChannelCust selectByPrimaryKey(Long ccId) {
		return mapper.selectByPrimaryKey(ccId);
	}
	//更新通道商户信息
	@Override
	public int updateByPrimaryKeySelective(ChannelCust record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(ChannelCust record) {
		return mapper.updateByPrimaryKey(record);
	}
	//查询通道商户信息
	@Override
	public List<ChannelCust> selectChannelCust(ChannelCust record) {
		return mapper.selectChannelCust(record);
	}
	//单条删除通道商户信息
	@Override
	public int delByChannelCustNo(String channelCustNo,String remarks) {
		ChannelCust record = new ChannelCust();
		record.setChannelCustNo(channelCustNo);
		record.setRemarks(remarks);
		record.setDelStatus(Constant.DelStatus.DELETED);
		record.setOperationUserId(userInfoUtil.simpleUserInfo().getUserId());
		record.setOperationTime(new Date());
		return mapper.delByChannelCustNo(record);
	}
	//批量删除通道商户信息
	@Override
	public int delByChannelCustNoList(String channelCustNos, String remarks) {
		ChannelCust record = new ChannelCust();
		record.setRemarks(remarks);
		record.setDelStatus(Constant.DelStatus.DELETED);
		record.setOperationUserId(userInfoUtil.simpleUserInfo().getUserId());
		record.setOperationTime(new Date());
		String[] array = StringUtils.split(channelCustNos,",");
		for (String channelCustNo: array) {
			if(StringUtils.isNotEmpty(channelCustNo)){
				record.setChannelCustNo(channelCustNo);
				mapper.delByChannelCustNo(record);
			}		
		}
		return 0;
	}

}
