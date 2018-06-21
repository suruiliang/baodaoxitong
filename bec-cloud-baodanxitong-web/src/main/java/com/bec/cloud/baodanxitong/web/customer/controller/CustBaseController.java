package com.bec.cloud.baodanxitong.web.customer.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bec.cloud.auth.core.support.Result;
import com.bec.cloud.baodanxitong.web.customer.model.resp.CustBaseDetailResp;
import com.bec.cloud.baodanxitong.web.customer.model.resp.CustBaseSimpleResp;
import com.bec.cloud.baodanxitong.web.customer.service.CustBaseService;
import com.bec.cloud.baodanxitong.web.util.PageUtil;

/**
* @author suruiliang
* @version 创建时间：2018年6月20日 下午1:17:52
* @ClassName 类名称
* @Description 类描述
*/
@RestController
@RequestMapping(value="/cust/base")
public class CustBaseController {
	@Autowired
	private CustBaseService custBaseService;
	
	/**
	 * 商户基本信息列表
	 * @param request
	 * @param record
	 * @return
	 */
	@GetMapping(value="/list")
	public Result<?> list(HttpServletRequest request,CustBaseSimpleResp record) {
		PageUtil.startPage(request);
		return Result.success(custBaseService.selectCustBaseResp(record));
	}
	
	/**
	 * 查看商户基本信息详情
	 * @param custId
	 * @return
	 */
	@GetMapping(value="/view/{custId}")
	public Result<CustBaseDetailResp> view(@PathVariable Long custId) {
		return Result.success(custBaseService.selectCustBaseDetailRespByPrimaryKey(custId));
	}
	
	/**
	 * 商户基本信息修改
	 * @param req
	 * @return
	 */
	@PostMapping(value="/update")
	public Result<?> save(String req) {
		//TODO 参数校验
		custBaseService.update(req);
		return Result.success(null);
	}
	

}
