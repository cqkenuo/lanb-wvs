package com.colodoo.framework.manager.roleMenu.model;

import java.io.Serializable;
import java.util.Date;

import com.colodoo.framework.easyui.Page;

/**
* @author colodoo
* @date 2019-4-25 17:07:42
* @description 
*/
public class RoleMenuVO extends RoleMenu implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Date dateFrom;
    private Date dateTo;
    
    private Page page;

    private String roleName;
    private String menuName;

    public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }
    
    public Date getDateFrom(Date dateFrom) {
        return this.dateFrom;
    }

    public Date getDateTo(Date dateTo) {
        return this.dateTo;
    }
    
    public RoleMenuVO() {
		this.page = new Page();
	}

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }
}
