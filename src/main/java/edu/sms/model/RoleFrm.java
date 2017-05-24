package edu.sms.model;



public class RoleFrm extends Searchfrm implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private Integer            rId;
	private String             roleId;
	private String             roleDesc;
	private String             perName;
	private String             moduleId;
	

	public String getModuleId() {
		return moduleId;
	}


	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}


	public RoleFrm() {
	}

	
	public RoleFrm(String perName) {
		this.perName  = perName;
	}

	public Integer getrId() {
		return rId;
	}


	public void setrId(Integer rId) {
		this.rId = rId;
	}
	
	public String getRoleId() {
		return roleId;
	}


	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	
	public String getRoleDesc() {
		return roleDesc;
	}


	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}

	
	public String getPerName() {
		return perName;
	}


	public void setPerName(String perName) {
		this.perName = perName;
	}
}

