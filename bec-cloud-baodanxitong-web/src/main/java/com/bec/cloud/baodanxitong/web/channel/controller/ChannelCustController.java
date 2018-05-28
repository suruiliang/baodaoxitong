package com.bec.cloud.baodanxitong.web.channel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bec.cloud.baodanxitong.web.channel.service.ChannelCustService;

/**
 * 
 * @author niwei
 * @time   2018下午3:52:25
 * @description
 */
@RestController
@RequestMapping(value="/channelCust")
public class ChannelCustController {
	
	@Autowired
	private ChannelCustService channelCustService;

}
