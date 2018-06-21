package com.bec.cloud.baodanxitong.web.customer.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bec.cloud.auth.core.support.Result;
import com.bec.cloud.baodanxitong.web.customer.model.resp.CustDeviceDetailResp;
import com.bec.cloud.baodanxitong.web.customer.model.resp.CustDeviceSimpleResp;
import com.bec.cloud.baodanxitong.web.customer.service.CustDeviceService;
import com.bec.cloud.baodanxitong.web.util.PageUtil;

/**
* @author suruiliang
* @version 创建时间：2018年6月20日 下午1:17:52
* @ClassName 类名称
* @Description 类描述
*/
@RestController
@RequestMapping(value="/cust/device")
public class CustDeviceController {
	@Autowired
	private CustDeviceService custDeviceService;
	
	/**
	 * 设备信息列表
	 * @param request
	 * @param record
	 * @return
	 */
	@GetMapping(value="/list")
	public Result<?> list(HttpServletRequest request,CustDeviceSimpleResp record) {
		PageUtil.startPage(request);
		return Result.success(custDeviceService.selectCustDeviceSimpleResp(record));
	}
	
	/**
	 * 查看设备详情
	 * @param dotId
	 * @return
	 */
	@GetMapping(value="/view/{ddId}")
	public Result<CustDeviceDetailResp> view(@PathVariable Long ddId) {
		return Result.success(custDeviceService.selectCustDeviceDetailRespByPrimaryKey(ddId));
	}
	
	/**
	 * 设备信息修改
	 * @param req
	 * @return
	 */
	@PostMapping(value="/update")
	public Result<?> update(String req) {
		//TODO 参数校验
		custDeviceService.update(req);
		return Result.success(null);
	}
	
	/**
	 * 设备信息新增
	 * @param req
	 * @return
	 */
	@PostMapping(value="/add")
	public Result<?> add(String req) {
		//TODO 参数校验
		custDeviceService.add(req);
		return Result.success(null);
	}
	
	@PostMapping(value="/del/{ddId}")
	public Result<?> delete(@PathVariable Long ddId) {
		return Result.success(custDeviceService.deleteCustDevice(ddId));
	}
	
	@PostMapping(value="/delbatch")
	public Result<?> deleteBatch(String ddIds) {
		return Result.success(custDeviceService.deleteCustDevice(ddIds));
	}
	

}
