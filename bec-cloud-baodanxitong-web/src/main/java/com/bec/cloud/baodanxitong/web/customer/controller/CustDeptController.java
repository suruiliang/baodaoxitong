package com.bec.cloud.baodanxitong.web.customer.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bec.cloud.auth.core.support.Result;
import com.bec.cloud.baodanxitong.web.customer.model.resp.CustDeptDetailResp;
import com.bec.cloud.baodanxitong.web.customer.model.resp.CustDeptSimpleResp;
import com.bec.cloud.baodanxitong.web.customer.service.CustDeptService;
import com.bec.cloud.baodanxitong.web.util.PageUtil;

/**
* @author suruiliang
* @version 创建时间：2018年6月20日 下午1:17:52
* @ClassName 类名称
* @Description 类描述
*/
@RestController
@RequestMapping(value="/cust/dept")
public class CustDeptController {
	@Autowired
	private CustDeptService custDeptService;
	
	/**
	 * 商户门店信息列表
	 * @param request
	 * @param record
	 * @return
	 */
	@GetMapping(value="/list")
	public Result<?> list(HttpServletRequest request,CustDeptSimpleResp record) {
		PageUtil.startPage(request);
		return Result.success(custDeptService.selectCustDeptSimpleResp(record));
	}
	
	/**
	 * 查看门店详情
	 * @param dotId
	 * @return
	 */
	@GetMapping(value="/view/{dotId}")
	public Result<CustDeptDetailResp> view(@PathVariable Long dotId) {
		return Result.success(custDeptService.selectCustDeptDetailRespByPrimaryKey(dotId));
	}
	
	/**
	 * 门店信息修改
	 * @param req
	 * @return
	 */
	@PostMapping(value="/update")
	public Result<?> update(String req) {
		//TODO 参数校验
		custDeptService.update(req);
		return Result.success(null);
	}
	
	/**
	 * 门店信息新增
	 * @param req
	 * @return
	 */
	@PostMapping(value="/add")
	public Result<?> add(String req) {
		//TODO 参数校验
		custDeptService.add(req);
		return Result.success(null);
	}
	

}
