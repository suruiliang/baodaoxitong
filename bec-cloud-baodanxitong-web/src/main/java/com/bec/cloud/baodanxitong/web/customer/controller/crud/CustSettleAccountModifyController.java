package com.bec.cloud.baodanxitong.web.customer.controller.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bec.cloud.baodanxitong.web.customer.service.crud.CustSettleAccountModifyService;

/**
 * 
 * @author niwei
 * @time   2018下午3:44:46
 * @description
 */
@RestController
@RequestMapping(value="/custSettleAccountModify")
public class CustSettleAccountModifyController {
	@Autowired
	private CustSettleAccountModifyService accountModifyService;

}
