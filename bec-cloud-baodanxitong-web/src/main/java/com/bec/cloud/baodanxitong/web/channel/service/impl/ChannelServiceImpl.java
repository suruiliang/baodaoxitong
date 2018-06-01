package com.bec.cloud.baodanxitong.web.channel.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bec.cloud.auth.core.support.Constant;
import com.bec.cloud.baodanxitong.web.channel.dao.ChannelMapper;
import com.bec.cloud.baodanxitong.web.channel.model.Channel;
import com.bec.cloud.baodanxitong.web.channel.service.ChannelService;
import com.bec.cloud.service.example.utils.UserInfoUtil;

@Service
public class ChannelServiceImpl implements ChannelService {
	
	@Autowired
	private ChannelMapper mapper;
	@Autowired
	private UserInfoUtil userInfoUtil;
	
	@Override
	public int insert(Channel record) {
		return mapper.insert(record);
	}
	//新增通道
	@Override
	public int insertSelective(Channel record) {
		return mapper.insertSelective(record);
	}
	//查询通道信息
	@Override
	public List<Channel> selectChannel(Channel record) {
		return mapper.selectChannel(record);
	}
	//查询通道信息 单条
	@Override
	public Channel selectByChannelId(Integer channelId) {
		return mapper.selectByChannelId(channelId);
	}
	//逻辑删除单条通道信息
	@Override
	public int delByChannelId(Integer channelId, String channelRemark) {
		Channel record = new Channel();
		record.setChannelId(channelId);
		record.setChannelRemark(channelRemark);
		record.setDelStatus(Constant.DelStatus.DELETED);
		record.setOperationUserId(userInfoUtil.simpleUserInfo().getUserId());
		record.setOperationTime(new Date());
		return mapper.delByChannelId(record);
	}
	//逻辑批量删除通道信息
	@Override
	@Transactional(rollbackFor = Exception.class)
	public int delByChannelId(String channelIds, String channelRemark) {
		Channel record = new Channel();
		record.setChannelRemark(channelRemark);
		record.setDelStatus(Constant.DelStatus.DELETED);
		record.setOperationUserId(userInfoUtil.simpleUserInfo().getUserId());
		String[] array = StringUtils.split(channelIds,",");
		for (String channelId:array) {
			if(StringUtils.isNoneEmpty(channelId)){
				record.setChannelId(Integer.parseInt(channelId));
				mapper.delByChannelId(record);
			}
		}
		return 0;
	}
	//更新通道信息
	@Override
	public int updateByChannelId(Channel record) {
		record.setDelStatus(Constant.DelStatus.DELETED);
		record.setOperationUserId(userInfoUtil.simpleUserInfo().getUserId());
		return mapper.updateByChannelId(record);
	}

}
