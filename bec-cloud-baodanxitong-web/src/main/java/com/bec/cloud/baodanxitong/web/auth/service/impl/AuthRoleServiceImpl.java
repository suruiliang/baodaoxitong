package com.bec.cloud.baodanxitong.web.auth.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bec.cloud.auth.core.support.Constant;
import com.bec.cloud.baodanxitong.web.auth.dao.AuthMenuBtnMapper;
import com.bec.cloud.baodanxitong.web.auth.dao.AuthMenuMapper;
import com.bec.cloud.baodanxitong.web.auth.dao.AuthRoleMapper;
import com.bec.cloud.baodanxitong.web.auth.model.AuthMenu;
import com.bec.cloud.baodanxitong.web.auth.model.AuthMenuBtn;
import com.bec.cloud.baodanxitong.web.auth.model.AuthRole;
import com.bec.cloud.baodanxitong.web.auth.model.resp.MenuBtn;
import com.bec.cloud.baodanxitong.web.auth.service.AuthRoleService;
import com.bec.cloud.service.example.model.Customer;
import com.bec.cloud.service.example.model.Organization;
import com.bec.cloud.service.example.model.UserInfo;
import com.bec.cloud.service.example.utils.UserInfoUtil;

/**
 * @author suruiliang
 * @version 创建时间：2018年5月7日 下午3:53:55
 * @ClassName 类名称
 * @Description 类描述
 */
@Service
public class AuthRoleServiceImpl implements AuthRoleService {
	@Autowired
	private AuthRoleMapper authRoleMapper;
	@Autowired
	private AuthMenuMapper authMenuMapper;
	@Autowired
	private AuthMenuBtnMapper authMenuBtnMapper;
	@Autowired
	private UserInfoUtil userInfoUtil;

	@Override
	public List<AuthRole> selectAuthRole(AuthRole record) {
		return authRoleMapper.selectAuthRole(record);
	}

	@Override
	public AuthRole selectByPrimaryKey(Integer roleId) {
		AuthRole authRole=authRoleMapper.selectByPrimaryKey(roleId);
		if (authRole!=null) {
			List<MenuBtn> allMenuBtns=initAllMenuBtns();
			checkMenuBtns(allMenuBtns, roleId);
			authRole.setMenuBtns(allMenuBtns);
		}
		return authRole;
	}

	private void checkMenuBtns(List<MenuBtn> allMenuBtns, Integer roleId) {
		List<Map<String, Integer>> selfMenuBtns=authRoleMapper.selectMenuBtnByRoleId(roleId);
		if (CollectionUtils.isNotEmpty(allMenuBtns)&&CollectionUtils.isNotEmpty(selfMenuBtns)) {
			for (MenuBtn menuBtn : allMenuBtns) {
				for (Map<String, Integer> map : selfMenuBtns) {
					if (menuBtn.getType()==0&&menuBtn.getMenuId().equals(map.get("menuId"))) {
						menuBtn.setChecked(true);
						break;
					}
					if (menuBtn.getType()==1&&menuBtn.getMenuId().equals(map.get("menuId"))&&menuBtn.getBtnId().equals(map.get("btnId"))) {
						menuBtn.setChecked(true);
						break;
					}
				}
			}
		}
	}

	@Cacheable(value="initMenuBtns")
	private List<MenuBtn> initAllMenuBtns() {
		List<MenuBtn> allMenuBtns=new ArrayList<>();
		AuthMenu param=new AuthMenu();
		param.setMenuStatus(Constant.OnOffStatus.ON);
		List<AuthMenu> authMenus=authMenuMapper.selectAuthMenu(param);
		if (CollectionUtils.isNotEmpty(authMenus)) {
			for (AuthMenu authMenu : authMenus) {
				allMenuBtns.add(MenuBtn.builder()
						.id(authMenu.getMenuId()+"")
						.pId(authMenu.getMenuPid()==null?null:authMenu.getMenuPid()+"")
						.name(authMenu.getMenuName())
						.open(true)
						.checked(false)
						.type((short) 0)
						.btnId(null)
						.menuId(authMenu.getMenuId())
						.build());
			}
			List<AuthMenuBtn> authMenuBtns=authMenuBtnMapper.selectAuthMenuBtnByAuthMenus(authMenus);
			if (CollectionUtils.isNotEmpty(authMenuBtns)) {
				for (AuthMenuBtn authMenuBtn : authMenuBtns) {
					allMenuBtns.add(MenuBtn.builder()
							.id("btn_"+authMenuBtn.getBtnId())
							.pId(authMenuBtn.getMenuId()+"")
							.name(authMenuBtn.getBtnName())
							.open(true)
							.checked(false)
							.type((short) 1)
							.btnId(authMenuBtn.getBtnId())
							.menuId(authMenuBtn.getMenuId())
							.build());
				}
			}
		}
		return allMenuBtns;
	}

	@Override
	@Transactional(rollbackFor=Exception.class)
	public int deleteAuthRole(Integer roleId) {
		AuthRole record=new AuthRole();
		record.setRoleId(roleId);
		record.setDelStatus(Constant.DelStatus.DELETED);
		record.setOperationUserId(userInfoUtil.simpleUserInfo().getUserId());
		record.setOperationTime(new Date());
		return authRoleMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	@Transactional(rollbackFor=Exception.class)
	public int deleteAuthRole(String roleIds) {
		String roleIdArray[]=StringUtils.split(roleIds, ",");
		for (String roleId : roleIdArray) {
			if (StringUtils.isNotEmpty(roleId)) {
				deleteAuthRole(Integer.valueOf(roleId));
			}
		}
		return 0;
	}

	@Override
	@Transactional(rollbackFor=Exception.class)
	public AuthRole saveAuthRole(AuthRole record,String authString) {
		UserInfo userInfo=userInfoUtil.userInfo();
		if (record.getRoleId()==null) {//insert
			//默认取用户所在机构和商户编号
			if (StringUtils.isEmpty(record.getOrgCode())&&CollectionUtils.isNotEmpty(userInfo.getOrganizations())) {
				StringBuffer orgCode=new StringBuffer();;
				for (Organization ao : userInfo.getOrganizations()) {
					orgCode.append(","+ao.getOrgCode());
				}
				record.setOrgCode(orgCode.substring(1));
			}
			if (StringUtils.isEmpty(record.getCustCode())&&CollectionUtils.isNotEmpty(userInfo.getCustomers())) {
				StringBuffer custCode=new StringBuffer();;
				for (Customer c : userInfo.getCustomers()) {
					custCode.append(","+c.getCustCode());
				}
				record.setCustCode(custCode.substring(1));
			}
			record.setEntryUserId(userInfo.getUserId());
			record.setOperationUserId(userInfo.getUserId());
			record.setRecordTime(new Date());
			record.setOperationTime(new Date());
			authRoleMapper.insertSelective(record);
			saveRoleMenuBtn(record, authString);
		}else {//update
			record.setOperationUserId(userInfo.getUserId());
			record.setOperationTime(new Date());
			authRoleMapper.updateByPrimaryKeySelective(record);
			saveRoleMenuBtn(record, authString);
		}
		return authRoleMapper.selectByPrimaryKey(record.getRoleId());
	}

	private void saveRoleMenuBtn(AuthRole record, String authString) {
		authRoleMapper.deleteRoleMenuBtn(record.getRoleId());
		JSONArray jsonArray=JSONArray.parseArray(authString);
		List<Map<String, Object>> list=new ArrayList<>();
		if (CollectionUtils.isNotEmpty(jsonArray)) {
			for (Object o : jsonArray) {
				JSONObject jo=(JSONObject) o;
				Map<String, Object> data=new HashMap<String, Object>();
				data.put("roleId", record.getRoleId());
				data.put("menuId", jo.get("menuId"));
				data.put("btnId", jo.get("btnId")==null?null:jo.get("btnId"));
				list.add(data);
			}
			authRoleMapper.saveRoleMenuBtn(list);
		}
	}



}
