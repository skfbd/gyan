/**
 * 
 */
package edu.sms.entity.StudentManager;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Kundan Suthar
 *
 */

@Entity
@Table(name = "Student_Other_Information")
public class StudentOtherInfoEntity implements Serializable{
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
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name="student_id" , nullable = false)
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	
	@Column(name="student_height")
	public String getStudentHeight() {
		return studentHeight;
	}
	public void setStudentHeight(String studentHeight) {
		this.studentHeight = studentHeight;
	}
	
	@Column(name="student_weight")
	public String getStudentWeight() {
		return studentWeight;
	}
	public void setStudentWeight(String studentWeight) {
		this.studentWeight = studentWeight;
	}
	
	@Column(name="student_right_eye_vision")
	public String getStudentRightEyeVision() {
		return studentRightEyeVision;
	}
	public void setStudentRightEyeVision(String studentRightEyeVision) {
		this.studentRightEyeVision = studentRightEyeVision;
	}
	
	@Column(name="student_left_eye_vision")
	public String getStudentLeftEyeVision() {
		return studentLeftEyeVision;
	}
	public void setStudentLeftEyeVision(String studentLeftEyeVision) {
		this.studentLeftEyeVision = studentLeftEyeVision;
	}
	
	@Column(name="student_medical_illness")
	public String getStudentMedicalIllness() {
		return studentMedicalIllness;
	}
	public void setStudentMedicalIllness(String studentMedicalIllness) {
		this.studentMedicalIllness = studentMedicalIllness;
	}
	
	@Column(name="student_allergic_to")
	public String getStudentAllergicTo() {
		return studentAllergicTo;
	}
	public void setStudentAllergicTo(String studentAllergicTo) {
		this.studentAllergicTo = studentAllergicTo;
	}
	
	@Column(name="student_identity_document_type")
	public String getStudentIdentityDocumentType() {
		return studentIdentityDocumentType;
	}
	public void setStudentIdentityDocumentType(String studentIdentityDocumentType) {
		this.studentIdentityDocumentType = studentIdentityDocumentType;
	}
	
	@Column(name="student_document_identity_no")
	public String getStudentDocumentIdentityNo() {
		return studentDocumentIdentityNo;
	}
	public void setStudentDocumentIdentityNo(String studentDocumentIdentityNo) {
		this.studentDocumentIdentityNo = studentDocumentIdentityNo;
	}
	
	@Column(name="student_document_scan_path")
	public String getStudentDocumentScanPath() {
		return studentDocumentScanPath;
	}
	public void setStudentDocumentScanPath(String studentDocumentScanPath) {
		this.studentDocumentScanPath = studentDocumentScanPath;
	}
	
	@Column(name="student_other_language")
	public String getStudentOtherLanguage() {
		return studentOtherLanguage;
	}
	public void setStudentOtherLanguage(String studentOtherLanguage) {
		this.studentOtherLanguage = studentOtherLanguage;
	}
	
	@Column(name="student_hobbies")
	public String getStudentHobbies() {
		return studentHobbies;
	}
	public void setStudentHobbies(String studentHobbies) {
		this.studentHobbies = studentHobbies;
	}
	
	@Column(name="creation_date")
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
	
}
