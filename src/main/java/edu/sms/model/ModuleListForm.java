package edu.sms.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import edu.sms.model.SubModLstForm;


public class ModuleListForm extends Searchfrm  implements Serializable {
	private static final long serialVersionUID = 1L;
	String[] mainModules; 
	String[] subModule;
	String[] perModule;
	
	String 	 moduleName;
	String 	 moduleValue;
	String   moduleCaption;
	boolean  checkflag;
	String   userType;
	Integer   userTypeId;
    String   userDescription;

	





	List<SubModLstForm> subfrmList= new ArrayList<SubModLstForm>();
	


	

	public ModuleListForm() {

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


	public String[] getMainModules() {
		return mainModules;
	}


	public void setMainModules(String[] mainModules) {
		this.mainModules = mainModules;
	}

	public List<SubModLstForm> getSubfrmList() {
		return subfrmList;
	}


	public void setSubfrmList(List<SubModLstForm> subfrmList) {
		this.subfrmList = subfrmList;
	}

	
	public String[] getSubModule() {
		return subModule;
	}


	public void setSubModule(String[] subModule) {
		this.subModule = subModule;
	}


	public String[] getPerModule() {
		return perModule;
	}


	public void setPerModule(String[] perModule) {
		this.perModule = perModule;
	}
	
	public boolean isCheckflag() {
		return checkflag;
	}


	public void setCheckflag(boolean checkflag) {
		this.checkflag = checkflag;
	}


	public String getUserType() {
		return userType;
	}


	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getUserDescription() {
		return userDescription;
	}


	public void setUserDescription(String userDescription) {
		this.userDescription = userDescription;
	}

	public Integer getUserTypeId() {
		return userTypeId;
	}


	public void setUserTypeId(Integer userTypeId) {
		this.userTypeId = userTypeId;
	}
}
