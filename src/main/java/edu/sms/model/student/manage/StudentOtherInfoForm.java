/**
 * 
 */
package edu.sms.model.student.manage;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Kundan Suthar
 *
 */
public class StudentOtherInfoForm implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private long id;
	private long studentId;
	private String studentHeight;
	private String studentWeight;
	private String studentRightEyeVision;
	private String studentLeftEyeVision;
	private String studentMedicalIllness;
	private String studentAllergicTo;
	private String studentIdentityDocumentType;
	private String studentDocumentIdentityNo;
	private String studentDocumentScanPath;
	private String studentOtherLanguage;
	private String studentHobbies;
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
	public String getStudentHeight() {
		return studentHeight;
	}
	public void setStudentHeight(String studentHeight) {
		this.studentHeight = studentHeight;
	}
	public String getStudentWeight() {
		return studentWeight;
	}
	public void setStudentWeight(String studentWeight) {
		this.studentWeight = studentWeight;
	}
	public String getStudentRightEyeVision() {
		return studentRightEyeVision;
	}
	public void setStudentRightEyeVision(String studentRightEyeVision) {
		this.studentRightEyeVision = studentRightEyeVision;
	}
	public String getStudentLeftEyeVision() {
		return studentLeftEyeVision;
	}
	public void setStudentLeftEyeVision(String studentLeftEyeVision) {
		this.studentLeftEyeVision = studentLeftEyeVision;
	}
	public String getStudentMedicalIllness() {
		return studentMedicalIllness;
	}
	public void setStudentMedicalIllness(String studentMedicalIllness) {
		this.studentMedicalIllness = studentMedicalIllness;
	}
	public String getStudentAllergicTo() {
		return studentAllergicTo;
	}
	public void setStudentAllergicTo(String studentAllergicTo) {
		this.studentAllergicTo = studentAllergicTo;
	}
	public String getStudentIdentityDocumentType() {
		return studentIdentityDocumentType;
	}
	public void setStudentIdentityDocumentType(String studentIdentityDocumentType) {
		this.studentIdentityDocumentType = studentIdentityDocumentType;
	}
	public String getStudentDocumentIdentityNo() {
		return studentDocumentIdentityNo;
	}
	public void setStudentDocumentIdentityNo(String studentDocumentIdentityNo) {
		this.studentDocumentIdentityNo = studentDocumentIdentityNo;
	}
	public String getStudentDocumentScanPath() {
		return studentDocumentScanPath;
	}
	public void setStudentDocumentScanPath(String studentDocumentScanPath) {
		this.studentDocumentScanPath = studentDocumentScanPath;
	}
	public String getStudentOtherLanguage() {
		return studentOtherLanguage;
	}
	public void setStudentOtherLanguage(String studentOtherLanguage) {
		this.studentOtherLanguage = studentOtherLanguage;
	}
	public String getStudentHobbies() {
		return studentHobbies;
	}
	public void setStudentHobbies(String studentHobbies) {
		this.studentHobbies = studentHobbies;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
	
}
