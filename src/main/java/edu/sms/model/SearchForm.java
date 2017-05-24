package edu.sms.model;

import java.io.Serializable;

public class SearchForm implements Serializable {

	private static final long serialVersionUID = 1L;

	Integer schoolId;
	Integer orgId;
	String searchForm;
	ClassForm classForm = new ClassForm();

	public Integer getOrgId() {
		return orgId;
	}

	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
	}

	public Integer getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(Integer schoolId) {
		this.schoolId = schoolId;
	}

	

	public ClassForm getClassForm() {
		return classForm;
	}

	public void setClassForm(ClassForm classForm) {
		this.classForm = classForm;
	}
	
	
}
