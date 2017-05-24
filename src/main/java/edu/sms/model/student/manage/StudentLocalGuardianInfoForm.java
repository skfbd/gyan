/**
 * 
 */
package edu.sms.model.student.manage;

import java.io.Serializable;

public class StudentLocalGuardianInfoForm implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private long id;
	private long studentId;
	private long organizationId;
	private String name;
	private String mobileNumber;
	private String officeAddress;
	private String address;
	private String emailId;
	private String country;
	private int idDocumentType;
	private String idDocumentNumber;
	private String idDocumentPath;
	private long annualIncome;
	private String occupation;
	private String studentRelation;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	public long getOrganizationId() {
		return organizationId;
	}
	public void setOrganizationId(long organizationId) {
		this.organizationId = organizationId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getOfficeAddress() {
		return officeAddress;
	}
	public void setOfficeAddress(String officeAddress) {
		this.officeAddress = officeAddress;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getIdDocumentType() {
		return idDocumentType;
	}
	public void setIdDocumentType(int idDocumentType) {
		this.idDocumentType = idDocumentType;
	}
	public String getIdDocumentNumber() {
		return idDocumentNumber;
	}
	public void setIdDocumentNumber(String idDocumentNumber) {
		this.idDocumentNumber = idDocumentNumber;
	}
	public String getIdDocumentPath() {
		return idDocumentPath;
	}
	public void setIdDocumentPath(String idDocumentPath) {
		this.idDocumentPath = idDocumentPath;
	}
	public long getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(long annualIncome) {
		this.annualIncome = annualIncome;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getStudentRelation() {
		return studentRelation;
	}
	public void setStudentRelation(String studentRelation) {
		this.studentRelation = studentRelation;
	}
	
}