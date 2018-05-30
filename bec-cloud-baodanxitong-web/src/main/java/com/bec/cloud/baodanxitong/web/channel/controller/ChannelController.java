package com.bec.cloud.baodanxitong.web.channel.controller;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.POST;

import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bec.cloud.auth.core.support.Result;
import com.bec.cloud.baodanxitong.web.channel.model.Channel;
import com.bec.cloud.baodanxitong.web.channel.service.ChannelService;
import com.bec.cloud.baodanxitong.web.util.PageUtil;
import com.bec.cloud.service.example.utils.CheckParamUtil;

/**
 * 
 * @author wxb
 * @time   2018下午4:09:00
 * @description
 */
@RestController
@RequestMapping(value = "/channel")
public class ChannelController {
	
	@Autowired
	private ChannelService channelService;
	
	/**
	 * 查询通道信息
	 * @param request
	 * @param record
	 * @return	list
	 */
	@GetMapping(value = "/list")
	public Result<?> list(HttpServletRequest request,Channel record){
		PageUtil.startPage(request);
		return Result.success(channelService.selectChannel(record));
	}
	/**
	 * 查询通道信息
	 * @param channelId
	 * @return 单条
	 */
	@GetMapping(value = "/view/{channelId}")
	public Result<?> view(@PathVariable Integer channelId){
		return Result.success(channelService.selectByChannelId(channelId));
	}
	/**
	 * 新增通道
	 * @param record
	 * @return
	 */
	@PostMapping(value = "/save")
	public Result<?> svae(Channel record){
		CheckParamUtil.checkParam(record, "channelCode","channelName","channelUrl","channelRemark","channelStatus","delStatus");
		return Result.success(channelService.insertSelective(record));
	}
	/**
	 * 逻辑删除单条通道信息
	 * @param channelId
	 * @return
	 */
	@PostMapping(value = "/del/{channelId,channelRemark}")
	public Result<?> del(@PathVariable Integer channelId,@PathVariable String channelRemark){
		return Result.success(channelService.delByChannelId(channelId,channelRemark));
	}
	/**
	 * 逻辑批量删除通道信息
	 * @param channelIds
	 * @return
	 */
	@PostMapping(value = "/delbatch")
	public Result<?> delbatch(String channelIds,@PathVariable String channelRemark){
		return Result.success(channelService.delByChannelId(channelIds,channelRemark));
	}
	/**
	 * 更新通道信息
	 * @param record
	 * @return
	 */
	@PostMapping(value = "/update")
	public Result<?> update(Channel record){
		CheckParamUtil.checkParam(record, "channelCode","channelName","channelUrl","channelRemark","channelStatus");
		return Result.success(channelService.updateByChannelId(record));
	}
}
