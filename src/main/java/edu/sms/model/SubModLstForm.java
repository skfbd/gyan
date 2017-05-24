package edu.sms.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SubModLstForm implements Serializable {
	private static final long serialVersionUID = 1L;
	 
	
	String  moduleName;
	String  moduleCaption;
	String  moduleValue;
	boolean checkflag;
	String linkUrl;
	
	

	public String getLinkUrl() {
		return linkUrl;
	}


	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}


	public boolean isCheckflag() {
		return checkflag;
	}


	public void setCheckflag(boolean checkflag) {
		this.checkflag = checkflag;
	}


	List<PerModLstForm> perfrmList= new ArrayList<PerModLstForm>();

	

	public SubModLstForm() {

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


	
	


	public List<PerModLstForm> getPerfrmList() {
		return perfrmList;
	}


	public void setPerfrmList(List<PerModLstForm> perfrmList) {
		this.perfrmList = perfrmList;
	}
	
		
}
