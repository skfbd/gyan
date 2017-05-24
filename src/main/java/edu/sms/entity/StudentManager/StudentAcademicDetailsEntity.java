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
 * @author Remedies
 *
 */

@Entity
@Table(name = "Student_Academic_Details")
public class StudentAcademicDetailsEntity implements Serializable{
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
	
	@Column(name="student_admission_date")
	public Date getStudentAdmissionDate() {
		return studentAdmissionDate;
	}
	public void setStudentAdmissionDate(Date studentAdmissionDate) {
		this.studentAdmissionDate = studentAdmissionDate;
	}
	
	@Column(name="student_school")
	public long getStudentSchool() {
		return studentSchool;
	}
	public void setStudentSchool(long studentSchool) {
		this.studentSchool = studentSchool;
	}
	
	@Column(name="student_admission_session")
	public String getStudentAdmissionSession() {
		return studentAdmissionSession;
	}
	public void setStudentAdmissionSession(String studentAdmissionSession) {
		this.studentAdmissionSession = studentAdmissionSession;
	}
	
	@Column(name="student_fist_day_session")
	public String getStudentFistDaySession() {
		return studentFistDaySession;
	}
	public void setStudentFistDaySession(String studentFistDaySession) {
		this.studentFistDaySession = studentFistDaySession;
	}
	
	@Column(name="student_currently_in_session")
	public String getStudentCurrentlyInSession() {
		return studentCurrentlyInSession;
	}
	public void setStudentCurrentlyInSession(String studentCurrentlyInSession) {
		this.studentCurrentlyInSession = studentCurrentlyInSession;
	}
	
	@Column(name="student_class")
	public String getStudentClass() {
		return studentClass;
	}
	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}
	
	@Column(name="student_section")
	public String getStudentSection() {
		return studentSection;
	}
	public void setStudentSection(String studentSection) {
		this.studentSection = studentSection;
	}
	
	@Column(name="class_student_got_admitted")
	public String getClassStudentGotAdmitted() {
		return classStudentGotAdmitted;
	}
	public void setClassStudentGotAdmitted(String classStudentGotAdmitted) {
		this.classStudentGotAdmitted = classStudentGotAdmitted;
	}
	
	@Column(name="student_second_language")
	public String getStudentSecondLanguage() {
		return studentSecondLanguage;
	}
	public void setStudentSecondLanguage(String studentSecondLanguage) {
		this.studentSecondLanguage = studentSecondLanguage;
	}
	
	@Column(name="student_third_language")
	public String getStudentThirdLanguage() {
		return studentThirdLanguage;
	}
	public void setStudentThirdLanguage(String studentThirdLanguage) {
		this.studentThirdLanguage = studentThirdLanguage;
	}
	
	@Column(name="student_house")
	public String getStudentHouse() {
		return studentHouse;
	}
	public void setStudentHouse(String studentHouse) {
		this.studentHouse = studentHouse;
	}
	
	@Column(name="student_scholar_number")
	public String getStudentScholarNumber() {
		return studentScholarNumber;
	}
	public void setStudentScholarNumber(String studentScholarNumber) {
		this.studentScholarNumber = studentScholarNumber;
	}
	
	@Column(name="student_registration_number")
	public String getStudentRegistrationNumber() {
		return studentRegistrationNumber;
	}
	public void setStudentRegistrationNumber(String studentRegistrationNumber) {
		this.studentRegistrationNumber = studentRegistrationNumber;
	}
	
	@Column(name="student_admission_number")
	public String getStudentAdmissionNumber() {
		return studentAdmissionNumber;
	}
	public void setStudentAdmissionNumber(String studentAdmissionNumber) {
		this.studentAdmissionNumber = studentAdmissionNumber;
	}
	
	@Column(name="student_device_id")
	public String getStudentDeviceId() {
		return studentDeviceId;
	}
	public void setStudentDeviceId(String studentDeviceId) {
		this.studentDeviceId = studentDeviceId;
	}
	
	@Column(name="student_RFID")
	public String getStudentRFID() {
		return studentRFID;
	}
	public void setStudentRFID(String studentRFID) {
		this.studentRFID = studentRFID;
	}
	
	@Column(name="student_image_path")
	public String getStudentImagePath() {
		return studentImagePath;
	}
	public void setStudentImagePath(String studentImagePath) {
		this.studentImagePath = studentImagePath;
	}
	
	@Column(name="student_remark")
	public String getStudentRemark() {
		return studentRemark;
	}
	public void setStudentRemark(String studentRemark) {
		this.studentRemark = studentRemark;
	}
	
	@Column(name="creation_date")
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

}
