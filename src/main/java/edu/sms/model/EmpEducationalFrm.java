package edu.sms.model;

import java.util.ArrayList;
import java.util.List;


/**
 * The persistent class for the empeducationaldtl database table.
 * 
 */

public class EmpEducationalFrm  {
	private Integer emp_edu_id;
	private String qualificationName;
	private String institCollSchool;
	private String boardcollUniver;
	private String yearofpassing;
	private String per_cgpa_grade_flag;
	private String per_cgpa_grade;
	private String division;
	private String medium;
	private String electives;
	private String cgpaPercentage;
	private String criteriaUniversity;
	private String remark;
	//two new field added
	private List<FileUploadForm> fileUploadLst = new ArrayList<FileUploadForm>();
	
	public EmpEducationalFrm() {
    }

	public EmpEducationalFrm(List<FileUploadForm> fileUploadLst) {
        this.fileUploadLst = fileUploadLst;
    }

	public Integer getEmp_edu_id() {
		return emp_edu_id;
	}


	public void setEmp_edu_id(Integer emp_edu_id) {
		this.emp_edu_id = emp_edu_id;
	}


	public String getQualificationName() {
		return qualificationName;
	}


	public void setQualificationName(String qualificationName) {
		this.qualificationName = qualificationName;
	}


	public String getInstitCollSchool() {
		return institCollSchool;
	}


	public void setInstitCollSchool(String institCollSchool) {
		this.institCollSchool = institCollSchool;
	}


	public String getBoardcollUniver() {
		return boardcollUniver;
	}


	public void setBoardcollUniver(String boardcollUniver) {
		this.boardcollUniver = boardcollUniver;
	}


	public String getYearofpassing() {
		return yearofpassing;
	}


	public void setYearofpassing(String yearofpassing) {
		this.yearofpassing = yearofpassing;
	}


	public String getPer_cgpa_grade_flag() {
		return per_cgpa_grade_flag;
	}


	public void setPer_cgpa_grade_flag(String per_cgpa_grade_flag) {
		this.per_cgpa_grade_flag = per_cgpa_grade_flag;
	}


	public String getPer_cgpa_grade() {
		return per_cgpa_grade;
	}


	public void setPer_cgpa_grade(String per_cgpa_grade) {
		this.per_cgpa_grade = per_cgpa_grade;
	}


	public String getDivision() {
		return division;
	}


	public void setDivision(String division) {
		this.division = division;
	}


	public String getMedium() {
		return medium;
	}


	public void setMedium(String medium) {
		this.medium = medium;
	}


	public String getElectives() {
		return electives;
	}


	public void setElectives(String electives) {
		this.electives = electives;
	}


	public String getCgpaPercentage() {
		return cgpaPercentage;
	}


	public void setCgpaPercentage(String cgpaPercentage) {
		this.cgpaPercentage = cgpaPercentage;
	}


	public String getCriteriaUniversity() {
		return criteriaUniversity;
	}


	public void setCriteriaUniversity(String criteriaUniversity) {
		this.criteriaUniversity = criteriaUniversity;
	}


	public String getRemark() {
		return remark;
	}


	public void setRemark(String remark) {
		this.remark = remark;
	}


	public List<FileUploadForm> getFileUploadLst() {
		return fileUploadLst;
	}


	public void setFileUploadLst(List<FileUploadForm> fileUploadLst) {
		this.fileUploadLst = fileUploadLst;
	}

		
	
	}