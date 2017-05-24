package edu.sms.model;

import java.util.ArrayList;
import java.util.List;


/**
 * The persistent class for the emppastproject database table.
 * 
 */

public class EmpPastProjectFrm   {
	private Integer emp_pastProj_id;
	private String projectDescription;
	private String projectName;
	private List<FileUploadForm> fileUploadLst = new ArrayList<FileUploadForm>();

	
	
	public List<FileUploadForm> getFileUploadLst() {
		return fileUploadLst;
	}
	public void setFileUploadLst(List<FileUploadForm> fileUploadLst) {
		this.fileUploadLst = fileUploadLst;
	}
	public EmpPastProjectFrm() {
    }
	public Integer getEmp_pastProj_id() {
		return emp_pastProj_id;
	}
	public void setEmp_pastProj_id(Integer emp_pastProj_id) {
		this.emp_pastProj_id = emp_pastProj_id;
	}
	public String getProjectDescription() {
		return projectDescription;
	}
	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
}