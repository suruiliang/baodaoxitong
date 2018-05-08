package com.bec.cloud.baodanxitong.web.auth.service;
/**
 * @author suruiliang
 * @version 创建时间：2018年5月5日 上午11:02:54
 * @ClassName 类名称
 * @Description 类描述
 */

import java.util.List;

import com.bec.cloud.baodanxitong.web.auth.model.Organization;

public interface OrganizationService {
	List<Organization> selectOrganization(Organization record);

	Organization selectByPrimaryKey(Long orgId);

	int deleteOrganization(Long orgId);

	Organization saveOrganization(Organization record);

}
