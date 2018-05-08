package com.bec.cloud.baodanxitong.web.auth.model.resp;

import lombok.Builder;
import lombok.Data;

/**
 * @author suruiliang
 * @version 创建时间：2018年5月7日 下午5:15:24
 * @ClassName 类名称
 * @Description 类描述
 */
@Builder
@Data
public class MenuBtn {
	private String id;
	private String pId;
	private String name;
	private Boolean open;
	private Boolean checked;
	//0 menu;1 btn
	private Short type;
	private Integer menuId;
	private Integer btnId;
}
