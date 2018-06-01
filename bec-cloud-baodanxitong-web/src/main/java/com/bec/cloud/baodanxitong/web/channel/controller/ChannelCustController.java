package com.bec.cloud.baodanxitong.web.channel.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bec.cloud.auth.core.support.Result;
import com.bec.cloud.baodanxitong.web.channel.model.ChannelCust;
import com.bec.cloud.baodanxitong.web.channel.service.ChannelCustService;
import com.bec.cloud.baodanxitong.web.util.PageUtil;
import com.bec.cloud.service.example.utils.CheckParamUtil;

/**
 * 
 * @author wxb
 * @time   2018下午3:52:25
 * @description
 */
@RestController
@RequestMapping(value="/channelCust")
public class ChannelCustController {
	
	@Autowired
	private ChannelCustService channelCustService;
	
	/**
	 * 查询通道商户信息
	 * @param request
	 * @param record
	 * @return list
	 */
	@GetMapping(value = "/list")
	public Result<?> lis(HttpServletRequest request,ChannelCust record){
		PageUtil.startPage(request);
		return Result.success(channelCustService.selectChannelCust(record));
	}
	/**
	 * 查询通道商户信息
	 * @param ccId
	 * @return
	 */
	@GetMapping(value = "/view/{ccId}")
	public Result<?> view(@PathVariable Long ccId){
		return Result.success(channelCustService.selectByPrimaryKey(ccId));
	}
	/**
	 * 新增通道商户信息
	 * @param record
	 * @return
	 */
	@PostMapping(value = "/save")
	public Result<?> save(ChannelCust record){
		CheckParamUtil.checkParam(record, "custCode","channelId","prodId","channelCustNo","entryUserId");
		return Result.success(channelCustService.insertSelective(record));
	}
	/**
	 * 单条删除通道商户信息
	 * @param channelCustNo
	 * @param remarks
	 * @return
	 */
	@PostMapping(value = "/del/{channelCustNo,remarks}")
	public Result<?> del(@PathVariable String channelCustNo,@PathVariable String remarks){
		return Result.success(channelCustService.delByChannelCustNo(channelCustNo,remarks));
	}
	/**
	 * 批量删除通道商户信息
	 * @param channelCustNos
	 * @param remarks
	 * @return
	 */
	@PostMapping(value = "/delbatch/{channelCustNos,remarks}")
	public Result<?> delbatch(@PathVariable String channelCustNos,@PathVariable String remarks){
		return Result.success(channelCustService.delByChannelCustNoList(channelCustNos,remarks));
	}
	/**
	 * 更新通道商户信息
	 * @param record
	 * @return
	 */
	@PostMapping(value = "/update")
	public Result<?> update(ChannelCust record){
		return Result.success(channelCustService.updateByPrimaryKeySelective(record));
	}
}
