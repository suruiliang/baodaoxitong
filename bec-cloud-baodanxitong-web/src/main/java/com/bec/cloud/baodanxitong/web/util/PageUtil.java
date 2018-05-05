package com.bec.cloud.baodanxitong.web.util;

import javax.servlet.http.HttpServletRequest;

import com.github.pagehelper.PageHelper;

/**
 * @author suruiliang
 * @version 创建时间：2018年5月5日 上午11:16:54
 * @ClassName 类名称
 * @Description 类描述
 */
public class PageUtil {
	public static void startPage(HttpServletRequest request) {
		Integer pageNum=request.getParameter("pageNum")==null?1:Integer.valueOf(request.getParameter("pageNum"));
		Integer pageSize=request.getParameter("pageSize")==null?10:Integer.valueOf(request.getParameter("pageSize"));
		PageHelper.startPage(pageNum, pageSize);
	}
}
