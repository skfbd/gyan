package edu.sms.model;

import java.util.Date;

public class ProspectusConfigurationForm {

	String academicSession;
	Integer prospectCount;
	Date dateOfPurchase;
	Double pricePerUnit;
	Integer schoolId;

	public String getAcademicSession() {
		return academicSession;
	}

	public void setAcademicSession(String academicSession) {
		this.academicSession = academicSession;
	}

	public Integer getProspectCount() {
		return prospectCount;
	}

	public void setProspectCount(Integer prospectCount) {
		this.prospectCount = prospectCount;
	}

	public Date getDateOfPurchase() {
		return dateOfPurchase;
	}

	public void setDateOfPurchase(Date dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}

	public Double getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(Double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

	public Integer getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(Integer schoolId) {
		this.schoolId = schoolId;
	}

}
