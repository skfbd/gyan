package edu.sms.model;

import javax.servlet.http.HttpServletRequest;

public class StudentFeeCategoryForm {
	Long id;
	String name;
	Long schoolId;
	String feeCategoryType;
	
	public StudentFeeCategoryForm(HttpServletRequest request){
		id = request.getParameter("id")!=null? Long.valueOf(request.getParameter("id")): null;
		name=request.getParameter("name");
		schoolId=Long.valueOf(request.getParameter("schoolId"));
		feeCategoryType=request.getParameter("feeCategoryType");
	}
	
	public StudentFeeCategoryForm(){}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(Long schoolId) {
		this.schoolId = schoolId;
	}
	public String getFeeCategoryType() {
		return feeCategoryType;
	}
	public void setFeeCategoryType(String feeCategoryType) {
		this.feeCategoryType = feeCategoryType;
	}
	
}
