package edu.sms.model;

import java.util.List;

public class AdmissionStagesConfigurationForm {
	Integer admissionStageId;
	Integer schoolId;
	String stageName;
	Integer priority;
	Double prospectFee;
	Double testFeeForAdmission;
	Boolean prospectusRequired;
	Boolean smsRequired;
	String smsFormat;
	Boolean emailRequired;
	String emailFormat;
	List<String> formNames;
	Boolean examApplicable;
	Boolean confirmStudent;
	Boolean activateFee;
	Boolean admissionCriteriaApplicable;

	public Integer getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(Integer schoolId) {
		this.schoolId = schoolId;
	}

	public String getStageName() {
		return stageName;
	}

	public void setStageName(String stageName) {
		this.stageName = stageName;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Double getProspectFee() {
		return prospectFee;
	}

	public void setProspectFee(Double prospectFee) {
		this.prospectFee = prospectFee;
	}

	public Double getTestFeeForAdmission() {
		return testFeeForAdmission;
	}

	public void setTestFeeForAdmission(Double testFeeForAdmission) {
		this.testFeeForAdmission = testFeeForAdmission;
	}

	public Boolean getProspectusRequired() {
		return prospectusRequired;
	}

	public void setProspectusRequired(Boolean prospectusRequired) {
		this.prospectusRequired = prospectusRequired;
	}

	public Boolean getSmsRequired() {
		return smsRequired;
	}

	public void setSmsRequired(Boolean smsRequired) {
		this.smsRequired = smsRequired;
	}

	public String getSmsFormat() {
		return smsFormat;
	}

	public void setSmsFormat(String smsFormat) {
		this.smsFormat = smsFormat;
	}

	public Boolean getEmailRequired() {
		return emailRequired;
	}

	public void setEmailRequired(Boolean emailRequired) {
		this.emailRequired = emailRequired;
	}

	public String getEmailFormat() {
		return emailFormat;
	}

	public void setEmailFormat(String emailFormat) {
		this.emailFormat = emailFormat;
	}

	public List<String> getFormNames() {
		return formNames;
	}

	public void setFormNames(List<String> formNames) {
		this.formNames = formNames;
	}

	public Boolean getExamApplicable() {
		return examApplicable;
	}

	public void setExamApplicable(Boolean examApplicable) {
		this.examApplicable = examApplicable;
	}

	public Boolean getConfirmStudent() {
		return confirmStudent;
	}

	public void setConfirmStudent(Boolean confirmStudent) {
		this.confirmStudent = confirmStudent;
	}

	public Boolean getActivateFee() {
		return activateFee;
	}

	public void setActivateFee(Boolean activateFee) {
		this.activateFee = activateFee;
	}

	public Boolean getAdmissionCriteriaApplicable() {
		return admissionCriteriaApplicable;
	}

	public void setAdmissionCriteriaApplicable(Boolean admissionCriteriaApplicable) {
		this.admissionCriteriaApplicable = admissionCriteriaApplicable;
	}

}
