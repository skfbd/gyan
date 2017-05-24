/**
 * 
 */
package edu.sms.model.student.manage;

import java.io.Serializable;

public class StudentAddressForm implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private long id;
	private long studentId;
	private String studentCommAddress;
	private String studentPermanentAdd;
	private String studentCountry;
	private String studentState;
	private String studentCity;
	private String studentPinCode;
	private String studentResidencePhNumber;
	private String studentEmergencyContact;
	private String studentResidenceFaxNumber;
	
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
	public String getStudentCommAddress() {
		return studentCommAddress;
	}
	public void setStudentCommAddress(String studentCommAddress) {
		this.studentCommAddress = studentCommAddress;
	}
	public String getStudentPermanentAdd() {
		return studentPermanentAdd;
	}
	public void setStudentPermanentAdd(String studentPermanentAdd) {
		this.studentPermanentAdd = studentPermanentAdd;
	}
	public String getStudentCountry() {
		return studentCountry;
	}
	public void setStudentCountry(String studentCountry) {
		this.studentCountry = studentCountry;
	}
	public String getStudentState() {
		return studentState;
	}
	public void setStudentState(String studentState) {
		this.studentState = studentState;
	}
	public String getStudentCity() {
		return studentCity;
	}
	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}
	public String getStudentPinCode() {
		return studentPinCode;
	}
	public void setStudentPinCode(String studentPinCode) {
		this.studentPinCode = studentPinCode;
	}
	public String getStudentResidencePhNumber() {
		return studentResidencePhNumber;
	}
	public void setStudentResidencePhNumber(String studentResidencePhNumber) {
		this.studentResidencePhNumber = studentResidencePhNumber;
	}
	public String getStudentEmergencyContact() {
		return studentEmergencyContact;
	}
	public void setStudentEmergencyContact(String studentEmergencyContact) {
		this.studentEmergencyContact = studentEmergencyContact;
	}
	public String getStudentResidenceFaxNumber() {
		return studentResidenceFaxNumber;
	}
	public void setStudentResidenceFaxNumber(String studentResidenceFaxNumber) {
		this.studentResidenceFaxNumber = studentResidenceFaxNumber;
	}
	
}
