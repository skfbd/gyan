package edu.sms.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Searchfrm implements Serializable {
	private static final long serialVersionUID = 1L;
	 
	
	private String  moduleId;
	
	private String  menuId;
	private String  usertypeName;
	
	
	
	public String getMenuId() {
		return menuId;
	}
	
	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}
	public String getUsertypeName() {
		return usertypeName;
	}
	public void setUsertypeName(String usertypeName) {
		this.usertypeName = usertypeName;
	}
	
	
	public String getModuleId() {
		return moduleId;
	}
	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}

	
		
}
