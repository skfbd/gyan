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
@Table(name = "Student_Parental_Common_Info")
public class StudentParentalCommonInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private long id;
	private long studentId;
	private Date anniversaryDate;
	private String smsToSend;
	private boolean emailToBeSentFather;
	private boolean emailToBeSentMother;
	private boolean emailToBeSentGuardian;
	private int isDivorced;
	private boolean parentEmpOfSchool;
	private long schoolId;
	private String employees;
	
	
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
	
	@Column(name="anniversary_date")
	public Date getAnniversaryDate() {
		return anniversaryDate;
	}
	public void setAnniversaryDate(Date anniversaryDate) {
		this.anniversaryDate = anniversaryDate;
	}
	
	@Column(name="sms_to_send")
	public String getSmsToSend() {
		return smsToSend;
	}
	public void setSmsToSend(String smsToSend) {
		this.smsToSend = smsToSend;
	}
	
	@Column(name="is_divorced")
	public int getIsDivorced() {
		return isDivorced;
	}
	public void setIsDivorced(int isDivorced) {
		this.isDivorced = isDivorced;
	}
	
	@Column(name="is_parent_emp_of_school")
	public boolean isParentEmpOfSchool() {
		return parentEmpOfSchool;
	}
	public void setParentEmpOfSchool(boolean isParentEmpOfSchool) {
		this.parentEmpOfSchool = isParentEmpOfSchool;
	}
	
	@Column(name="school")
	public long getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(long schoolId) {
		this.schoolId = schoolId;
	}
	
	@Column(name="employees")
	public String getEmployees() {
		return employees;
	}
	public void setEmployees(String employees) {
		this.employees = employees;
	}
	
	@Column(name="email_to_be_sent_father")
	public boolean isEmailToBeSentFather() {
		return emailToBeSentFather;
	}
	public void setEmailToBeSentFather(boolean emailToBeSentFather) {
		this.emailToBeSentFather = emailToBeSentFather;
	}
	
	@Column(name="email_to_be_sent_mother")
	public boolean isEmailToBeSentMother() {
		return emailToBeSentMother;
	}
	public void setEmailToBeSentMother(boolean emailToBeSentMother) {
		this.emailToBeSentMother = emailToBeSentMother;
	}
	
	@Column(name="email_to_be_sent_guardian")
	public boolean isEmailToBeSentGuardian() {
		return emailToBeSentGuardian;
	}
	public void setEmailToBeSentGuardian(boolean emailToBeSentGuardian) {
		this.emailToBeSentGuardian = emailToBeSentGuardian;
	}
}