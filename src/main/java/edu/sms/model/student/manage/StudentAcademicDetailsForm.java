/**
 * 
 */
package edu.sms.model.student.manage;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Remedies
 *
 */
public class StudentAcademicDetailsForm implements Serializable{
	private static final long serialVersionUID = 1L;

	private long id;
	private long studentId;
	private Date studentAdmissionDate;
	private long studentSchool;
	private String studentAdmissionSession;
	private String studentFistDaySession;
	private String studentCurrentlyInSession;
	private String studentClass;
	private String studentSection;
	private String classStudentGotAdmitted;
	private String studentSecondLanguage;
	private String studentThirdLanguage;
	private String studentHouse;
	private String studentScholarNumber;
	private String studentRegistrationNumber;
	private String studentAdmissionNumber;
	private String studentDeviceId;
	private String studentRFID;
	private String studentImagePath;
	private String studentRemark;
	private Date creationDate;
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
	public Date getStudentAdmissionDate() {
		return studentAdmissionDate;
	}
	public void setStudentAdmissionDate(Date studentAdmissionDate) {
		this.studentAdmissionDate = studentAdmissionDate;
	}
	public long getStudentSchool() {
		return studentSchool;
	}
	public void setStudentSchool(long studentSchool) {
		this.studentSchool = studentSchool;
	}
	public String getStudentAdmissionSession() {
		return studentAdmissionSession;
	}
	public void setStudentAdmissionSession(String studentAdmissionSession) {
		this.studentAdmissionSession = studentAdmissionSession;
	}
	public String getStudentFistDaySession() {
		return studentFistDaySession;
	}
	public void setStudentFistDaySession(String studentFistDaySession) {
		this.studentFistDaySession = studentFistDaySession;
	}
	public String getStudentCurrentlyInSession() {
		return studentCurrentlyInSession;
	}
	public void setStudentCurrentlyInSession(String studentCurrentlyInSession) {
		this.studentCurrentlyInSession = studentCurrentlyInSession;
	}
	public String getStudentClass() {
		return studentClass;
	}
	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}
	public String getStudentSection() {
		return studentSection;
	}
	public void setStudentSection(String studentSection) {
		this.studentSection = studentSection;
	}
	public String getClassStudentGotAdmitted() {
		return classStudentGotAdmitted;
	}
	public void setClassStudentGotAdmitted(String classStudentGotAdmitted) {
		this.classStudentGotAdmitted = classStudentGotAdmitted;
	}
	public String getStudentSecondLanguage() {
		return studentSecondLanguage;
	}
	public void setStudentSecondLanguage(String studentSecondLanguage) {
		this.studentSecondLanguage = studentSecondLanguage;
	}
	public String getStudentThirdLanguage() {
		return studentThirdLanguage;
	}
	public void setStudentThirdLanguage(String studentThirdLanguage) {
		this.studentThirdLanguage = studentThirdLanguage;
	}
	public String getStudentHouse() {
		return studentHouse;
	}
	public void setStudentHouse(String studentHouse) {
		this.studentHouse = studentHouse;
	}
	public String getStudentScholarNumber() {
		return studentScholarNumber;
	}
	public void setStudentScholarNumber(String studentScholarNumber) {
		this.studentScholarNumber = studentScholarNumber;
	}
	public String getStudentRegistrationNumber() {
		return studentRegistrationNumber;
	}
	public void setStudentRegistrationNumber(String studentRegistrationNumber) {
		this.studentRegistrationNumber = studentRegistrationNumber;
	}
	public String getStudentAdmissionNumber() {
		return studentAdmissionNumber;
	}
	public void setStudentAdmissionNumber(String studentAdmissionNumber) {
		this.studentAdmissionNumber = studentAdmissionNumber;
	}
	public String getStudentDeviceId() {
		return studentDeviceId;
	}
	public void setStudentDeviceId(String studentDeviceId) {
		this.studentDeviceId = studentDeviceId;
	}
	public String getStudentRFID() {
		return studentRFID;
	}
	public void setStudentRFID(String studentRFID) {
		this.studentRFID = studentRFID;
	}
	public String getStudentImagePath() {
		return studentImagePath;
	}
	public void setStudentImagePath(String studentImagePath) {
		this.studentImagePath = studentImagePath;
	}
	public String getStudentRemark() {
		return studentRemark;
	}
	public void setStudentRemark(String studentRemark) {
		this.studentRemark = studentRemark;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

}
