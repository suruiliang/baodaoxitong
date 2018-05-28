package com.bec.cloud.baodanxitong.web.channel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bec.cloud.baodanxitong.web.channel.service.ChannelService;

/**
 * 
 * @author niwei
 * @time   2018下午4:09:00
 * @description
 */
@RestController
@RequestMapping(value = "/channel")
public class ChannelController {
	
	@Autowired
	private ChannelService channelService;

}
