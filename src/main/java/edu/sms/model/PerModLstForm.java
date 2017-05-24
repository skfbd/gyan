package edu.sms.model;

import java.io.Serializable;

public class PerModLstForm implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	String moduleName;
	String moduleCaption;
	String moduleValue;
	boolean checkflag;

	


	public PerModLstForm() {

	}


	public String getModuleName() {
		return moduleName;
	}


	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}


	public String getModuleValue() {
		return moduleValue;
	}


	public void setModuleValue(String moduleValue) {
		this.moduleValue = moduleValue;
	}


	public String getModuleCaption() {
		return moduleCaption;
	}


	public void setModuleCaption(String moduleCaption) {
		this.moduleCaption = moduleCaption;
	}
	public boolean isCheckflag() {
		return checkflag;
	}


	public void setCheckflag(boolean checkflag) {
		this.checkflag = checkflag;
	}

}
