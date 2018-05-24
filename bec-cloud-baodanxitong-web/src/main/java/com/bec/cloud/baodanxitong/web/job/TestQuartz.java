package com.bec.cloud.baodanxitong.web.job;

import java.util.Date;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
* @author suruiliang
* @version 创建时间：2018年5月23日 上午11:50:29
* @ClassName 类名称:com.bec.cloud.baodanxitong.web.job.TestQuartz
* @Description 类描述
*/
public class TestQuartz extends QuartzJobBean {

	@Override
	protected void executeInternal(JobExecutionContext arg0) throws JobExecutionException {
		System.out.println("=============="+new Date());
		
	}

}
